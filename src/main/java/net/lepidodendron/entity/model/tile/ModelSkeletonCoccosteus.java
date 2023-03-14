package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCoccosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Tailfin2;
    private final AdvancedModelRenderer Tailfin1;
    private final AdvancedModelRenderer Analfin;
    private final AdvancedModelRenderer Tailunderside1;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Dorsalfin;
    private final AdvancedModelRenderer Head1;
    private final AdvancedModelRenderer Upperjaw1;
    private final AdvancedModelRenderer Upperjaw2;
    private final AdvancedModelRenderer Upperjawshears;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerjawshears;

    public ModelSkeletonCoccosteus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.setRotateAngle(root, 0.0F, 0.0F, 1.5708F);
        this.root.cubeList.add(new ModelBox(root, 0, 0, 1.0F, -11.0F, -8.0F, 1, 16, 16, -0.01F, false));
        this.root.cubeList.add(new ModelBox(root, 0, 0, 1.0F, -11.0F, -12.0F, 1, 16, 16, 0.01F, false));
        this.root.cubeList.add(new ModelBox(root, 0, 0, 1.0F, -27.0F, -13.0F, 1, 16, 16, -0.01F, false));
        this.root.cubeList.add(new ModelBox(root, 0, 0, 1.0F, -24.0F, -9.0F, 1, 16, 16, 0.0F, false));
        this.root.cubeList.add(new ModelBox(root, 0, 0, 1.0F, -40.0F, -12.0F, 1, 16, 16, 0.01F, false));
        this.root.cubeList.add(new ModelBox(root, 0, 0, 1.0F, 3.0F, -10.0F, 1, 16, 16, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.85F, 5.0F, -4.0F);
        this.root.addChild(Body1);
        this.setRotateAngle(Body1, 1.6556F, 0.0F, 0.0F);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -0.125F, -2.0F, -4.0F, 1, 9, 7, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 32, -0.025F, -2.0F, -4.0F, 0, 9, 7, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, -0.1061F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 32, 35, 0.0F, 0.0F, 0.0F, 0, 9, 6, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 32, 26, -0.1F, 0.0F, 0.0F, 1, 9, 6, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 2.3F, 5.3F);
        this.Body2.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0637F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 0, 43, -0.025F, -2.0F, -0.5F, 0, 8, 5, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.2F, 4.0F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0637F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 14, 36, 0.0F, -2.0F, -0.5F, 0, 6, 7, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.3F, 6.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.1061F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 40, 21, -0.025F, -2.0F, 0.0F, 0, 5, 6, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -0.7F, 5.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.2759F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 10, 43, 0.0F, -1.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 5.1F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.3183F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 18, 0, -0.025F, -1.0F, 0.0F, 0, 3, 7, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(-0.01F, -0.3F, 6.5F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.1911F, 0.0F, 0.0F);


        this.Tailfin2 = new AdvancedModelRenderer(this);
        this.Tailfin2.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Tail6.addChild(Tailfin2);
        this.Tailfin2.cubeList.add(new ModelBox(Tailfin2, 18, 0, 0.0F, 0.0F, 0.0F, 0, 5, 10, 0.0F, false));

        this.Tailfin1 = new AdvancedModelRenderer(this);
        this.Tailfin1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail5.addChild(Tailfin1);
        this.Tailfin1.cubeList.add(new ModelBox(Tailfin1, 34, 8, 0.0F, 0.0F, 0.0F, 0, 7, 7, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Tail3.addChild(Analfin);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 46, 28, 0.01F, 0.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Tailunderside1 = new AdvancedModelRenderer(this);
        this.Tailunderside1.setRotationPoint(0.0F, 5.7F, -0.3F);
        this.Tail2.addChild(Tailunderside1);
        this.setRotateAngle(Tailunderside1, 0.2335F, 0.0F, 0.0F);
        this.Tailunderside1.cubeList.add(new ModelBox(Tailunderside1, 38, 6, 0.11F, -2.0F, 0.0F, 0, 2, 7, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(-0.5F, -0.5F, 1.0F);
        this.Tailunderside1.addChild(Leftpelvicfin);


        this.Dorsalfin = new AdvancedModelRenderer(this);
        this.Dorsalfin.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.Tail2.addChild(Dorsalfin);
        this.Dorsalfin.cubeList.add(new ModelBox(Dorsalfin, 0, 23, 0.0F, -7.0F, 0.0F, 0, 7, 9, 0.0F, false));

        this.Head1 = new AdvancedModelRenderer(this);
        this.Head1.setRotationPoint(0.0F, -2.0F, -3.9F);
        this.Body1.addChild(Head1);
        this.setRotateAngle(Head1, 0.2546F, 0.0F, 0.0F);
        this.Head1.cubeList.add(new ModelBox(Head1, 38, 0, -0.1F, 0.0F, -6.0F, 1, 7, 6, 0.0F, false));

        this.Upperjaw1 = new AdvancedModelRenderer(this);
        this.Upperjaw1.setRotationPoint(0.0F, 5.05F, -6.0F);
        this.Head1.addChild(Upperjaw1);
        this.setRotateAngle(Upperjaw1, -0.1061F, 0.0F, 0.0F);
        this.Upperjaw1.cubeList.add(new ModelBox(Upperjaw1, 25, 47, -0.125F, -5.0F, -3.0F, 1, 4, 3, 0.0F, false));

        this.Upperjaw2 = new AdvancedModelRenderer(this);
        this.Upperjaw2.setRotationPoint(0.0F, -4.9F, -3.0F);
        this.Upperjaw1.addChild(Upperjaw2);
        this.setRotateAngle(Upperjaw2, 0.8702F, 0.0F, 0.0F);
        this.Upperjaw2.cubeList.add(new ModelBox(Upperjaw2, 44, 44, -0.09F, 0.0F, -3.0F, 1, 7, 3, 0.0F, false));

        this.Upperjawshears = new AdvancedModelRenderer(this);
        this.Upperjawshears.setRotationPoint(0.0F, 0.5F, -2.6F);
        this.Upperjaw2.addChild(Upperjawshears);
        this.setRotateAngle(Upperjawshears, 0.2759F, 0.0F, 0.0F);
        this.Upperjawshears.cubeList.add(new ModelBox(Upperjawshears, 0, 0, 0.025F, 0.0F, -2.0F, 1, 5, 2, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 7.1F, -6.0F);
        this.Head1.addChild(Throat);
        this.setRotateAngle(Throat, -0.3821F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 46, 0, -0.025F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(-0.01F, 6.2F, -5.6F);
        this.Head1.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.3538F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 18, 0, -0.1F, 0.0F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Lowerjawshears = new AdvancedModelRenderer(this);
        this.Lowerjawshears.setRotationPoint(0.0F, 0.0F, -5.7F);
        this.Lowerjaw.addChild(Lowerjawshears);
        this.setRotateAngle(Lowerjawshears, -0.0848F, 0.0F, 0.0F);
        this.Lowerjawshears.cubeList.add(new ModelBox(Lowerjawshears, 26, 0, 0.05F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
