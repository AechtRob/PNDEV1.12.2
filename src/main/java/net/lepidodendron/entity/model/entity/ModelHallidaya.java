package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraHallidaya;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHallidaya extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;

    public ModelHallidaya() {
        textureWidth = 64;
        textureHeight = 32;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 24.9F, 0.0F);
        main.cubeList.add(new ModelBox(main, 1, 0, 6.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 1, 0, -7.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 17, 0, 5.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 23, 16, -6.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -1.9F, -6.0F, 2, 1, 12, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 36, 14, -4.0F, -1.9F, -6.0F, 2, 1, 12, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 42, 2, 4.0F, -1.9F, -5.0F, 1, 1, 10, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 26, 0, -5.0F, -1.9F, -5.0F, 1, 1, 10, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 14, -2.0F, -1.9F, -7.0F, 4, 1, 14, 0.0F, false));

        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.1F, 0.0F);
        main.addChild(cube_r1);
        setRotateAngle(cube_r1, 0.0F, -2.0944F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, -2, 0, -2.25F, -2.025F, -1.0F, 2, 0, 2, 0.0F, false));

        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.1F, 0.0F);
        main.addChild(cube_r2);
        setRotateAngle(cube_r2, 0.0F, 2.0944F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, -2, 0, -2.25F, -2.025F, -1.0F, 2, 0, 2, 0.0F, false));

        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.1F, 0.0F);
        main.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, -2, 0, -2.25F, -2.025F, -1.0F, 2, 0, 2, 0.0F, false));

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

        EntityPrehistoricFloraHallidaya entity = (EntityPrehistoricFloraHallidaya) entitylivingbaseIn;
        if (entity.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHallidaya entity = (EntityPrehistoricFloraHallidaya) entitylivingbaseIn;

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
