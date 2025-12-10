package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChanopsis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;

    private ModelAnimator animator;

    public ModelChanopsis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 18.0F, 0.75F);
        this.body.cubeList.add(new ModelBox(body, 36, 12, -1.0F, -2.4F, -6.55F, 2, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 50, -1.75F, -3.0F, -4.0F, 1, 5, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 50, 0.75F, -3.0F, -4.0F, 1, 5, 3, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 44, -1.5F, -3.25F, -5.5F, 3, 4, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 28, -1.5F, 2.075F, -1.0F, 3, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -2.0F, -4.25F, -1.0F, 4, 7, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -3.675F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0305F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 36, -2.0F, -1.0F, -1.0F, 3, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 2.575F, -3.85F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1571F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 0, -2.0F, -2.0F, -1.0F, 3, 2, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.725F, -5.55F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7418F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 53, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.575F, -2.825F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 36, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.2F, -4.4F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 53, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -3.125F, -6.55F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -1.0297F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 50, 52, -1.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -1.7F, -8.6F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4712F, 0.0873F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 40, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.1F, -1.05F, -7.15F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.8727F, 0.0873F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 43, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.1F, -1.05F, -7.15F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.8727F, -0.0873F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 43, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -1.7F, -8.6F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4712F, -0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 40, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.775F, -8.675F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 56, 6, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.35F, -8.4F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.1694F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 36, 9, -1.0F, -2.025F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.65F, -7.8F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 25, -1.0F, -2.0F, 0.025F, 2, 2, 3, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -2.4F, -0.5F, 4, 6, 8, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 0, -1.5F, -3.3F, -0.51F, 3, 1, 8, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 4.125F, 6.475F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 46, 6, -1.5F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 4.525F, 0.5F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 18, -2.0F, -1.0F, -1.0F, 3, 1, 6, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 4.45F, 1.2F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.2618F, 0.0F, 0.3491F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 52, 30, 0.0F, -0.75F, 0.0F, 0, 2, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 4.45F, 1.2F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.2618F, 0.0F, -0.3491F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 52, 30, 0.0F, -0.75F, 0.0F, 0, 2, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.275F, 7.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 22, 14, -1.5F, -1.85F, -0.775F, 3, 4, 7, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.9F, 0.175F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0829F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 9, -1.0F, -2.0F, -1.0F, 2, 2, 7, 0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.8F, 0.975F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 16, 50, 0.0F, -4.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.3F, 0.075F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2749F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 25, 0.0F, -1.0F, 0.0F, 0, 4, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.0F, 0.475F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3185F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 37, -1.0F, -2.0F, -1.0F, 2, 2, 7, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.35F, 6.225F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 22, 25, 0.0F, -3.0F, 4.0F, 0, 8, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 2.0F, 0.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 20, 40, -1.5F, -4.0F, -1.0F, 2, 4, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 50, 46, -0.5F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, 2.35F, -0.8F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.1309F, -0.2618F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 36, 46, 0.0F, -1.5F, 0.0F, 0, 3, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, 2.35F, -0.8F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.1309F, 0.2618F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 36, 46, 0.0F, -1.5F, 0.0F, 0, 3, 7, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.675F, -5.85F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.7418F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 9, -1.0F, -0.5F, -3.5F, 2, 1, 4, -0.01F, false));

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
        this.body.offsetY = -0.2F;
        this.body.offsetX = 0.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(235);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.6F;
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

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};

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
            this.body.offsetY = 0.2F;
            this.body.offsetZ = -0.5F;
            this.bob(body, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    }
}

