package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEryon extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer clawL;
    private final AdvancedModelRenderer clawL2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer pincerL;
    private final AdvancedModelRenderer clawR;
    private final AdvancedModelRenderer clawR2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer pincerR;
    private final AdvancedModelRenderer eyeL;
    private final AdvancedModelRenderer eyeR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL2;
    private final AdvancedModelRenderer antennaR2;
    private final AdvancedModelRenderer belly;
    private final AdvancedModelRenderer tailfanL;
    private final AdvancedModelRenderer tailfanR;
    private final AdvancedModelRenderer tailfanL2;
    private final AdvancedModelRenderer tailfanR2;
    private final AdvancedModelRenderer tailfan;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;

    public ModelEryon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.5F, -2.0F, -7.0F, 3, 1, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -2.01F, -8.0F, 12, 0, 11, 0.0F, false));

        this.clawL = new AdvancedModelRenderer(this);
        this.clawL.setRotationPoint(0.25F, -1.0F, -4.5F);
        this.body.addChild(clawL);
        this.setRotateAngle(clawL, 0.0F, -0.3491F, 0.0F);
        this.clawL.cubeList.add(new ModelBox(clawL, 24, 11, 0.0F, 0.01F, -3.0F, 7, 0, 3, 0.0F, false));

        this.clawL2 = new AdvancedModelRenderer(this);
        this.clawL2.setRotationPoint(7.0F, 0.0F, -2.5F);
        this.clawL.addChild(clawL2);
        this.setRotateAngle(clawL2, 0.0F, 0.5236F, 0.0F);
        this.clawL2.cubeList.add(new ModelBox(clawL2, 12, 24, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, -7.0F);
        this.clawL2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, 0.0F, -0.5F, -2.25F, 0, 1, 3, 0.0F, false));

        this.pincerL = new AdvancedModelRenderer(this);
        this.pincerL.setRotationPoint(0.25F, 0.0F, -7.0F);
        this.clawL2.addChild(pincerL);
        this.setRotateAngle(pincerL, 0.0F, 0.7418F, 0.0F);
        this.pincerL.cubeList.add(new ModelBox(pincerL, 0, 4, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.clawR = new AdvancedModelRenderer(this);
        this.clawR.setRotationPoint(-0.25F, -1.0F, -4.5F);
        this.body.addChild(clawR);
        this.setRotateAngle(clawR, 0.0F, 0.3491F, 0.0F);
        this.clawR.cubeList.add(new ModelBox(clawR, 24, 11, -7.0F, 0.01F, -3.0F, 7, 0, 3, 0.0F, true));

        this.clawR2 = new AdvancedModelRenderer(this);
        this.clawR2.setRotationPoint(-7.0F, 0.0F, -2.5F);
        this.clawR.addChild(clawR2);
        this.setRotateAngle(clawR2, 0.0F, -0.5236F, 0.0F);
        this.clawR2.cubeList.add(new ModelBox(clawR2, 12, 24, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -7.0F);
        this.clawR2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.5236F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 3, 0.0F, -0.5F, -2.25F, 0, 1, 3, 0.0F, true));

        this.pincerR = new AdvancedModelRenderer(this);
        this.pincerR.setRotationPoint(-0.25F, 0.0F, -7.0F);
        this.clawR2.addChild(pincerR);
        this.setRotateAngle(pincerR, 0.0F, -0.7418F, 0.0F);
        this.pincerR.cubeList.add(new ModelBox(pincerR, 0, 4, 0.0F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.eyeL = new AdvancedModelRenderer(this);
        this.eyeL.setRotationPoint(1.25F, -1.75F, -6.75F);
        this.body.addChild(eyeL);
        this.setRotateAngle(eyeL, 0.0F, -0.3927F, 0.0F);
        this.eyeL.cubeList.add(new ModelBox(eyeL, 5, 3, 0.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, false));

        this.eyeR = new AdvancedModelRenderer(this);
        this.eyeR.setRotationPoint(-1.25F, -1.75F, -6.75F);
        this.body.addChild(eyeR);
        this.setRotateAngle(eyeR, 0.0F, 0.3927F, 0.0F);
        this.eyeR.cubeList.add(new ModelBox(eyeR, 5, 3, -1.0F, 0.0F, -2.0F, 1, 0, 2, 0.0F, true));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, -1.5F, -6.75F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1745F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 35, 0.0F, 0.0F, -2.75F, 1, 0, 3, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, -1.5F, -6.75F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.1745F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 35, -1.0F, 0.0F, -2.75F, 1, 0, 3, 0.0F, true));

        this.antennaL2 = new AdvancedModelRenderer(this);
        this.antennaL2.setRotationPoint(1.25F, -1.25F, -7.0F);
        this.body.addChild(antennaL2);
        this.setRotateAngle(antennaL2, 0.0F, -0.2182F, 0.0F);
        this.antennaL2.cubeList.add(new ModelBox(antennaL2, 0, 45, -0.5F, 0.0F, -3.75F, 4, 0, 4, 0.0F, false));

        this.antennaR2 = new AdvancedModelRenderer(this);
        this.antennaR2.setRotationPoint(-1.25F, -1.25F, -7.0F);
        this.body.addChild(antennaR2);
        this.setRotateAngle(antennaR2, 0.0F, 0.2182F, 0.0F);
        this.antennaR2.cubeList.add(new ModelBox(antennaR2, 0, 45, -3.5F, 0.0F, -3.75F, 4, 0, 4, 0.0F, true));

        this.belly = new AdvancedModelRenderer(this);
        this.belly.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.body.addChild(belly);
        this.setRotateAngle(belly, -0.0873F, 0.0F, 0.0F);
        this.belly.cubeList.add(new ModelBox(belly, 18, 17, -2.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, false));
        this.belly.cubeList.add(new ModelBox(belly, 9, 11, -3.0F, 0.5F, -0.5F, 6, 0, 6, 0.0F, false));

        this.tailfanL = new AdvancedModelRenderer(this);
        this.tailfanL.setRotationPoint(0.9F, 0.35F, 6.0F);
        this.belly.addChild(tailfanL);
        this.setRotateAngle(tailfanL, -0.0873F, 0.2182F, 0.0F);
        this.tailfanL.cubeList.add(new ModelBox(tailfanL, 2, 3, -0.5F, 0.0F, -0.25F, 1, 0, 3, 0.0F, false));

        this.tailfanR = new AdvancedModelRenderer(this);
        this.tailfanR.setRotationPoint(-0.9F, 0.35F, 6.0F);
        this.belly.addChild(tailfanR);
        this.setRotateAngle(tailfanR, -0.0873F, -0.2182F, 0.0F);
        this.tailfanR.cubeList.add(new ModelBox(tailfanR, 2, 3, -0.5F, 0.0F, -0.25F, 1, 0, 3, 0.0F, true));

        this.tailfanL2 = new AdvancedModelRenderer(this);
        this.tailfanL2.setRotationPoint(1.5F, 0.45F, 6.0F);
        this.belly.addChild(tailfanL2);
        this.setRotateAngle(tailfanL2, -0.1309F, 0.48F, 0.0F);
        this.tailfanL2.cubeList.add(new ModelBox(tailfanL2, 0, 3, -0.25F, 0.0F, -0.75F, 1, 0, 3, 0.0F, false));

        this.tailfanR2 = new AdvancedModelRenderer(this);
        this.tailfanR2.setRotationPoint(-1.5F, 0.45F, 6.0F);
        this.belly.addChild(tailfanR2);
        this.setRotateAngle(tailfanR2, -0.1309F, -0.48F, 0.0F);
        this.tailfanR2.cubeList.add(new ModelBox(tailfanR2, 0, 3, -0.75F, 0.0F, -0.75F, 1, 0, 3, 0.0F, true));

        this.tailfan = new AdvancedModelRenderer(this);
        this.tailfan.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.belly.addChild(tailfan);
        this.setRotateAngle(tailfan, -0.0873F, 0.0F, 0.0F);
        this.tailfan.cubeList.add(new ModelBox(tailfan, 5, 7, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));
        this.tailfan.cubeList.add(new ModelBox(tailfan, 5, 5, -0.5F, 0.0F, 1.0F, 1, 0, 2, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.25F, -1.0F, -3.75F);
        this.body.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.1309F, 0.1222F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 24, 0.0F, 0.01F, 0.0F, 8, 0, 3, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.25F, -1.0F, -3.75F);
        this.body.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.1309F, -0.1222F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 24, -8.0F, 0.01F, 0.0F, 8, 0, 3, 0.0F, true));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.25F, -1.0F, -2.25F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, -0.2182F, 0.1484F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 21, 0.0F, 0.01F, 0.0F, 7, 0, 3, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.25F, -1.0F, -2.25F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.2182F, -0.1484F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 21, -7.0F, 0.01F, 0.0F, 7, 0, 3, 0.0F, true));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.25F, -1.0F, -1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.5236F, 0.192F);
        this.legL3.cubeList.add(new ModelBox(legL3, 19, 24, 0.0F, 0.01F, 0.0F, 6, 0, 2, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.25F, -1.0F, -1.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.5236F, -0.192F);
        this.legR3.cubeList.add(new ModelBox(legR3, 19, 24, -6.0F, 0.01F, 0.0F, 6, 0, 2, 0.0F, true));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.25F, -1.0F, 1.0F);
        this.body.addChild(legL4);
        this.setRotateAngle(legL4, -0.0873F, -0.3927F, 0.3054F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 0, 0.0F, 0.01F, 0.0F, 4, 0, 3, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.25F, -1.0F, 1.0F);
        this.body.addChild(legR4);
        this.setRotateAngle(legR4, -0.0873F, 0.3927F, -0.3054F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 0, -4.0F, 0.01F, 0.0F, 4, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 );
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.01F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    
    public void renderStaticFloor(float f) {

        this.body.offsetZ = -0.04F;
        this.body.render(0.01F);
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
        this.body.offsetY = 0F;

        AdvancedModelRenderer[] Tail = {this.belly};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        EntityPrehistoricFloraTrilobiteBottomBase ee = (EntityPrehistoricFloraTrilobiteBottomBase) e;

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            this.swing(antennaL, 0.15F, 0.15F, false, 2f, 0f, f2, 1F);
            this.swing(antennaR, 0.15F, 0.15F, false, -2f, 0f, f2, 1F);

            this.swing(antennaL2, 0.1F, 0.15F, false, 2f, 0f, f2, 1F);

            this.swing(antennaR2, 0.1F, 0.15F, false, -2f, 0f, f2, 1F);

            float tailVdegree = 0.01F;
            float tailHdegree = 0.3F;

            float bob = 1F;
            float speedLeg = 0.8F;
            float speedArm = 0.35F;
            float degreeLeg = 0.2F;
            float degreeArm = 0.3F;
            if (ee.isAtBottom()) {
                speedLeg = 0.8F;
                speedArm = 0.3F;
                bob = 0.1F;
            }
            if(ee.isInWater()) {
                this.chainWave(Tail, speed*0.6F, tailVdegree, -3, f2, 1);
                this.swing(clawL, 0.08F, 0.6F, false, 0f, 0f, f2, 1F);
                this.swing(clawR, 0.08F, -0.6F, false, 0f, -0f, f2, 1F);
                this.swing(pincerL, 0.18F, -0.33F, true, 0f, 0.2f, f2, 1F);
                this.swing(pincerR, 0.18F, 0.33F, true, 0f, -0.2f, f2, 1F);

                this.flap(legL, speedLeg, -degreeLeg, true, 0, -0.5F, f2, 0.7F);
                this.flap(legR, speedLeg, degreeLeg, true, 0, 0.5F, f2, 0.7F);
                this.flap(legL2, speedLeg, -degreeLeg, true, 0.5F, -0.5F, f2, 0.7F);
                this.flap(legR2, speedLeg, degreeLeg, true, 0.5F, 0.5F, f2, 0.7F);
                this.flap(legL3, speedLeg, -degreeLeg, true, 1.0F, -0.5F, f2, 0.7F);
                this.flap(legR3, speedLeg, degreeLeg, true, 1.0F, 0.5F, f2, 0.7F);
                this.flap(legL4, speedLeg, -degreeLeg, true, 1.5F, -0.5F, f2, 0.7F);
                this.flap(legR4, speedLeg, degreeLeg, true, 1.5F, 0.5F, f2, 0.7F);

                this.swing(legL, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.swing(legR, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                this.swing(legL2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
                this.swing(legR2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.swing(legL3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
                this.swing(legR3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
                this.swing(legL4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.swing(legR4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);

            }

            if (!e.isInWater()) {
                this.body.offsetY = 0F;
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(body, -speed, bob, false, f2, 2);
                }
            }
        }
    }
}
