package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAcheronauta extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer finright;
    private final AdvancedModelRenderer finleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finright2;
    private final AdvancedModelRenderer finleft2;
    private final AdvancedModelRenderer finright3;
    private final AdvancedModelRenderer finleft3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finright4;
    private final AdvancedModelRenderer finleft4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finright5;
    private final AdvancedModelRenderer finleft5;
    private final AdvancedModelRenderer finright6;
    private final AdvancedModelRenderer finleft6;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finright7;
    private final AdvancedModelRenderer finleft7;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;

    public ModelAcheronauta() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 21.0F, -4.75F);
        this.base.cubeList.add(new ModelBox(base, 0, 15, -1.0F, -1.5F, -1.0F, 2, 1, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 20, 0, -1.2F, -1.5F, -2.0F, 1, 1, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 20, 0, 0.2F, -1.5F, -2.0F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.25F, 0.175F, 0.8F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 19, -1.01F, -2.0F, -1.0F, 1, 2, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 19, -2.49F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.25F, -0.025F, 0.9F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 13, -1.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 13, -2.5F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -1.3F, -1.3F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 0, 0.0F, -1.0F, -0.9F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -0.25F, 2, 2, 3, -0.01F, false));

        this.finright = new AdvancedModelRenderer(this);
        this.finright.setRotationPoint(-1.0F, 1.0F, 1.25F);
        this.body.addChild(finright);
        this.setRotateAngle(finright, 0.0F, 0.0F, 0.5236F);
        this.finright.cubeList.add(new ModelBox(finright, 20, 11, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft = new AdvancedModelRenderer(this);
        this.finleft.setRotationPoint(1.0F, 1.0F, 1.25F);
        this.body.addChild(finleft);
        this.setRotateAngle(finleft, 0.0F, 0.0F, -0.5236F);
        this.finleft.cubeList.add(new ModelBox(finleft, 20, 11, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 5, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.01F, false));

        this.finright2 = new AdvancedModelRenderer(this);
        this.finright2.setRotationPoint(-1.0F, 1.0F, 0.5F);
        this.body2.addChild(finright2);
        this.setRotateAngle(finright2, 0.0F, 0.0F, 0.5236F);
        this.finright2.cubeList.add(new ModelBox(finright2, 18, 20, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft2 = new AdvancedModelRenderer(this);
        this.finleft2.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.body2.addChild(finleft2);
        this.setRotateAngle(finleft2, 0.0F, 0.0F, -0.5236F);
        this.finleft2.cubeList.add(new ModelBox(finleft2, 18, 20, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.finright3 = new AdvancedModelRenderer(this);
        this.finright3.setRotationPoint(-1.0F, 1.0F, 2.5F);
        this.body2.addChild(finright3);
        this.setRotateAngle(finright3, 0.0F, 0.0F, 0.5236F);
        this.finright3.cubeList.add(new ModelBox(finright3, 20, 20, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft3 = new AdvancedModelRenderer(this);
        this.finleft3.setRotationPoint(1.0F, 1.0F, 2.5F);
        this.body2.addChild(finleft3);
        this.setRotateAngle(finleft3, 0.0F, 0.0F, -0.5236F);
        this.finleft3.cubeList.add(new ModelBox(finleft3, 20, 20, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 10, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.finright4 = new AdvancedModelRenderer(this);
        this.finright4.setRotationPoint(-1.0F, 1.0F, 1.5F);
        this.body3.addChild(finright4);
        this.setRotateAngle(finright4, 0.0F, 0.0F, 0.5236F);
        this.finright4.cubeList.add(new ModelBox(finright4, 0, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft4 = new AdvancedModelRenderer(this);
        this.finleft4.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.body3.addChild(finleft4);
        this.setRotateAngle(finleft4, 0.0F, 0.0F, -0.5236F);
        this.finleft4.cubeList.add(new ModelBox(finleft4, 0, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 5, -1.0F, -0.25F, 0.0F, 2, 1, 3, -0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 10, 9, -1.0F, -0.75F, 0.0F, 2, 1, 3, 0.01F, false));

        this.finright5 = new AdvancedModelRenderer(this);
        this.finright5.setRotationPoint(-1.0F, 0.75F, 0.5F);
        this.body4.addChild(finright5);
        this.setRotateAngle(finright5, 0.0F, 0.0F, 0.5236F);
        this.finright5.cubeList.add(new ModelBox(finright5, 2, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft5 = new AdvancedModelRenderer(this);
        this.finleft5.setRotationPoint(1.0F, 0.75F, 0.5F);
        this.body4.addChild(finleft5);
        this.setRotateAngle(finleft5, 0.0F, 0.0F, -0.5236F);
        this.finleft5.cubeList.add(new ModelBox(finleft5, 2, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.finright6 = new AdvancedModelRenderer(this);
        this.finright6.setRotationPoint(-1.0F, 0.75F, 2.5F);
        this.body4.addChild(finright6);
        this.setRotateAngle(finright6, 0.0F, 0.0F, 0.5236F);
        this.finright6.cubeList.add(new ModelBox(finright6, 4, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft6 = new AdvancedModelRenderer(this);
        this.finleft6.setRotationPoint(1.0F, 0.75F, 2.5F);
        this.body4.addChild(finleft6);
        this.setRotateAngle(finleft6, 0.0F, 0.0F, -0.5236F);
        this.finleft6.cubeList.add(new ModelBox(finleft6, 4, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 18, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 18, 17, -0.5F, -0.5F, 1.75F, 1, 1, 2, -0.01F, false));

        this.finright7 = new AdvancedModelRenderer(this);
        this.finright7.setRotationPoint(-1.0F, 0.5F, 1.5F);
        this.body5.addChild(finright7);
        this.setRotateAngle(finright7, 0.0F, 0.0F, 0.5236F);
        this.finright7.cubeList.add(new ModelBox(finright7, 6, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.finleft7 = new AdvancedModelRenderer(this);
        this.finleft7.setRotationPoint(1.0F, 0.5F, 1.5F);
        this.body5.addChild(finleft7);
        this.setRotateAngle(finleft7, 0.0F, 0.0F, -0.5236F);
        this.finleft7.cubeList.add(new ModelBox(finleft7, 6, 21, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.65F, -0.5F, -0.5F);
        this.base.addChild(legright);
        this.setRotateAngle(legright, -0.6981F, 0.0F, -0.1309F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 5, 0.0F, -0.4F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.legright.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, 0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 2, 0.0F, -0.5F, -1.6F, 0, 2, 1, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.65F, -0.5F, -0.5F);
        this.base.addChild(legleft);
        this.setRotateAngle(legleft, -0.6981F, 0.0F, 0.1309F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 5, 0.0F, -0.4F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4F, 1.0F);
        this.legleft.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, -0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 2, 0.0F, -0.5F, -1.6F, 0, 2, 1, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.75F, -0.5F, 0.0F);
        this.base.addChild(legright2);
        this.setRotateAngle(legright2, -0.5236F, 0.0F, 0.1745F);
        this.legright2.cubeList.add(new ModelBox(legright2, 20, 8, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.4F, 0.4F);
        this.legright2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2182F, 0.0F, 0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 19, 0.0F, -0.2F, -1.0F, 0, 2, 1, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.75F, -0.5F, 0.0F);
        this.base.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.5236F, 0.0F, -0.1745F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 20, 8, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4F, 0.4F);
        this.legleft2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 19, 0.0F, -0.2F, -1.0F, 0, 2, 1, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.85F, -0.5F, 0.5F);
        this.base.addChild(legright3);
        this.setRotateAngle(legright3, -0.1745F, 0.0F, 0.4363F);
        this.legright3.cubeList.add(new ModelBox(legright3, 8, 19, 0.0F, 0.0F, -0.5F, 0, 3, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1F, 0.0F, 0.8F);
        this.legright3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 15, 0.0F, -0.2F, -1.0F, 0, 3, 1, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.85F, -0.5F, 0.5F);
        this.base.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.1745F, 0.0F, -0.4363F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 8, 19, 0.0F, 0.0F, -0.5F, 0, 3, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.1F, 0.0F, 0.8F);
        this.legleft3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, -0.2618F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 15, 0.0F, -0.2F, -1.0F, 0, 3, 1, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.base.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.3054F, 0.1745F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 10, 13, 0.0F, -1.75F, -4.0F, 0, 2, 4, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.base.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.3054F, -0.1745F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 10, 13, 0.0F, -1.75F, -4.0F, 0, 2, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5 );
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(body, 0.2F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.2F, 0.1F, 0.0F);
        this.setRotateAngle(body3, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(body4, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(body5, -0.2F, 0.1F, 0.0F);
        this.base.offsetX = -0.014F;
        this.base.offsetY = -0.1F;
        this.base.offsetZ = -0.02F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.0F;
        this.base.offsetX = 0.7F;
        this.base.rotateAngleY = (float)Math.toRadians(225);
        this.base.rotateAngleX = (float)Math.toRadians(28);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 5.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

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

        AdvancedModelRenderer[] Tail = {this.body, this.body2, this.body3, this.body4, this.body5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaleft, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaright, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = 0.25F;
            this.flap(legleft, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legright, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legright2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legright3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(finleft, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(finright, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(finleft2, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(finright2, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(finleft3, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(finright3, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(finleft4, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(finright4, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(finleft5, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finright5, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(finleft6, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(finright6, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(finleft7, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(finright7, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            if (!e.isInWater()) {
//                this.base.offsetY = 0.4F;
                this.base.rotateAngleZ = (float) Math.toRadians(90);
            }


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
