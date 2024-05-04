package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelTimeResearcherHopperCrusher extends AdvancedModelBase {
    private final ModelRenderer grinder;
    public final ModelRenderer grinder1;
    public final ModelRenderer grinder2;
    public final ModelRenderer grinder3;

    public ModelTimeResearcherHopperCrusher() {
        textureWidth = 36;
        textureHeight = 22;

        grinder = new ModelRenderer(this);
        grinder.setRotationPoint(0.0F, 22.0F, 0.0F);


        grinder1 = new ModelRenderer(this);
        grinder1.setRotationPoint(2.5F, -8.0F, 0.0F);
        grinder.addChild(grinder1);
        setRotationAngle(grinder1, 0.0F, 0.0F, 0.7854F);
        grinder1.cubeList.add(new ModelBox(grinder1, 0, 0, -1.0F, -1.0F, -7.5F, 2, 2, 15, 0.0F, false));
        grinder1.cubeList.add(new ModelBox(grinder1, 4, 0, -2.0F, 0.0F, -7.5F, 1, 0, 15, 0.0F, false));
        grinder1.cubeList.add(new ModelBox(grinder1, 6, 0, 1.0F, 0.0F, -7.5F, 1, 0, 15, 0.0F, false));
        grinder1.cubeList.add(new ModelBox(grinder1, 4, 2, 0.0F, -2.0F, -7.5F, 0, 1, 15, 0.0F, false));
        grinder1.cubeList.add(new ModelBox(grinder1, 4, 3, 0.0F, 1.0F, -7.5F, 0, 1, 15, 0.0F, false));

        grinder2 = new ModelRenderer(this);
        grinder2.setRotationPoint(-2.5F, -8.0F, 0.0F);
        grinder.addChild(grinder2);
        setRotationAngle(grinder2, 0.0F, 0.0F, 0.7854F);
        grinder2.cubeList.add(new ModelBox(grinder2, 0, 0, -1.0F, -1.0F, -7.5F, 2, 2, 15, 0.0F, false));
        grinder2.cubeList.add(new ModelBox(grinder2, 4, 0, 1.0F, 0.0F, -7.5F, 1, 0, 15, 0.0F, false));
        grinder2.cubeList.add(new ModelBox(grinder2, 4, 0, -2.0F, 0.0F, -7.5F, 1, 0, 15, 0.0F, false));
        grinder2.cubeList.add(new ModelBox(grinder2, 4, 2, 0.0F, -2.0F, -7.5F, 0, 1, 15, 0.0F, false));
        grinder2.cubeList.add(new ModelBox(grinder2, 4, 2, 0.0F, 1.0F, -7.5F, 0, 1, 15, 0.0F, false));

        grinder3 = new ModelRenderer(this);
        grinder3.setRotationPoint(0.0F, -6.0F, 0.0F);
        grinder.addChild(grinder3);
        setRotationAngle(grinder3, 0.0F, 0.0F, 0.7854F);
        grinder3.cubeList.add(new ModelBox(grinder3, 0, 0, -1.0F, -1.0F, -7.5F, 2, 2, 15, 0.0F, false));
        grinder3.cubeList.add(new ModelBox(grinder3, 6, 0, 1.0F, 0.0F, -7.5F, 1, 0, 15, 0.0F, false));
        grinder3.cubeList.add(new ModelBox(grinder3, 4, 0, -2.0F, 0.0F, -7.5F, 1, 0, 15, 0.0F, false));
        grinder3.cubeList.add(new ModelBox(grinder3, 4, 3, 0.0F, -2.0F, -7.5F, 0, 1, 15, 0.0F, false));
        grinder3.cubeList.add(new ModelBox(grinder3, 4, 3, 0.0F, 1.0F, -7.5F, 0, 1, 15, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        grinder.render(f);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
