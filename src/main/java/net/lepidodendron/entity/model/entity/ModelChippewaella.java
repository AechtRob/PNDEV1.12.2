package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraChippewaella;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChippewaella extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer nose;

    public ModelChippewaella() {
        this.textureWidth = 25;
        this.textureHeight = 25;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, 23.0F, -2.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.0F, 0.0F, -2.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 6, -0.5F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 8, -0.5F, -1.25F, -1.45F, 2, 2, 3, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.5F, -1.7801F, 0.7592F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, -0.1745F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.5F, 1.2801F, -3.4842F, 7, 0, 6, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 6, -2.0F, 0.2301F, -2.4592F, 4, 1, 4, 0.1F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 16, -1.0F, -0.5199F, -1.2092F, 2, 1, 2, 0.1F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.1189F, 0.9652F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -0.5F, 0.0F, 0.525F, 1, 1, 1, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 8, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0507F, -0.9899F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.6545F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.7134F, 0.386F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 5, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0507F, -0.9899F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2443F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 12, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.5F, 1.0F, 2.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 3, -2.0F, -0.99F, -0.5F, 2, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 7, -1.5F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(1.25F, 0.25F, -2.5F);
        this.body.addChild(eye1);
        this.setRotateAngle(eye1, 1.0472F, 0.0F, 0.1745F);
        this.eye1.cubeList.add(new ModelBox(eye1, 4, 0, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.25F, 0.25F, -2.5F);
        this.body.addChild(eye2);
        this.setRotateAngle(eye2, 1.0472F, 0.0F, -0.1745F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 0, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.5F, -1.5F, 0.25F);
        this.body.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 11, 13, -0.5F, 0.0412F, -4.0566F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5);
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

        EntityPrehistoricFloraChippewaella ee = (EntityPrehistoricFloraChippewaella) e;

        this.body.offsetZ = 0.13F;
        this.tail.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.tail.setScaleZ(scaler*0.85F);
        //float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.3F);
        //this.tail.setScaleX(scaler2 * 0.85F);

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
        this.cube_r2.setScaleZ(scaler);
        this.cube_r3.setScaleZ(scaler);
        this.cube_r4.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.body.setScaleZ(scaler);
        this.cube_r1.setScaleX(scaler2 * 0.7F);
        this.cube_r2.setScaleX(scaler2 * 0.7F);
        this.cube_r3.setScaleX(scaler2 * 0.7F);
        this.cube_r4.setScaleX(scaler2 * 0.7F);
    }
}
