package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCyclurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer dorsalfin2;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer dorsalfin3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer dorsalfin4;
    private final AdvancedModelRenderer dorsalfin5;
    private final AdvancedModelRenderer dorsalfin6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer dorsalfin7;
    private final AdvancedModelRenderer dorsalfin8;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelCyclurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 21, -2.5F, -8.05F, -6.0F, 5, 5, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 38, -2.0F, -7.425F, -8.0F, 4, 4, 2, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 19, -2.075F, -6.6F, -9.4F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 19, 1.075F, -6.6F, -9.4F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.425F, -4.2F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0785F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -2.0F, -1.0F, -4.0F, 4, 2, 6, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.775F, -1.925F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0742F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 30, -2.0F, -1.0F, -4.0F, 4, 1, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -7.5F, -5.7F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3011F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 13, -2.0F, -1.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.275F, -7.075F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4014F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 42, -1.5F, -1.0F, -4.0F, 3, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.3F, -5.175F, -8.775F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1047F, -0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 26, 19, 0.5F, -1.0F, -4.0F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.3F, -5.175F, -8.775F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1047F, 0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 19, -1.5F, -1.0F, -4.0F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.125F, -7.975F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4538F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 39, -1.5F, -1.0F, -4.0F, 3, 1, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.725F, -8.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 24, -2.0F, -2.0F, -2.0F, 4, 2, 2, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -5.7F, -2.0F);
        this.body.addChild(body2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.5F, 0.275F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0131F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -2.0F, -1.0F, -1.0F, 4, 1, 7, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.0F, 0.25F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0262F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.0F, -6.0F, -1.0F, 4, 6, 7, 0.0F, false));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -2.9F, 2.25F);
        this.body2.addChild(dorsalfin);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 10, 45, 0.0F, -1.4F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin2 = new AdvancedModelRenderer(this);
        this.dorsalfin2.setRotationPoint(0.0F, -2.9F, 3.75F);
        this.body2.addChild(dorsalfin2);
        this.dorsalfin2.cubeList.add(new ModelBox(dorsalfin2, 14, 45, 0.01F, -1.4F, -1.0F, 0, 2, 2, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 3.1F, 3.5F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.5236F, 0.0F, 0.3927F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 36, 42, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 3.1F, 3.5F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.5236F, 0.0F, -0.3927F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 36, 42, 0.0F, 0.0F, -1.0F, 0, 3, 3, 0.0F, true));

        this.dorsalfin3 = new AdvancedModelRenderer(this);
        this.dorsalfin3.setRotationPoint(0.0F, -2.8F, 5.25F);
        this.body2.addChild(dorsalfin3);
        this.dorsalfin3.cubeList.add(new ModelBox(dorsalfin3, 18, 45, 0.0F, -1.5F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 6.275F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.15F, 2.1F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 16, 0.0F, -2.0F, -1.0F, 0, 3, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 2.2F, -1.1F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2094F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 30, -1.5F, -3.0F, 0.0F, 3, 4, 5, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 29, -1.5F, -3.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.dorsalfin4 = new AdvancedModelRenderer(this);
        this.dorsalfin4.setRotationPoint(0.0F, -2.85F, 0.475F);
        this.body3.addChild(dorsalfin4);
        this.dorsalfin4.cubeList.add(new ModelBox(dorsalfin4, 22, 45, 0.01F, -1.7F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin5 = new AdvancedModelRenderer(this);
        this.dorsalfin5.setRotationPoint(0.0F, -2.85F, 1.975F);
        this.body3.addChild(dorsalfin5);
        this.dorsalfin5.cubeList.add(new ModelBox(dorsalfin5, 26, 45, 0.0F, -1.7F, -1.0F, 0, 2, 2, 0.0F, false));

        this.dorsalfin6 = new AdvancedModelRenderer(this);
        this.dorsalfin6.setRotationPoint(0.0F, -2.75F, 3.475F);
        this.body3.addChild(dorsalfin6);
        this.dorsalfin6.cubeList.add(new ModelBox(dorsalfin6, 0, 47, 0.01F, -1.8F, -1.0F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 4.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0436F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.225F, -0.2F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4276F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 10, -1.0F, -1.0F, -1.0F, 2, 2, 4, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 35, -1.0F, -2.0F, -1.0F, 2, 3, 4, 0.0F, false));

        this.dorsalfin7 = new AdvancedModelRenderer(this);
        this.dorsalfin7.setRotationPoint(0.0F, -2.3F, 0.975F);
        this.body4.addChild(dorsalfin7);
        this.dorsalfin7.cubeList.add(new ModelBox(dorsalfin7, 6, 44, 0.0F, -2.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.dorsalfin8 = new AdvancedModelRenderer(this);
        this.dorsalfin8.setRotationPoint(0.0F, -2.1F, 2.475F);
        this.body4.addChild(dorsalfin8);
        this.dorsalfin8.cubeList.add(new ModelBox(dorsalfin8, 42, 42, 0.01F, -2.2F, -1.0F, 0, 3, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.925F, 2.95F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0873F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 22, 0, 0.0F, -3.0F, 1.1F, 0, 6, 7, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.85F, -0.95F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0087F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 39, -0.5F, -2.0F, 0.0F, 1, 3, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.25F, -8.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 0, -1.5F, -0.5F, -3.75F, 3, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 38, -1.45F, -2.4F, -1.75F, 0, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 38, 1.45F, -2.4F, -1.75F, 0, 2, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.5F, -3.75F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2225F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 5, -1.5F, -1.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.5F, -4.0F, -2.75F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3054F, 0.0F, 0.3491F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 30, 42, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.5F, -4.0F, -2.75F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3054F, 0.0F, -0.3491F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 30, 42, 0.0F, 0.0F, -1.0F, 0, 4, 3, 0.0F, true));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.5F, -5.875F, -11.475F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.5672F, -0.3578F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 0, 44, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.875F, 0.1F, 1.775F);
        this.lipright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4189F, 0.3229F, 0.1745F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 35, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(1.5F, -5.875F, -11.475F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.5672F, 0.3578F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 0, 44, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.875F, 0.1F, 1.775F);
        this.lipleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.4189F, -0.3229F, -0.1745F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 35, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.01F, true));

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
        this.body.offsetY = -0.6F;
        this.body.offsetX = 0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.18F;
        this.body.render(0.01F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] dorsal = {this.dorsalfin, this.dorsalfin2, this.dorsalfin3, this.dorsalfin4, this.dorsalfin5, this.dorsalfin6, this.dorsalfin7, this.dorsalfin8};
        ((EntityPrehistoricFloraCyclurus)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.223F;
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
            this.chainFlap(dorsal, speed * still, 0.3F * still, -3.5, f2, 1F);
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.05F, true, 0, 0, f2, 0.5F);
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
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = -0.1F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
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
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

