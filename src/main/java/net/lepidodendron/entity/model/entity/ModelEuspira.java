package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEuspira;
import net.lepidodendron.entity.EntityPrehistoricFloraMarmolatella;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEuspira extends AdvancedModelBase {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;

    public ModelEuspira() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.5F, -3.25F);
        this.snail.addChild(foot);
        this.foot.cubeList.add(new ModelBox(foot, 18, 0, -3.0F, -0.5F, 0.25F, 4, 1, 4, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 0, -3.0F, 0.5F, -2.75F, 4, 1, 10, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 10, 12, -4.0F, 0.5F, -1.75F, 1, 1, 8, 0.0F, false));
        this.foot.cubeList.add(new ModelBox(foot, 0, 11, 1.0F, 0.5F, -1.75F, 1, 1, 8, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.3927F, 0.0F, 0.0F);


        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(-0.5F, 0.0F, 0.25F);
        this.foot.addChild(lefteyestalk);
        this.setRotateAngle(lefteyestalk, 0.0F, -0.3054F, 0.0F);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 0, 0, 0.0F, 0.0F, -3.0F, 1, 0, 4, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.5F, 0.0F, 0.25F);
        this.foot.addChild(righteyestalk);
        this.setRotateAngle(righteyestalk, 0.0F, 0.3054F, 0.0F);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 2, 0, -1.0F, 0.0F, -3.0F, 1, 0, 4, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, -2.0F, -0.5F);
        this.snail.addChild(shell);
        this.setRotateAngle(shell, 0.0F, 0.0F, 0.2618F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 2, -1.75F, -1.5F, -1.5F, 1, 2, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 20, -1.25F, -2.0F, -2.0F, 3, 3, 3, 0.0F, false));

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
        //this.snail.offsetY = 0.83F;

        EntityPrehistoricFloraEuspira ee = (EntityPrehistoricFloraEuspira) e;



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
