package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMarmolatella;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMarmolatella extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;

    public ModelMarmolatella() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 15, 0, -3.0F, -0.5F, 0.25F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 11, -3.0F, 0.5F, -1.75F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 19, 17, -4.0F, 0.5F, -0.75F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 20, -2.5F, -1.5F, 0.75F, 3, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 16, 11, 1.0F, 0.5F, -0.75F, 1, 1, 5, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 0, 15, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 0, 0, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(-0.5F, 0.0F, -1.25F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 0, 11, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.5F, 0.0F, -1.25F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 0, 13, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -3.0F, -0.5F);
        this.snail.addChild(shell);
        this.shell.cubeList.add(new ModelBox(shell, 0, 0, -2.0F, -3.0F, -3.5F, 4, 4, 7, 0.0F, false));

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
        this.snail.offsetX = -0.4F;
        this.snail.offsetZ = 2.0F;
        this.snail.rotateAngleY = (float)Math.toRadians(120);
        this.snail.rotateAngleX = (float)Math.toRadians(1);
        this.snail.rotateAngleZ = (float)Math.toRadians(0);
        this.snail.scaleChildren = true;
        float scaler = 4.2F;
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
        //this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraMarmolatella ee = (EntityPrehistoricFloraMarmolatella) e;

        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.3F);
        this.foot.setScaleX(scaler2 * 0.65F);

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
