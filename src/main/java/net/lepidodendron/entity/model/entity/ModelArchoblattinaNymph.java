package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArchoblattinaNymph extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cerciL;
    private final AdvancedModelRenderer cerciR;

    public ModelArchoblattinaNymph() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.25F, 5.0F);
        this.body.cubeList.add(new ModelBox(body, 7, 6, -1.99F, -1.6F, -5.0F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.5F, -1.4F, -4.0F, 3, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.0F, -6.9F, 2, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 11, -1.5F, -0.6F, -2.0F, 3, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 9, -2.0F, -0.6F, -1.0F, 4, 1, 1, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(0.0F, -0.25F, -6.9F);
        this.body.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.1745F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 5, 0, -3.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.0F, -0.25F, -6.9F);
        this.body.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.1745F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 5, 0.0F, 0.0F, -3.0F, 3, 0, 3, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(0.75F, -0.9F, -5.75F);
        this.body.addChild(legL1);
        this.setRotateAngle(legL1, 0.0F, 0.1745F, 0.4363F);
        this.legL1.cubeList.add(new ModelBox(legL1, 4, 12, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-0.75F, -0.9F, -5.75F);
        this.body.addChild(legR1);
        this.setRotateAngle(legR1, 0.0F, -0.1745F, -0.4363F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 8, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.75F, -0.9F, -5.0F);
        this.body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.4363F);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 12, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.75F, -0.9F, -5.0F);
        this.body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.4363F);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 3, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.75F, -0.9F, -4.25F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, -0.2618F, 0.4363F);
        this.legL3.cubeList.add(new ModelBox(legL3, 8, 3, 0.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.75F, -0.9F, -4.25F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.2618F, -0.4363F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 2, -2.0F, 0.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.body.addChild(bone);
        this.bone.cubeList.add(new ModelBox(bone, 10, 3, -0.99F, -0.49F, 0.1F, 2, 1, 2, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.5F, -0.48F, 0.1F, 1, 1, 1, 0.0F, false));

        this.cerciL = new AdvancedModelRenderer(this);
        this.cerciL.setRotationPoint(0.15F, 0.5F, 1.0F);
        this.bone2.addChild(cerciL);
        this.setRotateAngle(cerciL, 0.0F, 0.3491F, 0.0F);
        this.cerciL.cubeList.add(new ModelBox(cerciL, 0, 5, 0.0F, -0.98F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cerciR = new AdvancedModelRenderer(this);
        this.cerciR.setRotationPoint(-0.15F, 0.5F, 1.0F);
        this.bone2.addChild(cerciR);
        this.setRotateAngle(cerciR, 0.0F, -0.3491F, 0.0F);
        this.cerciR.cubeList.add(new ModelBox(cerciR, 0, 4, 0.0F, -0.98F, 0.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.38F);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 0.91F;

        AdvancedModelRenderer[] legsL = {this.legL1, this.legL2, this.legL3};
        AdvancedModelRenderer[] legsR = {this.legR1, this.legR2, this.legR3};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(antennaL, 0.5F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.5F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        this.flap(legL1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(legR1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);

    }
}
