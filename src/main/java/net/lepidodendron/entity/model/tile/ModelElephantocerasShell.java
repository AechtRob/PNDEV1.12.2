package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelElephantocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer shelldontmove;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r7;

    public ModelElephantocerasShell() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -24.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -7.25F, 4.0F, 7, 7, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 21, -3.0F, -6.75F, 18.0F, 6, 6, 12, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 46, 34, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 44, -3.5F, -2.925F, 0.6F, 7, 4, 2, 0.01F, false));

        this.shelldontmove = new AdvancedModelRenderer(this);
        this.shelldontmove.setRotationPoint(0.0F, -1.75F, 30.0F);
        this.body.addChild(shelldontmove);
        this.setRotateAngle(shelldontmove, 0.0436F, 0.0F, 0.0F);
        this.shelldontmove.cubeList.add(new ModelBox(shelldontmove, 26, 29, -2.5F, -4.5F, -0.05F, 5, 5, 10, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shelldontmove.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 0, -2.0F, 0.5F, -1.0F, 4, 4, 10, 0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.55F, 17.0F);
        this.shelldontmove.addChild(bone2);
        this.setRotateAngle(bone2, 0.1309F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 39, -1.5F, -4.0F, 0.0F, 3, 3, 8, 0.01F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.525F, 8.0833F);
        this.bone2.addChild(bone);
        this.setRotateAngle(bone, 0.3927F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, 0.9167F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 21, -1.5F, 0.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -6.0F, 8.9167F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 2.5307F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 0, -0.5F, -0.9429F, 0.098F, 1, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.0F, 8.9167F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5708F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 5, -0.5F, -1.0429F, 0.098F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.5F, 5.9167F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.6109F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 57, -1.0F, -2.175F, -0.1F, 2, 2, 4, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -8.5F, 5.6667F);
        this.bone.addChild(bone3);
        this.setRotateAngle(bone3, -0.0175F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -2.6616F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, 0.0F, -5.0462F, 0.1014F, 0, 5, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -5.0462F, -0.8986F, 0, 3, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.offsetY = -1.2F;
        this.body.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
