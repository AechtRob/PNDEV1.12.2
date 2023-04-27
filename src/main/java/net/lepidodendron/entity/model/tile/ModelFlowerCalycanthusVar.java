package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerCalycanthusVar extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer petal;
    private final AdvancedModelRenderer petalbone;
    private final AdvancedModelRenderer petal2;
    private final AdvancedModelRenderer petalbone2;
    private final AdvancedModelRenderer petal3;
    private final AdvancedModelRenderer petalbone3;
    private final AdvancedModelRenderer petal4;
    private final AdvancedModelRenderer petalbone4;
    private final AdvancedModelRenderer petal5;
    private final AdvancedModelRenderer petalbone5;
    private final AdvancedModelRenderer petal6;
    private final AdvancedModelRenderer petalbone6;
    private final AdvancedModelRenderer petal7;
    private final AdvancedModelRenderer petalbone7;
    private final AdvancedModelRenderer petal8;
    private final AdvancedModelRenderer petalbone8;
    private final AdvancedModelRenderer petal9;
    private final AdvancedModelRenderer petalbone9;
    private final AdvancedModelRenderer petal10;
    private final AdvancedModelRenderer petalbone10;
    private final AdvancedModelRenderer petal11;
    private final AdvancedModelRenderer petalbone11;
    private final AdvancedModelRenderer petal12;
    private final AdvancedModelRenderer petalbone12;

    public ModelFlowerCalycanthusVar() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 4, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.petal = new AdvancedModelRenderer(this);
        this.petal.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal);
        this.setRotateAngle(petal, 0.4363F, 0.0F, 0.0F);


        this.petalbone = new AdvancedModelRenderer(this);
        this.petalbone.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal.addChild(petalbone);
        this.setRotateAngle(petalbone, 1.2217F, 0.0F, 0.0F);
        this.petalbone.cubeList.add(new ModelBox(petalbone, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone.cubeList.add(new ModelBox(petalbone, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal2 = new AdvancedModelRenderer(this);
        this.petal2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal2);
        this.setRotateAngle(petal2, 0.0F, 1.0472F, 0.0F);


        this.petalbone2 = new AdvancedModelRenderer(this);
        this.petalbone2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal2.addChild(petalbone2);
        this.setRotateAngle(petalbone2, 1.5272F, 0.0F, 0.0F);
        this.petalbone2.cubeList.add(new ModelBox(petalbone2, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone2.cubeList.add(new ModelBox(petalbone2, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal3 = new AdvancedModelRenderer(this);
        this.petal3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal3);
        this.setRotateAngle(petal3, 0.2618F, 2.0944F, 0.0F);


        this.petalbone3 = new AdvancedModelRenderer(this);
        this.petalbone3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal3.addChild(petalbone3);
        this.setRotateAngle(petalbone3, 1.2217F, 0.0F, 0.0F);
        this.petalbone3.cubeList.add(new ModelBox(petalbone3, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone3.cubeList.add(new ModelBox(petalbone3, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal4 = new AdvancedModelRenderer(this);
        this.petal4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal4);
        this.setRotateAngle(petal4, 0.3054F, 3.1416F, 0.0F);


        this.petalbone4 = new AdvancedModelRenderer(this);
        this.petalbone4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal4.addChild(petalbone4);
        this.setRotateAngle(petalbone4, 1.2217F, 0.0F, 0.0F);
        this.petalbone4.cubeList.add(new ModelBox(petalbone4, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone4.cubeList.add(new ModelBox(petalbone4, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal5 = new AdvancedModelRenderer(this);
        this.petal5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal5);
        this.setRotateAngle(petal5, 0.3927F, -2.0944F, 0.0F);


        this.petalbone5 = new AdvancedModelRenderer(this);
        this.petalbone5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal5.addChild(petalbone5);
        this.setRotateAngle(petalbone5, 1.2217F, 0.0F, 0.0F);
        this.petalbone5.cubeList.add(new ModelBox(petalbone5, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone5.cubeList.add(new ModelBox(petalbone5, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal6 = new AdvancedModelRenderer(this);
        this.petal6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal6);
        this.setRotateAngle(petal6, 0.4363F, -1.0472F, 0.0F);


        this.petalbone6 = new AdvancedModelRenderer(this);
        this.petalbone6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal6.addChild(petalbone6);
        this.setRotateAngle(petalbone6, 1.2217F, 0.0F, 0.0F);
        this.petalbone6.cubeList.add(new ModelBox(petalbone6, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone6.cubeList.add(new ModelBox(petalbone6, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal7 = new AdvancedModelRenderer(this);
        this.petal7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal7);
        this.setRotateAngle(petal7, 0.6981F, -0.6981F, 0.0F);


        this.petalbone7 = new AdvancedModelRenderer(this);
        this.petalbone7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal7.addChild(petalbone7);
        this.setRotateAngle(petalbone7, 0.3491F, 0.0F, 0.0F);
        this.petalbone7.cubeList.add(new ModelBox(petalbone7, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone7.cubeList.add(new ModelBox(petalbone7, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal8 = new AdvancedModelRenderer(this);
        this.petal8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal8);
        this.setRotateAngle(petal8, 0.6981F, -1.7453F, 0.0F);


        this.petalbone8 = new AdvancedModelRenderer(this);
        this.petalbone8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal8.addChild(petalbone8);
        this.setRotateAngle(petalbone8, 0.3491F, 0.0F, 0.0F);
        this.petalbone8.cubeList.add(new ModelBox(petalbone8, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone8.cubeList.add(new ModelBox(petalbone8, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal9 = new AdvancedModelRenderer(this);
        this.petal9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal9);
        this.setRotateAngle(petal9, 0.6981F, -2.7925F, 0.0F);


        this.petalbone9 = new AdvancedModelRenderer(this);
        this.petalbone9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal9.addChild(petalbone9);
        this.setRotateAngle(petalbone9, 0.3491F, 0.0F, 0.0F);
        this.petalbone9.cubeList.add(new ModelBox(petalbone9, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone9.cubeList.add(new ModelBox(petalbone9, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal10 = new AdvancedModelRenderer(this);
        this.petal10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal10);
        this.setRotateAngle(petal10, 0.6981F, 2.4435F, 0.0F);


        this.petalbone10 = new AdvancedModelRenderer(this);
        this.petalbone10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal10.addChild(petalbone10);
        this.setRotateAngle(petalbone10, 0.3491F, 0.0F, 0.0F);
        this.petalbone10.cubeList.add(new ModelBox(petalbone10, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone10.cubeList.add(new ModelBox(petalbone10, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal11 = new AdvancedModelRenderer(this);
        this.petal11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal11);
        this.setRotateAngle(petal11, 0.6981F, 1.3963F, 0.0F);


        this.petalbone11 = new AdvancedModelRenderer(this);
        this.petalbone11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal11.addChild(petalbone11);
        this.setRotateAngle(petalbone11, 0.3491F, 0.0F, 0.0F);
        this.petalbone11.cubeList.add(new ModelBox(petalbone11, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone11.cubeList.add(new ModelBox(petalbone11, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

        this.petal12 = new AdvancedModelRenderer(this);
        this.petal12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petal12);
        this.setRotateAngle(petal12, 0.7854F, 0.3491F, 0.0F);


        this.petalbone12 = new AdvancedModelRenderer(this);
        this.petalbone12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.petal12.addChild(petalbone12);
        this.setRotateAngle(petalbone12, 0.3491F, 0.0F, 0.0F);
        this.petalbone12.cubeList.add(new ModelBox(petalbone12, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));
        this.petalbone12.cubeList.add(new ModelBox(petalbone12, 5, 4, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));

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
