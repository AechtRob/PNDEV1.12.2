package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraArchisymplectes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchisymplectes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer archisymplectes;
    private final AdvancedModelRenderer segment;
    private final AdvancedModelRenderer proboscis;
    private final AdvancedModelRenderer segment2;
    private final AdvancedModelRenderer segment3;
    private final AdvancedModelRenderer segment4;
    private final AdvancedModelRenderer segment5;
    private final AdvancedModelRenderer segment6;
    private final AdvancedModelRenderer segment7;
    private final AdvancedModelRenderer segment8;
    private final AdvancedModelRenderer segment9;
    private final AdvancedModelRenderer segment10;
    private final AdvancedModelRenderer segment11;
    private final AdvancedModelRenderer segment12;

    public ModelArchisymplectes() {
        textureWidth = 16;
        textureHeight = 16;

        archisymplectes = new AdvancedModelRenderer(this);
        archisymplectes.setRotationPoint(-0.5F, 24.0F, 0.0F);


        segment = new AdvancedModelRenderer(this);
        segment.setRotationPoint(0.5F, -0.5F, -9.0F);
        archisymplectes.addChild(segment);
        segment.cubeList.add(new ModelBox(segment, 0, 4, -0.5F, -0.5F, -3.0F, 1, 1, 2, 0.0F, false));

        proboscis = new AdvancedModelRenderer(this);
        proboscis.setRotationPoint(-0.5F, 0.5F, -3.0F);
        segment.addChild(proboscis);
        proboscis.cubeList.add(new ModelBox(proboscis, 0, 4, 0.5F, -3.0F, -4.0F, 0, 3, 4, 0.0F, false));
        proboscis.cubeList.add(new ModelBox(proboscis, -4, 12, -1.0F, -0.5F, -4.0F, 3, 0, 4, 0.0F, false));

        segment2 = new AdvancedModelRenderer(this);
        segment2.setRotationPoint(0.0F, 0.0F, -1.0F);
        segment.addChild(segment2);
        segment2.cubeList.add(new ModelBox(segment2, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment3 = new AdvancedModelRenderer(this);
        segment3.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment2.addChild(segment3);
        segment3.cubeList.add(new ModelBox(segment3, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment4 = new AdvancedModelRenderer(this);
        segment4.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment3.addChild(segment4);
        segment4.cubeList.add(new ModelBox(segment4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment5 = new AdvancedModelRenderer(this);
        segment5.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment4.addChild(segment5);
        segment5.cubeList.add(new ModelBox(segment5, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment6 = new AdvancedModelRenderer(this);
        segment6.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment5.addChild(segment6);
        segment6.cubeList.add(new ModelBox(segment6, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment7 = new AdvancedModelRenderer(this);
        segment7.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment6.addChild(segment7);
        segment7.cubeList.add(new ModelBox(segment7, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment8 = new AdvancedModelRenderer(this);
        segment8.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment7.addChild(segment8);
        segment8.cubeList.add(new ModelBox(segment8, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment9 = new AdvancedModelRenderer(this);
        segment9.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment8.addChild(segment9);
        segment9.cubeList.add(new ModelBox(segment9, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment10 = new AdvancedModelRenderer(this);
        segment10.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment9.addChild(segment10);
        segment10.cubeList.add(new ModelBox(segment10, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment11 = new AdvancedModelRenderer(this);
        segment11.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment10.addChild(segment11);
        segment11.cubeList.add(new ModelBox(segment11, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        segment12 = new AdvancedModelRenderer(this);
        segment12.setRotationPoint(0.0F, 0.0F, 2.0F);
        segment11.addChild(segment12);
        segment12.cubeList.add(new ModelBox(segment12, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.proboscis.setScale((float)0,(float)0,(float)0);

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.archisymplectes.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.archisymplectes.offsetY = -2.2F;
        this.archisymplectes.offsetX = 0.6F;
        this.archisymplectes.offsetZ = 2.0F;
        this.archisymplectes.rotateAngleY = (float)Math.toRadians(120);
        this.archisymplectes.rotateAngleX = (float)Math.toRadians(0);
        this.archisymplectes.rotateAngleZ = (float)Math.toRadians(0);
        this.archisymplectes.scaleChildren = true;
        float scaler = 4.0F;
        this.archisymplectes.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(archisymplectes, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(segment, 0.0F, 0.1F, -0.0F);
        this.setRotateAngle(segment2, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(segment3, 0.0F, 0.2F, -0.0F);
        this.setRotateAngle(segment4, 0.0F, 0.1F, -0.0F);
        this.setRotateAngle(segment5, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(segment6, 0.0F, -0.1F, -0.0F);
        this.setRotateAngle(segment7, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(segment8, 0.0F, -0.2F, -0.0F);
        this.setRotateAngle(segment9, 0.0F, -0.1F, -0.0F);
        this.setRotateAngle(segment10, 0.0F, 0.0F, -0.0F);
        this.setRotateAngle(segment11, 0.0F, 0.1F, -0.0F);
        this.setRotateAngle(segment12, 0.0F, 0.1F, -0.0F);
        //End of pose, now render the model:
        this.archisymplectes.render(f);
        //Reset rotations, positions and sizing:
        this.archisymplectes.setScale(1.0F, 1.0F, 1.0F);
        this.archisymplectes.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        AdvancedModelRenderer[] BodyB = {this.segment,this.segment2,this.segment3,this.segment4,this.segment5,this.segment6,this.segment7,this.segment8,this.segment9,this.segment10,this.segment11, this.segment12};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(BodyB, 0.2F, -0.015F, -3, f2, 0.4F);
            this.chainSwing(BodyB, 0.2F, -0.08F, -3, f2, 0.5F);
            EntityPrehistoricFloraArchisymplectes ee = (EntityPrehistoricFloraArchisymplectes) e;
            this.archisymplectes.scaleChildren = true;
            float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.08F) + 1F;
            this.archisymplectes.setScaleZ(scaler);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArchisymplectes ee = (EntityPrehistoricFloraArchisymplectes) entitylivingbaseIn;

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchisymplectes entity = (EntityPrehistoricFloraArchisymplectes) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 6) / 14) * (1-(1)));
            yy = 1 + (((tickAnim - 6) / 14) * (1-(1)));
            zz = 1 + (((tickAnim - 6) / 14) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 20) / 20) * (0-(1)));
            yy = 1 + (((tickAnim - 20) / 20) * (0-(1)));
            zz = 1 + (((tickAnim - 20) / 20) * (0-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.proboscis.setScale((float)xx, (float)yy, (float)zz);


    }
}
