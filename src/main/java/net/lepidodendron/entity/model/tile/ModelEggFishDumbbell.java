package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEggFishDumbbell extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;

	public ModelEggFishDumbbell() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(8.0F, 24.0F, -8.0F);
		bone.cubeList.add(new ModelBox(bone, 6, 9, -8.5F, -11.0F, 7.5F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 3, -10.0F, -8.0F, 6.0F, 4, 2, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 2, 5, -9.5F, -6.0F, 6.5F, 3, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 9, -9.0F, -5.0F, 7.0F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 7, 14, -8.5F, -4.0F, 7.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 11, -8.0F, -3.0F, 7.5F, 0, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 5, -9.5F, -9.0F, 6.5F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 4, 6, -9.0F, -10.0F, 7.0F, 2, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-8.0F, -11.0F, 7.5F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 12, 0.0F, -0.4F, -0.85F, 0, 2, 2, 0.0F, false));
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