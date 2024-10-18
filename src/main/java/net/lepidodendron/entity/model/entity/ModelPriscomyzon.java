package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAquaticSticker;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPriscomyzon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;

    public ModelPriscomyzon() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -8.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, 4.0F, 4, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 11, 1.25F, -1.5F, 4.975F, 1, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 11, -2.25F, -1.5F, 4.975F, 1, 1, 5, 0.0F, true));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -2.0F, 4.15F);
        this.body.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 0, 8, -2.5F, 1.05F, -4.0F, 5, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.mouth.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, -1.5F, -0.175F, -0.825F, 3, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.0F, 10.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, 0.0F, -1.5F, 0.0F, 0, 1, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 21, -1.5F, -1.0F, -0.25F, 3, 2, 1, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.0F, -1.5F, 0.0F, 0, 1, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 17, -1.0F, -0.25F, -1.0F, 2, 1, 4, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 18, 18, -1.0F, -0.75F, -1.0F, 2, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 15, 5, -0.5F, -0.5F, -1.0F, 1, 1, 5, 0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 8, 11, 0.0F, -1.25F, 0.0F, 0, 1, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 14, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 8, 8, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetZ = -0.32F;
        this.body.offsetY = -0.18F;
        this.body.offsetX = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.14F;
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
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
