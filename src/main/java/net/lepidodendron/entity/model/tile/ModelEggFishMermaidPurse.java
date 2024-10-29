package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEggFishMermaidPurse extends ModelBase {
	private final ModelRenderer main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelEggFishMermaidPurse() {
		textureWidth = 16;
		textureHeight = 16;

		main = new ModelRenderer(this);
		main.setRotationPoint(8.0F, 24.0F, -8.0F);
		main.cubeList.add(new ModelBox(main, 0, 0, -11.0F, -10.0F, 7.0F, 5, 7, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-10.5F, -11.5F, 7.5F);
		main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 0, 0.25F, -1.5F, -0.49F, 1, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.5F, -11.5F, 7.5F);
		main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.25F, -1.5F, -0.49F, 1, 3, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-10.5F, -1.5F, 7.5F);
		main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 10, 0.25F, -1.5F, -0.49F, 1, 3, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.5F, -1.5F, 7.5F);
		main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -1.25F, -1.5F, -0.49F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		main.render(f5);
	}

	public void renderAll(float f) {
		main.render(f);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}