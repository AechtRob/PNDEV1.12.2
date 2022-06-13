package net.lepidodendron.entity.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelNest extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer nestmiddle;
    private final ModelRenderer slope1;
    private final ModelRenderer slope2;
    private final ModelRenderer bone;
    private final ModelRenderer slope3;
    private final ModelRenderer bone2;
    private final ModelRenderer slope4;
    private final ModelRenderer rim1;
    private final ModelRenderer rimslope1;
    private final ModelRenderer rimslope2;
    private final ModelRenderer rim4;
    private final ModelRenderer rimslope7;
    private final ModelRenderer rimslope8;
    private final ModelRenderer rim3;
    private final ModelRenderer rimslope5;
    private final ModelRenderer rimslope6;
    private final ModelRenderer rim2;
    private final ModelRenderer rimslope3;
    private final ModelRenderer rimslope4;

    public ModelNest() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.root = new ModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.nestmiddle = new ModelRenderer(this);
        this.nestmiddle.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.root.addChild(nestmiddle);
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 0, 7, 2.5F, -2.0F, -5.5F, 3, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 0, 5, -0.5F, -2.0F, -5.5F, 3, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 0, 4, -3.5F, -2.0F, -5.5F, 3, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 1, 8, -5.5F, -2.0F, -0.5F, 2, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 0, 3, 2.5F, -2.0F, -0.5F, 3, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 0, 4, -0.5F, -2.0F, -0.5F, 3, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 0, 1, -3.5F, -2.0F, -0.5F, 3, 2, 5, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 4, 6, 2.5F, -2.0F, 4.5F, 3, 2, 1, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 5, 2, -0.5F, -2.0F, 4.5F, 3, 2, 1, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 4, 12, -3.5F, -2.0F, 4.5F, 3, 2, 1, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 7, 2, -5.5F, -2.0F, 4.5F, 2, 2, 1, 0.0F, false));
        this.nestmiddle.cubeList.add(new ModelBox(nestmiddle, 1, 8, -5.5F, -2.0F, -5.5F, 2, 2, 5, 0.0F, false));

        this.slope1 = new ModelRenderer(this);
        this.slope1.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.nestmiddle.addChild(slope1);
        this.setRotateAngle(slope1, 0.5463F, 0.0F, 0.0F);
        this.slope1.cubeList.add(new ModelBox(slope1, 0, 8, -1.5F, -4.07F, -3.0F, 5, 4, 3, 0.0F, false));
        this.slope1.cubeList.add(new ModelBox(slope1, 6, 9, -3.5F, -4.07F, -3.0F, 2, 4, 3, 0.0F, false));

        this.slope2 = new ModelRenderer(this);
        this.slope2.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.nestmiddle.addChild(slope2);
        this.setRotateAngle(slope2, -0.5463F, 0.0F, 0.0F);
        this.slope2.cubeList.add(new ModelBox(slope2, 0, 8, -1.5F, -4.07F, 0.0F, 5, 4, 3, 0.0F, false));
        this.slope2.cubeList.add(new ModelBox(slope2, 6, 9, -3.5F, -4.07F, 0.0F, 2, 4, 3, 0.0F, false));

        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nestmiddle.addChild(bone);
        this.setRotateAngle(bone, 0.0F, -1.5708F, 0.0F);


        this.slope3 = new ModelRenderer(this);
        this.slope3.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.bone.addChild(slope3);
        this.setRotateAngle(slope3, -0.5463F, 0.0F, 0.0F);
        this.slope3.cubeList.add(new ModelBox(slope3, 0, 4, -1.5F, -4.07F, 0.0F, 5, 4, 3, 0.0F, false));
        this.slope3.cubeList.add(new ModelBox(slope3, 0, 3, -3.5F, -4.07F, 0.0F, 2, 4, 3, 0.0F, false));

        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nestmiddle.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 1.5708F, 0.0F);


        this.slope4 = new ModelRenderer(this);
        this.slope4.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.bone2.addChild(slope4);
        this.setRotateAngle(slope4, -0.5463F, 0.0F, 0.0F);
        this.slope4.cubeList.add(new ModelBox(slope4, 0, 8, -3.5F, -4.07F, 0.0F, 5, 4, 3, 0.0F, true));
        this.slope4.cubeList.add(new ModelBox(slope4, 6, 9, 1.5F, -4.07F, 0.0F, 2, 4, 3, 0.0F, true));

        this.rim1 = new ModelRenderer(this);
        this.rim1.setRotationPoint(-5.3F, 0.61F, 5.3F);
        this.nestmiddle.addChild(rim1);
        this.setRotateAngle(rim1, 0.0F, -0.7854F, 0.0F);
        this.rim1.cubeList.add(new ModelBox(rim1, 0, 6, -3.0F, -4.0F, -1.0F, 6, 4, 1, 0.0F, false));

        this.rimslope1 = new ModelRenderer(this);
        this.rimslope1.setRotationPoint(0.0F, -3.8F, -1.0F);
        this.rim1.addChild(rimslope1);
        this.setRotateAngle(rimslope1, -0.9561F, 0.0F, 0.0F);
        this.rimslope1.cubeList.add(new ModelBox(rimslope1, 0, 5, -3.5F, 0.07F, 0.0F, 7, 3, 1, 0.0F, false));

        this.rimslope2 = new ModelRenderer(this);
        this.rimslope2.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rim1.addChild(rimslope2);
        this.setRotateAngle(rimslope2, 0.5918F, 0.0F, 0.0F);
        this.rimslope2.cubeList.add(new ModelBox(rimslope2, 0, 0, -3.5F, 0.0F, -1.0F, 7, 3, 1, 0.0F, false));

        this.rim4 = new ModelRenderer(this);
        this.rim4.setRotationPoint(-5.3F, 0.61F, -5.3F);
        this.nestmiddle.addChild(rim4);
        this.setRotateAngle(rim4, 0.0F, 0.7854F, 0.0F);
        this.rim4.cubeList.add(new ModelBox(rim4, 1, 3, -3.0F, -4.0F, 0.0F, 6, 4, 1, 0.0F, false));

        this.rimslope7 = new ModelRenderer(this);
        this.rimslope7.setRotationPoint(0.0F, -3.8F, 1.0F);
        this.rim4.addChild(rimslope7);
        this.setRotateAngle(rimslope7, 0.9561F, 0.0F, 0.0F);
        this.rimslope7.cubeList.add(new ModelBox(rimslope7, 0, 6, -3.5F, 0.07F, -1.0F, 7, 3, 1, 0.0F, false));

        this.rimslope8 = new ModelRenderer(this);
        this.rimslope8.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rim4.addChild(rimslope8);
        this.setRotateAngle(rimslope8, -0.5918F, 0.0F, 0.0F);
        this.rimslope8.cubeList.add(new ModelBox(rimslope8, 0, 0, -3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F, false));

        this.rim3 = new ModelRenderer(this);
        this.rim3.setRotationPoint(5.3F, 0.61F, 5.3F);
        this.nestmiddle.addChild(rim3);
        this.setRotateAngle(rim3, 0.0F, 0.7854F, 0.0F);
        this.rim3.cubeList.add(new ModelBox(rim3, 0, 0, -3.0F, -4.0F, -1.0F, 6, 4, 1, 0.0F, false));

        this.rimslope5 = new ModelRenderer(this);
        this.rimslope5.setRotationPoint(0.0F, -3.8F, -1.0F);
        this.rim3.addChild(rimslope5);
        this.setRotateAngle(rimslope5, -0.9561F, 0.0F, 0.0F);
        this.rimslope5.cubeList.add(new ModelBox(rimslope5, 0, 0, -3.5F, 0.07F, 0.0F, 7, 3, 1, 0.0F, false));

        this.rimslope6 = new ModelRenderer(this);
        this.rimslope6.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rim3.addChild(rimslope6);
        this.setRotateAngle(rimslope6, 0.5918F, 0.0F, 0.0F);
        this.rimslope6.cubeList.add(new ModelBox(rimslope6, 0, 12, -3.5F, 0.0F, -1.0F, 7, 3, 1, 0.0F, false));

        this.rim2 = new ModelRenderer(this);
        this.rim2.setRotationPoint(5.3F, 0.61F, -5.3F);
        this.nestmiddle.addChild(rim2);
        this.setRotateAngle(rim2, 0.0F, -0.7854F, 0.0F);
        this.rim2.cubeList.add(new ModelBox(rim2, 0, 4, -3.0F, -4.0F, 0.0F, 6, 4, 1, 0.0F, false));

        this.rimslope3 = new ModelRenderer(this);
        this.rimslope3.setRotationPoint(0.0F, -3.8F, 1.0F);
        this.rim2.addChild(rimslope3);
        this.setRotateAngle(rimslope3, 0.9561F, 0.0F, 0.0F);
        this.rimslope3.cubeList.add(new ModelBox(rimslope3, 0, 0, -3.5F, 0.07F, -1.0F, 7, 3, 1, 0.0F, false));

        this.rimslope4 = new ModelRenderer(this);
        this.rimslope4.setRotationPoint(0.0F, -3.05F, 0.0F);
        this.rim2.addChild(rimslope4);
        this.setRotateAngle(rimslope4, -0.5918F, 0.0F, 0.0F);
        this.rimslope4.cubeList.add(new ModelBox(rimslope4, 0, 12, -3.5F, 0.0F, 0.0F, 7, 3, 1, 0.0F, false));
    }

    public void renderAll(float f) {
        root.render(f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
