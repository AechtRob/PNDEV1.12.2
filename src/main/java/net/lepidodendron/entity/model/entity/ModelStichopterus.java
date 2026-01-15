package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStichopterus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;

    private ModelAnimator animator;

    public ModelStichopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 16, 34, -1.5F, -8.35F, -5.0F, 3, 4, 3, 0.02F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 41, -1.5F, -5.025F, -4.75F, 3, 1, 3, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.125F, -2.3F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0567F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 0, -2.0F, 3.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -8.925F, -2.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -2.0F, 0.0F, 0.0F, 4, 4, 6, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, -6.325F, -6.2F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, -0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 31, -2.1F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, -6.325F, -6.2F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 31, 1.1F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -8.275F, -6.675F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2749F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 42, -1.0F, 0.0F, 0.0F, 3, 3, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.1F, -4.25F, -3.75F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 34, 24, 0.0F, -4.0F, -2.0F, 1, 4, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.725F, -5.95F, -6.45F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.569F, 0.0736F, -0.1276F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 27, -1.0F, -1.4F, -1.0F, 1, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.725F, -5.95F, -6.45F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.569F, -0.0736F, 0.1276F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 27, 0.0F, -1.4F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.375F, -6.125F);
        this.base.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1658F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 32, -1.0F, -2.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, -7.925F, -2.9F);
        this.base.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 0, -2.0F, -1.0F, -1.825F, 3, 1, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.1F, -4.25F, -3.75F);
        this.base.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 24, -1.0F, -4.0F, -2.0F, 1, 4, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -6.05F, -6.45F);
        this.base.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 41, -1.0F, -2.0F, -1.0F, 3, 3, 2, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.9F, -6.775F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.9163F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 13, -1.5F, -0.6F, -2.0F, 3, 1, 2, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.25F, -4.675F, -1.875F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -1.0472F, -0.1745F, 0.3927F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 36, 16, 0.0F, -2.0F, -0.75F, 0, 3, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.25F, -4.675F, -1.875F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -1.0472F, 0.1745F, -0.3927F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 36, 16, 0.0F, -2.0F, -0.75F, 0, 3, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.925F, 3.625F);
        this.base.addChild(body);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.35F, 0.0F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 19, -2.0F, -1.0F, -0.2F, 4, 2, 6, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.25F, 0.0F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 10, -2.0F, -2.0F, -0.1F, 4, 3, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.05F, 2.8F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.1309F, 0.0F, 0.6981F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.25F, 0.5F);
        this.pelvicfinright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 24, 0.0F, -2.0F, -0.5F, 0, 2, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.05F, 2.8F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.1309F, 0.0F, -0.6981F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.25F, 0.5F);
        this.pelvicfinleft.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.48F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 44, 24, 0.0F, -2.0F, -0.5F, 0, 2, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.body.addChild(body2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 1.725F, 0.275F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 34, -2.0F, -2.0F, -1.0F, 3, 2, 5, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.025F, 1.625F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 40, 42, 0.0F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.275F, 1.225F);
        this.body2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6981F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 42, 0.0F, -2.0F, -1.0F, 0, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.525F, 0.225F);
        this.body2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 27, -2.0F, -2.0F, -1.0F, 3, 2, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.225F, 4.225F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 38, 37, -1.0F, 0.75F, -1.1F, 2, 1, 4, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.975F, -0.1F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 7, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.05F, 2.9F);
        this.body3.addChild(body4);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.675F, 1.6F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 28, 34, 0.0F, -2.0F, -2.0F, 0, 3, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.475F, 3.6F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 20, 24, -0.01F, -2.0F, -1.0F, 0, 3, 7, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.925F, 1.1F);
        this.body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.4189F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 20, 16, 0.0F, -2.025F, -1.0F, 1, 1, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, 1.25F, 0.0F);
        this.body4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2618F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 21, 8, 0.0F, -2.0F, 0.0F, 1, 1, 7, 0.01F, false));
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
            this.base.rotateAngleZ = (float) Math.toRadians(90);
            this.base.offsetY = -0.6F;
            this.base.offsetZ = 0.1F;
            this.bob(base, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {

    }
}

