package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPapiliomaris extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer valveright;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer valveleft;
    private final AdvancedModelRenderer cube_r4;

    public ModelPapiliomaris() {
        this.textureWidth = 48;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 23, -1.0F, -2.0F, -4.0F, 2, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 9, -1.0F, -1.25F, -6.5F, 2, 1, 3, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 24, -1.0F, -1.75F, -6.5F, 2, 1, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 28, -0.5F, -1.5F, -7.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.575F, -7.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2618F, -0.2182F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 28, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -0.575F, -7.5F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2618F, 0.2182F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 28, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.1309F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 20, 16, -1.5F, -0.5F, 0.0F, 3, 2, 6, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 2, 16, -2.0F, 0.5F, 0.0F, 1, 0, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 6, 22, -1.5F, 0.5F, 5.75F, 1, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 6, 22, 0.5F, 0.5F, 5.75F, 1, 0, 1, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 2, 16, 1.0F, 0.5F, 0.0F, 1, 0, 5, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 26, 26, -1.0F, 0.0F, 6.0F, 2, 1, 1, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.75F, -0.5F, -6.0F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0F, -0.3054F, -0.3054F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 26, 24, -2.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.75F, -0.5F, -6.0F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0F, 0.3054F, 0.3054F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 26, 24, 0.0F, 0.0F, -1.5F, 2, 0, 2, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, -0.5F, -4.0F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -0.3927F, -0.3491F);
        this.legright.cubeList.add(new ModelBox(legright, 24, 13, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, -0.5F, -4.0F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 0.3927F, 0.3491F);
        this.legleft.cubeList.add(new ModelBox(legleft, 24, 13, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.75F, -0.5F, -2.25F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.4363F, -0.3491F);
        this.legright2.cubeList.add(new ModelBox(legright2, 24, 0, -7.0F, 0.0F, -1.5F, 7, 0, 3, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.75F, -0.5F, -2.25F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.4363F, 0.3491F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 24, 0, 0.0F, 0.0F, -1.5F, 7, 0, 3, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.75F, -0.5F, -1.0F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.0436F, -0.3927F);
        this.legright3.cubeList.add(new ModelBox(legright3, 24, 3, -7.0F, 0.0F, -1.5F, 7, 0, 3, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.75F, -0.5F, -1.0F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.0436F, 0.3927F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 24, 3, 0.0F, 0.0F, -1.5F, 7, 0, 3, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.75F, -0.5F, 0.25F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 0.5236F, -0.4363F);
        this.legright4.cubeList.add(new ModelBox(legright4, 24, 6, -5.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.75F, -0.5F, 0.25F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -0.5236F, 0.4363F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 24, 6, 0.0F, 0.0F, -1.5F, 5, 0, 3, 0.0F, true));

        this.valveright = new AdvancedModelRenderer(this);
        this.valveright.setRotationPoint(0.0F, -2.3F, -1.0F);
        this.body.addChild(valveright);
        this.setRotateAngle(valveright, 0.0F, 0.0F, -0.1745F);
        this.valveright.cubeList.add(new ModelBox(valveright, 0, 0, -4.0F, 0.0F, -4.0F, 4, 0, 8, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.valveright.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -4.0F, 0.0F, -4.0F, 4, 0, 8, 0.0F, false));

        this.valveleft = new AdvancedModelRenderer(this);
        this.valveleft.setRotationPoint(0.0F, -2.3F, -1.0F);
        this.body.addChild(valveleft);
        this.setRotateAngle(valveleft, 0.0F, 0.0F, 0.1745F);
        this.valveleft.cubeList.add(new ModelBox(valveleft, 0, 0, 0.0F, 0.0F, -4.0F, 4, 0, 8, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.valveleft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.2618F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, 0.0F, 0.0F, -4.0F, 4, 0, 8, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.16F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.05F;
        this.body.offsetX = 0.15F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 0.8F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.2F;

        AdvancedModelRenderer[] Tail = {this.body, this.body2};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float speedLeg = 1.5F;
            float degreeLeg = 0.3F;
            float weightLeg = -0.5F;
            this.swing(legleft, speedLeg, -degreeLeg, false, 0, -weightLeg, f2, 0.7F);
            this.swing(legright, speedLeg, degreeLeg, false, 0, weightLeg, f2, 0.7F);
            this.swing(legleft2, speedLeg, -degreeLeg, false, 0.5F, -weightLeg, f2, 0.7F);
            this.swing(legright2, speedLeg, degreeLeg, false, 0.5F, weightLeg, f2, 0.7F);
            this.swing(legleft3, speedLeg, -degreeLeg, false, 1.0F, -weightLeg, f2, 0.7F);
            this.swing(legright3, speedLeg, degreeLeg, false, 1.0F, weightLeg, f2, 0.7F);
            this.swing(legleft4, speedLeg, -degreeLeg, false, 1.5F, -weightLeg, f2, 0.7F);
            this.swing(legright4, speedLeg, degreeLeg, false, 1.5F, weightLeg, f2, 0.7F);

            if (f3 != 0) {
                this.chainWave(Tail, 0.48F, 0.25F, -0.15F, f2, 0.65F);
                this.chainSwing(Tail, 0.35F, 0.15F, 0, f2, 0.5F);
            }
            else {
                this.chainWave(Tail, 0.15F, 0.11F, -1.5, f2, 0.8F);
            }

            if (!e.isInWater()) {
                this.body.offsetY = 1.25F;
                this.bob(body, -speed * 1.5F, 3F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(body, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(body, -speed, 0.12F, false, f2, 2);
                }
            }
        }

        this.swing(antennaleft, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(antennaright, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}