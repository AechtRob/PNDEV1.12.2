package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraFerussina;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFerussina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;

    public ModelFerussina() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -2.5F);
        this.body.cubeList.add(new ModelBox(body, 1, 1, -2.0F, 0.0F, -3.0F, 4, 1, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 21, 14, -1.0F, 0.0F, -4.0F, 2, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -2.45F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3796F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 24, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, -2.45F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2051F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.0F, 1.0F, 3.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 9, 24, -2.0F, -0.99F, -0.5F, 2, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 6, -1.5F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(0.5F, -0.75F, -2.25F);
        this.body.addChild(eye1);
        this.setRotateAngle(eye1, 1.708F, -0.1246F, 0.1195F);
        this.eye1.cubeList.add(new ModelBox(eye1, 18, 24, 0.0F, -2.75F, 0.0F, 3, 3, 0, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.5F, -0.75F, -2.25F);
        this.body.addChild(eye2);
        this.setRotateAngle(eye2, 1.708F, 0.1246F, -0.1195F);
        this.eye2.cubeList.add(new ModelBox(eye2, 25, 24, -3.0F, -2.75F, 0.0F, 3, 3, 0, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.5F, -1.475F, -2.5F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.7143F, -0.3326F, -0.3527F);
        this.shell.cubeList.add(new ModelBox(shell, 23, 0, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.01F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, -0.6F, 2.25F);
        this.shell.addChild(shell2);
        this.setRotateAngle(shell2, -0.6545F, 0.0F, 0.0F);
        this.shell2.cubeList.add(new ModelBox(shell2, 15, 17, -1.0F, 0.0F, 1.0F, 2, 2, 4, 0.02F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shell2.addChild(shell3);
        this.setRotateAngle(shell3, 0.2778F, -0.3367F, -0.0939F);
        this.shell3.cubeList.add(new ModelBox(shell3, 0, 9, -1.0F, 0.055F, -4.9997F, 5, 2, 5, 0.0F, false));
        this.shell3.cubeList.add(new ModelBox(shell3, 21, 9, 0.0F, 1.555F, -3.9997F, 3, 1, 3, 0.0F, false));
        this.shell3.cubeList.add(new ModelBox(shell3, 28, 6, 1.0F, 2.055F, -2.9997F, 1, 1, 1, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5 * 0.5F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.1F;
        this.body.offsetX = 0.1F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.2F;
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
        this.body.offsetY = 0.75F;

        EntityPrehistoricFloraFerussina ee = (EntityPrehistoricFloraFerussina) e;

        this.tail.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.tail.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.tail.setScaleX(scaler2 * 0.7F);



    }
}
