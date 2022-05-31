package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelRopePoleRopeEnd extends ModelBase {
	private final ModelRenderer rope;
	private final ModelRenderer bone2;

	public ModelRopePoleRopeEnd() {
		textureWidth = 16;
		textureHeight = 16;

		rope = new ModelRenderer(this);
		rope.setRotationPoint(-7.0F, 24.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(6.4F, -14.5F, 8.0F);
		rope.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.7418F);
		bone2.cubeList.add(new ModelBox(bone2, 4, 7, -1.5F, -0.5F, -8.5F, 3, 1, 1, -0.7F, false));
	}

	public void renderAll(float f) {
		rope.render(f);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}