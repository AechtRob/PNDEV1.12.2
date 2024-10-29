package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEggFishTube extends ModelBase {
	private final ModelRenderer group;

	public ModelEggFishTube() {
		textureWidth = 24;
		textureHeight = 16;

		group = new ModelRenderer(this);
		group.setRotationPoint(8.0F, 8.0F, -8.0F);
		group.cubeList.add(new ModelBox(group, 12, 4, -9.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 9, 0, -9.0F, 10.0F, 7.0F, 1, 1, 1, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 12, 0, -9.5F, 1.0F, 6.5F, 2, 2, 2, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 6, 8, -9.5F, 8.0F, 6.5F, 2, 2, 2, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 0, -10.0F, 3.0F, 6.0F, 3, 5, 3, 0.0F, false));
		group.cubeList.add(new ModelBox(group, 0, 5, -8.5F, 11.0F, 6.0F, 0, 5, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		group.render(f5);
	}

	public void renderAll(float f) {
		group.render(f);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}