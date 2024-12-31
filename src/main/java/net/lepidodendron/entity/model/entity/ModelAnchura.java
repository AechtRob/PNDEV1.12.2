package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAnchura extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;

    public ModelAnchura() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.foot.cubeList.add(new ModelBox(foot, 16, 18, -2.0F, -2.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 9, -2.0F, -1.0F, -5.0F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 24, 9, -1.5F, -3.0F, -2.5F, 3, 1, 3, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 30, 4, -2.0F, -0.5F, -0.75F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 12, 30, -1.5F, -0.5F, -2.75F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 30, 2, 0.5F, -1.5F, -6.0F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 30, 0, -3.5F, -1.5F, -6.0F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-1.0956F, -4.2556F, 0.4491F);
        this.foot.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 0.0F, -0.1963F);
        this.shell.cubeList.add(new ModelBox(shell, 16, 23, 0.0956F, -2.1944F, -2.7741F, 3, 4, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 24, -0.4044F, -2.1944F, -2.7741F, 3, 4, 3, -0.02F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -7.663F, 0.3056F, -3.3633F, 6, 0, 9, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 30, 7, -3.663F, -0.1944F, -1.8633F, 2, 1, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 24, 13, -0.4044F, -1.6944F, 0.2259F, 3, 3, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 28, 28, 0.0956F, -1.1944F, 2.2259F, 2, 2, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 18, 30, 0.5956F, -0.6944F, 4.2259F, 1, 1, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 28, 23, 0.5956F, -0.4444F, -6.7741F, 1, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(3.0956F, 3.8056F, -2.7741F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7636F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -5.0F, -5.0F, -3.0F, 5, 3, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        foot.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.foot.offsetY = -0.5F;
        this.foot.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.foot.offsetY = -2.0F;
        this.foot.offsetX = -1.338F;
        this.foot.rotateAngleY = (float)Math.toRadians(200);
        this.foot.rotateAngleX = (float)Math.toRadians(8);
        this.foot.rotateAngleZ = (float)Math.toRadians(-8);
        this.foot.scaleChildren = true;
        float scaler = 1.63F;
        this.foot.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.foot.render(f);
        //Reset rotations, positions and sizing:
        this.foot.setScale(1.0F, 1.0F, 1.0F);
        this.foot.scaleChildren = false;
        resetToDefaultPose();

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
        //this.snail.offsetY = 0.122F;

        this.swing(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.lefteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.lefteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
    }
}
