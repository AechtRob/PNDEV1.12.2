package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelFlowerArchaeanthusVar extends AdvancedModelBase {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer cube_r6;

    public ModelFlowerArchaeanthusVar() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 15, 15, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 9, 0, -1.0F, -2.65F, -1.0F, 2, 2, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 0, -1.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.15F, 0.0F, 0.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 8, 0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -1.0472F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.15F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -1.1345F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 4, 0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, -2.0944F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.15F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 0, 0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 1.0472F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.15F, 0.0F, 0.0F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -1.1345F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 8, 0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone5);
        this.setRotateAngle(bone5, 0.0F, 2.0944F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.15F, 0.0F, 0.0F);
        this.bone5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 4, 0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(bone6);
        this.setRotateAngle(bone6, 0.0F, 3.1416F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.15F, 0.0F, 0.0F);
        this.bone6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -1.1345F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, -4.0F, -2.0F, 0, 4, 4, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        //this.base.offsetY = -1.5F;
        //this.base.render(0.1f);
        this.base.render(1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
