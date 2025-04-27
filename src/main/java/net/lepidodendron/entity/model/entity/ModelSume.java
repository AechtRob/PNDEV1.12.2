package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSume extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer antennaright2;
    private final AdvancedModelRenderer antennaleft2;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    public ModelSume() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.1F, -1.75F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.25F, -0.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 16, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.55F, -0.2F, 0.2F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 9, -0.5F, -1.0F, -5.0F, 0, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.55F, -0.2F, 0.2F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 9, 0.5F, -1.0F, -5.0F, 0, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 11, -0.5F, -1.0F, -4.0F, 1, 1, 4, -0.01F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.2F, -1.5F, -3.5F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, -0.0436F, 0.1745F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 0, 0, 0.0F, -0.5F, -7.0F, 0, 4, 7, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.2F, -1.5F, -3.5F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, -0.0436F, -0.1745F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 0, 0, 0.0F, -0.5F, -7.0F, 0, 4, 7, 0.0F, true));

        this.antennaright2 = new AdvancedModelRenderer(this);
        this.antennaright2.setRotationPoint(-0.1F, -1.5F, -3.5F);
        this.body.addChild(antennaright2);
        this.setRotateAngle(antennaright2, -0.48F, 0.1309F, 0.0F);
        this.antennaright2.cubeList.add(new ModelBox(antennaright2, 10, 11, 0.0F, -1.5F, -3.0F, 0, 2, 3, 0.0F, false));

        this.antennaleft2 = new AdvancedModelRenderer(this);
        this.antennaleft2.setRotationPoint(0.1F, -1.5F, -3.5F);
        this.body.addChild(antennaleft2);
        this.setRotateAngle(antennaleft2, -0.48F, -0.1309F, 0.0F);
        this.antennaleft2.cubeList.add(new ModelBox(antennaleft2, 10, 11, 0.0F, -1.5F, -3.0F, 0, 2, 3, 0.0F, true));

        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.0F, -0.5F, -1.5F);
        this.body.addChild(leg);
        this.setRotateAngle(leg, -1.0036F, 0.0F, 0.0F);
        this.leg.cubeList.add(new ModelBox(leg, 6, 19, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.2F, -0.6F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.3927F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 14, 0, -0.5F, -0.025F, 0.0F, 1, 1, 2, 0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.5F, 0.9F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 3, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(0.0F, 1.3F, 0.55F);
        this.body2.addChild(leg2);
        this.setRotateAngle(leg2, -0.6981F, 0.0F, 0.0F);
        this.leg2.cubeList.add(new ModelBox(leg2, 18, 18, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(0.0F, 1.4F, 1.3F);
        this.body2.addChild(leg3);
        this.setRotateAngle(leg3, -0.0873F, 0.0F, 0.0F);
        this.leg3.cubeList.add(new ModelBox(leg3, 0, 19, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3491F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.4F, 1.1F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 6, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.975F, 1.625F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 14, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.8F, 1.025F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 16, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.015F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(0.0F, 1.4F, 0.8F);
        this.body3.addChild(leg4);
        this.setRotateAngle(leg4, 0.1745F, 0.0F, 0.0F);
        this.leg4.cubeList.add(new ModelBox(leg4, 2, 19, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(0.0F, 1.15F, 1.55F);
        this.body3.addChild(leg5);
        this.setRotateAngle(leg5, 0.4363F, 0.0F, 0.0F);
        this.leg5.cubeList.add(new ModelBox(leg5, 4, 19, -0.5F, -0.5F, 0.0F, 1, 2, 0, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.1F, 1.8F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.5672F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.725F, 1.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1745F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 9, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.9F, 0.8F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, 0.0F, -1.0F, -1.0F, 1, 1, 2, -0.01F, false));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(0.0F, 0.7F, 1.1F);
        this.body4.addChild(legright6);
        this.setRotateAngle(legright6, 0.7854F, 0.0F, 0.0F);
        this.legright6.cubeList.add(new ModelBox(legright6, 8, 19, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.075F, 1.525F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1745F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.9F, -0.2F, 3.0F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 12, -1.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.9F, -0.2F, 3.0F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, -0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 12, 0.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.5F, 1.1F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 16, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = 0.030F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -0.9F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 4.5F;
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
        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4, this.body5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(antennaleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.walk(antennaright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);
            this.swing(antennaleft, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.swing(antennaright, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(antennaleft2, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.walk(antennaright2, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);
            this.swing(antennaleft2, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.swing(antennaright2, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.05F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.25F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.3F;
            this.walk(leg, speedLeg, -degreeLeg, true, 0, -0.5F, f2, 0.7F);
            this.walk(leg2, speedLeg, degreeLeg, true, 0, 0.5F, f2, 0.7F);
            this.walk(leg3, speedLeg, -degreeLeg, true, 0.5F, -0.5F, f2, 0.7F);
            this.walk(leg4, speedLeg, degreeLeg, true, 0.5F, 0.5F, f2, 0.7F);
            this.walk(leg5, speedLeg, -degreeLeg, true, 1.0F, -0.5F, f2, 0.7F);
            this.walk(legright6, speedLeg, degreeLeg, true, 1.0F, 0.5F, f2, 0.7F);

                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, 1F, false, f2, 2);
                }

        }
    }
}
