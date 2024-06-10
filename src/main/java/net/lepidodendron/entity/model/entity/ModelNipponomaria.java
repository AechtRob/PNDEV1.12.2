package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraNipponomaria;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNipponomaria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelNipponomaria() {
        this.textureWidth = 40;
        this.textureHeight = 35;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 0, 17, -1.0F, -2.0F, -3.0F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -1.0F, -1.0F, -5.0F, 4, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 12, 22, -2.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 26, 15, -0.5F, -3.0F, -2.5F, 3, 1, 3, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 22, 3.0F, -1.0F, -4.0F, 1, 1, 5, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(1.0F, -2.5F, -2.25F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 7, 22, -1.0F, 0.0412F, -2.0566F, 2, 1, 2, 0.0F, false));
        this.nose.cubeList.add(new ModelBox(nose, 0, 9, -0.5F, 0.0412F, -4.0566F, 1, 1, 2, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(1.5F, -1.5F, -4.5F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 14, 5, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(0.5F, -1.5F, -4.5F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 10, 17, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-1.0416F, -2.4368F, 1.5201F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, -0.1536F, 0.7708F, -0.7935F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 9, -1.2084F, -1.5632F, -3.2701F, 4, 2, 6, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 26, 5, -2.2084F, -1.5632F, -2.2701F, 1, 2, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 20, 24, 2.7916F, -1.5632F, -2.2701F, 1, 2, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 14, 9, -1.2084F, -3.0632F, -2.2701F, 4, 2, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 16, 0, -1.2084F, 0.4368F, -2.2701F, 4, 1, 4, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 20, 5, -0.2084F, -3.8132F, -1.2701F, 2, 1, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 12, 0.2916F, -4.5632F, -0.7701F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.7447F, 0.8429F, -0.7401F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3215F, -0.1372F, 0.7353F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7916F, 1.4368F, 1.7299F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3209F, 0.1388F, -0.0489F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -2.0896F, -2.1262F, -2.27F, 2, 2, 2, 0.05F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.7916F, 0.4368F, -0.2701F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.316F, -0.1671F, -0.2386F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 15, -2.0F, -1.5F, -3.0F, 3, 3, 4, 0.0F, false));

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

        EntityPrehistoricFloraNipponomaria ee = (EntityPrehistoricFloraNipponomaria) e;

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
