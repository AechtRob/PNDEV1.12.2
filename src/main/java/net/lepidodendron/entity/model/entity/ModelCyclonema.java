package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCyclonema extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer eye1;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer shell;

    public ModelCyclonema() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, 0.5F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, 0.0F, -2.0F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 8, -1.0F, -0.25F, -1.45F, 2, 1, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(1.0F, 1.0F, 2.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 7, 5, -2.0F, -0.99F, -0.5F, 2, 1, 1, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -1.5F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));

        this.eye1 = new AdvancedModelRenderer(this);
        this.eye1.setRotationPoint(0.5F, 0.25F, -2.5F);
        this.body.addChild(eye1);
        this.setRotateAngle(eye1, 1.0472F, 0.0F, 0.1745F);
        this.eye1.cubeList.add(new ModelBox(eye1, 6, 11, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.5F, 0.25F, -2.5F);
        this.body.addChild(eye2);
        this.setRotateAngle(eye2, 1.0472F, 0.0F, -0.1745F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 4, 0.0F, -1.75F, -0.5F, 0, 2, 1, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 0.0F, 0.1309F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 5, -1.0F, -3.0F, -1.5F, 2, 3, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 10, 0, -2.0F, -2.75F, -0.75F, 1, 2, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 2, -2.75F, -2.5F, 0.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5 * 0.4F);
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
        this.body.offsetY = 0.9F;

        this.swing(eye1, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);
        this.swing(eye2, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.walk(eye1, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.walk(eye2, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);

    }
}
