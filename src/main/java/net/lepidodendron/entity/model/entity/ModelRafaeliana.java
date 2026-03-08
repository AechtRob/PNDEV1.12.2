package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraRafaeliana;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelRafaeliana extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer thorax;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer leftAntenna_r1;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer rightAntenna_r1;
    private final AdvancedModelRenderer abdomen;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer LeftForewing;
    private final AdvancedModelRenderer RightForewing;
    private final AdvancedModelRenderer RightHindwing;
    private final AdvancedModelRenderer RightHindwing_r1;
    private final AdvancedModelRenderer LeftHindwing;
    private final AdvancedModelRenderer LeftHindwing_r1;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer cube_r9;

    private ModelAnimator animator;

    public ModelRafaeliana() {
        this.textureWidth = 37;
        this.textureHeight = 31;

        this.thorax = new AdvancedModelRenderer(this);
        this.thorax.setRotationPoint(0.0F, 21.5F, -5.0F);
        this.thorax.cubeList.add(new ModelBox(thorax, 19, 11, -1.5F, -0.7F, -1.1F, 3, 2, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.9F, -0.2F);
        this.thorax.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 10, -0.5F, -1.7F, -1.6F, 2, 1, 1, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.1F, 1.1F, -2.3F);
        this.thorax.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9F, 0.5F, -1.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.9948F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 27, 1.0F, -3.125F, -0.125F, 2, 2, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 16, 0.9F, -2.1F, -0.925F, 1, 1, 1, 0.01F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 16, 2.1F, -2.1F, -0.925F, 1, 1, 1, 0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 13, 1.5F, -2.1F, -0.9F, 1, 1, 1, 0.0F, false));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.9F, 0.0F, 0.1F);
        this.head.addChild(leftAntenna);
        this.setRotateAngle(leftAntenna, 0.0F, 0.2618F, 0.0F);


        this.leftAntenna_r1 = new AdvancedModelRenderer(this);
        this.leftAntenna_r1.setRotationPoint(-0.2F, 0.1F, 0.0F);
        this.leftAntenna.addChild(leftAntenna_r1);
        this.setRotateAngle(leftAntenna_r1, -0.2202F, 0.1363F, -0.0304F);
        this.leftAntenna_r1.cubeList.add(new ModelBox(leftAntenna_r1, 19, 24, -0.2609F, -0.0764F, -1.9476F, 3, 0, 2, 0.0F, true));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.7F, 0.0F, 0.1F);
        this.head.addChild(rightAntenna);
        this.setRotateAngle(rightAntenna, 0.0F, -0.2618F, 0.0F);


        this.rightAntenna_r1 = new AdvancedModelRenderer(this);
        this.rightAntenna_r1.setRotationPoint(0.2F, 0.1F, 0.0F);
        this.rightAntenna.addChild(rightAntenna_r1);
        this.setRotateAngle(rightAntenna_r1, -0.2202F, -0.1363F, 0.0304F);
        this.rightAntenna_r1.cubeList.add(new ModelBox(rightAntenna_r1, 19, 24, -2.7391F, -0.0764F, -1.9476F, 3, 0, 2, 0.0F, false));

        this.abdomen = new AdvancedModelRenderer(this);
        this.abdomen.setRotationPoint(-0.5F, -0.5F, 0.8F);
        this.thorax.addChild(abdomen);
        this.setRotateAngle(abdomen, 0.0436F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.6F, 0.6F);
        this.abdomen.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 11, -1.0F, 0.1F, -0.775F, 3, 1, 6, -0.02F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, -1.0F, -0.625F, -0.775F, 3, 1, 6, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 27, -0.5F, -0.475F, 5.2F, 2, 1, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 27, -0.5F, 0.025F, 5.2F, 2, 1, 2, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 6, 0.0F, -0.25F, 6.9F, 1, 1, 2, 0.0F, false));

        this.LeftForewing = new AdvancedModelRenderer(this);
        this.LeftForewing.setRotationPoint(0.9F, -0.65F, -0.8F);
        this.thorax.addChild(LeftForewing);
        this.setRotateAngle(LeftForewing, 0.0F, -1.3526F, 0.0F);
        this.LeftForewing.cubeList.add(new ModelBox(LeftForewing, -5, 0, 0.0F, -0.01F, -0.5F, 18, 0, 5, 0.0F, true));

        this.RightForewing = new AdvancedModelRenderer(this);
        this.RightForewing.setRotationPoint(-0.9F, -0.7F, -0.8F);
        this.thorax.addChild(RightForewing);
        this.setRotateAngle(RightForewing, 0.0F, 1.3526F, 0.0F);
        this.RightForewing.cubeList.add(new ModelBox(RightForewing, -5, 0, -18.0F, -0.01F, -0.5F, 18, 0, 5, 0.0F, false));

        this.RightHindwing = new AdvancedModelRenderer(this);
        this.RightHindwing.setRotationPoint(-0.9F, -0.4F, 0.9F);
        this.thorax.addChild(RightHindwing);
        this.setRotateAngle(RightHindwing, 0.0F, 0.9599F, 0.0F);


        this.RightHindwing_r1 = new AdvancedModelRenderer(this);
        this.RightHindwing_r1.setRotationPoint(-0.6F, 0.0F, 0.7F);
        this.RightHindwing.addChild(RightHindwing_r1);
        this.setRotateAngle(RightHindwing_r1, 0.0F, 0.3927F, 0.0F);
        this.RightHindwing_r1.cubeList.add(new ModelBox(RightHindwing_r1, -4, 6, -9.0F, -0.01F, -1.0F, 10, 0, 4, 0.0F, false));

        this.LeftHindwing = new AdvancedModelRenderer(this);
        this.LeftHindwing.setRotationPoint(0.9F, -0.35F, 0.9F);
        this.thorax.addChild(LeftHindwing);
        this.setRotateAngle(LeftHindwing, 0.0F, -0.9599F, 0.0F);


        this.LeftHindwing_r1 = new AdvancedModelRenderer(this);
        this.LeftHindwing_r1.setRotationPoint(0.6F, 0.0F, 0.7F);
        this.LeftHindwing.addChild(LeftHindwing_r1);
        this.setRotateAngle(LeftHindwing_r1, 0.0F, -0.3927F, 0.0F);
        this.LeftHindwing_r1.cubeList.add(new ModelBox(LeftHindwing_r1, -4, 6, -1.0F, -0.01F, -1.0F, 10, 0, 4, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.35F, 0.9F, 0.525F);
        this.thorax.addChild(leftLeg3);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.05F, 0.0F, 0.075F);
        this.leftLeg3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0553F, -0.8894F, 0.0405F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 20, -0.3062F, -1.4393F, -0.0652F, 5, 3, 0, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(0.7804F, 1.0F, -1.0513F);
        this.thorax.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, -0.3927F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.7617F, 1.5F, 0.9076F);
        this.leftLeg1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 1.0472F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 16, -1.0F, -3.0F, -2.0F, 5, 3, 0, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.3813F, 0.9F, -0.4773F);
        this.thorax.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.4363F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0423F, 0.1F, -0.0906F);
        this.leftLeg2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, -0.0524F, -0.0006F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 27, -0.0425F, -1.5497F, 0.1009F, 4, 3, 0, 0.0F, true));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-0.7804F, 1.0F, -1.0513F);
        this.thorax.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.3927F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.7617F, 1.5F, 0.9076F);
        this.rightLeg1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -1.0472F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 19, 16, -4.0F, -3.0F, -2.0F, 5, 3, 0, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.3813F, 0.9F, -0.4773F);
        this.thorax.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.4363F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0423F, 0.1F, -0.0906F);
        this.rightLeg2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0349F, 0.0524F, 0.0006F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 27, -3.9575F, -1.5497F, 0.1009F, 4, 3, 0, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.35F, 0.9F, 0.525F);
        this.thorax.addChild(rightLeg3);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.05F, 0.0F, 0.075F);
        this.rightLeg3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0553F, 0.8894F, -0.0405F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 20, -4.6938F, -1.4393F, -0.0652F, 5, 3, 0, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.thorax.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(thorax, 0.0F, 0.0F, 0.0F);
        this.thorax.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.thorax.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.thorax.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.thorax.offsetY = -2.30F;
        this.thorax.offsetX = -0.05F;
        this.thorax.rotateAngleY = (float)Math.toRadians(210);
        this.thorax.rotateAngleX = (float)Math.toRadians(8);
        this.thorax.rotateAngleZ = (float)Math.toRadians(-8);
        this.thorax.scaleChildren = true;
        float scaler = 2.9F;
        this.thorax.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.thorax.render(f);
        //Reset rotations, positions and sizing:
        this.thorax.setScale(1.0F, 1.0F, 1.0F);
        this.thorax.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraRafaeliana ee = (EntityPrehistoricFloraRafaeliana) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraRafaeliana ee = (EntityPrehistoricFloraRafaeliana) entitylivingbaseIn;

        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {//not flying

        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraRafaeliana entity = (EntityPrehistoricFloraRafaeliana) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(thorax, thorax.rotateAngleX + (float) (Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(562))+40))*4), thorax.rotateAngleY + (float) Math.toRadians(0), thorax.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(375))+40))*4);
        this.thorax.rotationPointX = this.thorax.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*1);
        this.thorax.rotationPointY = this.thorax.rotationPointY - (float)(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*2);
        this.thorax.rotationPointZ = this.thorax.rotationPointZ + (float)(0);


        this.setRotateAngle(rightAntenna, rightAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374-120))*6), rightAntenna.rotateAngleY + (float) Math.toRadians(0), rightAntenna.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 0) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 0) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 78.31092 + (((tickAnim - 1) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 1) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 1) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 2) / 0) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 2) / 0) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 2) / 0) * (23.18227-(-65)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -73.11605 + (((tickAnim - 2) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 2) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 2) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 3) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 3) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 78.31092 + (((tickAnim - 4) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 4) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 4) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 5) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 5) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -73.11605 + (((tickAnim - 6) / 0) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 6) / 0) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 6) / 0) * (75-(23.18227)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 6) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 6) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 78.31092 + (((tickAnim - 7) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 7) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 7) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 8) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 8) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -73.11605 + (((tickAnim - 9) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 9) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 9) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 10) / 0) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 10) / 0) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 10) / 0) * (2.7377-(75)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 78.31092 + (((tickAnim - 10) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 10) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 10) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 11) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 11) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -73.11605 + (((tickAnim - 12) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 12) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 12) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 13) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 13) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 78.31092 + (((tickAnim - 14) / 0) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 14) / 0) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 14) / 0) * (-65-(2.7377)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 14) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 14) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -73.11605 + (((tickAnim - 15) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 15) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 15) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 16) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 16) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 78.31092 + (((tickAnim - 17) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 17) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 17) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 18) / 0) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 18) / 0) * (23.18227-(-65)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -73.11605 + (((tickAnim - 18) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 18) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 18) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 19) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 19) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 78.31092 + (((tickAnim - 20) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 20) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 20) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 21) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 21) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -73.11605 + (((tickAnim - 22) / 0) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 22) / 0) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 22) / 0) * (75-(23.18227)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 22) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 22) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 78.31092 + (((tickAnim - 23) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 23) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 23) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 24) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 24) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -73.11605 + (((tickAnim - 25) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 25) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 25) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 26) / 0) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 26) / 0) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 26) / 0) * (2.7377-(75)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 78.31092 + (((tickAnim - 26) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 26) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 26) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 27) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 27) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -73.11605 + (((tickAnim - 28) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 28) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 28) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 29) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 29) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 78.31092 + (((tickAnim - 30) / 0) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 30) / 0) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 30) / 0) * (-65-(2.7377)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 30) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 30) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -73.11605 + (((tickAnim - 31) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 31) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 31) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 32) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 32) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 78.31092 + (((tickAnim - 33) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 33) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 33) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 34) / 0) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 34) / 0) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 34) / 0) * (23.18227-(-65)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -73.11605 + (((tickAnim - 34) / 1) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 34) / 1) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 34) / 1) * (75-(23.18227)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (78.31092-(0)));
            yy = -77.5 + (((tickAnim - 35) / 1) * (-90.75992-(-77.5)));
            zz = 75 + (((tickAnim - 35) / 1) * (2.7377-(75)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 78.31092 + (((tickAnim - 36) / 1) * (0-(78.31092)));
            yy = -90.75992 + (((tickAnim - 36) / 1) * (-77.5-(-90.75992)));
            zz = 2.7377 + (((tickAnim - 36) / 1) * (-65-(2.7377)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (-73.11605-(0)));
            yy = -77.5 + (((tickAnim - 37) / 1) * (-77.90596-(-77.5)));
            zz = -65 + (((tickAnim - 37) / 1) * (23.18227-(-65)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -73.11605 + (((tickAnim - 38) / 0) * (0-(-73.11605)));
            yy = -77.90596 + (((tickAnim - 38) / 0) * (-77.5-(-77.90596)));
            zz = 23.18227 + (((tickAnim - 38) / 0) * (75-(23.18227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightForewing, RightForewing.rotateAngleX + (float) Math.toRadians(xx), RightForewing.rotateAngleY + (float) Math.toRadians(yy), RightForewing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.41492 + (((tickAnim - 0) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 0) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 0) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 92.26173 + (((tickAnim - 1) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 1) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 1) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 1.42628 + (((tickAnim - 2) / 0) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 2) / 0) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 2) / 0) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -73.73912 + (((tickAnim - 2) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 2) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 2) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -2.41492 + (((tickAnim - 3) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 3) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 3) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 92.26173 + (((tickAnim - 4) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 4) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 4) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 1.42628 + (((tickAnim - 5) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 5) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 5) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -73.73912 + (((tickAnim - 6) / 0) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 6) / 0) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 6) / 0) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -2.41492 + (((tickAnim - 6) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 6) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 6) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 92.26173 + (((tickAnim - 7) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 7) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 7) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.42628 + (((tickAnim - 8) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 8) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 8) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -73.73912 + (((tickAnim - 9) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 9) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 9) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -2.41492 + (((tickAnim - 10) / 0) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 10) / 0) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 10) / 0) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 92.26173 + (((tickAnim - 10) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 10) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 10) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 1.42628 + (((tickAnim - 11) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 11) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 11) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -73.73912 + (((tickAnim - 12) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 12) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 12) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -2.41492 + (((tickAnim - 13) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 13) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 13) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 92.26173 + (((tickAnim - 14) / 0) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 14) / 0) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 14) / 0) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 1.42628 + (((tickAnim - 14) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 14) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 14) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -73.73912 + (((tickAnim - 15) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 15) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 15) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -2.41492 + (((tickAnim - 16) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 16) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 16) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 92.26173 + (((tickAnim - 17) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 17) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 17) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 1.42628 + (((tickAnim - 18) / 0) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 18) / 0) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 18) / 0) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -73.73912 + (((tickAnim - 18) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 18) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 18) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -2.41492 + (((tickAnim - 19) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 19) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 19) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 92.26173 + (((tickAnim - 20) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 20) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 20) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 1.42628 + (((tickAnim - 21) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 21) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 21) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -73.73912 + (((tickAnim - 22) / 0) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 22) / 0) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 22) / 0) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -2.41492 + (((tickAnim - 22) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 22) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 22) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 92.26173 + (((tickAnim - 23) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 23) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 23) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 1.42628 + (((tickAnim - 24) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 24) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 24) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -73.73912 + (((tickAnim - 25) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 25) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 25) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -2.41492 + (((tickAnim - 26) / 0) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 26) / 0) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 26) / 0) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 92.26173 + (((tickAnim - 26) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 26) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 26) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 1.42628 + (((tickAnim - 27) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 27) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 27) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -73.73912 + (((tickAnim - 28) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 28) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 28) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -2.41492 + (((tickAnim - 29) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 29) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 29) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 92.26173 + (((tickAnim - 30) / 0) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 30) / 0) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 30) / 0) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 1.42628 + (((tickAnim - 30) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 30) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 30) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -73.73912 + (((tickAnim - 31) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 31) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 31) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -2.41492 + (((tickAnim - 32) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 32) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 32) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 92.26173 + (((tickAnim - 33) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 33) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 33) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 1.42628 + (((tickAnim - 34) / 0) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 34) / 0) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 34) / 0) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -73.73912 + (((tickAnim - 34) / 1) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 34) / 1) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 34) / 1) * (75.01363-(28.19402)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -2.41492 + (((tickAnim - 35) / 1) * (92.26173-(-2.41492)));
            yy = -55.64686 + (((tickAnim - 35) / 1) * (-60.39733-(-55.64686)));
            zz = 75.01363 + (((tickAnim - 35) / 1) * (-22.79658-(75.01363)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 92.26173 + (((tickAnim - 36) / 1) * (1.42628-(92.26173)));
            yy = -60.39733 + (((tickAnim - 36) / 1) * (-66.01298-(-60.39733)));
            zz = -22.79658 + (((tickAnim - 36) / 1) * (-65.3432-(-22.79658)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 1.42628 + (((tickAnim - 37) / 1) * (-73.73912-(1.42628)));
            yy = -66.01298 + (((tickAnim - 37) / 1) * (-45.80356-(-66.01298)));
            zz = -65.3432 + (((tickAnim - 37) / 1) * (28.19402-(-65.3432)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -73.73912 + (((tickAnim - 38) / 0) * (-2.41492-(-73.73912)));
            yy = -45.80356 + (((tickAnim - 38) / 0) * (-55.64686-(-45.80356)));
            zz = 28.19402 + (((tickAnim - 38) / 0) * (75.01363-(28.19402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RightHindwing, RightHindwing.rotateAngleX + (float) Math.toRadians(xx), RightHindwing.rotateAngleY + (float) Math.toRadians(yy), RightHindwing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(10), rightLeg1.rotateAngleY + (float) Math.toRadians(15), rightLeg1.rotateAngleZ + (float) Math.toRadians(35-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+40))*10);


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) (Math.toRadians(-10.6936+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6), rightLeg2.rotateAngleY + (float) Math.toRadians(23.17475), rightLeg2.rotateAngleZ + (float) Math.toRadians(-7.02143));


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) (Math.toRadians(-17.8513+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+80))*4), rightLeg3.rotateAngleY + (float) Math.toRadians(14.78611), rightLeg3.rotateAngleZ + (float) Math.toRadians(-1.81392));



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.41492 + (((tickAnim - 0) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 0) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 0) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 92.26173 + (((tickAnim - 1) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 1) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 1) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 1.42628 + (((tickAnim - 2) / 0) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 2) / 0) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 2) / 0) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -73.73912 + (((tickAnim - 2) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 2) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 2) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -2.41492 + (((tickAnim - 3) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 3) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 3) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 92.26173 + (((tickAnim - 4) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 4) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 4) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 1.42628 + (((tickAnim - 5) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 5) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 5) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -73.73912 + (((tickAnim - 6) / 0) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 6) / 0) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 6) / 0) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -2.41492 + (((tickAnim - 6) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 6) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 6) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 92.26173 + (((tickAnim - 7) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 7) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 7) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 1.42628 + (((tickAnim - 8) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 8) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 8) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -73.73912 + (((tickAnim - 9) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 9) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 9) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = -2.41492 + (((tickAnim - 10) / 0) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 10) / 0) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 10) / 0) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 92.26173 + (((tickAnim - 10) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 10) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 10) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 1.42628 + (((tickAnim - 11) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 11) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 11) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -73.73912 + (((tickAnim - 12) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 12) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 12) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -2.41492 + (((tickAnim - 13) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 13) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 13) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 92.26173 + (((tickAnim - 14) / 0) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 14) / 0) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 14) / 0) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 1.42628 + (((tickAnim - 14) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 14) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 14) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -73.73912 + (((tickAnim - 15) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 15) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 15) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = -2.41492 + (((tickAnim - 16) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 16) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 16) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 92.26173 + (((tickAnim - 17) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 17) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 17) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 1.42628 + (((tickAnim - 18) / 0) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 18) / 0) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 18) / 0) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -73.73912 + (((tickAnim - 18) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 18) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 18) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = -2.41492 + (((tickAnim - 19) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 19) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 19) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 92.26173 + (((tickAnim - 20) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 20) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 20) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 1.42628 + (((tickAnim - 21) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 21) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 21) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -73.73912 + (((tickAnim - 22) / 0) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 22) / 0) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 22) / 0) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -2.41492 + (((tickAnim - 22) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 22) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 22) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 92.26173 + (((tickAnim - 23) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 23) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 23) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 1.42628 + (((tickAnim - 24) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 24) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 24) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -73.73912 + (((tickAnim - 25) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 25) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 25) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = -2.41492 + (((tickAnim - 26) / 0) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 26) / 0) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 26) / 0) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 92.26173 + (((tickAnim - 26) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 26) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 26) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 1.42628 + (((tickAnim - 27) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 27) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 27) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -73.73912 + (((tickAnim - 28) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 28) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 28) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -2.41492 + (((tickAnim - 29) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 29) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 29) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 92.26173 + (((tickAnim - 30) / 0) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 30) / 0) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 30) / 0) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 1.42628 + (((tickAnim - 30) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 30) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 30) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -73.73912 + (((tickAnim - 31) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 31) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 31) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -2.41492 + (((tickAnim - 32) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 32) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 32) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 92.26173 + (((tickAnim - 33) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 33) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 33) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 1.42628 + (((tickAnim - 34) / 0) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 34) / 0) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 34) / 0) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -73.73912 + (((tickAnim - 34) / 1) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 34) / 1) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 34) / 1) * (-75.01363-(-28.19402)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = -2.41492 + (((tickAnim - 35) / 1) * (92.26173-(-2.41492)));
            yy = 55.64686 + (((tickAnim - 35) / 1) * (60.39733-(55.64686)));
            zz = -75.01363 + (((tickAnim - 35) / 1) * (22.79658-(-75.01363)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 92.26173 + (((tickAnim - 36) / 1) * (1.42628-(92.26173)));
            yy = 60.39733 + (((tickAnim - 36) / 1) * (66.01298-(60.39733)));
            zz = 22.79658 + (((tickAnim - 36) / 1) * (65.3432-(22.79658)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 1.42628 + (((tickAnim - 37) / 1) * (-73.73912-(1.42628)));
            yy = 66.01298 + (((tickAnim - 37) / 1) * (45.80356-(66.01298)));
            zz = 65.3432 + (((tickAnim - 37) / 1) * (-28.19402-(65.3432)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -73.73912 + (((tickAnim - 38) / 0) * (-2.41492-(-73.73912)));
            yy = 45.80356 + (((tickAnim - 38) / 0) * (55.64686-(45.80356)));
            zz = -28.19402 + (((tickAnim - 38) / 0) * (-75.01363-(-28.19402)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftHindwing, LeftHindwing.rotateAngleX + (float) Math.toRadians(xx), LeftHindwing.rotateAngleY + (float) Math.toRadians(yy), LeftHindwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 0) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 0) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 78.31092 + (((tickAnim - 1) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 1) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 1) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 2) / 0) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 2) / 0) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 2) / 0) * (-23.18227-(65)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -73.11605 + (((tickAnim - 2) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 2) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 2) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 3) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 3) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 78.31092 + (((tickAnim - 4) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 4) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 4) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 5) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 5) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -73.11605 + (((tickAnim - 6) / 0) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 6) / 0) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 6) / 0) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 6) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 6) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 78.31092 + (((tickAnim - 7) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 7) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 7) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 8) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 8) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -73.11605 + (((tickAnim - 9) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 9) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 9) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 10) / 0) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 10) / 0) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 10) / 0) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 78.31092 + (((tickAnim - 10) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 10) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 10) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 11) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 11) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -73.11605 + (((tickAnim - 12) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 12) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 12) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 13) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 13) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 78.31092 + (((tickAnim - 14) / 0) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 14) / 0) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 14) / 0) * (65-(-2.7377)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 14) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 14) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -73.11605 + (((tickAnim - 15) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 15) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 15) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 16) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 16) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 78.31092 + (((tickAnim - 17) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 17) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 17) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 18) / 0) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 18) / 0) * (-23.18227-(65)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -73.11605 + (((tickAnim - 18) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 18) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 18) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 19) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 19) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 78.31092 + (((tickAnim - 20) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 20) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 20) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 21) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 21) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -73.11605 + (((tickAnim - 22) / 0) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 22) / 0) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 22) / 0) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 22) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 22) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 78.31092 + (((tickAnim - 23) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 23) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 23) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 24) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 24) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -73.11605 + (((tickAnim - 25) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 25) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 25) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 26) / 0) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 26) / 0) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 26) / 0) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 78.31092 + (((tickAnim - 26) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 26) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 26) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 27) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 27) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -73.11605 + (((tickAnim - 28) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 28) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 28) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 29) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 29) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 78.31092 + (((tickAnim - 30) / 0) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 30) / 0) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 30) / 0) * (65-(-2.7377)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 30) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 30) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -73.11605 + (((tickAnim - 31) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 31) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 31) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 32) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 32) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 78.31092 + (((tickAnim - 33) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 33) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 33) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 34) / 0) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 34) / 0) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 34) / 0) * (-23.18227-(65)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -73.11605 + (((tickAnim - 34) / 1) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 34) / 1) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 34) / 1) * (-75-(-23.18227)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (78.31092-(0)));
            yy = 77.5 + (((tickAnim - 35) / 1) * (90.75992-(77.5)));
            zz = -75 + (((tickAnim - 35) / 1) * (-2.7377-(-75)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 78.31092 + (((tickAnim - 36) / 1) * (0-(78.31092)));
            yy = 90.75992 + (((tickAnim - 36) / 1) * (77.5-(90.75992)));
            zz = -2.7377 + (((tickAnim - 36) / 1) * (65-(-2.7377)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (-73.11605-(0)));
            yy = 77.5 + (((tickAnim - 37) / 1) * (77.90596-(77.5)));
            zz = 65 + (((tickAnim - 37) / 1) * (-23.18227-(65)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -73.11605 + (((tickAnim - 38) / 0) * (0-(-73.11605)));
            yy = 77.90596 + (((tickAnim - 38) / 0) * (77.5-(77.90596)));
            zz = -23.18227 + (((tickAnim - 38) / 0) * (-75-(-23.18227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LeftForewing, LeftForewing.rotateAngleX + (float) Math.toRadians(xx), LeftForewing.rotateAngleY + (float) Math.toRadians(yy), LeftForewing.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftAntenna, leftAntenna.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374))*6), leftAntenna.rotateAngleY + (float) Math.toRadians(0), leftAntenna.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) (Math.toRadians(-17.8513+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*4), leftLeg3.rotateAngleY + (float) Math.toRadians(-14.78611), leftLeg3.rotateAngleZ + (float) Math.toRadians(1.81392));


        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(10), leftLeg1.rotateAngleY + (float) Math.toRadians(-15), leftLeg1.rotateAngleZ + (float) Math.toRadians(35+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+20))*10);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) (Math.toRadians(-10.6936+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+60))*6), leftLeg2.rotateAngleY + (float) Math.toRadians(-23.17475), leftLeg2.rotateAngleZ + (float) Math.toRadians(7.02143));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraInsectFlyingBase e = (EntityPrehistoricFloraInsectFlyingBase) entity;
        animator.update(entity);
        //N/A
    }

}
