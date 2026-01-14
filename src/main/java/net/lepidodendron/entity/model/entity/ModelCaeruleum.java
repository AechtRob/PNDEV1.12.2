package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAquaticSticker;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCaeruleum extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r3;

    public ModelCaeruleum() {
        this.textureWidth = 64;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.25F, 4.0F);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -1.5F, -9.0F, 3, 3, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 27, -1.5F, -0.95F, -8.75F, 3, 1, 1, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -1.5F, -1.5F, -0.5F, 3, 3, 8, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 39, 0.01F, -2.25F, 1.25F, 0, 1, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 40, -0.01F, -2.25F, 0.0F, 0, 1, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 22, 12, -1.5F, -1.5F, -0.5F, 3, 3, 7, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 22, 22, -1.0F, -0.5F, -0.25F, 2, 2, 7, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.25F, 0.75F);
        this.body4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0611F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 0, -1.0F, -1.0F, -1.0F, 2, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.1F, 0.75F);
        this.body4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, 0.01F, -1.0F, -1.0F, 0, 1, 7, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.25F, 6.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 18, 31, -1.0F, -0.5F, -0.5F, 2, 2, 6, -0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 34, 36, -0.01F, -2.0F, -0.5F, 0, 2, 6, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.5F, 5.5F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 26, 39, 0.01F, -2.25F, 0.0F, 0, 2, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 42, 6, 0.01F, 0.25F, -0.25F, 0, 1, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 42, 0, -0.01F, -1.0F, 3.75F, 0, 2, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 23, -0.5F, -0.5F, -0.5F, 1, 1, 8, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -1.5F, -9.0F);
        this.body.addChild(mouth);
        this.setRotateAngle(mouth, 0.6109F, 0.0F, 0.0F);
        this.mouth.cubeList.add(new ModelBox(mouth, 40, 22, -1.5F, 0.0F, -3.0F, 3, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.25F, -3.15F);
        this.mouth.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 8, -1.5F, 0.01F, -0.5F, 3, 0, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 31, -2.0F, -1.0F, -1.0F, 4, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.9F;
        this.body.offsetX = 2.5F;
        this.body.rotateAngleY = (float)Math.toRadians(250);
        this.body.rotateAngleX = (float)Math.toRadians(28);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.2F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(180);
        this.body.rotateAngleX = (float) Math.toRadians(-90);
        this.body.offsetZ = -0.19F;
        this.body.offsetY = -0.3F;
        this.body.offsetX = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.2F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.3F, 0.4F, 0.0F);
        this.setRotateAngle(body5, 0.4F, 0.6F, 0.0F);
        this.body.offsetY = -0.17F;
        this.body.render(0.01F);
        resetToDefaultPose();
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5, this.body6};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        EntityPrehistoricFloraAquaticSticker EntitySticker = (EntityPrehistoricFloraAquaticSticker) e;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (EntitySticker.getAttachmentPos() != null) {
                this.chainSwing(fishTail, speed*0.3F, 0.07F, 0, f2, 1);
                this.swing(body, speed*0.3F, 0.1F, true, 0, 0, f2, 1);
            } else {
                this.chainSwing(fishTail, speed * 0.8F, 0.27F, 0, f2, 1);
                this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
            }


             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -0.1F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
