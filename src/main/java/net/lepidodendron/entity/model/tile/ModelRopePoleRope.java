package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelRopePoleRope extends ModelBase {
	private final ModelRenderer rope;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;

	public ModelRopePoleRope() {
		textureWidth = 16;
		textureHeight = 16;

		rope = new ModelRenderer(this);
		rope.setRotationPoint(1.0F, 24.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(6.4F, -14.5F, 8.0F);
		rope.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.7418F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.9F, 0.0F, -8.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.1309F);
		bone3.cubeList.add(new ModelBox(bone3, 7, 3, -8.5532F, -5.0886F, -0.5F, 3, 1, 1, -0.8F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.4F, 0.0F, 0.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.0873F);
		bone4.cubeList.add(new ModelBox(bone4, 7, 1, -8.9282F, -4.5F, -0.5F, 3, 1, 1, -0.8F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.3F, 0.0F, 0.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.1309F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 6, -9.491F, -3.5615F, -0.5F, 3, 1, 1, -0.8F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.4F, 0.0F, 8.0F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.1745F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 4, -9.9104F, -2.2315F, -8.5F, 3, 1, 1, -0.8F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.4F, 0.0F, 0.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 0.1309F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 2, -10.0696F, -1.1972F, -8.5F, 3, 1, 1, -0.8F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.4F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.0873F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, -10.1F, -0.5F, -8.5F, 3, 1, 1, -0.8F, false));
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