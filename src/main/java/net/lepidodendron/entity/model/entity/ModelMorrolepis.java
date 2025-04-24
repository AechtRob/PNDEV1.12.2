package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMorrolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer dorsalfinR;
    private final AdvancedModelRenderer dorsalfinL;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r5;

    public ModelMorrolepis() {
        this.textureWidth = 47;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 32, 9, -2.0F, -6.0F, -8.0F, 4, 2, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 13, -2.0F, -5.5F, -7.5F, 4, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 25, -2.0F, -7.5F, -4.5F, 4, 5, 3, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -2.0F, -1.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 28, -2.5F, -0.85F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -6.5F, -8.25F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 0, -2.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -3.5F, -8.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 20, -3.0F, -3.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.dorsalfinR = new AdvancedModelRenderer(this);
        this.dorsalfinR.setRotationPoint(-2.0F, -3.0F, -1.5F);
        this.body.addChild(dorsalfinR);
        this.setRotateAngle(dorsalfinR, -0.0873F, -0.3054F, 0.0F);
        this.dorsalfinR.cubeList.add(new ModelBox(dorsalfinR, 0, 22, 0.0F, -1.75F, 0.0F, 0, 3, 6, 0.0F, false));

        this.dorsalfinL = new AdvancedModelRenderer(this);
        this.dorsalfinL.setRotationPoint(2.0F, -3.0F, -1.5F);
        this.body.addChild(dorsalfinL);
        this.setRotateAngle(dorsalfinL, -0.0873F, 0.3054F, 0.0F);
        this.dorsalfinL.cubeList.add(new ModelBox(dorsalfinL, 0, 22, 0.0F, -1.75F, 0.0F, 0, 3, 6, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.75F, -4.5F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 6, 31, -1.0F, -0.5F, -3.35F, 2, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -5.0F, -1.5F);
        this.body.addChild(body2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 10, -2.0F, -1.75F, -0.75F, 4, 6, 9, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-0.5F, 3.5F, 3.75F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.829F, 0.0F, 0.2618F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 18, 30, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 3.5F, 3.75F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.829F, 0.0F, -0.2618F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 18, 30, 0.0F, 0.0F, 0.0F, 0, 5, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.75F, 8.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -2.6F, -1.25F, 3, 5, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 26, 0.5F, -5.5F, 0.25F, 0, 3, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 0, -0.5F, -2.0F, -0.75F, 2, 4, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 26, 20, 0.5F, 1.5F, -0.5F, 0, 3, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 3.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 25, 29, 0.0F, -1.45F, -0.5F, 1, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.25F, 3.5F);
        this.body5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.5F, -0.05F, -3.75F, 0, 7, 12, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 0, 0.0F, -0.3F, -0.75F, 1, 1, 8, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.05F;
        this.body.offsetY = -0.23F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.6F;
        this.body.offsetX = -0.04F;
        this.body.offsetZ = 0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.8F;
        this.body.offsetX = 0.6F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 3.0F;
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(dorsalfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(dorsalfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(dorsalfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(dorsalfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -0.05F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
