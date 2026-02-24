package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeontinid;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPalaeontinidShort extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer mouthpart;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer forewingright;
    private final AdvancedModelRenderer forewingleft;
    private final AdvancedModelRenderer hindwingright;
    private final AdvancedModelRenderer hindwingleft;

    public ModelPalaeontinidShort() {
        this.textureWidth = 40;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -2.0F, -2.0F, -3.0F, 4, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 24, -1.0F, -1.45F, -3.5F, 2, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 25, -0.5F, -1.45F, -3.5F, 1, 1, 1, 0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.9F, 1.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 16, 17, -2.0F, 0.0F, 0.0F, 4, 2, 2, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 8, 23, -1.0F, 0.5F, 1.975F, 2, 1, 1, 0.0F, false));

        this.mouthpart = new AdvancedModelRenderer(this);
        this.mouthpart.setRotationPoint(0.0F, 0.0F, -3.5F);
        this.body.addChild(mouthpart);
        this.setRotateAngle(mouthpart, 1.2654F, 0.0F, 0.0F);
        this.mouthpart.cubeList.add(new ModelBox(mouthpart, 4, 25, 0.0F, -0.1F, 0.1F, 0, 2, 1, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.75F, 0.0F, -2.0F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -1.2217F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 20, 24, -2.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.75F, 0.0F, -2.0F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 1.2217F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 20, 24, -0.5F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.0F, 0.0F, -0.75F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.3927F, -0.0873F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 23, -3.5F, -0.5F, 0.0F, 4, 2, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.0F, 0.0F, -0.75F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, -0.3927F, 0.0873F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 23, -0.5F, -0.5F, 0.0F, 4, 2, 0, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.0F, 0.0F, 0.25F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.1309F, 0.9163F, 0.3491F);
        this.legright3.cubeList.add(new ModelBox(legright3, 16, 21, -4.5F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.0F, 0.0F, 0.25F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.1309F, -0.9163F, -0.3491F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 16, 21, -0.5F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.forewingright = new AdvancedModelRenderer(this);
        this.forewingright.setRotationPoint(-2.0F, -2.0F, -2.75F);
        this.body.addChild(forewingright);
        this.setRotateAngle(forewingright, 0.0F, -0.0436F, 0.0F);
        this.forewingright.cubeList.add(new ModelBox(forewingright, 0, 0, -15.75F, -0.015F, -2.0F, 16, 0, 8, 0.0F, false));

        this.forewingleft = new AdvancedModelRenderer(this);
        this.forewingleft.setRotationPoint(2.0F, -2.0F, -2.75F);
        this.body.addChild(forewingleft);
        this.setRotateAngle(forewingleft, 0.0F, 0.0436F, 0.0F);
        this.forewingleft.cubeList.add(new ModelBox(forewingleft, 0, 0, -0.25F, -0.015F, -2.0F, 16, 0, 8, 0.0F, true));

        this.hindwingright = new AdvancedModelRenderer(this);
        this.hindwingright.setRotationPoint(-1.75F, -2.0F, -1.25F);
        this.body.addChild(hindwingright);
        this.setRotateAngle(hindwingright, 0.0F, -1.1781F, 0.0F);
        this.hindwingright.cubeList.add(new ModelBox(hindwingright, 0, 8, -0.5F, -0.005F, -0.25F, 6, 0, 9, 0.0F, false));

        this.hindwingleft = new AdvancedModelRenderer(this);
        this.hindwingleft.setRotationPoint(1.75F, -2.0F, -1.25F);
        this.body.addChild(hindwingleft);
        this.setRotateAngle(hindwingleft, 0.0F, 1.1781F, 0.0F);
        this.hindwingleft.cubeList.add(new ModelBox(hindwingleft, 0, 8, -5.5F, -0.005F, -0.25F, 6, 0, 9, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {
        this.body.offsetY = 0.0F;
        this.body.render(0.01f);
    }

    public void renderStaticFloor(float f) {
        this.body.offsetY = -0.3F;
        this.body.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetY = -0.3F;
        this.body.render(0.01f);
        resetToDefaultPose();
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
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPalaeontinid ee = (EntityPrehistoricFloraPalaeontinid) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying
            this.setRotateAngle(legleft, body.rotateAngleX, body.rotateAngleY+(float)Math.toRadians(70), body.rotateAngleZ+(float)Math.toRadians(-25));
            this.setRotateAngle(legright, body.rotateAngleX, body.rotateAngleY+(float)Math.toRadians(-70), body.rotateAngleZ+(float)Math.toRadians(25));
            this.setRotateAngle(legleft2, body.rotateAngleX, body.rotateAngleY+(float)Math.toRadians(22.5), body.rotateAngleZ+(float)Math.toRadians(5-12.5));
            this.setRotateAngle(legright2, body.rotateAngleX, body.rotateAngleY+(float)Math.toRadians(-22.5), body.rotateAngleZ+(float)Math.toRadians(-5+12.5));
            this.setRotateAngle(legleft3, body.rotateAngleX+(float)Math.toRadians(-7.5), body.rotateAngleY+(float)Math.toRadians(-52.5), body.rotateAngleZ+(float)Math.toRadians(-20-10));
            this.setRotateAngle(legright3, body.rotateAngleX+(float)Math.toRadians(-7.5), body.rotateAngleY+(float)Math.toRadians(52.5), body.rotateAngleZ+(float)Math.toRadians(20+10));
            this.forewingleft.offsetY = -0.01F;
            this.forewingright.offsetY = -0.01F;
            this.setRotateAngle(forewingleft, body.rotateAngleX-(float)Math.toRadians(-12.409570727), body.rotateAngleY-(float)Math.toRadians(-2.5+65.447916625), body.rotateAngleZ+(float)Math.toRadians(24.258201587));
            this.setRotateAngle(forewingright, body.rotateAngleX-(float)Math.toRadians(-12.409570727), body.rotateAngleY-(float)Math.toRadians(2.5-65.447916625), body.rotateAngleZ+(float)Math.toRadians(-24.258201587));
            this.setRotateAngle(hindwingleft, body.rotateAngleX-(float)Math.toRadians(-3.127311441), body.rotateAngleY-(float)Math.toRadians(-67.5+25.527958363), body.rotateAngleZ+(float)Math.toRadians(32.13442234));
            this.setRotateAngle(hindwingright, body.rotateAngleX-(float)Math.toRadians(-3.127311441), body.rotateAngleY-(float)Math.toRadians(67.5-25.527958363), body.rotateAngleZ+(float)Math.toRadians(-32.13442234));
        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPalaeontinid entity = (EntityPrehistoricFloraPalaeontinid) entitylivingbaseIn;
        int animCycle = 3;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(0), legright.rotateAngleZ + (float) Math.toRadians(-40));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(0), legright2.rotateAngleY + (float) Math.toRadians(0), legright2.rotateAngleZ + (float) Math.toRadians(-50));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(0), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(-70));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10 + (((tickAnim - 0) / 1) * (21.71272-(-10)));
            yy = -15 + (((tickAnim - 0) / 1) * (1.61907-(-15)));
            zz = 30 + (((tickAnim - 0) / 1) * (-26.11108-(30)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 21.71272 + (((tickAnim - 1) / 1) * (-27.5-(21.71272)));
            yy = 1.61907 + (((tickAnim - 1) / 1) * (15-(1.61907)));
            zz = -26.11108 + (((tickAnim - 1) / 1) * (-35-(-26.11108)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -27.5 + (((tickAnim - 2) / 1) * (-43.45608-(-27.5)));
            yy = 15 + (((tickAnim - 2) / 1) * (15.79951-(15)));
            zz = -35 + (((tickAnim - 2) / 1) * (13.64417-(-35)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -43.45608 + (((tickAnim - 3) / 0) * (-10-(-43.45608)));
            yy = 15.79951 + (((tickAnim - 3) / 0) * (-15-(15.79951)));
            zz = 13.64417 + (((tickAnim - 3) / 0) * (30-(13.64417)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forewingright, forewingright.rotateAngleX + (float) Math.toRadians(xx), forewingright.rotateAngleY + (float) Math.toRadians(yy), forewingright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.01295 + (((tickAnim - 0) / 1) * (67.26843-(28.01295)));
            yy = -14.36611 + (((tickAnim - 0) / 1) * (-5.60045-(-14.36611)));
            zz = -18.52093 + (((tickAnim - 0) / 1) * (-88.95124-(-18.52093)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 67.26843 + (((tickAnim - 1) / 1) * (-89.43158-(67.26843)));
            yy = -5.60045 + (((tickAnim - 1) / 1) * (13.41891-(-5.60045)));
            zz = -88.95124 + (((tickAnim - 1) / 1) * (38.6557-(-88.95124)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -89.43158 + (((tickAnim - 2) / 1) * (-63.2616-(-89.43158)));
            yy = 13.41891 + (((tickAnim - 2) / 1) * (15.8477-(13.41891)));
            zz = 38.6557 + (((tickAnim - 2) / 1) * (33.62629-(38.6557)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -63.2616 + (((tickAnim - 3) / 0) * (28.01295-(-63.2616)));
            yy = 15.8477 + (((tickAnim - 3) / 0) * (-14.36611-(15.8477)));
            zz = 33.62629 + (((tickAnim - 3) / 0) * (-18.52093-(33.62629)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingright, hindwingright.rotateAngleX + (float) Math.toRadians(xx), hindwingright.rotateAngleY + (float) Math.toRadians(yy), hindwingright.rotateAngleZ + (float) Math.toRadians(zz));



        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(0), legleft.rotateAngleZ + (float) Math.toRadians(40));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(0), legleft2.rotateAngleY + (float) Math.toRadians(0), legleft2.rotateAngleZ + (float) Math.toRadians(50));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(0), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(70));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -10 + (((tickAnim - 0) / 1) * (21.71272-(-10)));
            yy = 15 + (((tickAnim - 0) / 1) * (-1.61907-(15)));
            zz = -30 + (((tickAnim - 0) / 1) * (26.11108-(-30)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 21.71272 + (((tickAnim - 1) / 1) * (-27.5-(21.71272)));
            yy = -1.61907 + (((tickAnim - 1) / 1) * (-15-(-1.61907)));
            zz = 26.11108 + (((tickAnim - 1) / 1) * (35-(26.11108)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -27.5 + (((tickAnim - 2) / 1) * (-43.45608-(-27.5)));
            yy = -15 + (((tickAnim - 2) / 1) * (-15.79951-(-15)));
            zz = 35 + (((tickAnim - 2) / 1) * (-13.64417-(35)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -43.45608 + (((tickAnim - 3) / 0) * (-10-(-43.45608)));
            yy = -15.79951 + (((tickAnim - 3) / 0) * (15-(-15.79951)));
            zz = -13.64417 + (((tickAnim - 3) / 0) * (-30-(-13.64417)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(forewingleft, forewingleft.rotateAngleX + (float) Math.toRadians(xx), forewingleft.rotateAngleY + (float) Math.toRadians(yy), forewingleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 28.01295 + (((tickAnim - 0) / 1) * (67.26843-(28.01295)));
            yy = 14.36611 + (((tickAnim - 0) / 1) * (5.60045-(14.36611)));
            zz = 18.52093 + (((tickAnim - 0) / 1) * (88.95124-(18.52093)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 67.26843 + (((tickAnim - 1) / 1) * (-89.43158-(67.26843)));
            yy = 5.60045 + (((tickAnim - 1) / 1) * (-13.41891-(5.60045)));
            zz = 88.95124 + (((tickAnim - 1) / 1) * (-38.6557-(88.95124)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -89.43158 + (((tickAnim - 2) / 1) * (-63.2616-(-89.43158)));
            yy = -13.41891 + (((tickAnim - 2) / 1) * (-15.8477-(-13.41891)));
            zz = -38.6557 + (((tickAnim - 2) / 1) * (-33.62629-(-38.6557)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -63.2616 + (((tickAnim - 3) / 0) * (28.01295-(-63.2616)));
            yy = -15.8477 + (((tickAnim - 3) / 0) * (14.36611-(-15.8477)));
            zz = -33.62629 + (((tickAnim - 3) / 0) * (18.52093-(-33.62629)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingleft, hindwingleft.rotateAngleX + (float) Math.toRadians(xx), hindwingleft.rotateAngleY + (float) Math.toRadians(yy), hindwingleft.rotateAngleZ + (float) Math.toRadians(zz));

    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
