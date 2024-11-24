package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinophorosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSpinophorosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer mainbody;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer Box_r1;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neckend;
    private final AdvancedModelRenderer headbase;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer part7;
    private final AdvancedModelRenderer masseter;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer Rclaw;
    private final AdvancedModelRenderer Rtoes;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer Rclaw2;
    private final AdvancedModelRenderer Rtoes2;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;

    private ModelAnimator animator;

    public ModelSpinophorosaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.mainbody = new AdvancedModelRenderer(this);
        this.mainbody.setRotationPoint(0.0F, -19.0F, 14.0F);
        this.setRotateAngle(mainbody, -0.0548F, 0.0F, 0.0F);


        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.6618F, -2.7155F);
        this.mainbody.addChild(body2);
        this.setRotateAngle(body2, -0.2346F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 88, 229, -8.5F, -2.5388F, -21.3883F, 17, 6, 21, 0.0F, false));

        this.Box_r1 = new AdvancedModelRenderer(this);
        this.Box_r1.setRotationPoint(0.0F, 12.7612F, -9.8883F);
        this.body2.addChild(Box_r1);
        this.setRotateAngle(Box_r1, 0.2487F, 0.0F, 0.0F);
        this.Box_r1.cubeList.add(new ModelBox(Box_r1, 0, 210, -10.5F, -12.0F, -9.0F, 21, 24, 22, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 5.7612F, -21.8383F);
        this.body2.addChild(chest);
        this.setRotateAngle(chest, 0.2053F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 0, 173, -8.5F, -0.8737F, -11.9183F, 17, 21, 14, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.4263F, -6.9183F);
        this.chest.addChild(neck4);
        this.setRotateAngle(neck4, -0.6545F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 170, 226, -4.5F, -6.0F, -16.0F, 9, 14, 16, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.neck4.addChild(neck3);
        this.setRotateAngle(neck3, -0.2737F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 172, 197, -4.0F, -5.5F, -16.0F, 8, 12, 16, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.neck3.addChild(neck2);
        this.setRotateAngle(neck2, -0.2737F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 174, 170, -3.5F, -5.0F, -14.0F, 7, 11, 14, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.5F, -12.0F);
        this.neck2.addChild(neck1);
        this.setRotateAngle(neck1, 0.3519F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 178, 147, -3.0F, -4.5F, -11.0F, 6, 10, 11, 0.02F, false));

        this.neckend = new AdvancedModelRenderer(this);
        this.neckend.setRotationPoint(0.0F, -4.5F, -11.0F);
        this.neck1.addChild(neckend);
        this.setRotateAngle(neckend, 0.7819F, 0.0F, 0.0F);
        this.neckend.cubeList.add(new ModelBox(neckend, 183, 130, -3.0F, 0.0F, -6.0F, 6, 10, 6, 0.01F, false));

        this.headbase = new AdvancedModelRenderer(this);
        this.headbase.setRotationPoint(0.0F, 3.9F, -4.7F);
        this.neckend.addChild(headbase);
        this.setRotateAngle(headbase, 0.2761F, 0.0F, 0.0F);
        this.headbase.cubeList.add(new ModelBox(headbase, 0, 0, 0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.headbase.addChild(head1);
        this.head1.cubeList.add(new ModelBox(head1, 207, 110, -3.0F, -3.0F, -6.0F, 6, 6, 6, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.0F, -5.8F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, -0.0349F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 207, 97, -2.0F, 0.0F, -8.0F, 4, 3, 8, 0.0F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -3.2F, -1.9F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.0782F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 210, 75, -2.5F, 0.0F, -2.0F, 5, 4, 4, -0.01F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, 3.95F, -6.1F);
        this.head3.addChild(head4);
        this.setRotateAngle(head4, 0.7533F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 208, 64, -2.5F, 0.0F, 0.0F, 5, 3, 6, 0.0F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 3.0F, -4.6F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.303F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 207, 85, -2.5F, 0.0F, 0.0F, 5, 3, 7, 0.01F, false));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.headbase.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 173, 112, -3.0F, 0.0F, -6.0F, 6, 3, 6, 0.0F, false));

        this.part7 = new AdvancedModelRenderer(this);
        this.part7.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.jaw1.addChild(part7);
        this.setRotateAngle(part7, -0.0349F, 0.0F, 0.0F);
        this.part7.cubeList.add(new ModelBox(part7, 173, 100, -2.0F, 0.0F, -8.0F, 4, 2, 8, 0.0F, false));

        this.masseter = new AdvancedModelRenderer(this);
        this.masseter.setRotationPoint(0.0F, -3.3F, -3.2F);
        this.jaw1.addChild(masseter);
        this.setRotateAngle(masseter, -0.2737F, 0.0F, 0.0F);
        this.masseter.cubeList.add(new ModelBox(masseter, 182, 59, -2.0F, 0.0F, -2.9F, 4, 5, 7, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -8.0737F, -4.8183F);
        this.chest.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 65, 185, -6.5F, 0.0F, -7.0F, 13, 9, 14, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-7.5F, 11.6263F, -6.0183F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.2737F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 62, 43, -4.0F, -2.0F, -4.5F, 8, 16, 9, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 14.0F, 4.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.2346F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 67, 70, -3.0F, 0.0F, -7.0F, 6, 17, 7, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 16.7F, -1.6F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0515F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 70, 97, -3.5F, -1.0F, -5.5F, 7, 6, 7, 0.0F, false));

        this.Rclaw = new AdvancedModelRenderer(this);
        this.Rclaw.setRotationPoint(3.0F, 3.9F, -2.0F);
        this.rightArm3.addChild(Rclaw);
        this.setRotateAngle(Rclaw, 0.0F, 0.821F, 0.0F);
        this.Rclaw.cubeList.add(new ModelBox(Rclaw, 81, 110, 0.0F, -1.0F, -1.1F, 3, 2, 2, 0.0F, true));

        this.Rtoes = new AdvancedModelRenderer(this);
        this.Rtoes.setRotationPoint(0.0F, 3.0F, -7.5F);
        this.rightArm3.addChild(Rtoes);
        this.Rtoes.cubeList.add(new ModelBox(Rtoes, 73, 116, -3.5F, 0.0F, 0.0F, 7, 2, 2, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(7.5F, 11.6263F, -6.0183F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.2737F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 62, 43, -4.0F, -2.0F, -4.5F, 8, 16, 9, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 14.0F, 4.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.2346F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 67, 70, -3.0F, -1.0F, -7.0F, 6, 18, 7, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 16.7F, -1.6F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0515F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 70, 97, -3.5F, -1.0F, -5.5F, 7, 6, 7, 0.0F, true));

        this.Rclaw2 = new AdvancedModelRenderer(this);
        this.Rclaw2.setRotationPoint(-3.0F, 3.9F, -2.0F);
        this.leftArm3.addChild(Rclaw2);
        this.setRotateAngle(Rclaw2, 0.0F, -0.821F, 0.0F);
        this.Rclaw2.cubeList.add(new ModelBox(Rclaw2, 81, 110, -3.0F, -1.0F, -1.1F, 3, 2, 2, 0.0F, false));

        this.Rtoes2 = new AdvancedModelRenderer(this);
        this.Rtoes2.setRotationPoint(0.0F, 3.0F, -7.5F);
        this.leftArm3.addChild(Rtoes2);
        this.Rtoes2.cubeList.add(new ModelBox(Rtoes2, 73, 116, -3.5F, 0.0F, 0.0F, 7, 2, 2, 0.0F, true));

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -3.8618F, -3.1155F);
        this.mainbody.addChild(hips);
        this.setRotateAngle(hips, 0.0391F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 133, -9.3525F, 3.1882F, -0.5135F, 19, 20, 17, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.1475F, 1.1882F, 8.4865F);
        this.hips.addChild(body4);
        this.setRotateAngle(body4, -0.1955F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 74, 149, -7.5F, 0.0F, -8.0F, 15, 5, 16, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.1475F, 11.1882F, 15.4865F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0932F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 98, -6.0F, -8.0F, 0.0F, 12, 16, 18, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -6.1F, 15.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0262F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 66, -5.0F, -1.3494F, 1.8658F, 10, 13, 18, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 4.6506F, 18.8658F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0269F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 34, -3.5F, -5.0F, 0.0F, 7, 10, 21, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 20.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0398F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 5, -3.0F, -3.5F, 0.0F, 6, 7, 21, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 20.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0782F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 55, 8, -2.0F, -2.5F, 0.0F, 4, 5, 20, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-8.5525F, 10.1882F, 7.9865F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1173F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 112, 34, -4.0F, -3.0F, -6.5F, 8, 20, 13, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 17.0F, -6.325F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1564F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 116, 69, -3.0F, -1.0F, 0.0F, 6, 18, 10, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 17.9F, 4.2F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0199F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 112, 99, -4.0F, -2.0F, -8.0F, 8, 5, 14, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(8.8475F, 10.1882F, 7.9865F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1173F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 112, 34, -4.0F, -3.0F, -6.5F, 8, 20, 13, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 17.0F, -6.3F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1564F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 116, 69, -3.0F, -1.0F, 0.0F, 6, 18, 10, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 17.9F, 4.2F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0199F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 112, 99, -4.0F, -2.0F, -8.0F, 8, 5, 14, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.mainbody.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.mainbody.offsetY = 0.7F;
        this.mainbody.offsetX = 0.1F;
        this.mainbody.rotateAngleY = (float)Math.toRadians(210);
        this.mainbody.rotateAngleX = (float)Math.toRadians(8);
        this.mainbody.rotateAngleZ = (float)Math.toRadians(-4);
        this.mainbody.scaleChildren = true;
        float scaler = 0.575F;
        this.mainbody.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.mainbody.render(f);
        //Reset rotations, positions and sizing:
        this.mainbody.setScale(1.0F, 1.0F, 1.0F);
        this.mainbody.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSpinophorosaurus Spinophorosaurus = (EntityPrehistoricFloraSpinophorosaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = Spinophorosaurus.getJuvenile();

        if (isBaby) {
            this.neck1.scaleChildren = true;
            this.neckend.scaleChildren = true;
            this.headbase.scaleChildren = true;
            this.neck1.setScale(1.025F, 1.025F, 1.025F);
            this.neckend.setScale(1.025F, 1.025F, 1.025F);
            this.headbase.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck1.scaleChildren = true;
            this.neckend.scaleChildren = true;
            this.headbase.scaleChildren = true;
            this.neck1.setScale(1F, 1, 1F);
            this.neckend.setScale(1F, 1, 1F);
            this.headbase.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck4,this.neck3, this.neck2, this.neck1, this.neckend, this.headbase};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        Spinophorosaurus.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = Spinophorosaurus.getTravelSpeed()/2;

        if (!Spinophorosaurus.isInWater()) {

            if (f3 == 0.0F || !Spinophorosaurus.getIsMoving()) {
                if (Spinophorosaurus.getAnimation() != Spinophorosaurus.EAT_ANIMATION
                        && Spinophorosaurus.getAnimation() != Spinophorosaurus.DRINK_ANIMATION
                        && Spinophorosaurus.getAnimation() != Spinophorosaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (Spinophorosaurus.getAnimation() != Spinophorosaurus.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (Spinophorosaurus.getAnimation() != Spinophorosaurus.EAT_ANIMATION
                    && Spinophorosaurus.getAnimation() != Spinophorosaurus.DRINK_ANIMATION
                    && Spinophorosaurus.getAnimation() != Spinophorosaurus.ATTACK_ANIMATION
                    && Spinophorosaurus.getAnimation() != Spinophorosaurus.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (Spinophorosaurus.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
            }
        } else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSpinophorosaurus ee = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.TAIL_ANIMATION) { //The leaves grazing anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 258;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 6.25 + (((tickAnim - 90) / 50) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 6.25 + (((tickAnim - 140) / 65) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 6.25 + (((tickAnim - 205) / 53) * (0-(6.25)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(xx), mainbody.rotateAngleY + (float) Math.toRadians(yy), mainbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = -1 + (((tickAnim - 90) / 50) * (-1-(-1)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = -1 + (((tickAnim - 140) / 65) * (-1-(-1)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            yy = -1 + (((tickAnim - 205) / 53) * (0-(-1)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.mainbody.rotationPointX = this.mainbody.rotationPointX + (float)(xx);
        this.mainbody.rotationPointY = this.mainbody.rotationPointY - (float)(yy);
        this.mainbody.rotationPointZ = this.mainbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 8.25 + (((tickAnim - 90) / 50) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 8.25 + (((tickAnim - 140) / 65) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 8.25 + (((tickAnim - 205) / 53) * (0-(8.25)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0.4-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0.4 + (((tickAnim - 90) / 50) * (0.4-(0.4)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0.4 + (((tickAnim - 140) / 65) * (0.4-(0.4)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0.4 + (((tickAnim - 205) / 53) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 9.25 + (((tickAnim - 90) / 50) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 9.25 + (((tickAnim - 140) / 65) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 9.25 + (((tickAnim - 205) / 53) * (0-(9.25)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (1.35-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 1.35 + (((tickAnim - 90) / 50) * (1.35-(1.35)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 1.35 + (((tickAnim - 140) / 65) * (1.35-(1.35)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 1.35 + (((tickAnim - 205) / 53) * (0-(1.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 0) / 108) * (36.51-(0)));
            yy = 0 + (((tickAnim - 0) / 108) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 108) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 120) {
            xx = 36.51 + (((tickAnim - 108) / 12) * (36.825-(36.51)));
            yy = 0 + (((tickAnim - 108) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 12) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 36.825 + (((tickAnim - 120) / 20) * (36.325-(36.825)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 208) {
            xx = 36.325 + (((tickAnim - 140) / 68) * (21.27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(36.325)));
            yy = 0 + (((tickAnim - 140) / 68) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 140) / 68) * (0.0017-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 258) {
            xx = 21.27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 208) / 50) * (0-(21.27+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = -0.75 + (((tickAnim - 208) / 50) * (0-(-0.75)));
            zz = 0.0017 + (((tickAnim - 208) / 50) * (0-(0.0017)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (2.275-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (1.375-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 2.275 + (((tickAnim - 90) / 50) * (2.275-(2.275)));
            zz = 1.375 + (((tickAnim - 90) / 50) * (1.375-(1.375)));
        }
        else if (tickAnim >= 140 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 140) / 68) * (0-(0)));
            yy = 2.275 + (((tickAnim - 140) / 68) * (2.455-(2.275)));
            zz = 1.375 + (((tickAnim - 140) / 68) * (0.62-(1.375)));
        }
        else if (tickAnim >= 208 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 208) / 50) * (0-(0)));
            yy = 2.455 + (((tickAnim - 208) / 50) * (0-(2.455)));
            zz = 0.62 + (((tickAnim - 208) / 50) * (0-(0.62)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 0) / 95) * (22-(0)));
            yy = 0 + (((tickAnim - 0) / 95) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 95) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 22 + (((tickAnim - 95) / 45) * (22.5-(22)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 208) {
            xx = 22.5 + (((tickAnim - 140) / 68) * (5.39-(22.5)));
            yy = 0 + (((tickAnim - 140) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 68) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 258) {
            xx = 5.39 + (((tickAnim - 208) / 50) * (0-(5.39)));
            yy = 0 + (((tickAnim - 208) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 90) / 168) * (0-(0)));
            yy = 0.225 + (((tickAnim - 90) / 168) * (0-(0.225)));
            zz = 0 + (((tickAnim - 90) / 168) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 0) / 103) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 103) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 103) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 140) {
            xx = 24.75 + (((tickAnim - 103) / 37) * (24.75-(24.75)));
            yy = 0 + (((tickAnim - 103) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 37) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 178) {
            xx = 24.75 + (((tickAnim - 140) / 38) * (17.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*3-(24.75)));
            yy = 0 + (((tickAnim - 140) / 38) * (-1.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7-(0)));
            zz = 0 + (((tickAnim - 140) / 38) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 208) {
            xx = 17.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*3 + (((tickAnim - 178) / 30) * (8.25935-(17.23+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135))*3)));
            yy = -1.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7 + (((tickAnim - 178) / 30) * (-5.12719-(-1.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-7)));
            zz = 0 + (((tickAnim - 178) / 30) * (-0.73986-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 258) {
            xx = 8.25935 + (((tickAnim - 208) / 50) * (0-(8.25935)));
            yy = -5.12719 + (((tickAnim - 208) / 50) * (0-(-5.12719)));
            zz = -0.73986 + (((tickAnim - 208) / 50) * (0-(-0.73986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 90) / 168) * (0-(0)));
            yy = 0.425 + (((tickAnim - 90) / 168) * (0-(0.425)));
            zz = 0 + (((tickAnim - 90) / 168) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -5 + (((tickAnim - 90) / 50) * (-5-(-5)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 181) {
            xx = -5 + (((tickAnim - 140) / 41) * (-2.7711+Math.sin((Math.PI/180)*(((double)tickAnim/20)_time*150-50))*2-(-5)));
            yy = 0 + (((tickAnim - 140) / 41) * (-3.127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(0)));
            zz = 0 + (((tickAnim - 140) / 41) * (0.1868-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 235) {
            xx = -2.7711+Math.sin((Math.PI/180)*(((double)tickAnim/20)_time*150-50))*2 + (((tickAnim - 181) / 54) * (0-(-2.7711+Math.sin((Math.PI/180)*(((double)tickAnim/20)_time*150-50))*2)));
            yy = -3.127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 181) / 54) * (0-(-3.127+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            zz = 0.1868 + (((tickAnim - 181) / 54) * (0-(0.1868)));
        }
        else if (tickAnim >= 235 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 235) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -32.25 + (((tickAnim - 90) / 50) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 180) {
            xx = -32.25 + (((tickAnim - 140) / 40) * (-38.34357-(-32.25)));
            yy = 0 + (((tickAnim - 140) / 40) * (-0.4665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            zz = 0 + (((tickAnim - 140) / 40) * (-0.49242-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 206) {
            xx = -38.34357 + (((tickAnim - 180) / 26) * (-19.99053-(-38.34357)));
            yy = -0.4665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 180) / 26) * (-3.69481-(-0.4665+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -0.49242 + (((tickAnim - 180) / 26) * (-1.53351-(-0.49242)));
        }
        else if (tickAnim >= 206 && tickAnim < 235) {
            xx = -19.99053 + (((tickAnim - 206) / 29) * (-9.50207-(-19.99053)));
            yy = -3.69481 + (((tickAnim - 206) / 29) * (-2.8169-(-3.69481)));
            zz = -1.53351 + (((tickAnim - 206) / 29) * (-1.16914-(-1.53351)));
        }
        else if (tickAnim >= 235 && tickAnim < 258) {
            xx = -9.50207 + (((tickAnim - 235) / 23) * (0-(-9.50207)));
            yy = -2.8169 + (((tickAnim - 235) / 23) * (0-(-2.8169)));
            zz = -1.16914 + (((tickAnim - 235) / 23) * (0-(-1.16914)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 0) / 106) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 106) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 106) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 114) {
            xx = 2 + (((tickAnim - 106) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 106) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 8) * (0-(0)));
        }
        else if (tickAnim >= 114 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 114) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 114) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 114) / 10) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 132) {
            xx = 2 + (((tickAnim - 124) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 124) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 8) * (0-(0)));
        }
        else if (tickAnim >= 132 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 132) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 132) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 132) / 8) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 172) {
            xx = 2 + (((tickAnim - 140) / 32) * (0-(2)));
            yy = 0 + (((tickAnim - 140) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 32) * (0-(0)));
        }
        else if (tickAnim >= 172 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 172) / 17) * (2.25-(0)));
            yy = 0 + (((tickAnim - 172) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 172) / 17) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 209) {
            xx = 2.25 + (((tickAnim - 189) / 20) * (0-(2.25)));
            yy = 0 + (((tickAnim - 189) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 90) {
            xx = -26.75 + (((tickAnim - 66) / 24) * (-11.41278-(-26.75)));
            yy = 0 + (((tickAnim - 66) / 24) * (2.55719-(0)));
            zz = 0 + (((tickAnim - 66) / 24) * (13.2393-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -11.41278 + (((tickAnim - 90) / 50) * (-11.41278-(-11.41278)));
            yy = 2.55719 + (((tickAnim - 90) / 50) * (2.55719-(2.55719)));
            zz = 13.2393 + (((tickAnim - 90) / 50) * (13.2393-(13.2393)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -11.41278 + (((tickAnim - 140) / 65) * (-11.41278-(-11.41278)));
            yy = 2.55719 + (((tickAnim - 140) / 65) * (2.55719-(2.55719)));
            zz = 13.2393 + (((tickAnim - 140) / 65) * (13.2393-(13.2393)));
        }
        else if (tickAnim >= 205 && tickAnim < 242) {
            xx = -11.41278 + (((tickAnim - 205) / 37) * (6.68493-(-11.41278)));
            yy = 2.55719 + (((tickAnim - 205) / 37) * (-0.77699-(2.55719)));
            zz = 13.2393 + (((tickAnim - 205) / 37) * (11.47003-(13.2393)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 6.68493 + (((tickAnim - 242) / 16) * (0-(6.68493)));
            yy = -0.77699 + (((tickAnim - 242) / 16) * (0-(-0.77699)));
            zz = 11.47003 + (((tickAnim - 242) / 16) * (0-(11.47003)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (3.325-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 66) / 24) * (0-(0)));
            yy = 3.325 + (((tickAnim - 66) / 24) * (0-(3.325)));
            zz = 0 + (((tickAnim - 66) / 24) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 90) / 152) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 152) * (-0.9-(0)));
            zz = 0 + (((tickAnim - 90) / 152) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            yy = -0.9 + (((tickAnim - 242) / 16) * (0-(-0.9)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 78) {
            xx = 3.75 + (((tickAnim - 66) / 12) * (-30.66006-(3.75)));
            yy = 0 + (((tickAnim - 66) / 12) * (-4.50319-(0)));
            zz = 0 + (((tickAnim - 66) / 12) * (-5.13084-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -30.66006 + (((tickAnim - 78) / 12) * (-47.84942-(-30.66006)));
            yy = -4.50319 + (((tickAnim - 78) / 12) * (-9.32804-(-4.50319)));
            zz = -5.13084 + (((tickAnim - 78) / 12) * (-10.62816-(-5.13084)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -47.84942 + (((tickAnim - 90) / 50) * (-47.84942-(-47.84942)));
            yy = -9.32804 + (((tickAnim - 90) / 50) * (-9.32804-(-9.32804)));
            zz = -10.62816 + (((tickAnim - 90) / 50) * (-10.62816-(-10.62816)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -47.84942 + (((tickAnim - 140) / 65) * (-47.84942-(-47.84942)));
            yy = -9.32804 + (((tickAnim - 140) / 65) * (-9.32804-(-9.32804)));
            zz = -10.62816 + (((tickAnim - 140) / 65) * (-10.62816-(-10.62816)));
        }
        else if (tickAnim >= 205 && tickAnim < 242) {
            xx = -47.84942 + (((tickAnim - 205) / 37) * (-21.23308-(-47.84942)));
            yy = -9.32804 + (((tickAnim - 205) / 37) * (-6.10326-(-9.32804)));
            zz = -10.62816 + (((tickAnim - 205) / 37) * (-9.29016-(-10.62816)));
        }
        else if (tickAnim >= 242 && tickAnim < 250) {
            xx = -21.23308 + (((tickAnim - 242) / 8) * (-33.30367-(-21.23308)));
            yy = -6.10326 + (((tickAnim - 242) / 8) * (-1.20904-(-6.10326)));
            zz = -9.29016 + (((tickAnim - 242) / 8) * (-6.33596-(-9.29016)));
        }
        else if (tickAnim >= 250 && tickAnim < 258) {
            xx = -33.30367 + (((tickAnim - 250) / 8) * (0-(-33.30367)));
            yy = -1.20904 + (((tickAnim - 250) / 8) * (0-(-1.20904)));
            zz = -6.33596 + (((tickAnim - 250) / 8) * (0-(-6.33596)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (4.175-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 66) / 12) * (-0.28-(0)));
            yy = 4.175 + (((tickAnim - 66) / 12) * (3.71-(4.175)));
            zz = 0 + (((tickAnim - 66) / 12) * (-0.245-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = -0.28 + (((tickAnim - 78) / 12) * (-0.575-(-0.28)));
            yy = 3.71 + (((tickAnim - 78) / 12) * (0.625-(3.71)));
            zz = -0.245 + (((tickAnim - 78) / 12) * (-2.225-(-0.245)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -0.575 + (((tickAnim - 90) / 50) * (-0.575-(-0.575)));
            yy = 0.625 + (((tickAnim - 90) / 50) * (0.625-(0.625)));
            zz = -2.225 + (((tickAnim - 90) / 50) * (-2.225-(-2.225)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -0.575 + (((tickAnim - 140) / 65) * (-0.575-(-0.575)));
            yy = 0.625 + (((tickAnim - 140) / 65) * (0.625-(0.625)));
            zz = -2.225 + (((tickAnim - 140) / 65) * (-2.225-(-2.225)));
        }
        else if (tickAnim >= 205 && tickAnim < 242) {
            xx = -0.575 + (((tickAnim - 205) / 37) * (-0.905-(-0.575)));
            yy = 0.625 + (((tickAnim - 205) / 37) * (0.82-(0.625)));
            zz = -2.225 + (((tickAnim - 205) / 37) * (-0.4-(-2.225)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = -0.905 + (((tickAnim - 242) / 16) * (0-(-0.905)));
            yy = 0.82 + (((tickAnim - 242) / 16) * (0-(0.82)));
            zz = -0.4 + (((tickAnim - 242) / 16) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 78) {
            xx = 6 + (((tickAnim - 66) / 12) * (55.12-(6)));
            yy = 0 + (((tickAnim - 66) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 12) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 55.12 + (((tickAnim - 78) / 12) * (35.25-(55.12)));
            yy = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 35.25 + (((tickAnim - 90) / 50) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 35.25 + (((tickAnim - 140) / 65) * (35.25-(35.25)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 242) {
            xx = 35.25 + (((tickAnim - 205) / 37) * (7.52-(35.25)));
            yy = 0 + (((tickAnim - 205) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 37) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 250) {
            xx = 7.52 + (((tickAnim - 242) / 8) * (43.76-(7.52)));
            yy = 0 + (((tickAnim - 242) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 8) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 258) {
            xx = 43.76 + (((tickAnim - 250) / 8) * (0-(43.76)));
            yy = 0 + (((tickAnim - 250) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 250) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 66) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 66) / 12) * (3.795-(0)));
            zz = 0 + (((tickAnim - 66) / 12) * (-1.585-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            yy = 3.795 + (((tickAnim - 78) / 12) * (2.725-(3.795)));
            zz = -1.585 + (((tickAnim - 78) / 12) * (-0.75-(-1.585)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 2.725 + (((tickAnim - 90) / 50) * (2.725-(2.725)));
            zz = -0.75 + (((tickAnim - 90) / 50) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 2.725 + (((tickAnim - 140) / 65) * (2.725-(2.725)));
            zz = -0.75 + (((tickAnim - 140) / 65) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 205 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 205) / 18) * (0-(0)));
            yy = 2.725 + (((tickAnim - 205) / 18) * (2.6-(2.725)));
            zz = -0.75 + (((tickAnim - 205) / 18) * (-0.48-(-0.75)));
        }
        else if (tickAnim >= 223 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 223) / 19) * (0-(0)));
            yy = 2.6 + (((tickAnim - 223) / 19) * (0.625-(2.6)));
            zz = -0.48 + (((tickAnim - 223) / 19) * (-0.23-(-0.48)));
        }
        else if (tickAnim >= 242 && tickAnim < 250) {
            xx = 0 + (((tickAnim - 242) / 8) * (0-(0)));
            yy = 0.625 + (((tickAnim - 242) / 8) * (2.585-(0.625)));
            zz = -0.23 + (((tickAnim - 242) / 8) * (-0.435-(-0.23)));
        }
        else if (tickAnim >= 250 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 250) / 8) * (0-(0)));
            yy = 2.585 + (((tickAnim - 250) / 8) * (0-(2.585)));
            zz = -0.435 + (((tickAnim - 250) / 8) * (0-(-0.435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = -15.25 + (((tickAnim - 36) / 18) * (-6.39043-(-15.25)));
            yy = 0 + (((tickAnim - 36) / 18) * (1.28953-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (-7.23149-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 90) {
            xx = -6.39043 + (((tickAnim - 54) / 36) * (-10.66278-(-6.39043)));
            yy = 1.28953 + (((tickAnim - 54) / 36) * (2.55719-(1.28953)));
            zz = -7.23149 + (((tickAnim - 54) / 36) * (-13.2393-(-7.23149)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -10.66278 + (((tickAnim - 90) / 50) * (-10.66278-(-10.66278)));
            yy = 2.55719 + (((tickAnim - 90) / 50) * (2.55719-(2.55719)));
            zz = -13.2393 + (((tickAnim - 90) / 50) * (-13.2393-(-13.2393)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -10.66278 + (((tickAnim - 140) / 65) * (-10.66278-(-10.66278)));
            yy = 2.55719 + (((tickAnim - 140) / 65) * (2.55719-(2.55719)));
            zz = -13.2393 + (((tickAnim - 140) / 65) * (-13.2393-(-13.2393)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = -10.66278 + (((tickAnim - 205) / 20) * (3.06922-(-10.66278)));
            yy = 2.55719 + (((tickAnim - 205) / 20) * (2.04363-(2.55719)));
            zz = -13.2393 + (((tickAnim - 205) / 20) * (-11.06966-(-13.2393)));
        }
        else if (tickAnim >= 225 && tickAnim < 242) {
            xx = 3.06922 + (((tickAnim - 225) / 17) * (-11-(3.06922)));
            yy = 2.04363 + (((tickAnim - 225) / 17) * (0-(2.04363)));
            zz = -11.06966 + (((tickAnim - 225) / 17) * (0-(-11.06966)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = -11 + (((tickAnim - 242) / 16) * (0-(-11)));
            yy = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 36) / 206) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 206) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 206) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 36) / 18) * (-31.60816-(0)));
            yy = 0 + (((tickAnim - 36) / 18) * (-0.55238-(0)));
            zz = 0 + (((tickAnim - 36) / 18) * (3.37836-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 90) {
            xx = -31.60816 + (((tickAnim - 54) / 36) * (-50.97462-(-31.60816)));
            yy = -0.55238 + (((tickAnim - 54) / 36) * (-0.20838-(-0.55238)));
            zz = 3.37836 + (((tickAnim - 54) / 36) * (10.90766-(3.37836)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -50.97462 + (((tickAnim - 90) / 50) * (-50.97462-(-50.97462)));
            yy = -0.20838 + (((tickAnim - 90) / 50) * (-0.20838-(-0.20838)));
            zz = 10.90766 + (((tickAnim - 90) / 50) * (10.90766-(10.90766)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -50.97462 + (((tickAnim - 140) / 65) * (-50.97462-(-50.97462)));
            yy = -0.20838 + (((tickAnim - 140) / 65) * (-0.20838-(-0.20838)));
            zz = 10.90766 + (((tickAnim - 140) / 65) * (10.90766-(10.90766)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = -50.97462 + (((tickAnim - 205) / 20) * (-35.02768-(-50.97462)));
            yy = -0.20838 + (((tickAnim - 205) / 20) * (-2.21334-(-0.20838)));
            zz = 10.90766 + (((tickAnim - 205) / 20) * (4.12412-(10.90766)));
        }
        else if (tickAnim >= 225 && tickAnim < 233) {
            xx = -35.02768 + (((tickAnim - 225) / 8) * (-33.32675-(-35.02768)));
            yy = -2.21334 + (((tickAnim - 225) / 8) * (5.09401-(-2.21334)));
            zz = 4.12412 + (((tickAnim - 225) / 8) * (-2.38916-(4.12412)));
        }
        else if (tickAnim >= 233 && tickAnim < 242) {
            xx = -33.32675 + (((tickAnim - 233) / 9) * (0.75-(-33.32675)));
            yy = 5.09401 + (((tickAnim - 233) / 9) * (0-(5.09401)));
            zz = -2.38916 + (((tickAnim - 233) / 9) * (0-(-2.38916)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 0.75 + (((tickAnim - 242) / 16) * (0-(0.75)));
            yy = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (-0.21-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (2.63-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (-0.17-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = -0.21 + (((tickAnim - 36) / 9) * (-0.25-(-0.21)));
            yy = 2.63 + (((tickAnim - 36) / 9) * (4.69-(2.63)));
            zz = -0.17 + (((tickAnim - 36) / 9) * (-0.25-(-0.17)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = -0.25 + (((tickAnim - 45) / 9) * (-0.28-(-0.25)));
            yy = 4.69 + (((tickAnim - 45) / 9) * (1.15-(4.69)));
            zz = -0.25 + (((tickAnim - 45) / 9) * (-0.325-(-0.25)));
        }
        else if (tickAnim >= 54 && tickAnim < 90) {
            xx = -0.28 + (((tickAnim - 54) / 36) * (-0.575-(-0.28)));
            yy = 1.15 + (((tickAnim - 54) / 36) * (0.175-(1.15)));
            zz = -0.325 + (((tickAnim - 54) / 36) * (-2.075-(-0.325)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -0.575 + (((tickAnim - 90) / 50) * (-0.575-(-0.575)));
            yy = 0.175 + (((tickAnim - 90) / 50) * (0.175-(0.175)));
            zz = -2.075 + (((tickAnim - 90) / 50) * (-2.075-(-2.075)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -0.575 + (((tickAnim - 140) / 65) * (-0.575-(-0.575)));
            yy = 0.175 + (((tickAnim - 140) / 65) * (0.175-(0.175)));
            zz = -2.075 + (((tickAnim - 140) / 65) * (-2.075-(-2.075)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = -0.575 + (((tickAnim - 205) / 20) * (-0.575-(-0.575)));
            yy = 0.175 + (((tickAnim - 205) / 20) * (0.85-(0.175)));
            zz = -2.075 + (((tickAnim - 205) / 20) * (-2.075-(-2.075)));
        }
        else if (tickAnim >= 225 && tickAnim < 233) {
            xx = -0.575 + (((tickAnim - 225) / 8) * (-0.25-(-0.575)));
            yy = 0.85 + (((tickAnim - 225) / 8) * (1.155-(0.85)));
            zz = -2.075 + (((tickAnim - 225) / 8) * (-0.56-(-2.075)));
        }
        else if (tickAnim >= 233 && tickAnim < 242) {
            xx = -0.25 + (((tickAnim - 233) / 9) * (0-(-0.25)));
            yy = 1.155 + (((tickAnim - 233) / 9) * (3.35-(1.155)));
            zz = -0.56 + (((tickAnim - 233) / 9) * (0-(-0.56)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            yy = 3.35 + (((tickAnim - 242) / 16) * (0-(3.35)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 6.25 + (((tickAnim - 36) / 9) * (35.36667-(6.25)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0.47161-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 35.36667 + (((tickAnim - 45) / 9) * (24.20141-(35.36667)));
            yy = 0 + (((tickAnim - 45) / 9) * (-1.37002-(0)));
            zz = 0.47161 + (((tickAnim - 45) / 9) * (3.61237-(0.47161)));
        }
        else if (tickAnim >= 54 && tickAnim < 90) {
            xx = 24.20141 + (((tickAnim - 54) / 36) * (37.25-(24.20141)));
            yy = -1.37002 + (((tickAnim - 54) / 36) * (0-(-1.37002)));
            zz = 3.61237 + (((tickAnim - 54) / 36) * (3.53705-(3.61237)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 37.25 + (((tickAnim - 90) / 50) * (37.25-(37.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 3.53705 + (((tickAnim - 90) / 50) * (3.53705-(3.53705)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 37.25 + (((tickAnim - 140) / 65) * (37.25-(37.25)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 3.53705 + (((tickAnim - 140) / 65) * (3.53705-(3.53705)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = 37.25 + (((tickAnim - 205) / 20) * (16.78346-(37.25)));
            yy = 0 + (((tickAnim - 205) / 20) * (-2.1162-(0)));
            zz = 3.53705 + (((tickAnim - 205) / 20) * (6.63124-(3.53705)));
        }
        else if (tickAnim >= 225 && tickAnim < 233) {
            xx = 16.78346 + (((tickAnim - 225) / 8) * (53.1869-(16.78346)));
            yy = -2.1162 + (((tickAnim - 225) / 8) * (-1.00241-(-2.1162)));
            zz = 6.63124 + (((tickAnim - 225) / 8) * (3.14112-(6.63124)));
        }
        else if (tickAnim >= 233 && tickAnim < 242) {
            xx = 53.1869 + (((tickAnim - 233) / 9) * (4.5-(53.1869)));
            yy = -1.00241 + (((tickAnim - 233) / 9) * (0-(-1.00241)));
            zz = 3.14112 + (((tickAnim - 233) / 9) * (0-(3.14112)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 4.5 + (((tickAnim - 242) / 16) * (0-(4.5)));
            yy = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (2.025-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            yy = 2.025 + (((tickAnim - 36) / 9) * (2.475-(2.025)));
            zz = 0 + (((tickAnim - 36) / 9) * (-0.64-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 2.475 + (((tickAnim - 45) / 9) * (1.48-(2.475)));
            zz = -0.64 + (((tickAnim - 45) / 9) * (0.03-(-0.64)));
        }
        else if (tickAnim >= 54 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 54) / 36) * (0-(0)));
            yy = 1.48 + (((tickAnim - 54) / 36) * (2.75-(1.48)));
            zz = 0.03 + (((tickAnim - 54) / 36) * (-0.9-(0.03)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 2.75 + (((tickAnim - 90) / 50) * (2.75-(2.75)));
            zz = -0.9 + (((tickAnim - 90) / 50) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 2.75 + (((tickAnim - 140) / 65) * (2.75-(2.75)));
            zz = -0.9 + (((tickAnim - 140) / 65) * (-0.9-(-0.9)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 205) / 20) * (0-(0)));
            yy = 2.75 + (((tickAnim - 205) / 20) * (1.35-(2.75)));
            zz = -0.9 + (((tickAnim - 205) / 20) * (-0.325-(-0.9)));
        }
        else if (tickAnim >= 225 && tickAnim < 233) {
            xx = 0 + (((tickAnim - 225) / 8) * (0-(0)));
            yy = 1.35 + (((tickAnim - 225) / 8) * (3.62-(1.35)));
            zz = -0.325 + (((tickAnim - 225) / 8) * (-1.2-(-0.325)));
        }
        else if (tickAnim >= 233 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 233) / 9) * (0-(0)));
            yy = 3.62 + (((tickAnim - 233) / 9) * (0-(3.62)));
            zz = -1.2 + (((tickAnim - 233) / 9) * (0-(-1.2)));
        }
        else if (tickAnim >= 242 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 205) {
            xx = -5.5 + (((tickAnim - 90) / 115) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 90) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 115) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = -5.5 + (((tickAnim - 205) / 53) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (-0.625-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 90) / 115) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 115) * (0-(0)));
            zz = -0.625 + (((tickAnim - 90) / 115) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = -0.625 + (((tickAnim - 205) / 53) * (0-(-0.625)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 205) {
            xx = -3.25 + (((tickAnim - 90) / 115) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 90) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 115) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = -3.25 + (((tickAnim - 205) / 53) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 0) / 90) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 90) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 205) {
            xx = -5.25 + (((tickAnim - 90) / 115) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 90) / 115) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 115) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = -5.25 + (((tickAnim - 205) / 53) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 80) {
            xx = -3.25 + (((tickAnim - 50) / 30) * (-4.25-(-3.25)));
            yy = 0 + (((tickAnim - 50) / 30) * (11-(0)));
            zz = 0 + (((tickAnim - 50) / 30) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -4.25 + (((tickAnim - 80) / 10) * (-5.25-(-4.25)));
            yy = 11 + (((tickAnim - 80) / 10) * (11-(11)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -5.25 + (((tickAnim - 90) / 50) * (-5.25-(-5.25)));
            yy = 11 + (((tickAnim - 90) / 50) * (11-(11)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -5.25 + (((tickAnim - 140) / 65) * (-5.25-(-5.25)));
            yy = 11 + (((tickAnim - 140) / 65) * (11-(11)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = -5.25 + (((tickAnim - 205) / 53) * (0-(-5.25)));
            yy = 11 + (((tickAnim - 205) / 53) * (0-(11)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 50) / 208) * (0-(0)));
            yy = 0.125 + (((tickAnim - 50) / 208) * (0-(0.125)));
            zz = 0 + (((tickAnim - 50) / 208) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 50) / 16) * (10.8-(0)));
            yy = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 10.8 + (((tickAnim - 66) / 14) * (-2.75-(10.8)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = -2.75 + (((tickAnim - 80) / 10) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -2.75 + (((tickAnim - 90) / 50) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -2.75 + (((tickAnim - 140) / 65) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = -2.75 + (((tickAnim - 205) / 53) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 16) * (3.305-(0)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 3.305 + (((tickAnim - 66) / 14) * (0.525-(3.305)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = 0.525 + (((tickAnim - 80) / 10) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 0.525 + (((tickAnim - 90) / 50) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0.525 + (((tickAnim - 140) / 65) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            yy = 0.525 + (((tickAnim - 205) / 53) * (0-(0.525)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 50) / 16) * (24.42-(0)));
            yy = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 24.42 + (((tickAnim - 66) / 14) * (1.75-(24.42)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 1.75 + (((tickAnim - 80) / 60) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 1.75 + (((tickAnim - 140) / 65) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 1.75 + (((tickAnim - 205) / 53) * (0-(1.75)));
            yy = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 0) / 66) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 66) * (0.64-(0)));
            zz = 0 + (((tickAnim - 0) / 66) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            yy = 0.64 + (((tickAnim - 66) / 14) * (-0.25-(0.64)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 80) / 60) * (0-(0)));
            yy = -0.25 + (((tickAnim - 80) / 60) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 80) / 60) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = -0.25 + (((tickAnim - 140) / 65) * (-0.25-(-0.25)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 205) / 53) * (0-(0)));
            yy = -0.25 + (((tickAnim - 205) / 53) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 205) / 53) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (9.63-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 9.63 + (((tickAnim - 16) / 17) * (14-(9.63)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 90) {
            xx = 14 + (((tickAnim - 33) / 57) * (12-(14)));
            yy = 0 + (((tickAnim - 33) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 57) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 12 + (((tickAnim - 90) / 50) * (12-(12)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 12 + (((tickAnim - 140) / 65) * (12-(12)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = 12 + (((tickAnim - 205) / 20) * (-5.25-(12)));
            yy = 0 + (((tickAnim - 205) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 20) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 258) {
            xx = -5.25 + (((tickAnim - 225) / 33) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 33) / 57) * (0-(0)));
            yy = -0.075 + (((tickAnim - 33) / 57) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 33) / 57) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = -0.075 + (((tickAnim - 90) / 50) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = -0.075 + (((tickAnim - 140) / 65) * (-0.075-(-0.075)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 205) / 20) * (0-(0)));
            yy = -0.075 + (((tickAnim - 205) / 20) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 205) / 20) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (12.115-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 12.115 + (((tickAnim - 16) / 17) * (-0.05-(12.115)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 90) {
            xx = -0.05 + (((tickAnim - 33) / 57) * (-5-(-0.05)));
            yy = 0 + (((tickAnim - 33) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 57) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -5 + (((tickAnim - 90) / 50) * (-5-(-5)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -5 + (((tickAnim - 140) / 65) * (-5-(-5)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 213) {
            xx = -5 + (((tickAnim - 205) / 8) * (9.96-(-5)));
            yy = 0 + (((tickAnim - 205) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 8) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 9.96 + (((tickAnim - 213) / 6) * (-6.8-(9.96)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 225) {
            xx = -6.8 + (((tickAnim - 219) / 6) * (0-(-6.8)));
            yy = 0 + (((tickAnim - 219) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 6) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.5 + (((tickAnim - 16) / 17) * (-0.175-(2.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*0.5)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 33) / 57) * (0-(0)));
            yy = -0.175 + (((tickAnim - 33) / 57) * (0.125-(-0.175)));
            zz = 0 + (((tickAnim - 33) / 57) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 0.125 + (((tickAnim - 90) / 50) * (0.125-(0.125)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0.125 + (((tickAnim - 140) / 65) * (0.125-(0.125)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 205) / 8) * (0-(0)));
            yy = 0.125 + (((tickAnim - 205) / 8) * (2.575-(0.125)));
            zz = 0 + (((tickAnim - 205) / 8) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            yy = 2.575 + (((tickAnim - 213) / 6) * (3.73-(2.575)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 219) / 6) * (0-(0)));
            yy = 3.73 + (((tickAnim - 219) / 6) * (0.525-(3.73)));
            zz = 0 + (((tickAnim - 219) / 6) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            yy = 0.525 + (((tickAnim - 225) / 33) * (0-(0.525)));
            zz = 0 + (((tickAnim - 225) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (20.88-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 20.88 + (((tickAnim - 16) / 17) * (-16-(20.88)));
            yy = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 90) {
            xx = -16 + (((tickAnim - 33) / 57) * (-13.25-(-16)));
            yy = 0 + (((tickAnim - 33) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 57) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = -13.25 + (((tickAnim - 90) / 50) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = -13.25 + (((tickAnim - 140) / 65) * (-13.25-(-13.25)));
            yy = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 213) {
            xx = -13.25 + (((tickAnim - 205) / 8) * (20.56-(-13.25)));
            yy = 0 + (((tickAnim - 205) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 8) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 219) {
            xx = 20.56 + (((tickAnim - 213) / 6) * (-9.91-(20.56)));
            yy = 0 + (((tickAnim - 213) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 6) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 225) {
            xx = -9.91 + (((tickAnim - 219) / 6) * (1.75-(-9.91)));
            yy = 0 + (((tickAnim - 219) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 6) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 258) {
            xx = 1.75 + (((tickAnim - 225) / 33) * (0-(1.75)));
            yy = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (2.03-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 2.03 + (((tickAnim - 16) / 17) * (0.3-(2.03)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 33) / 57) * (0-(0)));
            yy = 0.3 + (((tickAnim - 33) / 57) * (0.675-(0.3)));
            zz = 0 + (((tickAnim - 33) / 57) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 90) / 50) * (0-(0)));
            yy = 0.675 + (((tickAnim - 90) / 50) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 90) / 50) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 205) {
            xx = 0 + (((tickAnim - 140) / 65) * (0-(0)));
            yy = 0.675 + (((tickAnim - 140) / 65) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 140) / 65) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 205) / 20) * (0-(0)));
            yy = 0.675 + (((tickAnim - 205) / 20) * (-0.225-(0.675)));
            zz = 0 + (((tickAnim - 205) / 20) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 258) {
            xx = 0 + (((tickAnim - 225) / 33) * (0-(0)));
            yy = -0.225 + (((tickAnim - 225) / 33) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 225) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 140) / 31) * (-3.42751-(0)));
            yy = 0 + (((tickAnim - 140) / 31) * (3.19509-(0)));
            zz = 0 + (((tickAnim - 140) / 31) * (2.27231-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 205) {
            xx = -3.42751 + (((tickAnim - 171) / 34) * (-7.20574-(-3.42751)));
            yy = 3.19509 + (((tickAnim - 171) / 34) * (-8.19273-(3.19509)));
            zz = 2.27231 + (((tickAnim - 171) / 34) * (1.51107-(2.27231)));
        }
        else if (tickAnim >= 205 && tickAnim < 227) {
            xx = -7.20574 + (((tickAnim - 205) / 22) * (3-(-7.20574)));
            yy = -8.19273 + (((tickAnim - 205) / 22) * (0-(-8.19273)));
            zz = 1.51107 + (((tickAnim - 205) / 22) * (0-(1.51107)));
        }
        else if (tickAnim >= 227 && tickAnim < 258) {
            xx = 3 + (((tickAnim - 227) / 31) * (0-(3)));
            yy = 0 + (((tickAnim - 227) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 227) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(xx), headbase.rotateAngleY + (float) Math.toRadians(yy), headbase.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 210;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 73) {
            xx = 4 + (((tickAnim - 40) / 33) * (-31.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*2-(4)));
            yy = 0 + (((tickAnim - 40) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 33) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -31.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*2 + (((tickAnim - 73) / 7) * (-34.5-(-31.895+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*2)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -34.5 + (((tickAnim - 80) / 20) * (-34.99974-(-34.5)));
            yy = 0 + (((tickAnim - 80) / 20) * (-0.15267-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-0.19797-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = -34.99974 + (((tickAnim - 100) / 34) * (-34.99974-(-34.99974)));
            yy = -0.15267 + (((tickAnim - 100) / 34) * (-0.15267-(-0.15267)));
            zz = -0.19797 + (((tickAnim - 100) / 34) * (-0.19797-(-0.19797)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = -34.99974 + (((tickAnim - 134) / 22) * (2.5-(-34.99974)));
            yy = -0.15267 + (((tickAnim - 134) / 22) * (0-(-0.15267)));
            zz = -0.19797 + (((tickAnim - 134) / 22) * (0-(-0.19797)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 2.5 + (((tickAnim - 156) / 15) * (12-(2.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 12 + (((tickAnim - 171) / 2) * (12.75-(12)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 211) {
            xx = 12.75 + (((tickAnim - 173) / 38) * (0-(12.75)));
            yy = 0 + (((tickAnim - 173) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(xx), mainbody.rotateAngleY + (float) Math.toRadians(yy), mainbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-3.275-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -3.275 + (((tickAnim - 40) / 40) * (5.725-(-3.275)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 5.725 + (((tickAnim - 80) / 54) * (5.725-(5.725)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 5.725 + (((tickAnim - 134) / 22) * (-14.175-(5.725)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = -14.175 + (((tickAnim - 156) / 15) * (-18.345-(-14.175)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = -18.345 + (((tickAnim - 171) / 2) * (-18.795-(-18.345)));
        }
        else if (tickAnim >= 173 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 173) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 173) / 38) * (0-(0)));
            zz = -18.795 + (((tickAnim - 173) / 38) * (0-(-18.795)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.mainbody.rotationPointX = this.mainbody.rotationPointX + (float)(xx);
        this.mainbody.rotationPointY = this.mainbody.rotationPointY - (float)(yy);
        this.mainbody.rotationPointZ = this.mainbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 40) / 40) * (-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320))*0.05-(5)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320))*0.05 + (((tickAnim - 80) / 20) * (-3.98906-(-4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*320))*0.05)));
            yy = 0 + (((tickAnim - 80) / 20) * (-0.07488-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (-0.23852-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = -3.98906 + (((tickAnim - 100) / 34) * (-3.98906-(-3.98906)));
            yy = -0.07488 + (((tickAnim - 100) / 34) * (-0.07488-(-0.07488)));
            zz = -0.23852 + (((tickAnim - 100) / 34) * (-0.23852-(-0.23852)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = -3.98906 + (((tickAnim - 134) / 22) * (-3.5-(-3.98906)));
            yy = -0.07488 + (((tickAnim - 134) / 22) * (0-(-0.07488)));
            zz = -0.23852 + (((tickAnim - 134) / 22) * (0-(-0.23852)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -3.5 + (((tickAnim - 156) / 15) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = -3.5 + (((tickAnim - 171) / 40) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.95-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0.95 + (((tickAnim - 80) / 54) * (0.95-(0.95)));
        }
        else if (tickAnim >= 134 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 134) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 21) * (0-(0)));
            zz = 0.95 + (((tickAnim - 134) / 21) * (0.95-(0.95)));
        }
        else if (tickAnim >= 155 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 155) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 7) * (0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35-50))*0.1-(0)));
            zz = 0.95 + (((tickAnim - 155) / 7) * (0.95-(0.95)));
        }
        else if (tickAnim >= 162 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 162) / 14) * (0-(0)));
            yy = 0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35-50))*0.1 + (((tickAnim - 162) / 14) * (0-(0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35-50))*0.1)));
            zz = 0.95 + (((tickAnim - 162) / 14) * (0.95-(0.95)));
        }
        else if (tickAnim >= 176 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 176) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 176) / 35) * (0-(0)));
            zz = 0.95 + (((tickAnim - 176) / 35) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (4.25-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 4.25 + (((tickAnim - 171) / 40) * (0-(4.25)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 156) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 6) * (0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35))*0.18-(0)));
            zz = 0 + (((tickAnim - 156) / 6) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 162) / 9) * (0-(0)));
            yy = 0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35))*0.18 + (((tickAnim - 162) / 9) * (0-(0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35))*0.18)));
            zz = 0 + (((tickAnim - 162) / 9) * (0.675-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0.675 + (((tickAnim - 171) / 40) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (3.6948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*155))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*185))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0.04298-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = 3.6948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*155))*2 + (((tickAnim - 21) / 19) * (8.4636+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(3.6948+Math.sin((Math.PI/180)*(((double)tickAnim/20)*155))*2)));
            yy = -0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*185))*2 + (((tickAnim - 21) / 19) * (-2.92078-(-0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*185))*2)));
            zz = 0.04298 + (((tickAnim - 21) / 19) * (1.42594-(0.04298)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 8.4636+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 40) / 36) * (16.1474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(8.4636+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = -2.92078 + (((tickAnim - 40) / 36) * (-6.31618-(-2.92078)));
            zz = 1.42594 + (((tickAnim - 40) / 36) * (-1.0786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3-(1.42594)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 16.1474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 76) / 58) * (20.61091-(16.1474+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = -6.31618 + (((tickAnim - 76) / 58) * (4.36458-(-6.31618)));
            zz = -1.0786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3 + (((tickAnim - 76) / 58) * (6.29193-(-1.0786+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-3)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 20.61091 + (((tickAnim - 134) / 22) * (10.5-(20.61091)));
            yy = 4.36458 + (((tickAnim - 134) / 22) * (0-(4.36458)));
            zz = 6.29193 + (((tickAnim - 134) / 22) * (0-(6.29193)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 10.5 + (((tickAnim - 156) / 15) * (7.5-(10.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 7.5 + (((tickAnim - 171) / 40) * (0-(7.5)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 0) / 156) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 156) * (1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 156) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 156) / 6) * (0-(0)));
            yy = 1.55 + (((tickAnim - 156) / 6) * (1.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35))*0.15-(1.55)));
            zz = 0 + (((tickAnim - 156) / 6) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 162) / 9) * (0-(0)));
            yy = 1.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35))*0.15 + (((tickAnim - 162) / 9) * (1.55-(1.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.35))*0.15)));
            zz = 0 + (((tickAnim - 162) / 9) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            yy = 1.55 + (((tickAnim - 171) / 40) * (0-(1.55)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (1.89743-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.9523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*155-20))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0.22369-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 78) {
            xx = 1.89743 + (((tickAnim - 21) / 57) * (6.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(1.89743)));
            yy = -0.9523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*155-20))*3 + (((tickAnim - 21) / 57) * (-0.0265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(-0.9523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*155-20))*3)));
            zz = 0.22369 + (((tickAnim - 21) / 57) * (-3.96476-(0.22369)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = 6.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 78) / 15) * (6.2649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))-(6.2856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = -0.0265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 78) / 15) * (-0.8007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1-(-0.0265+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
            zz = -3.96476 + (((tickAnim - 78) / 15) * (-5.6119+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(-3.96476)));
        }
        else if (tickAnim >= 93 && tickAnim < 134) {
            xx = 6.2649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)) + (((tickAnim - 93) / 41) * (7.82559-(6.2649+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120)))));
            yy = -0.8007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1 + (((tickAnim - 93) / 41) * (4.17646-(-0.8007+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*1)));
            zz = -5.6119+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 93) / 41) * (-2.09605-(-5.6119+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 7.82559 + (((tickAnim - 134) / 22) * (-3.5-(7.82559)));
            yy = 4.17646 + (((tickAnim - 134) / 22) * (0-(4.17646)));
            zz = -2.09605 + (((tickAnim - 134) / 22) * (0-(-2.09605)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -3.5 + (((tickAnim - 156) / 15) * (3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(-3.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 171) / 40) * (0-(3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (2.84079-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-40))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-2.3824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 39) {
            xx = 2.84079 + (((tickAnim - 21) / 18) * (5.40207-(2.84079)));
            yy = -2.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-40))*3 + (((tickAnim - 21) / 18) * (-0.52719-(-2.6523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-40))*3)));
            zz = -2.3824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 21) / 18) * (-0.73011-(-2.3824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = 5.40207 + (((tickAnim - 39) / 19) * (4.47983-(5.40207)));
            yy = -0.52719 + (((tickAnim - 39) / 19) * (0.02261-(-0.52719)));
            zz = -0.73011 + (((tickAnim - 39) / 19) * (-1.04493-(-0.73011)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = 4.47983 + (((tickAnim - 58) / 22) * (9.5021-(4.47983)));
            yy = 0.02261 + (((tickAnim - 58) / 22) * (-0.1615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-(0.02261)));
            zz = -1.04493 + (((tickAnim - 58) / 22) * (-1.49129-(-1.04493)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 9.5021 + (((tickAnim - 80) / 54) * (15.47521-(9.5021)));
            yy = -0.1615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)) + (((tickAnim - 80) / 54) * (-0.99183-(-0.1615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)))));
            zz = -1.49129 + (((tickAnim - 80) / 54) * (3.04448-(-1.49129)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 15.47521 + (((tickAnim - 134) / 22) * (8.75-(15.47521)));
            yy = -0.99183 + (((tickAnim - 134) / 22) * (0-(-0.99183)));
            zz = 3.04448 + (((tickAnim - 134) / 22) * (0-(3.04448)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 8.75 + (((tickAnim - 156) / 15) * (7.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(8.75)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 7.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 171) / 40) * (0-(7.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-8.63156-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (3.19531-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -8.63156 + (((tickAnim - 21) / 19) * (-17-(-8.63156)));
            yy = -0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 21) / 19) * (0-(-0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            zz = 3.19531 + (((tickAnim - 21) / 19) * (0-(3.19531)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = -17 + (((tickAnim - 40) / 18) * (-12.44306-(-17)));
            yy = 0 + (((tickAnim - 40) / 18) * (0.5474-(0)));
            zz = 0 + (((tickAnim - 40) / 18) * (-1.32838-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 80) {
            xx = -12.44306 + (((tickAnim - 58) / 22) * (5.71233-(-12.44306)));
            yy = 0.5474 + (((tickAnim - 58) / 22) * (1.3336-(0.5474)));
            zz = -1.32838 + (((tickAnim - 58) / 22) * (-3.23626-(-1.32838)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 5.71233 + (((tickAnim - 80) / 54) * (-4.98913-(5.71233)));
            yy = 1.3336 + (((tickAnim - 80) / 54) * (2.59095-(1.3336)));
            zz = -3.23626 + (((tickAnim - 80) / 54) * (1.39244-(-3.23626)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = -4.98913 + (((tickAnim - 134) / 22) * (11.5-(-4.98913)));
            yy = 2.59095 + (((tickAnim - 134) / 22) * (0-(2.59095)));
            zz = 1.39244 + (((tickAnim - 134) / 22) * (0-(1.39244)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 11.5 + (((tickAnim - 156) / 15) * (6.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(11.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 6.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 171) / 40) * (0-(6.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-12.22594-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (3.47243-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 40) {
            xx = -12.22594 + (((tickAnim - 21) / 19) * (-23.75-(-12.22594)));
            yy = -0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 21) / 19) * (0-(-0.2773+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            zz = 3.47243 + (((tickAnim - 21) / 19) * (0-(3.47243)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -23.75 + (((tickAnim - 40) / 40) * (-6.25729-(-23.75)));
            yy = 0 + (((tickAnim - 40) / 40) * (-0.35043-(0)));
            zz = 0 + (((tickAnim - 40) / 40) * (0.08126-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = -6.25729 + (((tickAnim - 80) / 15) * (-9.03297-(-6.25729)));
            yy = -0.35043 + (((tickAnim - 80) / 15) * (-3.1015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5-(-0.35043)));
            zz = 0.08126 + (((tickAnim - 80) / 15) * (-2.63575-(0.08126)));
        }
        else if (tickAnim >= 95 && tickAnim < 134) {
            xx = -9.03297 + (((tickAnim - 95) / 39) * (-10.461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*1-(-9.03297)));
            yy = -3.1015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 95) / 39) * (-0.55949-(-3.1015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
            zz = -2.63575 + (((tickAnim - 95) / 39) * (0.24179-(-2.63575)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = -10.461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*1 + (((tickAnim - 134) / 22) * (6.75-(-10.461+Math.sin((Math.PI/180)*(((double)tickAnim/20)*280))*1)));
            yy = -0.55949 + (((tickAnim - 134) / 22) * (0-(-0.55949)));
            zz = 0.24179 + (((tickAnim - 134) / 22) * (0-(0.24179)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 6.75 + (((tickAnim - 156) / 15) * (-28.5-(6.75)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = -28.5 + (((tickAnim - 171) / 40) * (0-(-28.5)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 5 + (((tickAnim - 18) / 8) * (-21.35125-(5)));
            yy = 0 + (((tickAnim - 18) / 8) * (-3.58775-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (4.81108-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -21.35125 + (((tickAnim - 26) / 5) * (-28.7025-(-21.35125)));
            yy = -3.58775 + (((tickAnim - 26) / 5) * (-7.1755-(-3.58775)));
            zz = 4.81108 + (((tickAnim - 26) / 5) * (9.62215-(4.81108)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -28.7025 + (((tickAnim - 31) / 9) * (-29.7025-(-28.7025)));
            yy = -7.1755 + (((tickAnim - 31) / 9) * (-7.1755-(-7.1755)));
            zz = 9.62215 + (((tickAnim - 31) / 9) * (9.62215-(9.62215)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = -29.7025 + (((tickAnim - 40) / 14) * (-4.13203-(-29.7025)));
            yy = -7.1755 + (((tickAnim - 40) / 14) * (-5.23213-(-7.1755)));
            zz = 9.62215 + (((tickAnim - 40) / 14) * (7.01615-(9.62215)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = -4.13203 + (((tickAnim - 54) / 26) * (20.99059-(-4.13203)));
            yy = -5.23213 + (((tickAnim - 54) / 26) * (-0.89595-(-5.23213)));
            zz = 7.01615 + (((tickAnim - 54) / 26) * (1.20307-(7.01615)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 20.99059 + (((tickAnim - 80) / 54) * (20.99059-(20.99059)));
            yy = -0.89595 + (((tickAnim - 80) / 54) * (-0.89595-(-0.89595)));
            zz = 1.20307 + (((tickAnim - 80) / 54) * (1.20307-(1.20307)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 20.99059 + (((tickAnim - 134) / 22) * (-1-(20.99059)));
            yy = -0.89595 + (((tickAnim - 134) / 22) * (0-(-0.89595)));
            zz = 1.20307 + (((tickAnim - 134) / 22) * (0-(1.20307)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -1 + (((tickAnim - 156) / 15) * (7.75-(-1)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 7.75 + (((tickAnim - 171) / 2) * (8.75-(7.75)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 8.75 + (((tickAnim - 173) / 10) * (-22.06-(8.75)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 189) {
            xx = -22.06 + (((tickAnim - 183) / 6) * (-5.45273-(-22.06)));
            yy = 0 + (((tickAnim - 183) / 6) * (-1.42943-(0)));
            zz = 0 + (((tickAnim - 183) / 6) * (7.87208-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = -5.45273 + (((tickAnim - 189) / 6) * (6.25-(-5.45273)));
            yy = -1.42943 + (((tickAnim - 189) / 6) * (0-(-1.42943)));
            zz = 7.87208 + (((tickAnim - 189) / 6) * (0-(7.87208)));
        }
        else if (tickAnim >= 195 && tickAnim < 211) {
            xx = 6.25 + (((tickAnim - 195) / 16) * (0-(6.25)));
            yy = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 13) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = -1.125 + (((tickAnim - 31) / 9) * (-0.525-(-1.125)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 14) * (-5.475-(-0.525)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -5.475 + (((tickAnim - 54) / 26) * (0-(-5.475)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (-0.6-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = -0.875 + (((tickAnim - 171) / 2) * (-0.875-(-0.875)));
            zz = -0.6 + (((tickAnim - 171) / 2) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 173) / 10) * (0-(-0.875)));
            zz = -0.6 + (((tickAnim - 173) / 10) * (0-(-0.6)));
        }
        else if (tickAnim >= 183 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 183) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 12) * (-0.045-(0)));
            zz = 0 + (((tickAnim - 183) / 12) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            yy = -0.045 + (((tickAnim - 195) / 16) * (0-(-0.045)));
            zz = 0 + (((tickAnim - 195) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -9.75 + (((tickAnim - 18) / 8) * (-23.61546-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 8) * (0.1552-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-5.07942-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = -23.61546 + (((tickAnim - 26) / 5) * (-12.48091-(-23.61546)));
            yy = 0.1552 + (((tickAnim - 26) / 5) * (0.31041-(0.1552)));
            zz = -5.07942 + (((tickAnim - 26) / 5) * (-10.15883-(-5.07942)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -12.48091 + (((tickAnim - 31) / 9) * (-12.48091-(-12.48091)));
            yy = 0.31041 + (((tickAnim - 31) / 9) * (0.31041-(0.31041)));
            zz = -10.15883 + (((tickAnim - 31) / 9) * (-10.15883-(-10.15883)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = -12.48091 + (((tickAnim - 40) / 14) * (12.88212-(-12.48091)));
            yy = 0.31041 + (((tickAnim - 40) / 14) * (0.20047-(0.31041)));
            zz = -10.15883 + (((tickAnim - 40) / 14) * (-6.56091-(-10.15883)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 12.88212 + (((tickAnim - 54) / 26) * (-5.37798-(12.88212)));
            yy = 0.20047 + (((tickAnim - 54) / 26) * (-2.18637-(0.20047)));
            zz = -6.56091 + (((tickAnim - 54) / 26) * (-6.38765-(-6.56091)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = -5.37798 + (((tickAnim - 80) / 54) * (-5.37798-(-5.37798)));
            yy = -2.18637 + (((tickAnim - 80) / 54) * (-2.18637-(-2.18637)));
            zz = -6.38765 + (((tickAnim - 80) / 54) * (-6.38765-(-6.38765)));
        }
        else if (tickAnim >= 134 && tickAnim < 147) {
            xx = -5.37798 + (((tickAnim - 134) / 13) * (-20.14-(-5.37798)));
            yy = -2.18637 + (((tickAnim - 134) / 13) * (-0.42046-(-2.18637)));
            zz = -6.38765 + (((tickAnim - 134) / 13) * (-1.2284-(-6.38765)));
        }
        else if (tickAnim >= 147 && tickAnim < 156) {
            xx = -20.14 + (((tickAnim - 147) / 9) * (-7.25-(-20.14)));
            yy = -0.42046 + (((tickAnim - 147) / 9) * (0-(-0.42046)));
            zz = -1.2284 + (((tickAnim - 147) / 9) * (0-(-1.2284)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -7.25 + (((tickAnim - 156) / 15) * (-39.24892-(-7.25)));
            yy = 0 + (((tickAnim - 156) / 15) * (-0.0149-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (-0.03719-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -39.24892 + (((tickAnim - 171) / 2) * (-41.99892-(-39.24892)));
            yy = -0.0149 + (((tickAnim - 171) / 2) * (-0.0149-(-0.0149)));
            zz = -0.03719 + (((tickAnim - 171) / 2) * (-0.03719-(-0.03719)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = -41.99892 + (((tickAnim - 173) / 10) * (-18.25-(-41.99892)));
            yy = -0.0149 + (((tickAnim - 173) / 10) * (0-(-0.0149)));
            zz = -0.03719 + (((tickAnim - 173) / 10) * (0-(-0.03719)));
        }
        else if (tickAnim >= 183 && tickAnim < 189) {
            xx = -18.25 + (((tickAnim - 183) / 6) * (-14.4821-(-18.25)));
            yy = 0 + (((tickAnim - 183) / 6) * (-3.30451-(0)));
            zz = 0 + (((tickAnim - 183) / 6) * (-11.80244-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = -14.4821 + (((tickAnim - 189) / 6) * (9.48-(-14.4821)));
            yy = -3.30451 + (((tickAnim - 189) / 6) * (0-(-3.30451)));
            zz = -11.80244 + (((tickAnim - 189) / 6) * (0-(-11.80244)));
        }
        else if (tickAnim >= 195 && tickAnim < 211) {
            xx = 9.48 + (((tickAnim - 195) / 16) * (0-(9.48)));
            yy = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.13-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = 1.13 + (((tickAnim - 18) / 13) * (0.575-(1.13)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 0.575 + (((tickAnim - 31) / 9) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = 0.575 + (((tickAnim - 40) / 14) * (0.35-(0.575)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 54) / 102) * (0-(0)));
            yy = 0.35 + (((tickAnim - 54) / 102) * (-0.4-(0.35)));
            zz = 0 + (((tickAnim - 54) / 102) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 156) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 156) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.25))*0.3-(-0.4)));
            zz = 0 + (((tickAnim - 156) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 162) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.25))*0.3 + (((tickAnim - 162) / 9) * (0.425-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.25))*0.3)));
            zz = -0.25 + (((tickAnim - 162) / 9) * (-1.225-(-0.25)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 171) / 2) * (0.425-(0.425)));
            zz = -1.225 + (((tickAnim - 171) / 2) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 173) / 10) * (0-(0.425)));
            zz = -1.225 + (((tickAnim - 173) / 10) * (0-(-1.225)));
        }
        else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 183) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 183) / 6) * (2.35-(0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0.08-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 189) / 6) * (0-(0)));
            yy = 2.35 + (((tickAnim - 189) / 6) * (0-(2.35)));
            zz = 0.08 + (((tickAnim - 189) / 6) * (0-(0.08)));
        }
        else if (tickAnim >= 195 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (47.5-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 47.5 + (((tickAnim - 26) / 5) * (31-(47.5)));
            yy = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 5) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 31 + (((tickAnim - 31) / 9) * (31-(31)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 31 + (((tickAnim - 40) / 14) * (0-(31)));
            yy = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (41.75-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 41.75 + (((tickAnim - 80) / 54) * (41.75-(41.75)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 147) {
            xx = 41.75 + (((tickAnim - 134) / 13) * (42.83-(41.75)));
            yy = 0 + (((tickAnim - 134) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 13) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 156) {
            xx = 42.83 + (((tickAnim - 147) / 9) * (12.75-(42.83)));
            yy = 0 + (((tickAnim - 147) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 9) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 12.75 + (((tickAnim - 156) / 15) * (17.5-(12.75)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 17.5 + (((tickAnim - 171) / 2) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 17.5 + (((tickAnim - 173) / 10) * (31.23-(17.5)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 31.23 + (((tickAnim - 183) / 6) * (31.54-(31.23)));
            yy = 0 + (((tickAnim - 183) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 6) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 31.54 + (((tickAnim - 189) / 6) * (-19.25-(31.54)));
            yy = 0 + (((tickAnim - 189) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 6) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 211) {
            xx = -19.25 + (((tickAnim - 195) / 16) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (3.39-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-1.425-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 3.39 + (((tickAnim - 26) / 5) * (1.875-(3.39)));
            zz = -1.425 + (((tickAnim - 26) / 5) * (0-(-1.425)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            yy = 1.875 + (((tickAnim - 31) / 9) * (1.875-(1.875)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = 1.875 + (((tickAnim - 40) / 14) * (-0.075-(1.875)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -0.075 + (((tickAnim - 54) / 26) * (2.855-(-0.075)));
            zz = 0 + (((tickAnim - 54) / 26) * (-0.725-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 2.855 + (((tickAnim - 80) / 54) * (2.855-(2.855)));
            zz = -0.725 + (((tickAnim - 80) / 54) * (-0.725-(-0.725)));
        }
        else if (tickAnim >= 134 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 134) / 13) * (0-(0)));
            yy = 2.855 + (((tickAnim - 134) / 13) * (3.015-(2.855)));
            zz = -0.725 + (((tickAnim - 134) / 13) * (-1.015-(-0.725)));
        }
        else if (tickAnim >= 147 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 147) / 9) * (0-(0)));
            yy = 3.015 + (((tickAnim - 147) / 9) * (0.175-(3.015)));
            zz = -1.015 + (((tickAnim - 147) / 9) * (0-(-1.015)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0.175 + (((tickAnim - 156) / 15) * (1.78-(0.175)));
            zz = 0 + (((tickAnim - 156) / 15) * (-0.05-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = 1.78 + (((tickAnim - 171) / 2) * (1.78-(1.78)));
            zz = -0.05 + (((tickAnim - 171) / 2) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            yy = 1.78 + (((tickAnim - 173) / 10) * (1.465-(1.78)));
            zz = -0.05 + (((tickAnim - 173) / 10) * (-0.185-(-0.05)));
        }
        else if (tickAnim >= 183 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 183) / 6) * (0-(0)));
            yy = 1.465 + (((tickAnim - 183) / 6) * (2.265-(1.465)));
            zz = -0.185 + (((tickAnim - 183) / 6) * (-0.22-(-0.185)));
        }
        else if (tickAnim >= 189 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 189) / 6) * (0-(0)));
            yy = 2.265 + (((tickAnim - 189) / 6) * (0-(2.265)));
            zz = -0.22 + (((tickAnim - 189) / 6) * (0-(-0.22)));
        }
        else if (tickAnim >= 195 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 195) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-6.28181-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (1.65238-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-4.6861-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -6.28181 + (((tickAnim - 7) / 6) * (-6.96979-(-6.28181)));
            yy = 1.65238 + (((tickAnim - 7) / 6) * (2.76691-(1.65238)));
            zz = -4.6861 + (((tickAnim - 7) / 6) * (-6.4026-(-4.6861)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -6.96979 + (((tickAnim - 13) / 27) * (-15.95966-(-6.96979)));
            yy = 2.76691 + (((tickAnim - 13) / 27) * (4.09623-(2.76691)));
            zz = -6.4026 + (((tickAnim - 13) / 27) * (-12.88339-(-6.4026)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = -15.95966 + (((tickAnim - 40) / 14) * (-2.88203-(-15.95966)));
            yy = 4.09623 + (((tickAnim - 40) / 14) * (-5.23213-(4.09623)));
            zz = -12.88339 + (((tickAnim - 40) / 14) * (-7.0162-(-12.88339)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = -2.88203 + (((tickAnim - 54) / 26) * (26.9932-(-2.88203)));
            yy = -5.23213 + (((tickAnim - 54) / 26) * (0.84734-(-5.23213)));
            zz = -7.0162 + (((tickAnim - 54) / 26) * (-0.91901-(-7.0162)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 26.9932 + (((tickAnim - 80) / 54) * (26.9932-(26.9932)));
            yy = 0.84734 + (((tickAnim - 80) / 54) * (0.84734-(0.84734)));
            zz = -0.91901 + (((tickAnim - 80) / 54) * (-0.91901-(-0.91901)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 26.9932 + (((tickAnim - 134) / 22) * (-1-(26.9932)));
            yy = 0.84734 + (((tickAnim - 134) / 22) * (0-(0.84734)));
            zz = -0.91901 + (((tickAnim - 134) / 22) * (0-(-0.91901)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -1 + (((tickAnim - 156) / 15) * (7.75-(-1)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 7.75 + (((tickAnim - 171) / 2) * (9-(7.75)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 195) {
            xx = 9 + (((tickAnim - 173) / 22) * (-35.58-(9)));
            yy = 0 + (((tickAnim - 173) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 22) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = -35.58 + (((tickAnim - 195) / 9) * (9.61681-(-35.58)));
            yy = 0 + (((tickAnim - 195) / 9) * (0.12389-(0)));
            zz = 0 + (((tickAnim - 195) / 9) * (-6.74887-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = 9.61681 + (((tickAnim - 204) / 7) * (0-(9.61681)));
            yy = 0.12389 + (((tickAnim - 204) / 7) * (0-(0.12389)));
            zz = -6.74887 + (((tickAnim - 204) / 7) * (0-(-6.74887)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.775 + (((tickAnim - 7) / 6) * (-3.325-(-0.775)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = -3.325 + (((tickAnim - 13) / 27) * (-0.75-(-3.325)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = -0.75 + (((tickAnim - 40) / 14) * (-5.625-(-0.75)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = -5.625 + (((tickAnim - 54) / 26) * (0-(-5.625)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (-0.6-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = -0.875 + (((tickAnim - 171) / 2) * (-0.875-(-0.875)));
            zz = -0.6 + (((tickAnim - 171) / 2) * (-0.6-(-0.6)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 173) / 10) * (-0.72-(-0.875)));
            zz = -0.6 + (((tickAnim - 173) / 10) * (-1.245-(-0.6)));
        }
        else if (tickAnim >= 183 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 183) / 12) * (0-(0)));
            yy = -0.72 + (((tickAnim - 183) / 12) * (-0.55-(-0.72)));
            zz = -1.245 + (((tickAnim - 183) / 12) * (-0.64-(-1.245)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 195) / 9) * (0-(0)));
            yy = -0.55 + (((tickAnim - 195) / 9) * (0-(-0.55)));
            zz = -0.64 + (((tickAnim - 195) / 9) * (0-(-0.64)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-22.6915-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (3.08821-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (3.02799-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -22.6915 + (((tickAnim - 7) / 6) * (-32.47286-(-22.6915)));
            yy = 3.08821 + (((tickAnim - 7) / 6) * (8.23221-(3.08821)));
            zz = 3.02799 + (((tickAnim - 7) / 6) * (4.79271-(3.02799)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = -32.47286 + (((tickAnim - 13) / 27) * (-28.71423-(-32.47286)));
            yy = 8.23221 + (((tickAnim - 13) / 27) * (0.17205-(8.23221)));
            zz = 4.79271 + (((tickAnim - 13) / 27) * (12.90611-(4.79271)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = -28.71423 + (((tickAnim - 40) / 14) * (12.13212-(-28.71423)));
            yy = 0.17205 + (((tickAnim - 40) / 14) * (0.20047-(0.17205)));
            zz = 12.90611 + (((tickAnim - 40) / 14) * (6.5609-(12.90611)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 12.13212 + (((tickAnim - 54) / 26) * (-20.36357-(12.13212)));
            yy = 0.20047 + (((tickAnim - 54) / 26) * (5.46076-(0.20047)));
            zz = 6.5609 + (((tickAnim - 54) / 26) * (8.08957-(6.5609)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = -20.36357 + (((tickAnim - 80) / 54) * (-20.36357-(-20.36357)));
            yy = 5.46076 + (((tickAnim - 80) / 54) * (5.46076-(5.46076)));
            zz = 8.08957 + (((tickAnim - 80) / 54) * (8.08957-(8.08957)));
        }
        else if (tickAnim >= 134 && tickAnim < 147) {
            xx = -20.36357 + (((tickAnim - 134) / 13) * (-18.50261-(-20.36357)));
            yy = 5.46076 + (((tickAnim - 134) / 13) * (1.05015-(5.46076)));
            zz = 8.08957 + (((tickAnim - 134) / 13) * (1.55569-(8.08957)));
        }
        else if (tickAnim >= 147 && tickAnim < 156) {
            xx = -18.50261 + (((tickAnim - 147) / 9) * (-4.75-(-18.50261)));
            yy = 1.05015 + (((tickAnim - 147) / 9) * (0-(1.05015)));
            zz = 1.55569 + (((tickAnim - 147) / 9) * (0-(1.55569)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -4.75 + (((tickAnim - 156) / 15) * (-39.24892-(-4.75)));
            yy = 0 + (((tickAnim - 156) / 15) * (-0.0149-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (-0.03719-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -39.24892 + (((tickAnim - 171) / 2) * (-41.49892-(-39.24892)));
            yy = -0.0149 + (((tickAnim - 171) / 2) * (-0.0149-(-0.0149)));
            zz = -0.03719 + (((tickAnim - 171) / 2) * (-0.03719-(-0.03719)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = -41.49892 + (((tickAnim - 173) / 10) * (-23.87174-(-41.49892)));
            yy = -0.0149 + (((tickAnim - 173) / 10) * (-0.01024-(-0.0149)));
            zz = -0.03719 + (((tickAnim - 173) / 10) * (-0.02557-(-0.03719)));
        }
        else if (tickAnim >= 183 && tickAnim < 195) {
            xx = -23.87174 + (((tickAnim - 183) / 12) * (-1.28608-(-23.87174)));
            yy = -0.01024 + (((tickAnim - 183) / 12) * (-0.00528-(-0.01024)));
            zz = -0.02557 + (((tickAnim - 183) / 12) * (-0.01317-(-0.02557)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = -1.28608 + (((tickAnim - 195) / 9) * (-27.22187-(-1.28608)));
            yy = -0.00528 + (((tickAnim - 195) / 9) * (2.82781-(-0.00528)));
            zz = -0.01317 + (((tickAnim - 195) / 9) * (11.91721-(-0.01317)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = -27.22187 + (((tickAnim - 204) / 7) * (0-(-27.22187)));
            yy = 2.82781 + (((tickAnim - 204) / 7) * (0-(2.82781)));
            zz = 11.91721 + (((tickAnim - 204) / 7) * (0-(11.91721)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0.6-(0)));
            yy = 0.875 + (((tickAnim - 7) / 6) * (-1.25-(0.875)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0.6 + (((tickAnim - 13) / 27) * (0-(0.6)));
            yy = -1.25 + (((tickAnim - 13) / 27) * (-1.275-(-1.25)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = -1.275 + (((tickAnim - 40) / 14) * (-0.45-(-1.275)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 54) / 102) * (0-(0)));
            yy = -0.45 + (((tickAnim - 54) / 102) * (-0.4-(-0.45)));
            zz = 0 + (((tickAnim - 54) / 102) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 156) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 156) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.25))*0.3-(-0.4)));
            zz = 0 + (((tickAnim - 156) / 6) * (-0.25-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 162) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.25))*0.3 + (((tickAnim - 162) / 9) * (0.425-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.25))*0.3)));
            zz = -0.25 + (((tickAnim - 162) / 9) * (-1.225-(-0.25)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = 0.425 + (((tickAnim - 171) / 2) * (0.425-(0.425)));
            zz = -1.225 + (((tickAnim - 171) / 2) * (-1.225-(-1.225)));
        }
        else if (tickAnim >= 173 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 173) / 22) * (0-(0)));
            yy = 0.425 + (((tickAnim - 173) / 22) * (-1.35-(0.425)));
            zz = -1.225 + (((tickAnim - 173) / 22) * (-1.95-(-1.225)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 195) / 9) * (0-(0)));
            yy = -1.35 + (((tickAnim - 195) / 9) * (0-(-1.35)));
            zz = -1.95 + (((tickAnim - 195) / 9) * (0-(-1.95)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (58.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 58.5 + (((tickAnim - 7) / 6) * (35.75-(58.5)));
            yy = 0.875 + (((tickAnim - 7) / 6) * (0-(0.875)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 35.75 + (((tickAnim - 13) / 27) * (34.5-(35.75)));
            yy = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 27) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 34.5 + (((tickAnim - 40) / 14) * (0-(34.5)));
            yy = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 14) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (48.75-(0)));
            yy = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 26) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 48.75 + (((tickAnim - 80) / 54) * (48.75-(48.75)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 147) {
            xx = 48.75 + (((tickAnim - 134) / 13) * (29.09-(48.75)));
            yy = 0 + (((tickAnim - 134) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 13) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 156) {
            xx = 29.09 + (((tickAnim - 147) / 9) * (8-(29.09)));
            yy = 0 + (((tickAnim - 147) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 9) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 8 + (((tickAnim - 156) / 15) * (17.5-(8)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 17.5 + (((tickAnim - 171) / 2) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 183) {
            xx = 17.5 + (((tickAnim - 173) / 10) * (33.72-(17.5)));
            yy = 0 + (((tickAnim - 173) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 10) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 195) {
            xx = 33.72 + (((tickAnim - 183) / 12) * (31.09-(33.72)));
            yy = 0 + (((tickAnim - 183) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 183) / 12) * (0-(0)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = 31.09 + (((tickAnim - 195) / 9) * (47.75-(31.09)));
            yy = 0 + (((tickAnim - 195) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 195) / 9) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = 47.75 + (((tickAnim - 204) / 7) * (0-(47.75)));
            yy = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.115-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 5 + (((tickAnim - 7) / 6) * (2-(5)));
            zz = -2.115 + (((tickAnim - 7) / 6) * (-0.4-(-2.115)));
        }
        else if (tickAnim >= 13 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 13) / 27) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 27) * (2.3-(2)));
            zz = -0.4 + (((tickAnim - 13) / 27) * (-0.475-(-0.4)));
        }
        else if (tickAnim >= 40 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 40) / 14) * (0-(0)));
            yy = 2.3 + (((tickAnim - 40) / 14) * (0.85-(2.3)));
            zz = -0.475 + (((tickAnim - 40) / 14) * (0-(-0.475)));
        }
        else if (tickAnim >= 54 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 54) / 26) * (0-(0)));
            yy = 0.85 + (((tickAnim - 54) / 26) * (3.45-(0.85)));
            zz = 0 + (((tickAnim - 54) / 26) * (-1.1-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 3.45 + (((tickAnim - 80) / 54) * (3.45-(3.45)));
            zz = -1.1 + (((tickAnim - 80) / 54) * (-1.1-(-1.1)));
        }
        else if (tickAnim >= 134 && tickAnim < 147) {
            xx = 0 + (((tickAnim - 134) / 13) * (0-(0)));
            yy = 3.45 + (((tickAnim - 134) / 13) * (1.835-(3.45)));
            zz = -1.1 + (((tickAnim - 134) / 13) * (-0.21-(-1.1)));
        }
        else if (tickAnim >= 147 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 147) / 9) * (0-(0)));
            yy = 1.835 + (((tickAnim - 147) / 9) * (0-(1.835)));
            zz = -0.21 + (((tickAnim - 147) / 9) * (0-(-0.21)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (1.78-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (-0.05-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = 1.78 + (((tickAnim - 171) / 2) * (1.78-(1.78)));
            zz = -0.05 + (((tickAnim - 171) / 2) * (-0.05-(-0.05)));
        }
        else if (tickAnim >= 173 && tickAnim < 195) {
            xx = 0 + (((tickAnim - 173) / 22) * (0-(0)));
            yy = 1.78 + (((tickAnim - 173) / 22) * (1.425-(1.78)));
            zz = -0.05 + (((tickAnim - 173) / 22) * (-0.275-(-0.05)));
        }
        else if (tickAnim >= 195 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 195) / 9) * (0-(0)));
            yy = 1.425 + (((tickAnim - 195) / 9) * (3.35-(1.425)));
            zz = -0.275 + (((tickAnim - 195) / 9) * (-0.975-(-0.275)));
        }
        else if (tickAnim >= 204 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 204) / 7) * (0-(0)));
            yy = 3.35 + (((tickAnim - 204) / 7) * (0-(3.35)));
            zz = -0.975 + (((tickAnim - 204) / 7) * (0-(-0.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 73) {
            xx = 4.25 + (((tickAnim - 40) / 33) * (-5.25-(4.25)));
            yy = 0 + (((tickAnim - 40) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 33) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -5.25 + (((tickAnim - 73) / 7) * (-3.39819-(-5.25)));
            yy = 0 + (((tickAnim - 73) / 7) * (-2.47102-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0.37968-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = -3.39819 + (((tickAnim - 80) / 54) * (-3.39819-(-3.39819)));
            yy = -2.47102 + (((tickAnim - 80) / 54) * (-2.47102-(-2.47102)));
            zz = 0.37968 + (((tickAnim - 80) / 54) * (0.37968-(0.37968)));
        }
        else if (tickAnim >= 134 && tickAnim < 142) {
            xx = -3.39819 + (((tickAnim - 134) / 8) * (0-(-3.39819)));
            yy = -2.47102 + (((tickAnim - 134) / 8) * (0-(-2.47102)));
            zz = 0.37968 + (((tickAnim - 134) / 8) * (0-(0.37968)));
        }
        else if (tickAnim >= 142 && tickAnim < 159) {
            xx = 0 + (((tickAnim - 142) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 142) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 142) / 17) * (0-(0)));
        }
        else if (tickAnim >= 159 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 159) / 12) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 159) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 159) / 12) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -3.25 + (((tickAnim - 171) / 2) * (-3.75-(-3.25)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 211) {
            xx = -3.75 + (((tickAnim - 173) / 38) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 173) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (-0.925-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 73) / 61) * (0-(0)));
            yy = 0.5 + (((tickAnim - 73) / 61) * (0.5-(0.5)));
            zz = -0.925 + (((tickAnim - 73) / 61) * (-0.925-(-0.925)));
        }
        else if (tickAnim >= 134 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 134) / 77) * (0-(0)));
            yy = 0.5 + (((tickAnim - 134) / 77) * (0-(0.5)));
            zz = -0.925 + (((tickAnim - 134) / 77) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 73) {
            xx = 3.25 + (((tickAnim - 40) / 33) * (2.67493-(3.25)));
            yy = 0 + (((tickAnim - 40) / 33) * (-8.00367-(0)));
            zz = 0 + (((tickAnim - 40) / 33) * (-5.12761-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 2.67493 + (((tickAnim - 73) / 7) * (5.36471-(2.67493)));
            yy = -8.00367 + (((tickAnim - 73) / 7) * (-9.98941-(-8.00367)));
            zz = -5.12761 + (((tickAnim - 73) / 7) * (-5.36896-(-5.12761)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 5.36471 + (((tickAnim - 80) / 54) * (5.36471-(5.36471)));
            yy = -9.98941 + (((tickAnim - 80) / 54) * (-9.98941-(-9.98941)));
            zz = -5.36896 + (((tickAnim - 80) / 54) * (-5.36896-(-5.36896)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 5.36471 + (((tickAnim - 134) / 7) * (-6.15687-(5.36471)));
            yy = -9.98941 + (((tickAnim - 134) / 7) * (-6.62142-(-9.98941)));
            zz = -5.36896 + (((tickAnim - 134) / 7) * (-1.2133-(-5.36896)));
        }
        else if (tickAnim >= 141 && tickAnim < 148) {
            xx = -6.15687 + (((tickAnim - 141) / 7) * (-6.76832-(-6.15687)));
            yy = -6.62142 + (((tickAnim - 141) / 7) * (-2.43947-(-6.62142)));
            zz = -1.2133 + (((tickAnim - 141) / 7) * (-0.447-(-1.2133)));
        }
        else if (tickAnim >= 148 && tickAnim < 158) {
            xx = -6.76832 + (((tickAnim - 148) / 10) * (0-(-6.76832)));
            yy = -2.43947 + (((tickAnim - 148) / 10) * (0-(-2.43947)));
            zz = -0.447 + (((tickAnim - 148) / 10) * (0-(-0.447)));
        }
        else if (tickAnim >= 158 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 158) / 13) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 158) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 13) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = -1.75 + (((tickAnim - 171) / 40) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (-1.125-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 73) / 61) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 61) * (0-(0)));
            zz = -1.125 + (((tickAnim - 73) / 61) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 134 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 134) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 77) * (0-(0)));
            zz = -1.125 + (((tickAnim - 134) / 77) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 66) {
            xx = 3.25 + (((tickAnim - 40) / 26) * (2.83142-(3.25)));
            yy = 0 + (((tickAnim - 40) / 26) * (-5.16704-(0)));
            zz = 0 + (((tickAnim - 40) / 26) * (-5.55304-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 73) {
            xx = 2.83142 + (((tickAnim - 66) / 7) * (10.16726-(2.83142)));
            yy = -5.16704 + (((tickAnim - 66) / 7) * (-6.65555-(-5.16704)));
            zz = -5.55304 + (((tickAnim - 66) / 7) * (-6.21473-(-5.55304)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 10.16726 + (((tickAnim - 73) / 7) * (12.57633-(10.16726)));
            yy = -6.65555 + (((tickAnim - 73) / 7) * (-8.33013-(-6.65555)));
            zz = -6.21473 + (((tickAnim - 73) / 7) * (-6.95913-(-6.21473)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 12.57633 + (((tickAnim - 80) / 54) * (12.57633-(12.57633)));
            yy = -8.33013 + (((tickAnim - 80) / 54) * (-8.33013-(-8.33013)));
            zz = -6.95913 + (((tickAnim - 80) / 54) * (-6.95913-(-6.95913)));
        }
        else if (tickAnim >= 134 && tickAnim < 143) {
            xx = 12.57633 + (((tickAnim - 134) / 9) * (-4.98171-(12.57633)));
            yy = -8.33013 + (((tickAnim - 134) / 9) * (-5.02192-(-8.33013)));
            zz = -6.95913 + (((tickAnim - 134) / 9) * (-0.22638-(-6.95913)));
        }
        else if (tickAnim >= 143 && tickAnim < 158) {
            xx = -4.98171 + (((tickAnim - 143) / 15) * (-5.02486-(-4.98171)));
            yy = -5.02192 + (((tickAnim - 143) / 15) * (-4.5524-(-5.02192)));
            zz = -0.22638 + (((tickAnim - 143) / 15) * (3.52173-(-0.22638)));
        }
        else if (tickAnim >= 158 && tickAnim < 171) {
            xx = -5.02486 + (((tickAnim - 158) / 13) * (3.5-(-5.02486)));
            yy = -4.5524 + (((tickAnim - 158) / 13) * (0-(-4.5524)));
            zz = 3.52173 + (((tickAnim - 158) / 13) * (0-(3.52173)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 3.5 + (((tickAnim - 171) / 40) * (0-(3.5)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (-1.5-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            zz = -1.5 + (((tickAnim - 80) / 54) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 134 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 134) / 77) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 77) * (0-(0)));
            zz = -1.5 + (((tickAnim - 134) / 77) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 68) {
            xx = -3 + (((tickAnim - 40) / 28) * (13.99264-(-3)));
            yy = 0 + (((tickAnim - 40) / 28) * (-9.68567-(0)));
            zz = 0 + (((tickAnim - 40) / 28) * (-3.47019-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 13.99264 + (((tickAnim - 68) / 5) * (26.13445-(13.99264)));
            yy = -9.68567 + (((tickAnim - 68) / 5) * (-11.06933-(-9.68567)));
            zz = -3.47019 + (((tickAnim - 68) / 5) * (-3.96593-(-3.47019)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 26.13445 + (((tickAnim - 73) / 7) * (22.17511-(26.13445)));
            yy = -11.06933 + (((tickAnim - 73) / 7) * (-10.06121-(-11.06933)));
            zz = -3.96593 + (((tickAnim - 73) / 7) * (-6.84025-(-3.96593)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 22.17511 + (((tickAnim - 80) / 54) * (22.17511-(22.17511)));
            yy = -10.06121 + (((tickAnim - 80) / 54) * (-10.06121-(-10.06121)));
            zz = -6.84025 + (((tickAnim - 80) / 54) * (-6.84025-(-6.84025)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 22.17511 + (((tickAnim - 134) / 7) * (27.11727-(22.17511)));
            yy = -10.06121 + (((tickAnim - 134) / 7) * (-6.14367-(-10.06121)));
            zz = -6.84025 + (((tickAnim - 134) / 7) * (-6.40209-(-6.84025)));
        }
        else if (tickAnim >= 141 && tickAnim < 149) {
            xx = 27.11727 + (((tickAnim - 141) / 8) * (-9.77989-(27.11727)));
            yy = -6.14367 + (((tickAnim - 141) / 8) * (1.12275-(-6.14367)));
            zz = -6.40209 + (((tickAnim - 141) / 8) * (-3.0501-(-6.40209)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = -9.77989 + (((tickAnim - 149) / 7) * (-2.28811-(-9.77989)));
            yy = 1.12275 + (((tickAnim - 149) / 7) * (-3.6122-(1.12275)));
            zz = -3.0501 + (((tickAnim - 149) / 7) * (-2.67215-(-3.0501)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -2.28811 + (((tickAnim - 156) / 15) * (5.25-(-2.28811)));
            yy = -3.6122 + (((tickAnim - 156) / 15) * (0-(-3.6122)));
            zz = -2.67215 + (((tickAnim - 156) / 15) * (0-(-2.67215)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 5.25 + (((tickAnim - 171) / 40) * (0-(5.25)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 0) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 73) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 73) * (-1.15-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 73) / 61) * (0-(0)));
            yy = -0.2 + (((tickAnim - 73) / 61) * (-0.2-(-0.2)));
            zz = -1.15 + (((tickAnim - 73) / 61) * (-1.15-(-1.15)));
        }
        else if (tickAnim >= 134 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 134) / 77) * (0-(0)));
            yy = -0.2 + (((tickAnim - 134) / 77) * (0-(-0.2)));
            zz = -1.15 + (((tickAnim - 134) / 77) * (0-(-1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 68) {
            xx = -5.75 + (((tickAnim - 40) / 28) * (27.03374-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 28) * (-5.93314-(0)));
            zz = 0 + (((tickAnim - 40) / 28) * (-0.00212-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 27.03374 + (((tickAnim - 68) / 5) * (1.75066-(27.03374)));
            yy = -5.93314 + (((tickAnim - 68) / 5) * (-14.5-(-5.93314)));
            zz = -0.00212 + (((tickAnim - 68) / 5) * (-0.00517-(-0.00212)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 1.75066 + (((tickAnim - 73) / 7) * (2.75128-(1.75066)));
            yy = -14.5 + (((tickAnim - 73) / 7) * (-20-(-14.5)));
            zz = -0.00517 + (((tickAnim - 73) / 7) * (-0.00728-(-0.00517)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 2.75128 + (((tickAnim - 80) / 54) * (2.75128-(2.75128)));
            yy = -20 + (((tickAnim - 80) / 54) * (-20-(-20)));
            zz = -0.00728 + (((tickAnim - 80) / 54) * (-0.00728-(-0.00728)));
        }
        else if (tickAnim >= 134 && tickAnim < 142) {
            xx = 2.75128 + (((tickAnim - 134) / 8) * (14.75066-(2.75128)));
            yy = -20 + (((tickAnim - 134) / 8) * (-14.5-(-20)));
            zz = -0.00728 + (((tickAnim - 134) / 8) * (-0.00517-(-0.00728)));
        }
        else if (tickAnim >= 142 && tickAnim < 149) {
            xx = 14.75066 + (((tickAnim - 142) / 7) * (14.07758-(14.75066)));
            yy = -14.5 + (((tickAnim - 142) / 7) * (-14.5-(-14.5)));
            zz = -0.00517 + (((tickAnim - 142) / 7) * (-0.00517-(-0.00517)));
        }
        else if (tickAnim >= 149 && tickAnim < 152) {
            xx = 14.07758 + (((tickAnim - 149) / 3) * (-5.8771-(14.07758)));
            yy = -14.5 + (((tickAnim - 149) / 3) * (-11.94411-(-14.5)));
            zz = -0.00517 + (((tickAnim - 149) / 3) * (-0.38767-(-0.00517)));
        }
        else if (tickAnim >= 152 && tickAnim < 157) {
            xx = -5.8771 + (((tickAnim - 152) / 5) * (-3.78647-(-5.8771)));
            yy = -11.94411 + (((tickAnim - 152) / 5) * (-6.83234-(-11.94411)));
            zz = -0.38767 + (((tickAnim - 152) / 5) * (-1.15268-(-0.38767)));
        }
        else if (tickAnim >= 157 && tickAnim < 171) {
            xx = -3.78647 + (((tickAnim - 157) / 14) * (8.75-(-3.78647)));
            yy = -6.83234 + (((tickAnim - 157) / 14) * (0-(-6.83234)));
            zz = -1.15268 + (((tickAnim - 157) / 14) * (0-(-1.15268)));
        }
        else if (tickAnim >= 171 && tickAnim < 211) {
            xx = 8.75 + (((tickAnim - 171) / 40) * (0-(8.75)));
            yy = 0 + (((tickAnim - 171) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 10.5 + (((tickAnim - 40) / 8) * (-18-(10.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = -18 + (((tickAnim - 48) / 7) * (-16.5-(-18)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = -16.5 + (((tickAnim - 55) / 18) * (-4.9-(-16.5)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -4.9 + (((tickAnim - 73) / 7) * (-0.75-(-4.9)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -0.75 + (((tickAnim - 80) / 20) * (-2.75-(-0.75)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = -2.75 + (((tickAnim - 100) / 34) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 34) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 171) {
            xx = -2.75 + (((tickAnim - 134) / 37) * (8.5-(-2.75)));
            yy = 0 + (((tickAnim - 134) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 37) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 8.5 + (((tickAnim - 171) / 2) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 186) {
            xx = 8.5 + (((tickAnim - 173) / 13) * (16.16-(8.5)));
            yy = 0 + (((tickAnim - 173) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 13) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 211) {
            xx = 16.16 + (((tickAnim - 186) / 25) * (0-(16.16)));
            yy = 0 + (((tickAnim - 186) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (-1.05-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = -1.05 + (((tickAnim - 48) / 7) * (-4.375-(-1.05)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = -4.375 + (((tickAnim - 55) / 25) * (-5.2-(-4.375)));
            zz = 0 + (((tickAnim - 55) / 25) * (-0.075-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = -5.2 + (((tickAnim - 80) / 20) * (-6.725-(-5.2)));
            zz = -0.075 + (((tickAnim - 80) / 20) * (-0.07-(-0.075)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            yy = -6.725 + (((tickAnim - 100) / 34) * (-6.725-(-6.725)));
            zz = -0.07 + (((tickAnim - 100) / 34) * (-0.07-(-0.07)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = -6.725 + (((tickAnim - 134) / 22) * (0.12-(-6.725)));
            zz = -0.07 + (((tickAnim - 134) / 22) * (-0.03-(-0.07)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0.12 + (((tickAnim - 156) / 15) * (-0.225-(0.12)));
            zz = -0.03 + (((tickAnim - 156) / 15) * (0-(-0.03)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 171) / 2) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 173) / 38) * (0-(0)));
            yy = -0.225 + (((tickAnim - 173) / 38) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 173) / 38) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 23) / 17) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -3.75 + (((tickAnim - 40) / 8) * (40.75-(-3.75)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 40.75 + (((tickAnim - 48) / 7) * (25.75-(40.75)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = 25.75 + (((tickAnim - 55) / 18) * (31.55-(25.75)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 31.55 + (((tickAnim - 73) / 7) * (29.75-(31.55)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 29.75 + (((tickAnim - 80) / 10) * (8.77324-(29.75)));
            yy = 0 + (((tickAnim - 80) / 10) * (0.94798-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (-0.6561-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 8.77324 + (((tickAnim - 90) / 10) * (19.25-(8.77324)));
            yy = 0.94798 + (((tickAnim - 90) / 10) * (0-(0.94798)));
            zz = -0.6561 + (((tickAnim - 90) / 10) * (0-(-0.6561)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 19.25 + (((tickAnim - 100) / 34) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 34) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 19.25 + (((tickAnim - 134) / 22) * (0-(19.25)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -5.25 + (((tickAnim - 171) / 2) * (-4.5-(-5.25)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 178) {
            xx = -4.5 + (((tickAnim - 173) / 5) * (25.11-(-4.5)));
            yy = 0 + (((tickAnim - 173) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 5) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 25.11 + (((tickAnim - 178) / 8) * (-4.43-(25.11)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 193) {
            xx = -4.43 + (((tickAnim - 186) / 7) * (-5.5-(-4.43)));
            yy = 0 + (((tickAnim - 186) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 7) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 211) {
            xx = -5.5 + (((tickAnim - 193) / 18) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 193) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0.475-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0.775-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 0.475 + (((tickAnim - 55) / 25) * (-0.75-(0.475)));
            zz = 0.775 + (((tickAnim - 55) / 25) * (0.9-(0.775)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 80) / 10) * (1-(-0.75)));
            zz = 0.9 + (((tickAnim - 80) / 10) * (0.05-(0.9)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 90) / 10) * (-1.125-(1)));
            zz = 0.05 + (((tickAnim - 90) / 10) * (0.6-(0.05)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            yy = -1.125 + (((tickAnim - 100) / 34) * (-1.125-(-1.125)));
            zz = 0.6 + (((tickAnim - 100) / 34) * (0.6-(0.6)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = -1.125 + (((tickAnim - 134) / 22) * (0-(-1.125)));
            zz = 0.6 + (((tickAnim - 134) / 22) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -9.5 + (((tickAnim - 40) / 8) * (24.25-(-9.5)));
            yy = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 24.25 + (((tickAnim - 48) / 7) * (4.5-(24.25)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = 4.5 + (((tickAnim - 55) / 18) * (2.9-(4.5)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 2.9 + (((tickAnim - 73) / 7) * (5.25-(2.9)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 5.25 + (((tickAnim - 80) / 10) * (27.38-(5.25)));
            yy = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 27.38 + (((tickAnim - 90) / 10) * (19-(27.38)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 19 + (((tickAnim - 100) / 34) * (19-(19)));
            yy = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 34) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 19 + (((tickAnim - 134) / 22) * (-5.5-(19)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -5.5 + (((tickAnim - 156) / 15) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -5.5 + (((tickAnim - 171) / 2) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 178) {
            xx = -5.5 + (((tickAnim - 173) / 5) * (18.41-(-5.5)));
            yy = 0 + (((tickAnim - 173) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 5) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 18.41 + (((tickAnim - 178) / 8) * (-6.69-(18.41)));
            yy = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 193) {
            xx = -6.69 + (((tickAnim - 186) / 7) * (-9.91-(-6.69)));
            yy = 0 + (((tickAnim - 186) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 7) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 211) {
            xx = -9.91 + (((tickAnim - 193) / 18) * (0-(-9.91)));
            yy = 0 + (((tickAnim - 193) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 8) * (0.63-(0)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0.63 + (((tickAnim - 48) / 7) * (-1.025-(0.63)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = -1.025 + (((tickAnim - 55) / 25) * (-0.75-(-1.025)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 80) / 10) * (0.895-(-0.75)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            yy = 0.895 + (((tickAnim - 90) / 10) * (0.35-(0.895)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            yy = 0.35 + (((tickAnim - 100) / 34) * (0.35-(0.35)));
            zz = 0 + (((tickAnim - 100) / 34) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 134) / 6) * (0-(0)));
            yy = 0.35 + (((tickAnim - 134) / 6) * (1.94-(0.35)));
            zz = 0 + (((tickAnim - 134) / 6) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            yy = 1.94 + (((tickAnim - 140) / 5) * (2.295-(1.94)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 145) / 6) * (0-(0)));
            yy = 2.295 + (((tickAnim - 145) / 6) * (1.56-(2.295)));
            zz = 0 + (((tickAnim - 145) / 6) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 151) / 5) * (0-(0)));
            yy = 1.56 + (((tickAnim - 151) / 5) * (0-(1.56)));
            zz = 0 + (((tickAnim - 151) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0.75 + (((tickAnim - 12) / 11) * (-37.75-(0.75)));
            yy = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = -37.75 + (((tickAnim - 23) / 17) * (-37-(-37.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -37 + (((tickAnim - 40) / 15) * (-21.88-(-37)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = -21.88 + (((tickAnim - 55) / 18) * (-4.58-(-21.88)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -4.58 + (((tickAnim - 73) / 7) * (-0.24974-(-4.58)));
            yy = 0 + (((tickAnim - 73) / 7) * (0.06067-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0.49631-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -0.24974 + (((tickAnim - 80) / 20) * (0.25026-(-0.24974)));
            yy = 0.06067 + (((tickAnim - 80) / 20) * (0.06067-(0.06067)));
            zz = 0.49631 + (((tickAnim - 80) / 20) * (0.49631-(0.49631)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 0.25026 + (((tickAnim - 100) / 34) * (0.25026-(0.25026)));
            yy = 0.06067 + (((tickAnim - 100) / 34) * (0.06067-(0.06067)));
            zz = 0.49631 + (((tickAnim - 100) / 34) * (0.49631-(0.49631)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0.25026 + (((tickAnim - 134) / 22) * (3-(0.25026)));
            yy = 0.06067 + (((tickAnim - 134) / 22) * (0-(0.06067)));
            zz = 0.49631 + (((tickAnim - 134) / 22) * (0-(0.49631)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 3 + (((tickAnim - 156) / 15) * (2.25-(3)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 2.25 + (((tickAnim - 171) / 2) * (2-(2.25)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 193) {
            xx = 2 + (((tickAnim - 173) / 20) * (-27.59-(2)));
            yy = 0 + (((tickAnim - 173) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 20) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 203) {
            xx = -27.59 + (((tickAnim - 193) / 10) * (4-(-27.59)));
            yy = 0 + (((tickAnim - 193) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 10) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 211) {
            xx = 4 + (((tickAnim - 203) / 8) * (0-(4)));
            yy = 0 + (((tickAnim - 203) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (-5.025-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = -5.025 + (((tickAnim - 23) / 17) * (-5.025-(-5.025)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -5.025 + (((tickAnim - 40) / 15) * (-3.755-(-5.025)));
            zz = 0 + (((tickAnim - 40) / 15) * (-0.22-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            yy = -3.755 + (((tickAnim - 55) / 18) * (-4.495-(-3.755)));
            zz = -0.22 + (((tickAnim - 55) / 18) * (-0.47-(-0.22)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            yy = -4.495 + (((tickAnim - 73) / 7) * (-5.025-(-4.495)));
            zz = -0.47 + (((tickAnim - 73) / 7) * (-0.575-(-0.47)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = -5.025 + (((tickAnim - 80) / 54) * (-5.025-(-5.025)));
            zz = -0.575 + (((tickAnim - 80) / 54) * (-0.575-(-0.575)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = -5.025 + (((tickAnim - 134) / 22) * (0-(-5.025)));
            zz = -0.575 + (((tickAnim - 134) / 22) * (0-(-0.575)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 171) / 2) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 173) / 20) * (0-(0)));
            yy = -0.225 + (((tickAnim - 173) / 20) * (-3.545-(-0.225)));
            zz = 0 + (((tickAnim - 173) / 20) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 193) / 10) * (0-(0)));
            yy = -3.545 + (((tickAnim - 193) / 10) * (0-(-3.545)));
            zz = 0 + (((tickAnim - 193) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (19.02-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 19.02 + (((tickAnim - 15) / 3) * (7.55-(19.02)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 7.55 + (((tickAnim - 18) / 5) * (26.75-(7.55)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 26.75 + (((tickAnim - 23) / 17) * (24.5-(26.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 24.5 + (((tickAnim - 40) / 15) * (28.02-(24.5)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 28.02 + (((tickAnim - 55) / 25) * (27-(28.02)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 27 + (((tickAnim - 80) / 20) * (27-(27)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 27 + (((tickAnim - 100) / 34) * (27-(27)));
            yy = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 34) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 27 + (((tickAnim - 134) / 22) * (0-(27)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -7.25 + (((tickAnim - 171) / 2) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 193) {
            xx = -7.25 + (((tickAnim - 173) / 20) * (16.47-(-7.25)));
            yy = 0 + (((tickAnim - 173) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 20) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 198) {
            xx = 16.47 + (((tickAnim - 193) / 5) * (36.24-(16.47)));
            yy = 0 + (((tickAnim - 193) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 5) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 203) {
            xx = 36.24 + (((tickAnim - 198) / 5) * (-2-(36.24)));
            yy = 0 + (((tickAnim - 198) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 5) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 211) {
            xx = -2 + (((tickAnim - 203) / 8) * (0-(-2)));
            yy = 0 + (((tickAnim - 203) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (1.545-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0.68-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.545 + (((tickAnim - 18) / 5) * (-1.125-(1.545)));
            zz = 0.68 + (((tickAnim - 18) / 5) * (1.275-(0.68)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = -1.125 + (((tickAnim - 23) / 17) * (-0.525-(-1.125)));
            zz = 1.275 + (((tickAnim - 23) / 17) * (1.275-(1.275)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -0.525 + (((tickAnim - 40) / 15) * (-0.935-(-0.525)));
            zz = 1.275 + (((tickAnim - 40) / 15) * (1.695-(1.275)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = -0.935 + (((tickAnim - 55) / 25) * (-0.75-(-0.935)));
            zz = 1.695 + (((tickAnim - 55) / 25) * (1.4-(1.695)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = -0.75 + (((tickAnim - 80) / 54) * (-0.75-(-0.75)));
            zz = 1.4 + (((tickAnim - 80) / 54) * (1.4-(1.4)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            yy = -0.75 + (((tickAnim - 134) / 22) * (0-(-0.75)));
            zz = 1.4 + (((tickAnim - 134) / 22) * (0-(1.4)));
        }
        else if (tickAnim >= 156 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 156) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 37) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 156) / 37) * (0.275-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 193) / 10) * (0-(0)));
            yy = -0.425 + (((tickAnim - 193) / 10) * (0-(-0.425)));
            zz = 0.275 + (((tickAnim - 193) / 10) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 12) / 3) * (4.88-(-3.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.88 + (((tickAnim - 15) / 3) * (3-(4.88)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 3 + (((tickAnim - 18) / 3) * (-5.3-(3)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -5.3 + (((tickAnim - 21) / 2) * (8.75-(-5.3)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 8.75 + (((tickAnim - 23) / 17) * (8.25-(8.75)));
            yy = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 8.25 + (((tickAnim - 40) / 15) * (7-(8.25)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 73) {
            xx = 7 + (((tickAnim - 55) / 18) * (5.06-(7)));
            yy = 0 + (((tickAnim - 55) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 18) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 5.06 + (((tickAnim - 73) / 7) * (9.25-(5.06)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 9.25 + (((tickAnim - 80) / 20) * (7.75-(9.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 134) {
            xx = 7.75 + (((tickAnim - 100) / 34) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 100) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 34) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 7.75 + (((tickAnim - 134) / 22) * (-5.5-(7.75)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = -5.5 + (((tickAnim - 156) / 15) * (-7.25-(-5.5)));
            yy = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = -7.25 + (((tickAnim - 171) / 2) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 193) {
            xx = -7.25 + (((tickAnim - 173) / 20) * (5.31-(-7.25)));
            yy = 0 + (((tickAnim - 173) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 173) / 20) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 198) {
            xx = 5.31 + (((tickAnim - 193) / 5) * (13.41-(5.31)));
            yy = 0 + (((tickAnim - 193) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 5) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 203) {
            xx = 13.41 + (((tickAnim - 198) / 5) * (-4-(13.41)));
            yy = 0 + (((tickAnim - 198) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 5) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 211) {
            xx = -4 + (((tickAnim - 203) / 8) * (0-(-4)));
            yy = 0 + (((tickAnim - 203) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (1.25-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 18) / 5) * (-1.025-(1.25)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 23) / 17) * (0-(0)));
            yy = -1.025 + (((tickAnim - 23) / 17) * (-1.025-(-1.025)));
            zz = 0 + (((tickAnim - 23) / 17) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = -1.025 + (((tickAnim - 40) / 15) * (-0.995-(-1.025)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = -0.995 + (((tickAnim - 55) / 25) * (-0.375-(-0.995)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 80) / 54) * (0-(0)));
            yy = -0.375 + (((tickAnim - 80) / 54) * (-0.375-(-0.375)));
            zz = 0 + (((tickAnim - 80) / 54) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 139) {
            xx = 0 + (((tickAnim - 134) / 5) * (0-(0)));
            yy = -0.375 + (((tickAnim - 134) / 5) * (0.81-(-0.375)));
            zz = 0 + (((tickAnim - 134) / 5) * (0-(0)));
        }
        else if (tickAnim >= 139 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 139) / 4) * (0-(0)));
            yy = 0.81 + (((tickAnim - 139) / 4) * (1.345-(0.81)));
            zz = 0 + (((tickAnim - 139) / 4) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 143) / 6) * (0-(0)));
            yy = 1.345 + (((tickAnim - 143) / 6) * (1.195-(1.345)));
            zz = 0 + (((tickAnim - 143) / 6) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            yy = 1.195 + (((tickAnim - 149) / 7) * (0-(1.195)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 171) {
            xx = 0 + (((tickAnim - 156) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 15) * (0.195-(0)));
            zz = 0 + (((tickAnim - 156) / 15) * (0-(0)));
        }
        else if (tickAnim >= 171 && tickAnim < 173) {
            xx = 0 + (((tickAnim - 171) / 2) * (0-(0)));
            yy = 0.195 + (((tickAnim - 171) / 2) * (0.095-(0.195)));
            zz = 0 + (((tickAnim - 171) / 2) * (0-(0)));
        }
        else if (tickAnim >= 173 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 173) / 5) * (0-(0)));
            yy = 0.095 + (((tickAnim - 173) / 5) * (0.785-(0.095)));
            zz = 0 + (((tickAnim - 173) / 5) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 186) {
            xx = 0 + (((tickAnim - 178) / 8) * (0-(0)));
            yy = 0.785 + (((tickAnim - 178) / 8) * (0.455-(0.785)));
            zz = 0 + (((tickAnim - 178) / 8) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 186) / 7) * (0-(0)));
            yy = 0.455 + (((tickAnim - 186) / 7) * (-0.45-(0.455)));
            zz = 0 + (((tickAnim - 186) / 7) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 198) {
            xx = 0 + (((tickAnim - 193) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 193) / 5) * (0.47-(-0.45)));
            zz = 0 + (((tickAnim - 193) / 5) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 198) / 5) * (0-(0)));
            yy = 0.47 + (((tickAnim - 198) / 5) * (0-(0.47)));
            zz = 0 + (((tickAnim - 198) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 95) {
            xx = 16.75 + (((tickAnim - 80) / 15) * (12.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(16.75)));
            yy = 0 + (((tickAnim - 80) / 15) * (-3.1015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5-(0)));
            zz = 0 + (((tickAnim - 80) / 15) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 134) {
            xx = 12.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 95) / 39) * (1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3-(12.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -3.1015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 95) / 39) * (0-(-3.1015+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
            zz = 0 + (((tickAnim - 95) / 39) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 156) {
            xx = 1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3 + (((tickAnim - 134) / 22) * (0-(1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*3)));
            yy = 0 + (((tickAnim - 134) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 22) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 156) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 156) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(xx), headbase.rotateAngleY + (float) Math.toRadians(yy), headbase.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0.575-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 211) {
            xx = 0 + (((tickAnim - 80) / 131) * (0-(0)));
            yy = 0.375 + (((tickAnim - 80) / 131) * (0-(0.375)));
            zz = 0.575 + (((tickAnim - 80) / 131) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.headbase.rotationPointX = this.headbase.rotationPointX + (float)(xx);
        this.headbase.rotationPointY = this.headbase.rotationPointY - (float)(yy);
        this.headbase.rotationPointZ = this.headbase.rotationPointZ + (float)(zz);



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 10 + (((tickAnim - 38) / 5) * (10-(10)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 43) / 37) * (0-(10)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0.525-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0.525 + (((tickAnim - 38) / 5) * (0.525-(0.525)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0.525 + (((tickAnim - 43) / 37) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 8.5 + (((tickAnim - 38) / 5) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 8.5 + (((tickAnim - 43) / 37) * (0-(8.5)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (1.2-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 1.2 + (((tickAnim - 38) / 5) * (1.2-(1.2)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 1.2 + (((tickAnim - 43) / 37) * (0-(1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (43.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 43.75 + (((tickAnim - 38) / 5) * (43.75-(43.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 43.75 + (((tickAnim - 43) / 37) * (0-(43.75)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (2.95-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.95 + (((tickAnim - 38) / 5) * (2.95-(2.95)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 2.95 + (((tickAnim - 43) / 37) * (0-(2.95)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (21-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 21 + (((tickAnim - 38) / 5) * (21-(21)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 21 + (((tickAnim - 43) / 37) * (0-(21)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 23 + (((tickAnim - 38) / 5) * (23-(23)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 23 + (((tickAnim - 43) / 37) * (0-(23)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 38) / 5) * (0.55-(0.55)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0.55 + (((tickAnim - 43) / 37) * (0-(0.55)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -5.25 + (((tickAnim - 38) / 5) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -5.25 + (((tickAnim - 43) / 37) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -20.75 + (((tickAnim - 38) / 5) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = -20.75 + (((tickAnim - 43) / 37) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -5.5 + (((tickAnim - 38) / 5) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(xx), headbase.rotateAngleY + (float) Math.toRadians(yy), headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 8.25 + (((tickAnim - 38) / 5) * (0-(8.25)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -11.25 + (((tickAnim - 15) / 23) * (-30.59582-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 23) * (-3.53616-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (13.037-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -30.59582 + (((tickAnim - 38) / 5) * (-30.59582-(-30.59582)));
            yy = -3.53616 + (((tickAnim - 38) / 5) * (-3.53616-(-3.53616)));
            zz = 13.037 + (((tickAnim - 38) / 5) * (13.037-(13.037)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -30.59582 + (((tickAnim - 43) / 17) * (-24.64711-(-30.59582)));
            yy = -3.53616 + (((tickAnim - 43) / 17) * (-1.45912-(-3.53616)));
            zz = 13.037 + (((tickAnim - 43) / 17) * (9.6709-(13.037)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -24.64711 + (((tickAnim - 60) / 20) * (0-(-24.64711)));
            yy = -1.45912 + (((tickAnim - 60) / 20) * (0-(-1.45912)));
            zz = 9.6709 + (((tickAnim - 60) / 20) * (0-(9.6709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.525-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 2.525 + (((tickAnim - 15) / 12) * (3.45-(2.525)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            yy = 3.45 + (((tickAnim - 27) / 11) * (0-(3.45)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (1.05-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 1.05 + (((tickAnim - 60) / 20) * (0-(1.05)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (-22.84785-(0)));
            yy = 0 + (((tickAnim - 15) / 12) * (0.87623-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (-6.18604-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -22.84785 + (((tickAnim - 27) / 11) * (-28.63513-(-22.84785)));
            yy = 0.87623 + (((tickAnim - 27) / 11) * (1.68986-(0.87623)));
            zz = -6.18604 + (((tickAnim - 27) / 11) * (-11.93022-(-6.18604)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -28.63513 + (((tickAnim - 38) / 5) * (-28.63513-(-28.63513)));
            yy = 1.68986 + (((tickAnim - 38) / 5) * (1.68986-(1.68986)));
            zz = -11.93022 + (((tickAnim - 38) / 5) * (-11.93022-(-11.93022)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -28.63513 + (((tickAnim - 43) / 17) * (-6.27207-(-28.63513)));
            yy = 1.68986 + (((tickAnim - 43) / 17) * (0.90126-(1.68986)));
            zz = -11.93022 + (((tickAnim - 43) / 17) * (-6.36278-(-11.93022)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = -6.27207 + (((tickAnim - 60) / 11) * (-5.6247-(-6.27207)));
            yy = 0.90126 + (((tickAnim - 60) / 11) * (0.41308-(0.90126)));
            zz = -6.36278 + (((tickAnim - 60) / 11) * (-2.91628-(-6.36278)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = -5.6247 + (((tickAnim - 71) / 9) * (0-(-5.6247)));
            yy = 0.41308 + (((tickAnim - 71) / 9) * (0-(0.41308)));
            zz = -2.91628 + (((tickAnim - 71) / 9) * (0-(-2.91628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 12) * (1.035-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            yy = 1.035 + (((tickAnim - 27) / 11) * (-1.175-(1.035)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -1.175 + (((tickAnim - 38) / 5) * (-1.175-(-1.175)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = -1.175 + (((tickAnim - 43) / 17) * (0.85-(-1.175)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 0.85 + (((tickAnim - 60) / 11) * (2.24-(0.85)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            yy = 2.24 + (((tickAnim - 71) / 9) * (0-(2.24)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 2.25 + (((tickAnim - 15) / 12) * (63.08-(2.25)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 12) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 63.08 + (((tickAnim - 27) / 11) * (38.25-(63.08)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 38.25 + (((tickAnim - 38) / 5) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 38.25 + (((tickAnim - 43) / 17) * (20.95447-(38.25)));
            yy = 0 + (((tickAnim - 43) / 17) * (1.52136-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (-3.42793-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 20.95447 + (((tickAnim - 60) / 11) * (36.25-(20.95447)));
            yy = 1.52136 + (((tickAnim - 60) / 11) * (0-(1.52136)));
            zz = -3.42793 + (((tickAnim - 60) / 11) * (0-(-3.42793)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 36.25 + (((tickAnim - 71) / 9) * (0-(36.25)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (2.36-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (-0.855-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 2.36 + (((tickAnim - 21) / 6) * (4.27-(2.36)));
            zz = -0.855 + (((tickAnim - 21) / 6) * (-2.235-(-0.855)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            yy = 4.27 + (((tickAnim - 27) / 11) * (2.275-(4.27)));
            zz = -2.235 + (((tickAnim - 27) / 11) * (-0.65-(-2.235)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.275 + (((tickAnim - 38) / 5) * (2.275-(2.275)));
            zz = -0.65 + (((tickAnim - 38) / 5) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 2.275 + (((tickAnim - 43) / 17) * (0.625-(2.275)));
            zz = -0.65 + (((tickAnim - 43) / 17) * (0-(-0.65)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 0.625 + (((tickAnim - 60) / 11) * (2.365-(0.625)));
            zz = 0 + (((tickAnim - 60) / 11) * (-0.6-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            yy = 2.365 + (((tickAnim - 71) / 9) * (0-(2.365)));
            zz = -0.6 + (((tickAnim - 71) / 9) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Rtoes, Rtoes.rotateAngleX + (float) Math.toRadians(0), Rtoes.rotateAngleY + (float) Math.toRadians(0), Rtoes.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (1.57709-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.76808-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-6.51848-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 1.57709 + (((tickAnim - 8) / 7) * (-8.09582-(1.57709)));
            yy = -1.76808 + (((tickAnim - 8) / 7) * (-3.53616-(-1.76808)));
            zz = -6.51848 + (((tickAnim - 8) / 7) * (-13.03695-(-6.51848)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -8.09582 + (((tickAnim - 15) / 23) * (-30.59582-(-8.09582)));
            yy = -3.53616 + (((tickAnim - 15) / 23) * (-3.53616-(-3.53616)));
            zz = -13.03695 + (((tickAnim - 15) / 23) * (-13.03695-(-13.03695)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -30.59582 + (((tickAnim - 38) / 5) * (-30.59582-(-30.59582)));
            yy = -3.53616 + (((tickAnim - 38) / 5) * (-3.53616-(-3.53616)));
            zz = -13.03695 + (((tickAnim - 38) / 5) * (-13.03695-(-13.03695)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -30.59582 + (((tickAnim - 43) / 17) * (-17.75-(-30.59582)));
            yy = -3.53616 + (((tickAnim - 43) / 17) * (0-(-3.53616)));
            zz = -13.03695 + (((tickAnim - 43) / 17) * (0-(-13.03695)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -17.75 + (((tickAnim - 60) / 20) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.175 + (((tickAnim - 8) / 7) * (-1.525-(2.175)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = -1.525 + (((tickAnim - 15) / 23) * (-0.08-(-1.525)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -0.08 + (((tickAnim - 38) / 5) * (-0.08-(-0.08)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = -0.08 + (((tickAnim - 43) / 17) * (3.375-(-0.08)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 3.375 + (((tickAnim - 60) / 20) * (0-(3.375)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-15.72087-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.34698-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (11.16981-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -15.72087 + (((tickAnim - 8) / 7) * (-30.5785-(-15.72087)));
            yy = 2.34698 + (((tickAnim - 8) / 7) * (2.09523-(2.34698)));
            zz = 11.16981 + (((tickAnim - 8) / 7) * (14.53224-(11.16981)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -30.5785 + (((tickAnim - 15) / 23) * (-27.8635-(-30.5785)));
            yy = 2.09523 + (((tickAnim - 15) / 23) * (-0.18759-(2.09523)));
            zz = 14.53224 + (((tickAnim - 15) / 23) * (13.6097-(14.53224)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -27.8635 + (((tickAnim - 38) / 5) * (-27.8635-(-27.8635)));
            yy = -0.18759 + (((tickAnim - 38) / 5) * (-0.18759-(-0.18759)));
            zz = 13.6097 + (((tickAnim - 38) / 5) * (13.6097-(13.6097)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = -27.8635 + (((tickAnim - 43) / 9) * (-13.75643-(-27.8635)));
            yy = -0.18759 + (((tickAnim - 43) / 9) * (-0.08933-(-0.18759)));
            zz = 13.6097 + (((tickAnim - 43) / 9) * (6.48081-(13.6097)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -13.75643 + (((tickAnim - 52) / 8) * (5.75-(-13.75643)));
            yy = -0.08933 + (((tickAnim - 52) / 8) * (0-(-0.08933)));
            zz = 6.48081 + (((tickAnim - 52) / 8) * (0-(6.48081)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 5.75 + (((tickAnim - 60) / 20) * (0-(5.75)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.55-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = -1.55 + (((tickAnim - 15) / 23) * (-1.175-(-1.55)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = -1.175 + (((tickAnim - 38) / 5) * (-1.175-(-1.175)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = -1.175 + (((tickAnim - 43) / 9) * (2.225-(-1.175)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = 2.225 + (((tickAnim - 52) / 8) * (0.6-(2.225)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0.6 + (((tickAnim - 60) / 20) * (0-(0.6)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (64.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 64.75 + (((tickAnim - 8) / 7) * (32-(64.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 32 + (((tickAnim - 15) / 23) * (38.25-(32)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 38.25 + (((tickAnim - 38) / 5) * (38.25-(38.25)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 38.25 + (((tickAnim - 43) / 9) * (49.75-(38.25)));
            yy = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 9) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 49.75 + (((tickAnim - 52) / 8) * (2-(49.75)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 2 + (((tickAnim - 60) / 20) * (0-(2)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (2.29-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.47-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 2.29 + (((tickAnim - 4) / 4) * (4.3-(2.29)));
            zz = -0.47 + (((tickAnim - 4) / 4) * (-2.475-(-0.47)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 4.3 + (((tickAnim - 8) / 7) * (1.65-(4.3)));
            zz = -2.475 + (((tickAnim - 8) / 7) * (-0.475-(-2.475)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 1.65 + (((tickAnim - 15) / 23) * (2.275-(1.65)));
            zz = -0.475 + (((tickAnim - 15) / 23) * (-0.65-(-0.475)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 2.275 + (((tickAnim - 38) / 5) * (2.275-(2.275)));
            zz = -0.65 + (((tickAnim - 38) / 5) * (-0.65-(-0.65)));
        }
        else if (tickAnim >= 43 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 43) / 9) * (0-(0)));
            yy = 2.275 + (((tickAnim - 43) / 9) * (3.4-(2.275)));
            zz = -0.65 + (((tickAnim - 43) / 9) * (-0.775-(-0.65)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = 3.4 + (((tickAnim - 52) / 8) * (0-(3.4)));
            zz = -0.775 + (((tickAnim - 52) / 8) * (0-(-0.775)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);



        this.setRotateAngle(Rtoes2, Rtoes2.rotateAngleX + (float) Math.toRadians(0), Rtoes2.rotateAngleY + (float) Math.toRadians(0), Rtoes2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 0) / 40) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (-2.5-(-2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*2 + (((tickAnim - 40) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*2)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = -0.35 + (((tickAnim - 0) / 40) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 40) * (0-(0)));
            zz = -0.35 + (((tickAnim - 40) / 40) * (-0.35-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (0-(-2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*2 + (((tickAnim - 40) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*2)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (0-(-2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*2 + (((tickAnim - 40) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*2)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (0-(-2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*2 + (((tickAnim - 40) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-30))*2)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*4-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 80) {
            xx = -2.5 + (((tickAnim - 40) / 40) * (0-(-2.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*4 + (((tickAnim - 40) / 40) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-80))*4)));
            zz = 0 + (((tickAnim - 40) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.5 + (((tickAnim - 6) / 7) * (-1-(0.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1 + (((tickAnim - 13) / 7) * (0-(-1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(xx), mainbody.rotateAngleY + (float) Math.toRadians(yy), mainbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.4394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.9752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.4394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*2 + (((tickAnim - 5) / 8) * (-1.0052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*1-(0.4394+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*2)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = -0.9752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.5 + (((tickAnim - 5) / 8) * (2.9252-(-0.9752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.0052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*1 + (((tickAnim - 13) / 7) * (0-(-1.0052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*1)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 2.9252 + (((tickAnim - 13) / 7) * (0-(2.9252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.81594-(0)));
            zz = 1.9392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.0-25))*2 + (((tickAnim - 0) / 10) * (-0.992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(1.9392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.0-25))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 10) / 4) * (4.5496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = -0.81594 + (((tickAnim - 10) / 4) * (-0.675-(-0.81594)));
            zz = -0.992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 10) / 4) * (1.3831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560/0.7-15))*-0.5-(-0.992+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 4.5496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 14) / 6) * (0-(4.5496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = -0.675 + (((tickAnim - 14) / 6) * (0-(-0.675)));
            zz = 1.3831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560/0.7-15))*-0.5 + (((tickAnim - 14) / 6) * (0-(1.3831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*560/0.7-15))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.9004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.82233-(0)));
            zz = 1.9392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.0-25))*2 + (((tickAnim - 0) / 10) * (2.40813-(1.9392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.0-25))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -6.9004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8 + (((tickAnim - 10) / 3) * (-6.9004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8-(-6.9004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8)));
            yy = -1.82233 + (((tickAnim - 10) / 3) * (-1.82233-(-1.82233)));
            zz = 2.40813 + (((tickAnim - 10) / 3) * (1.2831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*680/0.6-15))*-1-(2.40813)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -6.9004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8 + (((tickAnim - 13) / 7) * (0-(-6.9004+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*8)));
            yy = -1.82233 + (((tickAnim - 13) / 7) * (0-(-1.82233)));
            zz = 1.2831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*680/0.6-15))*-1 + (((tickAnim - 13) / 7) * (0-(1.2831+Math.sin((Math.PI/180)*(((double)tickAnim/20)*680/0.6-15))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.7504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.32101-(0)));
            zz = 1.9392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.0-25))*2 + (((tickAnim - 0) / 10) * (-3.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3-(1.9392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.0-25))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -4.7504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 10) / 4) * (-4.7504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(-4.7504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 3.32101 + (((tickAnim - 10) / 4) * (2.57101-(3.32101)));
            zz = -3.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3 + (((tickAnim - 10) / 4) * (-1.4669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.0-15))*2-(-3.611+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -4.7504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 14) / 6) * (0-(-4.7504+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 2.57101 + (((tickAnim - 14) / 6) * (0-(2.57101)));
            zz = -1.4669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.0-15))*2 + (((tickAnim - 14) / 6) * (0-(-1.4669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.0-15))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.37121-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.06416-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 10) / 2) * (4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 5.37121 + (((tickAnim - 10) / 2) * (4.59621-(5.37121)));
            zz = 3.06416 + (((tickAnim - 10) / 2) * (3.6392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.6-25))*0.5-(3.06416)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 12) / 8) * (0-(4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 4.59621 + (((tickAnim - 12) / 8) * (0-(4.59621)));
            zz = 3.6392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.6-25))*0.5 + (((tickAnim - 12) / 8) * (0-(3.6392+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.6-25))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.14753-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (3.03364-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 10) / 10) * (0-(4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 2.14753 + (((tickAnim - 10) / 10) * (0-(2.14753)));
            zz = 3.03364 + (((tickAnim - 10) / 10) * (0-(3.03364)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 10) / 10) * (0-(4.3496+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(xx), headbase.rotateAngleY + (float) Math.toRadians(yy), headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.86305-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.46952-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.41039-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.86305 + (((tickAnim - 5) / 8) * (-3.52667-(-4.86305)));
            yy = -0.46952 + (((tickAnim - 5) / 8) * (0.98655-(-0.46952)));
            zz = 2.41039 + (((tickAnim - 5) / 8) * (-3.0968-(2.41039)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.52667 + (((tickAnim - 13) / 7) * (0-(-3.52667)));
            yy = 0.98655 + (((tickAnim - 13) / 7) * (0-(0.98655)));
            zz = -3.0968 + (((tickAnim - 13) / 7) * (0-(-3.0968)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.5 + (((tickAnim - 6) / 7) * (3.25-(1.5)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 3.25 + (((tickAnim - 13) / 7) * (0-(3.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.94-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.94 + (((tickAnim - 6) / 7) * (-0.125-(0.94)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 13) / 7) * (0-(-0.125)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.0106+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-4.71624-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.9752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.0106+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*8 + (((tickAnim - 5) / 8) * (-19.862+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*3-(-4.0106+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.3))*8)));
            yy = -4.71624 + (((tickAnim - 5) / 8) * (11.93287-(-4.71624)));
            zz = -0.9752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 5) / 8) * (1.9331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*460/0.5-15))*2-(-0.9752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -19.862+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*3 + (((tickAnim - 13) / 7) * (0-(-19.862+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*3)));
            yy = 11.93287 + (((tickAnim - 13) / 7) * (0-(11.93287)));
            zz = 1.9331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*460/0.5-15))*2 + (((tickAnim - 13) / 7) * (0-(1.9331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*460/0.5-15))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 5) / 8) * (-26.30308-(-4.5)));
            yy = -3.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 5) / 8) * (-3.63381-(-3.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
            zz = 0.3 + (((tickAnim - 5) / 8) * (1.67308-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -26.30308 + (((tickAnim - 13) / 7) * (0-(-26.30308)));
            yy = -3.63381 + (((tickAnim - 13) / 7) * (0-(-3.63381)));
            zz = 1.67308 + (((tickAnim - 13) / 7) * (0-(1.67308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(0);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(0);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (32-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 32 + (((tickAnim - 5) / 8) * (-0.25-(32)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0.3 + (((tickAnim - 5) / 8) * (0-(0.3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 13) / 7) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 2.15 + (((tickAnim - 5) / 15) * (0-(2.15)));
            zz = -0.025 + (((tickAnim - 5) / 15) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-13.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = -13.2 + (((tickAnim - 5) / 8) * (0-(-13.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rclaw2, Rclaw2.rotateAngleX + (float) Math.toRadians(xx), Rclaw2.rotateAngleY + (float) Math.toRadians(yy), Rclaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 21.75 + (((tickAnim - 5) / 8) * (0-(21.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0.3 + (((tickAnim - 5) / 8) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rtoes2, Rtoes2.rotateAngleX + (float) Math.toRadians(xx), Rtoes2.rotateAngleY + (float) Math.toRadians(yy), Rtoes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-0.175-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.425-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -0.175 + (((tickAnim - 5) / 8) * (0-(-0.175)));
            yy = -0.725 + (((tickAnim - 5) / 8) * (0-(-0.725)));
            zz = 0.425 + (((tickAnim - 5) / 8) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rtoes2.rotationPointX = this.Rtoes2.rotationPointX + (float)(xx);
        this.Rtoes2.rotationPointY = this.Rtoes2.rotationPointY - (float)(yy);
        this.Rtoes2.rotationPointZ = this.Rtoes2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 2 + (((tickAnim - 6) / 8) * (0-(2)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 6) / 8) * (0-(1)));
            yy = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.25 + (((tickAnim - 6) / 1) * (3.65-(2.25)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620/0.5-20))*1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 3.65 + (((tickAnim - 7) / 7) * (0-(3.65)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620/0.5-20))*1 + (((tickAnim - 7) / 7) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*620/0.5-20))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.725-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 2.725 + (((tickAnim - 6) / 2) * (3.91-(2.725)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-40))*2-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 3.91 + (((tickAnim - 8) / 6) * (0-(3.91)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-40))*2 + (((tickAnim - 8) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.5-40))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (2.325-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 2.325 + (((tickAnim - 6) / 2) * (6.22-(2.325)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.5-60))*3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 6.22 + (((tickAnim - 8) / 6) * (0-(6.22)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.5-60))*3 + (((tickAnim - 8) / 6) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*820/0.5-60))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (2.25-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 13) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (2.25-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 13) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.25 + (((tickAnim - 13) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.6 + (((tickAnim - 13) / 7) * (0-(-0.6)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.75 + (((tickAnim - 20) / 10) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 30) / 20) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(xx), mainbody.rotateAngleY + (float) Math.toRadians(yy), mainbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.575-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -8.575 + (((tickAnim - 20) / 10) * (-8.575-(-8.575)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8.575 + (((tickAnim - 30) / 20) * (0-(-8.575)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.mainbody.rotationPointX = this.mainbody.rotationPointX + (float)(xx);
        this.mainbody.rotationPointY = this.mainbody.rotationPointY - (float)(yy);
        this.mainbody.rotationPointZ = this.mainbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19 + (((tickAnim - 20) / 10) * (19-(19)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 19 + (((tickAnim - 30) / 20) * (0-(19)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (15.78927-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.49765-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.50234-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 15.78927 + (((tickAnim - 20) / 10) * (15.78927-(15.78927)));
            yy = -1.49765 + (((tickAnim - 20) / 10) * (-1.49765-(-1.49765)));
            zz = -1.50234 + (((tickAnim - 20) / 10) * (-1.50234-(-1.50234)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 15.78927 + (((tickAnim - 30) / 20) * (0-(15.78927)));
            yy = -1.49765 + (((tickAnim - 30) / 20) * (0-(-1.49765)));
            zz = -1.50234 + (((tickAnim - 30) / 20) * (0-(-1.50234)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.1814-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.58454-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.74936-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.1814 + (((tickAnim - 20) / 10) * (13.1814-(13.1814)));
            yy = -5.58454 + (((tickAnim - 20) / 10) * (-5.58454-(-5.58454)));
            zz = -1.74936 + (((tickAnim - 20) / 10) * (-1.74936-(-1.74936)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.1814 + (((tickAnim - 30) / 20) * (0-(13.1814)));
            yy = -5.58454 + (((tickAnim - 30) / 20) * (0-(-5.58454)));
            zz = -1.74936 + (((tickAnim - 30) / 20) * (0-(-1.74936)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (3.98534-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.76584-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.46632-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.98534 + (((tickAnim - 20) / 10) * (3.98534-(3.98534)));
            yy = -7.76584 + (((tickAnim - 20) / 10) * (-7.76584-(-7.76584)));
            zz = -3.46632 + (((tickAnim - 20) / 10) * (-3.46632-(-3.46632)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 3.98534 + (((tickAnim - 30) / 20) * (0-(3.98534)));
            yy = -7.76584 + (((tickAnim - 30) / 20) * (0-(-7.76584)));
            zz = -3.46632 + (((tickAnim - 30) / 20) * (0-(-3.46632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-19.12732-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5.41141-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-2.59552-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -19.12732 + (((tickAnim - 20) / 10) * (-19.12732-(-19.12732)));
            yy = -5.41141 + (((tickAnim - 20) / 10) * (-5.41141-(-5.41141)));
            zz = -2.59552 + (((tickAnim - 20) / 10) * (-2.59552-(-2.59552)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -19.12732 + (((tickAnim - 30) / 20) * (0-(-19.12732)));
            yy = -5.41141 + (((tickAnim - 30) / 20) * (0-(-5.41141)));
            zz = -2.59552 + (((tickAnim - 30) / 20) * (0-(-2.59552)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.5364-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.85092-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (13.91731-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25.5364 + (((tickAnim - 20) / 10) * (25.5364-(25.5364)));
            yy = -3.85092 + (((tickAnim - 20) / 10) * (-3.85092-(-3.85092)));
            zz = 13.91731 + (((tickAnim - 20) / 10) * (13.91731-(13.91731)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 25.5364 + (((tickAnim - 30) / 20) * (0-(25.5364)));
            yy = -3.85092 + (((tickAnim - 30) / 20) * (0-(-3.85092)));
            zz = 13.91731 + (((tickAnim - 30) / 20) * (0-(13.91731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.62633-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.07276-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-15.58687-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.62633 + (((tickAnim - 20) / 10) * (-30.62633-(-30.62633)));
            yy = -1.07276 + (((tickAnim - 20) / 10) * (-1.07276-(-1.07276)));
            zz = -15.58687 + (((tickAnim - 20) / 10) * (-15.58687-(-15.58687)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.62633 + (((tickAnim - 30) / 20) * (0-(-30.62633)));
            yy = -1.07276 + (((tickAnim - 30) / 20) * (0-(-1.07276)));
            zz = -15.58687 + (((tickAnim - 30) / 20) * (0-(-15.58687)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 20) / 10) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 30) / 20) * (0-(9.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.45 + (((tickAnim - 20) / 10) * (1.45-(1.45)));
            zz = -0.25 + (((tickAnim - 20) / 10) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.45 + (((tickAnim - 30) / 20) * (0-(1.45)));
            zz = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (25.5364-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.8509-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-13.9173-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25.5364 + (((tickAnim - 20) / 10) * (25.5364-(25.5364)));
            yy = 3.8509 + (((tickAnim - 20) / 10) * (3.8509-(3.8509)));
            zz = -13.9173 + (((tickAnim - 20) / 10) * (-13.9173-(-13.9173)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 25.5364 + (((tickAnim - 30) / 20) * (0-(25.5364)));
            yy = 3.8509 + (((tickAnim - 30) / 20) * (0-(3.8509)));
            zz = -13.9173 + (((tickAnim - 30) / 20) * (0-(-13.9173)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-30.62633-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.0728-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (15.5869-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -30.62633 + (((tickAnim - 20) / 10) * (-30.62633-(-30.62633)));
            yy = 1.0728 + (((tickAnim - 20) / 10) * (1.0728-(1.0728)));
            zz = 15.5869 + (((tickAnim - 20) / 10) * (15.5869-(15.5869)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -30.62633 + (((tickAnim - 30) / 20) * (0-(-30.62633)));
            yy = 1.0728 + (((tickAnim - 30) / 20) * (0-(1.0728)));
            zz = 15.5869 + (((tickAnim - 30) / 20) * (0-(15.5869)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 20) / 10) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 30) / 20) * (0-(9.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 1.45 + (((tickAnim - 20) / 10) * (1.45-(1.45)));
            zz = -0.25 + (((tickAnim - 20) / 10) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 1.45 + (((tickAnim - 30) / 20) * (0-(1.45)));
            zz = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -14.5 + (((tickAnim - 20) / 10) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 30) / 20) * (0-(-14.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-1.825-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.475 + (((tickAnim - 20) / 10) * (0.475-(0.475)));
            zz = -1.825 + (((tickAnim - 20) / 10) * (-1.825-(-1.825)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.475 + (((tickAnim - 30) / 20) * (0-(0.475)));
            zz = -1.825 + (((tickAnim - 30) / 20) * (0-(-1.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10.03612-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (7.22753-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.57186-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10.03612 + (((tickAnim - 20) / 10) * (-10.03612-(-10.03612)));
            yy = 7.22753 + (((tickAnim - 20) / 10) * (7.22753-(7.22753)));
            zz = -0.57186 + (((tickAnim - 20) / 10) * (-0.57186-(-0.57186)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -10.03612 + (((tickAnim - 30) / 20) * (0-(-10.03612)));
            yy = 7.22753 + (((tickAnim - 30) / 20) * (0-(7.22753)));
            zz = -0.57186 + (((tickAnim - 30) / 20) * (0-(-0.57186)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.4802-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (7.24328-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.31285-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.4802 + (((tickAnim - 20) / 10) * (6.4802-(6.4802)));
            yy = 7.24328 + (((tickAnim - 20) / 10) * (7.24328-(7.24328)));
            zz = -0.31285 + (((tickAnim - 20) / 10) * (-0.31285-(-0.31285)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 6.4802 + (((tickAnim - 30) / 8) * (-8.96988-(6.4802)));
            yy = 7.24328 + (((tickAnim - 30) / 8) * (4.22525-(7.24328)));
            zz = -0.31285 + (((tickAnim - 30) / 8) * (-0.1825-(-0.31285)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8.96988 + (((tickAnim - 38) / 12) * (0-(-8.96988)));
            yy = 4.22525 + (((tickAnim - 38) / 12) * (0-(4.22525)));
            zz = -0.1825 + (((tickAnim - 38) / 12) * (0-(-0.1825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (16.66219-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (4.06359-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (7.88571-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 16.66219 + (((tickAnim - 16) / 4) * (25.36829-(16.66219)));
            yy = 4.06359 + (((tickAnim - 16) / 4) * (6.09539-(4.06359)));
            zz = 7.88571 + (((tickAnim - 16) / 4) * (11.82857-(7.88571)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25.36829 + (((tickAnim - 20) / 10) * (25.36829-(25.36829)));
            yy = 6.09539 + (((tickAnim - 20) / 10) * (6.09539-(6.09539)));
            zz = 11.82857 + (((tickAnim - 20) / 10) * (11.82857-(11.82857)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 25.36829 + (((tickAnim - 30) / 8) * (7.04817-(25.36829)));
            yy = 6.09539 + (((tickAnim - 30) / 8) * (3.55564-(6.09539)));
            zz = 11.82857 + (((tickAnim - 30) / 8) * (6.9-(11.82857)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7.04817 + (((tickAnim - 38) / 12) * (0-(7.04817)));
            yy = 3.55564 + (((tickAnim - 38) / 12) * (0-(3.55564)));
            zz = 6.9 + (((tickAnim - 38) / 12) * (0-(6.9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (15.58059-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (7.16661-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.02911-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 15.58059 + (((tickAnim - 16) / 4) * (4.24589-(15.58059)));
            yy = 7.16661 + (((tickAnim - 16) / 4) * (10.74991-(7.16661)));
            zz = -0.02911 + (((tickAnim - 16) / 4) * (-0.04367-(-0.02911)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 4.24589 + (((tickAnim - 20) / 10) * (4.24589-(4.24589)));
            yy = 10.74991 + (((tickAnim - 20) / 10) * (10.74991-(10.74991)));
            zz = -0.04367 + (((tickAnim - 20) / 10) * (-0.04367-(-0.04367)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 4.24589 + (((tickAnim - 30) / 8) * (25.22677-(4.24589)));
            yy = 10.74991 + (((tickAnim - 30) / 8) * (6.27078-(10.74991)));
            zz = -0.04367 + (((tickAnim - 30) / 8) * (-0.02547-(-0.04367)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 25.22677 + (((tickAnim - 38) / 5) * (-3.49198-(25.22677)));
            yy = 6.27078 + (((tickAnim - 38) / 5) * (6.0522-(6.27078)));
            zz = -0.02547 + (((tickAnim - 38) / 5) * (-0.02458-(-0.02547)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -3.49198 + (((tickAnim - 43) / 7) * (0-(-3.49198)));
            yy = 6.0522 + (((tickAnim - 43) / 7) * (0-(6.0522)));
            zz = -0.02458 + (((tickAnim - 43) / 7) * (0-(-0.02458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.0924-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (11.0612-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.8425-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.0924 + (((tickAnim - 20) / 10) * (-15.0924-(-15.0924)));
            yy = 11.0612 + (((tickAnim - 20) / 10) * (11.0612-(11.0612)));
            zz = 0.8425 + (((tickAnim - 20) / 10) * (0.8425-(0.8425)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.0924 + (((tickAnim - 30) / 20) * (0-(-15.0924)));
            yy = 11.0612 + (((tickAnim - 30) / 20) * (0-(11.0612)));
            zz = 0.8425 + (((tickAnim - 30) / 20) * (0-(0.8425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 38 + (((tickAnim - 20) / 10) * (38-(38)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 30) / 20) * (0-(38)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 30) / 20) * (0-(0.3)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.75 + (((tickAnim - 20) / 10) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 30) / 20) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.45 + (((tickAnim - 20) / 10) * (2.45-(2.45)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.45 + (((tickAnim - 30) / 20) * (0-(2.45)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-15.0924-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-11.06124-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.84252-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -15.0924 + (((tickAnim - 20) / 10) * (-15.0924-(-15.0924)));
            yy = -11.06124 + (((tickAnim - 20) / 10) * (-11.06124-(-11.06124)));
            zz = -0.84252 + (((tickAnim - 20) / 10) * (-0.84252-(-0.84252)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -15.0924 + (((tickAnim - 30) / 20) * (0-(-15.0924)));
            yy = -11.06124 + (((tickAnim - 30) / 20) * (0-(-11.06124)));
            zz = -0.84252 + (((tickAnim - 30) / 20) * (0-(-0.84252)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (38-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 38 + (((tickAnim - 20) / 10) * (38-(38)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 38 + (((tickAnim - 30) / 20) * (0-(38)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.3 + (((tickAnim - 20) / 10) * (0.3-(0.3)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 30) / 20) * (0-(0.3)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16.75 + (((tickAnim - 20) / 10) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 30) / 20) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.45-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.45 + (((tickAnim - 20) / 10) * (2.45-(2.45)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.45 + (((tickAnim - 30) / 20) * (0-(2.45)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10 + (((tickAnim - 24) / 26) * (0-(9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10 + (((tickAnim - 24) / 26) * (0-(9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10 + (((tickAnim - 24) / 26) * (0-(9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-100))*10)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-150))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-150))*10 + (((tickAnim - 24) / 26) * (0-(9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-150))*10)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-180))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-180))*10 + (((tickAnim - 24) / 26) * (0-(9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-180))*10)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-200))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-200))*10 + (((tickAnim - 24) / 26) * (0-(9.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10-200))*10)));
            zz = 0 + (((tickAnim - 24) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 17.25 + (((tickAnim - 25) / 17) * (-8.18303-(17.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (-4.76566-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (1.51451-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -8.18303 + (((tickAnim - 42) / 8) * (0-(-8.18303)));
            yy = -4.76566 + (((tickAnim - 42) / 8) * (0-(-4.76566)));
            zz = 1.51451 + (((tickAnim - 42) / 8) * (0-(1.51451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 17.25 + (((tickAnim - 25) / 17) * (24.13-(17.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 24.13 + (((tickAnim - 42) / 8) * (0-(24.13)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 17) * (2-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 2 + (((tickAnim - 42) / 8) * (0-(2)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 11.25 + (((tickAnim - 25) / 17) * (27.13-(11.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 27.13 + (((tickAnim - 42) / 8) * (0-(27.13)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 2.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5 + (((tickAnim - 15) / 15) * (-2.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(2.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 30) / 20) * (0-(-2.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 15) / 15) * (7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-8-(-0.575+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-8 + (((tickAnim - 30) / 20) * (0-(7.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-8)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.67548-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.07423-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.74632-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5.67548 + (((tickAnim - 15) / 15) * (8.25048-(5.67548)));
            yy = -0.07423 + (((tickAnim - 15) / 15) * (-0.07423-(-0.07423)));
            zz = -0.74632 + (((tickAnim - 15) / 15) * (-0.74632-(-0.74632)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 8.25048 + (((tickAnim - 30) / 20) * (0-(8.25048)));
            yy = -0.07423 + (((tickAnim - 30) / 20) * (0-(-0.07423)));
            zz = -0.74632 + (((tickAnim - 30) / 20) * (0-(-0.74632)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.0924-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.75358-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.64481-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -7.0924 + (((tickAnim - 15) / 15) * (-5.0174-(-7.0924)));
            yy = 0.75358 + (((tickAnim - 15) / 15) * (0.75358-(0.75358)));
            zz = -2.64481 + (((tickAnim - 15) / 15) * (-2.64481-(-2.64481)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.0174 + (((tickAnim - 30) / 20) * (0-(-5.0174)));
            yy = 0.75358 + (((tickAnim - 30) / 20) * (0-(0.75358)));
            zz = -2.64481 + (((tickAnim - 30) / 20) * (0-(-2.64481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 15) / 15) * (-3.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -3.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 30) / 20) * (0-(-3.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.82558-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.08906-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.74469-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -11.82558 + (((tickAnim - 15) / 15) * (-7.25058-(-11.82558)));
            yy = 0.08906 + (((tickAnim - 15) / 15) * (0.08906-(0.08906)));
            zz = -0.74469 + (((tickAnim - 15) / 15) * (-0.74469-(-0.74469)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.25058 + (((tickAnim - 30) / 20) * (0-(-7.25058)));
            yy = 0.08906 + (((tickAnim - 30) / 20) * (0-(0.08906)));
            zz = -0.74469 + (((tickAnim - 30) / 20) * (0-(-0.74469)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(xx), headbase.rotateAngleY + (float) Math.toRadians(yy), headbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*9 + (((tickAnim - 15) / 35) * (0-(8.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*190))*9)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 290;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -9.5 + (((tickAnim - 245) / 8) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = -9.5 + (((tickAnim - 253) / 37) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(xx), mainbody.rotateAngleY + (float) Math.toRadians(yy), mainbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 208) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (-8.075-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = -8.075 + (((tickAnim - 245) / 8) * (-8.075-(-8.075)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = -8.075 + (((tickAnim - 253) / 37) * (0-(-8.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.mainbody.rotationPointX = this.mainbody.rotationPointX + (float)(xx);
        this.mainbody.rotationPointY = this.mainbody.rotationPointY - (float)(yy);
        this.mainbody.rotationPointZ = this.mainbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 208) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (7-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 7 + (((tickAnim - 245) / 8) * (7-(7)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 7 + (((tickAnim - 253) / 37) * (0-(7)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));

        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 208) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (4-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 4 + (((tickAnim - 245) / 8) * (4-(4)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 4 + (((tickAnim - 253) / 37) * (0-(4)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 245) * (0.575-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0.575 + (((tickAnim - 245) / 8) * (0.575-(0.575)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0.575 + (((tickAnim - 253) / 37) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 74) / 33) * (8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
            yy = 0 + (((tickAnim - 74) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 33) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 124) {
            xx = 8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 107) / 17) * (11.25-(8.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 107) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 17) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 144) {
            xx = 11.25 + (((tickAnim - 124) / 20) * (5.25-(11.25)));
            yy = 0 + (((tickAnim - 124) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 20) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 208) {
            xx = 5.25 + (((tickAnim - 144) / 64) * (0-(5.25)));
            yy = 0 + (((tickAnim - 144) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 64) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (2.25-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 2.25 + (((tickAnim - 245) / 8) * (2.25-(2.25)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 2.25 + (((tickAnim - 253) / 14) * (1.88-(2.25)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 290) {
            xx = 1.88 + (((tickAnim - 267) / 23) * (0-(1.88)));
            yy = 0 + (((tickAnim - 267) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 208) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (-0.35-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = -0.35 + (((tickAnim - 245) / 8) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = -0.35 + (((tickAnim - 253) / 37) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 74) / 33) * (2.25-(0)));
            yy = 0 + (((tickAnim - 74) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 33) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 124) {
            xx = 2.25 + (((tickAnim - 107) / 17) * (1.25-(2.25)));
            yy = 0 + (((tickAnim - 107) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 17) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 144) {
            xx = 1.25 + (((tickAnim - 124) / 20) * (-0.5-(1.25)));
            yy = 0 + (((tickAnim - 124) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 20) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 208) {
            xx = -0.5 + (((tickAnim - 144) / 64) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 144) / 64) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 64) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0.5-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0.5 + (((tickAnim - 245) / 8) * (0.5-(0.5)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 0.5 + (((tickAnim - 253) / 14) * (4.835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0.5)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 279) {
            xx = 4.835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 267) / 12) * (-3.495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5-(4.835+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 267) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 12) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 290) {
            xx = -3.495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5 + (((tickAnim - 279) / 11) * (0-(-3.495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-5)));
            yy = 0 + (((tickAnim - 279) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 0) / 253) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 253) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 253) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 267) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 23) * (0-(0)));
            zz = 0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50)) + (((tickAnim - 267) / 23) * (0-(0.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 107) {
            xx = -3.25 + (((tickAnim - 74) / 33) * (8.76366-(-3.25)));
            yy = 0 + (((tickAnim - 74) / 33) * (-0.52999-(0)));
            zz = 0 + (((tickAnim - 74) / 33) * (-2.95286-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 124) {
            xx = 8.76366 + (((tickAnim - 107) / 17) * (10.51366-(8.76366)));
            yy = -0.52999 + (((tickAnim - 107) / 17) * (-0.52999-(-0.52999)));
            zz = -2.95286 + (((tickAnim - 107) / 17) * (-2.95286-(-2.95286)));
        }
        else if (tickAnim >= 124 && tickAnim < 144) {
            xx = 10.51366 + (((tickAnim - 124) / 20) * (19.01366-(10.51366)));
            yy = -0.52999 + (((tickAnim - 124) / 20) * (-0.52999-(-0.52999)));
            zz = -2.95286 + (((tickAnim - 124) / 20) * (-2.95286-(-2.95286)));
        }
        else if (tickAnim >= 144 && tickAnim < 163) {
            xx = 19.01366 + (((tickAnim - 144) / 19) * (10.1442-(19.01366)));
            yy = -0.52999 + (((tickAnim - 144) / 19) * (-0.20611-(-0.52999)));
            zz = -2.95286 + (((tickAnim - 144) / 19) * (-1.14833-(-2.95286)));
        }
        else if (tickAnim >= 163 && tickAnim < 208) {
            xx = 10.1442 + (((tickAnim - 163) / 45) * (0-(10.1442)));
            yy = -0.20611 + (((tickAnim - 163) / 45) * (0-(-0.20611)));
            zz = -1.14833 + (((tickAnim - 163) / 45) * (0-(-1.14833)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (9.25-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 9.25 + (((tickAnim - 245) / 8) * (10-(9.25)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 10 + (((tickAnim - 253) / 14) * (10.24-(10)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 279) {
            xx = 10.24 + (((tickAnim - 267) / 12) * (-2.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-8-(10.24)));
            yy = 0 + (((tickAnim - 267) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 12) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 290) {
            xx = -2.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-8 + (((tickAnim - 279) / 11) * (0-(-2.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-8)));
            yy = 0 + (((tickAnim - 279) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 0) / 253) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 253) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 253) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (-0.65-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 267) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 267) / 23) * (0-(0)));
            zz = -0.65 + (((tickAnim - 267) / 23) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 108) {
            xx = 5.25 + (((tickAnim - 74) / 34) * (-7.00763-(5.25)));
            yy = 0 + (((tickAnim - 74) / 34) * (0.52354-(0)));
            zz = 0 + (((tickAnim - 74) / 34) * (-1.66988-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 124) {
            xx = -7.00763 + (((tickAnim - 108) / 16) * (-6.00763-(-7.00763)));
            yy = 0.52354 + (((tickAnim - 108) / 16) * (0.52354-(0.52354)));
            zz = -1.66988 + (((tickAnim - 108) / 16) * (-1.66988-(-1.66988)));
        }
        else if (tickAnim >= 124 && tickAnim < 144) {
            xx = -6.00763 + (((tickAnim - 124) / 20) * (-0.75763-(-6.00763)));
            yy = 0.52354 + (((tickAnim - 124) / 20) * (0.52354-(0.52354)));
            zz = -1.66988 + (((tickAnim - 124) / 20) * (-1.66988-(-1.66988)));
        }
        else if (tickAnim >= 144 && tickAnim < 163) {
            xx = -0.75763 + (((tickAnim - 144) / 19) * (-1.3709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-0.75763)));
            yy = 0.52354 + (((tickAnim - 144) / 19) * (0.29085-(0.52354)));
            zz = -1.66988 + (((tickAnim - 144) / 19) * (-0.92771-(-1.66988)));
        }
        else if (tickAnim >= 163 && tickAnim < 178) {
            xx = -1.3709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 163) / 15) * (0-(-1.3709+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = 0.29085 + (((tickAnim - 163) / 15) * (0-(0.29085)));
            zz = -0.92771 + (((tickAnim - 163) / 15) * (0-(-0.92771)));
        }
        else if (tickAnim >= 178 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 178) / 30) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 178) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 30) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = -6.75 + (((tickAnim - 208) / 37) * (-20.25-(-6.75)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -20.25 + (((tickAnim - 245) / 8) * (-19.75-(-20.25)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = -19.75 + (((tickAnim - 253) / 14) * (-18.05-(-19.75)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 279) {
            xx = -18.05 + (((tickAnim - 267) / 12) * (-6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*8-(-18.05)));
            yy = 0 + (((tickAnim - 267) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 12) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 290) {
            xx = -6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*8 + (((tickAnim - 279) / 11) * (0-(-6.875+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*8)));
            yy = 0 + (((tickAnim - 279) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 107) {
            xx = -14.25 + (((tickAnim - 74) / 33) * (-37.25-(-14.25)));
            yy = 0 + (((tickAnim - 74) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 33) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 124) {
            xx = -37.25 + (((tickAnim - 107) / 17) * (-34.25-(-37.25)));
            yy = 0 + (((tickAnim - 107) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 17) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 144) {
            xx = -34.25 + (((tickAnim - 124) / 20) * (-33.5-(-34.25)));
            yy = 0 + (((tickAnim - 124) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 20) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 158) {
            xx = -33.5 + (((tickAnim - 144) / 14) * (-12.935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-8-(-33.5)));
            yy = 0 + (((tickAnim - 144) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 14) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 178) {
            xx = -12.935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-8 + (((tickAnim - 158) / 20) * (0-(-12.935+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-8)));
            yy = 0 + (((tickAnim - 158) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 20) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 178) / 30) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 178) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 30) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = -12.75 + (((tickAnim - 208) / 37) * (-37.25-(-12.75)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -37.25 + (((tickAnim - 245) / 8) * (-34.75-(-37.25)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = -34.75 + (((tickAnim - 253) / 14) * (-43.16-(-34.75)));
            yy = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 279) {
            xx = -43.16 + (((tickAnim - 267) / 12) * (-24.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10-(-43.16)));
            yy = 0 + (((tickAnim - 267) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 267) / 12) * (0-(0)));
        }
        else if (tickAnim >= 279 && tickAnim < 290) {
            xx = -24.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 279) / 11) * (0-(-24.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
            yy = 0 + (((tickAnim - 279) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 279) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(xx), neckend.rotateAngleY + (float) Math.toRadians(yy), neckend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 144) {
            xx = 0 + (((tickAnim - 0) / 144) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 144) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 144) * (0-(0)));
        }
        else if (tickAnim >= 144 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 144) / 19) * (7.5-(0)));
            yy = 0 + (((tickAnim - 144) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 144) / 19) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 178) {
            xx = 7.5 + (((tickAnim - 163) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 163) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(xx), headbase.rotateAngleY + (float) Math.toRadians(yy), headbase.rotateAngleZ + (float) Math.toRadians(zz));

        this.headbase.rotationPointX = this.headbase.rotationPointX + (float)(0);
        this.headbase.rotationPointY = this.headbase.rotationPointY - (float)(0);
        this.headbase.rotationPointZ = this.headbase.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 107) {
            xx = 0 + (((tickAnim - 75) / 32) * (14-(0)));
            yy = 0 + (((tickAnim - 75) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 32) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 124) {
            xx = 14 + (((tickAnim - 107) / 17) * (0-(14)));
            yy = 0 + (((tickAnim - 107) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 17) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 124) / 84) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 84) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 84) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (14-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 14 + (((tickAnim - 245) / 8) * (0-(14)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (-17-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -17 + (((tickAnim - 245) / 8) * (-17-(-17)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 273) {
            xx = -17 + (((tickAnim - 253) / 20) * (-25.21-(-17)));
            yy = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 20) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 281) {
            xx = -25.21 + (((tickAnim - 273) / 8) * (-2.05-(-25.21)));
            yy = 0 + (((tickAnim - 273) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 8) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = -2.05 + (((tickAnim - 281) / 9) * (0-(-2.05)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 208 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 208) / 20) * (-25.53-(0)));
            yy = 0 + (((tickAnim - 208) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 20) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = -25.53 + (((tickAnim - 228) / 17) * (9.75-(-25.53)));
            yy = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 17) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 9.75 + (((tickAnim - 245) / 8) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 273) {
            xx = 9.75 + (((tickAnim - 253) / 20) * (12.5-(9.75)));
            yy = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 20) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 281) {
            xx = 12.5 + (((tickAnim - 273) / 8) * (-8.64-(12.5)));
            yy = 0 + (((tickAnim - 273) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 8) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = -8.64 + (((tickAnim - 281) / 9) * (0-(-8.64)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 208) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 208) / 73) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 73) * (0.975-(0)));
            zz = 0 + (((tickAnim - 208) / 73) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            yy = 0.975 + (((tickAnim - 281) / 9) * (0-(0.975)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 208 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 208) / 20) * (36.91-(0)));
            yy = 0 + (((tickAnim - 208) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 20) * (0-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = 36.91 + (((tickAnim - 228) / 17) * (5.5-(36.91)));
            yy = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 228) / 17) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 5.5 + (((tickAnim - 245) / 8) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 273) {
            xx = 5.5 + (((tickAnim - 253) / 20) * (10.75-(5.5)));
            yy = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 20) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 281) {
            xx = 10.75 + (((tickAnim - 273) / 8) * (28.61-(10.75)));
            yy = 0 + (((tickAnim - 273) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 8) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 28.61 + (((tickAnim - 281) / 9) * (0-(28.61)));
            yy = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 208) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 228) {
            xx = 0 + (((tickAnim - 208) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 20) * (2.5-(0)));
            zz = 0 + (((tickAnim - 208) / 20) * (-0.375-(0)));
        }
        else if (tickAnim >= 228 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 228) / 17) * (0-(0)));
            yy = 2.5 + (((tickAnim - 228) / 17) * (0-(2.5)));
            zz = -0.375 + (((tickAnim - 228) / 17) * (0-(-0.375)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 20) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 281) {
            xx = 0 + (((tickAnim - 273) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 273) / 8) * (1.625-(0)));
            zz = 0 + (((tickAnim - 273) / 8) * (0-(0)));
        }
        else if (tickAnim >= 281 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 281) / 9) * (0-(0)));
            yy = 1.625 + (((tickAnim - 281) / 9) * (0-(1.625)));
            zz = 0 + (((tickAnim - 281) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 75 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 75) / 19) * (-24.25-(0)));
            yy = 0 + (((tickAnim - 75) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 19) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 208) {
            xx = -24.25 + (((tickAnim - 94) / 114) * (-24.25-(-24.25)));
            yy = 0 + (((tickAnim - 94) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 114) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = -24.25 + (((tickAnim - 208) / 37) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 290) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 290) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 75 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 75) / 11) * (-18.74-(0)));
            yy = 0 + (((tickAnim - 75) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 11) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = -18.74 + (((tickAnim - 86) / 8) * (9.75-(-18.74)));
            yy = 0 + (((tickAnim - 86) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 8) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 208) {
            xx = 9.75 + (((tickAnim - 94) / 114) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 94) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 114) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 9.75 + (((tickAnim - 208) / 37) * (12.75-(9.75)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 12.75 + (((tickAnim - 245) / 8) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 12.75 + (((tickAnim - 253) / 37) * (0-(12.75)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 0) / 94) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 94) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 94) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 94) / 114) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 114) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = -0.875 + (((tickAnim - 245) / 8) * (-0.875-(-0.875)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = -0.875 + (((tickAnim - 253) / 37) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 75 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 75) / 11) * (48.55-(0)));
            yy = 0 + (((tickAnim - 75) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 11) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = 48.55 + (((tickAnim - 86) / 8) * (14.25-(48.55)));
            yy = 0 + (((tickAnim - 86) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 8) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 208) {
            xx = 14.25 + (((tickAnim - 94) / 114) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 94) / 114) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 114) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 14.25 + (((tickAnim - 208) / 37) * (-0.25-(14.25)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -0.25 + (((tickAnim - 245) / 8) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = -0.25 + (((tickAnim - 253) / 37) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 75) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 11) * (3.245-(0)));
            zz = 0 + (((tickAnim - 75) / 11) * (-1.275-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 86) / 8) * (0-(0)));
            yy = 3.245 + (((tickAnim - 86) / 8) * (0.45-(3.245)));
            zz = -1.275 + (((tickAnim - 86) / 8) * (0-(-1.275)));
        }
        else if (tickAnim >= 94 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 94) / 114) * (0-(0)));
            yy = 0.45 + (((tickAnim - 94) / 114) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 94) / 114) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0.45 + (((tickAnim - 208) / 37) * (0.25-(0.45)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0.25 + (((tickAnim - 245) / 8) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = 0.25 + (((tickAnim - 253) / 37) * (0-(0.25)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 79) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 79) / 54) * (-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+10))*-0.1-(0)));
            yy = 0 + (((tickAnim - 79) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 54) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 253) {
            xx = -1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+10))*-0.1 + (((tickAnim - 133) / 120) * (-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1-(-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+10))*-0.1)));
            yy = 0 + (((tickAnim - 133) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 120) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = -2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1 + (((tickAnim - 253) / 37) * (0-(-2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.1)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 79) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 79) / 54) * (-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-10))*-0.5-(0)));
            yy = 0 + (((tickAnim - 79) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 54) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 253) {
            xx = -1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-10))*-0.5 + (((tickAnim - 133) / 120) * (-4.75-(-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-10))*-0.5)));
            yy = 0 + (((tickAnim - 133) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 120) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = -4.75 + (((tickAnim - 253) / 37) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 79) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 79) / 54) * (-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-0.8-(0)));
            yy = 0 + (((tickAnim - 79) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 54) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 253) {
            xx = -1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-0.8 + (((tickAnim - 133) / 120) * (2.25-(-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-0.8)));
            yy = 0 + (((tickAnim - 133) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 120) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 268) {
            xx = 2.25 + (((tickAnim - 253) / 15) * (2.195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7-(2.25)));
            yy = 0 + (((tickAnim - 253) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 15) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 290) {
            xx = 2.195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7 + (((tickAnim - 268) / 22) * (0-(2.195+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-7)));
            yy = 0 + (((tickAnim - 268) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 79) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 79) / 54) * (-0.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*-0.8-(0)));
            yy = 0 + (((tickAnim - 79) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 54) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 222) {
            xx = -0.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*-0.8 + (((tickAnim - 133) / 89) * (5.645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1-(-0.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*-0.8)));
            yy = 0 + (((tickAnim - 133) / 89) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 89) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 259) {
            xx = 5.645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1 + (((tickAnim - 222) / 37) * (-1.17-(5.645+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-1)));
            yy = 0 + (((tickAnim - 222) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 37) * (0-(0)));
        }
        else if (tickAnim >= 259 && tickAnim < 278) {
            xx = -1.17 + (((tickAnim - 259) / 19) * (9.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-1-(-1.17)));
            yy = 0 + (((tickAnim - 259) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 259) / 19) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 290) {
            xx = 9.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-1 + (((tickAnim - 278) / 12) * (0-(9.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180+50))*-1)));
            yy = 0 + (((tickAnim - 278) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 79) {
            xx = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 79) * (0-(0)));
        }
        else if (tickAnim >= 79 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 79) / 54) * (-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-0.8-(0)));
            yy = 0 + (((tickAnim - 79) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 79) / 54) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 253) {
            xx = -1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-0.8 + (((tickAnim - 133) / 120) * (12.5-(-1.02+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-100))*-0.8)));
            yy = 0 + (((tickAnim - 133) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 120) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 265) {
            xx = 12.5 + (((tickAnim - 253) / 12) * (2.5-(12.5)));
            yy = 0 + (((tickAnim - 253) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 12) * (0-(0)));
        }
        else if (tickAnim >= 265 && tickAnim < 275) {
            xx = 2.5 + (((tickAnim - 265) / 10) * (6.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(2.5)));
            yy = 0 + (((tickAnim - 265) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 265) / 10) * (0-(0)));
        }
        else if (tickAnim >= 275 && tickAnim < 290) {
            xx = 6.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 275) / 15) * (0-(6.71+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 275) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 275) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 208) {
            xx = 16 + (((tickAnim - 23) / 185) * (16-(16)));
            yy = 0 + (((tickAnim - 23) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 185) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 16 + (((tickAnim - 208) / 37) * (32.5-(16)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 32.5 + (((tickAnim - 245) / 8) * (32.5-(32.5)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 273) {
            xx = 32.5 + (((tickAnim - 253) / 20) * (11-(32.5)));
            yy = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 20) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = 11 + (((tickAnim - 273) / 17) * (0-(11)));
            yy = 0 + (((tickAnim - 273) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 23 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 23) / 185) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 185) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (32.14-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 32.14 + (((tickAnim - 14) / 9) * (-5.25-(32.14)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 208) {
            xx = -5.25 + (((tickAnim - 23) / 185) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 23) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 185) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = -5.25 + (((tickAnim - 208) / 37) * (8-(-5.25)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 8 + (((tickAnim - 245) / 8) * (8-(8)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 273) {
            xx = 8 + (((tickAnim - 253) / 20) * (1.5-(8)));
            yy = 0 + (((tickAnim - 253) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 20) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = 1.5 + (((tickAnim - 273) / 17) * (0-(1.5)));
            yy = 0 + (((tickAnim - 273) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 23) / 185) * (0-(0)));
            yy = 0.6 + (((tickAnim - 23) / 185) * (0.6-(0.6)));
            zz = 0 + (((tickAnim - 23) / 185) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 208) / 45) * (0-(0)));
            yy = 0.6 + (((tickAnim - 208) / 45) * (0-(0.6)));
            zz = 0 + (((tickAnim - 208) / 45) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 0 + (((tickAnim - 253) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 253) / 14) * (3.225-(0)));
            zz = 0 + (((tickAnim - 253) / 14) * (0-(0)));
        }
        else if (tickAnim >= 267 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 267) / 6) * (0-(0)));
            yy = 3.225 + (((tickAnim - 267) / 6) * (0-(3.225)));
            zz = 0 + (((tickAnim - 267) / 6) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 273) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 273) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (14.84-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 14.84 + (((tickAnim - 14) / 9) * (-9.25-(14.84)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 208) {
            xx = -9.25 + (((tickAnim - 23) / 185) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 23) / 185) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 185) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = -9.25 + (((tickAnim - 208) / 37) * (3.62923-(-9.25)));
            yy = 0 + (((tickAnim - 208) / 37) * (1.22277-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (5.00475-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 3.62923 + (((tickAnim - 245) / 8) * (3.62923-(3.62923)));
            yy = 1.22277 + (((tickAnim - 245) / 8) * (1.22277-(1.22277)));
            zz = 5.00475 + (((tickAnim - 245) / 8) * (5.00475-(5.00475)));
        }
        else if (tickAnim >= 253 && tickAnim < 267) {
            xx = 3.62923 + (((tickAnim - 253) / 14) * (10.37698-(3.62923)));
            yy = 1.22277 + (((tickAnim - 253) / 14) * (0.57062-(1.22277)));
            zz = 5.00475 + (((tickAnim - 253) / 14) * (2.33555-(5.00475)));
        }
        else if (tickAnim >= 267 && tickAnim < 273) {
            xx = 10.37698 + (((tickAnim - 267) / 6) * (-7.25-(10.37698)));
            yy = 0.57062 + (((tickAnim - 267) / 6) * (0-(0.57062)));
            zz = 2.33555 + (((tickAnim - 267) / 6) * (0-(2.33555)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = -7.25 + (((tickAnim - 273) / 17) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 273) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 273) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 208 && tickAnim < 273) {
            xx = 0 + (((tickAnim - 208) / 65) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 65) * (0.225-(0)));
            zz = 0 + (((tickAnim - 208) / 65) * (0-(0)));
        }
        else if (tickAnim >= 273 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 273) / 17) * (0-(0)));
            yy = 0.225 + (((tickAnim - 273) / 17) * (0-(0.225)));
            zz = 0 + (((tickAnim - 273) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 90) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (23-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 23 + (((tickAnim - 245) / 8) * (23-(23)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 23 + (((tickAnim - 253) / 37) * (0-(23)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 90) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = -0.275 + (((tickAnim - 245) / 8) * (-0.275-(-0.275)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = -0.275 + (((tickAnim - 253) / 37) * (0-(-0.275)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 90) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (4-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 4 + (((tickAnim - 245) / 8) * (4-(4)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 4 + (((tickAnim - 253) / 37) * (0-(4)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 90) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = -0.025 + (((tickAnim - 245) / 8) * (-0.025-(-0.025)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = -0.025 + (((tickAnim - 253) / 37) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 90) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = -15.25 + (((tickAnim - 245) / 8) * (-15.25-(-15.25)));
            yy = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = -15.25 + (((tickAnim - 253) / 37) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 118) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 118) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            yy = 0 + (((tickAnim - 118) / 90) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 90) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 245) {
            xx = 0 + (((tickAnim - 208) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 37) * (0.575-(0)));
            zz = 0 + (((tickAnim - 208) / 37) * (0-(0)));
        }
        else if (tickAnim >= 245 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 245) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 245) / 8) * (0.575-(0.575)));
            zz = 0 + (((tickAnim - 245) / 8) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 290) {
            xx = 0 + (((tickAnim - 253) / 37) * (0-(0)));
            yy = 0.575 + (((tickAnim - 253) / 37) * (0-(0.575)));
            zz = 0 + (((tickAnim - 253) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 5 + (((tickAnim - 0) / 7) * (-13.67739-(5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.11991-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (2.49712-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -13.67739 + (((tickAnim - 7) / 5) * (-24.74151-(-13.67739)));
            yy = 0.11991 + (((tickAnim - 7) / 5) * (-0.39398-(0.11991)));
            zz = 2.49712 + (((tickAnim - 7) / 5) * (-2.46878-(2.49712)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = -24.74151 + (((tickAnim - 12) / 23) * (5-(-24.74151)));
            yy = -0.39398 + (((tickAnim - 12) / 23) * (0-(-0.39398)));
            zz = -2.46878 + (((tickAnim - 12) / 23) * (0-(-2.46878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -1.45 + (((tickAnim - 0) / 12) * (-0.575-(-1.45)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            yy = -0.575 + (((tickAnim - 12) / 23) * (-1.45-(-0.575)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 7 + (((tickAnim - 0) / 7) * (-12.73258-(7)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.00549-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-4.7806-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -12.73258 + (((tickAnim - 7) / 5) * (14.25-(-12.73258)));
            yy = 0.00549 + (((tickAnim - 7) / 5) * (0-(0.00549)));
            zz = -4.7806 + (((tickAnim - 7) / 5) * (0-(-4.7806)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 14.25 + (((tickAnim - 12) / 23) * (7-(14.25)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 1.5 + (((tickAnim - 0) / 7) * (1.675-(1.5)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 1.675 + (((tickAnim - 7) / 5) * (0-(1.675)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.31+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.31+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.3 + (((tickAnim - 18) / 5) * (0.725-(0.31+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 23) / 12) * (0-(0)));
            yy = 0.725 + (((tickAnim - 23) / 12) * (1.5-(0.725)));
            zz = 0 + (((tickAnim - 23) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -4 + (((tickAnim - 0) / 7) * (39.57-(-4)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 39.57 + (((tickAnim - 7) / 5) * (10-(39.57)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 35) {
            xx = 10 + (((tickAnim - 12) / 23) * (-4-(10)));
            yy = 0 + (((tickAnim - 12) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (3.045-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 3.045 + (((tickAnim - 7) / 5) * (0.975-(3.045)));
            zz = -1 + (((tickAnim - 7) / 5) * (0-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0.975 + (((tickAnim - 12) / 18) * (0.965-(0.975)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.965 + (((tickAnim - 30) / 5) * (0-(0.965)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 21.5 + (((tickAnim - 0) / 7) * (32.82-(21.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 32.82 + (((tickAnim - 7) / 5) * (0-(32.82)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (-3.95752-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (1.70594-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -3.95752 + (((tickAnim - 30) / 5) * (0-(-3.95752)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 1.70594 + (((tickAnim - 30) / 5) * (21.5-(1.70594)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rclaw, Rclaw.rotateAngleX + (float) Math.toRadians(xx), Rclaw.rotateAngleY + (float) Math.toRadians(yy), Rclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (17.43-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 17.43 + (((tickAnim - 7) / 5) * (0-(17.43)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (-5-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5 + (((tickAnim - 30) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rtoes, Rtoes.rotateAngleX + (float) Math.toRadians(xx), Rtoes.rotateAngleY + (float) Math.toRadians(yy), Rtoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-0.01-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.615-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.21-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -0.01 + (((tickAnim - 7) / 5) * (0-(-0.01)));
            yy = -0.615 + (((tickAnim - 7) / 5) * (0-(-0.615)));
            zz = 0.21 + (((tickAnim - 7) / 5) * (0-(0.21)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 12) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 18) * (0.575-(0)));
            zz = 0 + (((tickAnim - 12) / 18) * (0.125-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.575 + (((tickAnim - 30) / 5) * (0-(0.575)));
            zz = 0.125 + (((tickAnim - 30) / 5) * (0-(0.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rtoes.rotationPointX = this.Rtoes.rotationPointX + (float)(xx);
        this.Rtoes.rotationPointY = this.Rtoes.rotationPointY - (float)(yy);
        this.Rtoes.rotationPointZ = this.Rtoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -17.25 + (((tickAnim - 0) / 16) * (1.98422-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.75903-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-2.38206-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 1.98422 + (((tickAnim - 16) / 7) * (-15.5102-(1.98422)));
            yy = 0.75903 + (((tickAnim - 16) / 7) * (0.00816-(0.75903)));
            zz = -2.38206 + (((tickAnim - 16) / 7) * (-2.74999-(-2.38206)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -15.5102 + (((tickAnim - 23) / 5) * (-22.5-(-15.5102)));
            yy = 0.00816 + (((tickAnim - 23) / 5) * (0-(0.00816)));
            zz = -2.74999 + (((tickAnim - 23) / 5) * (0-(-2.74999)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -22.5 + (((tickAnim - 28) / 7) * (-17.25-(-22.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 13.75 + (((tickAnim - 0) / 16) * (10.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 10.75 + (((tickAnim - 16) / 7) * (-5.87788-(10.75)));
            yy = 0 + (((tickAnim - 16) / 7) * (-1.13009-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (3.96057-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -5.87788 + (((tickAnim - 23) / 5) * (14.25-(-5.87788)));
            yy = -1.13009 + (((tickAnim - 23) / 5) * (0-(-1.13009)));
            zz = 3.96057 + (((tickAnim - 23) / 5) * (0-(3.96057)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 14.25 + (((tickAnim - 28) / 7) * (13.75-(14.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.32 + (((tickAnim - 0) / 3) * (0.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.3-(0.32)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.3 + (((tickAnim - 3) / 5) * (0.6-(0.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0.6 + (((tickAnim - 8) / 8) * (0.225-(0.6)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 16) / 7) * (2.875-(0.225)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 2.875 + (((tickAnim - 23) / 5) * (0.425-(2.875)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 28) / 3) * (0.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0.425)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 31) / 4) * (0.32-(0.56+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3.25 + (((tickAnim - 0) / 8) * (0-(3.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (8.38-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 8.38 + (((tickAnim - 16) / 7) * (45.75-(8.38)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 45.75 + (((tickAnim - 23) / 5) * (8.25-(45.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 8.25 + (((tickAnim - 28) / 7) * (3.25-(8.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.725 + (((tickAnim - 0) / 8) * (0.605-(0.725)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 0.605 + (((tickAnim - 8) / 8) * (1.405-(0.605)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = 1.405 + (((tickAnim - 16) / 7) * (3.06-(1.405)));
            zz = 0 + (((tickAnim - 16) / 7) * (-1.125-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 3.06 + (((tickAnim - 23) / 5) * (0.8-(3.06)));
            zz = -1.125 + (((tickAnim - 23) / 5) * (0-(-1.125)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0.8 + (((tickAnim - 28) / 7) * (0.725-(0.8)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (9.03841-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (22.51557-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (-35.71834-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 9.03841 + (((tickAnim - 16) / 7) * (15.46913-(9.03841)));
            yy = 22.51557 + (((tickAnim - 16) / 7) * (25.82982-(22.51557)));
            zz = -35.71834 + (((tickAnim - 16) / 7) * (-52.16349-(-35.71834)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 15.46913 + (((tickAnim - 23) / 5) * (0-(15.46913)));
            yy = 25.82982 + (((tickAnim - 23) / 5) * (0-(25.82982)));
            zz = -52.16349 + (((tickAnim - 23) / 5) * (0-(-52.16349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rclaw2, Rclaw2.rotateAngleX + (float) Math.toRadians(xx), Rclaw2.rotateAngleY + (float) Math.toRadians(yy), Rclaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -14.5 + (((tickAnim - 16) / 7) * (22.5-(-14.5)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 22.5 + (((tickAnim - 23) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rtoes2, Rtoes2.rotateAngleX + (float) Math.toRadians(xx), Rtoes2.rotateAngleY + (float) Math.toRadians(yy), Rtoes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0.075-(0)));
            yy = 0 + (((tickAnim - 8) / 8) * (0.45-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0.475-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0.075 + (((tickAnim - 16) / 7) * (0.075-(0.075)));
            yy = 0.45 + (((tickAnim - 16) / 7) * (-0.85-(0.45)));
            zz = 0.475 + (((tickAnim - 16) / 7) * (0.35-(0.475)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0.075 + (((tickAnim - 23) / 5) * (0-(0.075)));
            yy = -0.85 + (((tickAnim - 23) / 5) * (0-(-0.85)));
            zz = 0.35 + (((tickAnim - 23) / 5) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rtoes2.rotationPointX = this.Rtoes2.rotationPointX + (float)(xx);
        this.Rtoes2.rotationPointY = this.Rtoes2.rotationPointY - (float)(yy);
        this.Rtoes2.rotationPointZ = this.Rtoes2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.25 + (((tickAnim - 0) / 3) * (-6.46-(-3.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 28) {
            xx = -6.46 + (((tickAnim - 3) / 25) * (11.5-(-6.46)));
            yy = 0 + (((tickAnim - 3) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 25) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 11.5 + (((tickAnim - 28) / 7) * (-3.25-(11.5)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.23-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 3) / 25) * (0-(0)));
            yy = 0.23 + (((tickAnim - 3) / 25) * (-0.495-(0.23)));
            zz = 0 + (((tickAnim - 3) / 25) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = -0.495 + (((tickAnim - 28) / 7) * (0-(-0.495)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3 + (((tickAnim - 0) / 3) * (2.75-(3)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 2.75 + (((tickAnim - 3) / 10) * (5.55-(2.75)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 5.55 + (((tickAnim - 13) / 15) * (17.25-(5.55)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 17.25 + (((tickAnim - 28) / 7) * (3-(17.25)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 3) / 5) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(-0.125)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 8) / 5) * (-0.03-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.03 + (((tickAnim - 13) / 15) * (0-(-0.03)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (1.325-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 1.325 + (((tickAnim - 31) / 4) * (0-(1.325)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.75 + (((tickAnim - 0) / 3) * (6.25-(-0.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 6.25 + (((tickAnim - 3) / 10) * (-6.62-(6.25)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -6.62 + (((tickAnim - 13) / 7) * (-10.81-(-6.62)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -10.81 + (((tickAnim - 20) / 8) * (1.5-(-10.81)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 1.5 + (((tickAnim - 28) / 3) * (17.98-(1.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 17.98 + (((tickAnim - 31) / 4) * (-0.75-(17.98)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.1 + (((tickAnim - 0) / 3) * (-0.75-(1.1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = -0.75 + (((tickAnim - 3) / 10) * (-0.38-(-0.75)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.38 + (((tickAnim - 13) / 7) * (0.135-(-0.38)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 0.135 + (((tickAnim - 20) / 8) * (0-(0.135)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (1.515-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 1.515 + (((tickAnim - 31) / 4) * (1.1-(1.515)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.25 + (((tickAnim - 0) / 8) * (16-(8.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 16 + (((tickAnim - 8) / 5) * (2.66547-(16)));
            yy = 0 + (((tickAnim - 8) / 5) * (-1.72222-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.1646-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 2.66547 + (((tickAnim - 13) / 5) * (-7-(2.66547)));
            yy = -1.72222 + (((tickAnim - 13) / 5) * (0-(-1.72222)));
            zz = 0.1646 + (((tickAnim - 13) / 5) * (0-(0.1646)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 18) / 17) * (8.25-(-7)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.1 + (((tickAnim - 0) / 8) * (-1.32-(-1.1)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -1.32 + (((tickAnim - 8) / 10) * (-0.225-(-1.32)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 17) * (-1.1-(-0.225)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 0) / 13) * (5.34-(6)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5.34 + (((tickAnim - 13) / 4) * (0.47-(5.34)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.47 + (((tickAnim - 17) / 1) * (2.75-(0.47)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 2.75 + (((tickAnim - 18) / 17) * (6-(2.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.16-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.16 + (((tickAnim - 13) / 4) * (0.975-(1.16)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 17) / 1) * (0.1-(0.975)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.1 + (((tickAnim - 18) / 5) * (0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.15-(0.1)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.15 + (((tickAnim - 23) / 4) * (0.1-(0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.15)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 27) / 8) * (0-(0.1)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -12 + (((tickAnim - 0) / 8) * (-6-(-12)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6 + (((tickAnim - 8) / 5) * (13-(-6)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 13 + (((tickAnim - 13) / 3) * (-2.69743-(13)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.05828-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.14645-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -2.69743 + (((tickAnim - 16) / 2) * (6.75-(-2.69743)));
            yy = -0.05828 + (((tickAnim - 16) / 2) * (0-(-0.05828)));
            zz = -0.14645 + (((tickAnim - 16) / 2) * (0-(-0.14645)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 6.75 + (((tickAnim - 18) / 9) * (-3-(6.75)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 27) / 8) * (-12-(-3)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 8) * (1.055-(0.775)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.055 + (((tickAnim - 8) / 5) * (2.5-(1.055)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 2.5 + (((tickAnim - 13) / 3) * (0.65-(2.5)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 16) / 2) * (-1-(0.65)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            yy = -1 + (((tickAnim - 18) / 17) * (0.775-(-1)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.7+50))*-0.5), mainbody.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+65))*1), mainbody.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205))*0.3));

        if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 3) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2 + (((tickAnim - 3) / 10) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 13) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2 + (((tickAnim - 13) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 23) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2 + (((tickAnim - 23) / 9) * (0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.mainbody.rotationPointX = this.mainbody.rotationPointX + (float)(xx);
        this.mainbody.rotationPointY = this.mainbody.rotationPointY - (float)(yy);
        this.mainbody.rotationPointZ = this.mainbody.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.7+70))*1.5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+80))*2.3), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+70))*-2.3));

        if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.1-(0)));
            zz = 0.175 + (((tickAnim - 11) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.1 + (((tickAnim - 15) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.1)));
            zz = 0.175 + (((tickAnim - 15) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0.175 + (((tickAnim - 19) / 8) * (0.175-(0.175)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*-0.1-(0)));
            zz = 0.175 + (((tickAnim - 27) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*-0.1 + (((tickAnim - 31) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*-0.1)));
            zz = 0.175 + (((tickAnim - 31) / 4) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*350/0.85-50))*0.7), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+90))*-1.5), body2.rotateAngleZ + (float) Math.toRadians(0.9-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*195-80))*1.5));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 23) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*350/0.85))*-0.5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+20))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+70))*0.5));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 4) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 24) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/1.2+103))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-20))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+20))*-1));

        if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 6) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 26) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/0.75-75))*0.3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/1+56))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205+30))*-1.5));

        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-30))*-0.03-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-30))*-0.03 + (((tickAnim - 8) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-30))*-0.03)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-30))*-0.03-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-30))*-0.03 + (((tickAnim - 28) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-30))*-0.03)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*450/1.2-60))*-1.5), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-20))*6), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-100))*-5));

        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 8) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05 + (((tickAnim - 28) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.05)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*500/1.21-80))*-2), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206/1.002-20))*8.55), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-100))*-6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*500/1.21-80))*-3), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*8), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-100))*-7));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/1.5-50))*1), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+30))*-2.5), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+80))*2.5));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.05-(0)));
            zz = 0.175 + (((tickAnim - 0) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.05 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.05)));
            zz = 0.175 + (((tickAnim - 4) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0.175 + (((tickAnim - 8) / 10) * (0.175-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.05-(0)));
            zz = 0.175 + (((tickAnim - 18) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.05 + (((tickAnim - 22) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.05)));
            zz = 0.175 + (((tickAnim - 22) / 4) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/1.5-50))*-0.5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+30))*0.8), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-20))*0.8));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.1-(0)));
            zz = 0.175 + (((tickAnim - 0) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.1 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*0.1)));
            zz = 0.175 + (((tickAnim - 4) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0.175 + (((tickAnim - 8) / 10) * (0.175-(0.175)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*-0.1-(0)));
            zz = 0.175 + (((tickAnim - 18) / 4) * (0.175-(0.175)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*-0.1 + (((tickAnim - 22) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-20))*-0.1)));
            zz = 0.175 + (((tickAnim - 22) / 4) * (0.175-(0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/1.5-80))*-1), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*1), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/1.5-80))*-0.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*2), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*2));


        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/1.5-80))*-1), neckend.rotateAngleY + (float) Math.toRadians(0), neckend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*616/1.5-100))*-0.3), headbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*0.1), headbase.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-40))*0.1));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205-100))*0.3), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSpinophorosaurus entity = (EntityPrehistoricFloraSpinophorosaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.5 + (((tickAnim - 0) / 2) * (6.75-(1.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 6.75 + (((tickAnim - 2) / 4) * (-8.15633-(6.75)));
            yy = 0 + (((tickAnim - 2) / 4) * (-0.68931-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (5.20468-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -8.15633 + (((tickAnim - 6) / 3) * (-25.5-(-8.15633)));
            yy = -0.68931 + (((tickAnim - 6) / 3) * (0-(-0.68931)));
            zz = 5.20468 + (((tickAnim - 6) / 3) * (0-(5.20468)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = -25.5 + (((tickAnim - 9) / 13) * (1.5-(-25.5)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.275 + (((tickAnim - 0) / 3) * (-0.875-(-0.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.875 + (((tickAnim - 3) / 6) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(-0.875)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 9) / 2) * (-0.875-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            yy = -0.875 + (((tickAnim - 11) / 11) * (-0.275-(-0.875)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.75 + (((tickAnim - 0) / 3) * (8.25-(11.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 8.25 + (((tickAnim - 3) / 3) * (-21.48252-(8.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.24247-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-8.24646-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -21.48252 + (((tickAnim - 6) / 3) * (9-(-21.48252)));
            yy = -0.24247 + (((tickAnim - 6) / 3) * (0-(-0.24247)));
            zz = -8.24646 + (((tickAnim - 6) / 3) * (0-(-8.24646)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 9 + (((tickAnim - 9) / 2) * (8.25-(9)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = 8.25 + (((tickAnim - 11) / 11) * (11.75-(8.25)));
            yy = 0 + (((tickAnim - 11) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-30))*0.2-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-30))*0.2 + (((tickAnim - 9) / 2) * (0-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-30))*0.2)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0.625-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0.625 + (((tickAnim - 16) / 6) * (0-(0.625)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 2.75 + (((tickAnim - 0) / 6) * (34.5-(2.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 34.5 + (((tickAnim - 6) / 2) * (0-(34.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (13.25-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 13.25 + (((tickAnim - 9) / 13) * (2.75-(13.25)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.325 + (((tickAnim - 0) / 6) * (2.22-(1.325)));
            zz = 0 + (((tickAnim - 0) / 6) * (-0.55-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 2.22 + (((tickAnim - 6) / 2) * (0-(2.22)));
            zz = -0.55 + (((tickAnim - 6) / 2) * (0-(-0.55)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0.325-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.325 + (((tickAnim - 9) / 6) * (1.715-(0.325)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 1.715 + (((tickAnim - 15) / 7) * (1.325-(1.715)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.75 + (((tickAnim - 0) / 3) * (-23.96-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -23.96 + (((tickAnim - 3) / 3) * (34-(-23.96)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 34 + (((tickAnim - 6) / 2) * (0-(34)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rtoes, Rtoes.rotateAngleX + (float) Math.toRadians(xx), Rtoes.rotateAngleY + (float) Math.toRadians(yy), Rtoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.025-(0)));
            yy = 0.625 + (((tickAnim - 0) / 3) * (1.335-(0.625)));
            zz = 0.175 + (((tickAnim - 0) / 3) * (0.925-(0.175)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.025 + (((tickAnim - 3) / 3) * (0.05-(0.025)));
            yy = 1.335 + (((tickAnim - 3) / 3) * (-1.1-(1.335)));
            zz = 0.925 + (((tickAnim - 3) / 3) * (0.4-(0.925)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.05 + (((tickAnim - 6) / 2) * (0-(0.05)));
            yy = -1.1 + (((tickAnim - 6) / 2) * (0-(-1.1)));
            zz = 0.4 + (((tickAnim - 6) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0.715-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0.08-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0.715 + (((tickAnim - 15) / 7) * (0.625-(0.715)));
            zz = 0.08 + (((tickAnim - 15) / 7) * (0.175-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rtoes.rotationPointX = this.Rtoes.rotationPointX + (float)(xx);
        this.Rtoes.rotationPointY = this.Rtoes.rotationPointY - (float)(yy);
        this.Rtoes.rotationPointZ = this.Rtoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -20.75 + (((tickAnim - 0) / 13) * (6.75-(-20.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 6.75 + (((tickAnim - 13) / 3) * (-8.14802-(6.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.59105-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-4.46109-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -8.14802 + (((tickAnim - 16) / 3) * (-27.5-(-8.14802)));
            yy = 0.59105 + (((tickAnim - 16) / 3) * (0-(0.59105)));
            zz = -4.46109 + (((tickAnim - 16) / 3) * (0-(-4.46109)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = -27.5 + (((tickAnim - 19) / 3) * (-20.75-(-27.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2 + (((tickAnim - 0) / 13) * (-0.875-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -0.875 + (((tickAnim - 13) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.2-(-0.875)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 9.25 + (((tickAnim - 0) / 13) * (7.25-(9.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 7.25 + (((tickAnim - 13) / 3) * (-5.57951-(7.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0.00142-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (5.82252-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -5.57951 + (((tickAnim - 16) / 3) * (8.5-(-5.57951)));
            yy = 0.00142 + (((tickAnim - 16) / 3) * (0-(0.00142)));
            zz = 5.82252 + (((tickAnim - 16) / 3) * (0-(5.82252)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 8.5 + (((tickAnim - 19) / 3) * (9.25-(8.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-30))*0.2 + (((tickAnim - 0) / 13) * (0-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-30))*0.2)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (2.95-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 2.95 + (((tickAnim - 16) / 3) * (0-(2.95)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-30))*0.2-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 10.75 + (((tickAnim - 0) / 13) * (21.25-(10.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 21.25 + (((tickAnim - 13) / 3) * (39.63-(21.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 39.63 + (((tickAnim - 16) / 2) * (0-(39.63)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (18-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 18 + (((tickAnim - 19) / 3) * (10.75-(18)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 6) * (1.79-(0.375)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 1.79 + (((tickAnim - 6) / 7) * (1.22-(1.79)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.22 + (((tickAnim - 13) / 3) * (2.625-(1.22)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.75-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 2.625 + (((tickAnim - 16) / 2) * (0-(2.625)));
            zz = -0.75 + (((tickAnim - 16) / 2) * (0-(-0.75)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 1) * (0.975-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 19) / 3) * (0.375-(0.975)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -29.75 + (((tickAnim - 13) / 3) * (24-(-29.75)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 24 + (((tickAnim - 16) / 2) * (-8-(24)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -8 + (((tickAnim - 18) / 1) * (0-(-8)));
            yy = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rtoes2, Rtoes2.rotateAngleX + (float) Math.toRadians(xx), Rtoes2.rotateAngleY + (float) Math.toRadians(yy), Rtoes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.02-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (1.335-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.61-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.02 + (((tickAnim - 6) / 7) * (0.05-(0.02)));
            yy = 1.335 + (((tickAnim - 6) / 7) * (1.975-(1.335)));
            zz = 0.61 + (((tickAnim - 6) / 7) * (1.4-(0.61)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.05 + (((tickAnim - 13) / 3) * (0.05-(0.05)));
            yy = 1.975 + (((tickAnim - 13) / 3) * (-0.775-(1.975)));
            zz = 1.4 + (((tickAnim - 13) / 3) * (0-(1.4)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.05 + (((tickAnim - 16) / 2) * (0-(0.05)));
            yy = -0.775 + (((tickAnim - 16) / 2) * (0.3-(-0.775)));
            zz = 0 + (((tickAnim - 16) / 2) * (0.375-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 1) * (0-(0.3)));
            zz = 0.375 + (((tickAnim - 18) / 1) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rtoes2.rotationPointX = this.Rtoes2.rotationPointX + (float)(xx);
        this.Rtoes2.rotationPointY = this.Rtoes2.rotationPointY - (float)(yy);
        this.Rtoes2.rotationPointZ = this.Rtoes2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.28422 + (((tickAnim - 0) / 3) * (-7.5-(-0.28422)));
            yy = 1.98509 + (((tickAnim - 0) / 3) * (0-(1.98509)));
            zz = -0.24384 + (((tickAnim - 0) / 3) * (0-(-0.24384)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.5 + (((tickAnim - 3) / 5) * (3-(-7.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 3 + (((tickAnim - 8) / 9) * (14.9-(3)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 14.9 + (((tickAnim - 17) / 5) * (-0.28422-(14.9)));
            yy = 0 + (((tickAnim - 17) / 5) * (1.98509-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (-0.24384-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0.075-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.075 + (((tickAnim - 8) / 9) * (-1.325-(0.075)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -1.325 + (((tickAnim - 17) / 5) * (0-(-1.325)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg1.rotationPointX = this.rightLeg1.rotationPointX + (float)(xx);
        this.rightLeg1.rotationPointY = this.rightLeg1.rotationPointY - (float)(yy);
        this.rightLeg1.rotationPointZ = this.rightLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.25 + (((tickAnim - 0) / 3) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (18-(0)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 18 + (((tickAnim - 17) / 5) * (-5.25-(18)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 3.35 + (((tickAnim - 0) / 3) * (0.075-(3.35)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.075 + (((tickAnim - 3) / 5) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3-(0.075)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3 + (((tickAnim - 8) / 9) * (0-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (3.35-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.81 + (((tickAnim - 0) / 3) * (7.5-(-10.81)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 7.5 + (((tickAnim - 3) / 7) * (-3.75-(7.5)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -3.75 + (((tickAnim - 10) / 6) * (-10.03-(-3.75)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.03 + (((tickAnim - 16) / 3) * (11.02-(-10.03)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 11.02 + (((tickAnim - 19) / 3) * (-10.81-(11.02)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 3) * (-0.875-(1.05)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = -0.875 + (((tickAnim - 3) / 7) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 12) * (1.05-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 3 + (((tickAnim - 0) / 8) * (14.9-(3)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14.9 + (((tickAnim - 8) / 5) * (-0.03391-(14.9)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.7448-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.0882-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.03391 + (((tickAnim - 13) / 3) * (-7.5-(-0.03391)));
            yy = -0.7448 + (((tickAnim - 13) / 3) * (0-(-0.7448)));
            zz = 0.0882 + (((tickAnim - 13) / 3) * (0-(0.0882)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -7.5 + (((tickAnim - 16) / 6) * (3-(-7.5)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 8) * (-1.325-(0.075)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -1.325 + (((tickAnim - 8) / 8) * (-0.275-(-1.325)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = -0.275 + (((tickAnim - 16) / 6) * (0.075-(-0.275)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg1.rotationPointX = this.leftLeg1.rotationPointX + (float)(xx);
        this.leftLeg1.rotationPointY = this.leftLeg1.rotationPointY - (float)(yy);
        this.leftLeg1.rotationPointZ = this.leftLeg1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 18 + (((tickAnim - 8) / 5) * (-5.25-(18)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -5.25 + (((tickAnim - 13) / 3) * (1.5-(-5.25)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 1.5 + (((tickAnim - 16) / 6) * (0-(1.5)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3 + (((tickAnim - 0) / 8) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3 + (((tickAnim - 8) / 5) * (3.35-(-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 3.35 + (((tickAnim - 13) / 3) * (-0.1-(3.35)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 16) / 6) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.3-(-0.1)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -3.75 + (((tickAnim - 0) / 8) * (-2.5-(-3.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -2.5 + (((tickAnim - 8) / 3) * (9.51-(-2.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 9.51 + (((tickAnim - 11) / 2) * (-10.81-(9.51)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -10.81 + (((tickAnim - 13) / 3) * (7.5-(-10.81)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 7.5 + (((tickAnim - 16) / 6) * (-3.75-(7.5)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 13) / 3) * (-0.875-(1.05)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = -0.875 + (((tickAnim - 16) / 6) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(9.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-40))*1), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-20))*1.5), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+10))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2-(0)));
            zz = -0.875 + (((tickAnim - 0) / 4) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2)));
            zz = -0.875 + (((tickAnim - 4) / 4) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -0.875 + (((tickAnim - 8) / 5) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2-(0)));
            zz = -0.875 + (((tickAnim - 13) / 5) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2)));
            zz = -0.875 + (((tickAnim - 18) / 4) * (-0.875-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(5.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-40))*0.2), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+20))*2), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-10))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(9.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-40))*-1.8), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-70))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+40))*-2));


        this.setRotateAngle(neckend, neckend.rotateAngleX + (float) Math.toRadians(-9.75), neckend.rotateAngleY + (float) Math.toRadians(0), neckend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(headbase, headbase.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-20))*-3), headbase.rotateAngleY + (float) Math.toRadians(0), headbase.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (12.19195-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-7.34383-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (30.86402-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 12.19195 + (((tickAnim - 6) / 2) * (0-(12.19195)));
            yy = -7.34383 + (((tickAnim - 6) / 2) * (0-(-7.34383)));
            zz = 30.86402 + (((tickAnim - 6) / 2) * (0-(30.86402)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (3.5-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 3.5 + (((tickAnim - 9) / 13) * (0-(3.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rclaw, Rclaw.rotateAngleX + (float) Math.toRadians(xx), Rclaw.rotateAngleY + (float) Math.toRadians(yy), Rclaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(mainbody, mainbody.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-40))*-1), mainbody.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-15))*-2), mainbody.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+25))*1.8));

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2 + (((tickAnim - 0) / 5) * (-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 5) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = -0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.3 + (((tickAnim - 5) / 7) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2-(-0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.3)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 12) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2 + (((tickAnim - 12) / 5) * (-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1 + (((tickAnim - 17) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360+70))*-0.1)));
            zz = -0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2 + (((tickAnim - 17) / 5) * (-0.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2-(-0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.mainbody.rotationPointX = this.mainbody.rotationPointX + (float)(xx);
        this.mainbody.rotationPointY = this.mainbody.rotationPointY - (float)(yy);
        this.mainbody.rotationPointZ = this.mainbody.rotationPointZ + (float)(zz);



        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-70))*2), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-60))*2.8), body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*-3.5));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-50))*0.15)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-70))*-2), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+50))*2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1-(0)));
            zz = 0.725 + (((tickAnim - 0) / 4) * (0.725-(0.725)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1)));
            zz = 0.725 + (((tickAnim - 4) / 4) * (0.725-(0.725)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0.725 + (((tickAnim - 8) / 5) * (0.725-(0.725)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1-(0)));
            zz = 0.725 + (((tickAnim - 13) / 5) * (0.725-(0.725)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*450/0.2-20))*0.1)));
            zz = 0.725 + (((tickAnim - 18) / 4) * (0.725-(0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-20))*0.5), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-60))*0.3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*-3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-100))*0.2-(0)));
            zz = -0.1 + (((tickAnim - 0) / 4) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-100))*0.2 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-100))*0.2)));
            zz = -0.1 + (((tickAnim - 4) / 4) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -0.1 + (((tickAnim - 8) / 5) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-100))*0.2-(0)));
            zz = -0.1 + (((tickAnim - 13) / 5) * (-0.1-(-0.1)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-100))*0.2 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-100))*0.2)));
            zz = -0.1 + (((tickAnim - 18) / 4) * (-0.1-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-40))*-0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-40))*7), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+2))*2));

        if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2-(0)));
            zz = -0.875 + (((tickAnim - 8) / 4) * (-0.875-(-0.875)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2 + (((tickAnim - 12) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-150))*0.2)));
            zz = -0.875 + (((tickAnim - 12) / 4) * (-0.875-(-0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5))*1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-50))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*3));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-120))*0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-120))*0.1 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-120))*0.1)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-120))*0.1-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-120))*0.1 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2-120))*0.1)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/0.6-40))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+40))*-8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/0.6-80))*-2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+30))*-10), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*-8));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*400/0.6+80))*-8), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+30))*-15), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+15))*-10));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3 + (((tickAnim - 4) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3 + (((tickAnim - 18) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3-140))*0.3)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-40))*-3.05), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331-70))*-3), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331+40))*-2));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(-0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*331/0.5-20))*0.3), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSpinophorosaurus e = (EntityPrehistoricFloraSpinophorosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.headbase, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
