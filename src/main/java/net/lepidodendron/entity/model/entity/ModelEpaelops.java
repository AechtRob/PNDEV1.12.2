package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEpaelops extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelEpaelops() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -4.325F);
        this.body.cubeList.add(new ModelBox(body, 32, 32, -1.5F, -8.0F, -5.0F, 3, 4, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -9.5F, -1.0F, 3, 6, 6, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 31, -1.1F, -7.575F, -8.2F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 31, 0.1F, -7.575F, -8.2F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.325F, -10.55F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 48, 25, -1.0F, -3.0F, 2.0F, 2, 2, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.05F, -9.875F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 48, -1.0F, -3.0F, 2.0F, 2, 2, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.85F, -0.075F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 14, -1.5F, -2.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.3F, -6.075F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 25, -1.5F, -3.0F, 1.0F, 3, 2, 5, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.425F, -6.075F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 14, -1.0F, -3.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -7.025F, -0.775F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 0, -1.5F, -3.0F, 0.0F, 3, 1, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -5.625F, -7.075F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2138F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 40, -1.5F, -3.0F, 2.975F, 3, 2, 4, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 20, -1.0F, -3.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.625F, -5.225F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 0, -1.0F, -2.0F, -6.0F, 2, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.25F, -5.25F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 7, -1.0F, -4.0F, -4.0F, 2, 3, 4, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.5F, -4.0F, -2.25F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.6981F, -0.2182F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 46, 32, 0.0F, -2.5F, 0.0F, 0, 3, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.5F, -4.0F, -2.25F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.6981F, 0.2182F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 46, 32, 0.0F, -2.5F, 0.0F, 0, 3, 5, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -6.75F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -1.5F, -2.1F, -0.5F, 3, 5, 6, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 4.0F, -0.475F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 23, -1.5F, -2.0F, 0.0F, 3, 2, 6, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.525F, -0.5F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0829F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 17, -1.5F, -2.0F, 0.0F, 3, 2, 6, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.7F, 1.15F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 25, 0.0F, -5.0F, -1.0F, 0, 5, 7, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 3.4F, 1.85F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.7418F, -0.1047F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 50, 46, 0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 3.4F, 1.85F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.7418F, 0.1047F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 50, 46, 0.0F, -1.5F, 0.0F, 0, 2, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.4F, 5.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 31, -1.0F, -2.0F, -1.0F, 2, 4, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.05F, 0.1F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1702F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 40, -1.0F, -2.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.3F, -0.2F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2356F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 37, -1.0F, -2.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 7.7F, 1.9F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 46, 0.0F, -5.5F, -1.0F, 0, 4, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 40, -0.5F, -1.25F, -1.0F, 1, 3, 5, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 0, 0.0F, -5.25F, 3.25F, 0, 11, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.75F, 3.0F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1789F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 20, -0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.25F, 3.0F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3229F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 47, -0.5F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-1.05F, -7.0F, -10.075F);
        this.body.addChild(lipright);
        this.setRotateAngle(lipright, -0.3316F, -0.096F, 0.0F);
        this.lipright.cubeList.add(new ModelBox(lipright, 10, 50, 0.0F, 0.0F, -0.2F, 1, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.lipright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 50, -1.0F, 0.125F, -0.5F, 1, 1, 3, 0.01F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(1.05F, -7.0F, -10.075F);
        this.body.addChild(lipleft);
        this.setRotateAngle(lipleft, -0.3316F, 0.096F, 0.0F);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 10, 50, -1.0F, 0.0F, -0.2F, 1, 1, 3, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.lipleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 50, 0.0F, 0.125F, -0.5F, 1, 1, 3, 0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.05F, -5.7F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 7, -1.0F, -0.4F, -5.6F, 2, 1, 6, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -0.4F, -5.0F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 44, -1.0F, 0.0F, 0.0F, 2, 1, 5, -0.02F, false));

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
        this.body.offsetY = -0.5F;
        this.body.offsetX = 0.258F;
        this.body.rotateAngleY = (float)Math.toRadians(235);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.95F;
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
        this.body.offsetX = -0.14F;
        this.body.offsetY = -0.19F;
        this.body.offsetZ = 0.06F;
        this.body.render(0.01F);
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

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

        float speed = 0.186F;
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
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
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
            this.body.offsetY = -0.6F;
            this.body.offsetZ = 0.1F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    }
}

