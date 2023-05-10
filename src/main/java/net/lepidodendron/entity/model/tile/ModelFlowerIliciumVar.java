package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerIliciumVar extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer petalA;
    private final AdvancedModelRenderer petalAbone;
    private final AdvancedModelRenderer petalA2;
    private final AdvancedModelRenderer petalAbone2;
    private final AdvancedModelRenderer petalA3;
    private final AdvancedModelRenderer petalAbone3;
    private final AdvancedModelRenderer petalA4;
    private final AdvancedModelRenderer petalAbone4;
    private final AdvancedModelRenderer petalA5;
    private final AdvancedModelRenderer petalAbone5;
    private final AdvancedModelRenderer petalA6;
    private final AdvancedModelRenderer petalAbone6;
    private final AdvancedModelRenderer petalB;
    private final AdvancedModelRenderer petalBbone;
    private final AdvancedModelRenderer petalB2;
    private final AdvancedModelRenderer petalBbone2;
    private final AdvancedModelRenderer petalB3;
    private final AdvancedModelRenderer petalBbone3;
    private final AdvancedModelRenderer petalB4;
    private final AdvancedModelRenderer petalBbone4;
    private final AdvancedModelRenderer petalB5;
    private final AdvancedModelRenderer petalBbone5;
    private final AdvancedModelRenderer petalB6;
    private final AdvancedModelRenderer petalBbone6;

    public ModelFlowerIliciumVar() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 7, -1.0F, -3.0F, -1.0F, 2, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 4, -1.5F, -2.5F, -1.5F, 3, 0, 3, 0.0F, false));

        this.petalA = new AdvancedModelRenderer(this);
        this.petalA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petalA);
        this.setRotateAngle(petalA, 1.0472F, 0.0F, 0.0F);


        this.petalAbone = new AdvancedModelRenderer(this);
        this.petalAbone.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalA.addChild(petalAbone);
        this.setRotateAngle(petalAbone, 0.1745F, 0.0F, 0.0F);
        this.petalAbone.cubeList.add(new ModelBox(petalAbone, 0, 3, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.petalAbone.cubeList.add(new ModelBox(petalAbone, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.petalA2 = new AdvancedModelRenderer(this);
        this.petalA2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petalA2);
        this.setRotateAngle(petalA2, 1.0472F, -1.0472F, 0.0F);


        this.petalAbone2 = new AdvancedModelRenderer(this);
        this.petalAbone2.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalA2.addChild(petalAbone2);
        this.setRotateAngle(petalAbone2, 0.1745F, 0.0F, 0.0F);
        this.petalAbone2.cubeList.add(new ModelBox(petalAbone2, 0, 3, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.petalAbone2.cubeList.add(new ModelBox(petalAbone2, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.petalA3 = new AdvancedModelRenderer(this);
        this.petalA3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petalA3);
        this.setRotateAngle(petalA3, 1.0472F, -2.0944F, 0.0F);


        this.petalAbone3 = new AdvancedModelRenderer(this);
        this.petalAbone3.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalA3.addChild(petalAbone3);
        this.setRotateAngle(petalAbone3, 0.1745F, 0.0F, 0.0F);
        this.petalAbone3.cubeList.add(new ModelBox(petalAbone3, 0, 3, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.petalAbone3.cubeList.add(new ModelBox(petalAbone3, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.petalA4 = new AdvancedModelRenderer(this);
        this.petalA4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petalA4);
        this.setRotateAngle(petalA4, 1.0472F, 3.1416F, 0.0F);


        this.petalAbone4 = new AdvancedModelRenderer(this);
        this.petalAbone4.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalA4.addChild(petalAbone4);
        this.setRotateAngle(petalAbone4, 0.1745F, 0.0F, 0.0F);
        this.petalAbone4.cubeList.add(new ModelBox(petalAbone4, 0, 3, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.petalAbone4.cubeList.add(new ModelBox(petalAbone4, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.petalA5 = new AdvancedModelRenderer(this);
        this.petalA5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petalA5);
        this.setRotateAngle(petalA5, 1.0472F, 2.0944F, 0.0F);


        this.petalAbone5 = new AdvancedModelRenderer(this);
        this.petalAbone5.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalA5.addChild(petalAbone5);
        this.setRotateAngle(petalAbone5, 0.1745F, 0.0F, 0.0F);
        this.petalAbone5.cubeList.add(new ModelBox(petalAbone5, 0, 3, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.petalAbone5.cubeList.add(new ModelBox(petalAbone5, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.petalA6 = new AdvancedModelRenderer(this);
        this.petalA6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(petalA6);
        this.setRotateAngle(petalA6, 1.0472F, 1.0472F, 0.0F);


        this.petalAbone6 = new AdvancedModelRenderer(this);
        this.petalAbone6.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalA6.addChild(petalAbone6);
        this.setRotateAngle(petalAbone6, 0.1745F, 0.0F, 0.0F);
        this.petalAbone6.cubeList.add(new ModelBox(petalAbone6, 0, 3, -0.5F, 0.0F, 4.0F, 1, 0, 1, 0.0F, false));
        this.petalAbone6.cubeList.add(new ModelBox(petalAbone6, 0, 0, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.petalB = new AdvancedModelRenderer(this);
        this.petalB.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.bone.addChild(petalB);
        this.setRotateAngle(petalB, 1.0472F, 0.5236F, 0.0F);


        this.petalBbone = new AdvancedModelRenderer(this);
        this.petalBbone.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalB.addChild(petalBbone);
        this.setRotateAngle(petalBbone, 0.4363F, 0.0F, 0.0F);
        this.petalBbone.cubeList.add(new ModelBox(petalBbone, 4, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.petalB2 = new AdvancedModelRenderer(this);
        this.petalB2.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.bone.addChild(petalB2);
        this.setRotateAngle(petalB2, 1.0472F, 1.5708F, 0.0F);


        this.petalBbone2 = new AdvancedModelRenderer(this);
        this.petalBbone2.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalB2.addChild(petalBbone2);
        this.setRotateAngle(petalBbone2, 0.4363F, 0.0F, 0.0F);
        this.petalBbone2.cubeList.add(new ModelBox(petalBbone2, 4, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.petalB3 = new AdvancedModelRenderer(this);
        this.petalB3.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.bone.addChild(petalB3);
        this.setRotateAngle(petalB3, 1.0472F, 2.618F, 0.0F);


        this.petalBbone3 = new AdvancedModelRenderer(this);
        this.petalBbone3.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalB3.addChild(petalBbone3);
        this.setRotateAngle(petalBbone3, 0.4363F, 0.0F, 0.0F);
        this.petalBbone3.cubeList.add(new ModelBox(petalBbone3, 4, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.petalB4 = new AdvancedModelRenderer(this);
        this.petalB4.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.bone.addChild(petalB4);
        this.setRotateAngle(petalB4, 1.0472F, -2.618F, 0.0F);


        this.petalBbone4 = new AdvancedModelRenderer(this);
        this.petalBbone4.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalB4.addChild(petalBbone4);
        this.setRotateAngle(petalBbone4, 0.4363F, 0.0F, 0.0F);
        this.petalBbone4.cubeList.add(new ModelBox(petalBbone4, 4, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.petalB5 = new AdvancedModelRenderer(this);
        this.petalB5.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.bone.addChild(petalB5);
        this.setRotateAngle(petalB5, 1.0472F, -1.5708F, 0.0F);


        this.petalBbone5 = new AdvancedModelRenderer(this);
        this.petalBbone5.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalB5.addChild(petalBbone5);
        this.setRotateAngle(petalBbone5, 0.4363F, 0.0F, 0.0F);
        this.petalBbone5.cubeList.add(new ModelBox(petalBbone5, 4, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.petalB6 = new AdvancedModelRenderer(this);
        this.petalB6.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.bone.addChild(petalB6);
        this.setRotateAngle(petalB6, 1.0472F, -0.5236F, 0.0F);


        this.petalBbone6 = new AdvancedModelRenderer(this);
        this.petalBbone6.setRotationPoint(0.0F, -2.0F, 1.0F);
        this.petalB6.addChild(petalBbone6);
        this.setRotateAngle(petalBbone6, 0.4363F, 0.0F, 0.0F);
        this.petalBbone6.cubeList.add(new ModelBox(petalBbone6, 4, 0, -0.5F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

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
