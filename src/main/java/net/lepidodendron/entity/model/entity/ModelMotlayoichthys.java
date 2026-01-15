package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMotlayoichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    private ModelAnimator animator;

    public ModelMotlayoichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.75F, -0.75F);
        this.base.cubeList.add(new ModelBox(base, 18, 26, -2.0F, -6.0F, -2.0F, 4, 6, 4, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 30, 13, -2.0F, -5.825F, 1.275F, 4, 6, 4, -0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 10, 22, -1.55F, -4.8F, -4.8F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 10, 22, 0.55F, -4.8F, -4.8F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.1F, -3.45F, -6.3F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0916F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 24, -0.1F, -0.925F, 0.0F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 24, -0.1F, -0.925F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.375F, -2.85F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 0, 0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.375F, -2.85F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, -0.1309F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 0, -1.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.55F, -3.0F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 33, -1.5F, -1.0F, -4.0F, 3, 1, 1, 0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.825F, -3.725F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 19, -1.5F, -3.0F, -4.0F, 3, 3, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.3F, -3.05F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -1.5F, 1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -8.075F, 1.775F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1571F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 47, -1.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -7.225F, -1.1F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.288F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 13, -1.5F, 0.0F, 0.0F, 3, 3, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.85F, -3.75F);
        this.base.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 43, -1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.1F, -3.45F, -6.3F);
        this.base.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4363F, -0.0916F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 24, 0.1F, -0.925F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.1F, -2.2F);
        this.base.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 32, -1.5F, -3.0F, -4.0F, 3, 3, 5, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.575F, 2.575F);
        this.base.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 26, 0.0F, -6.0F, 0.0F, 0, 5, 2, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, -1.575F, 2.025F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.2182F, -0.2618F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 14, 13, 0.0F, -3.35F, 0.0F, 0, 5, 8, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, -1.575F, 2.025F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.2182F, 0.2618F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 14, 13, 0.0F, -3.35F, 0.0F, 0, 5, 8, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.825F, 4.775F);
        this.base.addChild(body);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.175F, 3.975F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 48, -1.5F, -3.0F, -1.0F, 3, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.625F, 0.675F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 0, -1.5F, -3.0F, -1.0F, 3, 3, 4, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.25F, -1.35F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 36, -0.01F, -5.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.9F, 0.775F);
        this.body.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0611F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 0, -2.5F, -3.0F, -1.0F, 4, 6, 7, 0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 3.6F, 5.25F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.3927F, 0.0F, 0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 50, 48, 0.0F, -0.35F, 0.0F, 0, 3, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 3.6F, 5.25F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.3927F, 0.0F, -0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 50, 48, 0.0F, -0.35F, 0.0F, 0, 3, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.375F, 6.175F);
        this.body.addChild(body2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 3.725F, 0.8F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, -2.0F, -4.0F, -1.2F, 3, 4, 6, 0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.775F, -0.425F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3054F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 34, 23, -2.0F, -4.0F, -0.5F, 3, 4, 5, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.55F, 1.275F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 5, 0.0F, -0.55F, 0.0F, 0, 3, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.45F, -1.825F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.4625F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 42, 40, 0.0F, -5.0F, 0.0F, 0, 2, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.475F, 4.8F);
        this.body2.addChild(body3);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.25F, 0.675F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 40, -1.0F, -2.0F, -2.0F, 2, 2, 5, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 2.15F, 1.575F);
        this.body3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 50, 23, -1.0F, -3.0F, -2.0F, 2, 1, 2, 0.0F, false));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 14, 36, -1.0F, -2.0F, -2.0F, 2, 2, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.9F, 4.325F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -7.85F, 0.0F, 0, 15, 7, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.65F, 0.75F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.4363F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 52, -0.5F, -1.3763F, -1.672F, 1, 1, 2, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.65F, 0.75F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1222F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 50, 35, -0.5F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.15F, -3.05F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.5672F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 7, -1.0F, -0.5F, -4.5F, 2, 1, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.5F, -4.1F);
        this.jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.1047F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 12, 49, -1.0F, -1.0F, 0.1F, 2, 1, 4, -0.01F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 0.15F, -4.5F);
        this.jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0916F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 0, -0.1F, -1.0F, 0.0F, 0, 1, 5, 0.0F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 46, -1.0F, -0.65F, 0.0F, 1, 1, 5, -0.01F, true));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 36, -0.1F, -1.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 0.15F, -4.5F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.0916F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 28, 36, 0.1F, -1.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 46, 0.0F, -0.65F, 0.0F, 1, 1, 5, -0.01F, false));
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
        this.base.offsetY = -0.8F;
        this.base.offsetX = 0.258F;
        this.base.offsetZ = 2.0F;
        this.base.rotateAngleY = (float)Math.toRadians(235);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.4F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

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

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(base, speed, 0.2F, true, 0, 0, f2, 0.8F);
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
            this.base.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(base, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

