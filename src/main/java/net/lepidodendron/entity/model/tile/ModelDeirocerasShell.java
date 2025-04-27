package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelDeirocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer arm1;
    private final AdvancedModelRenderer armb1;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer arm10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer cube_r1;

    public ModelDeirocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 6.0F, 3.0F);
        this.setRotateAngle(body, 1.5708F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 27, 10, -3.0F, -6.25F, -3.0F, 6, 6, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.25F, 4.0F, 7, 7, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 17, -3.0F, -6.75F, 14.0F, 6, 6, 10, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 24, -2.5F, -6.25F, 24.0F, 5, 5, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 33, -2.0F, -5.75F, 33.0F, 4, 4, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 38, -1.5F, -5.25F, 41.0F, 3, 3, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 42, 23, -1.0F, -4.75F, 49.0F, 2, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.5F, -4.25F, 55.0F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 44, 6, -2.5F, -7.25F, -3.0F, 5, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 0, -3.5F, -7.25F, -1.0F, 7, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, 2.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 2.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, 2.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -3.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -3.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, true));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.65F, -5.6F, -2.75F);
        this.body.addChild(arm1);
        this.arm1.cubeList.add(new ModelBox(arm1, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armb1 = new AdvancedModelRenderer(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 30, 38, -0.49F, -0.51F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.65F, -5.6F, -2.75F);
        this.body.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 30, 38, -0.51F, -0.51F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(2.0F, -5.1F, -2.75F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 0.5236F);
        this.arm2.cubeList.add(new ModelBox(arm2, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 30, 38, -0.49F, -0.51F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-2.0F, -5.1F, -2.75F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, -0.5236F);
        this.arm7.cubeList.add(new ModelBox(arm7, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 30, 38, -0.51F, -0.51F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(2.45F, -3.85F, -2.75F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, 1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 30, 38, -0.49F, -0.51F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-2.45F, -3.85F, -2.75F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, -1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 30, 38, -0.51F, -0.51F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(2.15F, -2.6F, -2.75F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, 2.2689F);
        this.arm4.cubeList.add(new ModelBox(arm4, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 30, 38, -0.49F, -0.51F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-2.15F, -2.6F, -2.75F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 0.0F, -2.2689F);
        this.arm9.cubeList.add(new ModelBox(arm9, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 30, 38, -0.51F, -0.51F, -7.0F, 1, 1, 7, 0.0F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(1.3F, -1.6F, -2.75F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, 2.7053F);
        this.arm5.cubeList.add(new ModelBox(arm5, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 30, 38, -0.49F, -0.51F, -7.0F, 1, 1, 7, 0.0F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-1.3F, -1.6F, -2.75F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.0F, -2.7053F);
        this.arm10.cubeList.add(new ModelBox(arm10, 39, 39, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 30, 38, -0.51F, -0.51F, -7.0F, 1, 1, 7, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.3959F, 4.3822F);
        this.body.addChild(siphon);
        this.setRotateAngle(siphon, 0.0873F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.siphon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 0, -1.0F, -0.956F, -8.0695F, 2, 2, 8, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = 0.5F;
        this.body.offsetZ = -0.3F;
        this.body.rotateAngleX = -(float) Math.toRadians(2.5);
        this.body.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
