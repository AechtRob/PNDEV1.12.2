package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraKalligrammatid;
import net.lepidodendron.entity.EntityPrehistoricFloraLacewing;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKalligrammatid extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer antennaR;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer hindwingL;
    private final AdvancedModelRenderer forewingL;
    private final AdvancedModelRenderer forewingR;
    private final AdvancedModelRenderer hindwingR;
    private final AdvancedModelRenderer legL1;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;

    public ModelKalligrammatid() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 29, -1.0F, -4.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.75F, -3.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 34, -0.5F, 0.25F, -1.5F, 1, 1, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, -0.85F, 0.25F, -1.4F, 1, 1, 1, -0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 37, -0.15F, 0.25F, -1.4F, 1, 1, 1, -0.02F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.75F, -1.5F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, 0.0F, -0.1F, -1.8F, 0, 1, 2, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-0.25F, 0.75F, -1.5F);
        this.head.addChild(antennaR);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 3, 0.0F, -3.0F, -3.0F, 0, 3, 3, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(0.25F, 0.75F, -1.5F);
        this.head.addChild(antennaL);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, -3.0F, -3.0F, 0, 3, 3, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -3.9F, 0.0F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 26, 26, -1.0F, -0.05F, 0.0F, 2, 2, 6, 0.01F, false));

        this.hindwingL = new AdvancedModelRenderer(this);
        this.hindwingL.setRotationPoint(1.0F, -3.8F, -1.0F);
        this.body.addChild(hindwingL);
        this.hindwingL.cubeList.add(new ModelBox(hindwingL, 0, 16, 0.0F, 0.0F, -1.0F, 12, 0, 8, 0.0F, false));

        this.forewingL = new AdvancedModelRenderer(this);
        this.forewingL.setRotationPoint(1.0F, -4.0F, -2.0F);
        this.body.addChild(forewingL);
        this.forewingL.cubeList.add(new ModelBox(forewingL, 0, 0, 0.0F, -0.01F, -5.0F, 12, 0, 8, 0.0F, false));

        this.forewingR = new AdvancedModelRenderer(this);
        this.forewingR.setRotationPoint(-1.0F, -4.0F, -2.0F);
        this.body.addChild(forewingR);
        this.forewingR.cubeList.add(new ModelBox(forewingR, 0, 8, -12.0F, -0.011F, -5.0F, 12, 0, 8, 0.0F, false));

        this.hindwingR = new AdvancedModelRenderer(this);
        this.hindwingR.setRotationPoint(-1.0F, -3.8F, -1.0F);
        this.body.addChild(hindwingR);
        this.hindwingR.cubeList.add(new ModelBox(hindwingR, 0, 24, -12.0F, -0.001F, -1.0F, 12, 0, 8, 0.0F, false));

        this.legL1 = new AdvancedModelRenderer(this);
        this.legL1.setRotationPoint(1.0F, -3.0F, -2.5F);
        this.body.addChild(legL1);
        this.legL1.cubeList.add(new ModelBox(legL1, 0, 25, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -3.0F, -1.5F);
        this.body.addChild(legL2);
        this.legL2.cubeList.add(new ModelBox(legL2, 0, 22, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -3.0F, -0.5F);
        this.body.addChild(legL3);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 19, 0.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -3.0F, -2.5F);
        this.body.addChild(legR1);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 16, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -3.0F, -1.5F);
        this.body.addChild(legR2);
        this.legR2.cubeList.add(new ModelBox(legR2, 0, 13, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -3.0F, -0.5F);
        this.body.addChild(legR3);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 0, -3.0F, 0.0F, 0.0F, 3, 3, 0, 0.0F, false));
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
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.offsetZ = -0.1F;
        this.body.render(0.022f);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        EntityPrehistoricFloraKalligrammatid ee = (EntityPrehistoricFloraKalligrammatid) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

                this.setRotateAngle(head, head.rotateAngleX+(float)Math.toRadians(7.5), head.rotateAngleY, head.rotateAngleZ);
                this.setRotateAngle(antennaR, head.rotateAngleX+(float)Math.toRadians(-15), head.rotateAngleY+(float)Math.toRadians(15), head.rotateAngleZ+(float)Math.toRadians(-20));
                this.setRotateAngle(antennaL, head.rotateAngleX+(float)Math.toRadians(-15), head.rotateAngleY+(float)Math.toRadians(-15), head.rotateAngleZ+(float)Math.toRadians(20));
                this.setRotateAngle(abdomen, head.rotateAngleX+(float)Math.toRadians(-10), head.rotateAngleY, head.rotateAngleZ);
                this.setRotateAngle(hindwingL, head.rotateAngleX+(float)Math.toRadians(2.5), head.rotateAngleY+(float)Math.toRadians(-50), head.rotateAngleZ+(float)Math.toRadians(40));
                this.setRotateAngle(forewingR, head.rotateAngleX+(float)Math.toRadians(10), head.rotateAngleY+(float)Math.toRadians(75), head.rotateAngleZ+(float)Math.toRadians(-35));
                this.setRotateAngle(forewingL, head.rotateAngleX+(float)Math.toRadians(10), head.rotateAngleY+(float)Math.toRadians(-75), head.rotateAngleZ+(float)Math.toRadians(35));
                this.setRotateAngle(hindwingR, head.rotateAngleX+(float)Math.toRadians(2.5), head.rotateAngleY+(float)Math.toRadians(50), head.rotateAngleZ+(float)Math.toRadians(-40));
                this.setRotateAngle(legL1, head.rotateAngleX+(float)Math.toRadians(0), head.rotateAngleY+(float)Math.toRadians(30), head.rotateAngleZ+(float)Math.toRadians(0));
                this.setRotateAngle(legR1, head.rotateAngleX+(float)Math.toRadians(0), head.rotateAngleY+(float)Math.toRadians(-30), head.rotateAngleZ+(float)Math.toRadians(0));
                this.setRotateAngle(legR3, head.rotateAngleX+(float)Math.toRadians(0), head.rotateAngleY+(float)Math.toRadians(50), head.rotateAngleZ+(float)Math.toRadians(0));
                this.setRotateAngle(legL3, head.rotateAngleX+(float)Math.toRadians(0), head.rotateAngleY+(float)Math.toRadians(-50), head.rotateAngleZ+(float)Math.toRadians(0));
            }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKalligrammatid entity = (EntityPrehistoricFloraKalligrammatid) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(7.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(antennaR, antennaR.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5-30))*5), antennaR.rotateAngleY + (float) Math.toRadians(15), antennaR.rotateAngleZ + (float) Math.toRadians(-20));
        this.setRotateAngle(antennaL, antennaL.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+30))*5), antennaL.rotateAngleY + (float) Math.toRadians(-15), antennaL.rotateAngleZ + (float) Math.toRadians(20));
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5+30))*2.5), abdomen.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*180/0.5-60))*2.5), abdomen.rotateAngleZ + (float) Math.toRadians(0));
        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -27.13504D + (((tickAnim - 0D) / 1D) * (16.18147D-(-27.13504D)));
            yy = -19.65143D + (((tickAnim - 0D) / 1D) * (-13.67262D-(-19.65143D)));
            zz = -9.45554D + (((tickAnim - 0D) / 1D) * (-5.20376D-(-9.45554D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 16.18147D + (((tickAnim - 1D) / 1D) * (23.99103D-(16.18147D)));
            yy = -13.67262D + (((tickAnim - 1D) / 1D) * (1.06969D-(-13.67262D)));
            zz = -5.20376D + (((tickAnim - 1D) / 1D) * (54.69259D-(-5.20376D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.99103D + (((tickAnim - 2D) / 1D) * (-35.6526D-(23.99103D)));
            yy = 1.06969D + (((tickAnim - 2D) / 1D) * (1.04572D-(1.06969D)));
            zz = 54.69259D + (((tickAnim - 2D) / 1D) * (28.64016D-(54.69259D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -35.6526D + (((tickAnim - 3D) / 0D) * (-27.13504D-(-35.6526D)));
            yy = 1.04572D + (((tickAnim - 3D) / 0D) * (-19.65143D-(1.04572D)));
            zz = 28.64016D + (((tickAnim - 3D) / 0D) * (-9.45554D-(28.64016D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.13504D + (((tickAnim - 3D) / 1D) * (16.18147D-(-27.13504D)));
            yy = -19.65143D + (((tickAnim - 3D) / 1D) * (-13.67262D-(-19.65143D)));
            zz = -9.45554D + (((tickAnim - 3D) / 1D) * (-5.20376D-(-9.45554D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 16.18147D + (((tickAnim - 4D) / 1D) * (23.99103D-(16.18147D)));
            yy = -13.67262D + (((tickAnim - 4D) / 1D) * (1.06969D-(-13.67262D)));
            zz = -5.20376D + (((tickAnim - 4D) / 1D) * (54.69259D-(-5.20376D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 23.99103D + (((tickAnim - 5D) / 1D) * (-35.6526D-(23.99103D)));
            yy = 1.06969D + (((tickAnim - 5D) / 1D) * (1.04572D-(1.06969D)));
            zz = 54.69259D + (((tickAnim - 5D) / 1D) * (28.64016D-(54.69259D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -35.6526D + (((tickAnim - 6D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = 1.04572D + (((tickAnim - 6D) / 1D) * (-19.65143D-(1.04572D)));
            zz = 28.64016D + (((tickAnim - 6D) / 1D) * (-9.45554D-(28.64016D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -27.13504D + (((tickAnim - 7D) / 1D) * (16.18147D-(-27.13504D)));
            yy = -19.65143D + (((tickAnim - 7D) / 1D) * (-13.67262D-(-19.65143D)));
            zz = -9.45554D + (((tickAnim - 7D) / 1D) * (-5.20376D-(-9.45554D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 16.18147D + (((tickAnim - 8D) / 0D) * (23.99103D-(16.18147D)));
            yy = -13.67262D + (((tickAnim - 8D) / 0D) * (1.06969D-(-13.67262D)));
            zz = -5.20376D + (((tickAnim - 8D) / 0D) * (54.69259D-(-5.20376D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 23.99103D + (((tickAnim - 8D) / 1D) * (-35.6526D-(23.99103D)));
            yy = 1.06969D + (((tickAnim - 8D) / 1D) * (1.04572D-(1.06969D)));
            zz = 54.69259D + (((tickAnim - 8D) / 1D) * (28.64016D-(54.69259D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -35.6526D + (((tickAnim - 9D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = 1.04572D + (((tickAnim - 9D) / 1D) * (-19.65143D-(1.04572D)));
            zz = 28.64016D + (((tickAnim - 9D) / 1D) * (-9.45554D-(28.64016D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -27.13504D + (((tickAnim - 10D) / 1D) * (16.18147D-(-27.13504D)));
            yy = -19.65143D + (((tickAnim - 10D) / 1D) * (-13.67262D-(-19.65143D)));
            zz = -9.45554D + (((tickAnim - 10D) / 1D) * (-5.20376D-(-9.45554D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 16.18147D + (((tickAnim - 11D) / 1D) * (23.99103D-(16.18147D)));
            yy = -13.67262D + (((tickAnim - 11D) / 1D) * (1.06969D-(-13.67262D)));
            zz = -5.20376D + (((tickAnim - 11D) / 1D) * (54.69259D-(-5.20376D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 23.99103D + (((tickAnim - 12D) / 1D) * (-35.6526D-(23.99103D)));
            yy = 1.06969D + (((tickAnim - 12D) / 1D) * (1.04572D-(1.06969D)));
            zz = 54.69259D + (((tickAnim - 12D) / 1D) * (28.64016D-(54.69259D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -35.6526D + (((tickAnim - 13D) / 0D) * (-27.13504D-(-35.6526D)));
            yy = 1.04572D + (((tickAnim - 13D) / 0D) * (-19.65143D-(1.04572D)));
            zz = 28.64016D + (((tickAnim - 13D) / 0D) * (-9.45554D-(28.64016D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -27.13504D + (((tickAnim - 13D) / 1D) * (16.18147D-(-27.13504D)));
            yy = -19.65143D + (((tickAnim - 13D) / 1D) * (-13.67262D-(-19.65143D)));
            zz = -9.45554D + (((tickAnim - 13D) / 1D) * (-5.20376D-(-9.45554D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 16.18147D + (((tickAnim - 14D) / 1D) * (23.99103D-(16.18147D)));
            yy = -13.67262D + (((tickAnim - 14D) / 1D) * (1.06969D-(-13.67262D)));
            zz = -5.20376D + (((tickAnim - 14D) / 1D) * (54.69259D-(-5.20376D)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 23.99103D + (((tickAnim - 15D) / 1D) * (-35.6526D-(23.99103D)));
            yy = 1.06969D + (((tickAnim - 15D) / 1D) * (1.04572D-(1.06969D)));
            zz = 54.69259D + (((tickAnim - 15D) / 1D) * (28.64016D-(54.69259D)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -35.6526D + (((tickAnim - 16D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = 1.04572D + (((tickAnim - 16D) / 1D) * (-19.65143D-(1.04572D)));
            zz = 28.64016D + (((tickAnim - 16D) / 1D) * (-9.45554D-(28.64016D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -27.13504D + (((tickAnim - 17D) / 1D) * (16.18147D-(-27.13504D)));
            yy = -19.65143D + (((tickAnim - 17D) / 1D) * (-13.67262D-(-19.65143D)));
            zz = -9.45554D + (((tickAnim - 17D) / 1D) * (-5.20376D-(-9.45554D)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 16.18147D + (((tickAnim - 18D) / 0D) * (23.99103D-(16.18147D)));
            yy = -13.67262D + (((tickAnim - 18D) / 0D) * (1.06969D-(-13.67262D)));
            zz = -5.20376D + (((tickAnim - 18D) / 0D) * (54.69259D-(-5.20376D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 23.99103D + (((tickAnim - 18D) / 1D) * (-35.6526D-(23.99103D)));
            yy = 1.06969D + (((tickAnim - 18D) / 1D) * (1.04572D-(1.06969D)));
            zz = 54.69259D + (((tickAnim - 18D) / 1D) * (28.64016D-(54.69259D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -35.6526D + (((tickAnim - 19D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = 1.04572D + (((tickAnim - 19D) / 1D) * (-19.65143D-(1.04572D)));
            zz = 28.64016D + (((tickAnim - 19D) / 1D) * (-9.45554D-(28.64016D)));
        }
        this.setRotateAngle(hindwingL, hindwingL.rotateAngleX + (float) Math.toRadians(xx), hindwingL.rotateAngleY + (float) Math.toRadians(yy), hindwingL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -33.14249D + (((tickAnim - 0D) / 1D) * (23.24719D-(-33.14249D)));
            yy = -19.703D + (((tickAnim - 0D) / 1D) * (-10.92711D-(-19.703D)));
            zz = -56.42579D + (((tickAnim - 0D) / 1D) * (3.45085D-(-56.42579D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 23.24719D + (((tickAnim - 1D) / 1D) * (17.66159D-(23.24719D)));
            yy = -10.92711D + (((tickAnim - 1D) / 1D) * (10.88682D-(-10.92711D)));
            zz = 3.45085D + (((tickAnim - 1D) / 1D) * (51.10223D-(3.45085D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.66159D + (((tickAnim - 2D) / 1D) * (-66.35877D-(17.66159D)));
            yy = 10.88682D + (((tickAnim - 2D) / 1D) * (-7.27998D-(10.88682D)));
            zz = 51.10223D + (((tickAnim - 2D) / 1D) * (-16.2646D-(51.10223D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -66.35877D + (((tickAnim - 3D) / 0D) * (-33.14249D-(-66.35877D)));
            yy = -7.27998D + (((tickAnim - 3D) / 0D) * (-19.703D-(-7.27998D)));
            zz = -16.2646D + (((tickAnim - 3D) / 0D) * (-56.42579D-(-16.2646D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -33.14249D + (((tickAnim - 3D) / 1D) * (23.24719D-(-33.14249D)));
            yy = -19.703D + (((tickAnim - 3D) / 1D) * (-10.92711D-(-19.703D)));
            zz = -56.42579D + (((tickAnim - 3D) / 1D) * (3.45085D-(-56.42579D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 23.24719D + (((tickAnim - 4D) / 1D) * (17.66159D-(23.24719D)));
            yy = -10.92711D + (((tickAnim - 4D) / 1D) * (10.88682D-(-10.92711D)));
            zz = 3.45085D + (((tickAnim - 4D) / 1D) * (51.10223D-(3.45085D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 17.66159D + (((tickAnim - 5D) / 1D) * (-66.35877D-(17.66159D)));
            yy = 10.88682D + (((tickAnim - 5D) / 1D) * (-7.27998D-(10.88682D)));
            zz = 51.10223D + (((tickAnim - 5D) / 1D) * (-16.2646D-(51.10223D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -66.35877D + (((tickAnim - 6D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = -7.27998D + (((tickAnim - 6D) / 1D) * (-19.703D-(-7.27998D)));
            zz = -16.2646D + (((tickAnim - 6D) / 1D) * (-56.42579D-(-16.2646D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -33.14249D + (((tickAnim - 7D) / 1D) * (23.24719D-(-33.14249D)));
            yy = -19.703D + (((tickAnim - 7D) / 1D) * (-10.92711D-(-19.703D)));
            zz = -56.42579D + (((tickAnim - 7D) / 1D) * (3.45085D-(-56.42579D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 23.24719D + (((tickAnim - 8D) / 0D) * (17.66159D-(23.24719D)));
            yy = -10.92711D + (((tickAnim - 8D) / 0D) * (10.88682D-(-10.92711D)));
            zz = 3.45085D + (((tickAnim - 8D) / 0D) * (51.10223D-(3.45085D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 17.66159D + (((tickAnim - 8D) / 1D) * (-66.35877D-(17.66159D)));
            yy = 10.88682D + (((tickAnim - 8D) / 1D) * (-7.27998D-(10.88682D)));
            zz = 51.10223D + (((tickAnim - 8D) / 1D) * (-16.2646D-(51.10223D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -66.35877D + (((tickAnim - 9D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = -7.27998D + (((tickAnim - 9D) / 1D) * (-19.703D-(-7.27998D)));
            zz = -16.2646D + (((tickAnim - 9D) / 1D) * (-56.42579D-(-16.2646D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -33.14249D + (((tickAnim - 10D) / 1D) * (23.24719D-(-33.14249D)));
            yy = -19.703D + (((tickAnim - 10D) / 1D) * (-10.92711D-(-19.703D)));
            zz = -56.42579D + (((tickAnim - 10D) / 1D) * (3.45085D-(-56.42579D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 23.24719D + (((tickAnim - 11D) / 1D) * (17.66159D-(23.24719D)));
            yy = -10.92711D + (((tickAnim - 11D) / 1D) * (10.88682D-(-10.92711D)));
            zz = 3.45085D + (((tickAnim - 11D) / 1D) * (51.10223D-(3.45085D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 17.66159D + (((tickAnim - 12D) / 1D) * (-66.35877D-(17.66159D)));
            yy = 10.88682D + (((tickAnim - 12D) / 1D) * (-7.27998D-(10.88682D)));
            zz = 51.10223D + (((tickAnim - 12D) / 1D) * (-16.2646D-(51.10223D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -66.35877D + (((tickAnim - 13D) / 0D) * (-33.14249D-(-66.35877D)));
            yy = -7.27998D + (((tickAnim - 13D) / 0D) * (-19.703D-(-7.27998D)));
            zz = -16.2646D + (((tickAnim - 13D) / 0D) * (-56.42579D-(-16.2646D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -33.14249D + (((tickAnim - 13D) / 1D) * (23.24719D-(-33.14249D)));
            yy = -19.703D + (((tickAnim - 13D) / 1D) * (-10.92711D-(-19.703D)));
            zz = -56.42579D + (((tickAnim - 13D) / 1D) * (3.45085D-(-56.42579D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 23.24719D + (((tickAnim - 14D) / 1D) * (17.66159D-(23.24719D)));
            yy = -10.92711D + (((tickAnim - 14D) / 1D) * (10.88682D-(-10.92711D)));
            zz = 3.45085D + (((tickAnim - 14D) / 1D) * (51.10223D-(3.45085D)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 17.66159D + (((tickAnim - 15D) / 1D) * (-66.35877D-(17.66159D)));
            yy = 10.88682D + (((tickAnim - 15D) / 1D) * (-7.27998D-(10.88682D)));
            zz = 51.10223D + (((tickAnim - 15D) / 1D) * (-16.2646D-(51.10223D)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -66.35877D + (((tickAnim - 16D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = -7.27998D + (((tickAnim - 16D) / 1D) * (-19.703D-(-7.27998D)));
            zz = -16.2646D + (((tickAnim - 16D) / 1D) * (-56.42579D-(-16.2646D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -33.14249D + (((tickAnim - 17D) / 1D) * (23.24719D-(-33.14249D)));
            yy = -19.703D + (((tickAnim - 17D) / 1D) * (-10.92711D-(-19.703D)));
            zz = -56.42579D + (((tickAnim - 17D) / 1D) * (3.45085D-(-56.42579D)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 23.24719D + (((tickAnim - 18D) / 0D) * (17.66159D-(23.24719D)));
            yy = -10.92711D + (((tickAnim - 18D) / 0D) * (10.88682D-(-10.92711D)));
            zz = 3.45085D + (((tickAnim - 18D) / 0D) * (51.10223D-(3.45085D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 17.66159D + (((tickAnim - 18D) / 1D) * (-66.35877D-(17.66159D)));
            yy = 10.88682D + (((tickAnim - 18D) / 1D) * (-7.27998D-(10.88682D)));
            zz = 51.10223D + (((tickAnim - 18D) / 1D) * (-16.2646D-(51.10223D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -66.35877D + (((tickAnim - 19D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = -7.27998D + (((tickAnim - 19D) / 1D) * (-19.703D-(-7.27998D)));
            zz = -16.2646D + (((tickAnim - 19D) / 1D) * (-56.42579D-(-16.2646D)));
        }
        this.setRotateAngle(forewingL, forewingL.rotateAngleX + (float) Math.toRadians(xx), forewingL.rotateAngleY + (float) Math.toRadians(yy), forewingL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -33.14249D + (((tickAnim - 0D) / 1D) * (23.24719D-(-33.14249D)));
            yy = 19.703D + (((tickAnim - 0D) / 1D) * (10.92711D-(19.703D)));
            zz = 56.42579D + (((tickAnim - 0D) / 1D) * (-3.45085D-(56.42579D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 23.24719D + (((tickAnim - 1D) / 1D) * (17.66159D-(23.24719D)));
            yy = 10.92711D + (((tickAnim - 1D) / 1D) * (-10.88682D-(10.92711D)));
            zz = -3.45085D + (((tickAnim - 1D) / 1D) * (-51.10223D-(-3.45085D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.66159D + (((tickAnim - 2D) / 1D) * (-66.35877D-(17.66159D)));
            yy = -10.88682D + (((tickAnim - 2D) / 1D) * (7.27998D-(-10.88682D)));
            zz = -51.10223D + (((tickAnim - 2D) / 1D) * (16.2646D-(-51.10223D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -66.35877D + (((tickAnim - 3D) / 0D) * (-33.14249D-(-66.35877D)));
            yy = 7.27998D + (((tickAnim - 3D) / 0D) * (19.703D-(7.27998D)));
            zz = 16.2646D + (((tickAnim - 3D) / 0D) * (56.42579D-(16.2646D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -33.14249D + (((tickAnim - 3D) / 1D) * (23.24719D-(-33.14249D)));
            yy = 19.703D + (((tickAnim - 3D) / 1D) * (10.92711D-(19.703D)));
            zz = 56.42579D + (((tickAnim - 3D) / 1D) * (-3.45085D-(56.42579D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 23.24719D + (((tickAnim - 4D) / 1D) * (17.66159D-(23.24719D)));
            yy = 10.92711D + (((tickAnim - 4D) / 1D) * (-10.88682D-(10.92711D)));
            zz = -3.45085D + (((tickAnim - 4D) / 1D) * (-51.10223D-(-3.45085D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 17.66159D + (((tickAnim - 5D) / 1D) * (-66.35877D-(17.66159D)));
            yy = -10.88682D + (((tickAnim - 5D) / 1D) * (7.27998D-(-10.88682D)));
            zz = -51.10223D + (((tickAnim - 5D) / 1D) * (16.2646D-(-51.10223D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -66.35877D + (((tickAnim - 6D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = 7.27998D + (((tickAnim - 6D) / 1D) * (19.703D-(7.27998D)));
            zz = 16.2646D + (((tickAnim - 6D) / 1D) * (56.42579D-(16.2646D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -33.14249D + (((tickAnim - 7D) / 1D) * (23.24719D-(-33.14249D)));
            yy = 19.703D + (((tickAnim - 7D) / 1D) * (10.92711D-(19.703D)));
            zz = 56.42579D + (((tickAnim - 7D) / 1D) * (-3.45085D-(56.42579D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 23.24719D + (((tickAnim - 8D) / 0D) * (17.66159D-(23.24719D)));
            yy = 10.92711D + (((tickAnim - 8D) / 0D) * (-10.88682D-(10.92711D)));
            zz = -3.45085D + (((tickAnim - 8D) / 0D) * (-51.10223D-(-3.45085D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 17.66159D + (((tickAnim - 8D) / 1D) * (-66.35877D-(17.66159D)));
            yy = -10.88682D + (((tickAnim - 8D) / 1D) * (7.27998D-(-10.88682D)));
            zz = -51.10223D + (((tickAnim - 8D) / 1D) * (16.2646D-(-51.10223D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -66.35877D + (((tickAnim - 9D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = 7.27998D + (((tickAnim - 9D) / 1D) * (19.703D-(7.27998D)));
            zz = 16.2646D + (((tickAnim - 9D) / 1D) * (56.42579D-(16.2646D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -33.14249D + (((tickAnim - 10D) / 1D) * (23.24719D-(-33.14249D)));
            yy = 19.703D + (((tickAnim - 10D) / 1D) * (10.92711D-(19.703D)));
            zz = 56.42579D + (((tickAnim - 10D) / 1D) * (-3.45085D-(56.42579D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 23.24719D + (((tickAnim - 11D) / 1D) * (17.66159D-(23.24719D)));
            yy = 10.92711D + (((tickAnim - 11D) / 1D) * (-10.88682D-(10.92711D)));
            zz = -3.45085D + (((tickAnim - 11D) / 1D) * (-51.10223D-(-3.45085D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 17.66159D + (((tickAnim - 12D) / 1D) * (-66.35877D-(17.66159D)));
            yy = -10.88682D + (((tickAnim - 12D) / 1D) * (7.27998D-(-10.88682D)));
            zz = -51.10223D + (((tickAnim - 12D) / 1D) * (16.2646D-(-51.10223D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -66.35877D + (((tickAnim - 13D) / 0D) * (-33.14249D-(-66.35877D)));
            yy = 7.27998D + (((tickAnim - 13D) / 0D) * (19.703D-(7.27998D)));
            zz = 16.2646D + (((tickAnim - 13D) / 0D) * (56.42579D-(16.2646D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -33.14249D + (((tickAnim - 13D) / 1D) * (23.24719D-(-33.14249D)));
            yy = 19.703D + (((tickAnim - 13D) / 1D) * (10.92711D-(19.703D)));
            zz = 56.42579D + (((tickAnim - 13D) / 1D) * (-3.45085D-(56.42579D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 23.24719D + (((tickAnim - 14D) / 1D) * (17.66159D-(23.24719D)));
            yy = 10.92711D + (((tickAnim - 14D) / 1D) * (-10.88682D-(10.92711D)));
            zz = -3.45085D + (((tickAnim - 14D) / 1D) * (-51.10223D-(-3.45085D)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 17.66159D + (((tickAnim - 15D) / 1D) * (-66.35877D-(17.66159D)));
            yy = -10.88682D + (((tickAnim - 15D) / 1D) * (7.27998D-(-10.88682D)));
            zz = -51.10223D + (((tickAnim - 15D) / 1D) * (16.2646D-(-51.10223D)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -66.35877D + (((tickAnim - 16D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = 7.27998D + (((tickAnim - 16D) / 1D) * (19.703D-(7.27998D)));
            zz = 16.2646D + (((tickAnim - 16D) / 1D) * (56.42579D-(16.2646D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -33.14249D + (((tickAnim - 17D) / 1D) * (23.24719D-(-33.14249D)));
            yy = 19.703D + (((tickAnim - 17D) / 1D) * (10.92711D-(19.703D)));
            zz = 56.42579D + (((tickAnim - 17D) / 1D) * (-3.45085D-(56.42579D)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 23.24719D + (((tickAnim - 18D) / 0D) * (17.66159D-(23.24719D)));
            yy = 10.92711D + (((tickAnim - 18D) / 0D) * (-10.88682D-(10.92711D)));
            zz = -3.45085D + (((tickAnim - 18D) / 0D) * (-51.10223D-(-3.45085D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 17.66159D + (((tickAnim - 18D) / 1D) * (-66.35877D-(17.66159D)));
            yy = -10.88682D + (((tickAnim - 18D) / 1D) * (7.27998D-(-10.88682D)));
            zz = -51.10223D + (((tickAnim - 18D) / 1D) * (16.2646D-(-51.10223D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -66.35877D + (((tickAnim - 19D) / 1D) * (-33.14249D-(-66.35877D)));
            yy = 7.27998D + (((tickAnim - 19D) / 1D) * (19.703D-(7.27998D)));
            zz = 16.2646D + (((tickAnim - 19D) / 1D) * (56.42579D-(16.2646D)));
        }
        this.setRotateAngle(forewingR, forewingR.rotateAngleX + (float) Math.toRadians(xx), forewingR.rotateAngleY + (float) Math.toRadians(yy), forewingR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -27.13504D + (((tickAnim - 0D) / 1D) * (16.18147D-(-27.13504D)));
            yy = 19.65143D + (((tickAnim - 0D) / 1D) * (13.67262D-(19.65143D)));
            zz = 9.45554D + (((tickAnim - 0D) / 1D) * (5.20376D-(9.45554D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 16.18147D + (((tickAnim - 1D) / 1D) * (23.99103D-(16.18147D)));
            yy = 13.67262D + (((tickAnim - 1D) / 1D) * (-1.06969D-(13.67262D)));
            zz = 5.20376D + (((tickAnim - 1D) / 1D) * (-54.69259D-(5.20376D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.99103D + (((tickAnim - 2D) / 1D) * (-35.6526D-(23.99103D)));
            yy = -1.06969D + (((tickAnim - 2D) / 1D) * (-1.04572D-(-1.06969D)));
            zz = -54.69259D + (((tickAnim - 2D) / 1D) * (-28.64016D-(-54.69259D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -35.6526D + (((tickAnim - 3D) / 0D) * (-27.13504D-(-35.6526D)));
            yy = -1.04572D + (((tickAnim - 3D) / 0D) * (19.65143D-(-1.04572D)));
            zz = -28.64016D + (((tickAnim - 3D) / 0D) * (9.45554D-(-28.64016D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -27.13504D + (((tickAnim - 3D) / 1D) * (16.18147D-(-27.13504D)));
            yy = 19.65143D + (((tickAnim - 3D) / 1D) * (13.67262D-(19.65143D)));
            zz = 9.45554D + (((tickAnim - 3D) / 1D) * (5.20376D-(9.45554D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 16.18147D + (((tickAnim - 4D) / 1D) * (23.99103D-(16.18147D)));
            yy = 13.67262D + (((tickAnim - 4D) / 1D) * (-1.06969D-(13.67262D)));
            zz = 5.20376D + (((tickAnim - 4D) / 1D) * (-54.69259D-(5.20376D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 23.99103D + (((tickAnim - 5D) / 1D) * (-35.6526D-(23.99103D)));
            yy = -1.06969D + (((tickAnim - 5D) / 1D) * (-1.04572D-(-1.06969D)));
            zz = -54.69259D + (((tickAnim - 5D) / 1D) * (-28.64016D-(-54.69259D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -35.6526D + (((tickAnim - 6D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = -1.04572D + (((tickAnim - 6D) / 1D) * (19.65143D-(-1.04572D)));
            zz = -28.64016D + (((tickAnim - 6D) / 1D) * (9.45554D-(-28.64016D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -27.13504D + (((tickAnim - 7D) / 1D) * (16.18147D-(-27.13504D)));
            yy = 19.65143D + (((tickAnim - 7D) / 1D) * (13.67262D-(19.65143D)));
            zz = 9.45554D + (((tickAnim - 7D) / 1D) * (5.20376D-(9.45554D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 16.18147D + (((tickAnim - 8D) / 0D) * (23.99103D-(16.18147D)));
            yy = 13.67262D + (((tickAnim - 8D) / 0D) * (-1.06969D-(13.67262D)));
            zz = 5.20376D + (((tickAnim - 8D) / 0D) * (-54.69259D-(5.20376D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 23.99103D + (((tickAnim - 8D) / 1D) * (-35.6526D-(23.99103D)));
            yy = -1.06969D + (((tickAnim - 8D) / 1D) * (-1.04572D-(-1.06969D)));
            zz = -54.69259D + (((tickAnim - 8D) / 1D) * (-28.64016D-(-54.69259D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -35.6526D + (((tickAnim - 9D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = -1.04572D + (((tickAnim - 9D) / 1D) * (19.65143D-(-1.04572D)));
            zz = -28.64016D + (((tickAnim - 9D) / 1D) * (9.45554D-(-28.64016D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -27.13504D + (((tickAnim - 10D) / 1D) * (16.18147D-(-27.13504D)));
            yy = 19.65143D + (((tickAnim - 10D) / 1D) * (13.67262D-(19.65143D)));
            zz = 9.45554D + (((tickAnim - 10D) / 1D) * (5.20376D-(9.45554D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 16.18147D + (((tickAnim - 11D) / 1D) * (23.99103D-(16.18147D)));
            yy = 13.67262D + (((tickAnim - 11D) / 1D) * (-1.06969D-(13.67262D)));
            zz = 5.20376D + (((tickAnim - 11D) / 1D) * (-54.69259D-(5.20376D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 23.99103D + (((tickAnim - 12D) / 1D) * (-35.6526D-(23.99103D)));
            yy = -1.06969D + (((tickAnim - 12D) / 1D) * (-1.04572D-(-1.06969D)));
            zz = -54.69259D + (((tickAnim - 12D) / 1D) * (-28.64016D-(-54.69259D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = -35.6526D + (((tickAnim - 13D) / 0D) * (-27.13504D-(-35.6526D)));
            yy = -1.04572D + (((tickAnim - 13D) / 0D) * (19.65143D-(-1.04572D)));
            zz = -28.64016D + (((tickAnim - 13D) / 0D) * (9.45554D-(-28.64016D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -27.13504D + (((tickAnim - 13D) / 1D) * (16.18147D-(-27.13504D)));
            yy = 19.65143D + (((tickAnim - 13D) / 1D) * (13.67262D-(19.65143D)));
            zz = 9.45554D + (((tickAnim - 13D) / 1D) * (5.20376D-(9.45554D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 16.18147D + (((tickAnim - 14D) / 1D) * (23.99103D-(16.18147D)));
            yy = 13.67262D + (((tickAnim - 14D) / 1D) * (-1.06969D-(13.67262D)));
            zz = 5.20376D + (((tickAnim - 14D) / 1D) * (-54.69259D-(5.20376D)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 23.99103D + (((tickAnim - 15D) / 1D) * (-35.6526D-(23.99103D)));
            yy = -1.06969D + (((tickAnim - 15D) / 1D) * (-1.04572D-(-1.06969D)));
            zz = -54.69259D + (((tickAnim - 15D) / 1D) * (-28.64016D-(-54.69259D)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -35.6526D + (((tickAnim - 16D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = -1.04572D + (((tickAnim - 16D) / 1D) * (19.65143D-(-1.04572D)));
            zz = -28.64016D + (((tickAnim - 16D) / 1D) * (9.45554D-(-28.64016D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -27.13504D + (((tickAnim - 17D) / 1D) * (16.18147D-(-27.13504D)));
            yy = 19.65143D + (((tickAnim - 17D) / 1D) * (13.67262D-(19.65143D)));
            zz = 9.45554D + (((tickAnim - 17D) / 1D) * (5.20376D-(9.45554D)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 16.18147D + (((tickAnim - 18D) / 0D) * (23.99103D-(16.18147D)));
            yy = 13.67262D + (((tickAnim - 18D) / 0D) * (-1.06969D-(13.67262D)));
            zz = 5.20376D + (((tickAnim - 18D) / 0D) * (-54.69259D-(5.20376D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 23.99103D + (((tickAnim - 18D) / 1D) * (-35.6526D-(23.99103D)));
            yy = -1.06969D + (((tickAnim - 18D) / 1D) * (-1.04572D-(-1.06969D)));
            zz = -54.69259D + (((tickAnim - 18D) / 1D) * (-28.64016D-(-54.69259D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -35.6526D + (((tickAnim - 19D) / 1D) * (-27.13504D-(-35.6526D)));
            yy = -1.04572D + (((tickAnim - 19D) / 1D) * (19.65143D-(-1.04572D)));
            zz = -28.64016D + (((tickAnim - 19D) / 1D) * (9.45554D-(-28.64016D)));
        }
        this.setRotateAngle(hindwingR, hindwingR.rotateAngleX + (float) Math.toRadians(xx), hindwingR.rotateAngleY + (float) Math.toRadians(yy), hindwingR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -69.53365D + (((tickAnim - 0D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = 54.99861D + (((tickAnim - 0D) / 3D) * (52.6475D-(54.99861D)));
            zz = -79.82376D + (((tickAnim - 0D) / 3D) * (-81.26423D-(-79.82376D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -70.69666D + (((tickAnim - 3D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = 52.6475D + (((tickAnim - 3D) / 2D) * (54.99861D-(52.6475D)));
            zz = -81.26423D + (((tickAnim - 3D) / 2D) * (-79.82376D-(-81.26423D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -69.53365D + (((tickAnim - 5D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = 54.99861D + (((tickAnim - 5D) / 3D) * (52.6475D-(54.99861D)));
            zz = -79.82376D + (((tickAnim - 5D) / 3D) * (-81.26423D-(-79.82376D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -70.69666D + (((tickAnim - 8D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = 52.6475D + (((tickAnim - 8D) / 2D) * (54.99861D-(52.6475D)));
            zz = -81.26423D + (((tickAnim - 8D) / 2D) * (-79.82376D-(-81.26423D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -69.53365D + (((tickAnim - 10D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = 54.99861D + (((tickAnim - 10D) / 3D) * (52.6475D-(54.99861D)));
            zz = -79.82376D + (((tickAnim - 10D) / 3D) * (-81.26423D-(-79.82376D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -70.69666D + (((tickAnim - 13D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = 52.6475D + (((tickAnim - 13D) / 2D) * (54.99861D-(52.6475D)));
            zz = -81.26423D + (((tickAnim - 13D) / 2D) * (-79.82376D-(-81.26423D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -69.53365D + (((tickAnim - 15D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = 54.99861D + (((tickAnim - 15D) / 3D) * (52.6475D-(54.99861D)));
            zz = -79.82376D + (((tickAnim - 15D) / 3D) * (-81.26423D-(-79.82376D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -70.69666D + (((tickAnim - 18D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = 52.6475D + (((tickAnim - 18D) / 2D) * (54.99861D-(52.6475D)));
            zz = -81.26423D + (((tickAnim - 18D) / 2D) * (-79.82376D-(-81.26423D)));
        }
        this.setRotateAngle(legL1, legL1.rotateAngleX + (float) Math.toRadians(xx), legL1.rotateAngleY + (float) Math.toRadians(yy), legL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9.31D + (((tickAnim - 0D) / 1D) * (-9.00717D-(-9.31D)));
            yy = 20.57D + (((tickAnim - 0D) / 1D) * (20.70481D-(20.57D)));
            zz = 9.97D + (((tickAnim - 0D) / 1D) * (10.85133D-(9.97D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -9.00717D + (((tickAnim - 1D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = 20.70481D + (((tickAnim - 1D) / 2D) * (20.29348D-(20.70481D)));
            zz = 10.85133D + (((tickAnim - 1D) / 2D) * (8.21865D-(10.85133D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.92926D + (((tickAnim - 3D) / 3D) * (-9.00717D-(-9.92926D)));
            yy = 20.29348D + (((tickAnim - 3D) / 3D) * (20.70481D-(20.29348D)));
            zz = 8.21865D + (((tickAnim - 3D) / 3D) * (10.85133D-(8.21865D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.00717D + (((tickAnim - 6D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = 20.70481D + (((tickAnim - 6D) / 2D) * (20.29348D-(20.70481D)));
            zz = 10.85133D + (((tickAnim - 6D) / 2D) * (8.21865D-(10.85133D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9.92926D + (((tickAnim - 8D) / 3D) * (-9.00717D-(-9.92926D)));
            yy = 20.29348D + (((tickAnim - 8D) / 3D) * (20.70481D-(20.29348D)));
            zz = 8.21865D + (((tickAnim - 8D) / 3D) * (10.85133D-(8.21865D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -9.00717D + (((tickAnim - 11D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = 20.70481D + (((tickAnim - 11D) / 2D) * (20.29348D-(20.70481D)));
            zz = 10.85133D + (((tickAnim - 11D) / 2D) * (8.21865D-(10.85133D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.92926D + (((tickAnim - 13D) / 3D) * (-9.00717D-(-9.92926D)));
            yy = 20.29348D + (((tickAnim - 13D) / 3D) * (20.70481D-(20.29348D)));
            zz = 8.21865D + (((tickAnim - 13D) / 3D) * (10.85133D-(8.21865D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -9.00717D + (((tickAnim - 16D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = 20.70481D + (((tickAnim - 16D) / 2D) * (20.29348D-(20.70481D)));
            zz = 10.85133D + (((tickAnim - 16D) / 2D) * (8.21865D-(10.85133D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.92926D + (((tickAnim - 18D) / 2D) * (-9.31D-(-9.92926D)));
            yy = 20.29348D + (((tickAnim - 18D) / 2D) * (20.57D-(20.29348D)));
            zz = 8.21865D + (((tickAnim - 18D) / 2D) * (9.97D-(8.21865D)));
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.61D + (((tickAnim - 0D) / 2D) * (0D-(0.61D)));
            yy = -19.99D + (((tickAnim - 0D) / 2D) * (-20D-(-19.99D)));
            zz = 33.23D + (((tickAnim - 0D) / 2D) * (35D-(33.23D)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 2D) / 2D) * (0.90956D-(0D)));
            yy = -20D + (((tickAnim - 2D) / 2D) * (-19.98015D-(-20D)));
            zz = 35D + (((tickAnim - 2D) / 2D) * (32.33978D-(35D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.90956D + (((tickAnim - 4D) / 3D) * (0D-(0.90956D)));
            yy = -19.98015D + (((tickAnim - 4D) / 3D) * (-20D-(-19.98015D)));
            zz = 32.33978D + (((tickAnim - 4D) / 3D) * (35D-(32.33978D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0.90956D-(0D)));
            yy = -20D + (((tickAnim - 7D) / 2D) * (-19.98015D-(-20D)));
            zz = 35D + (((tickAnim - 7D) / 2D) * (32.33978D-(35D)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.90956D + (((tickAnim - 9D) / 3D) * (0D-(0.90956D)));
            yy = -19.98015D + (((tickAnim - 9D) / 3D) * (-20D-(-19.98015D)));
            zz = 32.33978D + (((tickAnim - 9D) / 3D) * (35D-(32.33978D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0.90956D-(0D)));
            yy = -20D + (((tickAnim - 12D) / 2D) * (-19.98015D-(-20D)));
            zz = 35D + (((tickAnim - 12D) / 2D) * (32.33978D-(35D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.90956D + (((tickAnim - 14D) / 3D) * (0D-(0.90956D)));
            yy = -19.98015D + (((tickAnim - 14D) / 3D) * (-20D-(-19.98015D)));
            zz = 32.33978D + (((tickAnim - 14D) / 3D) * (35D-(32.33978D)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 17D) / 2D) * (0.90956D-(0D)));
            yy = -20D + (((tickAnim - 17D) / 2D) * (-19.98015D-(-20D)));
            zz = 35D + (((tickAnim - 17D) / 2D) * (32.33978D-(35D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0.90956D + (((tickAnim - 19D) / 1D) * (0.61D-(0.90956D)));
            yy = -19.98015D + (((tickAnim - 19D) / 1D) * (-19.99D-(-19.98015D)));
            zz = 32.33978D + (((tickAnim - 19D) / 1D) * (33.23D-(32.33978D)));
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -69.53365D + (((tickAnim - 0D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = -54.99861D + (((tickAnim - 0D) / 3D) * (-52.6475D-(-54.99861D)));
            zz = 79.82376D + (((tickAnim - 0D) / 3D) * (81.26423D-(79.82376D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -70.69666D + (((tickAnim - 3D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = -52.6475D + (((tickAnim - 3D) / 2D) * (-54.99861D-(-52.6475D)));
            zz = 81.26423D + (((tickAnim - 3D) / 2D) * (79.82376D-(81.26423D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -69.53365D + (((tickAnim - 5D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = -54.99861D + (((tickAnim - 5D) / 3D) * (-52.6475D-(-54.99861D)));
            zz = 79.82376D + (((tickAnim - 5D) / 3D) * (81.26423D-(79.82376D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -70.69666D + (((tickAnim - 8D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = -52.6475D + (((tickAnim - 8D) / 2D) * (-54.99861D-(-52.6475D)));
            zz = 81.26423D + (((tickAnim - 8D) / 2D) * (79.82376D-(81.26423D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -69.53365D + (((tickAnim - 10D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = -54.99861D + (((tickAnim - 10D) / 3D) * (-52.6475D-(-54.99861D)));
            zz = 79.82376D + (((tickAnim - 10D) / 3D) * (81.26423D-(79.82376D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -70.69666D + (((tickAnim - 13D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = -52.6475D + (((tickAnim - 13D) / 2D) * (-54.99861D-(-52.6475D)));
            zz = 81.26423D + (((tickAnim - 13D) / 2D) * (79.82376D-(81.26423D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -69.53365D + (((tickAnim - 15D) / 3D) * (-70.69666D-(-69.53365D)));
            yy = -54.99861D + (((tickAnim - 15D) / 3D) * (-52.6475D-(-54.99861D)));
            zz = 79.82376D + (((tickAnim - 15D) / 3D) * (81.26423D-(79.82376D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -70.69666D + (((tickAnim - 18D) / 2D) * (-69.53365D-(-70.69666D)));
            yy = -52.6475D + (((tickAnim - 18D) / 2D) * (-54.99861D-(-52.6475D)));
            zz = 81.26423D + (((tickAnim - 18D) / 2D) * (79.82376D-(81.26423D)));
        }
        this.setRotateAngle(legR1, legR1.rotateAngleX + (float) Math.toRadians(xx), legR1.rotateAngleY + (float) Math.toRadians(yy), legR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -9.31D + (((tickAnim - 0D) / 1D) * (-9.00717D-(-9.31D)));
            yy = -20.57D + (((tickAnim - 0D) / 1D) * (-20.70481D-(-20.57D)));
            zz = -9.97D + (((tickAnim - 0D) / 1D) * (-10.85133D-(-9.97D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -9.00717D + (((tickAnim - 1D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = -20.70481D + (((tickAnim - 1D) / 2D) * (-20.29348D-(-20.70481D)));
            zz = -10.85133D + (((tickAnim - 1D) / 2D) * (-8.21865D-(-10.85133D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.92926D + (((tickAnim - 3D) / 3D) * (-9.00717D-(-9.92926D)));
            yy = -20.29348D + (((tickAnim - 3D) / 3D) * (-20.70481D-(-20.29348D)));
            zz = -8.21865D + (((tickAnim - 3D) / 3D) * (-10.85133D-(-8.21865D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -9.00717D + (((tickAnim - 6D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = -20.70481D + (((tickAnim - 6D) / 2D) * (-20.29348D-(-20.70481D)));
            zz = -10.85133D + (((tickAnim - 6D) / 2D) * (-8.21865D-(-10.85133D)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -9.92926D + (((tickAnim - 8D) / 3D) * (-9.00717D-(-9.92926D)));
            yy = -20.29348D + (((tickAnim - 8D) / 3D) * (-20.70481D-(-20.29348D)));
            zz = -8.21865D + (((tickAnim - 8D) / 3D) * (-10.85133D-(-8.21865D)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -9.00717D + (((tickAnim - 11D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = -20.70481D + (((tickAnim - 11D) / 2D) * (-20.29348D-(-20.70481D)));
            zz = -10.85133D + (((tickAnim - 11D) / 2D) * (-8.21865D-(-10.85133D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -9.92926D + (((tickAnim - 13D) / 3D) * (-9.00717D-(-9.92926D)));
            yy = -20.29348D + (((tickAnim - 13D) / 3D) * (-20.70481D-(-20.29348D)));
            zz = -8.21865D + (((tickAnim - 13D) / 3D) * (-10.85133D-(-8.21865D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -9.00717D + (((tickAnim - 16D) / 2D) * (-9.92926D-(-9.00717D)));
            yy = -20.70481D + (((tickAnim - 16D) / 2D) * (-20.29348D-(-20.70481D)));
            zz = -10.85133D + (((tickAnim - 16D) / 2D) * (-8.21865D-(-10.85133D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -9.92926D + (((tickAnim - 18D) / 2D) * (-9.31D-(-9.92926D)));
            yy = -20.29348D + (((tickAnim - 18D) / 2D) * (-20.57D-(-20.29348D)));
            zz = -8.21865D + (((tickAnim - 18D) / 2D) * (-9.97D-(-8.21865D)));
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.61D + (((tickAnim - 0D) / 2D) * (0D-(0.61D)));
            yy = 19.99D + (((tickAnim - 0D) / 2D) * (20D-(19.99D)));
            zz = -33.23D + (((tickAnim - 0D) / 2D) * (-35D-(-33.23D)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 2D) / 2D) * (0.90956D-(0D)));
            yy = 20D + (((tickAnim - 2D) / 2D) * (19.98015D-(20D)));
            zz = -35D + (((tickAnim - 2D) / 2D) * (-32.33978D-(-35D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0.90956D + (((tickAnim - 4D) / 3D) * (0D-(0.90956D)));
            yy = 19.98015D + (((tickAnim - 4D) / 3D) * (20D-(19.98015D)));
            zz = -32.33978D + (((tickAnim - 4D) / 3D) * (-35D-(-32.33978D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0.90956D-(0D)));
            yy = 20D + (((tickAnim - 7D) / 2D) * (19.98015D-(20D)));
            zz = -35D + (((tickAnim - 7D) / 2D) * (-32.33978D-(-35D)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0.90956D + (((tickAnim - 9D) / 3D) * (0D-(0.90956D)));
            yy = 19.98015D + (((tickAnim - 9D) / 3D) * (20D-(19.98015D)));
            zz = -32.33978D + (((tickAnim - 9D) / 3D) * (-35D-(-32.33978D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0.90956D-(0D)));
            yy = 20D + (((tickAnim - 12D) / 2D) * (19.98015D-(20D)));
            zz = -35D + (((tickAnim - 12D) / 2D) * (-32.33978D-(-35D)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0.90956D + (((tickAnim - 14D) / 3D) * (0D-(0.90956D)));
            yy = 19.98015D + (((tickAnim - 14D) / 3D) * (20D-(19.98015D)));
            zz = -32.33978D + (((tickAnim - 14D) / 3D) * (-35D-(-32.33978D)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 17D) / 2D) * (0.90956D-(0D)));
            yy = 20D + (((tickAnim - 17D) / 2D) * (19.98015D-(20D)));
            zz = -35D + (((tickAnim - 17D) / 2D) * (-32.33978D-(-35D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0.90956D + (((tickAnim - 19D) / 1D) * (0.61D-(0.90956D)));
            yy = 19.98015D + (((tickAnim - 19D) / 1D) * (19.99D-(19.98015D)));
            zz = -32.33978D + (((tickAnim - 19D) / 1D) * (-33.23D-(-32.33978D)));
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));
        //this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0D + (((tickAnim - 0D) / 1D) * (-0.11866D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 1D) * (0.00447D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.11866D + (((tickAnim - 1D) / 1D) * (-0.24532D-(-0.11866D)));
            yy = 0.00447D + (((tickAnim - 1D) / 1D) * (0.0267D-(0.00447D)));
            zz = 0D + (((tickAnim - 1D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.24532D + (((tickAnim - 2D) / 1D) * (-0.3645D-(-0.24532D)));
            yy = 0.0267D + (((tickAnim - 2D) / 1D) * (0.08255D-(0.0267D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -0.3645D + (((tickAnim - 3D) / 0D) * (-0.45314D-(-0.3645D)));
            yy = 0.08255D + (((tickAnim - 3D) / 0D) * (0.17874D-(0.08255D)));
            zz = 0D + (((tickAnim - 3D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.45314D + (((tickAnim - 3D) / 1D) * (-0.49731D-(-0.45314D)));
            yy = 0.17874D + (((tickAnim - 3D) / 1D) * (0.30566D-(0.17874D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -0.49731D + (((tickAnim - 4D) / 1D) * (-0.5D-(-0.49731D)));
            yy = 0.30566D + (((tickAnim - 4D) / 1D) * (0.45D-(0.30566D)));
            zz = 0D + (((tickAnim - 4D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -0.5D + (((tickAnim - 5D) / 1D) * (-0.4739D-(-0.5D)));
            yy = 0.45D + (((tickAnim - 5D) / 1D) * (0.59808D-(0.45D)));
            zz = 0D + (((tickAnim - 5D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -0.4739D + (((tickAnim - 6D) / 1D) * (-0.42394D-(-0.4739D)));
            yy = 0.59808D + (((tickAnim - 6D) / 1D) * (0.73727D-(0.59808D)));
            zz = 0D + (((tickAnim - 6D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -0.42394D + (((tickAnim - 7D) / 1D) * (-0.34933D-(-0.42394D)));
            yy = 0.73727D + (((tickAnim - 7D) / 1D) * (0.8539D-(0.73727D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -0.34933D + (((tickAnim - 8D) / 0D) * (-0.25102D-(-0.34933D)));
            yy = 0.8539D + (((tickAnim - 8D) / 0D) * (0.93396D-(0.8539D)));
            zz = 0D + (((tickAnim - 8D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.25102D + (((tickAnim - 8D) / 1D) * (-0.13248D-(-0.25102D)));
            yy = 0.93396D + (((tickAnim - 8D) / 1D) * (0.97839D-(0.93396D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.13248D + (((tickAnim - 9D) / 1D) * (0D-(-0.13248D)));
            yy = 0.97839D + (((tickAnim - 9D) / 1D) * (1D-(0.97839D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 10D) / 1D) * (0.13808D-(0D)));
            yy = 1D + (((tickAnim - 10D) / 1D) * (0.9931D-(1D)));
            zz = 0D + (((tickAnim - 10D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0.13808D + (((tickAnim - 11D) / 1D) * (0.27174D-(0.13808D)));
            yy = 0.9931D + (((tickAnim - 11D) / 1D) * (0.95013D-(0.9931D)));
            zz = 0D + (((tickAnim - 11D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0.27174D + (((tickAnim - 12D) / 1D) * (0.39214D-(0.27174D)));
            yy = 0.95013D + (((tickAnim - 12D) / 1D) * (0.87846D-(0.95013D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0.39214D + (((tickAnim - 13D) / 0D) * (0.49169D-(0.39214D)));
            yy = 0.87846D + (((tickAnim - 13D) / 0D) * (0.78351D-(0.87846D)));
            zz = 0D + (((tickAnim - 13D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0.49169D + (((tickAnim - 13D) / 1D) * (0.56333D-(0.49169D)));
            yy = 0.78351D + (((tickAnim - 13D) / 1D) * (0.67042D-(0.78351D)));
            zz = 0D + (((tickAnim - 13D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0.56333D + (((tickAnim - 14D) / 1D) * (0.6D-(0.56333D)));
            yy = 0.67042D + (((tickAnim - 14D) / 1D) * (0.55D-(0.67042D)));
            zz = 0D + (((tickAnim - 14D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0.6D + (((tickAnim - 15D) / 1D) * (0.59155D-(0.6D)));
            yy = 0.55D + (((tickAnim - 15D) / 1D) * (0.42631D-(0.55D)));
            zz = 0D + (((tickAnim - 15D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0.59155D + (((tickAnim - 16D) / 1D) * (0.5375D-(0.59155D)));
            yy = 0.42631D + (((tickAnim - 16D) / 1D) * (0.30524D-(0.42631D)));
            zz = 0D + (((tickAnim - 16D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.5375D + (((tickAnim - 17D) / 1D) * (0.44459D-(0.5375D)));
            yy = 0.30524D + (((tickAnim - 17D) / 1D) * (0.19808D-(0.30524D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0.44459D + (((tickAnim - 18D) / 0D) * (0.31939D-(0.44459D)));
            yy = 0.19808D + (((tickAnim - 18D) / 0D) * (0.10904D-(0.19808D)));
            zz = 0D + (((tickAnim - 18D) / 0D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0.31939D + (((tickAnim - 18D) / 1D) * (0.16869D-(0.31939D)));
            yy = 0.10904D + (((tickAnim - 18D) / 1D) * (0.04167D-(0.10904D)));
            zz = 0D + (((tickAnim - 18D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0.16869D + (((tickAnim - 19D) / 1D) * (0D-(0.16869D)));
            yy = 0.04167D + (((tickAnim - 19D) / 1D) * (0D-(0.04167D)));
            zz = 0D + (((tickAnim - 19D) / 1D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);
    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
