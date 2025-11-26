package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLiaoningogriphus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer antennaright2;
    private final AdvancedModelRenderer antennaleft2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer legleft9;

    public ModelLiaoningogriphus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.75F, -5.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 10, -1.0F, -1.025F, -1.0F, 2, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 8, 10, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.15F, 0.35F, -1.0F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0F, -0.1745F, -0.1745F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 0, 0, -4.0F, 0.0F, -1.5F, 4, 0, 8, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.15F, 0.35F, -1.0F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0F, 0.1745F, 0.1745F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 0, 0, 0.0F, 0.0F, -1.5F, 4, 0, 8, 0.0F, true));

        this.antennaright2 = new AdvancedModelRenderer(this);
        this.antennaright2.setRotationPoint(0.0F, 0.3F, -1.0F);
        this.body.addChild(antennaright2);
        this.setRotateAngle(antennaright2, 0.0F, -0.3927F, -0.0873F);
        this.antennaright2.cubeList.add(new ModelBox(antennaright2, 0, 8, -4.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.antennaleft2 = new AdvancedModelRenderer(this);
        this.antennaleft2.setRotationPoint(0.0F, 0.3F, -1.0F);
        this.body.addChild(antennaleft2);
        this.setRotateAngle(antennaleft2, 0.0F, 0.3927F, 0.0873F);
        this.antennaleft2.cubeList.add(new ModelBox(antennaleft2, 0, 8, 0.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 13, -0.5F, 0.0F, -0.05F, 1, 1, 2, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 6, 13, -0.75F, 0.0F, -0.05F, 1, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 16, 8, -0.75F, 0.45F, -0.05F, 1, 1, 2, -0.02F, false));
        this.body2.cubeList.add(new ModelBox(body2, 6, 13, -0.25F, 0.0F, -0.05F, 1, 1, 2, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 16, 8, -0.25F, 0.45F, -0.05F, 1, 1, 2, -0.02F, true));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-0.3F, 1.0F, 0.0F);
        this.body2.addChild(legright1);
        this.setRotateAngle(legright1, 0.0F, 0.3491F, -1.1345F);
        this.legright1.cubeList.add(new ModelBox(legright1, 18, 14, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(0.3F, 1.0F, 0.0F);
        this.body2.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.0F, -0.3491F, 1.1345F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 18, 14, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.3F, 1.0F, 0.5F);
        this.body2.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.3491F, -1.1345F);
        this.legright2.cubeList.add(new ModelBox(legright2, 18, 15, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.3F, 1.0F, 0.5F);
        this.body2.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, -0.3491F, 1.1345F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 18, 15, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.3F, 1.0F, 1.0F);
        this.body2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.3491F, -1.1345F);
        this.legright3.cubeList.add(new ModelBox(legright3, 18, 16, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.3F, 1.0F, 1.0F);
        this.body2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.3491F, 1.1345F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 18, 16, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.3F, 1.0F, 1.5F);
        this.body2.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.3491F, -1.1345F);
        this.legright4.cubeList.add(new ModelBox(legright4, 18, 17, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.3F, 1.0F, 1.5F);
        this.body2.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.3491F, 1.1345F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 18, 17, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 12, 13, -0.5F, 0.0F, -0.1F, 1, 1, 2, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -0.75F, 0.0F, -0.1F, 1, 1, 2, -0.02F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 16, -0.75F, 0.3F, -0.1F, 1, 1, 2, -0.03F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -0.25F, 0.0F, -0.1F, 1, 1, 2, -0.02F, true));
        this.body3.cubeList.add(new ModelBox(body3, 12, 16, -0.25F, 0.3F, -0.1F, 1, 1, 2, -0.03F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.3F, 1.0F, 0.25F);
        this.body3.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 0.3491F, -1.1345F);
        this.legright5.cubeList.add(new ModelBox(legright5, 18, 18, -1.5F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.3F, 1.0F, 0.25F);
        this.body3.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -0.3491F, 1.1345F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 18, 18, -0.5F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-0.3F, 1.0F, 1.0F);
        this.body3.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 0.3491F, -1.1345F);
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 19, -1.5F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(0.3F, 1.0F, 1.0F);
        this.body3.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, -0.3491F, 1.1345F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 19, -0.5F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-0.3F, 1.0F, 1.75F);
        this.body3.addChild(legright7);
        this.setRotateAngle(legright7, 0.0F, 0.3491F, -1.1345F);
        this.legright7.cubeList.add(new ModelBox(legright7, 4, 19, -1.5F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(0.3F, 1.0F, 1.75F);
        this.body3.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.0F, -0.3491F, 1.1345F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 4, 19, -0.5F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 6, 16, -0.5F, 0.025F, -0.35F, 1, 1, 2, -0.02F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 13, -0.5F, 0.25F, 1.15F, 1, 0, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 8, -0.65F, 0.025F, -0.1F, 1, 1, 1, -0.03F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 8, -0.35F, 0.025F, -0.1F, 1, 1, 1, -0.03F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.25F, 0.35F, 1.65F);
        this.body4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 11, -0.5F, 0.0F, -0.5F, 1, 0, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.25F, 0.35F, 1.65F);
        this.body4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 11, -0.5F, 0.0F, -0.5F, 1, 0, 2, 0.0F, false));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-0.3F, 0.75F, 0.35F);
        this.body4.addChild(legright8);
        this.setRotateAngle(legright8, 0.0F, 0.3491F, -1.1345F);
        this.legright8.cubeList.add(new ModelBox(legright8, 8, 19, -1.6F, -0.4F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(0.3F, 0.75F, 0.35F);
        this.body4.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.0F, -0.3491F, 1.1345F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 8, 19, -0.4F, -0.4F, 0.0F, 2, 1, 0, 0.0F, true));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-0.3F, 0.75F, 0.85F);
        this.body4.addChild(legright9);
        this.setRotateAngle(legright9, 0.0F, 0.3491F, -1.1345F);
        this.legright9.cubeList.add(new ModelBox(legright9, 12, 19, -1.5F, -0.4F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(0.3F, 0.75F, 0.85F);
        this.body4.addChild(legleft9);
        this.setRotateAngle(legleft9, 0.0F, -0.3491F, 1.1345F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 12, 19, -0.5F, -0.4F, 0.0F, 2, 1, 0, 0.0F, true));

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
        this.body.offsetX = 0.7F;
        this.body.rotateAngleY = (float)Math.toRadians(220);
        this.body.rotateAngleX = (float)Math.toRadians(20);
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

        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4};

        this.body.offsetZ = .20F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(antennaleft, 0.3F, 0.2F, true, 0f, 0.2f, f2, 1F);
            this.walk(antennaright, 0.3F, 0.2F, false, 0f, 0.2f, f2, 1F);
            this.swing(antennaleft, 0.3F, 0.15F, true, 2f, 0f, f2, 1F);
            this.swing(antennaright, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            this.walk(antennaleft2, 0.3F, 0.2F, true, 0f, 0.2f, f2, 1F);
            this.walk(antennaright2, 0.3F, 0.2F, false, 0f, 0.2f, f2, 1F);
            this.swing(antennaleft2, 0.3F, 0.15F, true, 2f, 0f, f2, 1F);
            this.swing(antennaright2, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);


            float tailVdegree = 0.05F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.25F, tailVdegree, -2, f2, 1);


            float speedLeg = 1.2F;
            float degreeLeg = 0.3F;
            this.swing(legleft1, speedLeg, -degreeLeg, true, 0, -0.5F, f2, 0.7F);
            this.swing(legright1, speedLeg, degreeLeg, true, 0, 0.5F, f2, 0.7F);
            this.swing(legleft2, speedLeg, -degreeLeg, true, 0.5F, -0.5F, f2, 0.7F);
            this.swing(legright2, speedLeg, degreeLeg, true, 0.5F, 0.5F, f2, 0.7F);
            this.swing(legleft3, speedLeg, -degreeLeg, true, 1.0F, -0.5F, f2, 0.7F);
            this.swing(legright3, speedLeg, degreeLeg, true, 1.0F, 0.5F, f2, 0.7F);
            this.swing(legleft4, speedLeg, -degreeLeg, true, 2.0F, -0.5F, f2, 0.7F);
            this.swing(legright4, speedLeg, degreeLeg, true, 2.0F, 0.5F, f2, 0.7F);
            this.swing(legleft5, speedLeg, -degreeLeg, true, 3.0F, -0.5F, f2, 0.7F);
            this.swing(legright5, speedLeg, degreeLeg, true, 3.0F, 0.5F, f2, 0.7F);
            this.swing(legleft6, speedLeg, -degreeLeg, true, 4.0F, -0.5F, f2, 0.7F);
            this.swing(legright6, speedLeg, degreeLeg, true, 4.0F, 0.5F, f2, 0.7F);
            this.swing(legleft7, speedLeg, -degreeLeg, true, 5.0F, -0.5F, f2, 0.7F);
            this.swing(legright7, speedLeg, degreeLeg, true, 5.0F, 0.5F, f2, 0.7F);
            this.swing(legleft8, speedLeg, -degreeLeg, true, 6.0F, -0.5F, f2, 0.7F);
            this.swing(legright8, speedLeg, degreeLeg, true, 6.0F, 0.5F, f2, 0.7F);
            this.swing(legleft9, speedLeg, -degreeLeg, true, 7.0F, -0.5F, f2, 0.7F);
            this.swing(legright9, speedLeg, degreeLeg, true, 7.0F, 0.5F, f2, 0.7F);

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
