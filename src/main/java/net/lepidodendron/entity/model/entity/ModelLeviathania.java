package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLeviathania extends AdvancedModelBase {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelLeviathania() {
        this.textureWidth = 37;
        this.textureHeight = 30;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 16, 0, -1.0F, -2.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -1.0F, -1.0F, -5.0F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 9, 23, -2.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 16, 23, -0.5F, -3.0F, -2.5F, 3, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 19, 5, 3.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(1.0F, -2.5F, -2.25F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 16, 5, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 24, 14, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(1.5F, -1.5F, -4.5F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 0, 4, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(0.5F, -1.5F, -4.5F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 0, 6, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(2.0F, -3.0F, -0.5F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, -0.173F, 0.1161F, 0.1569F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 9, -2.5F, -4.0F, 0.5F, 5, 5, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 24, -4.25F, -3.75F, 0.5F, 2, 1, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 18, -4.0F, -3.0F, -1.5F, 5, 4, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 14, 14, -4.5F, -3.25F, -0.25F, 3, 5, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 26, 5, -2.5F, -3.25F, 4.5F, 4, 4, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 7, 24, -1.5F, -2.25F, 5.5F, 2, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -3.5F, -2.25F, -2.25F, 3, 3, 1, 0.05F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.45F, -2.3F, -2.3F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.0472F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 10, -2.5F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -4.0F, 0.5F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 11, -2.5F, 0.0F, -2.0F, 4, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.5F, -1.0F, 0.5F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.8727F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 21, -1.0F, -1.5F, -2.0F, 1, 3, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(lefteyestalk, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(righteyestalk, 0.0F, 0.15F, 0.0F);
        this.snail.offsetY = -0.5F;
        this.snail.render(0.01F);
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
