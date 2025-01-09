package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLobodiscus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLobodiscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone4;

    public ModelLobodiscus() {
        this.textureWidth = 60;
        this.textureHeight = 50;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.9F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 5, -8.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 4, 7.0F, -1.9F, -2.0F, 1, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 20, 2, -7.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 25, 20, 6.0F, -1.9F, -4.0F, 1, 1, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 14, -2.0F, -1.9F, -8.0F, 4, 1, 16, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 34, -4.0F, -1.9F, -7.0F, 2, 1, 14, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 32, 2.0F, -1.9F, -7.0F, 2, 1, 14, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 0, -6.0F, -1.9F, -6.0F, 2, 1, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 4.0F, -1.9F, -6.0F, 2, 1, 12, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -1.65F, 0.0F);
        this.main.addChild(bone2);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 3, 2.25F, -0.31F, 0.5F, 4, 0, 1, 0.0F, false));
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.75F, -0.31F, 0.5F, 3, 0, 2, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -1.65F, 0.0F);
        this.main.addChild(bone3);
        this.setRotateAngle(bone3, -3.1416F, 1.0472F, -3.1416F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 3, 2.25F, -0.31F, 0.5F, 4, 0, 1, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.75F, -0.31F, 0.5F, 3, 0, 2, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-1.7321F, -2.15F, -1.0F);
        this.main.addChild(bone4);
        this.setRotateAngle(bone4, -3.1416F, -1.0472F, 3.1416F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 3, 2.25F, 0.19F, -1.5F, 4, 0, 1, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 0, -0.75F, 0.19F, -1.5F, 3, 0, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
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

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        this.resetToDefaultPose();

        EntityPrehistoricFloraLobodiscus entity = (EntityPrehistoricFloraLobodiscus) entitylivingbaseIn;
        if (entity.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLobodiscus entity = (EntityPrehistoricFloraLobodiscus) entitylivingbaseIn;

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
