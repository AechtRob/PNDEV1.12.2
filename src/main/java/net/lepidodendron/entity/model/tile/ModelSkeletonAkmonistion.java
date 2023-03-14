package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonAkmonistion extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer nose_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body1_1_r1;
    private final AdvancedModelRenderer anvil5_r1;
    private final AdvancedModelRenderer anvil3_r1;
    private final AdvancedModelRenderer anvil2_r1;
    private final AdvancedModelRenderer anvil1_r1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer fin1L;
    private final AdvancedModelRenderer fin2L;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body3_2_r1;
    private final AdvancedModelRenderer body3_1_r1;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer caudalfin;
    private final AdvancedModelRenderer caudalfin_r1;

    public ModelSkeletonAkmonistion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -9.0F, -1.0F, -9.0F, 16, 1, 16, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -20.0F, -1.0F, -8.0F, 16, 1, 16, -0.01F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, 2.0F, -1.0F, -10.0F, 16, 1, 16, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.bone.addChild(body);
        this.setRotateAngle(body, 1.5708F, 0.0F, -1.5708F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, -0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 23, 0.25F, -1.0F, -4.0F, 1, 2, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, 1.175F, 0.4F, -4.0F, 0, 1, 4, 0.0F, false));

        this.nose_r1 = new AdvancedModelRenderer(this);
        this.nose_r1.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.head.addChild(nose_r1);
        this.setRotateAngle(nose_r1, 0.3491F, 0.0F, 0.0F);
        this.nose_r1.cubeList.add(new ModelBox(nose_r1, 10, 25, 0.225F, -6.5F, -7.0F, 1, 2, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 14, 38, 0.25F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(1.5F, -3.0F, -4.25F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, -0.1745F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 21, 31, -1.249F, -1.01F, 0.0F, 1, 3, 5, 0.0F, false));

        this.body1_1_r1 = new AdvancedModelRenderer(this);
        this.body1_1_r1.setRotationPoint(-0.5F, 2.0F, 0.0F);
        this.body1.addChild(body1_1_r1);
        this.setRotateAngle(body1_1_r1, -0.0873F, 0.0F, 0.0F);
        this.body1_1_r1.cubeList.add(new ModelBox(body1_1_r1, 33, 32, -0.59F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.anvil5_r1 = new AdvancedModelRenderer(this);
        this.anvil5_r1.setRotationPoint(-1.5F, 3.0F, 4.0F);
        this.body1.addChild(anvil5_r1);
        this.setRotateAngle(anvil5_r1, -0.2618F, 0.0F, 0.0F);
        this.anvil5_r1.cubeList.add(new ModelBox(anvil5_r1, 0, 8, 1.09F, -9.5F, -3.75F, 0, 1, 6, 0.0F, false));
        this.anvil5_r1.cubeList.add(new ModelBox(anvil5_r1, 0, 34, 0.19F, -9.0F, -3.75F, 1, 1, 5, 0.0F, false));

        this.anvil3_r1 = new AdvancedModelRenderer(this);
        this.anvil3_r1.setRotationPoint(-1.15F, 3.0F, 5.25F);
        this.body1.addChild(anvil3_r1);
        this.setRotateAngle(anvil3_r1, -0.1745F, 0.0F, 0.0F);
        this.anvil3_r1.cubeList.add(new ModelBox(anvil3_r1, 0, 7, -0.25F, -8.25F, -3.75F, 1, 5, 2, 0.0F, false));

        this.anvil2_r1 = new AdvancedModelRenderer(this);
        this.anvil2_r1.setRotationPoint(-1.15F, 2.25F, 1.5F);
        this.body1.addChild(anvil2_r1);
        this.setRotateAngle(anvil2_r1, -0.5236F, 0.0F, 0.0F);
        this.anvil2_r1.cubeList.add(new ModelBox(anvil2_r1, 0, 0, -0.26F, -9.0F, -0.75F, 1, 5, 2, 0.0F, false));

        this.anvil1_r1 = new AdvancedModelRenderer(this);
        this.anvil1_r1.setRotationPoint(-1.15F, 3.0F, 4.0F);
        this.body1.addChild(anvil1_r1);
        this.setRotateAngle(anvil1_r1, 0.7418F, 0.0F, 0.0F);
        this.anvil1_r1.cubeList.add(new ModelBox(anvil1_r1, 8, 36, -0.24F, -5.0F, -1.5F, 1, 2, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-1.5F, 0.5F, 4.75F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 16, 17, 0.25F, -1.5F, 0.0F, 1, 3, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 25, 0.45F, 1.0F, 0.0F, 1, 1, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 22, 1.125F, -4.0F, 8.0F, 0, 3, 3, 0.0F, false));

        this.fin1L = new AdvancedModelRenderer(this);
        this.fin1L.setRotationPoint(1.55F, 1.0F, -1.0F);
        this.body2.addChild(fin1L);
        this.setRotateAngle(fin1L, 0.0F, 0.0873F, 1.5708F);
        this.fin1L.cubeList.add(new ModelBox(fin1L, 0, 0, 0.0F, 0.5F, -1.0F, 4, 0, 7, 0.0F, false));

        this.fin2L = new AdvancedModelRenderer(this);
        this.fin2L.setRotationPoint(1.0F, 1.25F, 9.0F);
        this.body2.addChild(fin2L);
        this.setRotateAngle(fin2L, 0.0F, -0.1309F, 1.5708F);
        this.fin2L.cubeList.add(new ModelBox(fin2L, 0, 7, 0.0F, -0.025F, -1.0F, 3, 0, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 12, 28, 0.25F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.body3_2_r1 = new AdvancedModelRenderer(this);
        this.body3_2_r1.setRotationPoint(1.45F, 2.0F, -0.25F);
        this.body3.addChild(body3_2_r1);
        this.setRotateAngle(body3_2_r1, 0.1745F, 0.0F, 0.0F);
        this.body3_2_r1.cubeList.add(new ModelBox(body3_2_r1, 26, 17, -1.44F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

        this.body3_1_r1 = new AdvancedModelRenderer(this);
        this.body3_1_r1.setRotationPoint(1.45F, -0.5F, -0.25F);
        this.body3.addChild(body3_1_r1);
        this.setRotateAngle(body3_1_r1, -0.0873F, 0.0F, 0.0F);
        this.body3_1_r1.cubeList.add(new ModelBox(body3_1_r1, 28, 25, -1.25F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 5.75F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.0873F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 34, 17, 0.1F, -0.99F, 0.0F, 1, 2, 4, 0.0F, false));

        this.caudalfin = new AdvancedModelRenderer(this);
        this.caudalfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body4.addChild(caudalfin);
        this.caudalfin.cubeList.add(new ModelBox(caudalfin, 12, 13, 0.1F, -1.0F, 0.0F, 1, 2, 1, 0.0F, false));

        this.caudalfin_r1 = new AdvancedModelRenderer(this);
        this.caudalfin_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.caudalfin.addChild(caudalfin_r1);
        this.setRotateAngle(caudalfin_r1, -0.3491F, 0.0F, 0.0F);
        this.caudalfin_r1.cubeList.add(new ModelBox(caudalfin_r1, 0, 5, 1.1998F, -7.997F, -0.0082F, 0, 8, 12, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.bone.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
