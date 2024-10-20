package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPikaia extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;

    public ModelPikaia() {
        this.textureWidth = 40;
        this.textureHeight = 36;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 25.5F, -8.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -4.5F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -4.575F, 0.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, -0.3491F, -0.2182F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 5, -0.75F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -4.6F, 0.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, -0.3491F, -0.2182F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 0, -0.75F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -4.65F, 0.75F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, -0.3491F, -0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 5, -0.75F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -4.7F, 1.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, -0.3491F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 1, -0.75F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -4.75F, 1.25F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, -0.3491F, -0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 1, -0.75F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -4.75F, 1.5F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, -0.3491F, -0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.75F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -4.75F, 1.5F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.3491F, 0.2182F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.25F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -4.75F, 1.25F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2182F, 0.3491F, 0.2182F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, -0.25F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -4.7F, 1.0F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.3491F, 0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 4, 1, -0.25F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -4.65F, 0.75F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.3491F, 0.2182F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 5, 5, -0.25F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -4.6F, 0.5F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.3491F, 0.2182F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 0, -0.25F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -4.575F, 0.25F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.3491F, 0.2182F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 3, 5, -0.25F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -4.5F, 0.0F);
        this.body.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 9, 2, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -3.75F, 0.2F);
        this.body.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 0, -1.5F, 0.0F, -1.75F, 3, 0, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.25F, 2.0F);
        this.body.addChild(body2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.2F, 0.8F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 5, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.4F, 1.75F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 18, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.2F, 1.0F);
        this.body2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 7, 24, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 3.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 12, 24, -0.75F, -0.45F, 0.0F, 1, 2, 5, 0.015F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 24, -0.25F, -0.45F, 0.0F, 1, 2, 5, 0.015F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 2.0F, 1.9F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 16, 0.99F, -1.0F, -1.0F, 0, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 1.75F, 0.9F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0436F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 27, 0, 0.0F, -1.0F, -1.0F, 1, 1, 5, 0.02F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.65F, 1.0F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 24, 0.0F, -3.0F, -1.0F, 1, 3, 5, 0.015F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 16, 0.0F, 1.25F, 0.0F, 0, 1, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -1.0F, -1.25F, 0.0F, 1, 3, 7, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -1.25F, 0.0F, 1, 3, 7, 0.0F, true));
        this.body4.cubeList.add(new ModelBox(body4, 18, 0, -0.5F, 0.0F, 0.0F, 1, 2, 7, 0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 1.25F, 1.0F);
        this.body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 3, 0.0F, -3.0F, -1.0F, 1, 3, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 9, 13, -0.5F, -2.25F, -0.25F, 1, 3, 7, 0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, 1.9F, 0.75F);
        this.body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0698F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 18, 9, 0.0F, -2.0F, -1.0F, 1, 2, 7, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(1.1F, 1.5F, 0.75F);
        this.body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 10, -1.0F, -3.0F, -1.0F, 1, 3, 7, 0.0F, true));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 10, -2.2F, -3.0F, -1.0F, 1, 3, 7, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0F, 2.15F, 1.0F);
        this.body5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0262F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 16, 1.0F, -1.0F, -1.0F, 0, 1, 7, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.35F, 6.75F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 27, 9, -0.75F, -1.075F, -0.7F, 1, 2, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 27, 9, -0.25F, -1.075F, -0.7F, 1, 2, 3, 0.0F, true));
        this.body6.cubeList.add(new ModelBox(body6, 0, 5, -0.5F, -0.575F, 2.05F, 1, 1, 1, -0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.9F, -0.175F);
        this.body6.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.1614F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 24, 25, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0F, 1.15F, 3.55F);
        this.body6.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.5149F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 1.0F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0F, 2.15F, 0.75F);
        this.body6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.2531F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 1, 0.99F, -1.0F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 1.925F, -0.35F);
        this.body6.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.3491F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 18, 0.0F, -1.0F, 0.0F, 1, 1, 6, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.25F;
        this.body.offsetX = -0.15F;
        this.body.offsetZ = -0.5F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.2F, 0.0F);
        this.body.offsetZ = -0.05F;
        this.body.offsetY = 0.04F;
        this.body.offsetX = -0.018F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = 2.638F;
        this.body.rotateAngleX = (float)Math.toRadians(25);
        this.body.rotateAngleY = (float)Math.toRadians(240);
        this.body.rotateAngleZ = (float)Math.toRadians(-20);
        this.body.scaleChildren = true;
        float scaler = 3.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

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
        this.body.offsetY = -0.2F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};
        float speed = 0.525F;
        if (!e.isInWater()) {
            speed = 0.85F;
        }

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.32F * feedModifier;

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.155F, -1.2, f2, 0.8F);
            this.swing(body, speed, 0.22F, true, 0, 0, f2, 1);

            //this.swing(Leftantenna, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
            //this.swing(Rightantenna, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -0.4F;
                this.bob(body, -speed, 2F, false, f2, 1);
            }
        }
    }
}
