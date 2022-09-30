// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer finger1;
	private final ModelRenderer finger1_b;
	private final ModelRenderer finger2;
	private final ModelRenderer finger1_b2;
	private final ModelRenderer finger3;
	private final ModelRenderer finger1_b3;
	private final ModelRenderer bb_main;

	public custom_model() {
		textureWidth = 16;
		textureHeight = 16;

		finger1 = new ModelRenderer(this);
		finger1.setRotationPoint(1.16F, 14.0F, 0.0F);
		setRotationAngle(finger1, -0.3927F, -1.5708F, 0.0F);
		finger1.cubeList.add(new ModelBox(finger1, 6, 5, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

		finger1_b = new ModelRenderer(this);
		finger1_b.setRotationPoint(-0.66F, 4.0F, 0.0F);
		finger1.addChild(finger1_b);
		setRotationAngle(finger1_b, 0.6981F, 0.0F, 0.0F);
		finger1_b.cubeList.add(new ModelBox(finger1_b, 5, 7, 0.16F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		finger2 = new ModelRenderer(this);
		finger2.setRotationPoint(-0.84F, 14.0F, 1.0F);
		setRotationAngle(finger2, -0.3927F, 2.618F, 0.0F);
		finger2.cubeList.add(new ModelBox(finger2, 6, 5, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

		finger1_b2 = new ModelRenderer(this);
		finger1_b2.setRotationPoint(0.0F, 4.0F, 0.0F);
		finger2.addChild(finger1_b2);
		setRotationAngle(finger1_b2, 0.6981F, 0.0F, 0.0F);
		finger1_b2.cubeList.add(new ModelBox(finger1_b2, 6, 6, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		finger3 = new ModelRenderer(this);
		finger3.setRotationPoint(-0.84F, 14.0F, -1.0F);
		setRotationAngle(finger3, -0.3927F, 0.5236F, 0.0F);
		finger3.cubeList.add(new ModelBox(finger3, 5, 5, -0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F, false));

		finger1_b3 = new ModelRenderer(this);
		finger1_b3.setRotationPoint(0.0F, 4.0F, 0.0F);
		finger3.addChild(finger1_b3);
		setRotationAngle(finger1_b3, 0.6981F, 0.0F, 0.0F);
		finger1_b3.cubeList.add(new ModelBox(finger1_b3, 5, 7, -0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 7, -1.0F, -12.0F, -1.0F, 2, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 6, 5, -0.5F, -14.0F, -0.5F, 1, 3, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		finger1.render(f5);
		finger2.render(f5);
		finger3.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}