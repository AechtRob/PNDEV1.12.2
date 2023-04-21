package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHarpagodes extends AdvancedModelBase {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;

    public ModelHarpagodes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -2.0F, -2.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 14, -2.0F, -1.0F, -5.0F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 28, -1.5F, -3.0F, -2.5F, 3, 1, 3, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.0F, -2.5F, -2.25F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 30, 26, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 16, 13, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(0.5F, -1.5F, -4.5F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 9, 5, 0.0F, 0.0F, -2.5F, 2, 0, 3, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-0.5F, -1.5F, -4.5F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 14, 6, -2.0F, 0.0F, -2.5F, 2, 0, 3, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.25F, -4.0F, -0.5F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 0.0873F, -0.0873F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 5, -1.0F, -2.0F, -2.5F, 4, 4, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 12, -2.0F, -1.0F, -2.5F, 1, 3, 3, 0.005F, false));
        this.shell.cubeList.add(new ModelBox(shell, 21, 28, -1.0F, -2.0F, 0.5F, 4, 4, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 12, 0, -1.0F, -1.0F, 1.5F, 3, 3, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 16, 9, -0.5F, -0.5F, 2.5F, 2, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, -21, 37, -15.05F, 0.5F, -12.5F, 23, 0, 22, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 1.0F, -2.5F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3927F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 23, 0.0F, -2.002F, -2.0F, 4, 3, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.7376F, -0.005F, -2.9351F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -1.2217F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 23, -0.1514F, 0.0F, -3.1492F, 3, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.9887F, 0.005F, 0.8672F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0873F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 22, 0.0F, -0.005F, -4.0F, 3, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 0.0F, 2.5F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.6981F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 27, 0.2241F, 0.0F, -3.2312F, 3, 1, 3, 0.005F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.903F, 0.995F, 0.4991F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.0036F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 18, -2.0F, -0.995F, 0.0F, 2, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5);
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
