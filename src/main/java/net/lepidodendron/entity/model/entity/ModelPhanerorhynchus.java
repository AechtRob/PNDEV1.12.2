package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPhanerorhynchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;

    public ModelPhanerorhynchus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.6F, -8.0F);
        this.body.cubeList.add(new ModelBox(body, 20, 7, -1.0F, -1.1F, 0.4F, 2, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 21, -1.0F, -1.0F, -0.1F, 2, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 22, -0.5F, -1.0F, -1.1F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 18, -1.25F, -2.0F, 2.25F, 1, 3, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 18, 0.25F, -2.0F, 2.25F, 1, 3, 2, 0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 18, 14, -1.0F, -1.15F, 1.4F, 2, 1, 1, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 12, -1.0F, -0.075F, 2.25F, 2, 1, 2, -0.015F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 18, -1.0F, -1.6F, 2.0F, 2, 1, 2, -0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 4, -1.5F, -0.9F, 0.4F, 2, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -1.5F, -1.0F, -0.1F, 2, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -2.0F, 3.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4887F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 18, -1.0F, -0.3F, -0.25F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 18, -1.0F, -0.55F, -1.05F, 1, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 4.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -1.5F, -0.6F, 2, 3, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.5F, -0.35F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 7, -1.0F, -1.0F, -0.25F, 2, 1, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.5F, -0.35F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4887F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 19, -1.0F, 0.95F, 2.75F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 19, -1.0F, 0.35F, 1.75F, 1, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 16, -1.0F, -0.05F, 0.75F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.5F, -0.1F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -1.0F, -1.65F, 2.6F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 1.5F, -0.1F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 6, -1.0F, -1.45F, 1.8F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 8, -1.0F, -1.2F, 0.8F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, -1.0F, -0.95F, -0.2F, 1, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.5F, -0.35F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0087F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 12, -1.0F, -0.25F, -0.25F, 2, 1, 4, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 1.5F, 2.9F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 1.0036F, -0.1745F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, 0.0F, -3.0F);
        this.pelvicfinright.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 0, -1.0F, -0.25F, 2.75F, 0, 2, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 1.5F, 2.9F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 1.0036F, 0.1745F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.0F, -3.0F);
        this.pelvicfinleft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0698F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 0, 1.0F, -0.25F, 2.75F, 0, 2, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 3.4F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, -0.75F, -1.0F, -0.25F, 1, 2, 4, 0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, -0.25F, -1.0F, -0.25F, 1, 2, 4, 0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.75F, 1.0F, 3.75F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 12, -1.0F, -2.0F, -4.0F, 1, 2, 4, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 12, -1.5F, -2.0F, -4.0F, 1, 2, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.75F, -1.0F, 3.75F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2443F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 0, -1.0F, -0.1F, -4.0F, 1, 2, 4, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 0, -1.5F, -0.1F, -4.0F, 1, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.75F, 1.0F, 3.75F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.6545F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 11, 0.75F, -1.5F, -1.75F, 0, 2, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.75F, -3.75F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4887F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, 3.45F, 4.65F, 0, 1, 2, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 7, 0.0F, 2.45F, 4.25F, 0, 1, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 23, -0.5F, 2.45F, 4.55F, 1, 1, 1, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 18, -0.5F, 1.7F, 3.75F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 1.25F, -3.5F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -1.0F, -2.25F, 3.95F, 1, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 11, -1.0F, -1.9F, 3.3F, 1, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.body3.addChild(body4);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.0F, 1.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 8, 0, 0.0F, -1.75F, -2.0F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 1.0F, 1.0F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2531F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 2, 0.5F, -1.05F, 0.2F, 0, 3, 5, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 1.0F, 1.0F);
        this.body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 14, 6, 0.0F, -1.25F, -1.0F, 1, 1, 4, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, 0.5F, 4.25F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.3054F, -0.4363F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 1, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, 0.5F, 4.25F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.3054F, 0.4363F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 1, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.75F, 2.25F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 11, -1.0F, -0.75F, -1.85F, 2, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 6, 17, -1.0F, -0.75F, -2.35F, 2, 1, 1, -0.02F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.5F, 0.0F, 0.0F);
        this.body.offsetY = -0.21F;
        this.body.offsetX = -0.08F;
        this.body.offsetZ = -0.18F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetZ = 0.02F;
        this.body.offsetY = -0.12F;
        this.body.offsetX = -0.0044F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.8F;
        this.body.offsetX = 0.8F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.5F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 4.0F, -0.2F);
        this.setRotateAngle(body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(body, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0f, 0.3f, f2, 1);

            this.flap(pelvicfinright, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinleft, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(frontRightFin, speed * 0.8F, -0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(frontLeftFin, speed * 0.8F, 0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(pectoralfinright, speed * 0.8F, -0.3F, false, 0F, -0.2F, f2, 1F);
            this.swing(pectoralfinleft, speed * 0.8F, 0.3F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetX = -0.50F;
                //this.body.offsetY = -0.30F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
