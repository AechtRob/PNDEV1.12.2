package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNagini extends ModelBasePalaeopedia {


    public ModelNagini() {
        //Model here

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.Bodyfront.render(f5 * 0.15F);
    }

    public void renderStatic(float f) {
        //Static renderer for taxidermy
    }
    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //stuff here
    }
}
