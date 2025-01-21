package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraQuaestio;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelQuaestio extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;

    public ModelQuaestio() {
        textureWidth = 42;
        textureHeight = 42;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.5F, 3.0F);
        main.cubeList.add(new ModelBox(main, 0, 0, -8.0F, -1.5F, -5.0F, 16, 1, 5, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 23, 27, -3.0F, -2.0F, -6.0F, 2, 1, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 24, 28, 2.0F, -2.0F, -6.0F, 2, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 26, 30, -1.0F, -2.0F, -3.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 29, -1.0F, -2.0F, -2.0F, 2, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 29, -1.0F, -2.0F, 1.0F, 2, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 27, 30, -2.0F, -2.0F, -7.0F, 5, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 11, -7.0F, -1.5F, -7.0F, 14, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 18, -6.0F, -1.5F, -8.0F, 12, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 15, -6.0F, -1.5F, 2.0F, 12, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 30, -5.0F, -1.5F, -9.0F, 10, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 21, -5.0F, -1.5F, 3.0F, 10, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 34, -1.0F, -2.0F, -1.0F, 1, 1, 5, -0.002F, false));
        main.cubeList.add(new ModelBox(main, 0, 33, -2.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 36, -2.0F, -2.0F, -5.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 8, 36, 1.0F, -2.0F, -5.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 8, 33, -1.0F, -2.0F, -6.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 13, 35, -3.0F, -2.0F, -4.0F, 1, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 18, 33, 2.0F, -2.0F, -4.0F, 1, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 24, -4.0F, -1.5F, -10.0F, 8, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 9, 27, -4.0F, -1.5F, 4.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 27, 1.0F, -1.5F, 4.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 19, 24, -2.0F, -1.5F, -11.0F, 4, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 7, -7.0F, -1.5F, 0.0F, 14, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.4F;
        this.main.offsetX = -0.138F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(25);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 4.33F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        this.resetToDefaultPose();

        EntityPrehistoricFloraQuaestio entity = (EntityPrehistoricFloraQuaestio) entitylivingbaseIn;
        if (entity.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraQuaestio entity = (EntityPrehistoricFloraQuaestio) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * 5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 10D) / 10D) * -5D);
            yy = 5D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * -3D);
            yy = 7.5D + (((tickAnim - 20D) / 10D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3D + (((tickAnim - 30D) / 10D) * 3D);
            yy = 5D + (((tickAnim - 30D) / 10D) * -5D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }

        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));

    }
}
