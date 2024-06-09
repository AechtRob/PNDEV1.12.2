package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIsoxys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer rightleg5;
    private final AdvancedModelRenderer rightleg6;
    private final AdvancedModelRenderer rightleg7;
    private final AdvancedModelRenderer rightleg8;
    private final AdvancedModelRenderer rightleg9;
    private final AdvancedModelRenderer rightleg10;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer leftleg5;
    private final AdvancedModelRenderer leftleg6;
    private final AdvancedModelRenderer leftleg7;
    private final AdvancedModelRenderer leftleg8;
    private final AdvancedModelRenderer leftleg9;
    private final AdvancedModelRenderer leftleg10;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelIsoxys() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 28.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 0, 0, -1.5F, -9.25F, -9.0F, 3, 0, 18, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 23, 15, -1.0F, -9.0F, -5.0F, 2, 2, 9, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 4, 6, -1.75F, -8.0F, -6.0F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 4, 6, 0.75F, -8.0F, -6.0F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.5F, -9.0F, 0.0F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 2, 0.0F, -0.25F, -8.0F, 0, 6, 16, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -9.0F, 0.0F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, 0.0F, -0.25F, -8.0F, 0, 6, 16, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-0.5F, -7.0F, -4.0F);
        this.base.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.3054F, 0.2618F, 0.3054F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 6, 2, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.rightarm.cubeList.add(new ModelBox(rightarm, 0, 3, 0.0F, 0.25F, -1.0F, 0, 1, 1, 0.0F, false));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(0.0F, 1.5F, 0.25F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8727F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 6, -0.5F, 0.0F, -0.5F, 1, 2, 1, -0.01F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 3, 5, 0.0F, 0.75F, -1.0F, 0, 1, 1, 0.0F, false));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 2, 0.0F, 2.0F, -0.75F, 0, 1, 1, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(0.5F, -7.0F, -4.0F);
        this.base.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.3054F, -0.2618F, -0.3054F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 6, 2, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.leftarm.cubeList.add(new ModelBox(leftarm, 0, 3, 0.0F, 0.25F, -1.0F, 0, 1, 1, 0.0F, true));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0F, 1.5F, 0.25F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 6, -0.5F, 0.0F, -0.5F, 1, 2, 1, -0.01F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 3, 5, 0.0F, 0.75F, -1.0F, 0, 1, 1, 0.0F, true));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 2, 0.0F, 2.0F, -0.75F, 0, 1, 1, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-0.5F, -7.0F, -3.0F);
        this.base.addChild(bone);


        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0F, 0.5236F, 0.0F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 10, 6, -0.5F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.bone.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.0F, 0.5236F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 10, 3, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.bone.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.0F, 0.5236F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 2, 9, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.bone.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0F, 0.5236F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 9, 0, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg5 = new AdvancedModelRenderer(this);
        this.rightleg5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone.addChild(rightleg5);
        this.setRotateAngle(rightleg5, 0.0F, 0.5236F, 0.0F);
        this.rightleg5.cubeList.add(new ModelBox(rightleg5, 0, 9, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg6 = new AdvancedModelRenderer(this);
        this.rightleg6.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.bone.addChild(rightleg6);
        this.setRotateAngle(rightleg6, 0.0F, 0.5236F, 0.0F);
        this.rightleg6.cubeList.add(new ModelBox(rightleg6, 8, 8, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg7 = new AdvancedModelRenderer(this);
        this.rightleg7.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.bone.addChild(rightleg7);
        this.setRotateAngle(rightleg7, 0.0F, 0.5236F, 0.0F);
        this.rightleg7.cubeList.add(new ModelBox(rightleg7, 6, 8, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg8 = new AdvancedModelRenderer(this);
        this.rightleg8.setRotationPoint(0.0F, 0.0F, 5.25F);
        this.bone.addChild(rightleg8);
        this.setRotateAngle(rightleg8, 0.0F, 0.5236F, 0.0F);
        this.rightleg8.cubeList.add(new ModelBox(rightleg8, 8, 5, -0.5F, -1.25F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg9 = new AdvancedModelRenderer(this);
        this.rightleg9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone.addChild(rightleg9);
        this.setRotateAngle(rightleg9, 0.0F, 0.5236F, 0.0F);
        this.rightleg9.cubeList.add(new ModelBox(rightleg9, 4, 8, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, false));

        this.rightleg10 = new AdvancedModelRenderer(this);
        this.rightleg10.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.bone.addChild(rightleg10);
        this.setRotateAngle(rightleg10, 0.0F, 0.5236F, 0.0F);
        this.rightleg10.cubeList.add(new ModelBox(rightleg10, 0, 0, -0.5F, -2.0F, 0.0F, 1, 3, 0, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.5F, -7.0F, -3.0F);
        this.base.addChild(bone2);


        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0F, -0.5236F, 0.0F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 10, 6, -0.5F, -2.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.bone2.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.0F, -0.5236F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 10, 3, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.bone2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, -0.5236F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 2, 9, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 0.0F, 2.25F);
        this.bone2.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0F, -0.5236F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 9, 0, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg5 = new AdvancedModelRenderer(this);
        this.leftleg5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone2.addChild(leftleg5);
        this.setRotateAngle(leftleg5, 0.0F, -0.5236F, 0.0F);
        this.leftleg5.cubeList.add(new ModelBox(leftleg5, 0, 9, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg6 = new AdvancedModelRenderer(this);
        this.leftleg6.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.bone2.addChild(leftleg6);
        this.setRotateAngle(leftleg6, 0.0F, -0.5236F, 0.0F);
        this.leftleg6.cubeList.add(new ModelBox(leftleg6, 8, 8, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg7 = new AdvancedModelRenderer(this);
        this.leftleg7.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.bone2.addChild(leftleg7);
        this.setRotateAngle(leftleg7, 0.0F, -0.5236F, 0.0F);
        this.leftleg7.cubeList.add(new ModelBox(leftleg7, 6, 8, -0.5F, -1.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg8 = new AdvancedModelRenderer(this);
        this.leftleg8.setRotationPoint(0.0F, 0.0F, 5.25F);
        this.bone2.addChild(leftleg8);
        this.setRotateAngle(leftleg8, 0.0F, -0.5236F, 0.0F);
        this.leftleg8.cubeList.add(new ModelBox(leftleg8, 8, 5, -0.5F, -1.25F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg9 = new AdvancedModelRenderer(this);
        this.leftleg9.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.bone2.addChild(leftleg9);
        this.setRotateAngle(leftleg9, 0.0F, -0.5236F, 0.0F);
        this.leftleg9.cubeList.add(new ModelBox(leftleg9, 4, 8, -0.5F, -1.5F, 0.0F, 1, 3, 0, 0.0F, true));

        this.leftleg10 = new AdvancedModelRenderer(this);
        this.leftleg10.setRotationPoint(0.0F, 0.0F, 6.75F);
        this.bone2.addChild(leftleg10);
        this.setRotateAngle(leftleg10, 0.0F, -0.5236F, 0.0F);
        this.leftleg10.cubeList.add(new ModelBox(leftleg10, 0, 0, -0.5F, -2.0F, 0.0F, 1, 3, 0, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -8.35F, 3.9F);
        this.base.addChild(tail1);
        this.setRotateAngle(tail1, -0.0873F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 3, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -0.375F, 0.0F, 2, 0, 3, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.4363F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -0.4F, 0.0F, 2, 0, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.2F, 0.0F, 0.0F);
        this.base.offsetZ = -0.015F;
        this.base.offsetY = -0.0F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.base.offsetZ = 0.030F;
        this.base.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -0.0F;
        this.base.offsetX = 0.55F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 6.5F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.2F, 3.6F, -0.3F);
        this.setRotateAngle(tail1, 0.2F, 0.0F, 0.0F);
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
        //this.body.offsetY = 0.5F;

        AdvancedModelRenderer[] Tail = {this.tail1};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(leftarm, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(rightarm, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(leftarm, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(rightarm, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.05F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.25F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.3F;
            this.flap(leftleg1, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(rightleg1, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(leftleg2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(leftleg3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(rightleg3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(leftleg4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(leftleg5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(rightleg5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(leftleg6, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg6, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(leftleg7, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(rightleg7, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(leftleg8, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg8, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(leftleg9, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(rightleg9, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(leftleg10, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(rightleg10, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);

                if (f3 == 0.0F) {
                    this.bob(base, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(base, -speed, 1F, false, f2, 2);
                }

        }
    }
}
