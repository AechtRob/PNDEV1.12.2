package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelEggSmall extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer shape1;
    private final ModelRenderer shape1a;
    private final ModelRenderer shape1b;
    private final ModelRenderer shape1c;
    private final ModelRenderer shape1d;
    private final ModelRenderer shape1e;
    private final ModelRenderer shape1f;
    private final ModelRenderer shape1g;
    private final ModelRenderer shape1h;
    private final ModelRenderer shape1i;
    private final ModelRenderer shape1j;
    private final ModelRenderer shape1k;
    private final ModelRenderer shape1l;

    public ModelEggSmall() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.shape1 = new ModelRenderer(this);
        this.shape1.setRotationPoint(0.0F, 23.2F, 0.0F);
        this.root.addChild(shape1);
        this.setRotateAngle(shape1, 0.182F, 0.0F, 0.0F);
        this.shape1.cubeList.add(new ModelBox(shape1, 0, 8, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1a = new ModelRenderer(this);
        this.shape1a.setRotationPoint(0.9F, 23.2F, -0.7F);
        this.root.addChild(shape1a);
        this.setRotateAngle(shape1a, 0.0F, 0.2276F, 0.1367F);
        this.shape1a.cubeList.add(new ModelBox(shape1a, 3, 7, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1b = new ModelRenderer(this);
        this.shape1b.setRotationPoint(-0.2F, 23.0F, -1.0F);
        this.root.addChild(shape1b);
        this.setRotateAngle(shape1b, 0.0F, -0.8652F, 0.0F);
        this.shape1b.cubeList.add(new ModelBox(shape1b, 6, 6, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1c = new ModelRenderer(this);
        this.shape1c.setRotationPoint(-0.6F, 23.3F, 1.4F);
        this.root.addChild(shape1c);
        this.setRotateAngle(shape1c, 0.2731F, -0.5381F, 0.0911F);
        this.shape1c.cubeList.add(new ModelBox(shape1c, 6, 4, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1d = new ModelRenderer(this);
        this.shape1d.setRotationPoint(0.9F, 23.0F, 1.0F);
        this.root.addChild(shape1d);
        this.setRotateAngle(shape1d, -0.1367F, 0.182F, 0.0F);
        this.shape1d.cubeList.add(new ModelBox(shape1d, 6, 2, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1e = new ModelRenderer(this);
        this.shape1e.setRotationPoint(-1.7F, 23.4F, 0.0F);
        this.root.addChild(shape1e);
        this.setRotateAngle(shape1e, 0.0F, -0.4554F, 0.0911F);
        this.shape1e.cubeList.add(new ModelBox(shape1e, 6, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1f = new ModelRenderer(this);
        this.shape1f.setRotationPoint(2.4F, 23.3F, 0.6F);
        this.root.addChild(shape1f);
        this.shape1f.cubeList.add(new ModelBox(shape1f, 0, 6, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1g = new ModelRenderer(this);
        this.shape1g.setRotationPoint(2.9F, 23.0F, -0.6F);
        this.root.addChild(shape1g);
        this.setRotateAngle(shape1g, 0.0F, -0.7285F, 0.0F);
        this.shape1g.cubeList.add(new ModelBox(shape1g, 3, 5, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1h = new ModelRenderer(this);
        this.shape1h.setRotationPoint(0.0F, 23.2F, 2.4F);
        this.root.addChild(shape1h);
        this.setRotateAngle(shape1h, 0.0F, -0.2731F, 0.3187F);
        this.shape1h.cubeList.add(new ModelBox(shape1h, 0, 4, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1i = new ModelRenderer(this);
        this.shape1i.setRotationPoint(-1.8F, 23.2F, -1.5F);
        this.root.addChild(shape1i);
        this.shape1i.cubeList.add(new ModelBox(shape1i, 3, 3, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1j = new ModelRenderer(this);
        this.shape1j.setRotationPoint(2.3F, 23.0F, 2.3F);
        this.root.addChild(shape1j);
        this.setRotateAngle(shape1j, 0.0F, -0.7741F, 0.0F);
        this.shape1j.cubeList.add(new ModelBox(shape1j, 3, 1, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1k = new ModelRenderer(this);
        this.shape1k.setRotationPoint(-1.3F, 23.0F, 2.4F);
        this.root.addChild(shape1k);
        this.shape1k.cubeList.add(new ModelBox(shape1k, 0, 2, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.shape1l = new ModelRenderer(this);
        this.shape1l.setRotationPoint(-1.6F, 23.0F, -3.0F);
        this.root.addChild(shape1l);
        this.setRotateAngle(shape1l, 0.0F, -0.4098F, 0.0F);
        this.shape1l.cubeList.add(new ModelBox(shape1l, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
    }

    public void renderAll(float f) {
        this.root.render(f);
    }

    public void renderAllRaised(float f) {
        this.root.offsetY = -1.50F;
        this.root.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
