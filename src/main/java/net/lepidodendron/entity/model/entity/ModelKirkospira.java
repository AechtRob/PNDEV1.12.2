package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraKirkospira;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKirkospira extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelKirkospira() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 14, 12, -3.0F, -0.5F, 0.25F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -3.0F, 0.5F, -1.75F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 19, 6, -4.0F, 0.5F, -0.75F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 23, -2.5F, -1.5F, 0.75F, 3, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 12, 17, 1.0F, 0.5F, -0.75F, 1, 1, 5, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 8, 16, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 9, 23, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(-0.5F, 0.0F, -1.25F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 0, 4, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.5F, 0.0F, -1.25F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 0, 6, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.1F, -4.425F, -0.25F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, 0.0504F, -0.4822F, 0.0997F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 9, -3.0F, -2.0F, -1.5F, 6, 4, 3, 0.0F, true));
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -0.5F, -1.5F, 1.5F, 3, 3, 1, 0.0F, true));
        this.shell.cubeList.add(new ModelBox(shell, 19, 17, 0.25F, -1.0F, 2.25F, 2, 2, 1, 0.0F, true));
        this.shell.cubeList.add(new ModelBox(shell, 15, 9, 1.0F, -0.5F, 2.5F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.0F, -3.5F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7835F, 0.0F, -1.625F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.0821F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, -2.0F, -1.0F, -3.75F, 2, 3, 4, -0.02F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, 0.0F, -1.5F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.6109F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 20, 0.0F, -1.0F, -3.0F, 2, 3, 3, -0.01F, true));

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
        this.snail.offsetY = -0.8F;
        this.snail.offsetX = -0.2F;
        this.snail.rotateAngleY = (float)Math.toRadians(-68);
        this.snail.rotateAngleX = (float)Math.toRadians(15);
        this.snail.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 4.8F;
        this.snail.scaleChildren = true;
        this.snail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(snail, 0.4F, 3.8F, -0.2F);
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

        EntityPrehistoricFloraKirkospira ee = (EntityPrehistoricFloraKirkospira) e;

        this.snail.offsetZ = 0.13F;
        this.snail.offsetX = 0.06F;
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
