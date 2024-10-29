package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEggFishPiles extends ModelBase {
	private final ModelRenderer bone;

	public ModelEggFishPiles() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(8.0F, 24.0F, -8.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 2, -6.0F, -1.0F, 3.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 14, -9.5F, -2.0F, 6.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 6, -8.0F, -1.0F, 5.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -8.5F, -2.0F, 8.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 9, 11, -5.0F, -1.0F, 10.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 1, 2, -11.5F, -2.0F, 4.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 9, -12.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -11.5F, -2.0F, 7.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 6, -12.0F, -1.0F, 4.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -4.5F, -2.0F, 10.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 11, 7, -9.0F, -1.0F, 8.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 4, -7.5F, -2.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 11, 3, -10.0F, -1.0F, 6.0F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 9, -5.5F, -2.0F, 3.5F, 1, 1, 1, 0.0F, false));
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