package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelYunnanozoon extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer body9;

    public ModelYunnanozoon() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -5.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 6, 15, -1.0F, -1.5F, 0.0F, 2, 3, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 7, 9, -0.99F, -1.51F, 0.0F, 2, 3, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 17, 0.0F, -4.25F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 9, 3, -1.0F, -1.5F, 0.0F, 2, 3, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 6, 17, -0.01F, -4.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 6, -0.99F, -1.51F, 0.0F, 2, 3, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 17, 0.0F, -4.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 14, 12, -0.5F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 16, 0, -0.01F, -4.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 12, -0.49F, -1.01F, 0.0F, 1, 2, 3, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 14, 14, 0.0F, -4.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 19, 3, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 14, 6, -0.01F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 18, 17, -0.49F, -0.51F, 0.0F, 1, 1, 3, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 0, 14, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.098F);
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
        this.body.offsetY = 1.25F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTailH = {this.body5, this.body6, this.body7, this.body8, this.body9};
        AdvancedModelRenderer[] fishTailV = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9};
        float speed = 0.525F;
        if (!e.isInWater()) {
            speed = 0.85F;
        }

        float feedModifier = 1;
        if (f3 == 0.0) {
            feedModifier = 0.15F;
        }
        float degreeFin = 0.32F * feedModifier;

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTailH, speed, 0.2F, -2, f2, 1);
            this.chainSwing(fishTailV, speed, 0.155F, -1.2, f2, 0.8F);
            this.swing(body, speed, 0.22F, true, 0, 0, f2, 1);
            this.walk(body, speed, 0.1F, true, 1, 0, f2, 0.8F);

            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.30F;
                this.bob(body, -speed, 2F, false, f2, 1);
            }
        }
    }
}
