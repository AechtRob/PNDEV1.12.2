package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhabdoderma extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r24;

    public ModelRhabdoderma() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 23.9F, -4.7F);
        this.base.cubeList.add(new ModelBox(base, 25, 0, -2.0F, -5.9F, -1.4F, 4, 4, 3, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 25, 7, -1.5F, -5.35F, -3.25F, 3, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -6.35F, -1.25F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1614F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 0, -1.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -5.25F, -5.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.288F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 9, -1.0F, 0.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.5F, -2.35F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 36, -1.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -2.1F, -1.1F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 24, -1.0F, -2.0F, -3.0F, 3, 2, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.4F, -0.4F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 32, -1.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.9F, 1.6F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 9, 13, -2.0F, -2.5F, -0.5F, 4, 5, 5, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 2.825F, 0.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 23, -2.0F, -1.0F, -1.0F, 3, 1, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -2.175F, 5.55F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 25, 1.0F, -3.0F, -1.0F, 0, 3, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -2.975F, 3.7F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -1.925F, 0.7F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 24, -2.0F, -1.0F, -1.0F, 3, 1, 5, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, 0.575F, 0.025F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, -0.5672F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 22, 0, 0.0F, -0.5F, -0.5F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.75F, 2.1F);
        this.pectoralfinright.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 0, 1.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, 0.575F, 0.025F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.5672F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 22, 0, -1.0F, -0.5F, -0.5F, 1, 1, 2, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.75F, 2.1F);
        this.pectoralfinleft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 0, -1.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.175F, 4.45F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.75F, -0.75F, 3, 4, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.9F, 0.25F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 4, -1.0F, -2.0F, -1.0F, 2, 2, 7, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 3.75F, 6.75F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 1.0F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -2.5F, 6.75F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 2, 1.0F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.0F, 3.75F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 36, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 3.15F, 5.5F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3491F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.2F, 0.45F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 20, 16, -1.0F, -1.0F, -1.0F, 2, 1, 7, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 2.45F, 0.6F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.1309F, -0.2182F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 22, 10, 0.0F, -0.5F, 0.0F, 0, 2, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 2.45F, 0.6F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.1309F, 0.2182F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 22, 10, 0.0F, -0.5F, 0.0F, 0, 2, 4, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.15F, 6.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 18, -1.0F, -1.5F, -0.75F, 2, 3, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.4F, 0.75F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1309F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 29, 0.0F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, -1.1F, 0.25F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 30, 0.0F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.025F, 4.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 31, 14, -0.5F, -1.475F, -1.05F, 1, 3, 4, 0.02F, false));
        this.body4.cubeList.add(new ModelBox(body4, 28, 30, -0.5F, -0.625F, 2.75F, 1, 1, 5, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 4, 0.0F, -3.625F, 1.75F, 0, 7, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 2.0F, 3.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.9599F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 35, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.9F, 0.5F);
        this.body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.4363F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 36, 4, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.925F, 0.25F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 22, 36, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -1.225F, 1.85F);
        this.body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.7418F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 14, 36, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.525F, -1.25F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.4363F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 26, -1.0F, -0.25F, -4.1F, 2, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.25F, -2.5F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.3054F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 35, 29, -2.0F, 0.0F, 0.0F, 3, 1, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }
    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = -0.21F;
        this.base.offsetX = -0.09F;
        this.base.offsetZ = -0.205F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.base.offsetZ = -0.0F;
        this.base.offsetY = -0.12F;
        this.base.offsetX = -0.01F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.4F;
        this.base.offsetX = -0.3F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 3.2F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(base, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0f, 0.3f, f2, 1);

            this.flap(pelvicfinright, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinleft, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(frontRightFin, speed * 0.8F, -0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(frontLeftFin, speed * 0.8F, 0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(pectoralfinright, speed * 0.8F, -0.3F, false, 0F, -0.2F, f2, 1F);
            this.swing(pectoralfinleft, speed * 0.8F, 0.3F, false, 0F, 0.2F, f2, 1F);


            if (!e.isInWater()) {
                this.base.rotateAngleZ = (float) Math.toRadians(90);
                //this.base.offsetX = -0.50F;
                //this.base.offsetY = -0.30F;
                this.bob(base, -speed, 5F, false, f2, 1);
            }
        }
    }
}
