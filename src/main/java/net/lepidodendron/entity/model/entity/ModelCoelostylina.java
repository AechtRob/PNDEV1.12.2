package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraCoelostylina;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoelostylina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;

    public ModelCoelostylina() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -2.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, 0.0F, -2.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 0, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.0F, -0.75F, -1.45F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.0F, 1.0F, 2.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 3, -2.0F, -0.99F, -0.5F, 2, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, -1.5F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(0.5F, 0.25F, -2.5F);
        this.body.addChild(eye1);
        this.setRotateAngle(eye1, 1.0472F, 0.0F, 0.1745F);
        this.eye1.cubeList.add(new ModelBox(eye1, 10, 17, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.5F, 0.25F, -2.5F);
        this.body.addChild(eye2);
        this.setRotateAngle(eye2, 1.0472F, 0.0F, -0.1745F);
        this.eye2.cubeList.add(new ModelBox(eye2, 13, 17, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.275F, -0.5F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.1745F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 6, -1.5F, -2.9062F, -0.1858F, 3, 3, 2, 0.01F, false));
        this.shell.cubeList.add(new ModelBox(shell, 11, 6, -1.0F, -2.4062F, 1.8142F, 2, 2, 3, 0.01F, false));
        this.shell.cubeList.add(new ModelBox(shell, 5, 17, -0.5F, -1.9062F, 4.8142F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.9062F, -0.1858F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 12, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

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
        this.body.offsetY = -1.8F;
        this.body.offsetX = 0.1F;
        this.body.rotateAngleY = (float)Math.toRadians(-68);
        this.body.rotateAngleX = (float)Math.toRadians(15);
        this.body.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 6.5F;
        this.body.scaleChildren = true;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.4F);
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
       // this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraCoelostylina ee = (EntityPrehistoricFloraCoelostylina) e;

        this.body.offsetZ = 0.13F;
        this.body.offsetX = 0.06F;
        this.tail.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.tail.setScaleZ(scaler*0.85F);
        //float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.3F);
        //this.tail.setScaleX(scaler2 * 0.95F);

        this.swing(eye1, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(eye2, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(eye1, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(eye2, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.eye1.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eye1.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.eye2.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.eye2.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

        this.cube_r1.scaleChildren = false;
        scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.body.setScaleZ(scaler);
        this.cube_r1.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.body.setScaleZ(scaler);
        this.cube_r1.setScaleX(scaler2 * 0.7F);
    }
}
