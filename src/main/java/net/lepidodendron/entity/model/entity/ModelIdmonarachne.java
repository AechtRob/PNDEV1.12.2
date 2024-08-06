package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelIdmonarachne extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pedipalpR;
    private final AdvancedModelRenderer pedipalpL;
    private final AdvancedModelRenderer LegR1;
    private final AdvancedModelRenderer LegL1;
    private final AdvancedModelRenderer LegR2;
    private final AdvancedModelRenderer LegL2;
    private final AdvancedModelRenderer LegR3;
    private final AdvancedModelRenderer LegL3;
    private final AdvancedModelRenderer LegR4;
    private final AdvancedModelRenderer LegL4;
    private final AdvancedModelRenderer abdomen;


    public ModelIdmonarachne() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.25F, -4.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 21, -2.0F, -0.9F, 0.65F, 4, 1, 3, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 23, -1.5F, -0.9F, -0.35F, 3, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, -1.025F, -0.55F, -1.1F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 4, 0.025F, -0.55F, -1.1F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -0.5F, -1.15F, -0.1F, 1, 1, 1, 0.0F, false));

        this.pedipalpR = new AdvancedModelRenderer(this);
        this.pedipalpR.setRotationPoint(-1.0F, -0.25F, -0.25F);
        this.body.addChild(pedipalpR);
        this.setRotateAngle(pedipalpR, 0.1309F, 0.3054F, 0.8727F);
        this.pedipalpR.cubeList.add(new ModelBox(pedipalpR, 16, 12, -0.75F, 0.0F, -4.75F, 2, 0, 5, 0.0F, false));

        this.pedipalpL = new AdvancedModelRenderer(this);
        this.pedipalpL.setRotationPoint(1.0F, -0.25F, -0.25F);
        this.body.addChild(pedipalpL);
        this.setRotateAngle(pedipalpL, 0.1309F, -0.3054F, -0.8727F);
        this.pedipalpL.cubeList.add(new ModelBox(pedipalpL, 16, 12, -1.25F, 0.0F, -4.75F, 2, 0, 5, 0.0F, true));

        this.LegR1 = new AdvancedModelRenderer(this);
        this.LegR1.setRotationPoint(-1.5F, -1.25F, 0.5F);
        this.body.addChild(LegR1);
        this.setRotateAngle(LegR1, 1.1781F, -0.5236F, 0.1745F);
        this.LegR1.cubeList.add(new ModelBox(LegR1, 4, 16, -4.75F, 0.0F, -3.0F, 5, 0, 4, 0.0F, false));

        this.LegL1 = new AdvancedModelRenderer(this);
        this.LegL1.setRotationPoint(1.5F, -1.25F, 0.5F);
        this.body.addChild(LegL1);
        this.setRotateAngle(LegL1, 1.1781F, 0.5236F, -0.1745F);
        this.LegL1.cubeList.add(new ModelBox(LegL1, 4, 16, -0.25F, 0.0F, -3.0F, 5, 0, 4, 0.0F, true));

        this.LegR2 = new AdvancedModelRenderer(this);
        this.LegR2.setRotationPoint(-2.0F, -0.25F, 1.0F);
        this.body.addChild(LegR2);
        this.setRotateAngle(LegR2, 1.2654F, -0.1745F, 0.1309F);
        this.LegR2.cubeList.add(new ModelBox(LegR2, 3, 11, -5.75F, 0.0F, -2.0F, 6, 0, 4, 0.0F, false));

        this.LegL2 = new AdvancedModelRenderer(this);
        this.LegL2.setRotationPoint(2.0F, -0.25F, 1.0F);
        this.body.addChild(LegL2);
        this.setRotateAngle(LegL2, 1.2654F, 0.1745F, -0.1309F);
        this.LegL2.cubeList.add(new ModelBox(LegL2, 3, 11, -0.25F, 0.0F, -2.0F, 6, 0, 4, 0.0F, true));

        this.LegR3 = new AdvancedModelRenderer(this);
        this.LegR3.setRotationPoint(-2.0F, -0.25F, 2.25F);
        this.body.addChild(LegR3);
        this.setRotateAngle(LegR3, 1.9635F, 0.3927F, 0.1309F);
        this.LegR3.cubeList.add(new ModelBox(LegR3, 5, 6, -5.75F, 0.0F, -2.0F, 6, 0, 4, 0.0F, false));

        this.LegL3 = new AdvancedModelRenderer(this);
        this.LegL3.setRotationPoint(2.0F, -0.25F, 2.25F);
        this.body.addChild(LegL3);
        this.setRotateAngle(LegL3, 1.9635F, -0.3927F, -0.1309F);
        this.LegL3.cubeList.add(new ModelBox(LegL3, 5, 6, -0.25F, 0.0F, -2.0F, 6, 0, 4, 0.0F, true));

        this.LegR4 = new AdvancedModelRenderer(this);
        this.LegR4.setRotationPoint(-1.75F, -0.25F, 3.25F);
        this.body.addChild(LegR4);
        this.setRotateAngle(LegR4, 2.138F, 0.8727F, 0.1309F);
        this.LegR4.cubeList.add(new ModelBox(LegR4, 3, 0, -7.75F, 0.0F, -2.0F, 8, 0, 5, 0.0F, false));

        this.LegL4 = new AdvancedModelRenderer(this);
        this.LegL4.setRotationPoint(1.75F, -0.25F, 3.25F);
        this.body.addChild(LegL4);
        this.setRotateAngle(LegL4, 2.138F, -0.8727F, -0.1309F);
        this.LegL4.cubeList.add(new ModelBox(LegL4, 3, 0, -0.25F, 0.0F, -2.0F, 8, 0, 5, 0.0F, true));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.body.addChild(abdomen);
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 2, -1.0F, -0.5F, 5.0F, 2, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 0, 0, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 17, 17, -1.5F, -0.5F, 1.0F, 3, 1, 4, 0.01F, false));
        this.abdomen.cubeList.add(new ModelBox(abdomen, 15, 6, -2.5F, 0.0F, 0.0F, 5, 0, 6, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);

    }
    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(abdomen, 0.3F, 0.0F, 0.0F);
        this.body.offsetY = 0.44F;
        this.body.offsetZ = -0.0F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.2F;
        this.body.offsetX = -0.05F;
        this.body.rotateAngleY = (float)Math.toRadians(-120);
        this.body.rotateAngleX = (float)Math.toRadians(15);
        this.body.rotateAngleZ = (float)Math.toRadians(-10);
        float scaler = 0.60F;
        this.body.scaleChildren = true;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.body.offsetY = 1F;

        this.body.rotateAngleY = f3 * 0.017453292F;

        //this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) e;
        if ((f3 == 0.0F || !ee.getIsMoving()) && (!ee.getIsClimbing() || ee.getHeadCollided())) {
            return;
        }


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLandClimbingBase ee = (EntityPrehistoricFloraLandClimbingBase) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLandClimbingBase entity = (EntityPrehistoricFloraLandClimbingBase) entitylivingbaseIn;

        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 15 + (((tickAnim - 0) / 10) * (-12.5-(15)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = -12.5 + (((tickAnim - 10) / 9) * (15-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pedipalpR, pedipalpR.rotateAngleX + (float) Math.toRadians(xx), pedipalpR.rotateAngleY + (float) Math.toRadians(yy), pedipalpR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -23.44798 + (((tickAnim - 0) / 5) * (-6.92861-(-23.44798)));
            yy = -6.27355 + (((tickAnim - 0) / 5) * (17.66893-(-6.27355)));
            zz = -4.39514 + (((tickAnim - 0) / 5) * (-8.55821-(-4.39514)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -6.92861 + (((tickAnim - 5) / 2) * (-16.27888-(-6.92861)));
            yy = 17.66893 + (((tickAnim - 5) / 2) * (16.91458-(17.66893)));
            zz = -8.55821 + (((tickAnim - 5) / 2) * (3.55757-(-8.55821)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -16.27888 + (((tickAnim - 7) / 3) * (-23.44798-(-16.27888)));
            yy = 16.91458 + (((tickAnim - 7) / 3) * (-6.27355-(16.91458)));
            zz = 3.55757 + (((tickAnim - 7) / 3) * (-4.39514-(3.55757)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -23.44798 + (((tickAnim - 10) / 4) * (-6.92861-(-23.44798)));
            yy = -6.27355 + (((tickAnim - 10) / 4) * (17.66893-(-6.27355)));
            zz = -4.39514 + (((tickAnim - 10) / 4) * (-8.55821-(-4.39514)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -6.92861 + (((tickAnim - 14) / 3) * (-16.27888-(-6.92861)));
            yy = 17.66893 + (((tickAnim - 14) / 3) * (16.91458-(17.66893)));
            zz = -8.55821 + (((tickAnim - 14) / 3) * (3.55757-(-8.55821)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -16.27888 + (((tickAnim - 17) / 2) * (-23.44798-(-16.27888)));
            yy = 16.91458 + (((tickAnim - 17) / 2) * (-6.27355-(16.91458)));
            zz = 3.55757 + (((tickAnim - 17) / 2) * (-4.39514-(3.55757)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR1, LegR1.rotateAngleX + (float) Math.toRadians(xx), LegR1.rotateAngleY + (float) Math.toRadians(yy), LegR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -5 + (((tickAnim - 10) / 9) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(abdomen, abdomen.rotateAngleX + (float) Math.toRadians(xx), abdomen.rotateAngleY + (float) Math.toRadians(yy), abdomen.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.61274 + (((tickAnim - 0) / 2) * (9.19427-(23.61274)));
            yy = 1.91909 + (((tickAnim - 0) / 2) * (-12.79886-(1.91909)));
            zz = -2.24938 + (((tickAnim - 0) / 2) * (17.54458-(-2.24938)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9.19427 + (((tickAnim - 2) / 3) * (8.97345-(9.19427)));
            yy = -12.79886 + (((tickAnim - 2) / 3) * (-21.10749-(-12.79886)));
            zz = 17.54458 + (((tickAnim - 2) / 3) * (4.78677-(17.54458)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 8.97345 + (((tickAnim - 5) / 5) * (23.61274-(8.97345)));
            yy = -21.10749 + (((tickAnim - 5) / 5) * (1.91909-(-21.10749)));
            zz = 4.78677 + (((tickAnim - 5) / 5) * (-2.24938-(4.78677)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 23.61274 + (((tickAnim - 10) / 2) * (9.19427-(23.61274)));
            yy = 1.91909 + (((tickAnim - 10) / 2) * (-12.79886-(1.91909)));
            zz = -2.24938 + (((tickAnim - 10) / 2) * (17.54458-(-2.24938)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 9.19427 + (((tickAnim - 12) / 2) * (8.97345-(9.19427)));
            yy = -12.79886 + (((tickAnim - 12) / 2) * (-21.10749-(-12.79886)));
            zz = 17.54458 + (((tickAnim - 12) / 2) * (4.78677-(17.54458)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 8.97345 + (((tickAnim - 14) / 5) * (23.61274-(8.97345)));
            yy = -21.10749 + (((tickAnim - 14) / 5) * (1.91909-(-21.10749)));
            zz = 4.78677 + (((tickAnim - 14) / 5) * (-2.24938-(4.78677)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR2, LegR2.rotateAngleX + (float) Math.toRadians(xx), LegR2.rotateAngleY + (float) Math.toRadians(yy), LegR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.67114 + (((tickAnim - 0) / 5) * (6.89603-(0.67114)));
            yy = -20.72052 + (((tickAnim - 0) / 5) * (14.56519-(-20.72052)));
            zz = -4.89851 + (((tickAnim - 0) / 5) * (1.62784-(-4.89851)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 6.89603 + (((tickAnim - 5) / 2) * (4.10637-(6.89603)));
            yy = 14.56519 + (((tickAnim - 5) / 2) * (-13.5181-(14.56519)));
            zz = 1.62784 + (((tickAnim - 5) / 2) * (9.15464-(1.62784)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.10637 + (((tickAnim - 7) / 3) * (0.67114-(4.10637)));
            yy = -13.5181 + (((tickAnim - 7) / 3) * (-20.72052-(-13.5181)));
            zz = 9.15464 + (((tickAnim - 7) / 3) * (-4.89851-(9.15464)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0.67114 + (((tickAnim - 10) / 4) * (6.89603-(0.67114)));
            yy = -20.72052 + (((tickAnim - 10) / 4) * (14.56519-(-20.72052)));
            zz = -4.89851 + (((tickAnim - 10) / 4) * (1.62784-(-4.89851)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 6.89603 + (((tickAnim - 14) / 3) * (4.10637-(6.89603)));
            yy = 14.56519 + (((tickAnim - 14) / 3) * (-13.5181-(14.56519)));
            zz = 1.62784 + (((tickAnim - 14) / 3) * (9.15464-(1.62784)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 4.10637 + (((tickAnim - 17) / 2) * (0.67114-(4.10637)));
            yy = -13.5181 + (((tickAnim - 17) / 2) * (-20.72052-(-13.5181)));
            zz = 9.15464 + (((tickAnim - 17) / 2) * (-4.89851-(9.15464)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR3, LegR3.rotateAngleX + (float) Math.toRadians(xx), LegR3.rotateAngleY + (float) Math.toRadians(yy), LegR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.01984 + (((tickAnim - 0) / 2) * (11.35101-(10.01984)));
            yy = 18.55361 + (((tickAnim - 0) / 2) * (-10.38979-(18.55361)));
            zz = 12.11895 + (((tickAnim - 0) / 2) * (14.93308-(12.11895)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 11.35101 + (((tickAnim - 2) / 3) * (-0.26576-(11.35101)));
            yy = -10.38979 + (((tickAnim - 2) / 3) * (-16.90645-(-10.38979)));
            zz = 14.93308 + (((tickAnim - 2) / 3) * (-6.03387-(14.93308)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.26576 + (((tickAnim - 5) / 5) * (4.87744-(-0.26576)));
            yy = -16.90645 + (((tickAnim - 5) / 5) * (15.16778-(-16.90645)));
            zz = -6.03387 + (((tickAnim - 5) / 5) * (5.79635-(-6.03387)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 4.87744 + (((tickAnim - 10) / 2) * (11.35101-(4.87744)));
            yy = 15.16778 + (((tickAnim - 10) / 2) * (-10.38979-(15.16778)));
            zz = 5.79635 + (((tickAnim - 10) / 2) * (14.93308-(5.79635)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11.35101 + (((tickAnim - 12) / 2) * (-0.26576-(11.35101)));
            yy = -10.38979 + (((tickAnim - 12) / 2) * (-16.90645-(-10.38979)));
            zz = 14.93308 + (((tickAnim - 12) / 2) * (-6.03387-(14.93308)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -0.26576 + (((tickAnim - 14) / 5) * (4.87744-(-0.26576)));
            yy = -16.90645 + (((tickAnim - 14) / 5) * (15.16778-(-16.90645)));
            zz = -6.03387 + (((tickAnim - 14) / 5) * (5.79635-(-6.03387)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR4, LegR4.rotateAngleX + (float) Math.toRadians(xx), LegR4.rotateAngleY + (float) Math.toRadians(yy), LegR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -15 + (((tickAnim - 0) / 10) * (12.5-(-15)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 12.5 + (((tickAnim - 10) / 9) * (-15-(12.5)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(pedipalpL, pedipalpL.rotateAngleX + (float) Math.toRadians(xx), pedipalpL.rotateAngleY + (float) Math.toRadians(yy), pedipalpL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 15.40179 + (((tickAnim - 0) / 2) * (-6.39101-(15.40179)));
            yy = -4.77412 + (((tickAnim - 0) / 2) * (-5.02699-(-4.77412)));
            zz = 1.53962 + (((tickAnim - 0) / 2) * (-13.16731-(1.53962)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.39101 + (((tickAnim - 2) / 3) * (-20.81527-(-6.39101)));
            yy = -5.02699 + (((tickAnim - 2) / 3) * (12.87034-(-5.02699)));
            zz = -13.16731 + (((tickAnim - 2) / 3) * (-2.85695-(-13.16731)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -20.81527 + (((tickAnim - 5) / 5) * (15.40179-(-20.81527)));
            yy = 12.87034 + (((tickAnim - 5) / 5) * (-4.77412-(12.87034)));
            zz = -2.85695 + (((tickAnim - 5) / 5) * (1.53962-(-2.85695)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 15.40179 + (((tickAnim - 10) / 2) * (-6.39101-(15.40179)));
            yy = -4.77412 + (((tickAnim - 10) / 2) * (-5.02699-(-4.77412)));
            zz = 1.53962 + (((tickAnim - 10) / 2) * (-13.16731-(1.53962)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -6.39101 + (((tickAnim - 12) / 2) * (-20.81527-(-6.39101)));
            yy = -5.02699 + (((tickAnim - 12) / 2) * (12.87034-(-5.02699)));
            zz = -13.16731 + (((tickAnim - 12) / 2) * (-2.85695-(-13.16731)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -20.81527 + (((tickAnim - 14) / 5) * (15.40179-(-20.81527)));
            yy = 12.87034 + (((tickAnim - 14) / 5) * (-4.77412-(12.87034)));
            zz = -2.85695 + (((tickAnim - 14) / 5) * (1.53962-(-2.85695)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL1, LegL1.rotateAngleX + (float) Math.toRadians(xx), LegL1.rotateAngleY + (float) Math.toRadians(yy), LegL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.5 + (((tickAnim - 0) / 5) * (12.64505-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (-8.91829-(0)));
            zz = 2.5 + (((tickAnim - 0) / 5) * (-1.44905-(2.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 12.64505 + (((tickAnim - 5) / 2) * (-9.74696-(12.64505)));
            yy = -8.91829 + (((tickAnim - 5) / 2) * (-6.84198-(-8.91829)));
            zz = -1.44905 + (((tickAnim - 5) / 2) * (-14.46465-(-1.44905)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -9.74696 + (((tickAnim - 7) / 3) * (-27.5-(-9.74696)));
            yy = -6.84198 + (((tickAnim - 7) / 3) * (0-(-6.84198)));
            zz = -14.46465 + (((tickAnim - 7) / 3) * (2.5-(-14.46465)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -27.5 + (((tickAnim - 10) / 4) * (12.64505-(-27.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (-8.91829-(0)));
            zz = 2.5 + (((tickAnim - 10) / 4) * (-1.44905-(2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 12.64505 + (((tickAnim - 14) / 3) * (-9.74696-(12.64505)));
            yy = -8.91829 + (((tickAnim - 14) / 3) * (-6.84198-(-8.91829)));
            zz = -1.44905 + (((tickAnim - 14) / 3) * (-14.46465-(-1.44905)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -9.74696 + (((tickAnim - 17) / 2) * (-27.5-(-9.74696)));
            yy = -6.84198 + (((tickAnim - 17) / 2) * (0-(-6.84198)));
            zz = -14.46465 + (((tickAnim - 17) / 2) * (2.5-(-14.46465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL2, LegL2.rotateAngleX + (float) Math.toRadians(xx), LegL2.rotateAngleY + (float) Math.toRadians(yy), LegL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.56717 + (((tickAnim - 0) / 2) * (-6.90436-(-0.56717)));
            yy = -7.0578 + (((tickAnim - 0) / 2) * (14.35705-(-7.0578)));
            zz = 1.35189 + (((tickAnim - 0) / 2) * (-13.74855-(1.35189)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.90436 + (((tickAnim - 2) / 3) * (-13.13466-(-6.90436)));
            yy = 14.35705 + (((tickAnim - 2) / 3) * (19.31312-(14.35705)));
            zz = -13.74855 + (((tickAnim - 2) / 3) * (-3.74512-(-13.74855)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.13466 + (((tickAnim - 5) / 5) * (-0.56717-(-13.13466)));
            yy = 19.31312 + (((tickAnim - 5) / 5) * (-7.0578-(19.31312)));
            zz = -3.74512 + (((tickAnim - 5) / 5) * (1.35189-(-3.74512)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.56717 + (((tickAnim - 10) / 2) * (-6.90436-(-0.56717)));
            yy = -7.0578 + (((tickAnim - 10) / 2) * (14.35705-(-7.0578)));
            zz = 1.35189 + (((tickAnim - 10) / 2) * (-13.74855-(1.35189)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -6.90436 + (((tickAnim - 12) / 2) * (-13.13466-(-6.90436)));
            yy = 14.35705 + (((tickAnim - 12) / 2) * (19.31312-(14.35705)));
            zz = -13.74855 + (((tickAnim - 12) / 2) * (-3.74512-(-13.74855)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -13.13466 + (((tickAnim - 14) / 5) * (-0.56717-(-13.13466)));
            yy = 19.31312 + (((tickAnim - 14) / 5) * (-7.0578-(19.31312)));
            zz = -3.74512 + (((tickAnim - 14) / 5) * (1.35189-(-3.74512)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL3, LegL3.rotateAngleX + (float) Math.toRadians(xx), LegL3.rotateAngleY + (float) Math.toRadians(yy), LegL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -12.567 + (((tickAnim - 0) / 5) * (-1.40418-(-12.567)));
            yy = 15.20462 + (((tickAnim - 0) / 5) * (-13.66415-(15.20462)));
            zz = 7.55677 + (((tickAnim - 0) / 5) * (-11.77164-(7.55677)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -1.40418 + (((tickAnim - 5) / 2) * (-1.42561-(-1.40418)));
            yy = -13.66415 + (((tickAnim - 5) / 2) * (13.05023-(-13.66415)));
            zz = -11.77164 + (((tickAnim - 5) / 2) * (-13.1821-(-11.77164)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.42561 + (((tickAnim - 7) / 3) * (-12.567-(-1.42561)));
            yy = 13.05023 + (((tickAnim - 7) / 3) * (15.20462-(13.05023)));
            zz = -13.1821 + (((tickAnim - 7) / 3) * (7.55677-(-13.1821)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -12.567 + (((tickAnim - 10) / 4) * (-1.40418-(-12.567)));
            yy = 15.20462 + (((tickAnim - 10) / 4) * (-13.66415-(15.20462)));
            zz = 7.55677 + (((tickAnim - 10) / 4) * (-11.77164-(7.55677)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -1.40418 + (((tickAnim - 14) / 3) * (-1.42561-(-1.40418)));
            yy = -13.66415 + (((tickAnim - 14) / 3) * (13.05023-(-13.66415)));
            zz = -11.77164 + (((tickAnim - 14) / 3) * (-13.1821-(-11.77164)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -1.42561 + (((tickAnim - 17) / 2) * (-12.567-(-1.42561)));
            yy = 13.05023 + (((tickAnim - 17) / 2) * (15.20462-(13.05023)));
            zz = -13.1821 + (((tickAnim - 17) / 2) * (7.55677-(-13.1821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL4, LegL4.rotateAngleX + (float) Math.toRadians(xx), LegL4.rotateAngleY + (float) Math.toRadians(yy), LegL4.rotateAngleZ + (float) Math.toRadians(zz));

    }

}
