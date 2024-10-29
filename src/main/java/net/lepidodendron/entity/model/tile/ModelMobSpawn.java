package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMobSpawn extends ModelBase {
	private final ModelRenderer bone;

	public ModelMobSpawn() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(8.0F, 24.0F, -8.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 2, -4.0F, -2.0F, 4.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -7.0F, -2.0F, 12.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -4.0F, -2.0F, 13.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -14.0F, -2.0F, 13.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -7.0F, -2.0F, 3.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -4.0F, -2.0F, 1.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -8.0F, -2.0F, 1.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -13.0F, -2.0F, 3.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -10.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -11.0F, -2.0F, 4.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -8.0F, -2.0F, 7.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -13.0F, -2.0F, 11.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -15.0F, -2.0F, 8.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -13.0F, -2.5F, 9.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -9.0F, -2.5F, 8.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -8.0F, -2.5F, 4.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -10.0F, -2.5F, 3.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -12.0F, -2.5F, 2.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -2.5F, 5.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -3.0F, -2.5F, 8.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -6.0F, -2.5F, 11.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -9.0F, -3.0F, 11.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -12.0F, -3.0F, 10.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -7.0F, -3.0F, 8.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -3.0F, 9.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -9.0F, -3.0F, 5.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -6.0F, -3.0F, 1.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -11.0F, -3.0F, 6.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -11.0F, -2.5F, 12.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -12.0F, -2.5F, 7.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -2.0F, -2.0F, 10.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -4.0F, -2.0F, 7.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 2, -11.0F, -2.0F, 9.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void renderAll(float f) {
		bone.render(f);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}