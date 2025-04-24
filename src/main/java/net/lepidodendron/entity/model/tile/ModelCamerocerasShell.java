package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelCamerocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
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
    private final AdvancedModelRenderer cube_r2;

    public ModelCamerocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 8.0F, 4.0F);
        this.setRotateAngle(body, 1.5272F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -5.5F, -1.9F, 4, 4, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -6.25F, 3.0F, 5, 5, 20, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 25, -2.0F, -5.75F, 23.0F, 4, 4, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 0, -1.5F, -5.25F, 38.0F, 3, 3, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 25, -1.0F, -4.75F, 52.0F, 2, 2, 13, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 9, -2.0F, -6.25F, -2.0F, 4, 1, 1, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 25, -2.5F, -6.25F, -1.0F, 5, 1, 4, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 30, -0.5F, -6.25F, -2.0F, 1, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, 1.4F, -5.5F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 1.425F, -5.0F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 2, 1.41F, -4.49F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.425F, -5.0F, 1.0F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 2, -2.41F, -4.49F, 1.01F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -2.4F, -5.5F, 0.5F, 1, 2, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, -4.5F, 65.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 9, 2.0F, 0.25F, 0.0F, 1, 1, 7, 0.0F, false));

        this.arm1 = new AdvancedModelRenderer(this);
        this.arm1.setRotationPoint(0.65F, -4.85F, -1.5F);
        this.body.addChild(arm1);
        this.setRotateAngle(arm1, 0.0F, 0.0F, 0.1745F);
        this.arm1.cubeList.add(new ModelBox(arm1, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armb1 = new AdvancedModelRenderer(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 23, 25, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(-0.65F, -4.85F, -1.5F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, 0.0F, 0.0F, -0.1745F);
        this.arm6.cubeList.add(new ModelBox(arm6, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 23, 25, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(1.5F, -4.35F, -1.5F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0F, 0.0F, 1.0036F);
        this.arm2.cubeList.add(new ModelBox(arm2, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 23, 25, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(-1.5F, -4.35F, -1.5F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0F, 0.0F, -1.0036F);
        this.arm7.cubeList.add(new ModelBox(arm7, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 23, 25, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(1.75F, -3.35F, -1.5F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0F, 0.0F, 1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 23, 25, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(-1.75F, -3.35F, -1.5F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0F, 0.0F, -1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 23, 25, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(1.5F, -2.6F, -1.5F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0F, 0.0F, 2.3562F);
        this.arm4.cubeList.add(new ModelBox(arm4, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 23, 25, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(-1.5F, -2.6F, -1.5F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0F, 0.0F, -2.3562F);
        this.arm9.cubeList.add(new ModelBox(arm9, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 23, 25, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(0.75F, -2.1F, -1.5F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0F, 0.0F, 2.9671F);
        this.arm5.cubeList.add(new ModelBox(arm5, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 23, 25, -0.49F, -0.51F, -5.0F, 1, 1, 5, 0.0F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(-0.75F, -2.1F, -1.5F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0F, 0.0F, -2.9671F);
        this.arm10.cubeList.add(new ModelBox(arm10, 30, 0, -0.5F, -0.5F, -5.0F, 1, 1, 5, 0.0F, true));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 23, 25, -0.51F, -0.51F, -5.0F, 1, 1, 5, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, -1.7799F, 2.94F);
        this.body.addChild(siphon);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.65F, 0.0F);
        this.siphon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2749F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 25, -1.0F, 0.1F, -4.7F, 2, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = 1.4F;
        this.body.offsetZ = -1.8F;
        this.body.rotateAngleX = (float) -Math.toRadians(1.5);
        this.body.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
