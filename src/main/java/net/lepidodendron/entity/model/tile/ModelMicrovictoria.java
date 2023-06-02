package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelMicrovictoria extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer petal6;
    private final AdvancedModelRenderer petalbone6;
    private final AdvancedModelRenderer petal5;
    private final AdvancedModelRenderer petalbone5;
    private final AdvancedModelRenderer petal4;
    private final AdvancedModelRenderer petalbone4;
    private final AdvancedModelRenderer petal3;
    private final AdvancedModelRenderer petalbone3;
    private final AdvancedModelRenderer petal2;
    private final AdvancedModelRenderer petalbone2;
    private final AdvancedModelRenderer petal;
    private final AdvancedModelRenderer petalbone;

    public ModelMicrovictoria() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -3.0F, -1.0F, 2, 2, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 5, 5, -0.5F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 6, -0.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, -1, 8, -0.5F, -3.025F, -0.5F, 1, 0, 1, 0.0F, false));

        this.petal6 = new AdvancedModelRenderer(this);
        this.petal6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal6);
        this.setRotateAngle(petal6, 0.0F, 1.0472F, 0.0F);


        this.petalbone6 = new AdvancedModelRenderer(this);
        this.petalbone6.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.petal6.addChild(petalbone6);
        this.setRotateAngle(petalbone6, 0.0F, 0.0F, -0.1745F);
        this.petalbone6.cubeList.add(new ModelBox(petalbone6, 0, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.petalbone6.cubeList.add(new ModelBox(petalbone6, 5, 0, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.petal5 = new AdvancedModelRenderer(this);
        this.petal5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal5);
        this.setRotateAngle(petal5, 0.0F, 2.0944F, 0.0F);


        this.petalbone5 = new AdvancedModelRenderer(this);
        this.petalbone5.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.petal5.addChild(petalbone5);
        this.setRotateAngle(petalbone5, 0.0F, 0.0F, -0.1745F);
        this.petalbone5.cubeList.add(new ModelBox(petalbone5, 0, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.petalbone5.cubeList.add(new ModelBox(petalbone5, 5, 0, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.petal4 = new AdvancedModelRenderer(this);
        this.petal4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal4);
        this.setRotateAngle(petal4, 0.0F, 3.1416F, 0.0F);


        this.petalbone4 = new AdvancedModelRenderer(this);
        this.petalbone4.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.petal4.addChild(petalbone4);
        this.setRotateAngle(petalbone4, 0.0F, 0.0F, -0.1745F);
        this.petalbone4.cubeList.add(new ModelBox(petalbone4, 0, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.petalbone4.cubeList.add(new ModelBox(petalbone4, 5, 0, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.petal3 = new AdvancedModelRenderer(this);
        this.petal3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal3);
        this.setRotateAngle(petal3, 0.0F, -2.0944F, 0.0F);


        this.petalbone3 = new AdvancedModelRenderer(this);
        this.petalbone3.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.petal3.addChild(petalbone3);
        this.setRotateAngle(petalbone3, 0.0F, 0.0F, -0.1745F);
        this.petalbone3.cubeList.add(new ModelBox(petalbone3, 0, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.petalbone3.cubeList.add(new ModelBox(petalbone3, 5, 0, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.petal2 = new AdvancedModelRenderer(this);
        this.petal2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal2);
        this.setRotateAngle(petal2, 0.0F, -1.0472F, 0.0F);


        this.petalbone2 = new AdvancedModelRenderer(this);
        this.petalbone2.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.petal2.addChild(petalbone2);
        this.setRotateAngle(petalbone2, 0.0F, 0.0F, -0.1745F);
        this.petalbone2.cubeList.add(new ModelBox(petalbone2, 0, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.petalbone2.cubeList.add(new ModelBox(petalbone2, 5, 0, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.petal = new AdvancedModelRenderer(this);
        this.petal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal);


        this.petalbone = new AdvancedModelRenderer(this);
        this.petalbone.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.petal.addChild(petalbone);
        this.setRotateAngle(petalbone, 0.0F, 0.0F, -0.1745F);
        this.petalbone.cubeList.add(new ModelBox(petalbone, 0, 4, 0.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.petalbone.cubeList.add(new ModelBox(petalbone, 5, 0, 2.0F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        //this.base.offsetY = -1.5F;
        //this.base.render(0.1f);
        this.bone.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
