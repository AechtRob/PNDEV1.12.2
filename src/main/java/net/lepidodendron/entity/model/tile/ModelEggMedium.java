package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelEggMedium extends ModelBase {
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

    public ModelEggMedium() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.shape1 = new ModelRenderer(this);
        this.shape1.setRotationPoint(0.0F, 23.2F, 0.0F);
        this.root.addChild(shape1);
        this.setRotateAngle(shape1, 0.0F, -0.5918F, 1.3203F);
        this.shape1.cubeList.add(new ModelBox(shape1, 3, 7, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1a = new ModelRenderer(this);
        this.shape1a.setRotationPoint(3.2F, 23.2F, 0.0F);
        this.root.addChild(shape1a);
        this.setRotateAngle(shape1a, 1.639F, -0.2276F, 0.0F);
        this.shape1.cubeList.add(new ModelBox(shape1a, 8, 10, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1b = new ModelRenderer(this);
        this.shape1b.setRotationPoint(-4.0F, 23.5F, 0.0F);
        this.root.addChild(shape1b);
        this.setRotateAngle(shape1b, 1.3203F, -2.7773F, 0.0F);
        this.shape1b.cubeList.add(new ModelBox(shape1b, 8, 5, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1c = new ModelRenderer(this);
        this.shape1c.setRotationPoint(-2.0F, 23.8F, 3.6F);
        this.root.addChild(shape1c);
        this.setRotateAngle(shape1c, 0.1367F, -0.5918F, -0.0911F);
        this.shape1c.cubeList.add(new ModelBox(shape1c, 8, 10, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1d = new ModelRenderer(this);
        this.shape1d.setRotationPoint(1.2F, 23.0F, -3.0F);
        this.root.addChild(shape1d);
        this.setRotateAngle(shape1d, 1.5935F, -1.0016F, -0.3643F);
        this.shape1d.cubeList.add(new ModelBox(shape1d, 0, 10, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1e = new ModelRenderer(this);
        this.shape1e.setRotationPoint(1.2F, 23.0F, 2.8F);
        this.root.addChild(shape1e);
        this.setRotateAngle(shape1e, 0.0F, 0.1367F, 0.2731F);
        this.shape1e.cubeList.add(new ModelBox(shape1e, 8, 5, -1.0F, -1.4F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1f = new ModelRenderer(this);
        this.shape1f.setRotationPoint(-1.9F, 23.5F, -3.0F);
        this.root.addChild(shape1f);
        this.setRotateAngle(shape1f, 1.5935F, 0.5009F, 0.0F);
        this.shape1f.cubeList.add(new ModelBox(shape1f, 8, 0, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1g = new ModelRenderer(this);
        this.shape1g.setRotationPoint(3.6F, 23.6F, 4.6F);
        this.root.addChild(shape1g);
        this.setRotateAngle(shape1g, 0.6829F, 0.0911F, -1.7301F);
        this.shape1g.cubeList.add(new ModelBox(shape1g, 0, 5, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.shape1h = new ModelRenderer(this);
        this.shape1h.setRotationPoint(5.6F, 23.5F, 1.4F);
        this.root.addChild(shape1h);
        this.setRotateAngle(shape1h, -1.5026F, 0.2731F, -0.2276F);
        this.shape1h.cubeList.add(new ModelBox(shape1h, 0, 0, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

    }

    public void renderAll(float f) {
        this.root.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
