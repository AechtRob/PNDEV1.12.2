package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonMeganeura extends AdvancedModelBase {
    private final AdvancedModelRenderer fossil;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer cube_r4;

    public ModelSkeletonMeganeura() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.fossil = new AdvancedModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 26.0F, 0.0F);
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, -16.0F, -2.95F, -16.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, -31.0F, -2.95F, -12.0F, 16, 1, 16, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, -33.0F, -2.95F, -2.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, -17.0F, -2.95F, -3.0F, 16, 1, 16, -0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, -6.0F, -2.95F, -1.0F, 16, 1, 16, 0.015F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, 10.0F, -2.95F, -2.0F, 16, 1, 16, -0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, 21.0F, -2.95F, -3.0F, 16, 1, 16, 0.01F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, 19.0F, -2.95F, -12.0F, 16, 1, 16, -0.015F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, 8.0F, -2.95F, -15.0F, 16, 1, 16, 0.0F, false));
        this.fossil.cubeList.add(new ModelBox(fossil, 22, 85, -4.0F, -2.95F, -17.0F, 16, 1, 16, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fossil.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 35, 59, -1.99F, -3.175F, -4.76F, 4, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 47, -1.99F, -3.25F, -1.76F, 4, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 54, 53, -1.49F, -3.15F, 2.24F, 3, 1, 4, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(2.0F, -3.5F, -0.5F);
        this.body.addChild(forewingL);
        this.setRotateAngle(forewingL, 0.0F, 0.2618F, 0.0F);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 27, 0.0F, 0.275F, -2.0F, 38, 0, 9, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-2.0F, -3.5F, -0.5F);
        this.body.addChild(forewingR);
        this.setRotateAngle(forewingR, 0.0F, -0.3491F, 0.0F);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 18, -38.0F, 0.425F, -2.0F, 38, 0, 9, 0.0F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.5F, -3.4F, 3.0F);
        this.body.addChild(hindwingL);
        this.setRotateAngle(hindwingL, 0.0F, -0.0436F, 0.0F);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 9, 0.0F, 0.2F, -0.75F, 40, 0, 9, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.5F, -3.4F, 3.0F);
        this.body.addChild(hindwingR);
        this.setRotateAngle(hindwingR, 0.0F, 0.0873F, 0.0F);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 0, -40.0F, 0.35F, -0.75F, 40, 0, 9, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(2.0F, -3.0F, -4.65F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 1.3526F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 54, 0.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-2.0F, -3.0F, -4.65F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -1.309F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 42, -10.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.0F, -3.0F, -1.65F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.5236F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -1.5708F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 48, 0.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.0F, -3.0F, -1.65F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.5236F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.5708F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 36, -10.0F, -0.5F, 0.0F, 10, 6, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.fossil.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
