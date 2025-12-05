package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBathrotomaria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBathrotomaria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelBathrotomaria() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 0, 17, -2.0F, -2.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -2.0F, -1.0F, -5.0F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 18, 20, -3.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 25, 19, -1.5F, -3.0F, -2.5F, 3, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 11, 19, 2.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(0.0F, -2.5F, -2.25F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 26, 0, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 0, 9, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(0.5F, -1.5F, -4.5F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 4, 22, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-0.5F, -1.25F, -4.5F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 22, 7, -3.0F, -0.25F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.7916F, -3.9368F, 1.2701F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, -0.1536F, 0.7708F, -0.7935F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 9, -2.2084F, -0.8132F, -3.0201F, 4, 2, 6, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 6, 25, -3.2084F, -0.8132F, -2.0201F, 1, 2, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 22, 1.7916F, -0.8132F, -2.0201F, 1, 2, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 16, 14, -2.2084F, -1.8132F, -2.0201F, 4, 1, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 14, 9, -2.2084F, 1.1868F, -2.0201F, 4, 1, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 12, 25, -1.2084F, -2.5632F, -1.0201F, 2, 1, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 12, -0.7084F, -3.0632F, -0.5201F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.7447F, 1.5929F, -0.4901F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3215F, -0.1372F, 0.7353F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.7916F, 2.1868F, 1.9799F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3209F, 0.1388F, -0.0489F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -2.0896F, -2.1262F, -2.27F, 2, 2, 2, 0.05F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.7916F, 1.1868F, -0.0201F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.316F, -0.1671F, -0.2386F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 0, -2.0F, -1.5F, -3.0F, 3, 3, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.snail.offsetY = -1.2F;
        this.snail.offsetX = -0.2F;
        this.snail.rotateAngleY = (float)Math.toRadians(-68);
        this.snail.rotateAngleX = (float)Math.toRadians(15);
        this.snail.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 4.6F;
        this.snail.scaleChildren = true;
        this.snail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(snail, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.snail.render(f);
        //Reset rotations, positions and sizing:
        this.snail.setScale(1.0F, 1.0F, 1.0F);
        this.snail.scaleChildren = false;
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
       // this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraBathrotomaria ee = (EntityPrehistoricFloraBathrotomaria) e;

        //this.snail.offsetZ = 0.13F;
        //this.snail.offsetX = 0.06F;
        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler*0.85F);
        //float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.3F);
        //this.tail.setScaleX(scaler2 * 0.95F);

        this.swing(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.lefteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.lefteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;

//        this.cube_r1.scaleChildren = false;
        scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.snail.setScaleZ(scaler);
//        this.cube_r1.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.snail.setScaleZ(scaler);
//        this.cube_r1.setScaleX(scaler2 * 0.7F);
    }
}
