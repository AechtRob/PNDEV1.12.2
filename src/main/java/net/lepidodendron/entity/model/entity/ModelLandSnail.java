package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLandSnail;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLandSnail extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer Antenna;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelLandSnail() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Snail = new AdvancedModelRenderer(this);
        this.Snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -1.0F, -1.0F, -2.0F, 2, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -0.5F, -1.0F, 3.0F, 1, 1, 1, 0.0F, false));

        this.Antenna = new AdvancedModelRenderer(this);
        this.Antenna.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.foot.addChild(Antenna);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.Antenna.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 6, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Snail.addChild(Shell);
        this.setRotateAngle(Shell, 0.3921F, -0.0132F, 0.3685F);
        this.Shell.cubeList.add(new ModelBox(Shell, 0, 6, -1.5F, -3.7F, 0.0F, 3, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.2F, 5.0F);
        this.Shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 10, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6957F, 0.0091F, -0.1852F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 0, -1.1092F, -1.6912F, -1.2F, 2, 2, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        Snail.render(f5 * 0.5F);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Snail.offsetY = -0.1F;
        this.Snail.offsetX = 0.1F;
        this.Snail.offsetZ = 2.0F;
        this.Snail.rotateAngleY = (float)Math.toRadians(120);
        this.Snail.rotateAngleX = (float)Math.toRadians(1);
        this.Snail.rotateAngleZ = (float)Math.toRadians(0);
        this.Snail.scaleChildren = true;
        float scaler = 2.2F;
        this.Snail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Snail, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.Snail.render(f);
        //Reset rotations, positions and sizing:
        this.Snail.setScale(1.0F, 1.0F, 1.0F);
        this.Snail.scaleChildren = false;
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
        this.Snail.offsetY = 0.75F;

        EntityPrehistoricFloraLandSnail ee = (EntityPrehistoricFloraLandSnail) e;

        this.foot.scaleChildren = true;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.1F) + 1F;
        this.foot.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.1F);
        this.foot.setScaleX(scaler2 * 0.7F);



    }
}
