package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraNerinea;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNerinea extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    public ModelNerinea() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 13, 0, -3.0F, -0.5F, -0.25F, 4, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 26, -2.0F, -1.5F, 0.0F, 2, 1, 2, -0.01F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -3.0F, 0.5F, -1.25F, 4, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 8, 16, -4.0F, 0.5F, -0.75F, 1, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 14, 4, 1.0F, 0.5F, -0.75F, 1, 1, 4, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-1.0F, -2.25F, 0.5F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.6545F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 15, 18, -1.0F, 0.0412F, -2.0566F, 2, 2, 3, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 0, 23, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(-0.5F, -1.0F, -1.0F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 17, 4, 0.0F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.5F, -1.0F, -1.0F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 17, 9, -3.0F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.3319F, -3.5302F, 1.6387F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, -0.3283F, -0.2412F, 0.2758F);
        this.shell.cubeList.add(new ModelBox(shell, 10, 9, -1.3181F, -1.5198F, -0.1387F, 3, 3, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 19, -1.3181F, -1.5198F, -3.3887F, 3, 3, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 13, -0.8181F, -1.0198F, 3.8613F, 2, 2, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 22, 16, -1.0681F, -1.0198F, -3.8887F, 2, 2, 1, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 5, 21, -0.3181F, -0.5198F, 7.6113F, 1, 1, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 6, -1.8181F, -2.0198F, -3.1387F, 4, 4, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1819F, 0.2302F, -1.3887F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.6545F, -0.1309F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 21, -2.5946F, -0.5F, -2.1103F, 1, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1819F, 0.2302F, -1.3887F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.75F, -0.5F, -3.25F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

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
        //this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraNerinea ee = (EntityPrehistoricFloraNerinea) e;

        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.3F);
        this.foot.setScaleX(scaler2 * 0.85F);

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
