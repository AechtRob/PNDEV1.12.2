package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonTullimonstrum extends AdvancedModelBase {
    private final AdvancedModelRenderer bone10;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer upperjaw;

    public ModelSkeletonTullimonstrum() {
        this.textureWidth = 32;
        this.textureHeight = 64;

        this.bone10 = new AdvancedModelRenderer(this);
        this.bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 29, -4.0F, -1.0F, 5.0F, 8, 1, 8, 0.0F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 29, -6.0F, -1.0F, -2.0F, 8, 1, 8, -0.01F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 29, -3.0F, -1.0F, -3.0F, 8, 1, 8, 0.01F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 29, -4.0F, -1.0F, -11.0F, 8, 1, 8, -0.01F, false));
        this.bone10.cubeList.add(new ModelBox(bone10, 0, 29, -7.0F, -1.0F, -10.0F, 8, 1, 8, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 4.9F, 0.0F);
        this.bone10.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -6.0F, -4.0F, 3, 1, 8, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 17, 18, -1.0F, -6.0F, -6.0F, 2, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 12, -3.5F, -6.1F, -3.0F, 7, 1, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.5F, -6.0F, 3.75F);
        this.bone.addChild(body1);
        this.setRotateAngle(body1, -0.0873F, 0.0F, 1.5708F);
        this.body1.cubeList.add(new ModelBox(body1, 9, 14, 0.0F, -0.99F, 0.0F, 1, 3, 3, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 19, 14, 0.0F, -0.5F, 0.0F, 1, 2, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 8, 22, 0.1F, -1.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 7, 0.1F, -2.0F, 0.0F, 0, 5, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 20, 0.0F, -0.49F, 0.0F, 1, 2, 2, 0.0F, false));

        this.proboscis = new AdvancedModelRenderer(this);
        this.proboscis.setRotationPoint(0.0F, -6.0F, -6.0F);
        this.bone.addChild(proboscis);
        this.setRotateAngle(proboscis, 0.0F, 0.0436F, 0.0F);
        this.proboscis.cubeList.add(new ModelBox(proboscis, 24, 6, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.proboscis.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.1745F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 25, 20, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, 0.2182F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 0.3491F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, 0.5672F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, 1.0036F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone6.addChild(bone7);
        this.setRotateAngle(bone7, 0.0F, 0.1745F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, 0.0F, 0.1745F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 24, 4, -0.499F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.bone9 = new AdvancedModelRenderer(this);
        this.bone9.setRotationPoint(0.5F, 0.5F, -1.0F);
        this.bone8.addChild(bone9);
        this.setRotateAngle(bone9, 0.0F, 0.0F, 1.5708F);
        this.bone9.cubeList.add(new ModelBox(bone9, 24, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.bone9.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.1745F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone9.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 0, -0.501F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone10.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
