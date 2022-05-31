package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPoleumita extends AdvancedModelBase {
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer tentacleL;
    private final AdvancedModelRenderer tentacleL2;

    public ModelPoleumita() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -2.0F, -2.01F, -1.25F, 4, 2, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 20, -2.0F, -1.0F, -2.75F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.5F, -2.5F, -3.25F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -1.0F, -2.5F, -1.25F, 2, 1, 1, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.body.addChild(leg3);
        this.leg3.cubeList.add(new ModelBox(leg3, 15, 5, 0.0F, -0.99F, -3.25F, 1, 1, 7, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(bone);


        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body.addChild(leg);
        this.leg.cubeList.add(new ModelBox(leg, 15, 0, -2.0F, -1.0F, -0.25F, 4, 1, 2, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.body.addChild(leg2);
        this.leg2.cubeList.add(new ModelBox(leg2, 13, 13, -1.0F, -0.99F, -3.25F, 1, 1, 7, 0.0F, false));

        this.tentacleL = new AdvancedModelRenderer(this);
        this.tentacleL.setRotationPoint(1.0F, -1.75F, -2.0F);
        this.body.addChild(tentacleL);
        this.tentacleL.cubeList.add(new ModelBox(tentacleL, 20, 13, -0.5F, 0.0F, -1.75F, 4, 0, 2, 0.0F, false));

        this.tentacleL2 = new AdvancedModelRenderer(this);
        this.tentacleL2.setRotationPoint(-1.0F, -1.75F, -2.0F);
        this.body.addChild(tentacleL2);
        this.tentacleL2.cubeList.add(new ModelBox(tentacleL2, 13, 3, -3.5F, 0.0F, -1.75F, 4, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.body.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -2.0F, -5.0F, -1.0F, 4, 5, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        body.render(f5 * 0.58F);
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
        this.body.offsetY = 0.62F;

        this.swing(tentacleL, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.swing(tentacleL2, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);
        this.flap(tentacleL, 0.2F, 0.1F, false, 0, 0.15F, f2, 0.8F);
        this.flap(tentacleL2, 0.2F, 0.1F, true, 0, 0.15F, f2, 0.8F);

        this.tentacleL.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleL.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleL2.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.tentacleL2.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
    }
}
