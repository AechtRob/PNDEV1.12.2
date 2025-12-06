package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWaterGastropodBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPoleumita extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer tentacleR;
    private final AdvancedModelRenderer tentacleR2;

    public ModelPoleumita() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 20, 9, 2.5F, -1.75F, -4.5F, 2, 2, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -0.25F, -5.0F, 4, 1, 6, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 25, 2.0F, -0.25F, 1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.5F, -1.75F, -4.5F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 25, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 13, 2.0F, -2.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(5.0F, 0.0F, 1.0F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, 0.0F, -0.9163F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 14, 13, -3.0F, -2.0F, 0.0F, 3, 2, 4, 0.01F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.0F, -0.6545F, 0.0F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 19, -3.0F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell3.addChild(shell4);
        this.setRotateAngle(shell4, 0.0F, -1.0036F, 0.0F);
        this.shell4.cubeList.add(new ModelBox(shell4, 14, 19, -2.0F, -2.0F, 0.0F, 2, 2, 4, 0.01F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell4.addChild(shell5);
        this.setRotateAngle(shell5, 0.0F, -0.6981F, 0.0F);
        this.shell5.cubeList.add(new ModelBox(shell5, 20, 0, -2.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell5.addChild(shell6);
        this.setRotateAngle(shell6, 0.0F, -1.0908F, 0.0F);
        this.shell6.cubeList.add(new ModelBox(shell6, 20, 5, -2.0F, -1.75F, 0.0F, 2, 1, 3, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell6.addChild(shell7);
        this.setRotateAngle(shell7, 0.0F, -0.7418F, 0.0F);
        this.shell7.cubeList.add(new ModelBox(shell7, 0, 7, -5.0F, -1.75F, 0.0F, 5, 1, 5, -0.01F, false));

        this.tentacleR = new AdvancedModelRenderer(this);
        this.tentacleR.setRotationPoint(4.5F, -1.75F, -4.5F);
        this.bone.addChild(tentacleR);
        this.tentacleR.cubeList.add(new ModelBox(tentacleR, 14, 25, 0.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        this.tentacleR2 = new AdvancedModelRenderer(this);
        this.tentacleR2.setRotationPoint(2.5F, -1.75F, -4.5F);
        this.bone.addChild(tentacleR2);
        this.tentacleR2.cubeList.add(new ModelBox(tentacleR2, 20, 25, -2.0F, 0.0F, -1.0F, 2, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        bone.render(f5 * 0.58F);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -1.2F;
        this.bone.offsetX = 0.0F;
        this.bone.offsetZ = 2.0F;
        this.bone.rotateAngleY = (float)Math.toRadians(120);
        this.bone.rotateAngleX = (float)Math.toRadians(0);
        this.bone.rotateAngleZ = (float)Math.toRadians(0);
        this.bone.scaleChildren = true;
        float scaler = 3.0F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(bone, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
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
        this.bone.offsetY = 0.62F;

        this.swing(tentacleR, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.swing(tentacleR2, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);
        this.flap(tentacleR, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.flap(tentacleR2, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);

        this.tentacleR.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleR.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleR2.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleR2.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        EntityPrehistoricFloraWaterGastropodBase ee = (EntityPrehistoricFloraWaterGastropodBase) e;
        this.bone.scaleChildren = false;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.bone.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.bone.setScaleX(scaler2 * 0.7F);

    }
}
