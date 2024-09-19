package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraViviparus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelViviparus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;

    public ModelViviparus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 10, 11, -3.0F, -0.5F, 1.25F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -3.0F, 0.5F, 0.25F, 4, 1, 7, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 19, 16, -2.0F, 0.5F, 7.25F, 2, 1, 2, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 18, 20, -4.0F, 0.5F, 1.25F, 1, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 10, 8, -2.5F, -1.5F, 1.75F, 3, 1, 2, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 6, 22, -2.25F, -2.5F, 2.0F, 2, 1, 2, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 18, 4, 1.0F, 0.5F, 1.25F, 1, 1, 4, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-1.0F, -1.5F, 2.0F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.5672F, 0.0F, 0.0F);
        this.nose.cubeList.add(new ModelBox(nose, 0, 21, -0.5F, 0.0412F, -4.0566F, 1, 1, 4, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(-0.5F, -0.75F, 1.75F);
        this.foot.addChild(lefteyestalk);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 11, 0, 0.0F, 0.0F, -3.5F, 3, 0, 4, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.5F, -0.75F, 1.75F);
        this.foot.addChild(righteyestalk);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 17, 0, -3.0F, 0.0F, -3.5F, 3, 0, 4, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.9007F, -4.2929F, 1.0778F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, 0.2427F, -1.029F, 0.0623F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.3493F, 0.6429F, -2.2278F);
        this.shell.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, 0.0F, -0.75F, 4.5F, 1, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -0.5F, -1.25F, 4.25F, 2, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 9, -1.0F, -1.75F, 3.5F, 3, 3, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 15, -1.5F, -2.25F, 1.5F, 4, 4, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -2.0F, -3.0F, -2.0F, 3, 3, 4, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 16, 1.0F, -3.0F, -1.0F, 2, 5, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.9828F, -0.3571F, -4.0238F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -2.0F, 0.0F, 2, 3, 1, -0.01F, false));

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

        EntityPrehistoricFloraViviparus ee = (EntityPrehistoricFloraViviparus) e;

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
