package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraUncus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelUncus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;

    public ModelUncus() {
        textureWidth = 16;
        textureHeight = 16;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 0, 13, -0.5F, -1.0F, -6.0F, 1, 1, 2, 0.002F, false));

        bone = new AdvancedModelRenderer(this);
        bone.setRotationPoint(0.0F, 0.0F, -4.0F);
        main.addChild(bone);
        bone.cubeList.add(new ModelBox(bone, 0, 10, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        bone2 = new AdvancedModelRenderer(this);
        bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
        bone.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 0, 7, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.002F, false));

        bone3 = new AdvancedModelRenderer(this);
        bone3.setRotationPoint(0.0F, 0.0F, 2.0F);
        bone2.addChild(bone3);
        bone3.cubeList.add(new ModelBox(bone3, 0, 4, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        bone4 = new AdvancedModelRenderer(this);
        bone4.setRotationPoint(0.0F, 0.0F, 2.0F);
        bone3.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 0, 1, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.002F, false));

        bone5 = new AdvancedModelRenderer(this);
        bone5.setRotationPoint(0.0F, 0.0F, 2.0F);
        bone4.addChild(bone5);
        bone5.cubeList.add(new ModelBox(bone5, 6, 13, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = 0.7F;
        this.main.rotateAngleY = (float)Math.toRadians(210);
        this.main.rotateAngleX = (float)Math.toRadians(29);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 4.93F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.bone.rotateAngleY = 0.3F;
        this.bone2.rotateAngleY = 0.3F;
        this.bone3.rotateAngleY = -0.3F;
        this.bone4.rotateAngleY = -0.3F;
        this.bone5.rotateAngleY = 0.5F;

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        AdvancedModelRenderer[] BodyF = {this.main, this.bone, this.bone2};
        AdvancedModelRenderer[] BodyB = {this.bone3, this.bone4, this.bone5};
        AdvancedModelRenderer[] BodyFull = {this.main, this.bone, this.bone2, this.bone3, this.bone4, this.bone5};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(BodyFull, 0.2F, -0.015F, -3, f2, 0.4F);
            this.chainSwing(BodyF, 0.2F, 0.08F, 3, f2, 0.5F);
            this.chainSwing(BodyB, 0.2F, -0.08F, -3, f2, 0.5F);
            EntityPrehistoricFloraUncus ee = (EntityPrehistoricFloraUncus) e;
            this.main.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.main.setScaleZ(scaler);
        }
    }
}
