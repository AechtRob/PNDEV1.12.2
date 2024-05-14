package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLiaosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer dorsalfinR;
    private final AdvancedModelRenderer dorsalfinL;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;

    public ModelLiaosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 29.0F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 20, -1.5F, -8.75F, -5.8F, 3, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -5.0F, -1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 25, -3.0F, -3.35F, -3.25F, 4, 3, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2007F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, -2.5F, -10.4F, -3.675F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -9.5F, -8.25F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, -2.5F, -1.05F, 2.35F, 3, 2, 3, -0.01F, false));

        this.dorsalfinR = new AdvancedModelRenderer(this);
        this.dorsalfinR.setRotationPoint(-2.0F, -6.0F, -1.75F);
        this.body.addChild(dorsalfinR);
        this.setRotateAngle(dorsalfinR, -0.6109F, -0.3054F, 0.0F);
        this.dorsalfinR.cubeList.add(new ModelBox(dorsalfinR, 26, 16, 0.0F, -1.75F, 0.0F, 0, 3, 4, 0.0F, false));

        this.dorsalfinL = new AdvancedModelRenderer(this);
        this.dorsalfinL.setRotationPoint(2.0F, -6.0F, -1.75F);
        this.body.addChild(dorsalfinL);
        this.setRotateAngle(dorsalfinL, -0.6109F, 0.3054F, 0.0F);
        this.dorsalfinL.cubeList.add(new ModelBox(dorsalfinL, 26, 16, 0.0F, -1.75F, 0.0F, 0, 3, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.35F, -4.5F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.4363F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 25, -1.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -8.0F, -1.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -2.25F, -0.25F, 4, 5, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.75F, 6.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -1.5F, -2.6F, -0.5F, 3, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 12, 0.0F, -5.5F, 0.5F, 0, 3, 5, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.0F, 1.3F, 0.75F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.2618F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 26, 13, 0.0F, 0.0F, -0.75F, 0, 3, 4, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.0F, 1.3F, 0.75F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.2618F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 26, 13, 0.0F, 0.0F, -0.75F, 0, 3, 4, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -1.5F, 5.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 22, 0, -1.0F, -1.0F, -0.75F, 2, 3, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 26, 7, 0.0F, -4.0F, 0.0F, 0, 3, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 26, 3, 0.0F, 2.0F, -0.5F, 0, 3, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.5F, 4.25F);
        this.body4.addChild(body5);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -1.25F, 3.5F);
        this.body5.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.5F, -0.05F, -3.75F, 0, 4, 12, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 8, 0.0F, -0.3F, -0.25F, 1, 1, 8, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 7.75F, -15.0F);
        this.body5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 17, 0.0F, -6.2F, 14.75F, 1, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetZ = -0.73F;
        this.body.offsetY = -0.22F;
        this.body.offsetX = -0.08F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetZ = -0.02F;
        this.body.offsetY = -0.1F;
        this.body.offsetX = -0.012F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.4F;
        this.body.offsetX = 0.55F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 0.5F;
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
        //this.head.offsetY = 1.2F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.89F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.335F, -2.6, f2, 1);
            this.swing(body, speed, 0.16F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0, f2, 1);

            this.flap(pelvicfinR, speed * 0.8F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinL, speed * 0.8F, -0.75F, false, 0F, 0.3F, f2, 1F);
            //this.flap(dorsalfinR, speed * 0.8F, 0.25F, false, 0F, -0.1F, f2, 1F);
            //this.flap(dorsalfinL, speed * 0.8F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(dorsalfinR, speed * 0.8F, -0.5F, false, 0F, -0.2F, f2, 1F);
            this.swing(dorsalfinL, speed * 0.8F, 0.5F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -.30F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
