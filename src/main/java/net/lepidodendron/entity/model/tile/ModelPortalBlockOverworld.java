package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockOverworld extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;

    public ModelPortalBlockOverworld() {
        textureWidth = 16;
        textureHeight = 16;

        root = new AdvancedModelRenderer(this);
        root.scaleChildren = true;
        root.setRotationPoint(0.0F, 16.0F, 0.0F);
        setRotateAngle(root, 0.0F, -1.5708F, 0.0F);
        root.cubeList.add(new ModelBox(root, 0, 0, -8.0F, -8.0F, -8.0F, 16, 16, 0, 0.0F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(-8.0F, -7.0F, -7.0F);
        root.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, 1.5708F, 1.5708F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -15.0F, -16.0F, -1.0F, 16, 16, 0, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(-7.0F, 8.0F, 7.0F);
        root.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 3.1416F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -15.0F, -16.0F, -1.0F, 16, 16, 0, 0.0F, false));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(-7.0F, 8.0F, -7.0F);
        root.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -15.0F, -16.0F, -1.0F, 16, 16, 0, 0.0F, false));

        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(7.0F, 7.0F, 8.0F);
        root.addChild(cube_r4);
        setRotateAngle(cube_r4, 1.5708F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -15.0F, -16.0F, -1.0F, 16, 16, 0, 0.0F, false));

        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(7.0F, 8.0F, 7.0F);
        root.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -15.0F, -16.0F, -1.0F, 16, 16, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks) {
        resetToDefaultPose();
        root.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

}
