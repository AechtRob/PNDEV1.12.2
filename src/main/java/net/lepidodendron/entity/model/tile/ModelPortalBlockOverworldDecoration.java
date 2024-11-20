package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelPortalBlockOverworldDecoration extends AdvancedModelBase {
    private final AdvancedModelRenderer var1;
    private final AdvancedModelRenderer cube_r1;

    public ModelPortalBlockOverworldDecoration() {
        textureWidth = 16;
        textureHeight = 16;

        var1 = new AdvancedModelRenderer(this);
        var1.scaleChildren = true;
        var1.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotateAngle(var1, 0.0F, -2.3562F, 0.0F);
        var1.cubeList.add(new ModelBox(var1, 0, 0, -8.0F, -16.0F, 0.0F, 16, 16, 0, 0.0F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(-7.0F, 0.0F, 15.0F);
        var1.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -23.0F, -16.0F, -7.0F, 16, 16, 0, 0.0F, false));

        updateDefaultPose();
    }

    public void renderBase(int animationTick, float f, double partialTicks, int offset) {
        resetToDefaultPose();
        animationCycle(animationTick + offset, partialTicks);
        var1.render(f);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }


    public void animationCycle(double animTick, double partialTickTime) {
        int animCycle = 90 + 1;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 37) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 37) / 15) * (1-(0)));
            zz = 0 + (((tickAnim - 37) / 15) * (1-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 52) / 11) * (0.97-(1)));
            yy = 1 + (((tickAnim - 52) / 11) * (0.97-(1)));
            zz = 1 + (((tickAnim - 52) / 11) * (0.97-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 0.97 + (((tickAnim - 63) / 5) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 63) / 5) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 63) / 5) * (1-(0.97)));
        }
        else if (tickAnim >= 68 && tickAnim < 74) {
            xx = 1 + (((tickAnim - 68) / 6) * (0.97-(1)));
            yy = 1 + (((tickAnim - 68) / 6) * (0.97-(1)));
            zz = 1 + (((tickAnim - 68) / 6) * (0.97-(1)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 0.97 + (((tickAnim - 74) / 5) * (1-(0.97)));
            yy = 0.97 + (((tickAnim - 74) / 5) * (1-(0.97)));
            zz = 0.97 + (((tickAnim - 74) / 5) * (1-(0.97)));
        }
        else if (tickAnim >= 79 && tickAnim < 90 + 1) {
            xx = 1 + (((tickAnim - 79) / 11) * (1-(1)));
            yy = 1 + (((tickAnim - 79) / 11) * (1-(1)));
            zz = 1 + (((tickAnim - 79) / 11) * (1-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.var1.setScale((float)xx, (float)yy, (float)zz);

    }

}
