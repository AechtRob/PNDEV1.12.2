package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPolzia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer gill;
    private final AdvancedModelRenderer gill2;
    private final AdvancedModelRenderer gill3;
    private final AdvancedModelRenderer gill4;
    private final AdvancedModelRenderer gill5;
    private final AdvancedModelRenderer gill6;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;

    public ModelPolzia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.15F, 0.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 10, -1.0F, 2.75F, -3.85F, 2, 1, 6, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, 1.0F, -5.0F, 1, 2, 8, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.3F, 3.25F, -4.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, -0.3054F, -0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 7, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.3F, 3.25F, -4.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.3054F, 0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 7, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 17, -1.0F, 0.0F, 0.0F, 2, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.25F, -4.95F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 23, -0.5F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0611F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 10, -1.0F, 0.0F, -5.0F, 2, 3, 5, 0.01F, false));

        this.gill = new AdvancedModelRenderer(this);
        this.gill.setRotationPoint(0.0F, 3.0F, 0.25F);
        this.body.addChild(gill);
        this.setRotateAngle(gill, 0.7854F, 0.0F, 0.0F);
        this.gill.cubeList.add(new ModelBox(gill, 12, 17, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gill2 = new AdvancedModelRenderer(this);
        this.gill2.setRotationPoint(0.0F, 3.0F, 0.75F);
        this.body.addChild(gill2);
        this.setRotateAngle(gill2, 0.7854F, 0.0F, 0.0F);
        this.gill2.cubeList.add(new ModelBox(gill2, 14, 17, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gill3 = new AdvancedModelRenderer(this);
        this.gill3.setRotationPoint(0.0F, 3.0F, 1.25F);
        this.body.addChild(gill3);
        this.setRotateAngle(gill3, 0.7854F, 0.0F, 0.0F);
        this.gill3.cubeList.add(new ModelBox(gill3, 22, 7, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gill4 = new AdvancedModelRenderer(this);
        this.gill4.setRotationPoint(0.0F, 3.0F, 1.75F);
        this.body.addChild(gill4);
        this.setRotateAngle(gill4, 0.7854F, 0.0F, 0.0F);
        this.gill4.cubeList.add(new ModelBox(gill4, 22, 8, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gill5 = new AdvancedModelRenderer(this);
        this.gill5.setRotationPoint(0.0F, 3.0F, 2.25F);
        this.body.addChild(gill5);
        this.setRotateAngle(gill5, 0.7854F, 0.0F, 0.0F);
        this.gill5.cubeList.add(new ModelBox(gill5, 22, 9, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gill6 = new AdvancedModelRenderer(this);
        this.gill6.setRotationPoint(0.0F, 3.0F, 2.75F);
        this.body.addChild(gill6);
        this.setRotateAngle(gill6, 0.7854F, 0.0F, 0.0F);
        this.gill6.cubeList.add(new ModelBox(gill6, 0, 24, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.15F, 3.0F, -2.75F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.9599F, 0.0F, 0.0873F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 18, 0.0F, 0.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.15F, 3.0F, -2.75F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.9599F, 0.0F, -0.0873F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 18, 0.0F, 0.0F, -2.5F, 0, 2, 3, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.25F, 3.0F, -2.0F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 1.1345F, 0.0F, 0.3491F);
        this.legright2.cubeList.add(new ModelBox(legright2, 18, 0, 0.0F, 0.0F, -3.5F, 0, 3, 4, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.25F, 3.0F, -2.0F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 1.1345F, 0.0F, -0.3491F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 18, 0, 0.0F, 0.0F, -3.5F, 0, 3, 4, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.5F, 3.0F, -1.0F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 1.3963F, 0.0F, 0.6109F);
        this.legright3.cubeList.add(new ModelBox(legright3, 12, 18, 0.0F, 0.0F, -3.5F, 0, 3, 4, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.5F, 3.0F, -1.0F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 1.3526F, 0.0F, -0.6109F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 12, 18, 0.0F, 0.0F, -3.5F, 0, 3, 4, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.05F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.08F;
        this.body.offsetZ = -0.01F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.5F;
        this.body.offsetX = -0.338F;
        this.body.rotateAngleY = (float)Math.toRadians(220);
        this.body.rotateAngleX = (float)Math.toRadians(28);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 4.13F;
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
        this.body.offsetY = 0.2F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
//            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = -0.1F;
            this.flap(legleft, speedLeg, -degreeLeg, false, 0, -0.0F, f2, 0.7F);
            this.flap(legright, speedLeg, degreeLeg, false, 0, 0.0F, f2, 0.7F);
            this.flap(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.0F, f2, 0.7F);
            this.flap(legright2, speedLeg, degreeLeg, false, 0.5F, 0.0F, f2, 0.7F);
            this.flap(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.0F, f2, 0.7F);
            this.flap(legright3, speedLeg, degreeLeg, false, 1.0F, 0.0F, f2, 0.7F);
            this.flap(gill, speedLeg, -degreeLeg, false, 1.5F, -0.0F, f2, 0.7F);
            this.flap(gill2, speedLeg, -degreeLeg, false, 2.0F, -0.0F, f2, 0.7F);
            this.flap(gill3, speedLeg, -degreeLeg, false, 2.5F, -0.0F, f2, 0.7F);
            this.flap(gill4, speedLeg, -degreeLeg, false, 3.0F, -0.0F, f2, 0.7F);
            this.flap(gill5, speedLeg, -degreeLeg, false, 3.5F, -0.0F, f2, 0.7F);
            this.flap(gill6, speedLeg, -degreeLeg, false, 4.0F, -0.0F, f2, 0.7F);
            if (!e.isInWater()) {
                this.body.offsetY = 0.4F;
                this.body.rotateAngleZ = (float) Math.toRadians(90);
            }


                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F * 0.66F, false, f2, 2);

                }
                else
                {
                    this.bob(body, -speed, 1F * 0.66F, false, f2, 2);
                }

        }
    }
}
