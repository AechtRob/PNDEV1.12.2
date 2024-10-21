package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeocidaris;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchaeocidaris extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended spike;
    private final AdvancedModelRendererExtended spike26;
    private final AdvancedModelRendererExtended spike31;
    private final AdvancedModelRendererExtended spike21;
    private final AdvancedModelRendererExtended spike2;
    private final AdvancedModelRendererExtended spike27;
    private final AdvancedModelRendererExtended spike32;
    private final AdvancedModelRendererExtended spike23;
    private final AdvancedModelRendererExtended spike3;
    private final AdvancedModelRendererExtended spike28;
    private final AdvancedModelRendererExtended spike33;
    private final AdvancedModelRendererExtended spike22;
    private final AdvancedModelRendererExtended spike4;
    private final AdvancedModelRendererExtended spike29;
    private final AdvancedModelRendererExtended spike34;
    private final AdvancedModelRendererExtended spike24;
    private final AdvancedModelRendererExtended spike5;
    private final AdvancedModelRendererExtended spike30;
    private final AdvancedModelRendererExtended spike35;
    private final AdvancedModelRendererExtended spike25;
    private final AdvancedModelRendererExtended spike6;
    private final AdvancedModelRendererExtended spike7;
    private final AdvancedModelRendererExtended spike8;
    private final AdvancedModelRendererExtended spike9;
    private final AdvancedModelRendererExtended spike10;
    private final AdvancedModelRendererExtended spike11;
    private final AdvancedModelRendererExtended spike20;
    private final AdvancedModelRendererExtended spike12;
    private final AdvancedModelRendererExtended spike19;
    private final AdvancedModelRendererExtended spike13;
    private final AdvancedModelRendererExtended spike18;
    private final AdvancedModelRendererExtended spike14;
    private final AdvancedModelRendererExtended spike17;
    private final AdvancedModelRendererExtended spike15;
    private final AdvancedModelRendererExtended spike16;

    private ModelAnimator animator;

    public ModelArchaeocidaris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.0F, -3.0F, 6, 4, 6, 0.0F, false));

        this.spike = new AdvancedModelRendererExtended(this);
        this.spike.setRotationPoint(-2.5F, -3.75F, -0.75F);
        this.body.addChild(spike);
        this.setRotateAngle(spike, 0.3054F, 0.0F, -1.0472F);
        this.spike.cubeList.add(new ModelBox(spike, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike26 = new AdvancedModelRendererExtended(this);
        this.spike26.setRotationPoint(-1.5F, -3.75F, 0.25F);
        this.body.addChild(spike26);
        this.setRotateAngle(spike26, -0.0436F, 0.0F, -0.7854F);
        this.spike26.cubeList.add(new ModelBox(spike26, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike31 = new AdvancedModelRendererExtended(this);
        this.spike31.setRotationPoint(-1.0F, -3.75F, -0.75F);
        this.body.addChild(spike31);
        this.setRotateAngle(spike31, -0.0436F, 0.0F, -0.3491F);
        this.spike31.cubeList.add(new ModelBox(spike31, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike21 = new AdvancedModelRendererExtended(this);
        this.spike21.setRotationPoint(-2.5F, -2.75F, 1.25F);
        this.body.addChild(spike21);
        this.setRotateAngle(spike21, -0.0873F, 0.0F, -1.0472F);
        this.spike21.cubeList.add(new ModelBox(spike21, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike2 = new AdvancedModelRendererExtended(this);
        this.spike2.setRotationPoint(-1.5F, -3.75F, 2.5F);
        this.body.addChild(spike2);
        this.setRotateAngle(spike2, -0.6109F, 0.48F, -1.0908F);
        this.spike2.cubeList.add(new ModelBox(spike2, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike27 = new AdvancedModelRendererExtended(this);
        this.spike27.setRotationPoint(-0.5F, -3.75F, 1.5F);
        this.body.addChild(spike27);
        this.setRotateAngle(spike27, -0.9599F, 0.6545F, -0.9599F);
        this.spike27.cubeList.add(new ModelBox(spike27, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike32 = new AdvancedModelRendererExtended(this);
        this.spike32.setRotationPoint(-0.5F, -3.75F, 1.0F);
        this.body.addChild(spike32);
        this.setRotateAngle(spike32, -0.7418F, 0.7854F, -0.8727F);
        this.spike32.cubeList.add(new ModelBox(spike32, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike23 = new AdvancedModelRendererExtended(this);
        this.spike23.setRotationPoint(-0.5F, -2.75F, 2.5F);
        this.body.addChild(spike23);
        this.setRotateAngle(spike23, -1.2217F, 0.4363F, -1.0908F);
        this.spike23.cubeList.add(new ModelBox(spike23, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike3 = new AdvancedModelRendererExtended(this);
        this.spike3.setRotationPoint(1.5F, -3.75F, 2.5F);
        this.body.addChild(spike3);
        this.setRotateAngle(spike3, -2.0508F, 0.5672F, -1.5708F);
        this.spike3.cubeList.add(new ModelBox(spike3, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike28 = new AdvancedModelRendererExtended(this);
        this.spike28.setRotationPoint(1.5F, -3.75F, 1.5F);
        this.body.addChild(spike28);
        this.setRotateAngle(spike28, -2.6616F, 0.5236F, -2.0508F);
        this.spike28.cubeList.add(new ModelBox(spike28, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike33 = new AdvancedModelRendererExtended(this);
        this.spike33.setRotationPoint(1.0F, -3.75F, 0.5F);
        this.body.addChild(spike33);
        this.setRotateAngle(spike33, -2.618F, 0.5236F, -2.3998F);
        this.spike33.cubeList.add(new ModelBox(spike33, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike22 = new AdvancedModelRendererExtended(this);
        this.spike22.setRotationPoint(2.5F, -2.75F, 1.5F);
        this.body.addChild(spike22);
        this.setRotateAngle(spike22, -2.3126F, 0.5672F, -1.5708F);
        this.spike22.cubeList.add(new ModelBox(spike22, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike4 = new AdvancedModelRendererExtended(this);
        this.spike4.setRotationPoint(2.5F, -3.75F, -0.5F);
        this.body.addChild(spike4);
        this.setRotateAngle(spike4, 2.8362F, 0.0F, -2.0944F);
        this.spike4.cubeList.add(new ModelBox(spike4, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike29 = new AdvancedModelRendererExtended(this);
        this.spike29.setRotationPoint(1.0F, -3.75F, -1.5F);
        this.body.addChild(spike29);
        this.setRotateAngle(spike29, 2.618F, 0.0F, -2.5744F);
        this.spike29.cubeList.add(new ModelBox(spike29, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike34 = new AdvancedModelRendererExtended(this);
        this.spike34.setRotationPoint(1.0F, -3.75F, -1.0F);
        this.body.addChild(spike34);
        this.setRotateAngle(spike34, 2.7925F, 0.0F, -2.8798F);
        this.spike34.cubeList.add(new ModelBox(spike34, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike24 = new AdvancedModelRendererExtended(this);
        this.spike24.setRotationPoint(2.5F, -2.75F, -2.5F);
        this.body.addChild(spike24);
        this.setRotateAngle(spike24, 2.5744F, 0.0F, -2.2689F);
        this.spike24.cubeList.add(new ModelBox(spike24, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike5 = new AdvancedModelRendererExtended(this);
        this.spike5.setRotationPoint(-0.5F, -3.75F, -2.5F);
        this.body.addChild(spike5);
        this.setRotateAngle(spike5, 1.5272F, -0.5672F, -1.6581F);
        this.spike5.cubeList.add(new ModelBox(spike5, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike30 = new AdvancedModelRendererExtended(this);
        this.spike30.setRotationPoint(-1.5F, -3.75F, -1.5F);
        this.body.addChild(spike30);
        this.setRotateAngle(spike30, 1.4399F, -0.8727F, -1.7453F);
        this.spike30.cubeList.add(new ModelBox(spike30, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike35 = new AdvancedModelRendererExtended(this);
        this.spike35.setRotationPoint(-0.25F, -3.75F, -1.25F);
        this.body.addChild(spike35);
        this.setRotateAngle(spike35, 1.5272F, -1.0908F, -1.7017F);
        this.spike35.cubeList.add(new ModelBox(spike35, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike25 = new AdvancedModelRendererExtended(this);
        this.spike25.setRotationPoint(-2.5F, -2.75F, -2.0F);
        this.body.addChild(spike25);
        this.setRotateAngle(spike25, 0.6545F, -0.6109F, -1.5272F);
        this.spike25.cubeList.add(new ModelBox(spike25, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike6 = new AdvancedModelRendererExtended(this);
        this.spike6.setRotationPoint(-2.75F, -1.75F, -2.75F);
        this.body.addChild(spike6);
        this.setRotateAngle(spike6, 0.7854F, 0.0436F, -1.2654F);
        this.spike6.cubeList.add(new ModelBox(spike6, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike7 = new AdvancedModelRendererExtended(this);
        this.spike7.setRotationPoint(2.25F, -1.75F, -2.75F);
        this.body.addChild(spike7);
        this.setRotateAngle(spike7, 1.309F, -0.6109F, 0.0F);
        this.spike7.cubeList.add(new ModelBox(spike7, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike8 = new AdvancedModelRendererExtended(this);
        this.spike8.setRotationPoint(3.0F, -1.75F, 1.25F);
        this.body.addChild(spike8);
        this.setRotateAngle(spike8, 1.3963F, -2.0508F, 0.0873F);
        this.spike8.cubeList.add(new ModelBox(spike8, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike9 = new AdvancedModelRendererExtended(this);
        this.spike9.setRotationPoint(0.0F, -1.75F, 3.25F);
        this.body.addChild(spike9);
        this.setRotateAngle(spike9, 1.4399F, 3.098F, 0.0F);
        this.spike9.cubeList.add(new ModelBox(spike9, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike10 = new AdvancedModelRendererExtended(this);
        this.spike10.setRotationPoint(-3.0F, -1.75F, 1.25F);
        this.body.addChild(spike10);
        this.setRotateAngle(spike10, 1.3526F, 1.9635F, 0.0F);
        this.spike10.cubeList.add(new ModelBox(spike10, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike11 = new AdvancedModelRendererExtended(this);
        this.spike11.setRotationPoint(-2.3F, -1.25F, 3.0F);
        this.body.addChild(spike11);
        this.setRotateAngle(spike11, 1.6581F, 2.3998F, 0.0F);
        this.spike11.cubeList.add(new ModelBox(spike11, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike20 = new AdvancedModelRendererExtended(this);
        this.spike20.setRotationPoint(-1.8F, -2.25F, 3.0F);
        this.body.addChild(spike20);
        this.setRotateAngle(spike20, 1.309F, 2.6616F, 0.0F);
        this.spike20.cubeList.add(new ModelBox(spike20, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike12 = new AdvancedModelRendererExtended(this);
        this.spike12.setRotationPoint(1.9F, -1.25F, 3.0F);
        this.body.addChild(spike12);
        this.setRotateAngle(spike12, 1.6581F, -2.4871F, 0.0F);
        this.spike12.cubeList.add(new ModelBox(spike12, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike19 = new AdvancedModelRendererExtended(this);
        this.spike19.setRotationPoint(1.9F, -2.25F, 2.5F);
        this.body.addChild(spike19);
        this.setRotateAngle(spike19, 1.3526F, -2.2253F, 0.0F);
        this.spike19.cubeList.add(new ModelBox(spike19, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike13 = new AdvancedModelRendererExtended(this);
        this.spike13.setRotationPoint(2.9F, -1.25F, -0.25F);
        this.body.addChild(spike13);
        this.setRotateAngle(spike13, 1.6581F, -1.6144F, 0.0F);
        this.spike13.cubeList.add(new ModelBox(spike13, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike18 = new AdvancedModelRendererExtended(this);
        this.spike18.setRotationPoint(2.9F, -2.25F, -0.75F);
        this.body.addChild(spike18);
        this.setRotateAngle(spike18, 1.2654F, -1.3963F, 0.0F);
        this.spike18.cubeList.add(new ModelBox(spike18, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike14 = new AdvancedModelRendererExtended(this);
        this.spike14.setRotationPoint(0.15F, -1.25F, -3.0F);
        this.body.addChild(spike14);
        this.setRotateAngle(spike14, 1.6581F, -0.1745F, 0.0F);
        this.spike14.cubeList.add(new ModelBox(spike14, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike17 = new AdvancedModelRendererExtended(this);
        this.spike17.setRotationPoint(-0.85F, -2.25F, -3.0F);
        this.body.addChild(spike17);
        this.setRotateAngle(spike17, 1.3526F, 0.1745F, 0.0F);
        this.spike17.cubeList.add(new ModelBox(spike17, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike15 = new AdvancedModelRendererExtended(this);
        this.spike15.setRotationPoint(-2.6F, -1.25F, -0.8F);
        this.body.addChild(spike15);
        this.setRotateAngle(spike15, 1.6581F, 1.2217F, 0.0F);
        this.spike15.cubeList.add(new ModelBox(spike15, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        this.spike16 = new AdvancedModelRendererExtended(this);
        this.spike16.setRotationPoint(-2.6F, -2.25F, 0.2F);
        this.body.addChild(spike16);
        this.setRotateAngle(spike16, 1.3526F, 1.5708F, 0.0F);
        this.spike16.cubeList.add(new ModelBox(spike16, 8, 14, -0.5F, -6.0F, -0.5F, 1, 7, 1, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 1.0F);
    }

    @Override
    public void renderStaticBook(float f) {

    }
    
    public void renderStatic(float f) {
        resetToDefaultPose();
        this.body.render(1F);
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        //super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        this.body.offsetY = 0.00F;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        this.resetToDefaultPose();

        EntityPrehistoricFloraArchaeocidaris entity = (EntityPrehistoricFloraArchaeocidaris) entitylivingbaseIn;
        if (entity.getIsMoving()) {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        animate((IAnimatedEntity) entity);

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeocidaris entity = (EntityPrehistoricFloraArchaeocidaris) entitylivingbaseIn;

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

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));
        
    }


    public void animate(IAnimatedEntity entity) {
        EntityPrehistoricFloraArchaeocidaris e = (EntityPrehistoricFloraArchaeocidaris) entity;
        animator.update(entity);

    }
}
