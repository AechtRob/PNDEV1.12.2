package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelThelodus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer finL;
    private final AdvancedModelRenderer finL2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;

    public ModelThelodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 27.5F, -7.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -8.0F, 2.0F, 6, 3, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.25F, -7.25F, 0.75F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 4, 0, 2.25F, -7.25F, 0.75F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 0, -3.0F, -7.0F, 0.0F, 6, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 3, -2.5F, -6.35F, -2.65F, 5, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 23, -2.5F, -0.05F, 0.2F, 5, 1, 2, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(2.5F, -6.5F, 3.0F);
        this.body.addChild(finL);
        this.setRotateAngle(finL, 0.0F, -0.5236F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 12, 11, 0.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.finL2 = new AdvancedModelRenderer(this);
        this.finL2.setRotationPoint(-2.5F, -6.5F, 3.0F);
        this.body.addChild(finL2);
        this.setRotateAngle(finL2, 0.0F, 0.5236F, 0.0F);
        this.finL2.cubeList.add(new ModelBox(finL2, 0, 11, -6.0F, 0.0F, 0.0F, 6, 0, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -6.5F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -2.0F, -1.49F, 0.0F, 4, 3, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 12, 23, -1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.5F, 8.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 0.0F, -0.5F, -7.95F, 0, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 0, 0.0F, -6.15F, -5.3F, 0, 2, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 16, 16, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 4.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.6545F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.4021F, 0.1846F);
        this.body5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -0.49F, -2.0714F, 0.133F, 1, 1, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.4021F, 0.1846F);
        this.body5.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 29, 0.0F, -1.0F, 1.0F, 0, 6, 4, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, -0.5F, -0.9413F, 0.2119F, 1, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.5F);
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
        this.body.offsetY = 0.7F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        float speed = 0.42F;
        if (!e.isInWater()) {
            speed = 0.68F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.45F, -2.2, f2, 0.8F);

            this.finL.flap(speed * 0.5F, 0.2F, false, -0.2F,0.5F,f2, 0.5f);
            this.finL.swing(speed * 0.5F, 0.2F, false, -0.2F,0.5F,f2, 0.5f);

            //Right:
            this.finL2.flap(speed * 0.5F, 0.2F, true, -0.2F,0.5F,f2, 0.5f);
            this.finL2.swing(speed * 0.5F, 0.2F, true, -0.2F,0.5F,f2, 0.5f);

            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.7F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
