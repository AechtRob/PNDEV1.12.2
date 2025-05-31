package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraLacewing;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelNuddsia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Leg_1_L;
    private final AdvancedModelRenderer Leg_1_L_r1;
    private final AdvancedModelRenderer Leg_2_L;
    private final AdvancedModelRenderer Leg_2_L_r1;
    private final AdvancedModelRenderer Leg_3_L;
    private final AdvancedModelRenderer Leg_3_L_r1;
    private final AdvancedModelRenderer Leg_1_R;
    private final AdvancedModelRenderer Leg_1_R_r1;
    private final AdvancedModelRenderer Leg_2_R;
    private final AdvancedModelRenderer Leg_2_R_r1;
    private final AdvancedModelRenderer Leg_3_R;
    private final AdvancedModelRenderer Leg_3_R_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Antenna_L;
    private final AdvancedModelRenderer Antenna_L_r1;
    private final AdvancedModelRenderer Antenna_R;
    private final AdvancedModelRenderer Antenna_R_r1;
    private final AdvancedModelRenderer Wing_F_L;
    private final AdvancedModelRenderer Wing_F_L_r1;
    private final AdvancedModelRenderer Wing_F_R;
    private final AdvancedModelRenderer Wing_F_L_r2;
    private final AdvancedModelRenderer Wing_B_R;
    private final AdvancedModelRenderer Wing_B_L_r1;
    private final AdvancedModelRenderer Wing_B_L;
    private final AdvancedModelRenderer Wing_B_L_r2;

    public ModelNuddsia() {
        this.textureWidth = 52;
        this.textureHeight = 54;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.4F, -1.3F);
        this.Body.cubeList.add(new ModelBox(Body, 20, 10, -1.0F, -3.0F, -1.8F, 2, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.9F, 2.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1134F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -0.5F, -0.0003F, -0.0262F, 1, 1, 6, 0.0F, false));

        this.Leg_1_L = new AdvancedModelRenderer(this);
        this.Leg_1_L.setRotationPoint(0.4F, -2.0F, -2.2F);
        this.Body.addChild(Leg_1_L);


        this.Leg_1_L_r1 = new AdvancedModelRenderer(this);
        this.Leg_1_L_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Leg_1_L.addChild(Leg_1_L_r1);
        this.setRotateAngle(Leg_1_L_r1, 0.0F, -0.7592F, 0.0F);
        this.Leg_1_L_r1.cubeList.add(new ModelBox(Leg_1_L_r1, 8, 14, 0.2067F, 0.0F, -3.6088F, 0, 2, 4, 0.0F, false));

        this.Leg_2_L = new AdvancedModelRenderer(this);
        this.Leg_2_L.setRotationPoint(1.0F, -1.5F, -0.6F);
        this.Body.addChild(Leg_2_L);


        this.Leg_2_L_r1 = new AdvancedModelRenderer(this);
        this.Leg_2_L_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg_2_L.addChild(Leg_2_L_r1);
        this.setRotateAngle(Leg_2_L_r1, 0.0F, -1.8064F, 0.0F);
        this.Leg_2_L_r1.cubeList.add(new ModelBox(Leg_2_L_r1, 14, 10, 0.2067F, 0.0F, -5.6088F, 0, 2, 6, 0.0F, false));

        this.Leg_3_L = new AdvancedModelRenderer(this);
        this.Leg_3_L.setRotationPoint(1.0F, -2.0F, 1.5F);
        this.Body.addChild(Leg_3_L);


        this.Leg_3_L_r1 = new AdvancedModelRenderer(this);
        this.Leg_3_L_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Leg_3_L.addChild(Leg_3_L_r1);
        this.setRotateAngle(Leg_3_L_r1, 0.0F, -2.6616F, 0.0F);
        this.Leg_3_L_r1.cubeList.add(new ModelBox(Leg_3_L_r1, 8, 6, 0.2067F, 0.0F, -5.6088F, 0, 2, 6, 0.0F, false));

        this.Leg_1_R = new AdvancedModelRenderer(this);
        this.Leg_1_R.setRotationPoint(-0.4F, -1.5F, -2.2F);
        this.Body.addChild(Leg_1_R);
        this.setRotateAngle(Leg_1_R, 0.0F, 0.0436F, 0.0F);


        this.Leg_1_R_r1 = new AdvancedModelRenderer(this);
        this.Leg_1_R_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg_1_R.addChild(Leg_1_R_r1);
        this.setRotateAngle(Leg_1_R_r1, 0.0F, 0.7592F, 0.0F);
        this.Leg_1_R_r1.cubeList.add(new ModelBox(Leg_1_R_r1, 0, 13, -0.2067F, 0.0F, -3.6088F, 0, 2, 4, 0.0F, false));

        this.Leg_2_R = new AdvancedModelRenderer(this);
        this.Leg_2_R.setRotationPoint(-1.0F, -2.0F, -0.6F);
        this.Body.addChild(Leg_2_R);


        this.Leg_2_R_r1 = new AdvancedModelRenderer(this);
        this.Leg_2_R_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Leg_2_R.addChild(Leg_2_R_r1);
        this.setRotateAngle(Leg_2_R_r1, 0.0F, 1.8064F, 0.0F);
        this.Leg_2_R_r1.cubeList.add(new ModelBox(Leg_2_R_r1, 8, 8, -0.2067F, 0.0F, -5.6088F, 0, 2, 6, 0.0F, false));

        this.Leg_3_R = new AdvancedModelRenderer(this);
        this.Leg_3_R.setRotationPoint(-1.0F, -2.0F, 1.5F);
        this.Body.addChild(Leg_3_R);


        this.Leg_3_R_r1 = new AdvancedModelRenderer(this);
        this.Leg_3_R_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Leg_3_R.addChild(Leg_3_R_r1);
        this.setRotateAngle(Leg_3_R_r1, 0.0F, 2.6616F, 0.0F);
        this.Leg_3_R_r1.cubeList.add(new ModelBox(Leg_3_R_r1, 8, 4, -0.2067F, 0.0F, -5.6088F, 0, 2, 6, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -2.3F, -1.7F);
        this.Body.addChild(Head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.1F, 0.8F, -1.1F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1997F, 0.3464F, 0.0443F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, 0.8F, -1.1F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1997F, -0.3464F, -0.0443F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.8F, -0.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 16, 0.0F, -1.0F, -2.0F, 1, 1, 3, 0.0F, false));

        this.Antenna_L = new AdvancedModelRenderer(this);
        this.Antenna_L.setRotationPoint(0.4F, -0.2F, -2.0F);
        this.Head.addChild(Antenna_L);


        this.Antenna_L_r1 = new AdvancedModelRenderer(this);
        this.Antenna_L_r1.setRotationPoint(0.7F, 0.0F, -0.6F);
        this.Antenna_L.addChild(Antenna_L_r1);
        this.setRotateAngle(Antenna_L_r1, -0.0162F, -0.3652F, -0.309F);
        this.Antenna_L_r1.cubeList.add(new ModelBox(Antenna_L_r1, -7, 0, -1.0F, 0.0F, -52.0F, 3, 0, 53, 0.0F, true));

        this.Antenna_R = new AdvancedModelRenderer(this);
        this.Antenna_R.setRotationPoint(-0.4F, -0.2F, -2.0F);
        this.Head.addChild(Antenna_R);


        this.Antenna_R_r1 = new AdvancedModelRenderer(this);
        this.Antenna_R_r1.setRotationPoint(-0.7F, 0.0F, -0.6F);
        this.Antenna_R.addChild(Antenna_R_r1);
        this.setRotateAngle(Antenna_R_r1, -0.0162F, 0.3652F, 0.309F);
        this.Antenna_R_r1.cubeList.add(new ModelBox(Antenna_R_r1, -7, 0, -2.0F, 0.0F, -52.0F, 3, 0, 53, 0.0F, false));

        this.Wing_F_L = new AdvancedModelRenderer(this);
        this.Wing_F_L.setRotationPoint(0.95F, -2.5F, -1.5F);
        this.Body.addChild(Wing_F_L);
        this.setRotateAngle(Wing_F_L, -3.0824F, -1.3743F, -1.7589F);


        this.Wing_F_L_r1 = new AdvancedModelRenderer(this);
        this.Wing_F_L_r1.setRotationPoint(0.1F, -0.2F, 0.2F);
        this.Wing_F_L.addChild(Wing_F_L_r1);
        this.setRotateAngle(Wing_F_L_r1, 0.0F, 0.3665F, 0.0F);
        this.Wing_F_L_r1.cubeList.add(new ModelBox(Wing_F_L_r1, 0, 5, -0.5257F, -0.001F, -0.2824F, 20, 0, 5, 0.0F, false));

        this.Wing_F_R = new AdvancedModelRenderer(this);
        this.Wing_F_R.setRotationPoint(-0.95F, -2.5F, -1.5F);
        this.Body.addChild(Wing_F_R);
        this.setRotateAngle(Wing_F_R, -3.0906F, 1.3626F, 1.7256F);


        this.Wing_F_L_r2 = new AdvancedModelRenderer(this);
        this.Wing_F_L_r2.setRotationPoint(-0.1F, -0.2F, 0.2F);
        this.Wing_F_R.addChild(Wing_F_L_r2);
        this.setRotateAngle(Wing_F_L_r2, 0.0F, -0.3665F, 0.0F);
        this.Wing_F_L_r2.cubeList.add(new ModelBox(Wing_F_L_r2, 0, 5, -19.4743F, -0.002F, -0.2824F, 20, 0, 5, 0.0F, true));

        this.Wing_B_R = new AdvancedModelRenderer(this);
        this.Wing_B_R.setRotationPoint(-0.75F, -2.6F, -0.3F);
        this.Body.addChild(Wing_B_R);
        this.setRotateAngle(Wing_B_R, -0.0108F, 0.9798F, -1.5241F);


        this.Wing_B_L_r1 = new AdvancedModelRenderer(this);
        this.Wing_B_L_r1.setRotationPoint(0.0F, 0.2F, -0.3F);
        this.Wing_B_R.addChild(Wing_B_L_r1);
        this.setRotateAngle(Wing_B_L_r1, 0.0F, 0.4276F, 0.0F);
        this.Wing_B_L_r1.cubeList.add(new ModelBox(Wing_B_L_r1, 0, 0, -19.4147F, -0.298F, -0.09F, 20, 0, 5, 0.0F, true));

        this.Wing_B_L = new AdvancedModelRenderer(this);
        this.Wing_B_L.setRotationPoint(0.75F, -2.6F, -0.3F);
        this.Body.addChild(Wing_B_L);
        this.setRotateAngle(Wing_B_L, -0.0193F, -0.9692F, 1.5037F);


        this.Wing_B_L_r2 = new AdvancedModelRenderer(this);
        this.Wing_B_L_r2.setRotationPoint(0.0F, 0.2F, -0.3F);
        this.Wing_B_L.addChild(Wing_B_L_r2);
        this.setRotateAngle(Wing_B_L_r2, 0.0F, -0.4276F, 0.0F);
        this.Wing_B_L_r2.cubeList.add(new ModelBox(Wing_B_L_r2, 0, 0, -0.5853F, -0.299F, -0.09F, 20, 0, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Body.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    public void renderStaticSuspended(float f) {

        this.Body.render(0.01f);
    }

    public void renderStaticFloor(float f) {

        this.Body.render(0.01f);
    }

    public void renderStaticDisplayCase(float f) {

        this.Body.render(0.01f);
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
        EntityPrehistoricFloraLacewing ee = (EntityPrehistoricFloraLacewing) entitylivingbaseIn;


        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLacewing entity = (EntityPrehistoricFloraLacewing) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4, Body.rotateAngleY + (float) Math.toRadians(0), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*0.8);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(Leg_1_L, Leg_1_L.rotateAngleX + (float) Math.toRadians(-5.3552), Leg_1_L.rotateAngleY + (float) Math.toRadians(-17.87463), Leg_1_L.rotateAngleZ + (float) Math.toRadians(-23.8102+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*10);


        this.setRotateAngle(Leg_2_L, Leg_2_L.rotateAngleX + (float) Math.toRadians(-15.5076+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, Leg_2_L.rotateAngleY + (float) Math.toRadians(-52.8123), Leg_2_L.rotateAngleZ + (float) Math.toRadians(15.68376));


        this.setRotateAngle(Leg_3_L, Leg_3_L.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*4, Leg_3_L.rotateAngleY + (float) Math.toRadians(-7.5), Leg_3_L.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leg_1_R, Leg_1_R.rotateAngleX + (float) Math.toRadians(-5.3552), Leg_1_R.rotateAngleY + (float) Math.toRadians(17.87463), Leg_1_R.rotateAngleZ + (float) Math.toRadians(23.8102-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+40))*10);


        this.setRotateAngle(Leg_2_R, Leg_2_R.rotateAngleX + (float) Math.toRadians(-15.5076+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6, Leg_2_R.rotateAngleY + (float) Math.toRadians(52.8123), Leg_2_R.rotateAngleZ + (float) Math.toRadians(-15.68376));


        this.setRotateAngle(Leg_3_R, Leg_3_R.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+80))*4, Leg_3_R.rotateAngleY + (float) Math.toRadians(7.5), Leg_3_R.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Antenna_L, Antenna_L.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374))*6), Antenna_L.rotateAngleY + (float) Math.toRadians(0), Antenna_L.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Antenna_R, Antenna_R.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-120))*6), Antenna_R.rotateAngleY + (float) Math.toRadians(0), Antenna_R.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 178.28624 + (((tickAnim - 0) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 0) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 0) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 229.55025 + (((tickAnim - 1) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 1) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 1) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 219.8226 + (((tickAnim - 2) / 0) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 2) / 0) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 2) / 0) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 117.38897 + (((tickAnim - 2) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 2) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 2) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 178.28624 + (((tickAnim - 3) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 3) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 3) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 229.55025 + (((tickAnim - 4) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 4) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 4) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 219.8226 + (((tickAnim - 5) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 5) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 5) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 117.38897 + (((tickAnim - 6) / 0) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 6) / 0) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 6) / 0) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 178.28624 + (((tickAnim - 6) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 6) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 6) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 229.55025 + (((tickAnim - 7) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 7) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 7) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 219.8226 + (((tickAnim - 8) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 8) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 8) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 117.38897 + (((tickAnim - 9) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 9) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 9) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 178.28624 + (((tickAnim - 10) / 0) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 10) / 0) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 10) / 0) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 229.55025 + (((tickAnim - 10) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 10) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 10) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 219.8226 + (((tickAnim - 11) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 11) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 11) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 117.38897 + (((tickAnim - 12) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 12) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 12) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 178.28624 + (((tickAnim - 13) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 13) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 13) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 229.55025 + (((tickAnim - 14) / 0) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 14) / 0) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 14) / 0) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 219.8226 + (((tickAnim - 14) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 14) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 14) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 117.38897 + (((tickAnim - 15) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 15) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 15) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 178.28624 + (((tickAnim - 16) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 16) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 16) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 229.55025 + (((tickAnim - 17) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 17) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 17) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 219.8226 + (((tickAnim - 18) / 0) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 18) / 0) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 18) / 0) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 117.38897 + (((tickAnim - 18) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 18) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 18) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 178.28624 + (((tickAnim - 19) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 19) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 19) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 229.55025 + (((tickAnim - 20) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 20) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 20) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 219.8226 + (((tickAnim - 21) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 21) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 21) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 117.38897 + (((tickAnim - 22) / 0) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 22) / 0) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 22) / 0) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 178.28624 + (((tickAnim - 22) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 22) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 22) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 229.55025 + (((tickAnim - 23) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 23) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 23) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 219.8226 + (((tickAnim - 24) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 24) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 24) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 117.38897 + (((tickAnim - 25) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 25) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 25) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 178.28624 + (((tickAnim - 26) / 0) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 26) / 0) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 26) / 0) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 229.55025 + (((tickAnim - 26) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 26) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 26) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 219.8226 + (((tickAnim - 27) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 27) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 27) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 117.38897 + (((tickAnim - 28) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 28) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 28) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 178.28624 + (((tickAnim - 29) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 29) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 29) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 229.55025 + (((tickAnim - 30) / 0) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 30) / 0) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 30) / 0) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 219.8226 + (((tickAnim - 30) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 30) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 30) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 117.38897 + (((tickAnim - 31) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 31) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 31) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 178.28624 + (((tickAnim - 32) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 32) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 32) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 229.55025 + (((tickAnim - 33) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 33) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 33) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 219.8226 + (((tickAnim - 34) / 0) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 34) / 0) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 34) / 0) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 117.38897 + (((tickAnim - 34) / 1) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 34) / 1) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 34) / 1) * (-347.0405-(-261.42031)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 178.28624 + (((tickAnim - 35) / 1) * (229.55025-(178.28624)));
            yy = 81.94686 + (((tickAnim - 35) / 1) * (78.57845-(81.94686)));
            zz = -347.0405 + (((tickAnim - 35) / 1) * (-264.5518-(-347.0405)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 229.55025 + (((tickAnim - 36) / 1) * (219.8226-(229.55025)));
            yy = 78.57845 + (((tickAnim - 36) / 1) * (77.03172-(78.57845)));
            zz = -264.5518 + (((tickAnim - 36) / 1) * (-215.19193-(-264.5518)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 219.8226 + (((tickAnim - 37) / 1) * (117.38897-(219.8226)));
            yy = 77.03172 + (((tickAnim - 37) / 1) * (68.43187-(77.03172)));
            zz = -215.19193 + (((tickAnim - 37) / 1) * (-261.42031-(-215.19193)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 117.38897 + (((tickAnim - 38) / 0) * (178.28624-(117.38897)));
            yy = 68.43187 + (((tickAnim - 38) / 0) * (81.94686-(68.43187)));
            zz = -261.42031 + (((tickAnim - 38) / 0) * (-347.0405-(-261.42031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Wing_F_L, Wing_F_L.rotateAngleX + (float) Math.toRadians(xx), Wing_F_L.rotateAngleY + (float) Math.toRadians(yy), Wing_F_L.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 178.28624 + (((tickAnim - 0) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 0) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 0) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 229.55025 + (((tickAnim - 1) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 1) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 1) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 219.8226 + (((tickAnim - 2) / 0) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 2) / 0) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 2) / 0) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 117.38897 + (((tickAnim - 2) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 2) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 2) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 178.28624 + (((tickAnim - 3) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 3) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 3) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 229.55025 + (((tickAnim - 4) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 4) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 4) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 219.8226 + (((tickAnim - 5) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 5) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 5) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 117.38897 + (((tickAnim - 6) / 0) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 6) / 0) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 6) / 0) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 178.28624 + (((tickAnim - 6) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 6) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 6) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 229.55025 + (((tickAnim - 7) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 7) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 7) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 219.8226 + (((tickAnim - 8) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 8) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 8) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 117.38897 + (((tickAnim - 9) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 9) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 9) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 178.28624 + (((tickAnim - 10) / 0) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 10) / 0) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 10) / 0) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 229.55025 + (((tickAnim - 10) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 10) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 10) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 219.8226 + (((tickAnim - 11) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 11) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 11) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 117.38897 + (((tickAnim - 12) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 12) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 12) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 178.28624 + (((tickAnim - 13) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 13) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 13) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 229.55025 + (((tickAnim - 14) / 0) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 14) / 0) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 14) / 0) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 219.8226 + (((tickAnim - 14) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 14) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 14) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 117.38897 + (((tickAnim - 15) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 15) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 15) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 178.28624 + (((tickAnim - 16) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 16) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 16) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 229.55025 + (((tickAnim - 17) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 17) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 17) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 219.8226 + (((tickAnim - 18) / 0) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 18) / 0) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 18) / 0) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 117.38897 + (((tickAnim - 18) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 18) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 18) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 178.28624 + (((tickAnim - 19) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 19) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 19) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 229.55025 + (((tickAnim - 20) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 20) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 20) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 219.8226 + (((tickAnim - 21) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 21) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 21) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 117.38897 + (((tickAnim - 22) / 0) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 22) / 0) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 22) / 0) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 178.28624 + (((tickAnim - 22) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 22) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 22) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 229.55025 + (((tickAnim - 23) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 23) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 23) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 219.8226 + (((tickAnim - 24) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 24) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 24) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 117.38897 + (((tickAnim - 25) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 25) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 25) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 178.28624 + (((tickAnim - 26) / 0) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 26) / 0) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 26) / 0) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 229.55025 + (((tickAnim - 26) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 26) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 26) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 219.8226 + (((tickAnim - 27) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 27) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 27) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 117.38897 + (((tickAnim - 28) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 28) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 28) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 178.28624 + (((tickAnim - 29) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 29) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 29) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 229.55025 + (((tickAnim - 30) / 0) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 30) / 0) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 30) / 0) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 219.8226 + (((tickAnim - 30) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 30) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 30) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 117.38897 + (((tickAnim - 31) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 31) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 31) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 178.28624 + (((tickAnim - 32) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 32) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 32) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 229.55025 + (((tickAnim - 33) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 33) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 33) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 219.8226 + (((tickAnim - 34) / 0) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 34) / 0) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 34) / 0) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 117.38897 + (((tickAnim - 34) / 1) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 34) / 1) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 34) / 1) * (347.0405-(261.42031)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 178.28624 + (((tickAnim - 35) / 1) * (229.55025-(178.28624)));
            yy = -81.94686 + (((tickAnim - 35) / 1) * (-78.57845-(-81.94686)));
            zz = 347.0405 + (((tickAnim - 35) / 1) * (264.5518-(347.0405)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 229.55025 + (((tickAnim - 36) / 1) * (219.8226-(229.55025)));
            yy = -78.57845 + (((tickAnim - 36) / 1) * (-77.03172-(-78.57845)));
            zz = 264.5518 + (((tickAnim - 36) / 1) * (215.19193-(264.5518)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 219.8226 + (((tickAnim - 37) / 1) * (117.38897-(219.8226)));
            yy = -77.03172 + (((tickAnim - 37) / 1) * (-68.43187-(-77.03172)));
            zz = 215.19193 + (((tickAnim - 37) / 1) * (261.42031-(215.19193)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 117.38897 + (((tickAnim - 38) / 0) * (178.28624-(117.38897)));
            yy = -68.43187 + (((tickAnim - 38) / 0) * (-81.94686-(-68.43187)));
            zz = 261.42031 + (((tickAnim - 38) / 0) * (347.0405-(261.42031)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Wing_F_R, Wing_F_R.rotateAngleX + (float) Math.toRadians(xx), Wing_F_R.rotateAngleY + (float) Math.toRadians(yy), Wing_F_R.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -8.35989 + (((tickAnim - 0) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 0) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 0) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 56.01805 + (((tickAnim - 1) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 1) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 1) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 50.47938 + (((tickAnim - 2) / 0) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 2) / 0) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 2) / 0) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -36.44026 + (((tickAnim - 2) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 2) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 2) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.35989 + (((tickAnim - 3) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 3) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 3) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 56.01805 + (((tickAnim - 4) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 4) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 4) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 50.47938 + (((tickAnim - 5) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 5) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 5) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -36.44026 + (((tickAnim - 6) / 0) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 6) / 0) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 6) / 0) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -8.35989 + (((tickAnim - 6) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 6) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 6) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 56.01805 + (((tickAnim - 7) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 7) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 7) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 50.47938 + (((tickAnim - 8) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 8) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 8) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -36.44026 + (((tickAnim - 9) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 9) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 9) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -8.35989 + (((tickAnim - 10) / 0) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 10) / 0) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 10) / 0) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 56.01805 + (((tickAnim - 10) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 10) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 10) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 50.47938 + (((tickAnim - 11) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 11) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 11) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -36.44026 + (((tickAnim - 12) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 12) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 12) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -8.35989 + (((tickAnim - 13) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 13) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 13) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 56.01805 + (((tickAnim - 14) / 0) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 14) / 0) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 14) / 0) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.47938 + (((tickAnim - 14) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 14) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 14) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -36.44026 + (((tickAnim - 15) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 15) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 15) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -8.35989 + (((tickAnim - 16) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 16) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 16) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 56.01805 + (((tickAnim - 17) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 17) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 17) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 50.47938 + (((tickAnim - 18) / 0) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 18) / 0) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 18) / 0) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -36.44026 + (((tickAnim - 18) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 18) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 18) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -8.35989 + (((tickAnim - 19) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 19) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 19) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 56.01805 + (((tickAnim - 20) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 20) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 20) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 50.47938 + (((tickAnim - 21) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 21) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 21) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -36.44026 + (((tickAnim - 22) / 0) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 22) / 0) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 22) / 0) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -8.35989 + (((tickAnim - 22) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 22) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 22) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 56.01805 + (((tickAnim - 23) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 23) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 23) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 50.47938 + (((tickAnim - 24) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 24) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 24) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -36.44026 + (((tickAnim - 25) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 25) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 25) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -8.35989 + (((tickAnim - 26) / 0) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 26) / 0) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 26) / 0) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 56.01805 + (((tickAnim - 26) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 26) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 26) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 50.47938 + (((tickAnim - 27) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 27) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 27) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -36.44026 + (((tickAnim - 28) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 28) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 28) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -8.35989 + (((tickAnim - 29) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 29) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 29) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 56.01805 + (((tickAnim - 30) / 0) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 30) / 0) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 30) / 0) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 50.47938 + (((tickAnim - 30) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 30) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 30) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -36.44026 + (((tickAnim - 31) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 31) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 31) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -8.35989 + (((tickAnim - 32) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 32) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 32) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 56.01805 + (((tickAnim - 33) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 33) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 33) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 50.47938 + (((tickAnim - 34) / 0) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 34) / 0) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 34) / 0) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -36.44026 + (((tickAnim - 34) / 1) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 34) / 1) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 34) / 1) * (176.06806-(92.23361)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -8.35989 + (((tickAnim - 35) / 1) * (56.01805-(-8.35989)));
            yy = -56.15721 + (((tickAnim - 35) / 1) * (-57.79451-(-56.15721)));
            zz = 176.06806 + (((tickAnim - 35) / 1) * (65.28102-(176.06806)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 56.01805 + (((tickAnim - 36) / 1) * (50.47938-(56.01805)));
            yy = -57.79451 + (((tickAnim - 36) / 1) * (-56.96048-(-57.79451)));
            zz = 65.28102 + (((tickAnim - 36) / 1) * (8.39916-(65.28102)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 50.47938 + (((tickAnim - 37) / 1) * (-36.44026-(50.47938)));
            yy = -56.96048 + (((tickAnim - 37) / 1) * (-56.55884-(-56.96048)));
            zz = 8.39916 + (((tickAnim - 37) / 1) * (92.23361-(8.39916)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -36.44026 + (((tickAnim - 38) / 0) * (-8.35989-(-36.44026)));
            yy = -56.55884 + (((tickAnim - 38) / 0) * (-56.15721-(-56.55884)));
            zz = 92.23361 + (((tickAnim - 38) / 0) * (176.06806-(92.23361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Wing_B_R, Wing_B_R.rotateAngleX + (float) Math.toRadians(xx), Wing_B_R.rotateAngleY + (float) Math.toRadians(yy), Wing_B_R.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -8.35989 + (((tickAnim - 0) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 0) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 0) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 56.01805 + (((tickAnim - 1) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 1) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 1) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 50.47938 + (((tickAnim - 2) / 0) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 2) / 0) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 2) / 0) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -36.44026 + (((tickAnim - 2) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 2) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 2) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -8.35989 + (((tickAnim - 3) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 3) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 3) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 56.01805 + (((tickAnim - 4) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 4) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 4) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 50.47938 + (((tickAnim - 5) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 5) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 5) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -36.44026 + (((tickAnim - 6) / 0) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 6) / 0) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 6) / 0) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -8.35989 + (((tickAnim - 6) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 6) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 6) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 56.01805 + (((tickAnim - 7) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 7) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 7) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 50.47938 + (((tickAnim - 8) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 8) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 8) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -36.44026 + (((tickAnim - 9) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 9) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 9) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -8.35989 + (((tickAnim - 10) / 0) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 10) / 0) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 10) / 0) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 56.01805 + (((tickAnim - 10) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 10) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 10) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 50.47938 + (((tickAnim - 11) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 11) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 11) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -36.44026 + (((tickAnim - 12) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 12) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 12) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -8.35989 + (((tickAnim - 13) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 13) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 13) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 56.01805 + (((tickAnim - 14) / 0) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 14) / 0) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 14) / 0) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 50.47938 + (((tickAnim - 14) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 14) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 14) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -36.44026 + (((tickAnim - 15) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 15) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 15) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -8.35989 + (((tickAnim - 16) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 16) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 16) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 56.01805 + (((tickAnim - 17) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 17) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 17) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 50.47938 + (((tickAnim - 18) / 0) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 18) / 0) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 18) / 0) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -36.44026 + (((tickAnim - 18) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 18) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 18) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -8.35989 + (((tickAnim - 19) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 19) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 19) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 56.01805 + (((tickAnim - 20) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 20) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 20) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 50.47938 + (((tickAnim - 21) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 21) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 21) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -36.44026 + (((tickAnim - 22) / 0) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 22) / 0) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 22) / 0) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -8.35989 + (((tickAnim - 22) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 22) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 22) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 56.01805 + (((tickAnim - 23) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 23) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 23) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 50.47938 + (((tickAnim - 24) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 24) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 24) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -36.44026 + (((tickAnim - 25) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 25) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 25) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -8.35989 + (((tickAnim - 26) / 0) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 26) / 0) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 26) / 0) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 56.01805 + (((tickAnim - 26) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 26) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 26) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 50.47938 + (((tickAnim - 27) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 27) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 27) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -36.44026 + (((tickAnim - 28) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 28) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 28) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -8.35989 + (((tickAnim - 29) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 29) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 29) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 56.01805 + (((tickAnim - 30) / 0) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 30) / 0) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 30) / 0) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 50.47938 + (((tickAnim - 30) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 30) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 30) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -36.44026 + (((tickAnim - 31) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 31) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 31) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -8.35989 + (((tickAnim - 32) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 32) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 32) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 56.01805 + (((tickAnim - 33) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 33) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 33) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 50.47938 + (((tickAnim - 34) / 0) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 34) / 0) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 34) / 0) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -36.44026 + (((tickAnim - 34) / 1) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 34) / 1) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 34) / 1) * (-176.06806-(-92.23361)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -8.35989 + (((tickAnim - 35) / 1) * (56.01805-(-8.35989)));
            yy = 56.15721 + (((tickAnim - 35) / 1) * (57.79451-(56.15721)));
            zz = -176.06806 + (((tickAnim - 35) / 1) * (-65.28102-(-176.06806)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 56.01805 + (((tickAnim - 36) / 1) * (50.47938-(56.01805)));
            yy = 57.79451 + (((tickAnim - 36) / 1) * (56.96048-(57.79451)));
            zz = -65.28102 + (((tickAnim - 36) / 1) * (-8.39916-(-65.28102)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 50.47938 + (((tickAnim - 37) / 1) * (-36.44026-(50.47938)));
            yy = 56.96048 + (((tickAnim - 37) / 1) * (56.55884-(56.96048)));
            zz = -8.39916 + (((tickAnim - 37) / 1) * (-92.23361-(-8.39916)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -36.44026 + (((tickAnim - 38) / 0) * (-8.35989-(-36.44026)));
            yy = 56.55884 + (((tickAnim - 38) / 0) * (56.15721-(56.55884)));
            zz = -92.23361 + (((tickAnim - 38) / 0) * (-176.06806-(-92.23361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Wing_B_L, Wing_B_L.rotateAngleX + (float) Math.toRadians(xx), Wing_B_L.rotateAngleY + (float) Math.toRadians(yy), Wing_B_L.rotateAngleZ + (float) Math.toRadians(zz));

    }
    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);


    }
}
