package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWaterGastropodBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMaclurina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer tentacleL;
    private final AdvancedModelRenderer tentacleL2;
    private final AdvancedModelRenderer shell1;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;

    public ModelMaclurina() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 36, 15, 1.0F, -1.0F, -6.75F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0F, 0.0F, -4.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 22, -0.5F, -3.5F, -3.25F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 35, -1.0F, -3.5F, -1.25F, 2, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.0F, 0.0F, -4.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 26, -2.0F, -3.51F, -0.75F, 4, 3, 4, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.body.addChild(leg3);
        this.leg3.cubeList.add(new ModelBox(leg3, 24, 0, 3.0F, -0.99F, -7.25F, 1, 1, 8, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(bone);


        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body.addChild(leg);
        this.leg.cubeList.add(new ModelBox(leg, 0, 0, 1.0F, -1.0F, -9.75F, 4, 1, 8, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.body.addChild(leg2);
        this.leg2.cubeList.add(new ModelBox(leg2, 0, 26, 2.0F, -0.99F, -7.25F, 1, 1, 8, 0.0F, false));

        this.tentacleL = new AdvancedModelRenderer(this);
        this.tentacleL.setRotationPoint(3.5F, -2.75F, -5.75F);
        this.body.addChild(tentacleL);
        this.tentacleL.cubeList.add(new ModelBox(tentacleL, 36, 18, 0.0F, 0.0F, -2.0F, 4, 0, 2, 0.0F, false));

        this.tentacleL2 = new AdvancedModelRenderer(this);
        this.tentacleL2.setRotationPoint(2.5F, -2.75F, -5.75F);
        this.body.addChild(tentacleL2);
        this.tentacleL2.cubeList.add(new ModelBox(tentacleL2, 36, 20, -4.0F, 0.0F, -2.0F, 4, 0, 2, 0.0F, false));

        this.shell1 = new AdvancedModelRenderer(this);
        this.shell1.setRotationPoint(-0.25F, -0.25F, 1.0F);
        this.body.addChild(shell1);
        this.setRotateAngle(shell1, -0.0436F, 0.0F, 0.0F);
        this.shell1.cubeList.add(new ModelBox(shell1, 0, 17, 0.75F, -5.0F, -4.0F, 5, 5, 4, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(5.75F, -3.75F, 0.0F);
        this.shell1.addChild(shell2);
        this.setRotateAngle(shell2, 0.0873F, -0.7854F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 18, 17, -4.0F, -1.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 3.0F, 5.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.0F, -0.48F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 20, 9, -4.0F, -4.0F, 0.0F, 4, 4, 4, 0.01F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, 0.0F, -0.829F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 18, 33, -3.0F, -4.0F, 0.0F, 3, 4, 4, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, 0.0436F, -0.5672F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 32, 33, -3.0F, -1.0F, 0.0F, 3, 3, 4, 0.02F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 2.0F, 4.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, 0.0F, -0.9599F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 34, 26, -2.0F, -3.25F, 0.0F, 2, 3, 3, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, 0.0F, -0.5236F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 35, -2.0F, -3.5F, 0.0F, 2, 3, 3, 0.01F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell7.addChild(shell8);
        this.setRotateAngle(shell8, 0.0F, -0.8727F, 0.0F);
        this.shell8.cubeList.add(new ModelBox(shell8, 36, 9, -2.0F, -3.75F, 0.0F, 2, 3, 3, 0.0F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, -1.75F, 3.0F);
        this.shell8.addChild(shell9);
        this.setRotateAngle(shell9, 0.0436F, -0.8727F, 0.0F);
        this.shell9.cubeList.add(new ModelBox(shell9, 0, 9, -5.0F, -2.35F, 0.1F, 5, 3, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.4F;
        this.body.offsetX = 0.0F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 1.6F;
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
        //this.body.offsetY = 0.122F;

        this.swing(tentacleL, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(tentacleL2, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(tentacleL, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(tentacleL2, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.tentacleL.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleL.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleL2.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleL2.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        EntityPrehistoricFloraWaterGastropodBase ee = (EntityPrehistoricFloraWaterGastropodBase) e;
        this.body.scaleChildren = false;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.body.setScaleZ(scaler);
        this.leg.setScaleZ(scaler);
        this.leg2.setScaleZ(scaler);
        this.leg3.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.body.setScaleX(scaler2 * 0.7F);
        this.leg.setScaleX(scaler2 * 0.7F);
        this.leg2.setScaleX(scaler2 * 0.7F);
        this.leg3.setScaleX(scaler2 * 0.7F);

    }
}
