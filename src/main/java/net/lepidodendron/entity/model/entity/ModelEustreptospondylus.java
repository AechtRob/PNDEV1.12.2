package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEustreptospondylus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEustreptospondylus extends ModelBasePalaeopedia {

    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended headsep;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head5;
    private final AdvancedModelRendererExtended Tteeth2;
    private final AdvancedModelRendererExtended Tteeth1;
    private final AdvancedModelRendererExtended Lcrest;
    private final AdvancedModelRendererExtended Lcrest2;
    private final AdvancedModelRendererExtended head6;
    private final AdvancedModelRendererExtended Rcrest;
    private final AdvancedModelRendererExtended Rcrest2;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended jaw4;
    private final AdvancedModelRendererExtended Bteeth2;
    private final AdvancedModelRendererExtended Bteeth1;
    private final AdvancedModelRendererExtended masseter;
    private final AdvancedModelRendererExtended throat;
    private final AdvancedModelRendererExtended leftArm3;
    private final AdvancedModelRendererExtended leftArm2;
    private final AdvancedModelRendererExtended leftArm;
    private final AdvancedModelRendererExtended rightArm3;
    private final AdvancedModelRendererExtended rightArm2;
    private final AdvancedModelRendererExtended rightArm;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended leftLeg4;
    private final AdvancedModelRendererExtended leftLeg2;
    private final AdvancedModelRendererExtended leftLeg3;
    private final AdvancedModelRendererExtended leftLeg;
    private final AdvancedModelRendererExtended rightLeg;
    private final AdvancedModelRendererExtended rightLeg2;
    private final AdvancedModelRendererExtended rightLeg3;
    private final AdvancedModelRendererExtended rightLeg4;

    private ModelAnimator animator;

    public ModelEustreptospondylus() {
        this.textureWidth = 100;
        this.textureHeight = 96;

        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.setRotateAngle(hips, -0.1173F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 29, -4.0F, -6.0F, 0.0F, 8, 13, 10, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1127F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -6.5F, -13.0F, 10, 14, 14, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, -1.4F, -12.6F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0646F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 35, 54, -4.0F, -5.0F, -8.0F, 8, 12, 8, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -1.0F, -7.1F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2737F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 65, 47, -2.5F, -3.5F, -7.0F, 5, 7, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.0F, -5.9F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1955F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 19, 73, -2.0F, -3.5F, -6.0F, 4, 7, 6, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, -0.3F, -4.5F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.4346F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 40, 75, -2.0F, -3.5F, -4.0F, 4, 7, 4, 0.01F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.1731F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 11, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.head.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 76, 0, -2.5F, -2.0F, -5.0F, 5, 4, 5, 0.0F, false));

        this.headsep = new AdvancedModelRendererExtended(this);
        this.headsep.setRotationPoint(0.0F, 0.3F, -7.8F);
        this.head2.addChild(headsep);
        this.setRotateAngle(headsep, 0.0859F, 0.0F, 0.0F);
        this.headsep.cubeList.add(new ModelBox(headsep, 81, 83, -1.5F, 0.0F, -3.0F, 3, 2, 6, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -2.0F, -2.9F);
        this.headsep.addChild(head3);
        this.setRotateAngle(head3, 0.488F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 41, 87, -1.0F, 0.0F, -3.0F, 2, 2, 3, -0.01F, false));

        this.head5 = new AdvancedModelRendererExtended(this);
        this.head5.setRotationPoint(0.0F, 2.0F, -3.0F);
        this.headsep.addChild(head5);
        this.setRotateAngle(head5, -0.2405F, 0.0F, 0.0F);
        this.head5.cubeList.add(new ModelBox(head5, 59, 8, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.0F, false));

        this.Tteeth2 = new AdvancedModelRendererExtended(this);
        this.Tteeth2.setRotationPoint(0.0F, -0.3F, -2.8F);
        this.head5.addChild(Tteeth2);
        this.Tteeth2.cubeList.add(new ModelBox(Tteeth2, 0, 34, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Tteeth1 = new AdvancedModelRendererExtended(this);
        this.Tteeth1.setRotationPoint(0.0F, 1.9F, -3.0F);
        this.headsep.addChild(Tteeth1);
        this.Tteeth1.cubeList.add(new ModelBox(Tteeth1, 68, 62, -1.0F, 0.0F, 1.0F, 2, 1, 3, 0.0F, false));

        this.Lcrest = new AdvancedModelRendererExtended(this);
        this.Lcrest.setRotationPoint(-1.0F, -1.5F, 0.7F);
        this.headsep.addChild(Lcrest);
        this.setRotateAngle(Lcrest, -0.0017F, -0.1634F, 0.0F);
        this.Lcrest.cubeList.add(new ModelBox(Lcrest, 37, 34, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));

        this.Lcrest2 = new AdvancedModelRendererExtended(this);
        this.Lcrest2.setRotationPoint(-0.5F, -0.1F, 2.1F);
        this.Lcrest.addChild(Lcrest2);
        this.setRotateAngle(Lcrest2, 0.1477F, -0.411F, 0.0F);
        this.Lcrest2.cubeList.add(new ModelBox(Lcrest2, 35, 0, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.head6 = new AdvancedModelRendererExtended(this);
        this.head6.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.headsep.addChild(head6);
        this.head6.cubeList.add(new ModelBox(head6, 30, 87, -1.0F, 0.0F, -3.0F, 2, 2, 6, 0.0F, false));

        this.Rcrest = new AdvancedModelRendererExtended(this);
        this.Rcrest.setRotationPoint(1.0F, -1.5F, 0.7F);
        this.headsep.addChild(Rcrest);
        this.setRotateAngle(Rcrest, -0.0017F, 0.1634F, 0.0F);
        this.Rcrest.cubeList.add(new ModelBox(Rcrest, 37, 34, -0.5F, -0.5F, -2.5F, 1, 1, 5, 0.0F, true));

        this.Rcrest2 = new AdvancedModelRendererExtended(this);
        this.Rcrest2.setRotationPoint(0.5F, -0.1F, 2.1F);
        this.Rcrest.addChild(Rcrest2);
        this.setRotateAngle(Rcrest2, 0.1477F, 0.411F, 0.0F);
        this.Rcrest2.cubeList.add(new ModelBox(Rcrest2, 35, 0, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0017F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 79, 62, -2.5F, 0.0F, -5.0F, 5, 3, 5, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 1.0F, -4.55F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0782F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 83, 44, -1.5F, -1.0F, -6.0F, 3, 2, 6, -0.01F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, -0.4F, -1.1F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.1955F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 56, 19, -1.5F, 0.0F, -3.0F, 3, 2, 4, -0.02F, false));

        this.jaw4 = new AdvancedModelRendererExtended(this);
        this.jaw4.setRotationPoint(0.0F, -1.0F, -5.9F);
        this.jaw2.addChild(jaw4);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 37, 41, -1.0F, 0.0F, -3.0F, 2, 2, 3, -0.01F, false));

        this.Bteeth2 = new AdvancedModelRendererExtended(this);
        this.Bteeth2.setRotationPoint(0.0F, -0.8F, -3.0F);
        this.jaw4.addChild(Bteeth2);
        this.Bteeth2.cubeList.add(new ModelBox(Bteeth2, 0, 29, -0.5F, 0.0F, 0.25F, 1, 1, 3, 0.0F, false));

        this.Bteeth1 = new AdvancedModelRendererExtended(this);
        this.Bteeth1.setRotationPoint(0.5F, -1.7F, -5.99F);
        this.jaw2.addChild(Bteeth1);
        this.Bteeth1.cubeList.add(new ModelBox(Bteeth1, 27, 34, -1.5F, 0.0F, 1.25F, 2, 1, 3, 0.0F, false));

        this.masseter = new AdvancedModelRendererExtended(this);
        this.masseter.setRotationPoint(0.0F, -1.5F, 0.6F);
        this.jaw.addChild(masseter);
        this.setRotateAngle(masseter, -0.3519F, 0.0F, 0.0F);
        this.masseter.cubeList.add(new ModelBox(masseter, 54, 0, -2.0F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));

        this.throat = new AdvancedModelRendererExtended(this);
        this.throat.setRotationPoint(0.0F, 3.5F, -1.8F);
        this.neck3.addChild(throat);
        this.setRotateAngle(throat, -0.0782F, 0.0F, 0.0F);
        this.throat.cubeList.add(new ModelBox(throat, 23, 53, -1.5F, -1.0F, -3.0F, 3, 2, 6, 0.0F, false));

        this.leftArm3 = new AdvancedModelRendererExtended(this);
        this.leftArm3.setRotationPoint(3.5F, 4.1F, -4.9F);
        this.chest.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.7428F, 0.0F, -0.1564F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 15, 87, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.leftArm2 = new AdvancedModelRendererExtended(this);
        this.leftArm2.setRotationPoint(0.1F, 5.0F, 2.0F);
        this.leftArm3.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.8992F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -1.6F, 0.0F, -3.0F, 3, 7, 3, -0.01F, false));

        this.leftArm = new AdvancedModelRendererExtended(this);
        this.leftArm.setRotationPoint(0.4F, 6.6F, -2.0F);
        this.leftArm2.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.1955F, 0.0F, 0.1955F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 0, 53, -1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F, false));

        this.rightArm3 = new AdvancedModelRendererExtended(this);
        this.rightArm3.setRotationPoint(-3.5F, 4.1F, -4.9F);
        this.chest.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.7428F, 0.0F, 0.1564F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 15, 87, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.rightArm2 = new AdvancedModelRendererExtended(this);
        this.rightArm2.setRotationPoint(-0.1F, 5.0F, 2.0F);
        this.rightArm3.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.8992F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -1.4F, 0.0F, -3.0F, 3, 7, 3, -0.01F, true));

        this.rightArm = new AdvancedModelRendererExtended(this);
        this.rightArm.setRotationPoint(-0.4F, 6.6F, -2.0F);
        this.rightArm2.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.1955F, 0.0F, -0.1955F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 0, 53, -1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -1.4F, 9.9F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, 0.007F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 62, 24, -3.0F, -4.5F, 0.0F, 6, 9, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.9F, 9.8F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0175F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 53, -2.5F, -3.5F, 0.0F, 5, 7, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 11.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0565F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 37, 34, -2.0F, -3.0F, 0.0F, 4, 6, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.9F, 12.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0803F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 33, 13, -1.5F, -2.0F, 0.0F, 3, 4, 16, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, -1.0F, 15.4F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1044F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 56, 0, -1.0F, -1.0F, 0.0F, 2, 3, 15, 0.0F, false));

        this.leftLeg4 = new AdvancedModelRendererExtended(this);
        this.leftLeg4.setRotationPoint(4.0F, -1.5F, 5.0F);
        this.hips.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, -0.0782F, -0.0524F, 0.0F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 60, 67, -2.5F, -2.0F, -4.0F, 5, 13, 8, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRendererExtended(this);
        this.leftLeg2.setRotationPoint(0.0F, 11.0F, -3.9F);
        this.leftLeg4.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6255F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 73, -2.0F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRendererExtended(this);
        this.leftLeg3.setRotationPoint(0.0F, 12.0F, 4.9F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.7428F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 85, 19, -1.5F, 0.0F, -4.0F, 3, 7, 4, 0.0F, false));

        this.leftLeg = new AdvancedModelRendererExtended(this);
        this.leftLeg.setRotationPoint(0.0F, 6.9F, -1.7F);
        this.leftLeg3.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.3033F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 35, 0, -2.5F, -1.0F, -6.0F, 5, 2, 8, 0.0F, false));

        this.rightLeg = new AdvancedModelRendererExtended(this);
        this.rightLeg.setRotationPoint(-4.0F, -1.5F, 5.0F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0782F, 0.0524F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 60, 67, -2.5F, -2.0F, -4.0F, 5, 13, 8, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRendererExtended(this);
        this.rightLeg2.setRotationPoint(0.0F, 11.0F, -3.9F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6255F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 73, -2.0F, 0.0F, 0.0F, 4, 12, 5, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRendererExtended(this);
        this.rightLeg3.setRotationPoint(0.0F, 12.0F, 4.9F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.7428F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 85, 19, -1.5F, 0.0F, -4.0F, 3, 7, 4, 0.0F, true));

        this.rightLeg4 = new AdvancedModelRendererExtended(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.9F, -1.7F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.3033F, 0.0F, 0.0F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 35, 0, -2.5F, -1.0F, -6.0F, 5, 2, 8, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleY = (float) Math.toRadians(00);
        this.setRotateAngle(neck1, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.neck1.offsetY = -0.0F;
        this.neck1.offsetX = 0.0F;
        this.neck1.offsetZ = 0.1F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hips, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.1F, 0.1F);
        this.setRotateAngle(chest, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(neck1, -0.1F, 0.05F, 0.0F);
        this.setRotateAngle(neck2, -0.5F, 0.05F, 0.0F);
        this.setRotateAngle(neck3, 0.45F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail5, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(leftArm, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(leftArm2, -1.0F, 0.3F, 0.0F);
        this.setRotateAngle(leftArm3, 0.8F, 0.2F, 0.0F);
        this.setRotateAngle(rightArm, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(rightArm2, -0.8F, -0.3F, 0.0F);
        this.setRotateAngle(rightArm3, 0.8F, -0.2F, 0.0F);
        this.setRotateAngle(leftLeg, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.5F, 0.0F, 0.1F);
        this.setRotateAngle(leftLeg3, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, -0.3F, -0.2F, -0.1F);
        this.setRotateAngle(rightLeg, -0.5F, 0.3F, 0.1F);
        this.setRotateAngle(rightLeg2, 0.25F, -0.0F, -0.05F);
        this.setRotateAngle(rightLeg3, -0.55F, 0.0F, -0.1F);
        this.setRotateAngle(rightLeg4, 0.73F, 0.0F, 0.0F);
        this.hips.offsetZ = -0.0F;
        this.hips.offsetY = -0.13F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.3F;
        this.hips.offsetX = -0.7F;
        this.hips.rotateAngleY = (float)Math.toRadians(-150);
        this.hips.rotateAngleX = (float)Math.toRadians(6);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 0.7F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.1F, 2.5F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.1F, 0.1F);
        this.setRotateAngle(chest, 0.1F, 0.05F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.5F, 0.2F, 0.0F);
        this.setRotateAngle(neck3, 0.45F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.1F, 0.3F, 0.0F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.1F, -0.5F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, -0.5F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, -0.5F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, -0.5F, 0.0F);
        this.setRotateAngle(tail5, -0.1F, -0.2F, 0.0F);
        this.setRotateAngle(leftArm, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(leftArm2, -1.0F, 0.3F, 0.0F);
        this.setRotateAngle(leftArm3, 0.8F, 0.2F, 0.0F);
        this.setRotateAngle(rightArm, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(rightArm2, -0.8F, -0.3F, 0.0F);
        this.setRotateAngle(rightArm3, 0.8F, -0.2F, 0.0F);
        this.setRotateAngle(leftLeg, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.5F, 0.0F, 0.1F);
        this.setRotateAngle(leftLeg3, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, -0.3F, -0.2F, -0.1F);
        this.setRotateAngle(rightLeg, -0.5F, 0.3F, 0.1F);
        this.setRotateAngle(rightLeg2, 1.3F, -0.0F, -0.05F);
        this.setRotateAngle(rightLeg3, -0.55F, 0.0F, -0.1F);
        this.setRotateAngle(rightLeg4, 0.73F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraEustreptospondylus EntityEustreptospondylus = (EntityPrehistoricFloraEustreptospondylus) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm3, this.leftArm2, this.leftArm};
        AdvancedModelRenderer[] ArmR = {this.rightArm3, this.rightArm2, this.rightArm};

        EntityEustreptospondylus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityEustreptospondylus.getAnimation() == EntityEustreptospondylus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityEustreptospondylus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityEustreptospondylus.getIsMoving()) { //Is moving at all
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm3, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm3, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm3, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm3, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityEustreptospondylus.getIsFast()) { //Running


                } else { //Walking

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
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*-1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(masseter, masseter.rotateAngleX + (float) Math.toRadians(xx), masseter.rotateAngleY + (float) Math.toRadians(yy), masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-20)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*40)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-10)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20 + (((tickAnim - 15) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10 + (((tickAnim - 25) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-100))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-100))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30 + (((tickAnim - 15) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15 + (((tickAnim - 25) / 15) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2-70))*-15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-70))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*1)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10 + (((tickAnim - 15) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5 + (((tickAnim - 25) / 15) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-1 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-1)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30 + (((tickAnim - 15) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10 + (((tickAnim - 25) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+100))*-10)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25-30))*-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-2.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(4), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-720))*-1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(-0.60681), neck1.rotateAngleY + (float) Math.toRadians(-2.28+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-189))*-1), neck1.rotateAngleZ + (float) Math.toRadians(10.2559+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-0.28486), neck2.rotateAngleY + (float) Math.toRadians(-8.0037+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-150))*-1), neck2.rotateAngleZ + (float) Math.toRadians(4.6499+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-0.8609), neck3.rotateAngleY + (float) Math.toRadians(-18.2291+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-155))*-1), neck3.rotateAngleZ + (float) Math.toRadians(-0.9738+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0.8609), head.rotateAngleY + (float) Math.toRadians(-18.2291+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-155))*-1), head.rotateAngleZ + (float) Math.toRadians(-0.9738+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*7), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -24.36999 + (((tickAnim - 0) / 23) * (15.16083-(-24.36999)));
            yy = 7.24367 + (((tickAnim - 0) / 23) * (7.16096-(7.24367)));
            zz = -3.33913 + (((tickAnim - 0) / 23) * (8.82222-(-3.33913)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 15.16083 + (((tickAnim - 23) / 10) * (0.6622-(15.16083)));
            yy = 7.16096 + (((tickAnim - 23) / 10) * (-3.82648-(7.16096)));
            zz = 8.82222 + (((tickAnim - 23) / 10) * (1.95166-(8.82222)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0.6622 + (((tickAnim - 33) / 9) * (-27.80583-(0.6622)));
            yy = -3.82648 + (((tickAnim - 33) / 9) * (-2.49644-(-3.82648)));
            zz = 1.95166 + (((tickAnim - 33) / 9) * (-2.19118-(1.95166)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -27.80583 + (((tickAnim - 42) / 8) * (-24.36999-(-27.80583)));
            yy = -2.49644 + (((tickAnim - 42) / 8) * (7.24367-(-2.49644)));
            zz = -2.19118 + (((tickAnim - 42) / 8) * (-3.33913-(-2.19118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1.175 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(-1.175)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 5) / 5) * (-0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = -0.75 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(-0.75)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 9) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.02521 + (((tickAnim - 0) / 10) * (5-(-7.02521)));
            yy = -2.21147 + (((tickAnim - 0) / 10) * (0-(-2.21147)));
            zz = 11.40943 + (((tickAnim - 0) / 10) * (0-(11.40943)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 5 + (((tickAnim - 10) / 13) * (7.9416-(5)));
            yy = 0 + (((tickAnim - 10) / 13) * (-6.13139-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-4.91718-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 7.9416 + (((tickAnim - 23) / 10) * (45-(7.9416)));
            yy = -6.13139 + (((tickAnim - 23) / 10) * (-2.5-(-6.13139)));
            zz = -4.91718 + (((tickAnim - 23) / 10) * (2.5-(-4.91718)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = 45 + (((tickAnim - 33) / 9) * (34.4874-(45)));
            yy = -2.5 + (((tickAnim - 33) / 9) * (-2.35574-(-2.5)));
            zz = 2.5 + (((tickAnim - 33) / 9) * (6.95472-(2.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 34.4874 + (((tickAnim - 42) / 8) * (-7.02521-(34.4874)));
            yy = -2.35574 + (((tickAnim - 42) / 8) * (-2.21147-(-2.35574)));
            zz = 6.95472 + (((tickAnim - 42) / 8) * (11.40943-(6.95472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0.5)));
            zz = 0.225 + (((tickAnim - 0) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (-0.225-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -0.225 + (((tickAnim - 23) / 27) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 23) / 27) * (0.5-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 23.20653 + (((tickAnim - 0) / 10) * (-0.25-(23.20653)));
            yy = -0.15664 + (((tickAnim - 0) / 10) * (0-(-0.15664)));
            zz = -8.21488 + (((tickAnim - 0) / 10) * (0-(-8.21488)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -0.25 + (((tickAnim - 10) / 13) * (27.5-(-0.25)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 27.5 + (((tickAnim - 23) / 10) * (-5-(27.5)));
            yy = 0 + (((tickAnim - 23) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 42) {
            xx = -5 + (((tickAnim - 33) / 9) * (-22.5-(-5)));
            yy = 2.5 + (((tickAnim - 33) / 9) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 33) / 9) * (0-(2.5)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 42) / 8) * (23.20653-(-22.5)));
            yy = 0 + (((tickAnim - 42) / 8) * (-0.15664-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-8.21488-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.1 + (((tickAnim - 0) / 5) * (-0.1-(-0.1)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -0.1 + (((tickAnim - 5) / 5) * (0-(-0.1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2 + (((tickAnim - 17) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (-0.1-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 8.25629 + (((tickAnim - 0) / 10) * (2.8033-(8.25629)));
            yy = -8.35841 + (((tickAnim - 0) / 10) * (-7.59971-(-8.35841)));
            zz = -3.66616 + (((tickAnim - 0) / 10) * (-1.82216-(-3.66616)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 2.8033 + (((tickAnim - 10) / 13) * (40.04972-(2.8033)));
            yy = -7.59971 + (((tickAnim - 10) / 13) * (-1.96746-(-7.59971)));
            zz = -1.82216 + (((tickAnim - 10) / 13) * (-2.89523-(-1.82216)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 40.04972 + (((tickAnim - 23) / 7) * (75-(40.04972)));
            yy = -1.96746 + (((tickAnim - 23) / 7) * (0-(-1.96746)));
            zz = -2.89523 + (((tickAnim - 23) / 7) * (0-(-2.89523)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 75 + (((tickAnim - 30) / 12) * (84-(75)));
            yy = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 84 + (((tickAnim - 42) / 8) * (8.25629-(84)));
            yy = 0 + (((tickAnim - 42) / 8) * (-8.35841-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (-3.66616-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.825-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (-0.575-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0.825 + (((tickAnim - 23) / 27) * (0-(0.825)));
            zz = -0.575 + (((tickAnim - 23) / 27) * (0-(-0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0.00494), body.rotateAngleY + (float) Math.toRadians(2.23571), body.rotateAngleZ + (float) Math.toRadians(2.7533+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+70))*-2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0.00566), chest.rotateAngleY + (float) Math.toRadians(-2.50438), chest.rotateAngleZ + (float) Math.toRadians(2.4466+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+140))*-1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(10.50566), neck1.rotateAngleY + (float) Math.toRadians(-2.50438), neck1.rotateAngleZ + (float) Math.toRadians(2.4466+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+170))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(10.82591), neck2.rotateAngleY + (float) Math.toRadians(-20.01274), neck2.rotateAngleZ + (float) Math.toRadians(1.6047+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+190))*-1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0), neck3.rotateAngleY + (float) Math.toRadians(-7), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5.42409), head.rotateAngleY + (float) Math.toRadians(-20.01274), head.rotateAngleZ + (float) Math.toRadians(1.6047+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+210))*-1));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 25) / 25) * (0-(7.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -12 + (((tickAnim - 25) / 25) * (0-(-12)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (17.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 17.5 + (((tickAnim - 25) / 25) * (0-(17.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-7-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -7 + (((tickAnim - 25) / 25) * (0-(-7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.33524-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.88894-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.91012-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -1.33524 + (((tickAnim - 25) / 25) * (0-(-1.33524)));
            yy = 0.88894 + (((tickAnim - 25) / 25) * (0-(0.88894)));
            zz = -0.91012 + (((tickAnim - 25) / 25) * (0-(-0.91012)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-11.5-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -11.5 + (((tickAnim - 25) / 25) * (0-(-11.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0.00494), tail1.rotateAngleY + (float) Math.toRadians(2.23571), tail1.rotateAngleZ + (float) Math.toRadians(2.7533+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+90))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0.00494), tail2.rotateAngleY + (float) Math.toRadians(2.23571), tail2.rotateAngleZ + (float) Math.toRadians(2.7533+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+120))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0.00494), tail3.rotateAngleY + (float) Math.toRadians(2.23571), tail3.rotateAngleZ + (float) Math.toRadians(2.7533+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+140))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0.00494), tail4.rotateAngleY + (float) Math.toRadians(2.23571), tail4.rotateAngleZ + (float) Math.toRadians(2.7533+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+160))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0.00494), tail5.rotateAngleY + (float) Math.toRadians(2.23571), tail5.rotateAngleZ + (float) Math.toRadians(2.7533+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.833+170))*2));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -15 + (((tickAnim - 0) / 25) * (11.14572-(-15)));
            yy = 0 + (((tickAnim - 0) / 25) * (-2.27868-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (1.35184-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 11.14572 + (((tickAnim - 25) / 25) * (-15-(11.14572)));
            yy = -2.27868 + (((tickAnim - 25) / 25) * (0-(-2.27868)));
            zz = 1.35184 + (((tickAnim - 25) / 25) * (0-(1.35184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = -19.25 + (((tickAnim - 0) / 25) * (17.9935-(-19.25)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.00919-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.73763-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 17.9935 + (((tickAnim - 25) / 13) * (7.8803-(17.9935)));
            yy = -1.00919 + (((tickAnim - 25) / 13) * (-0.47095-(-1.00919)));
            zz = 0.73763 + (((tickAnim - 25) / 13) * (0.34423-(0.73763)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 7.8803 + (((tickAnim - 38) / 12) * (-19.25-(7.8803)));
            yy = -0.47095 + (((tickAnim - 38) / 12) * (0-(-0.47095)));
            zz = 0.34423 + (((tickAnim - 38) / 12) * (0-(0.34423)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 13 + (((tickAnim - 0) / 25) * (13.0288-(13)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.7837-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (4.45808-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 13.0288 + (((tickAnim - 25) / 9) * (-35.35388-(13.0288)));
            yy = -1.7837 + (((tickAnim - 25) / 9) * (-1.30804-(-1.7837)));
            zz = 4.45808 + (((tickAnim - 25) / 9) * (3.26926-(4.45808)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -35.35388 + (((tickAnim - 34) / 4) * (-42.23656-(-35.35388)));
            yy = -1.30804 + (((tickAnim - 34) / 4) * (-0.83239-(-1.30804)));
            zz = 3.26926 + (((tickAnim - 34) / 4) * (2.08044-(3.26926)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -42.23656 + (((tickAnim - 38) / 12) * (13-(-42.23656)));
            yy = -0.83239 + (((tickAnim - 38) / 12) * (0-(-0.83239)));
            zz = 2.08044 + (((tickAnim - 38) / 12) * (0-(2.08044)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 22 + (((tickAnim - 0) / 11) * (-8.5-(22)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -8.5 + (((tickAnim - 11) / 14) * (17.25-(-8.5)));
            yy = 0 + (((tickAnim - 11) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 17.25 + (((tickAnim - 25) / 7) * (64.7852-(17.25)));
            yy = 0 + (((tickAnim - 25) / 7) * (9.65148-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (-2.25093-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 64.7852 + (((tickAnim - 32) / 6) * (66.38997-(64.7852)));
            yy = 9.65148 + (((tickAnim - 32) / 6) * (-0.84513-(9.65148)));
            zz = -2.25093 + (((tickAnim - 32) / 6) * (1.22458-(-2.25093)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 66.38997 + (((tickAnim - 38) / 8) * (25.44969-(66.38997)));
            yy = -0.84513 + (((tickAnim - 38) / 8) * (-0.25704-(-0.84513)));
            zz = 1.22458 + (((tickAnim - 38) / 8) * (0.37245-(1.22458)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 25.44969 + (((tickAnim - 46) / 4) * (22-(25.44969)));
            yy = -0.25704 + (((tickAnim - 46) / 4) * (0-(-0.25704)));
            zz = 0.37245 + (((tickAnim - 46) / 4) * (0-(0.37245)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (1.35-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (-0.495-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 1.35 + (((tickAnim - 32) / 6) * (0-(1.35)));
            zz = -0.495 + (((tickAnim - 32) / 6) * (-0.15-(-0.495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (-4.25-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -4.25 + (((tickAnim - 25) / 25) * (0-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*-5 + (((tickAnim - 10) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*-5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5) + (((tickAnim - 10) / 12) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-120))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+120))*0.5 + (((tickAnim - 22) / 18) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+120))*0.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-120))*-2.5) + (((tickAnim - 22) / 18) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-120))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-5 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+60))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+60))*0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-60))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-50))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10 + (((tickAnim - 10) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5))*-10)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-50))*5) + (((tickAnim - 10) / 12) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-50))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5 + (((tickAnim - 22) / 18) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2))*0.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5) + (((tickAnim - 22) / 18) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5 + (((tickAnim - 10) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-60))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5) + (((tickAnim - 10) / 12) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5 + (((tickAnim - 22) / 18) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-60))*0.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5) + (((tickAnim - 22) / 18) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+50))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5 + (((tickAnim - 10) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5-120))*-2.5)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+50))*5) + (((tickAnim - 10) / 12) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+50))*5)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5 + (((tickAnim - 22) / 18) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2-120))*0.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5) + (((tickAnim - 22) / 18) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5) + (((tickAnim - 10) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5) + (((tickAnim - 20) / 20) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2-30))*-5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+30))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*4/2+30))*-0.5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5) + (((tickAnim - 0) / 10) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+120))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*-2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+120))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5 + (((tickAnim - 20) / 20) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5) + (((tickAnim - 0) / 10) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-2.5))));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.5+90))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+120))*2.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10 + (((tickAnim - 20) / 20) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+90))*-10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720*2/2-120))*-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


    }



    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;
        int animCycle = 65;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.01437-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-2.9476-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.55852-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -4.01437 + (((tickAnim - 15) / 23) * (-3.26437-(-4.01437)));
            yy = -2.9476 + (((tickAnim - 15) / 23) * (-2.9476-(-2.9476)));
            zz = 0.55852 + (((tickAnim - 15) / 23) * (0.55852-(0.55852)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -3.26437 + (((tickAnim - 38) / 7) * (3.73563-(-3.26437)));
            yy = -2.9476 + (((tickAnim - 38) / 7) * (-2.9476-(-2.9476)));
            zz = 0.55852 + (((tickAnim - 38) / 7) * (0.55852-(0.55852)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 3.73563 + (((tickAnim - 45) / 8) * (-2.26437-(3.73563)));
            yy = -2.9476 + (((tickAnim - 45) / 8) * (-2.9476-(-2.9476)));
            zz = 0.55852 + (((tickAnim - 45) / 8) * (0.55852-(0.55852)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -2.26437 + (((tickAnim - 53) / 12) * (0-(-2.26437)));
            yy = -2.9476 + (((tickAnim - 53) / 12) * (0-(-2.9476)));
            zz = 0.55852 + (((tickAnim - 53) / 12) * (0-(0.55852)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 2.125 + (((tickAnim - 15) / 23) * (2.45-(2.125)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 2.45 + (((tickAnim - 38) / 7) * (-3.1-(2.45)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = -3.1 + (((tickAnim - 45) / 8) * (-3.925-(-3.1)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = -3.925 + (((tickAnim - 53) / 12) * (0-(-3.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 4.75 + (((tickAnim - 15) / 23) * (5.5-(4.75)));
            yy = 3.75 + (((tickAnim - 15) / 23) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 5.5 + (((tickAnim - 38) / 7) * (4.75-(5.5)));
            yy = 3.75 + (((tickAnim - 38) / 7) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 4.75 + (((tickAnim - 45) / 8) * (3.75-(4.75)));
            yy = 3.75 + (((tickAnim - 45) / 8) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 3.75 + (((tickAnim - 53) / 12) * (0-(3.75)));
            yy = 3.75 + (((tickAnim - 53) / 12) * (0-(3.75)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (1.525-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 38) / 7) * (0-(0.225)));
            zz = 1.525 + (((tickAnim - 38) / 7) * (0-(1.525)));
        }
        else if (tickAnim >= 45 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (0.52-(5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0.52 + (((tickAnim - 20) / 18) * (8.25-(0.52)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 8.25 + (((tickAnim - 38) / 7) * (-6-(8.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -6 + (((tickAnim - 45) / 8) * (5-(-6)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 5 + (((tickAnim - 53) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.65-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0.65 + (((tickAnim - 15) / 23) * (0.85-(0.65)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0.85 + (((tickAnim - 38) / 7) * (0-(0.85)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0.575-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0.575 + (((tickAnim - 53) / 12) * (0-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 15) / 5) * (10.09-(11.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 10.09 + (((tickAnim - 20) / 18) * (-8-(10.09)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -8 + (((tickAnim - 38) / 7) * (9.25-(-8)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 9.25 + (((tickAnim - 45) / 8) * (13.25-(9.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 13.25 + (((tickAnim - 53) / 12) * (0-(13.25)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.325-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = -0.325 + (((tickAnim - 20) / 18) * (1.1-(-0.325)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 1.1 + (((tickAnim - 38) / 7) * (0-(1.1)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0.675-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0.675 + (((tickAnim - 53) / 12) * (0-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -23.25 + (((tickAnim - 15) / 5) * (-3.62-(-23.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -3.62 + (((tickAnim - 20) / 18) * (-18.02-(-3.62)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -18.02 + (((tickAnim - 38) / 7) * (1.25-(-18.02)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 1.25 + (((tickAnim - 45) / 8) * (-7.75-(1.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -7.75 + (((tickAnim - 53) / 12) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.945-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0.945 + (((tickAnim - 15) / 5) * (0-(0.945)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0.75-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0.75 + (((tickAnim - 38) / 7) * (0-(0.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5.25 + (((tickAnim - 15) / 5) * (-7.57589-(5.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (1.55017-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (1.22318-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = -7.57589 + (((tickAnim - 20) / 18) * (16.75934-(-7.57589)));
            yy = 1.55017 + (((tickAnim - 20) / 18) * (0.59657-(1.55017)));
            zz = 1.22318 + (((tickAnim - 20) / 18) * (2.09874-(1.22318)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 16.75934 + (((tickAnim - 38) / 7) * (-22.30355-(16.75934)));
            yy = 0.59657 + (((tickAnim - 38) / 7) * (6.20067-(0.59657)));
            zz = 2.09874 + (((tickAnim - 38) / 7) * (4.8927-(2.09874)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -22.30355 + (((tickAnim - 45) / 8) * (-14.25-(-22.30355)));
            yy = 6.20067 + (((tickAnim - 45) / 8) * (0-(6.20067)));
            zz = 4.8927 + (((tickAnim - 45) / 8) * (0-(4.8927)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -14.25 + (((tickAnim - 53) / 12) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.405-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.225 + (((tickAnim - 15) / 5) * (-0.15-(0.225)));
            zz = 0.405 + (((tickAnim - 15) / 5) * (-0.425-(0.405)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            yy = -0.15 + (((tickAnim - 20) / 18) * (0.51-(-0.15)));
            zz = -0.425 + (((tickAnim - 20) / 18) * (0.69-(-0.425)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            yy = 0.51 + (((tickAnim - 38) / 7) * (-0.3-(0.51)));
            zz = 0.69 + (((tickAnim - 38) / 7) * (-0.925-(0.69)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = -0.3 + (((tickAnim - 45) / 8) * (0-(-0.3)));
            zz = -0.925 + (((tickAnim - 45) / 8) * (0-(-0.925)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -10.75 + (((tickAnim - 16) / 18) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -10.75 + (((tickAnim - 34) / 4) * (-10.75-(-10.75)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -10.75 + (((tickAnim - 38) / 15) * (-4.25-(-10.75)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -4.25 + (((tickAnim - 53) / 12) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (40.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 40.5 + (((tickAnim - 16) / 4) * (0-(40.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 20) / 18) * (45-(0)));
            yy = 0 + (((tickAnim - 20) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 18) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 45 + (((tickAnim - 38) / 7) * (0-(45)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (23.75-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 23.75 + (((tickAnim - 53) / 5) * (28.5-(23.75)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 65) {
            xx = 28.5 + (((tickAnim - 58) / 7) * (0-(28.5)));
            yy = 0 + (((tickAnim - 58) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 5.25 + (((tickAnim - 45) / 8) * (10.25-(5.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            yy = 0.975 + (((tickAnim - 45) / 8) * (-0.025-(0.975)));
            zz = 0 + (((tickAnim - 45) / 8) * (0.95-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-8-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = -8 + (((tickAnim - 16) / 18) * (-5.5-(-8)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = -5.5 + (((tickAnim - 34) / 4) * (-3.25-(-5.5)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = -3.25 + (((tickAnim - 38) / 15) * (8-(-3.25)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 8 + (((tickAnim - 53) / 12) * (0-(8)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-1.025-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 16) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 37) * (0-(0)));
            zz = -1.025 + (((tickAnim - 16) / 37) * (-1.025-(-1.025)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = -1.025 + (((tickAnim - 53) / 12) * (0-(-1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-11.25-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = -11.25 + (((tickAnim - 16) / 18) * (-14.75-(-11.25)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = -14.75 + (((tickAnim - 34) / 4) * (-12.5-(-14.75)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = -12.5 + (((tickAnim - 38) / 6) * (0.75-(-12.5)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = 0.75 + (((tickAnim - 44) / 9) * (0.5-(0.75)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 0.5 + (((tickAnim - 53) / 12) * (0-(0.5)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 12.75 + (((tickAnim - 16) / 18) * (-0.25-(12.75)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 34) / 4) * (-5.25-(-0.25)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = -5.25 + (((tickAnim - 38) / 6) * (-5.37-(-5.25)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = -5.37 + (((tickAnim - 44) / 9) * (6.5-(-5.37)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 6.5 + (((tickAnim - 53) / 12) * (0-(6.5)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            yy = 10 + (((tickAnim - 16) / 18) * (0.25-(10)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 34) / 4) * (-5-(0.25)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = -5 + (((tickAnim - 38) / 6) * (-6.75-(-5)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = -6.75 + (((tickAnim - 44) / 9) * (9.5-(-6.75)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 9.5 + (((tickAnim - 53) / 12) * (0-(9.5)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (19-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 16) / 22) * (0-(0)));
            yy = 19 + (((tickAnim - 16) / 22) * (10.79-(19)));
            zz = 0 + (((tickAnim - 16) / 22) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 10.79 + (((tickAnim - 38) / 6) * (-16.73-(10.79)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            yy = -16.73 + (((tickAnim - 44) / 9) * (15.75-(-16.73)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            yy = 15.75 + (((tickAnim - 53) / 12) * (0-(15.75)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 26 + (((tickAnim - 16) / 18) * (25.5-(26)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 25.5 + (((tickAnim - 34) / 4) * (24.75-(25.5)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 24.75 + (((tickAnim - 38) / 5) * (-9.75-(24.75)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -9.75 + (((tickAnim - 43) / 3) * (-14.19323-(-9.75)));
            yy = 0 + (((tickAnim - 43) / 3) * (-0.04414-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0.26653-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -14.19323 + (((tickAnim - 46) / 7) * (-14.19323-(-14.19323)));
            yy = -0.04414 + (((tickAnim - 46) / 7) * (-0.04414-(-0.04414)));
            zz = 0.26653 + (((tickAnim - 46) / 7) * (0.26653-(0.26653)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -14.19323 + (((tickAnim - 53) / 12) * (0-(-14.19323)));
            yy = -0.04414 + (((tickAnim - 53) / 12) * (0-(-0.04414)));
            zz = 0.26653 + (((tickAnim - 53) / 12) * (0-(0.26653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20.68-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 20.68 + (((tickAnim - 8) / 8) * (-7-(20.68)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -7 + (((tickAnim - 16) / 18) * (-7-(-7)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -7 + (((tickAnim - 34) / 4) * (-7-(-7)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -7 + (((tickAnim - 38) / 5) * (20.25-(-7)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 20.25 + (((tickAnim - 43) / 3) * (-6.47014-(20.25)));
            yy = 0 + (((tickAnim - 43) / 3) * (-0.00412-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0.17016-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = -6.47014 + (((tickAnim - 46) / 7) * (1.25-(-6.47014)));
            yy = -0.00412 + (((tickAnim - 46) / 7) * (0-(-0.00412)));
            zz = 0.17016 + (((tickAnim - 46) / 7) * (0-(0.17016)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 1.25 + (((tickAnim - 53) / 6) * (32.12-(1.25)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = 32.12 + (((tickAnim - 59) / 6) * (0-(32.12)));
            yy = 0 + (((tickAnim - 59) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-45.39-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -45.39 + (((tickAnim - 8) / 8) * (15-(-45.39)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 15 + (((tickAnim - 16) / 18) * (15-(15)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 15 + (((tickAnim - 34) / 4) * (15-(15)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 15 + (((tickAnim - 38) / 5) * (-35.5-(15)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -35.5 + (((tickAnim - 43) / 3) * (6-(-35.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 6 + (((tickAnim - 46) / 7) * (16.75-(6)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 16.75 + (((tickAnim - 53) / 6) * (-11.88-(16.75)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = -11.88 + (((tickAnim - 59) / 6) * (0-(-11.88)));
            yy = 0 + (((tickAnim - 59) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (77.17-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 77.17 + (((tickAnim - 8) / 8) * (-30.25-(77.17)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -30.25 + (((tickAnim - 16) / 18) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -30.25 + (((tickAnim - 34) / 4) * (-30.25-(-30.25)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -30.25 + (((tickAnim - 38) / 5) * (70.5-(-30.25)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 70.5 + (((tickAnim - 43) / 3) * (12.5-(70.5)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 53) {
            xx = 12.5 + (((tickAnim - 46) / 7) * (-2.75-(12.5)));
            yy = 0 + (((tickAnim - 46) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 7) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = -2.75 + (((tickAnim - 53) / 6) * (64.88-(-2.75)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 65) {
            xx = 64.88 + (((tickAnim - 59) / 6) * (0-(64.88)));
            yy = 0 + (((tickAnim - 59) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-6.2203-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (2.84703-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.03477-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -6.2203 + (((tickAnim - 16) / 18) * (-6.7203-(-6.2203)));
            yy = 2.84703 + (((tickAnim - 16) / 18) * (2.84703-(2.84703)));
            zz = 0.03477 + (((tickAnim - 16) / 18) * (0.03477-(0.03477)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -6.7203 + (((tickAnim - 34) / 4) * (-6.7203-(-6.7203)));
            yy = 2.84703 + (((tickAnim - 34) / 4) * (2.84703-(2.84703)));
            zz = 0.03477 + (((tickAnim - 34) / 4) * (0.03477-(0.03477)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -6.7203 + (((tickAnim - 38) / 7) * (3.0297-(-6.7203)));
            yy = 2.84703 + (((tickAnim - 38) / 7) * (2.84703-(2.84703)));
            zz = 0.03477 + (((tickAnim - 38) / 7) * (0.03477-(0.03477)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 3.0297 + (((tickAnim - 45) / 8) * (9.0297-(3.0297)));
            yy = 2.84703 + (((tickAnim - 45) / 8) * (2.84703-(2.84703)));
            zz = 0.03477 + (((tickAnim - 45) / 8) * (0.03477-(0.03477)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 9.0297 + (((tickAnim - 53) / 12) * (0-(9.0297)));
            yy = 2.84703 + (((tickAnim - 53) / 12) * (0-(2.84703)));
            zz = 0.03477 + (((tickAnim - 53) / 12) * (0-(0.03477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 5.5 + (((tickAnim - 16) / 18) * (5.25-(5.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 5.25 + (((tickAnim - 34) / 4) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 5.25 + (((tickAnim - 38) / 7) * (0-(5.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 45) / 8) * (3-(0)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 3 + (((tickAnim - 53) / 12) * (0-(3)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = 9.25 + (((tickAnim - 16) / 18) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 9.25 + (((tickAnim - 34) / 4) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 9.25 + (((tickAnim - 38) / 7) * (17.77267-(9.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0.16591-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0.62989-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 17.77267 + (((tickAnim - 45) / 8) * (16.75-(17.77267)));
            yy = 0.16591 + (((tickAnim - 45) / 8) * (0-(0.16591)));
            zz = 0.62989 + (((tickAnim - 45) / 8) * (0-(0.62989)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = 16.75 + (((tickAnim - 53) / 12) * (0-(16.75)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 34) {
            xx = -4.5 + (((tickAnim - 16) / 18) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 16) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 18) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -4.5 + (((tickAnim - 34) / 4) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 34) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 4) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = -4.5 + (((tickAnim - 38) / 7) * (-23.25-(-4.5)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -23.25 + (((tickAnim - 45) / 8) * (-24.5-(-23.25)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 65) {
            xx = -24.5 + (((tickAnim - 53) / 12) * (0-(-24.5)));
            yy = 0 + (((tickAnim - 53) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animFishing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;

        int animCycle = 760;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.55209-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.9048-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.57+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 1.55209 + (((tickAnim - 15) / 35) * (-0.52217-(1.55209)));
            yy = -1.9048 + (((tickAnim - 15) / 35) * (-3.50673-(-1.9048)));
            zz = 0.57+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 15) / 35) * (0.48022-(0.57+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -0.52217 + (((tickAnim - 50) / 25) * (-0.52217-(-0.52217)));
            yy = -3.50673 + (((tickAnim - 50) / 25) * (-3.50673-(-3.50673)));
            zz = 0.48022 + (((tickAnim - 50) / 25) * (0.48022-(0.48022)));
        }
        else if (tickAnim >= 75 && tickAnim < 76) {
            xx = -0.52217 + (((tickAnim - 75) / 1) * (-5.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-0.52217)));
            yy = -3.50673 + (((tickAnim - 75) / 1) * (-3.50673-(-3.50673)));
            zz = 0.48022 + (((tickAnim - 75) / 1) * (0.48022-(0.48022)));
        }
        else if (tickAnim >= 76 && tickAnim < 100) {
            xx = -5.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 76) / 24) * (-11-(-5.7722+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -3.50673 + (((tickAnim - 76) / 24) * (0-(-3.50673)));
            zz = 0.48022 + (((tickAnim - 76) / 24) * (0-(0.48022)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = -11 + (((tickAnim - 100) / 70) * (-11-(-11)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = -11 + (((tickAnim - 170) / 29) * (0-(-11)));
            yy = 0 + (((tickAnim - 170) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 0 + (((tickAnim - 280) / 24) * (0.15043-(0)));
            yy = 0 + (((tickAnim - 280) / 24) * (2.85534-(0)));
            zz = 0 + (((tickAnim - 280) / 24) * (3.23166-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 0.15043 + (((tickAnim - 304) / 16) * (0-(0.15043)));
            yy = 2.85534 + (((tickAnim - 304) / 16) * (4.25-(2.85534)));
            zz = 3.23166 + (((tickAnim - 304) / 16) * (0-(3.23166)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            yy = 4.25 + (((tickAnim - 320) / 48) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 320) / 48) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 4.25 + (((tickAnim - 368) / 67) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            yy = 4.25 + (((tickAnim - 435) / 45) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 435) / 45) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 480) / 135) * (0-(0)));
            yy = 4.25 + (((tickAnim - 480) / 135) * (4.25-(4.25)));
            zz = 0 + (((tickAnim - 480) / 135) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = 4.25 + (((tickAnim - 615) / 3) * (6.25-(4.25)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (12.01388-(0)));
            yy = 6.25 + (((tickAnim - 618) / 2) * (7.49468-(6.25)));
            zz = 0 + (((tickAnim - 618) / 2) * (0.11601-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = 12.01388 + (((tickAnim - 620) / 2) * (17.3173-(12.01388)));
            yy = 7.49468 + (((tickAnim - 620) / 2) * (8.95341-(7.49468)));
            zz = 0.11601 + (((tickAnim - 620) / 2) * (0.50857-(0.11601)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = 17.3173 + (((tickAnim - 622) / 1) * (18.8173-(17.3173)));
            yy = 8.95341 + (((tickAnim - 622) / 1) * (8.95341-(8.95341)));
            zz = 0.50857 + (((tickAnim - 622) / 1) * (0.50857-(0.50857)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 18.8173 + (((tickAnim - 623) / 4) * (16.3173-(18.8173)));
            yy = 8.95341 + (((tickAnim - 623) / 4) * (8.95341-(8.95341)));
            zz = 0.50857 + (((tickAnim - 623) / 4) * (0.50857-(0.50857)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 16.3173 + (((tickAnim - 627) / 7) * (11.40235-(16.3173)));
            yy = 8.95341 + (((tickAnim - 627) / 7) * (1.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5-(8.95341)));
            zz = 0.50857 + (((tickAnim - 627) / 7) * (0.39532-(0.50857)));
        }
        else if (tickAnim >= 634 && tickAnim < 663) {
            xx = 11.40235 + (((tickAnim - 634) / 29) * (-2.3288+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(11.40235)));
            yy = 1.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 634) / 29) * (-9.53131-(1.4807+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
            zz = 0.39532 + (((tickAnim - 634) / 29) * (-0.24647-(0.39532)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -2.3288+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 663) / 10) * (-3.42885-(-2.3288+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = -9.53131 + (((tickAnim - 663) / 10) * (-9.53131-(-9.53131)));
            zz = -0.24647 + (((tickAnim - 663) / 10) * (-0.24647-(-0.24647)));
        }
        else if (tickAnim >= 673 && tickAnim < 687) {
            xx = -3.42885 + (((tickAnim - 673) / 14) * (-4.3288+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(-3.42885)));
            yy = -9.53131 + (((tickAnim - 673) / 14) * (-9.53131-(-9.53131)));
            zz = -0.24647 + (((tickAnim - 673) / 14) * (-0.24647-(-0.24647)));
        }
        else if (tickAnim >= 687 && tickAnim < 692) {
            xx = -4.3288+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 687) / 5) * (-4.8038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(-4.3288+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = -9.53131 + (((tickAnim - 687) / 5) * (-9.53131-(-9.53131)));
            zz = -0.24647 + (((tickAnim - 687) / 5) * (-0.24647-(-0.24647)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = -4.8038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 692) / 68) * (0-(-4.8038+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = -9.53131 + (((tickAnim - 692) / 68) * (0-(-9.53131)));
            zz = -0.24647 + (((tickAnim - 692) / 68) * (0-(-0.24647)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-1.4-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0.2-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.4 + (((tickAnim - 30) / 20) * (-1.4-(-1.4)));
            zz = 0.2 + (((tickAnim - 30) / 20) * (0.2-(0.2)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            yy = -1.4 + (((tickAnim - 50) / 25) * (-1.4-(-1.4)));
            zz = 0.2 + (((tickAnim - 50) / 25) * (0.2-(0.2)));
        }
        else if (tickAnim >= 75 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 75) / 1) * (0-(0)));
            yy = -1.4 + (((tickAnim - 75) / 1) * (-1.4-(-1.4)));
            zz = 0.2 + (((tickAnim - 75) / 1) * (0.2-(0.2)));
        }
        else if (tickAnim >= 76 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 76) / 94) * (0-(0)));
            yy = -1.4 + (((tickAnim - 76) / 94) * (-1.4-(-1.4)));
            zz = 0.2 + (((tickAnim - 76) / 94) * (0.2-(0.2)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 170) / 29) * (0-(0)));
            yy = -1.4 + (((tickAnim - 170) / 29) * (-1.4-(-1.4)));
            zz = 0.2 + (((tickAnim - 170) / 29) * (-4.95-(0.2)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = -1.4 + (((tickAnim - 199) / 81) * (-1.4-(-1.4)));
            zz = -4.95 + (((tickAnim - 199) / 81) * (-4.95-(-4.95)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 280) / 40) * (-1.25-(0)));
            yy = -1.4 + (((tickAnim - 280) / 40) * (-1.4-(-1.4)));
            zz = -4.95 + (((tickAnim - 280) / 40) * (-8.875-(-4.95)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = -1.25 + (((tickAnim - 320) / 48) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 320) / 48) * (-1.4-(-1.4)));
            zz = -8.875 + (((tickAnim - 320) / 48) * (-8.475-(-8.875)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -1.25 + (((tickAnim - 368) / 67) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 368) / 67) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 368) / 67) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = -1.25 + (((tickAnim - 435) / 45) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 435) / 45) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 435) / 45) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 480 && tickAnim < 615) {
            xx = -1.25 + (((tickAnim - 480) / 135) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 480) / 135) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 480) / 135) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = -1.25 + (((tickAnim - 615) / 3) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 615) / 3) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 615) / 3) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = -1.25 + (((tickAnim - 618) / 2) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 618) / 2) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 618) / 2) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -1.25 + (((tickAnim - 620) / 2) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 620) / 2) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 620) / 2) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -1.25 + (((tickAnim - 622) / 1) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 622) / 1) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 622) / 1) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -1.25 + (((tickAnim - 623) / 4) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 623) / 4) * (-1.4-(-1.4)));
            zz = -8.475 + (((tickAnim - 623) / 4) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -1.25 + (((tickAnim - 627) / 7) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 627) / 7) * (-1.475-(-1.4)));
            zz = -8.475 + (((tickAnim - 627) / 7) * (-8.475-(-8.475)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -1.25 + (((tickAnim - 634) / 16) * (-1.25-(-1.25)));
            yy = -1.475 + (((tickAnim - 634) / 16) * (-1.4-(-1.475)));
            zz = -8.475 + (((tickAnim - 634) / 16) * (-7.155-(-8.475)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -1.25 + (((tickAnim - 650) / 13) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 650) / 13) * (-1.4-(-1.4)));
            zz = -7.155 + (((tickAnim - 650) / 13) * (-6.33-(-7.155)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -1.25 + (((tickAnim - 663) / 10) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 663) / 10) * (-1.4-(-1.4)));
            zz = -6.33 + (((tickAnim - 663) / 10) * (-6.33-(-6.33)));
        }
        else if (tickAnim >= 673 && tickAnim < 691) {
            xx = -1.25 + (((tickAnim - 673) / 18) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 673) / 18) * (-1.4-(-1.4)));
            zz = -6.33 + (((tickAnim - 673) / 18) * (-6.33-(-6.33)));
        }
        else if (tickAnim >= 691 && tickAnim < 692) {
            xx = -1.25 + (((tickAnim - 691) / 1) * (-1.25-(-1.25)));
            yy = -1.4 + (((tickAnim - 691) / 1) * (-1.4-(-1.4)));
            zz = -6.33 + (((tickAnim - 691) / 1) * (-6.13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(-6.33)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = -1.25 + (((tickAnim - 692) / 68) * (0-(-1.25)));
            yy = -1.4 + (((tickAnim - 692) / 68) * (0-(-1.4)));
            zz = -6.13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 692) / 68) * (0-(-6.13+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (4.05337-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.69364-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.83892-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 4.05337 + (((tickAnim - 30) / 20) * (5.94192-(4.05337)));
            yy = 1.69364 + (((tickAnim - 30) / 20) * (2.34358-(1.69364)));
            zz = 1.83892 + (((tickAnim - 30) / 20) * (-1.34692-(1.83892)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 5.94192 + (((tickAnim - 50) / 25) * (4.3218+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(5.94192)));
            yy = 2.34358 + (((tickAnim - 50) / 25) * (2.83191-(2.34358)));
            zz = -1.34692 + (((tickAnim - 50) / 25) * (-1.2394-(-1.34692)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 4.3218+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 75) / 25) * (-0.4113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(4.3218+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 2.83191 + (((tickAnim - 75) / 25) * (7.23269-(2.83191)));
            zz = -1.2394 + (((tickAnim - 75) / 25) * (2.4818-(-1.2394)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = -0.4113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 100) / 70) * (-6.5113-(-0.4113+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            yy = 7.23269 + (((tickAnim - 100) / 70) * (7.23269-(7.23269)));
            zz = 2.4818 + (((tickAnim - 100) / 70) * (2.4818-(2.4818)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = -6.5113 + (((tickAnim - 170) / 29) * (2.7387-(-6.5113)));
            yy = 7.23269 + (((tickAnim - 170) / 29) * (7.23269-(7.23269)));
            zz = 2.4818 + (((tickAnim - 170) / 29) * (2.4818-(2.4818)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 2.7387 + (((tickAnim - 199) / 81) * (3.9887-(2.7387)));
            yy = 7.23269 + (((tickAnim - 199) / 81) * (7.23269-(7.23269)));
            zz = 2.4818 + (((tickAnim - 199) / 81) * (2.4818-(2.4818)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 3.9887 + (((tickAnim - 280) / 24) * (6.43864-(3.9887)));
            yy = 7.23269 + (((tickAnim - 280) / 24) * (7.78514-(7.23269)));
            zz = 2.4818 + (((tickAnim - 280) / 24) * (2.3199+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(2.4818)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 6.43864 + (((tickAnim - 304) / 16) * (8.2387-(6.43864)));
            yy = 7.78514 + (((tickAnim - 304) / 16) * (7.23269-(7.78514)));
            zz = 2.3199+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 304) / 16) * (2.4818-(2.3199+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 8.2387 + (((tickAnim - 320) / 48) * (8.2387-(8.2387)));
            yy = 7.23269 + (((tickAnim - 320) / 48) * (7.23269-(7.23269)));
            zz = 2.4818 + (((tickAnim - 320) / 48) * (2.4818-(2.4818)));
        }
        else if (tickAnim >= 368 && tickAnim < 480) {
            xx = 8.2387 + (((tickAnim - 368) / 112) * (8.7387-(8.2387)));
            yy = 7.23269 + (((tickAnim - 368) / 112) * (7.23269-(7.23269)));
            zz = 2.4818 + (((tickAnim - 368) / 112) * (2.4818-(2.4818)));
        }
        else if (tickAnim >= 480 && tickAnim < 615) {
            xx = 8.7387 + (((tickAnim - 480) / 135) * (5.4887-(8.7387)));
            yy = 7.23269 + (((tickAnim - 480) / 135) * (7.23269-(7.23269)));
            zz = 2.4818 + (((tickAnim - 480) / 135) * (2.4818-(2.4818)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 5.4887 + (((tickAnim - 615) / 3) * (3.71977-(5.4887)));
            yy = 7.23269 + (((tickAnim - 615) / 3) * (6.24553-(7.23269)));
            zz = 2.4818 + (((tickAnim - 615) / 3) * (2.31877-(2.4818)));
        }
        else if (tickAnim >= 618 && tickAnim < 623) {
            xx = 3.71977 + (((tickAnim - 618) / 5) * (13.51708-(3.71977)));
            yy = 6.24553 + (((tickAnim - 618) / 5) * (9.81132-(6.24553)));
            zz = 2.31877 + (((tickAnim - 618) / 5) * (3.43081-(2.31877)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 13.51708 + (((tickAnim - 623) / 4) * (10.26708-(13.51708)));
            yy = 9.81132 + (((tickAnim - 623) / 4) * (9.81132-(9.81132)));
            zz = 3.43081 + (((tickAnim - 623) / 4) * (3.43081-(3.43081)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 10.26708 + (((tickAnim - 627) / 7) * (4.51708-(10.26708)));
            yy = 9.81132 + (((tickAnim - 627) / 7) * (8.43632-(9.81132)));
            zz = 3.43081 + (((tickAnim - 627) / 7) * (3.43081-(3.43081)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 4.51708 + (((tickAnim - 634) / 16) * (-6.92355-(4.51708)));
            yy = 8.43632 + (((tickAnim - 634) / 16) * (-1.6321-(8.43632)));
            zz = 3.43081 + (((tickAnim - 634) / 16) * (-2.33827-(3.43081)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -6.92355 + (((tickAnim - 650) / 13) * (-1.9485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5-(-6.92355)));
            yy = -1.6321 + (((tickAnim - 650) / 13) * (-1.6321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(-1.6321)));
            zz = -2.33827 + (((tickAnim - 650) / 13) * (-2.33827-(-2.33827)));
        }
        else if (tickAnim >= 663 && tickAnim < 683) {
            xx = -1.9485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5 + (((tickAnim - 663) / 20) * (-4.42355-(-1.9485+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*5)));
            yy = -1.6321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 663) / 20) * (-1.6321-(-1.6321+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            zz = -2.33827 + (((tickAnim - 663) / 20) * (-2.33827-(-2.33827)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = -4.42355 + (((tickAnim - 683) / 9) * (-1.9985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*8-(-4.42355)));
            yy = -1.6321 + (((tickAnim - 683) / 9) * (-1.6321-(-1.6321)));
            zz = -2.33827 + (((tickAnim - 683) / 9) * (-2.33827-(-2.33827)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = -1.9985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*8 + (((tickAnim - 692) / 68) * (0-(-1.9985+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*8)));
            yy = -1.6321 + (((tickAnim - 692) / 68) * (0-(-1.6321)));
            zz = -2.33827 + (((tickAnim - 692) / 68) * (0-(-2.33827)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.775-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 623) {
            xx = 0 + (((tickAnim - 50) / 573) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 573) * (0-(0)));
            zz = 0.775 + (((tickAnim - 50) / 573) * (1.645-(0.775)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 623) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 623) / 4) * (0-(0)));
            zz = 1.645 + (((tickAnim - 623) / 4) * (1.645-(1.645)));
        }
        else if (tickAnim >= 627 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 627) / 133) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 133) * (0-(0)));
            zz = 1.645 + (((tickAnim - 627) / 133) * (0-(1.645)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0.85753-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (2.83378-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.22937-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.85753 + (((tickAnim - 30) / 20) * (6.67549-(0.85753)));
            yy = 2.83378 + (((tickAnim - 30) / 20) * (3.26215-(2.83378)));
            zz = 2.22937 + (((tickAnim - 30) / 20) * (-1.2445-(2.22937)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 6.67549 + (((tickAnim - 50) / 25) * (6.74783-(6.67549)));
            yy = 3.26215 + (((tickAnim - 50) / 25) * (4.35604-(3.26215)));
            zz = -1.2445 + (((tickAnim - 50) / 25) * (-0.27887-(-1.2445)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 6.74783 + (((tickAnim - 75) / 25) * (3.49783-(6.74783)));
            yy = 4.35604 + (((tickAnim - 75) / 25) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 75) / 25) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 100 && tickAnim < 280) {
            xx = 3.49783 + (((tickAnim - 100) / 180) * (6.49783-(3.49783)));
            yy = 4.35604 + (((tickAnim - 100) / 180) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 100) / 180) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = 6.49783 + (((tickAnim - 280) / 24) * (6.89291-(6.49783)));
            yy = 4.35604 + (((tickAnim - 280) / 24) * (4.12186-(4.35604)));
            zz = -0.27887 + (((tickAnim - 280) / 24) * (0.95564-(-0.27887)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = 6.89291 + (((tickAnim - 304) / 16) * (5.74783-(6.89291)));
            yy = 4.12186 + (((tickAnim - 304) / 16) * (4.35604-(4.12186)));
            zz = 0.95564 + (((tickAnim - 304) / 16) * (-0.27887-(0.95564)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 5.74783 + (((tickAnim - 320) / 48) * (5.74783-(5.74783)));
            yy = 4.35604 + (((tickAnim - 320) / 48) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 320) / 48) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 368 && tickAnim < 480) {
            xx = 5.74783 + (((tickAnim - 368) / 112) * (5.99783-(5.74783)));
            yy = 4.35604 + (((tickAnim - 368) / 112) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 368) / 112) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 480 && tickAnim < 560) {
            xx = 5.99783 + (((tickAnim - 480) / 80) * (3.74783-(5.99783)));
            yy = 4.35604 + (((tickAnim - 480) / 80) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 480) / 80) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = 3.74783 + (((tickAnim - 560) / 55) * (3.74783-(3.74783)));
            yy = 4.35604 + (((tickAnim - 560) / 55) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 560) / 55) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 3.74783 + (((tickAnim - 615) / 3) * (3.74783-(3.74783)));
            yy = 4.35604 + (((tickAnim - 615) / 3) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 615) / 3) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 3.74783 + (((tickAnim - 618) / 2) * (10.99783-(3.74783)));
            yy = 4.35604 + (((tickAnim - 618) / 2) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 618) / 2) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 620 && tickAnim < 623) {
            xx = 10.99783 + (((tickAnim - 620) / 3) * (2.91903-(10.99783)));
            yy = 4.35604 + (((tickAnim - 620) / 3) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 620) / 3) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 2.91903 + (((tickAnim - 623) / 4) * (2.91903-(2.91903)));
            yy = 4.35604 + (((tickAnim - 623) / 4) * (4.35604-(4.35604)));
            zz = -0.27887 + (((tickAnim - 623) / 4) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 2.91903 + (((tickAnim - 627) / 7) * (5.16903-(2.91903)));
            yy = 4.35604 + (((tickAnim - 627) / 7) * (2.98104-(4.35604)));
            zz = -0.27887 + (((tickAnim - 627) / 7) * (-0.27887-(-0.27887)));
        }
        else if (tickAnim >= 634 && tickAnim < 663) {
            xx = 5.16903 + (((tickAnim - 634) / 29) * (1.246+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8-(5.16903)));
            yy = 2.98104 + (((tickAnim - 634) / 29) * (-4.59287-(2.98104)));
            zz = -0.27887 + (((tickAnim - 634) / 29) * (-1.2374-(-0.27887)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 1.246+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8 + (((tickAnim - 663) / 10) * (-8.104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(1.246+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*8)));
            yy = -4.59287 + (((tickAnim - 663) / 10) * (-4.59287-(-4.59287)));
            zz = -1.2374 + (((tickAnim - 663) / 10) * (-1.2374-(-1.2374)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = -8.104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 673) / 19) * (-1.229+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5-(-8.104+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = -4.59287 + (((tickAnim - 673) / 19) * (-4.59287-(-4.59287)));
            zz = -1.2374 + (((tickAnim - 673) / 19) * (-1.2374-(-1.2374)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = -1.229+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5 + (((tickAnim - 692) / 68) * (0-(-1.229+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-5)));
            yy = -4.59287 + (((tickAnim - 692) / 68) * (0-(-4.59287)));
            zz = -1.2374 + (((tickAnim - 692) / 68) * (0-(-1.2374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0.75-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 50) / 710) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 710) * (0-(0)));
            zz = 0.75 + (((tickAnim - 50) / 710) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.509+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.50757-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.77734-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 75) {
            xx = -6.509+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5 + (((tickAnim - 15) / 60) * (-6.0369+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-6.509+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*5)));
            yy = 2.50757 + (((tickAnim - 15) / 60) * (5.9265-(2.50757)));
            zz = -0.77734 + (((tickAnim - 15) / 60) * (0.28351-(-0.77734)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = -6.0369+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 75) / 13) * (-6.15506-(-6.0369+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 5.9265 + (((tickAnim - 75) / 13) * (7.72402-(5.9265)));
            zz = 0.28351 + (((tickAnim - 75) / 13) * (1.58894-(0.28351)));
        }
        else if (tickAnim >= 88 && tickAnim < 100) {
            xx = -6.15506 + (((tickAnim - 88) / 12) * (-4.052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-6.15506)));
            yy = 7.72402 + (((tickAnim - 88) / 12) * (6.6429-(7.72402)));
            zz = 1.58894 + (((tickAnim - 88) / 12) * (2.42933-(1.58894)));
        }
        else if (tickAnim >= 100 && tickAnim < 126) {
            xx = -4.052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 100) / 26) * (-4.052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-4.052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 6.6429 + (((tickAnim - 100) / 26) * (6.6429-(6.6429)));
            zz = 2.42933 + (((tickAnim - 100) / 26) * (2.42933-(2.42933)));
        }
        else if (tickAnim >= 126 && tickAnim < 133) {
            xx = -4.052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 126) / 7) * (-4.2132+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-4.052+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 6.6429 + (((tickAnim - 126) / 7) * (9.33411-(6.6429)));
            zz = 2.42933 + (((tickAnim - 126) / 7) * (1.82913-(2.42933)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = -4.2132+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 133) / 5) * (-4.1672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-4.2132+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 9.33411 + (((tickAnim - 133) / 5) * (9.4049-(9.33411)));
            zz = 1.82913 + (((tickAnim - 133) / 5) * (2.10639-(1.82913)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -4.1672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 138) / 5) * (-4.0564+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(-4.1672+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 9.4049 + (((tickAnim - 138) / 5) * (9.70127-(9.4049)));
            zz = 2.10639 + (((tickAnim - 138) / 5) * (1.49307-(2.10639)));
        }
        else if (tickAnim >= 143 && tickAnim < 170) {
            xx = -4.0564+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 143) / 27) * (1.6344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(-4.0564+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 9.70127 + (((tickAnim - 143) / 27) * (9.77484-(9.70127)));
            zz = 1.49307 + (((tickAnim - 143) / 27) * (1.76191-(1.49307)));
        }
        else if (tickAnim >= 170 && tickAnim < 246) {
            xx = 1.6344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 170) / 76) * (5.3344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(1.6344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 9.77484 + (((tickAnim - 170) / 76) * (9.77484-(9.77484)));
            zz = 1.76191 + (((tickAnim - 170) / 76) * (1.76191-(1.76191)));
        }
        else if (tickAnim >= 246 && tickAnim < 320) {
            xx = 5.3344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 246) / 74) * (14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(5.3344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 9.77484 + (((tickAnim - 246) / 74) * (9.77484-(9.77484)));
            zz = 1.76191 + (((tickAnim - 246) / 74) * (1.76191-(1.76191)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 320) / 15) * (14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 9.77484 + (((tickAnim - 320) / 15) * (9.77484-(9.77484)));
            zz = 1.76191 + (((tickAnim - 320) / 15) * (1.76191-(1.76191)));
        }
        else if (tickAnim >= 335 && tickAnim < 341) {
            xx = 14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 335) / 6) * (15.82268-(14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = 9.77484 + (((tickAnim - 335) / 6) * (9.52484-(9.77484)));
            zz = 1.76191 + (((tickAnim - 335) / 6) * (1.76128-(1.76191)));
        }
        else if (tickAnim >= 341 && tickAnim < 351) {
            xx = 15.82268 + (((tickAnim - 341) / 10) * (15.82268-(15.82268)));
            yy = 9.52484 + (((tickAnim - 341) / 10) * (9.52484-(9.52484)));
            zz = 1.76128 + (((tickAnim - 341) / 10) * (1.76128-(1.76128)));
        }
        else if (tickAnim >= 351 && tickAnim < 368) {
            xx = 15.82268 + (((tickAnim - 351) / 17) * (14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(15.82268)));
            yy = 9.52484 + (((tickAnim - 351) / 17) * (9.77484-(9.52484)));
            zz = 1.76128 + (((tickAnim - 351) / 17) * (1.76191-(1.76128)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 368) / 67) * (14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 9.77484 + (((tickAnim - 368) / 67) * (9.77484-(9.77484)));
            zz = 1.76191 + (((tickAnim - 368) / 67) * (1.76191-(1.76191)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = 14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 435) / 10) * (12.79175-(14.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 9.77484 + (((tickAnim - 435) / 10) * (9.70261-(9.77484)));
            zz = 1.76191 + (((tickAnim - 435) / 10) * (5.5165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(1.76191)));
        }
        else if (tickAnim >= 445 && tickAnim < 453) {
            xx = 12.79175 + (((tickAnim - 445) / 8) * (12.79175-(12.79175)));
            yy = 9.70261 + (((tickAnim - 445) / 8) * (9.7583-(9.70261)));
            zz = 5.5165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 445) / 8) * (5.3666+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*5-(5.5165+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
        }
        else if (tickAnim >= 453 && tickAnim < 480) {
            xx = 12.79175 + (((tickAnim - 453) / 27) * (12.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(12.79175)));
            yy = 9.7583 + (((tickAnim - 453) / 27) * (9.77484-(9.7583)));
            zz = 5.3666+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*5 + (((tickAnim - 453) / 27) * (1.76191-(5.3666+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+40))*5)));
        }
        else if (tickAnim >= 480 && tickAnim < 495) {
            xx = 12.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 480) / 15) * (12.5219+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(12.2594+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 9.77484 + (((tickAnim - 480) / 15) * (8.17181-(9.77484)));
            zz = 1.76191 + (((tickAnim - 480) / 15) * (3.61192-(1.76191)));
        }
        else if (tickAnim >= 495 && tickAnim < 500) {
            xx = 12.5219+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 495) / 5) * (12.5193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(12.5219+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 495) / 5) * (8.42116-(8.17181)));
            zz = 3.61192 + (((tickAnim - 495) / 5) * (3.59366-(3.61192)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 12.5193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 500) / 60) * (14.0219+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(12.5193+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.42116 + (((tickAnim - 500) / 60) * (8.17181-(8.42116)));
            zz = 3.59366 + (((tickAnim - 500) / 60) * (3.61192-(3.59366)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = 14.0219+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 560) / 55) * (14.7719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(14.0219+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 560) / 55) * (8.17181-(8.17181)));
            zz = 3.61192 + (((tickAnim - 560) / 55) * (3.61192-(3.61192)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 14.7719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 615) / 3) * (16.7719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(14.7719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 615) / 3) * (8.17181-(8.17181)));
            zz = 3.61192 + (((tickAnim - 615) / 3) * (3.61192-(3.61192)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 16.7719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 618) / 2) * (-5.4781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(16.7719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 618) / 2) * (8.17181-(8.17181)));
            zz = 3.61192 + (((tickAnim - 618) / 2) * (3.61192-(3.61192)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -5.4781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 620) / 2) * (13.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(-5.4781+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 620) / 2) * (8.17181-(8.17181)));
            zz = 3.61192 + (((tickAnim - 620) / 2) * (3.61192-(3.61192)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = 13.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 622) / 1) * (13.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(13.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 622) / 1) * (8.17181-(8.17181)));
            zz = 3.61192 + (((tickAnim - 622) / 1) * (3.61192-(3.61192)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 13.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 623) / 4) * (15.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(13.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 623) / 4) * (8.17181-(8.17181)));
            zz = 3.61192 + (((tickAnim - 623) / 4) * (3.61192-(3.61192)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 15.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 627) / 7) * (20.6536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5-(15.2719+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 8.17181 + (((tickAnim - 627) / 7) * (7.84291-(8.17181)));
            zz = 3.61192 + (((tickAnim - 627) / 7) * (-0.56427-(3.61192)));
        }
        else if (tickAnim >= 634 && tickAnim < 663) {
            xx = 20.6536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5 + (((tickAnim - 634) / 29) * (-3.0464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5-(20.6536+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5)));
            yy = 7.84291 + (((tickAnim - 634) / 29) * (4.91791-(7.84291)));
            zz = -0.56427 + (((tickAnim - 634) / 29) * (-0.56427-(-0.56427)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -3.0464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5 + (((tickAnim - 663) / 10) * (-2.2214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*8-(-3.0464+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-5)));
            yy = 4.91791 + (((tickAnim - 663) / 10) * (4.91791-(4.91791)));
            zz = -0.56427 + (((tickAnim - 663) / 10) * (-0.56427-(-0.56427)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = -2.2214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*8 + (((tickAnim - 673) / 10) * (2.4036+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(-2.2214+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*8)));
            yy = 4.91791 + (((tickAnim - 673) / 10) * (4.91791-(4.91791)));
            zz = -0.56427 + (((tickAnim - 673) / 10) * (-0.56427-(-0.56427)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 2.4036+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 683) / 9) * (0.1036+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-3-(2.4036+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            yy = 4.91791 + (((tickAnim - 683) / 9) * (4.91791-(4.91791)));
            zz = -0.56427 + (((tickAnim - 683) / 9) * (-0.56427-(-0.56427)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = 0.1036+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-3 + (((tickAnim - 692) / 68) * (0-(0.1036+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-3)));
            yy = 4.91791 + (((tickAnim - 692) / 68) * (0-(4.91791)));
            zz = -0.56427 + (((tickAnim - 692) / 68) * (0-(-0.56427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (1.05-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 75) / 685) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 685) * (0-(0)));
            zz = 1.05 + (((tickAnim - 75) / 685) * (0-(1.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.84848-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.90066-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.10863-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = -18.84848 + (((tickAnim - 15) / 35) * (-26.69696-(-18.84848)));
            yy = 1.90066 + (((tickAnim - 15) / 35) * (3.80132-(1.90066)));
            zz = 0.10863 + (((tickAnim - 15) / 35) * (0.21726-(0.10863)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -26.69696 + (((tickAnim - 50) / 25) * (-19.2358-(-26.69696)));
            yy = 3.80132 + (((tickAnim - 50) / 25) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 50) / 25) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = -19.2358 + (((tickAnim - 75) / 13) * (-31.0858+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-20-(-19.2358)));
            yy = 3.80132 + (((tickAnim - 75) / 13) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 75) / 13) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 88 && tickAnim < 107) {
            xx = -31.0858+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-20 + (((tickAnim - 88) / 19) * (-13.99801-(-31.0858+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+30))*-20)));
            yy = 3.80132 + (((tickAnim - 88) / 19) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 88) / 19) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 107 && tickAnim < 133) {
            xx = -13.99801 + (((tickAnim - 107) / 26) * (-15.19696-(-13.99801)));
            yy = 3.80132 + (((tickAnim - 107) / 26) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 107) / 26) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 133 && tickAnim < 138) {
            xx = -15.19696 + (((tickAnim - 133) / 5) * (-15.19696-(-15.19696)));
            yy = 3.80132 + (((tickAnim - 133) / 5) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 133) / 5) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 138 && tickAnim < 143) {
            xx = -15.19696 + (((tickAnim - 138) / 5) * (-15.19696-(-15.19696)));
            yy = 3.80132 + (((tickAnim - 138) / 5) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 138) / 5) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 143 && tickAnim < 170) {
            xx = -15.19696 + (((tickAnim - 143) / 27) * (-14.69696-(-15.19696)));
            yy = 3.80132 + (((tickAnim - 143) / 27) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 143) / 27) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = -14.69696 + (((tickAnim - 170) / 29) * (-12.347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*2-(-14.69696)));
            yy = 3.80132 + (((tickAnim - 170) / 29) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 170) / 29) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 199 && tickAnim < 320) {
            xx = -12.347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*2 + (((tickAnim - 199) / 121) * (-26.94696-(-12.347+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*2)));
            yy = 3.80132 + (((tickAnim - 199) / 121) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 199) / 121) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = -26.94696 + (((tickAnim - 320) / 15) * (-26.94696-(-26.94696)));
            yy = 3.80132 + (((tickAnim - 320) / 15) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 320) / 15) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 335 && tickAnim < 341) {
            xx = -26.94696 + (((tickAnim - 335) / 6) * (-26.92322-(-26.94696)));
            yy = 3.80132 + (((tickAnim - 335) / 6) * (1.65307-(3.80132)));
            zz = 0.21726 + (((tickAnim - 335) / 6) * (0.31485-(0.21726)));
        }
        else if (tickAnim >= 341 && tickAnim < 351) {
            xx = -26.92322 + (((tickAnim - 341) / 10) * (-26.92322-(-26.92322)));
            yy = 1.65307 + (((tickAnim - 341) / 10) * (1.65307-(1.65307)));
            zz = 0.31485 + (((tickAnim - 341) / 10) * (0.31485-(0.31485)));
        }
        else if (tickAnim >= 351 && tickAnim < 368) {
            xx = -26.92322 + (((tickAnim - 351) / 17) * (-26.94696-(-26.92322)));
            yy = 1.65307 + (((tickAnim - 351) / 17) * (3.80132-(1.65307)));
            zz = 0.31485 + (((tickAnim - 351) / 17) * (0.21726-(0.31485)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -26.94696 + (((tickAnim - 368) / 67) * (-26.94696-(-26.94696)));
            yy = 3.80132 + (((tickAnim - 368) / 67) * (3.80132-(3.80132)));
            zz = 0.21726 + (((tickAnim - 368) / 67) * (0.21726-(0.21726)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = -26.94696 + (((tickAnim - 435) / 10) * (-27.2398-(-26.94696)));
            yy = 3.80132 + (((tickAnim - 435) / 10) * (4.90371-(3.80132)));
            zz = 0.21726 + (((tickAnim - 435) / 10) * (-1.61755-(0.21726)));
        }
        else if (tickAnim >= 445 && tickAnim < 453) {
            xx = -27.2398 + (((tickAnim - 445) / 8) * (-27.2398-(-27.2398)));
            yy = 4.90371 + (((tickAnim - 445) / 8) * (5.32871-(4.90371)));
            zz = -1.61755 + (((tickAnim - 445) / 8) * (-1.61755-(-1.61755)));
        }
        else if (tickAnim >= 453 && tickAnim < 480) {
            xx = -27.2398 + (((tickAnim - 453) / 27) * (-27.69696-(-27.2398)));
            yy = 5.32871 + (((tickAnim - 453) / 27) * (3.80132-(5.32871)));
            zz = -1.61755 + (((tickAnim - 453) / 27) * (0.21726-(-1.61755)));
        }
        else if (tickAnim >= 480 && tickAnim < 495) {
            xx = -27.69696 + (((tickAnim - 480) / 15) * (-28.15038-(-27.69696)));
            yy = 3.80132 + (((tickAnim - 480) / 15) * (1.88676-(3.80132)));
            zz = 0.21726 + (((tickAnim - 480) / 15) * (1.79132-(0.21726)));
        }
        else if (tickAnim >= 495 && tickAnim < 500) {
            xx = -28.15038 + (((tickAnim - 495) / 5) * (-28.14101-(-28.15038)));
            yy = 1.88676 + (((tickAnim - 495) / 5) * (1.50009-(1.88676)));
            zz = 1.79132 + (((tickAnim - 495) / 5) * (2.10846-(1.79132)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = -28.14101 + (((tickAnim - 500) / 60) * (-28.15038-(-28.14101)));
            yy = 1.50009 + (((tickAnim - 500) / 60) * (1.88676-(1.50009)));
            zz = 2.10846 + (((tickAnim - 500) / 60) * (1.79132-(2.10846)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = -28.15038 + (((tickAnim - 560) / 55) * (-28.15038-(-28.15038)));
            yy = 1.88676 + (((tickAnim - 560) / 55) * (1.88676-(1.88676)));
            zz = 1.79132 + (((tickAnim - 560) / 55) * (1.79132-(1.79132)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = -28.15038 + (((tickAnim - 615) / 3) * (-35.40038-(-28.15038)));
            yy = 1.88676 + (((tickAnim - 615) / 3) * (1.88676-(1.88676)));
            zz = 1.79132 + (((tickAnim - 615) / 3) * (1.79132-(1.79132)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = -35.40038 + (((tickAnim - 618) / 2) * (-41.65038-(-35.40038)));
            yy = 1.88676 + (((tickAnim - 618) / 2) * (1.88676-(1.88676)));
            zz = 1.79132 + (((tickAnim - 618) / 2) * (1.79132-(1.79132)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -41.65038 + (((tickAnim - 620) / 2) * (-11.65038-(-41.65038)));
            yy = 1.88676 + (((tickAnim - 620) / 2) * (1.88676-(1.88676)));
            zz = 1.79132 + (((tickAnim - 620) / 2) * (1.79132-(1.79132)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -11.65038 + (((tickAnim - 622) / 1) * (2.34962-(-11.65038)));
            yy = 1.88676 + (((tickAnim - 622) / 1) * (1.88676-(1.88676)));
            zz = 1.79132 + (((tickAnim - 622) / 1) * (1.79132-(1.79132)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 2.34962 + (((tickAnim - 623) / 4) * (7.59962-(2.34962)));
            yy = 1.88676 + (((tickAnim - 623) / 4) * (1.88676-(1.88676)));
            zz = 1.79132 + (((tickAnim - 623) / 4) * (1.79132-(1.79132)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 7.59962 + (((tickAnim - 627) / 7) * (-8.16376-(7.59962)));
            yy = 1.88676 + (((tickAnim - 627) / 7) * (0.5897-(1.88676)));
            zz = 1.79132 + (((tickAnim - 627) / 7) * (2.58091-(1.79132)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -8.16376 + (((tickAnim - 634) / 16) * (-35.4159-(-8.16376)));
            yy = 0.5897 + (((tickAnim - 634) / 16) * (-0.71749-(0.5897)));
            zz = 2.58091 + (((tickAnim - 634) / 16) * (5.67772-(2.58091)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -35.4159 + (((tickAnim - 650) / 13) * (-6.8909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15-(-35.4159)));
            yy = -0.71749 + (((tickAnim - 650) / 13) * (-0.71749-(-0.71749)));
            zz = 5.67772 + (((tickAnim - 650) / 13) * (5.67772-(5.67772)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -6.8909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15 + (((tickAnim - 663) / 10) * (-8.7659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*10-(-6.8909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*15)));
            yy = -0.71749 + (((tickAnim - 663) / 10) * (-0.71749-(-0.71749)));
            zz = 5.67772 + (((tickAnim - 663) / 10) * (5.67772-(5.67772)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = -8.7659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*10 + (((tickAnim - 673) / 10) * (-14.7909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*15-(-8.7659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*10)));
            yy = -0.71749 + (((tickAnim - 673) / 10) * (-0.71749-(-0.71749)));
            zz = 5.67772 + (((tickAnim - 673) / 10) * (5.67772-(5.67772)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = -14.7909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*15 + (((tickAnim - 683) / 9) * (-16.1159+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*15-(-14.7909+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*15)));
            yy = -0.71749 + (((tickAnim - 683) / 9) * (-0.71749-(-0.71749)));
            zz = 5.67772 + (((tickAnim - 683) / 9) * (5.67772-(5.67772)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = -16.1159+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*15 + (((tickAnim - 692) / 68) * (0-(-16.1159+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-190))*15)));
            yy = -0.71749 + (((tickAnim - 692) / 68) * (0-(-0.71749)));
            zz = 5.67772 + (((tickAnim - 692) / 68) * (0-(5.67772)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-25))*0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-25))*0.5 + (((tickAnim - 15) / 15) * (0.925-(-0.05+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-25))*0.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0.925 + (((tickAnim - 30) / 20) * (1.075-(0.925)));
        }
        else if (tickAnim >= 50 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 50) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 38) * (-0.325-(0)));
            zz = 1.075 + (((tickAnim - 50) / 38) * (1.25-(1.075)));
        }
        else if (tickAnim >= 88 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 88) / 232) * (0-(0)));
            yy = -0.325 + (((tickAnim - 88) / 232) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 88) / 232) * (1.25-(1.25)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 320) / 15) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 320) / 15) * (1.25-(1.25)));
        }
        else if (tickAnim >= 335 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 335) / 33) * (0-(0)));
            yy = -0.325 + (((tickAnim - 335) / 33) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 335) / 33) * (1.25-(1.25)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = -0.325 + (((tickAnim - 368) / 67) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 368) / 67) * (1.25-(1.25)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            yy = -0.325 + (((tickAnim - 435) / 45) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 435) / 45) * (1.25-(1.25)));
        }
        else if (tickAnim >= 480 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 480) / 80) * (0-(0)));
            yy = -0.325 + (((tickAnim - 480) / 80) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 480) / 80) * (1.25-(1.25)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 560) / 55) * (0-(0)));
            yy = -0.325 + (((tickAnim - 560) / 55) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 560) / 55) * (1.25-(1.25)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = -0.325 + (((tickAnim - 615) / 3) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 615) / 3) * (1.25-(1.25)));
        }
        else if (tickAnim >= 618 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 618) / 32) * (0-(0)));
            yy = -0.325 + (((tickAnim - 618) / 32) * (-0.325-(-0.325)));
            zz = 1.25 + (((tickAnim - 618) / 32) * (1.25-(1.25)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 0 + (((tickAnim - 650) / 13) * (0-(0)));
            yy = -0.325 + (((tickAnim - 650) / 13) * (0-(-0.325)));
            zz = 1.25 + (((tickAnim - 650) / 13) * (0.525-(1.25)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 663) / 10) * (-0.375-(0)));
            zz = 0.525 + (((tickAnim - 663) / 10) * (1.1-(0.525)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 673) / 10) * (0-(0)));
            yy = -0.375 + (((tickAnim - 673) / 10) * (-0.145-(-0.375)));
            zz = 1.1 + (((tickAnim - 673) / 10) * (0.625-(1.1)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 0 + (((tickAnim - 683) / 9) * (0-(0)));
            yy = -0.145 + (((tickAnim - 683) / 9) * (-0.145-(-0.145)));
            zz = 0.625 + (((tickAnim - 683) / 9) * (1.15-(0.625)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 692) / 68) * (0-(0)));
            yy = -0.145 + (((tickAnim - 692) / 68) * (0-(-0.145)));
            zz = 1.15 + (((tickAnim - 692) / 68) * (0-(1.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (22.55766-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (1.46091-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.38295-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 75) {
            xx = 22.55766 + (((tickAnim - 30) / 45) * (7.05189-(22.55766)));
            yy = 1.46091 + (((tickAnim - 30) / 45) * (1.03668-(1.46091)));
            zz = 2.38295 + (((tickAnim - 30) / 45) * (2.11827-(2.38295)));
        }
        else if (tickAnim >= 75 && tickAnim < 88) {
            xx = 7.05189 + (((tickAnim - 75) / 13) * (20.61015-(7.05189)));
            yy = 1.03668 + (((tickAnim - 75) / 13) * (3.67212-(1.03668)));
            zz = 2.11827 + (((tickAnim - 75) / 13) * (-1.53266-(2.11827)));
        }
        else if (tickAnim >= 88 && tickAnim < 126) {
            xx = 20.61015 + (((tickAnim - 88) / 38) * (19.2852+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-80))*5-(20.61015)));
            yy = 3.67212 + (((tickAnim - 88) / 38) * (1.0367-(3.67212)));
            zz = -1.53266 + (((tickAnim - 88) / 38) * (2.11827-(-1.53266)));
        }
        else if (tickAnim >= 126 && tickAnim < 150) {
            xx = 19.2852+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-80))*5 + (((tickAnim - 126) / 24) * (24.4841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+120))*-5-(19.2852+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-80))*5)));
            yy = 1.0367 + (((tickAnim - 126) / 24) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 126) / 24) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 150 && tickAnim < 170) {
            xx = 24.4841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+120))*-5 + (((tickAnim - 150) / 20) * (30.0856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+120))*-10-(24.4841+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+120))*-5)));
            yy = 1.0367 + (((tickAnim - 150) / 20) * (1.00138-(1.0367)));
            zz = 2.11827 + (((tickAnim - 150) / 20) * (1.82903-(2.11827)));
        }
        else if (tickAnim >= 170 && tickAnim < 184) {
            xx = 30.0856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+120))*-10 + (((tickAnim - 170) / 14) * (16.10265-(30.0856+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+120))*-10)));
            yy = 1.00138 + (((tickAnim - 170) / 14) * (1.0367-(1.00138)));
            zz = 1.82903 + (((tickAnim - 170) / 14) * (2.11827-(1.82903)));
        }
        else if (tickAnim >= 184 && tickAnim < 199) {
            xx = 16.10265 + (((tickAnim - 184) / 15) * (9.8102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+90))*5-(16.10265)));
            yy = 1.0367 + (((tickAnim - 184) / 15) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 184) / 15) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 199 && tickAnim < 208) {
            xx = 9.8102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+90))*5 + (((tickAnim - 199) / 9) * (4.42006-(9.8102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125+90))*5)));
            yy = 1.0367 + (((tickAnim - 199) / 9) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 199) / 9) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 208 && tickAnim < 320) {
            xx = 4.42006 + (((tickAnim - 208) / 112) * (1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3-(4.42006)));
            yy = 1.0367 + (((tickAnim - 208) / 112) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 208) / 112) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3 + (((tickAnim - 320) / 15) * (1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3-(1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3)));
            yy = 1.0367 + (((tickAnim - 320) / 15) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 320) / 15) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 335 && tickAnim < 343) {
            xx = 1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3 + (((tickAnim - 335) / 8) * (6.0254+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3-(1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3)));
            yy = 1.0367 + (((tickAnim - 335) / 8) * (4.3714+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(1.0367)));
            zz = 2.11827 + (((tickAnim - 335) / 8) * (0.47478-(2.11827)));
        }
        else if (tickAnim >= 343 && tickAnim < 352) {
            xx = 6.0254+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3 + (((tickAnim - 343) / 9) * (6.0335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3-(6.0254+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3)));
            yy = 4.3714+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 343) / 9) * (0.7348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(4.3714+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = 0.47478 + (((tickAnim - 343) / 9) * (-0.62754-(0.47478)));
        }
        else if (tickAnim >= 352 && tickAnim < 359) {
            xx = 6.0335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3 + (((tickAnim - 352) / 7) * (1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3-(6.0335+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3)));
            yy = 0.7348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 352) / 7) * (1.0367-(0.7348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            zz = -0.62754 + (((tickAnim - 352) / 7) * (2.11827-(-0.62754)));
        }
        else if (tickAnim >= 359 && tickAnim < 368) {
            xx = 1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3 + (((tickAnim - 359) / 9) * (3.3602+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3-(1.5102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3)));
            yy = 1.0367 + (((tickAnim - 359) / 9) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 359) / 9) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 3.3602+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3 + (((tickAnim - 368) / 67) * (12.0602+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*1-(3.3602+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*3)));
            yy = 1.0367 + (((tickAnim - 368) / 67) * (1.0367-(1.0367)));
            zz = 2.11827 + (((tickAnim - 368) / 67) * (2.11827-(2.11827)));
        }
        else if (tickAnim >= 435 && tickAnim < 444) {
            xx = 12.0602+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*1 + (((tickAnim - 435) / 9) * (6.20552-(12.0602+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*1)));
            yy = 1.0367 + (((tickAnim - 435) / 9) * (11.3442+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(1.0367)));
            zz = 2.11827 + (((tickAnim - 435) / 9) * (5.78856-(2.11827)));
        }
        else if (tickAnim >= 444 && tickAnim < 453) {
            xx = 6.20552 + (((tickAnim - 444) / 9) * (6.1422-(6.20552)));
            yy = 11.3442+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 444) / 9) * (-2.1417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-10-(11.3442+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            zz = 5.78856 + (((tickAnim - 444) / 9) * (5.99052-(5.78856)));
        }
        else if (tickAnim >= 453 && tickAnim < 468) {
            xx = 6.1422 + (((tickAnim - 453) / 15) * (14.8102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*1-(6.1422)));
            yy = -2.1417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-10 + (((tickAnim - 453) / 15) * (1.0367-(-2.1417+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*-10)));
            zz = 5.99052 + (((tickAnim - 453) / 15) * (2.11827-(5.99052)));
        }
        else if (tickAnim >= 468 && tickAnim < 495) {
            xx = 14.8102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*1 + (((tickAnim - 468) / 27) * (23.76146-(14.8102+Math.sin((Math.PI/180)*(((double)tickAnim/20)*125-70))*1)));
            yy = 1.0367 + (((tickAnim - 468) / 27) * (1.86255-(1.0367)));
            zz = 2.11827 + (((tickAnim - 468) / 27) * (3.05691-(2.11827)));
        }
        else if (tickAnim >= 495 && tickAnim < 500) {
            xx = 23.76146 + (((tickAnim - 495) / 5) * (25.77475-(23.76146)));
            yy = 1.86255 + (((tickAnim - 495) / 5) * (2.19276-(1.86255)));
            zz = 3.05691 + (((tickAnim - 495) / 5) * (3.4326-(3.05691)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 25.77475 + (((tickAnim - 500) / 60) * (23.76146-(25.77475)));
            yy = 2.19276 + (((tickAnim - 500) / 60) * (1.86255-(2.19276)));
            zz = 3.4326 + (((tickAnim - 500) / 60) * (3.05691-(3.4326)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = 23.76146 + (((tickAnim - 560) / 55) * (23.76146-(23.76146)));
            yy = 1.86255 + (((tickAnim - 560) / 55) * (1.86255-(1.86255)));
            zz = 3.05691 + (((tickAnim - 560) / 55) * (3.05691-(3.05691)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 23.76146 + (((tickAnim - 615) / 3) * (33.76146-(23.76146)));
            yy = 1.86255 + (((tickAnim - 615) / 3) * (1.86255-(1.86255)));
            zz = 3.05691 + (((tickAnim - 615) / 3) * (3.05691-(3.05691)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 33.76146 + (((tickAnim - 618) / 2) * (43.51146-(33.76146)));
            yy = 1.86255 + (((tickAnim - 618) / 2) * (1.86255-(1.86255)));
            zz = 3.05691 + (((tickAnim - 618) / 2) * (3.05691-(3.05691)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = 43.51146 + (((tickAnim - 620) / 2) * (-9.48854-(43.51146)));
            yy = 1.86255 + (((tickAnim - 620) / 2) * (1.86255-(1.86255)));
            zz = 3.05691 + (((tickAnim - 620) / 2) * (3.05691-(3.05691)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -9.48854 + (((tickAnim - 622) / 1) * (-17.98854-(-9.48854)));
            yy = 1.86255 + (((tickAnim - 622) / 1) * (1.86255-(1.86255)));
            zz = 3.05691 + (((tickAnim - 622) / 1) * (3.05691-(3.05691)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -17.98854 + (((tickAnim - 623) / 4) * (-12.23854-(-17.98854)));
            yy = 1.86255 + (((tickAnim - 623) / 4) * (1.86255-(1.86255)));
            zz = 3.05691 + (((tickAnim - 623) / 4) * (3.05691-(3.05691)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -12.23854 + (((tickAnim - 627) / 7) * (3.61839-(-12.23854)));
            yy = 1.86255 + (((tickAnim - 627) / 7) * (0.29939-(1.86255)));
            zz = 3.05691 + (((tickAnim - 627) / 7) * (-0.79533-(3.05691)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 3.61839 + (((tickAnim - 634) / 16) * (35.21733-(3.61839)));
            yy = 0.29939 + (((tickAnim - 634) / 16) * (-0.20494-(0.29939)));
            zz = -0.79533 + (((tickAnim - 634) / 16) * (1.15592-(-0.79533)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 35.21733 + (((tickAnim - 650) / 13) * (32.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*20-(35.21733)));
            yy = -0.20494 + (((tickAnim - 650) / 13) * (0-(-0.20494)));
            zz = 1.15592 + (((tickAnim - 650) / 13) * (0-(1.15592)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 32.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*20 + (((tickAnim - 663) / 10) * (17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*15-(32.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-80))*20)));
            yy = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 663) / 10) * (0-(0)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = 17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*15 + (((tickAnim - 673) / 10) * (23.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*15-(17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+90))*15)));
            yy = 0 + (((tickAnim - 673) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 673) / 10) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 23.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*15 + (((tickAnim - 683) / 9) * (19.5-(23.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+120))*15)));
            yy = 0 + (((tickAnim - 683) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 9) * (0-(0)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = 19.5 + (((tickAnim - 692) / 68) * (0-(19.5)));
            yy = 0 + (((tickAnim - 692) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 692) / 68) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 30) / 21) * (0-(0)));
            yy = 0.725 + (((tickAnim - 30) / 21) * (0.55-(0.725)));
            zz = 1 + (((tickAnim - 30) / 21) * (0.675-(1)));
        }
        else if (tickAnim >= 51 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 51) / 75) * (0-(0)));
            yy = 0.55 + (((tickAnim - 51) / 75) * (1.2-(0.55)));
            zz = 0.675 + (((tickAnim - 51) / 75) * (1.44-(0.675)));
        }
        else if (tickAnim >= 126 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 126) / 44) * (0-(0)));
            yy = 1.2 + (((tickAnim - 126) / 44) * (0.625-(1.2)));
            zz = 1.44 + (((tickAnim - 126) / 44) * (1.01-(1.44)));
        }
        else if (tickAnim >= 170 && tickAnim < 184) {
            xx = 0 + (((tickAnim - 170) / 14) * (0-(0)));
            yy = 0.625 + (((tickAnim - 170) / 14) * (0.345-(0.625)));
            zz = 1.01 + (((tickAnim - 170) / 14) * (1.02-(1.01)));
        }
        else if (tickAnim >= 184 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 184) / 15) * (0-(0)));
            yy = 0.345 + (((tickAnim - 184) / 15) * (0-(0.345)));
            zz = 1.02 + (((tickAnim - 184) / 15) * (0-(1.02)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (0.175-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0.5-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 280) / 40) * (0-(0)));
            yy = 0.175 + (((tickAnim - 280) / 40) * (0.355-(0.175)));
            zz = 0.5 + (((tickAnim - 280) / 40) * (0.75-(0.5)));
        }
        else if (tickAnim >= 320 && tickAnim < 335) {
            xx = 0 + (((tickAnim - 320) / 15) * (0-(0)));
            yy = 0.355 + (((tickAnim - 320) / 15) * (0.355-(0.355)));
            zz = 0.75 + (((tickAnim - 320) / 15) * (0.75-(0.75)));
        }
        else if (tickAnim >= 335 && tickAnim < 360) {
            xx = 0 + (((tickAnim - 335) / 25) * (0-(0)));
            yy = 0.355 + (((tickAnim - 335) / 25) * (0.355-(0.355)));
            zz = 0.75 + (((tickAnim - 335) / 25) * (0.75-(0.75)));
        }
        else if (tickAnim >= 360 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 360) / 8) * (0-(0)));
            yy = 0.355 + (((tickAnim - 360) / 8) * (0.355-(0.355)));
            zz = 0.75 + (((tickAnim - 360) / 8) * (0.75-(0.75)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 0.355 + (((tickAnim - 368) / 67) * (0.355-(0.355)));
            zz = 0.75 + (((tickAnim - 368) / 67) * (0.75-(0.75)));
        }
        else if (tickAnim >= 435 && tickAnim < 468) {
            xx = 0 + (((tickAnim - 435) / 33) * (0-(0)));
            yy = 0.355 + (((tickAnim - 435) / 33) * (0.58-(0.355)));
            zz = 0.75 + (((tickAnim - 435) / 33) * (0.75-(0.75)));
        }
        else if (tickAnim >= 468 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 468) / 32) * (0-(0)));
            yy = 0.58 + (((tickAnim - 468) / 32) * (0.9-(0.58)));
            zz = 0.75 + (((tickAnim - 468) / 32) * (1.285-(0.75)));
        }
        else if (tickAnim >= 500 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 500) / 60) * (0-(0)));
            yy = 0.9 + (((tickAnim - 500) / 60) * (0.93-(0.9)));
            zz = 1.285 + (((tickAnim - 500) / 60) * (1.5-(1.285)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 560) / 55) * (0-(0)));
            yy = 0.93 + (((tickAnim - 560) / 55) * (0.93-(0.93)));
            zz = 1.5 + (((tickAnim - 560) / 55) * (1.15-(1.5)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = 0.93 + (((tickAnim - 615) / 3) * (1.33-(0.93)));
            zz = 1.15 + (((tickAnim - 615) / 3) * (1.475-(1.15)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            yy = 1.33 + (((tickAnim - 618) / 2) * (1.855-(1.33)));
            zz = 1.475 + (((tickAnim - 618) / 2) * (1.805-(1.475)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = 0 + (((tickAnim - 620) / 2) * (0-(0)));
            yy = 1.855 + (((tickAnim - 620) / 2) * (0-(1.855)));
            zz = 1.805 + (((tickAnim - 620) / 2) * (0-(1.805)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = 0 + (((tickAnim - 622) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 622) / 1) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 622) / 1) * (-0.975-(0)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 623) / 4) * (0-(0)));
            yy = -0.325 + (((tickAnim - 623) / 4) * (-0.325-(-0.325)));
            zz = -0.975 + (((tickAnim - 623) / 4) * (-0.65-(-0.975)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 0 + (((tickAnim - 627) / 7) * (0-(0)));
            yy = -0.325 + (((tickAnim - 627) / 7) * (0.33-(-0.325)));
            zz = -0.65 + (((tickAnim - 627) / 7) * (0.625-(-0.65)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 634) / 16) * (0-(0)));
            yy = 0.33 + (((tickAnim - 634) / 16) * (1.28-(0.33)));
            zz = 0.625 + (((tickAnim - 634) / 16) * (1.4-(0.625)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 0 + (((tickAnim - 650) / 13) * (0-(0)));
            yy = 1.28 + (((tickAnim - 650) / 13) * (0.6-(1.28)));
            zz = 1.4 + (((tickAnim - 650) / 13) * (1.1-(1.4)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            yy = 0.6 + (((tickAnim - 663) / 10) * (0.655-(0.6)));
            zz = 1.1 + (((tickAnim - 663) / 10) * (1.005-(1.1)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 673) / 10) * (0-(0)));
            yy = 0.655 + (((tickAnim - 673) / 10) * (0.075-(0.655)));
            zz = 1.005 + (((tickAnim - 673) / 10) * (0.3-(1.005)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 0 + (((tickAnim - 683) / 9) * (0-(0)));
            yy = 0.075 + (((tickAnim - 683) / 9) * (0.7-(0.075)));
            zz = 0.3 + (((tickAnim - 683) / 9) * (0.825-(0.3)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 692) / 68) * (0-(0)));
            yy = 0.7 + (((tickAnim - 692) / 68) * (0-(0.7)));
            zz = 0.825 + (((tickAnim - 692) / 68) * (0-(0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 435) {
            xx = 5.75 + (((tickAnim - 30) / 405) * (0-(5.75)));
            yy = 0 + (((tickAnim - 30) / 405) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 405) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 444) {
            xx = 0 + (((tickAnim - 435) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 435) / 9) * (11.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(0)));
            zz = 0 + (((tickAnim - 435) / 9) * (0-(0)));
        }
        else if (tickAnim >= 444 && tickAnim < 453) {
            xx = 0 + (((tickAnim - 444) / 9) * (0-(0)));
            yy = 11.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 444) / 9) * (11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(11.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = 0 + (((tickAnim - 444) / 9) * (0-(0)));
        }
        else if (tickAnim >= 453 && tickAnim < 468) {
            xx = 0 + (((tickAnim - 453) / 15) * (0-(0)));
            yy = 11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 453) / 15) * (0-(11.85+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            zz = 0 + (((tickAnim - 453) / 15) * (0-(0)));
        }
        else if (tickAnim >= 468 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 468) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 468) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 468) / 12) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 495) {
            xx = 0 + (((tickAnim - 480) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 15) * (2-(0)));
            zz = 0 + (((tickAnim - 480) / 15) * (0-(0)));
        }
        else if (tickAnim >= 495 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 495) / 65) * (0-(0)));
            yy = 2 + (((tickAnim - 495) / 65) * (2-(2)));
            zz = 0 + (((tickAnim - 495) / 65) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 560) / 55) * (0-(0)));
            yy = 2 + (((tickAnim - 560) / 55) * (2-(2)));
            zz = 0 + (((tickAnim - 560) / 55) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = 2 + (((tickAnim - 615) / 3) * (2-(2)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 618) / 9) * (7-(0)));
            yy = 2 + (((tickAnim - 618) / 9) * (2-(2)));
            zz = 0 + (((tickAnim - 618) / 9) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 683) {
            xx = 7 + (((tickAnim - 627) / 56) * (1.25-(7)));
            yy = 2 + (((tickAnim - 627) / 56) * (2-(2)));
            zz = 0 + (((tickAnim - 627) / 56) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 760) {
            xx = 1.25 + (((tickAnim - 683) / 77) * (0-(1.25)));
            yy = 2 + (((tickAnim - 683) / 77) * (0-(2)));
            zz = 0 + (((tickAnim - 683) / 77) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 30) / 20) * (17-(11.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 618) {
            xx = 17 + (((tickAnim - 50) / 568) * (22.51335-(17)));
            yy = 0 + (((tickAnim - 50) / 568) * (0.8432-(0)));
            zz = 0 + (((tickAnim - 50) / 568) * (1.81363-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 627) {
            xx = 22.51335 + (((tickAnim - 618) / 9) * (32.26335-(22.51335)));
            yy = 0.8432 + (((tickAnim - 618) / 9) * (0.8432-(0.8432)));
            zz = 1.81363 + (((tickAnim - 618) / 9) * (1.81363-(1.81363)));
        }
        else if (tickAnim >= 627 && tickAnim < 760) {
            xx = 32.26335 + (((tickAnim - 627) / 133) * (0-(32.26335)));
            yy = 0.8432 + (((tickAnim - 627) / 133) * (0-(0.8432)));
            zz = 1.81363 + (((tickAnim - 627) / 133) * (0-(1.81363)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-0.66766-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (7.73998-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (2.65448-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.66766 + (((tickAnim - 30) / 20) * (-10.16766-(-0.66766)));
            yy = 7.73998 + (((tickAnim - 30) / 20) * (7.73998-(7.73998)));
            zz = 2.65448 + (((tickAnim - 30) / 20) * (2.65448-(2.65448)));
        }
        else if (tickAnim >= 50 && tickAnim < 618) {
            xx = -10.16766 + (((tickAnim - 50) / 568) * (-30.31659-(-10.16766)));
            yy = 7.73998 + (((tickAnim - 50) / 568) * (5.31715-(7.73998)));
            zz = 2.65448 + (((tickAnim - 50) / 568) * (1.34497-(2.65448)));
        }
        else if (tickAnim >= 618 && tickAnim < 760) {
            xx = -30.31659 + (((tickAnim - 618) / 142) * (0-(-30.31659)));
            yy = 5.31715 + (((tickAnim - 618) / 142) * (0-(5.31715)));
            zz = 1.34497 + (((tickAnim - 618) / 142) * (0-(1.34497)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 30) / 588) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 588) * (0-(0)));
            zz = 1.75 + (((tickAnim - 30) / 588) * (22-(1.75)));
        }
        else if (tickAnim >= 618 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 618) / 142) * (0-(0)));
            yy = 0 + (((tickAnim - 618) / 142) * (0-(0)));
            zz = 22 + (((tickAnim - 618) / 142) * (0-(22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 30) / 20) * (17.5-(12.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 622) {
            xx = 17.5 + (((tickAnim - 50) / 572) * (17.65954-(17.5)));
            yy = 0 + (((tickAnim - 50) / 572) * (-3.23887-(0)));
            zz = 0 + (((tickAnim - 50) / 572) * (-5.63858-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = 17.65954 + (((tickAnim - 622) / 1) * (17.65954-(17.65954)));
            yy = -3.23887 + (((tickAnim - 622) / 1) * (-3.23887-(-3.23887)));
            zz = -5.63858 + (((tickAnim - 622) / 1) * (-5.63858-(-5.63858)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 17.65954 + (((tickAnim - 623) / 4) * (17.65954-(17.65954)));
            yy = -3.23887 + (((tickAnim - 623) / 4) * (-3.23887-(-3.23887)));
            zz = -5.63858 + (((tickAnim - 623) / 4) * (-5.63858-(-5.63858)));
        }
        else if (tickAnim >= 627 && tickAnim < 760) {
            xx = 17.65954 + (((tickAnim - 627) / 133) * (0-(17.65954)));
            yy = -3.23887 + (((tickAnim - 627) / 133) * (0-(-3.23887)));
            zz = -5.63858 + (((tickAnim - 627) / 133) * (0-(-5.63858)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-20.93926-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-5.79588-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-0.5979-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -20.93926 + (((tickAnim - 30) / 20) * (-34.68926-(-20.93926)));
            yy = -5.79588 + (((tickAnim - 30) / 20) * (-5.79588-(-5.79588)));
            zz = -0.5979 + (((tickAnim - 30) / 20) * (-0.5979-(-0.5979)));
        }
        else if (tickAnim >= 50 && tickAnim < 622) {
            xx = -34.68926 + (((tickAnim - 50) / 572) * (-29.75555-(-34.68926)));
            yy = -5.79588 + (((tickAnim - 50) / 572) * (-19.52728-(-5.79588)));
            zz = -0.5979 + (((tickAnim - 50) / 572) * (-20.43434-(-0.5979)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -29.75555 + (((tickAnim - 622) / 1) * (-29.75555-(-29.75555)));
            yy = -19.52728 + (((tickAnim - 622) / 1) * (-19.52728-(-19.52728)));
            zz = -20.43434 + (((tickAnim - 622) / 1) * (-20.43434-(-20.43434)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -29.75555 + (((tickAnim - 623) / 4) * (-29.75555-(-29.75555)));
            yy = -19.52728 + (((tickAnim - 623) / 4) * (-19.52728-(-19.52728)));
            zz = -20.43434 + (((tickAnim - 623) / 4) * (-20.43434-(-20.43434)));
        }
        else if (tickAnim >= 627 && tickAnim < 760) {
            xx = -29.75555 + (((tickAnim - 627) / 133) * (0-(-29.75555)));
            yy = -19.52728 + (((tickAnim - 627) / 133) * (0-(-19.52728)));
            zz = -20.43434 + (((tickAnim - 627) / 133) * (0-(-20.43434)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-20.25-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 30) / 730) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 730) * (0-(0)));
            zz = -20.25 + (((tickAnim - 30) / 730) * (0-(-20.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 30) / 140) * (-3.75-(0)));
            yy = -3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10 + (((tickAnim - 30) / 140) * (-0.5-(-3.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-10)));
            zz = 0 + (((tickAnim - 30) / 140) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 280) {
            xx = -3.75 + (((tickAnim - 170) / 110) * (0-(-3.75)));
            yy = -0.5 + (((tickAnim - 170) / 110) * (2.5-(-0.5)));
            zz = 0 + (((tickAnim - 170) / 110) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 280) / 88) * (0-(0)));
            yy = 2.5 + (((tickAnim - 280) / 88) * (1-(2.5)));
            zz = 0 + (((tickAnim - 280) / 88) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 1 + (((tickAnim - 368) / 67) * (-0.75-(1)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 435) / 58) * (0-(0)));
            yy = -0.75 + (((tickAnim - 435) / 58) * (-1.5-(-0.75)));
            zz = 0 + (((tickAnim - 435) / 58) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 493) / 122) * (0-(0)));
            yy = -1.5 + (((tickAnim - 493) / 122) * (-0.5-(-1.5)));
            zz = 0 + (((tickAnim - 493) / 122) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = -0.5 + (((tickAnim - 615) / 3) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (-3-(0)));
            yy = -0.5 + (((tickAnim - 618) / 2) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -3 + (((tickAnim - 620) / 2) * (2.5-(-3)));
            yy = -0.5 + (((tickAnim - 620) / 2) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 620) / 2) * (0-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = 2.5 + (((tickAnim - 622) / 5) * (3.75-(2.5)));
            yy = -0.5 + (((tickAnim - 622) / 5) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 622) / 5) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 3.75 + (((tickAnim - 627) / 7) * (-6.49982-(3.75)));
            yy = -0.5 + (((tickAnim - 627) / 7) * (0.24575-(-0.5)));
            zz = 0 + (((tickAnim - 627) / 7) * (-0.0797-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -6.49982 + (((tickAnim - 634) / 16) * (-9.26851-(-6.49982)));
            yy = 0.24575 + (((tickAnim - 634) / 16) * (-4.4773-(0.24575)));
            zz = -0.0797 + (((tickAnim - 634) / 16) * (0.42602-(-0.0797)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -9.26851 + (((tickAnim - 650) / 13) * (-9.26851-(-9.26851)));
            yy = -4.4773 + (((tickAnim - 650) / 13) * (-4.4773-(-4.4773)));
            zz = 0.42602 + (((tickAnim - 650) / 13) * (0.42602-(0.42602)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -9.26851 + (((tickAnim - 663) / 10) * (-3.01851-(-9.26851)));
            yy = -4.4773 + (((tickAnim - 663) / 10) * (-4.4773-(-4.4773)));
            zz = 0.42602 + (((tickAnim - 663) / 10) * (0.42602-(0.42602)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = -3.01851 + (((tickAnim - 673) / 10) * (-4.77082-(-3.01851)));
            yy = -4.4773 + (((tickAnim - 673) / 10) * (-4.49887-(-4.4773)));
            zz = 0.42602 + (((tickAnim - 673) / 10) * (0.58204-(0.42602)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = -4.77082 + (((tickAnim - 683) / 9) * (-4.02082-(-4.77082)));
            yy = -4.49887 + (((tickAnim - 683) / 9) * (-4.49887-(-4.49887)));
            zz = 0.58204 + (((tickAnim - 683) / 9) * (0.58204-(0.58204)));
        }
        else if (tickAnim >= 692 && tickAnim < 709) {
            xx = -4.02082 + (((tickAnim - 692) / 17) * (1.77142-(-4.02082)));
            yy = -4.49887 + (((tickAnim - 692) / 17) * (-3.30091-(-4.49887)));
            zz = 0.58204 + (((tickAnim - 692) / 17) * (0.42706-(0.58204)));
        }
        else if (tickAnim >= 709 && tickAnim < 725) {
            xx = 1.77142 + (((tickAnim - 709) / 16) * (6.71967-(1.77142)));
            yy = -3.30091 + (((tickAnim - 709) / 16) * (-2.27276-(-3.30091)));
            zz = 0.42706 + (((tickAnim - 709) / 16) * (0.29404-(0.42706)));
        }
        else if (tickAnim >= 725 && tickAnim < 760) {
            xx = 6.71967 + (((tickAnim - 725) / 35) * (0-(6.71967)));
            yy = -2.27276 + (((tickAnim - 725) / 35) * (0-(-2.27276)));
            zz = 0.29404 + (((tickAnim - 725) / 35) * (0-(0.29404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 0) / 618) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 618) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 618) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 2) * (-0.375-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = 0 + (((tickAnim - 620) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 620) / 2) * (0-(0)));
            zz = -0.375 + (((tickAnim - 620) / 2) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 622) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 622) / 5) * (0-(0)));
            zz = -0.375 + (((tickAnim - 622) / 5) * (-0.375-(-0.375)));
        }
        else if (tickAnim >= 627 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 627) / 133) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 133) * (0-(0)));
            zz = -0.375 + (((tickAnim - 627) / 133) * (0-(-0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 30) / 70) * (-2-(0)));
            yy = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8 + (((tickAnim - 30) / 70) * (1-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-8)));
            zz = 0 + (((tickAnim - 30) / 70) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = -2 + (((tickAnim - 100) / 70) * (-2-(-2)));
            yy = 1 + (((tickAnim - 100) / 70) * (1-(1)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 280) {
            xx = -2 + (((tickAnim - 170) / 110) * (0-(-2)));
            yy = 1 + (((tickAnim - 170) / 110) * (3.75-(1)));
            zz = 0 + (((tickAnim - 170) / 110) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 280) / 88) * (0-(0)));
            yy = 3.75 + (((tickAnim - 280) / 88) * (1.5-(3.75)));
            zz = 0 + (((tickAnim - 280) / 88) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 1.5 + (((tickAnim - 368) / 67) * (-2.5-(1.5)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 435) / 58) * (0-(0)));
            yy = -2.5 + (((tickAnim - 435) / 58) * (-3.5-(-2.5)));
            zz = 0 + (((tickAnim - 435) / 58) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 493) / 122) * (0-(0)));
            yy = -3.5 + (((tickAnim - 493) / 122) * (-3.75-(-3.5)));
            zz = 0 + (((tickAnim - 493) / 122) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = -3.75 + (((tickAnim - 615) / 3) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (-4.5-(0)));
            yy = -3.75 + (((tickAnim - 618) / 2) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -4.5 + (((tickAnim - 620) / 2) * (-9.75-(-4.5)));
            yy = -3.75 + (((tickAnim - 620) / 2) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 620) / 2) * (0-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = -9.75 + (((tickAnim - 622) / 5) * (-6-(-9.75)));
            yy = -3.75 + (((tickAnim - 622) / 5) * (-3.75-(-3.75)));
            zz = 0 + (((tickAnim - 622) / 5) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -6 + (((tickAnim - 627) / 7) * (-1.4994-(-6)));
            yy = -3.75 + (((tickAnim - 627) / 7) * (-2.50005-(-3.75)));
            zz = 0 + (((tickAnim - 627) / 7) * (-0.01092-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -1.4994 + (((tickAnim - 634) / 16) * (-6.23894-(-1.4994)));
            yy = -2.50005 + (((tickAnim - 634) / 16) * (-0.5136-(-2.50005)));
            zz = -0.01092 + (((tickAnim - 634) / 16) * (-0.29723-(-0.01092)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -6.23894 + (((tickAnim - 650) / 13) * (-3.23894-(-6.23894)));
            yy = -0.5136 + (((tickAnim - 650) / 13) * (-0.5136-(-0.5136)));
            zz = -0.29723 + (((tickAnim - 650) / 13) * (-0.29723-(-0.29723)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -3.23894 + (((tickAnim - 663) / 10) * (-6.48894-(-3.23894)));
            yy = -0.5136 + (((tickAnim - 663) / 10) * (-0.5136-(-0.5136)));
            zz = -0.29723 + (((tickAnim - 663) / 10) * (-0.29723-(-0.29723)));
        }
        else if (tickAnim >= 673 && tickAnim < 677) {
            xx = -6.48894 + (((tickAnim - 673) / 4) * (-1.90561-(-6.48894)));
            yy = -0.5136 + (((tickAnim - 673) / 4) * (-0.5136-(-0.5136)));
            zz = -0.29723 + (((tickAnim - 673) / 4) * (-0.29723-(-0.29723)));
        }
        else if (tickAnim >= 677 && tickAnim < 683) {
            xx = -1.90561 + (((tickAnim - 677) / 6) * (-4.73894-(-1.90561)));
            yy = -0.5136 + (((tickAnim - 677) / 6) * (-0.5136-(-0.5136)));
            zz = -0.29723 + (((tickAnim - 677) / 6) * (-0.29723-(-0.29723)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = -4.73894 + (((tickAnim - 683) / 9) * (-3.48894-(-4.73894)));
            yy = -0.5136 + (((tickAnim - 683) / 9) * (-0.5136-(-0.5136)));
            zz = -0.29723 + (((tickAnim - 683) / 9) * (-0.29723-(-0.29723)));
        }
        else if (tickAnim >= 692 && tickAnim < 709) {
            xx = -3.48894 + (((tickAnim - 692) / 17) * (-7.2989-(-3.48894)));
            yy = -0.5136 + (((tickAnim - 692) / 17) * (-0.37832-(-0.5136)));
            zz = -0.29723 + (((tickAnim - 692) / 17) * (-0.21895-(-0.29723)));
        }
        else if (tickAnim >= 709 && tickAnim < 725) {
            xx = -7.2989 + (((tickAnim - 709) / 16) * (-5.5505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-7.2989)));
            yy = -0.37832 + (((tickAnim - 709) / 16) * (-0.26049-(-0.37832)));
            zz = -0.21895 + (((tickAnim - 709) / 16) * (-0.15075-(-0.21895)));
        }
        else if (tickAnim >= 725 && tickAnim < 760) {
            xx = -5.5505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 725) / 35) * (0-(-5.5505+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = -0.26049 + (((tickAnim - 725) / 35) * (0-(-0.26049)));
            zz = -0.15075 + (((tickAnim - 725) / 35) * (0-(-0.15075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 0) / 620) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 620) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 620) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = 0 + (((tickAnim - 620) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 620) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 620) / 2) * (-0.7-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 622) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 622) / 5) * (0-(0)));
            zz = -0.7 + (((tickAnim - 622) / 5) * (-0.7-(-0.7)));
        }
        else if (tickAnim >= 627 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 627) / 133) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 133) * (0-(0)));
            zz = -0.7 + (((tickAnim - 627) / 133) * (0-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 30) / 70) * (5.75-(0)));
            yy = -6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 30) / 70) * (-1.25-(-6.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 0 + (((tickAnim - 30) / 70) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 5.75 + (((tickAnim - 100) / 70) * (5.75-(5.75)));
            yy = -1.25 + (((tickAnim - 100) / 70) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 5.75 + (((tickAnim - 170) / 29) * (0-(5.75)));
            yy = -1.25 + (((tickAnim - 170) / 29) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (3-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 280) / 88) * (0-(0)));
            yy = 3 + (((tickAnim - 280) / 88) * (0.5-(3)));
            zz = 0 + (((tickAnim - 280) / 88) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 0.5 + (((tickAnim - 368) / 67) * (-1-(0.5)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 435) / 58) * (0-(0)));
            yy = -1 + (((tickAnim - 435) / 58) * (-2.25-(-1)));
            zz = 0 + (((tickAnim - 435) / 58) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 493) / 122) * (0-(0)));
            yy = -2.25 + (((tickAnim - 493) / 122) * (-4-(-2.25)));
            zz = 0 + (((tickAnim - 493) / 122) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = -4 + (((tickAnim - 615) / 3) * (-4-(-4)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (-9-(0)));
            yy = -4 + (((tickAnim - 618) / 2) * (-4-(-4)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -9 + (((tickAnim - 620) / 2) * (-10.5-(-9)));
            yy = -4 + (((tickAnim - 620) / 2) * (-4-(-4)));
            zz = 0 + (((tickAnim - 620) / 2) * (0-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = -10.5 + (((tickAnim - 622) / 5) * (-6.5-(-10.5)));
            yy = -4 + (((tickAnim - 622) / 5) * (-4-(-4)));
            zz = 0 + (((tickAnim - 622) / 5) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -6.5 + (((tickAnim - 627) / 7) * (0.74031-(-6.5)));
            yy = -4 + (((tickAnim - 627) / 7) * (-0.25906-(-4)));
            zz = 0 + (((tickAnim - 627) / 7) * (0.26075-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 0.74031 + (((tickAnim - 634) / 16) * (-1.49924-(0.74031)));
            yy = -0.25906 + (((tickAnim - 634) / 16) * (6.23601-(-0.25906)));
            zz = 0.26075 + (((tickAnim - 634) / 16) * (0.497-(0.26075)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -1.49924 + (((tickAnim - 650) / 13) * (2.50076-(-1.49924)));
            yy = 6.23601 + (((tickAnim - 650) / 13) * (6.23601-(6.23601)));
            zz = 0.497 + (((tickAnim - 650) / 13) * (0.497-(0.497)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 2.50076 + (((tickAnim - 663) / 10) * (-1.24924-(2.50076)));
            yy = 6.23601 + (((tickAnim - 663) / 10) * (6.23601-(6.23601)));
            zz = 0.497 + (((tickAnim - 663) / 10) * (0.497-(0.497)));
        }
        else if (tickAnim >= 673 && tickAnim < 677) {
            xx = -1.24924 + (((tickAnim - 673) / 4) * (-3.24924-(-1.24924)));
            yy = 6.23601 + (((tickAnim - 673) / 4) * (6.23601-(6.23601)));
            zz = 0.497 + (((tickAnim - 673) / 4) * (0.497-(0.497)));
        }
        else if (tickAnim >= 677 && tickAnim < 683) {
            xx = -3.24924 + (((tickAnim - 677) / 6) * (0.25076-(-3.24924)));
            yy = 6.23601 + (((tickAnim - 677) / 6) * (6.23601-(6.23601)));
            zz = 0.497 + (((tickAnim - 677) / 6) * (0.497-(0.497)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 0.25076 + (((tickAnim - 683) / 9) * (-1.99924-(0.25076)));
            yy = 6.23601 + (((tickAnim - 683) / 9) * (6.23601-(6.23601)));
            zz = 0.497 + (((tickAnim - 683) / 9) * (0.497-(0.497)));
        }
        else if (tickAnim >= 692 && tickAnim < 709) {
            xx = -1.99924 + (((tickAnim - 692) / 17) * (-7.6699-(-1.99924)));
            yy = 6.23601 + (((tickAnim - 692) / 17) * (4.56648-(6.23601)));
            zz = 0.497 + (((tickAnim - 692) / 17) * (0.36394-(0.497)));
        }
        else if (tickAnim >= 709 && tickAnim < 725) {
            xx = -7.6699 + (((tickAnim - 709) / 16) * (-8.78092-(-7.6699)));
            yy = 4.56648 + (((tickAnim - 709) / 16) * (3.14413-(4.56648)));
            zz = 0.36394 + (((tickAnim - 709) / 16) * (0.25058-(0.36394)));
        }
        else if (tickAnim >= 725 && tickAnim < 742) {
            xx = -8.78092 + (((tickAnim - 725) / 17) * (-0.87207-(-8.78092)));
            yy = 3.14413 + (((tickAnim - 725) / 17) * (1.5252-(3.14413)));
            zz = 0.25058 + (((tickAnim - 725) / 17) * (0.12156-(0.25058)));
        }
        else if (tickAnim >= 742 && tickAnim < 760) {
            xx = -0.87207 + (((tickAnim - 742) / 18) * (0-(-0.87207)));
            yy = 1.5252 + (((tickAnim - 742) / 18) * (0-(1.5252)));
            zz = 0.12156 + (((tickAnim - 742) / 18) * (0-(0.12156)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (8.54-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 8.54 + (((tickAnim - 15) / 15) * (-4-(8.54)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4 + (((tickAnim - 30) / 20) * (8.5-(-4)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            yy = 8.5 + (((tickAnim - 50) / 25) * (3-(8.5)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (10.75-(0)));
            yy = 3 + (((tickAnim - 75) / 25) * (3-(3)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 10.75 + (((tickAnim - 100) / 70) * (10.75-(10.75)));
            yy = 3 + (((tickAnim - 100) / 70) * (3-(3)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 10.75 + (((tickAnim - 170) / 29) * (0-(10.75)));
            yy = 3 + (((tickAnim - 170) / 29) * (0-(3)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (1.75-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 280) / 88) * (0-(0)));
            yy = 1.75 + (((tickAnim - 280) / 88) * (3.75-(1.75)));
            zz = 0 + (((tickAnim - 280) / 88) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 3.75 + (((tickAnim - 368) / 67) * (1-(3.75)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 435) / 58) * (0-(0)));
            yy = 1 + (((tickAnim - 435) / 58) * (-1.25-(1)));
            zz = 0 + (((tickAnim - 435) / 58) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 493) / 122) * (0-(0)));
            yy = -1.25 + (((tickAnim - 493) / 122) * (-5.5-(-1.25)));
            zz = 0 + (((tickAnim - 493) / 122) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = -5.5 + (((tickAnim - 615) / 3) * (-5.5-(-5.5)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (-4.18978-(0)));
            yy = -5.5 + (((tickAnim - 618) / 2) * (-4.81254-(-5.5)));
            zz = 0 + (((tickAnim - 618) / 2) * (-0.04491-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -4.18978 + (((tickAnim - 620) / 2) * (-5.68978-(-4.18978)));
            yy = -4.81254 + (((tickAnim - 620) / 2) * (-4.81254-(-4.81254)));
            zz = -0.04491 + (((tickAnim - 620) / 2) * (-0.04491-(-0.04491)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = -5.68978 + (((tickAnim - 622) / 5) * (-1.18978-(-5.68978)));
            yy = -4.81254 + (((tickAnim - 622) / 5) * (-4.81254-(-4.81254)));
            zz = -0.04491 + (((tickAnim - 622) / 5) * (-0.04491-(-0.04491)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -1.18978 + (((tickAnim - 627) / 7) * (5.30823-(-1.18978)));
            yy = -4.81254 + (((tickAnim - 627) / 7) * (2.18692-(-4.81254)));
            zz = -0.04491 + (((tickAnim - 627) / 7) * (0.04171-(-0.04491)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 5.30823 + (((tickAnim - 634) / 16) * (3.78743-(5.30823)));
            yy = 2.18692 + (((tickAnim - 634) / 16) * (14.1858-(2.18692)));
            zz = 0.04171 + (((tickAnim - 634) / 16) * (-0.06842-(0.04171)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 3.78743 + (((tickAnim - 650) / 13) * (12.03743-(3.78743)));
            yy = 14.1858 + (((tickAnim - 650) / 13) * (14.1858-(14.1858)));
            zz = -0.06842 + (((tickAnim - 650) / 13) * (-0.06842-(-0.06842)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 12.03743 + (((tickAnim - 663) / 10) * (6.78743-(12.03743)));
            yy = 14.1858 + (((tickAnim - 663) / 10) * (14.1858-(14.1858)));
            zz = -0.06842 + (((tickAnim - 663) / 10) * (-0.06842-(-0.06842)));
        }
        else if (tickAnim >= 673 && tickAnim < 677) {
            xx = 6.78743 + (((tickAnim - 673) / 4) * (4.12076-(6.78743)));
            yy = 14.1858 + (((tickAnim - 673) / 4) * (14.1858-(14.1858)));
            zz = -0.06842 + (((tickAnim - 673) / 4) * (-0.06842-(-0.06842)));
        }
        else if (tickAnim >= 677 && tickAnim < 683) {
            xx = 4.12076 + (((tickAnim - 677) / 6) * (11.53743-(4.12076)));
            yy = 14.1858 + (((tickAnim - 677) / 6) * (14.1858-(14.1858)));
            zz = -0.06842 + (((tickAnim - 677) / 6) * (-0.06842-(-0.06842)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 11.53743 + (((tickAnim - 683) / 9) * (8.53743-(11.53743)));
            yy = 14.1858 + (((tickAnim - 683) / 9) * (14.1858-(14.1858)));
            zz = -0.06842 + (((tickAnim - 683) / 9) * (-0.06842-(-0.06842)));
        }
        else if (tickAnim >= 692 && tickAnim < 709) {
            xx = 8.53743 + (((tickAnim - 692) / 17) * (-0.2023-(8.53743)));
            yy = 14.1858 + (((tickAnim - 692) / 17) * (10.36748-(14.1858)));
            zz = -0.06842 + (((tickAnim - 692) / 17) * (-0.05-(-0.06842)));
        }
        else if (tickAnim >= 709 && tickAnim < 742) {
            xx = -0.2023 + (((tickAnim - 709) / 33) * (2.9603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-0.2023)));
            yy = 10.36748 + (((tickAnim - 709) / 33) * (3.13722-(10.36748)));
            zz = -0.05 + (((tickAnim - 709) / 33) * (-0.01513-(-0.05)));
        }
        else if (tickAnim >= 742 && tickAnim < 760) {
            xx = 2.9603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 742) / 18) * (0-(2.9603+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
            yy = 3.13722 + (((tickAnim - 742) / 18) * (0-(3.13722)));
            zz = -0.01513 + (((tickAnim - 742) / 18) * (0-(-0.01513)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (5.82-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 5.82 + (((tickAnim - 15) / 15) * (-8-(5.82)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -8 + (((tickAnim - 30) / 20) * (12.25-(-8)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            yy = 12.25 + (((tickAnim - 50) / 25) * (6.25-(12.25)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 75) / 25) * (11.5-(0)));
            yy = 6.25 + (((tickAnim - 75) / 25) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 11.5 + (((tickAnim - 100) / 70) * (11.5-(11.5)));
            yy = 6.25 + (((tickAnim - 100) / 70) * (6.25-(6.25)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 11.5 + (((tickAnim - 170) / 29) * (0-(11.5)));
            yy = 6.25 + (((tickAnim - 170) / 29) * (0-(6.25)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (4.25-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 280) / 88) * (0-(0)));
            yy = 4.25 + (((tickAnim - 280) / 88) * (9-(4.25)));
            zz = 0 + (((tickAnim - 280) / 88) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 9 + (((tickAnim - 368) / 67) * (4.25-(9)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 435) / 58) * (0-(0)));
            yy = 4.25 + (((tickAnim - 435) / 58) * (-0.75-(4.25)));
            zz = 0 + (((tickAnim - 435) / 58) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 493) / 122) * (0-(0)));
            yy = -0.75 + (((tickAnim - 493) / 122) * (-6-(-0.75)));
            zz = 0 + (((tickAnim - 493) / 122) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = -6 + (((tickAnim - 615) / 3) * (-6-(-6)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (-2.5-(0)));
            yy = -6 + (((tickAnim - 618) / 2) * (-6-(-6)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -2.5 + (((tickAnim - 620) / 2) * (-7-(-2.5)));
            yy = -6 + (((tickAnim - 620) / 2) * (-6-(-6)));
            zz = 0 + (((tickAnim - 620) / 2) * (0-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 627) {
            xx = -7 + (((tickAnim - 622) / 5) * (-8.25-(-7)));
            yy = -6 + (((tickAnim - 622) / 5) * (-6-(-6)));
            zz = 0 + (((tickAnim - 622) / 5) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -8.25 + (((tickAnim - 627) / 7) * (-0.48839-(-8.25)));
            yy = -6 + (((tickAnim - 627) / 7) * (4.93028-(-6)));
            zz = 0 + (((tickAnim - 627) / 7) * (-1.23849-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -0.48839 + (((tickAnim - 634) / 16) * (9.69753-(-0.48839)));
            yy = 4.93028 + (((tickAnim - 634) / 16) * (9.40138-(4.93028)));
            zz = -1.23849 + (((tickAnim - 634) / 16) * (-1.75181-(-1.23849)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 9.69753 + (((tickAnim - 650) / 13) * (15.94753-(9.69753)));
            yy = 9.40138 + (((tickAnim - 650) / 13) * (9.40138-(9.40138)));
            zz = -1.75181 + (((tickAnim - 650) / 13) * (-1.75181-(-1.75181)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 15.94753 + (((tickAnim - 663) / 10) * (7.94753-(15.94753)));
            yy = 9.40138 + (((tickAnim - 663) / 10) * (9.40138-(9.40138)));
            zz = -1.75181 + (((tickAnim - 663) / 10) * (-1.75181-(-1.75181)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = 7.94753 + (((tickAnim - 673) / 10) * (12.19753-(7.94753)));
            yy = 9.40138 + (((tickAnim - 673) / 10) * (9.40138-(9.40138)));
            zz = -1.75181 + (((tickAnim - 673) / 10) * (-1.75181-(-1.75181)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 12.19753 + (((tickAnim - 683) / 9) * (7.44753-(12.19753)));
            yy = 9.40138 + (((tickAnim - 683) / 9) * (9.40138-(9.40138)));
            zz = -1.75181 + (((tickAnim - 683) / 9) * (-1.75181-(-1.75181)));
        }
        else if (tickAnim >= 692 && tickAnim < 709) {
            xx = 7.44753 + (((tickAnim - 692) / 17) * (2.22814-(7.44753)));
            yy = 9.40138 + (((tickAnim - 692) / 17) * (6.8844-(9.40138)));
            zz = -1.75181 + (((tickAnim - 692) / 17) * (-1.28281-(-1.75181)));
        }
        else if (tickAnim >= 709 && tickAnim < 725) {
            xx = 2.22814 + (((tickAnim - 709) / 16) * (-0.46587-(2.22814)));
            yy = 6.8844 + (((tickAnim - 709) / 16) * (4.74008-(6.8844)));
            zz = -1.28281 + (((tickAnim - 709) / 16) * (-0.88325-(-1.28281)));
        }
        else if (tickAnim >= 725 && tickAnim < 733) {
            xx = -0.46587 + (((tickAnim - 725) / 8) * (-1.46188-(-0.46587)));
            yy = 4.74008 + (((tickAnim - 725) / 8) * (2.37631-(4.74008)));
            zz = -0.88325 + (((tickAnim - 725) / 8) * (-0.44279-(-0.88325)));
        }
        else if (tickAnim >= 733 && tickAnim < 744) {
            xx = -1.46188 + (((tickAnim - 733) / 11) * (6.17794-(-1.46188)));
            yy = 2.37631 + (((tickAnim - 733) / 11) * (1.36003-(2.37631)));
            zz = -0.44279 + (((tickAnim - 733) / 11) * (-0.25342-(-0.44279)));
        }
        else if (tickAnim >= 744 && tickAnim < 760) {
            xx = 6.17794 + (((tickAnim - 744) / 16) * (0-(6.17794)));
            yy = 1.36003 + (((tickAnim - 744) / 16) * (0-(1.36003)));
            zz = -0.25342 + (((tickAnim - 744) / 16) * (0-(-0.25342)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 19.25 + (((tickAnim - 15) / 15) * (16-(19.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 16 + (((tickAnim - 30) / 20) * (18.77525-(16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0.09996-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (-0.49056-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 73) {
            xx = 18.77525 + (((tickAnim - 50) / 23) * (18.77525-(18.77525)));
            yy = 0.09996 + (((tickAnim - 50) / 23) * (0.09996-(0.09996)));
            zz = -0.49056 + (((tickAnim - 50) / 23) * (-0.49056-(-0.49056)));
        }
        else if (tickAnim >= 73 && tickAnim < 100) {
            xx = 18.77525 + (((tickAnim - 73) / 27) * (16.52525-(18.77525)));
            yy = 0.09996 + (((tickAnim - 73) / 27) * (0.09996-(0.09996)));
            zz = -0.49056 + (((tickAnim - 73) / 27) * (-0.49056-(-0.49056)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 16.52525 + (((tickAnim - 100) / 70) * (15.27525-(16.52525)));
            yy = 0.09996 + (((tickAnim - 100) / 70) * (0.09996-(0.09996)));
            zz = -0.49056 + (((tickAnim - 100) / 70) * (-0.49056-(-0.49056)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 15.27525 + (((tickAnim - 170) / 29) * (-22.72475-(15.27525)));
            yy = 0.09996 + (((tickAnim - 170) / 29) * (0.09996-(0.09996)));
            zz = -0.49056 + (((tickAnim - 170) / 29) * (-0.49056-(-0.49056)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = -22.72475 + (((tickAnim - 199) / 81) * (-22.72475-(-22.72475)));
            yy = 0.09996 + (((tickAnim - 199) / 81) * (0.09996-(0.09996)));
            zz = -0.49056 + (((tickAnim - 199) / 81) * (-0.49056-(-0.49056)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = -22.72475 + (((tickAnim - 280) / 24) * (-9.65557-(-22.72475)));
            yy = 0.09996 + (((tickAnim - 280) / 24) * (-2.37683-(0.09996)));
            zz = -0.49056 + (((tickAnim - 280) / 24) * (-11.22077-(-0.49056)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = -9.65557 + (((tickAnim - 304) / 16) * (-1.18381-(-9.65557)));
            yy = -2.37683 + (((tickAnim - 304) / 16) * (-1.37441-(-2.37683)));
            zz = -11.22077 + (((tickAnim - 304) / 16) * (-8.05774-(-11.22077)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = -1.18381 + (((tickAnim - 320) / 48) * (-1.18381-(-1.18381)));
            yy = -1.37441 + (((tickAnim - 320) / 48) * (-1.37441-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 320) / 48) * (-8.05774-(-8.05774)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -1.18381 + (((tickAnim - 368) / 67) * (-1.18381-(-1.18381)));
            yy = -1.37441 + (((tickAnim - 368) / 67) * (-1.37441-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 368) / 67) * (-8.05774-(-8.05774)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = -1.18381 + (((tickAnim - 435) / 45) * (-1.18381-(-1.18381)));
            yy = -1.37441 + (((tickAnim - 435) / 45) * (-1.37441-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 435) / 45) * (-8.05774-(-8.05774)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = -1.18381 + (((tickAnim - 480) / 60) * (-1.18381-(-1.18381)));
            yy = -1.37441 + (((tickAnim - 480) / 60) * (-1.37441-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 480) / 60) * (-8.05774-(-8.05774)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = -1.18381 + (((tickAnim - 540) / 75) * (-1.18381-(-1.18381)));
            yy = -1.37441 + (((tickAnim - 540) / 75) * (-1.37441-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 540) / 75) * (-8.05774-(-8.05774)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = -1.18381 + (((tickAnim - 615) / 3) * (-0.18381-(-1.18381)));
            yy = -1.37441 + (((tickAnim - 615) / 3) * (-1.37441-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 615) / 3) * (-8.05774-(-8.05774)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = -0.18381 + (((tickAnim - 618) / 2) * (-11.44631-(-0.18381)));
            yy = -1.37441 + (((tickAnim - 618) / 2) * (-9.2022-(-1.37441)));
            zz = -8.05774 + (((tickAnim - 618) / 2) * (-7.71814-(-8.05774)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -11.44631 + (((tickAnim - 620) / 2) * (-15.4977-(-11.44631)));
            yy = -9.2022 + (((tickAnim - 620) / 2) * (-6.59853-(-9.2022)));
            zz = -7.71814 + (((tickAnim - 620) / 2) * (-7.53298-(-7.71814)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -15.4977 + (((tickAnim - 622) / 1) * (-17.33102-(-15.4977)));
            yy = -6.59853 + (((tickAnim - 622) / 1) * (-6.59853-(-6.59853)));
            zz = -7.53298 + (((tickAnim - 622) / 1) * (-7.53298-(-7.53298)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -17.33102 + (((tickAnim - 623) / 4) * (-13.9977-(-17.33102)));
            yy = -6.59853 + (((tickAnim - 623) / 4) * (-6.59853-(-6.59853)));
            zz = -7.53298 + (((tickAnim - 623) / 4) * (-7.53298-(-7.53298)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -13.9977 + (((tickAnim - 627) / 7) * (-10.9977-(-13.9977)));
            yy = -6.59853 + (((tickAnim - 627) / 7) * (-6.59853-(-6.59853)));
            zz = -7.53298 + (((tickAnim - 627) / 7) * (-7.53298-(-7.53298)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -10.9977 + (((tickAnim - 634) / 16) * (8.47868-(-10.9977)));
            yy = -6.59853 + (((tickAnim - 634) / 16) * (-19.77162-(-6.59853)));
            zz = -7.53298 + (((tickAnim - 634) / 16) * (-14.54276-(-7.53298)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 8.47868 + (((tickAnim - 650) / 13) * (9.45147-(8.47868)));
            yy = -19.77162 + (((tickAnim - 650) / 13) * (-11.208-(-19.77162)));
            zz = -14.54276 + (((tickAnim - 650) / 13) * (-18.25342-(-14.54276)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 9.45147 + (((tickAnim - 663) / 10) * (9.95147-(9.45147)));
            yy = -11.208 + (((tickAnim - 663) / 10) * (-11.208-(-11.208)));
            zz = -18.25342 + (((tickAnim - 663) / 10) * (-18.25342-(-18.25342)));
        }
        else if (tickAnim >= 673 && tickAnim < 687) {
            xx = 9.95147 + (((tickAnim - 673) / 14) * (10.95147-(9.95147)));
            yy = -11.208 + (((tickAnim - 673) / 14) * (-11.208-(-11.208)));
            zz = -18.25342 + (((tickAnim - 673) / 14) * (-18.25342-(-18.25342)));
        }
        else if (tickAnim >= 687 && tickAnim < 692) {
            xx = 10.95147 + (((tickAnim - 687) / 5) * (10.95147-(10.95147)));
            yy = -11.208 + (((tickAnim - 687) / 5) * (-11.208-(-11.208)));
            zz = -18.25342 + (((tickAnim - 687) / 5) * (-18.25342-(-18.25342)));
        }
        else if (tickAnim >= 692 && tickAnim < 725) {
            xx = 10.95147 + (((tickAnim - 692) / 33) * (1.42773-(10.95147)));
            yy = -11.208 + (((tickAnim - 692) / 33) * (-6.83414-(-11.208)));
            zz = -18.25342 + (((tickAnim - 692) / 33) * (-11.13013-(-18.25342)));
        }
        else if (tickAnim >= 725 && tickAnim < 743) {
            xx = 1.42773 + (((tickAnim - 725) / 18) * (5.46386-(1.42773)));
            yy = -6.83414 + (((tickAnim - 725) / 18) * (-3.41707-(-6.83414)));
            zz = -11.13013 + (((tickAnim - 725) / 18) * (-5.56507-(-11.13013)));
        }
        else if (tickAnim >= 743 && tickAnim < 760) {
            xx = 5.46386 + (((tickAnim - 743) / 17) * (0-(5.46386)));
            yy = -3.41707 + (((tickAnim - 743) / 17) * (0-(-3.41707)));
            zz = -5.56507 + (((tickAnim - 743) / 17) * (0-(-5.56507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.38-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20.38 + (((tickAnim - 15) / 15) * (-4.25-(20.38)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 30) / 20) * (-2.5-(-4.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -2.5 + (((tickAnim - 50) / 25) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -2.5 + (((tickAnim - 75) / 15) * (10.7-(-2.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = 10.7 + (((tickAnim - 90) / 10) * (13.5-(10.7)));
            yy = 0 + (((tickAnim - 90) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 13.5 + (((tickAnim - 100) / 70) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 192) {
            xx = 13.5 + (((tickAnim - 170) / 22) * (-4.12-(13.5)));
            yy = 0 + (((tickAnim - 170) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 22) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 199) {
            xx = -4.12 + (((tickAnim - 192) / 7) * (-7-(-4.12)));
            yy = 0 + (((tickAnim - 192) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 7) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = -7 + (((tickAnim - 199) / 81) * (-7-(-7)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 304) {
            xx = -7 + (((tickAnim - 280) / 24) * (-1.06532-(-7)));
            yy = 0 + (((tickAnim - 280) / 24) * (-3.76477-(0)));
            zz = 0 + (((tickAnim - 280) / 24) * (5.0916-(0)));
        }
        else if (tickAnim >= 304 && tickAnim < 320) {
            xx = -1.06532 + (((tickAnim - 304) / 16) * (3.43151-(-1.06532)));
            yy = -3.76477 + (((tickAnim - 304) / 16) * (-2.53445-(-3.76477)));
            zz = 5.0916 + (((tickAnim - 304) / 16) * (3.09561-(5.0916)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 3.43151 + (((tickAnim - 320) / 48) * (3.43151-(3.43151)));
            yy = -2.53445 + (((tickAnim - 320) / 48) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 320) / 48) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 3.43151 + (((tickAnim - 368) / 67) * (3.43151-(3.43151)));
            yy = -2.53445 + (((tickAnim - 368) / 67) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 368) / 67) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 3.43151 + (((tickAnim - 435) / 45) * (3.43151-(3.43151)));
            yy = -2.53445 + (((tickAnim - 435) / 45) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 435) / 45) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = 3.43151 + (((tickAnim - 480) / 60) * (3.43151-(3.43151)));
            yy = -2.53445 + (((tickAnim - 480) / 60) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 480) / 60) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = 3.43151 + (((tickAnim - 540) / 75) * (3.43151-(3.43151)));
            yy = -2.53445 + (((tickAnim - 540) / 75) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 540) / 75) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 3.43151 + (((tickAnim - 615) / 3) * (3.43151-(3.43151)));
            yy = -2.53445 + (((tickAnim - 615) / 3) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 615) / 3) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 3.43151 + (((tickAnim - 618) / 2) * (-0.81849-(3.43151)));
            yy = -2.53445 + (((tickAnim - 618) / 2) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 618) / 2) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -0.81849 + (((tickAnim - 620) / 2) * (-2.56849-(-0.81849)));
            yy = -2.53445 + (((tickAnim - 620) / 2) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 620) / 2) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -2.56849 + (((tickAnim - 622) / 1) * (-2.56849-(-2.56849)));
            yy = -2.53445 + (((tickAnim - 622) / 1) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 622) / 1) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -2.56849 + (((tickAnim - 623) / 4) * (-2.56849-(-2.56849)));
            yy = -2.53445 + (((tickAnim - 623) / 4) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 623) / 4) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -2.56849 + (((tickAnim - 627) / 7) * (-2.56849-(-2.56849)));
            yy = -2.53445 + (((tickAnim - 627) / 7) * (-2.53445-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 627) / 7) * (3.09561-(3.09561)));
        }
        else if (tickAnim >= 634 && tickAnim < 643) {
            xx = -2.56849 + (((tickAnim - 634) / 9) * (33.62783-(-2.56849)));
            yy = -2.53445 + (((tickAnim - 634) / 9) * (-2.0891-(-2.53445)));
            zz = 3.09561 + (((tickAnim - 634) / 9) * (-10.8406-(3.09561)));
        }
        else if (tickAnim >= 643 && tickAnim < 650) {
            xx = 33.62783 + (((tickAnim - 643) / 7) * (0-(33.62783)));
            yy = -2.0891 + (((tickAnim - 643) / 7) * (0-(-2.0891)));
            zz = -10.8406 + (((tickAnim - 643) / 7) * (-2.25-(-10.8406)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 0 + (((tickAnim - 650) / 13) * (3.95464-(0)));
            yy = 0 + (((tickAnim - 650) / 13) * (-2.08144-(0)));
            zz = -2.25 + (((tickAnim - 650) / 13) * (3.74657-(-2.25)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 3.95464 + (((tickAnim - 663) / 10) * (4.95464-(3.95464)));
            yy = -2.08144 + (((tickAnim - 663) / 10) * (-2.08144-(-2.08144)));
            zz = 3.74657 + (((tickAnim - 663) / 10) * (3.74657-(3.74657)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = 4.95464 + (((tickAnim - 673) / 19) * (4.95464-(4.95464)));
            yy = -2.08144 + (((tickAnim - 673) / 19) * (-2.08144-(-2.08144)));
            zz = 3.74657 + (((tickAnim - 673) / 19) * (3.74657-(3.74657)));
        }
        else if (tickAnim >= 692 && tickAnim < 725) {
            xx = 4.95464 + (((tickAnim - 692) / 33) * (2.95464-(4.95464)));
            yy = -2.08144 + (((tickAnim - 692) / 33) * (-2.08144-(-2.08144)));
            zz = 3.74657 + (((tickAnim - 692) / 33) * (3.74657-(3.74657)));
        }
        else if (tickAnim >= 725 && tickAnim < 743) {
            xx = 2.95464 + (((tickAnim - 725) / 18) * (29.26887-(2.95464)));
            yy = -2.08144 + (((tickAnim - 725) / 18) * (-0.53305-(-2.08144)));
            zz = 3.74657 + (((tickAnim - 725) / 18) * (0.95949-(3.74657)));
        }
        else if (tickAnim >= 743 && tickAnim < 760) {
            xx = 29.26887 + (((tickAnim - 743) / 17) * (0-(29.26887)));
            yy = -0.53305 + (((tickAnim - 743) / 17) * (0-(-0.53305)));
            zz = 0.95949 + (((tickAnim - 743) / 17) * (0-(0.95949)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 30) / 140) * (0-(0)));
            yy = 0.8 + (((tickAnim - 30) / 140) * (0-(0.8)));
            zz = 0 + (((tickAnim - 30) / 140) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 192) {
            xx = 0 + (((tickAnim - 170) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 22) * (2.065-(0)));
            zz = 0 + (((tickAnim - 170) / 22) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 192) / 7) * (0-(0)));
            yy = 2.065 + (((tickAnim - 192) / 7) * (0-(2.065)));
            zz = 0 + (((tickAnim - 192) / 7) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-34.37698-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.03111-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.10066-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -34.37698 + (((tickAnim - 15) / 15) * (12.74603-(-34.37698)));
            yy = 0.03111 + (((tickAnim - 15) / 15) * (0.06222-(0.03111)));
            zz = -0.10066 + (((tickAnim - 15) / 15) * (-0.20132-(-0.10066)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 12.74603 + (((tickAnim - 30) / 20) * (12.74603-(12.74603)));
            yy = 0.06222 + (((tickAnim - 30) / 20) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 30) / 20) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 12.74603 + (((tickAnim - 50) / 25) * (12.74603-(12.74603)));
            yy = 0.06222 + (((tickAnim - 50) / 25) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 50) / 25) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 12.74603 + (((tickAnim - 75) / 25) * (25.24603-(12.74603)));
            yy = 0.06222 + (((tickAnim - 75) / 25) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 75) / 25) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 25.24603 + (((tickAnim - 100) / 70) * (19.24603-(25.24603)));
            yy = 0.06222 + (((tickAnim - 100) / 70) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 100) / 70) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = 19.24603 + (((tickAnim - 170) / 18) * (-35.99683-(19.24603)));
            yy = 0.06222 + (((tickAnim - 170) / 18) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 170) / 18) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 188 && tickAnim < 192) {
            xx = -35.99683 + (((tickAnim - 188) / 4) * (-11.6051-(-35.99683)));
            yy = 0.06222 + (((tickAnim - 188) / 4) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 188) / 4) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 192 && tickAnim < 199) {
            xx = -11.6051 + (((tickAnim - 192) / 7) * (15.99603-(-11.6051)));
            yy = 0.06222 + (((tickAnim - 192) / 7) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 192) / 7) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 15.99603 + (((tickAnim - 199) / 81) * (15.99603-(15.99603)));
            yy = 0.06222 + (((tickAnim - 199) / 81) * (0.06222-(0.06222)));
            zz = -0.20132 + (((tickAnim - 199) / 81) * (-0.20132-(-0.20132)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 15.99603 + (((tickAnim - 280) / 40) * (-8.17376-(15.99603)));
            yy = 0.06222 + (((tickAnim - 280) / 40) * (3.35511-(0.06222)));
            zz = -0.20132 + (((tickAnim - 280) / 40) * (2.48713-(-0.20132)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = -8.17376 + (((tickAnim - 320) / 48) * (-8.17376-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 320) / 48) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 320) / 48) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -8.17376 + (((tickAnim - 368) / 67) * (-8.17376-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 368) / 67) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 368) / 67) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = -8.17376 + (((tickAnim - 435) / 45) * (-8.17376-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 435) / 45) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 435) / 45) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = -8.17376 + (((tickAnim - 480) / 60) * (-8.17376-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 480) / 60) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 480) / 60) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = -8.17376 + (((tickAnim - 540) / 75) * (-8.17376-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 540) / 75) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 540) / 75) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = -8.17376 + (((tickAnim - 615) / 3) * (-8.17376-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 615) / 3) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 615) / 3) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = -8.17376 + (((tickAnim - 618) / 2) * (4.57624-(-8.17376)));
            yy = 3.35511 + (((tickAnim - 618) / 2) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 618) / 2) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 620 && tickAnim < 623) {
            xx = 4.57624 + (((tickAnim - 620) / 3) * (8.49695-(4.57624)));
            yy = 3.35511 + (((tickAnim - 620) / 3) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 620) / 3) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 8.49695 + (((tickAnim - 623) / 4) * (4.57624-(8.49695)));
            yy = 3.35511 + (((tickAnim - 623) / 4) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 623) / 4) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 4.57624 + (((tickAnim - 627) / 7) * (4.57624-(4.57624)));
            yy = 3.35511 + (((tickAnim - 627) / 7) * (3.35511-(3.35511)));
            zz = 2.48713 + (((tickAnim - 627) / 7) * (2.48713-(2.48713)));
        }
        else if (tickAnim >= 634 && tickAnim < 643) {
            xx = 4.57624 + (((tickAnim - 634) / 9) * (-21.96054-(4.57624)));
            yy = 3.35511 + (((tickAnim - 634) / 9) * (-0.22593-(3.35511)));
            zz = 2.48713 + (((tickAnim - 634) / 9) * (1.82634-(2.48713)));
        }
        else if (tickAnim >= 643 && tickAnim < 650) {
            xx = -21.96054 + (((tickAnim - 643) / 7) * (9.70678-(-21.96054)));
            yy = -0.22593 + (((tickAnim - 643) / 7) * (5.7712-(-0.22593)));
            zz = 1.82634 + (((tickAnim - 643) / 7) * (9.64858-(1.82634)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 9.70678 + (((tickAnim - 650) / 13) * (6.40662-(9.70678)));
            yy = 5.7712 + (((tickAnim - 650) / 13) * (3.31921-(5.7712)));
            zz = 9.64858 + (((tickAnim - 650) / 13) * (5.86309-(9.64858)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 6.40662 + (((tickAnim - 663) / 10) * (6.40662-(6.40662)));
            yy = 3.31921 + (((tickAnim - 663) / 10) * (3.31921-(3.31921)));
            zz = 5.86309 + (((tickAnim - 663) / 10) * (5.86309-(5.86309)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = 6.40662 + (((tickAnim - 673) / 19) * (6.40662-(6.40662)));
            yy = 3.31921 + (((tickAnim - 673) / 19) * (3.31921-(3.31921)));
            zz = 5.86309 + (((tickAnim - 673) / 19) * (5.86309-(5.86309)));
        }
        else if (tickAnim >= 692 && tickAnim < 725) {
            xx = 6.40662 + (((tickAnim - 692) / 33) * (-2.59353-(6.40662)));
            yy = 3.31921 + (((tickAnim - 692) / 33) * (2.02391-(3.31921)));
            zz = 5.86309 + (((tickAnim - 692) / 33) * (3.57505-(5.86309)));
        }
        else if (tickAnim >= 725 && tickAnim < 743) {
            xx = -2.59353 + (((tickAnim - 725) / 18) * (-23.54676-(-2.59353)));
            yy = 2.02391 + (((tickAnim - 725) / 18) * (1.01196-(2.02391)));
            zz = 3.57505 + (((tickAnim - 725) / 18) * (1.78753-(3.57505)));
        }
        else if (tickAnim >= 743 && tickAnim < 760) {
            xx = -23.54676 + (((tickAnim - 743) / 17) * (0-(-23.54676)));
            yy = 1.01196 + (((tickAnim - 743) / 17) * (0-(1.01196)));
            zz = 1.78753 + (((tickAnim - 743) / 17) * (0-(1.78753)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 192) {
            xx = 0 + (((tickAnim - 0) / 192) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 192) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 192) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 192) / 568) * (0-(0)));
            yy = 0.2 + (((tickAnim - 192) / 568) * (0-(0.2)));
            zz = 0 + (((tickAnim - 192) / 568) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (97-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 97 + (((tickAnim - 15) / 15) * (-27-(97)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -27 + (((tickAnim - 30) / 20) * (-27-(-27)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -27 + (((tickAnim - 50) / 25) * (-27-(-27)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -27 + (((tickAnim - 75) / 25) * (-36.5-(-27)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = -36.5 + (((tickAnim - 100) / 70) * (-36.5-(-36.5)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 188) {
            xx = -36.5 + (((tickAnim - 170) / 18) * (63.06-(-36.5)));
            yy = 0 + (((tickAnim - 170) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 18) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 192) {
            xx = 63.06 + (((tickAnim - 188) / 4) * (52.15-(63.06)));
            yy = 0 + (((tickAnim - 188) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 4) * (0-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 199) {
            xx = 52.15 + (((tickAnim - 192) / 7) * (14-(52.15)));
            yy = 0 + (((tickAnim - 192) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 192) / 7) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 14 + (((tickAnim - 199) / 81) * (14-(14)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 14 + (((tickAnim - 280) / 40) * (5.75-(14)));
            yy = 0 + (((tickAnim - 280) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 40) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 5.75 + (((tickAnim - 320) / 48) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 48) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 5.75 + (((tickAnim - 368) / 67) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 5.75 + (((tickAnim - 435) / 45) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 45) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = 5.75 + (((tickAnim - 480) / 60) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 480) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 60) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = 5.75 + (((tickAnim - 540) / 75) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 540) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 75) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 5.75 + (((tickAnim - 615) / 3) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 5.75 + (((tickAnim - 618) / 2) * (-4.75-(5.75)));
            yy = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 627) {
            xx = -4.75 + (((tickAnim - 620) / 7) * (-1-(-4.75)));
            yy = 0 + (((tickAnim - 620) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 620) / 7) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -1 + (((tickAnim - 627) / 7) * (-1-(-1)));
            yy = 0 + (((tickAnim - 627) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 7) * (0-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 643) {
            xx = -1 + (((tickAnim - 634) / 9) * (70.1368-(-1)));
            yy = 0 + (((tickAnim - 634) / 9) * (-1.09184-(0)));
            zz = 0 + (((tickAnim - 634) / 9) * (4.84975-(0)));
        }
        else if (tickAnim >= 643 && tickAnim < 650) {
            xx = 70.1368 + (((tickAnim - 643) / 7) * (-13.75496-(70.1368)));
            yy = -1.09184 + (((tickAnim - 643) / 7) * (-0.18985-(-1.09184)));
            zz = 4.84975 + (((tickAnim - 643) / 7) * (2.99399-(4.84975)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -13.75496 + (((tickAnim - 650) / 13) * (-11.50496-(-13.75496)));
            yy = -0.18985 + (((tickAnim - 650) / 13) * (-0.18985-(-0.18985)));
            zz = 2.99399 + (((tickAnim - 650) / 13) * (2.99399-(2.99399)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -11.50496 + (((tickAnim - 663) / 10) * (-11.50496-(-11.50496)));
            yy = -0.18985 + (((tickAnim - 663) / 10) * (-0.18985-(-0.18985)));
            zz = 2.99399 + (((tickAnim - 663) / 10) * (2.99399-(2.99399)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = -11.50496 + (((tickAnim - 673) / 19) * (-11.50496-(-11.50496)));
            yy = -0.18985 + (((tickAnim - 673) / 19) * (-0.18985-(-0.18985)));
            zz = 2.99399 + (((tickAnim - 673) / 19) * (2.99399-(2.99399)));
        }
        else if (tickAnim >= 692 && tickAnim < 725) {
            xx = -11.50496 + (((tickAnim - 692) / 33) * (4.48478-(-11.50496)));
            yy = -0.18985 + (((tickAnim - 692) / 33) * (-0.11576-(-0.18985)));
            zz = 2.99399 + (((tickAnim - 692) / 33) * (1.8256-(2.99399)));
        }
        else if (tickAnim >= 725 && tickAnim < 743) {
            xx = 4.48478 + (((tickAnim - 725) / 18) * (63.74239-(4.48478)));
            yy = -0.11576 + (((tickAnim - 725) / 18) * (-0.05788-(-0.11576)));
            zz = 1.8256 + (((tickAnim - 725) / 18) * (0.9128-(1.8256)));
        }
        else if (tickAnim >= 743 && tickAnim < 760) {
            xx = 63.74239 + (((tickAnim - 743) / 17) * (0-(63.74239)));
            yy = -0.05788 + (((tickAnim - 743) / 17) * (0-(-0.05788)));
            zz = 0.9128 + (((tickAnim - 743) / 17) * (0-(0.9128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 188) {
            xx = 0 + (((tickAnim - 0) / 188) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 188) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 188) * (0-(0)));
        }
        else if (tickAnim >= 188 && tickAnim < 192) {
            xx = 0 + (((tickAnim - 188) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 188) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 188) / 4) * (-1.05-(0)));
        }
        else if (tickAnim >= 192 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 192) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 192) / 7) * (0-(0)));
            zz = -1.05 + (((tickAnim - 192) / 7) * (0-(-1.05)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 280) / 347) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 347) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 347) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 0 + (((tickAnim - 627) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 7) * (0-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 643) {
            xx = 0 + (((tickAnim - 634) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 634) / 9) * (0.835-(0)));
            zz = 0 + (((tickAnim - 634) / 9) * (-0.525-(0)));
        }
        else if (tickAnim >= 643 && tickAnim < 650) {
            xx = 0 + (((tickAnim - 643) / 7) * (0-(0)));
            yy = 0.835 + (((tickAnim - 643) / 7) * (0.425-(0.835)));
            zz = -0.525 + (((tickAnim - 643) / 7) * (0-(-0.525)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 0 + (((tickAnim - 650) / 13) * (0-(0)));
            yy = 0.425 + (((tickAnim - 650) / 13) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 650) / 13) * (0-(0)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            yy = 0.425 + (((tickAnim - 663) / 10) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 663) / 10) * (0-(0)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = 0 + (((tickAnim - 673) / 19) * (0-(0)));
            yy = 0.425 + (((tickAnim - 673) / 19) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 673) / 19) * (0-(0)));
        }
        else if (tickAnim >= 692 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 692) / 68) * (0-(0)));
            yy = 0.425 + (((tickAnim - 692) / 68) * (0-(0.425)));
            zz = 0 + (((tickAnim - 692) / 68) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-1.90674-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.89876-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.39736-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -1.90674 + (((tickAnim - 15) / 15) * (-2.51279-(-1.90674)));
            yy = 0.89876 + (((tickAnim - 15) / 15) * (1.48722-(0.89876)));
            zz = 1.39736 + (((tickAnim - 15) / 15) * (-0.19585-(1.39736)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -2.51279 + (((tickAnim - 30) / 20) * (-15.33342-(-2.51279)));
            yy = 1.48722 + (((tickAnim - 30) / 20) * (5.07357-(1.48722)));
            zz = -0.19585 + (((tickAnim - 30) / 20) * (0.90454-(-0.19585)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -15.33342 + (((tickAnim - 50) / 25) * (-15.33342-(-15.33342)));
            yy = 5.07357 + (((tickAnim - 50) / 25) * (5.07357-(5.07357)));
            zz = 0.90454 + (((tickAnim - 50) / 25) * (0.90454-(0.90454)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = -15.33342 + (((tickAnim - 75) / 25) * (-14.58342-(-15.33342)));
            yy = 5.07357 + (((tickAnim - 75) / 25) * (5.07357-(5.07357)));
            zz = 0.90454 + (((tickAnim - 75) / 25) * (0.90454-(0.90454)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = -14.58342 + (((tickAnim - 100) / 70) * (-14.58342-(-14.58342)));
            yy = 5.07357 + (((tickAnim - 100) / 70) * (5.07357-(5.07357)));
            zz = 0.90454 + (((tickAnim - 100) / 70) * (0.90454-(0.90454)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = -14.58342 + (((tickAnim - 170) / 29) * (1.91658-(-14.58342)));
            yy = 5.07357 + (((tickAnim - 170) / 29) * (5.07357-(5.07357)));
            zz = 0.90454 + (((tickAnim - 170) / 29) * (0.90454-(0.90454)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 1.91658 + (((tickAnim - 199) / 81) * (1.91658-(1.91658)));
            yy = 5.07357 + (((tickAnim - 199) / 81) * (5.07357-(5.07357)));
            zz = 0.90454 + (((tickAnim - 199) / 81) * (0.90454-(0.90454)));
        }
        else if (tickAnim >= 280 && tickAnim < 320) {
            xx = 1.91658 + (((tickAnim - 280) / 40) * (-24.65239-(1.91658)));
            yy = 5.07357 + (((tickAnim - 280) / 40) * (10.00291-(5.07357)));
            zz = 0.90454 + (((tickAnim - 280) / 40) * (2.92497-(0.90454)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = -24.65239 + (((tickAnim - 320) / 48) * (-24.65239-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 320) / 48) * (10.00291-(10.00291)));
            zz = 2.92497 + (((tickAnim - 320) / 48) * (2.92497-(2.92497)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -24.65239 + (((tickAnim - 368) / 67) * (-24.65239-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 368) / 67) * (10.00291-(10.00291)));
            zz = 2.92497 + (((tickAnim - 368) / 67) * (2.92497-(2.92497)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = -24.65239 + (((tickAnim - 435) / 45) * (-24.65239-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 435) / 45) * (10.00291-(10.00291)));
            zz = 2.92497 + (((tickAnim - 435) / 45) * (2.92497-(2.92497)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = -24.65239 + (((tickAnim - 480) / 60) * (-24.65239-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 480) / 60) * (10.00291-(10.00291)));
            zz = 2.92497 + (((tickAnim - 480) / 60) * (2.92497-(2.92497)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = -24.65239 + (((tickAnim - 540) / 75) * (-24.65239-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 540) / 75) * (10.00291-(10.00291)));
            zz = 2.92497 + (((tickAnim - 540) / 75) * (2.92497-(2.92497)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = -24.65239 + (((tickAnim - 615) / 3) * (-24.65239-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 615) / 3) * (10.00291-(10.00291)));
            zz = 2.92497 + (((tickAnim - 615) / 3) * (2.92497-(2.92497)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = -24.65239 + (((tickAnim - 618) / 2) * (-31.1739-(-24.65239)));
            yy = 10.00291 + (((tickAnim - 618) / 2) * (6.23411-(10.00291)));
            zz = 2.92497 + (((tickAnim - 618) / 2) * (5.42292-(2.92497)));
        }
        else if (tickAnim >= 620 && tickAnim < 623) {
            xx = -31.1739 + (((tickAnim - 620) / 3) * (-33.51824-(-31.1739)));
            yy = 6.23411 + (((tickAnim - 620) / 3) * (8.91031-(6.23411)));
            zz = 5.42292 + (((tickAnim - 620) / 3) * (3.54686-(5.42292)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -33.51824 + (((tickAnim - 623) / 4) * (-32.26824-(-33.51824)));
            yy = 8.91031 + (((tickAnim - 623) / 4) * (8.91031-(8.91031)));
            zz = 3.54686 + (((tickAnim - 623) / 4) * (3.54686-(3.54686)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -32.26824 + (((tickAnim - 627) / 7) * (-26.35611-(-32.26824)));
            yy = 8.91031 + (((tickAnim - 627) / 7) * (15.72826-(8.91031)));
            zz = 3.54686 + (((tickAnim - 627) / 7) * (4.7367-(3.54686)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -26.35611 + (((tickAnim - 634) / 16) * (-22.62573-(-26.35611)));
            yy = 15.72826 + (((tickAnim - 634) / 16) * (23.34006-(15.72826)));
            zz = 4.7367 + (((tickAnim - 634) / 16) * (3.08911-(4.7367)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -22.62573 + (((tickAnim - 650) / 13) * (-11.17094-(-22.62573)));
            yy = 23.34006 + (((tickAnim - 650) / 13) * (24.99361-(23.34006)));
            zz = 3.08911 + (((tickAnim - 650) / 13) * (4.51089-(3.08911)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -11.17094 + (((tickAnim - 663) / 10) * (-10.42094-(-11.17094)));
            yy = 24.99361 + (((tickAnim - 663) / 10) * (24.99361-(24.99361)));
            zz = 4.51089 + (((tickAnim - 663) / 10) * (4.51089-(4.51089)));
        }
        else if (tickAnim >= 673 && tickAnim < 687) {
            xx = -10.42094 + (((tickAnim - 673) / 14) * (-9.42094-(-10.42094)));
            yy = 24.99361 + (((tickAnim - 673) / 14) * (24.99361-(24.99361)));
            zz = 4.51089 + (((tickAnim - 673) / 14) * (4.51089-(4.51089)));
        }
        else if (tickAnim >= 687 && tickAnim < 692) {
            xx = -9.42094 + (((tickAnim - 687) / 5) * (-9.42094-(-9.42094)));
            yy = 24.99361 + (((tickAnim - 687) / 5) * (24.99361-(24.99361)));
            zz = 4.51089 + (((tickAnim - 687) / 5) * (4.51089-(4.51089)));
        }
        else if (tickAnim >= 692 && tickAnim < 708) {
            xx = -9.42094 + (((tickAnim - 692) / 16) * (4.75552-(-9.42094)));
            yy = 24.99361 + (((tickAnim - 692) / 16) * (15.24001-(24.99361)));
            zz = 4.51089 + (((tickAnim - 692) / 16) * (2.75054-(4.51089)));
        }
        else if (tickAnim >= 708 && tickAnim < 725) {
            xx = 4.75552 + (((tickAnim - 708) / 17) * (12.5-(4.75552)));
            yy = 15.24001 + (((tickAnim - 708) / 17) * (0-(15.24001)));
            zz = 2.75054 + (((tickAnim - 708) / 17) * (0-(2.75054)));
        }
        else if (tickAnim >= 725 && tickAnim < 760) {
            xx = 12.5 + (((tickAnim - 725) / 35) * (0-(12.5)));
            yy = 0 + (((tickAnim - 725) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.63-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 1.63 + (((tickAnim - 15) / 15) * (5-(1.63)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 30) / 10) * (-0.68723-(5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.23489-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (-0.59365-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -0.68723 + (((tickAnim - 40) / 10) * (-14.25672-(-0.68723)));
            yy = 0.23489 + (((tickAnim - 40) / 10) * (0.55189-(0.23489)));
            zz = -0.59365 + (((tickAnim - 40) / 10) * (-1.3948-(-0.59365)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = -14.25672 + (((tickAnim - 50) / 25) * (-14.25672-(-14.25672)));
            yy = 0.55189 + (((tickAnim - 50) / 25) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 50) / 25) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -14.25672 + (((tickAnim - 75) / 15) * (-3.45672-(-14.25672)));
            yy = 0.55189 + (((tickAnim - 75) / 15) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 75) / 15) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -3.45672 + (((tickAnim - 90) / 10) * (-0.00672-(-3.45672)));
            yy = 0.55189 + (((tickAnim - 90) / 10) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 90) / 10) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = -0.00672 + (((tickAnim - 100) / 70) * (-0.00672-(-0.00672)));
            yy = 0.55189 + (((tickAnim - 100) / 70) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 100) / 70) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = -0.00672 + (((tickAnim - 170) / 29) * (-0.50672-(-0.00672)));
            yy = 0.55189 + (((tickAnim - 170) / 29) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 170) / 29) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = -0.50672 + (((tickAnim - 199) / 81) * (-0.50672-(-0.50672)));
            yy = 0.55189 + (((tickAnim - 199) / 81) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 199) / 81) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 280 && tickAnim < 307) {
            xx = -0.50672 + (((tickAnim - 280) / 27) * (-0.0484+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+40))*10-(-0.50672)));
            yy = 0.55189 + (((tickAnim - 280) / 27) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 280) / 27) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 307 && tickAnim < 320) {
            xx = -0.0484+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+40))*10 + (((tickAnim - 307) / 13) * (-4.50672-(-0.0484+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+40))*10)));
            yy = 0.55189 + (((tickAnim - 307) / 13) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 307) / 13) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = -4.50672 + (((tickAnim - 320) / 48) * (-4.50672-(-4.50672)));
            yy = 0.55189 + (((tickAnim - 320) / 48) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 320) / 48) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -4.50672 + (((tickAnim - 368) / 67) * (-4.50672-(-4.50672)));
            yy = 0.55189 + (((tickAnim - 368) / 67) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 368) / 67) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = -4.50672 + (((tickAnim - 435) / 45) * (-4.50672-(-4.50672)));
            yy = 0.55189 + (((tickAnim - 435) / 45) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 435) / 45) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = -4.50672 + (((tickAnim - 480) / 60) * (-4.50672-(-4.50672)));
            yy = 0.55189 + (((tickAnim - 480) / 60) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 480) / 60) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = -4.50672 + (((tickAnim - 540) / 75) * (-4.50672-(-4.50672)));
            yy = 0.55189 + (((tickAnim - 540) / 75) * (0.55189-(0.55189)));
            zz = -1.3948 + (((tickAnim - 540) / 75) * (-1.3948-(-1.3948)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = -4.50672 + (((tickAnim - 615) / 3) * (-4.48523-(-4.50672)));
            yy = 0.55189 + (((tickAnim - 615) / 3) * (-0.97976-(0.55189)));
            zz = -1.3948 + (((tickAnim - 615) / 3) * (-3.2056-(-1.3948)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = -4.48523 + (((tickAnim - 618) / 2) * (-10.9745-(-4.48523)));
            yy = -0.97976 + (((tickAnim - 618) / 2) * (-0.45934-(-0.97976)));
            zz = -3.2056 + (((tickAnim - 618) / 2) * (-4.05958-(-3.2056)));
        }
        else if (tickAnim >= 620 && tickAnim < 622) {
            xx = -10.9745 + (((tickAnim - 620) / 2) * (-13.4745-(-10.9745)));
            yy = -0.45934 + (((tickAnim - 620) / 2) * (-0.45934-(-0.45934)));
            zz = -4.05958 + (((tickAnim - 620) / 2) * (-4.05958-(-4.05958)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = -13.4745 + (((tickAnim - 622) / 1) * (-13.4745-(-13.4745)));
            yy = -0.45934 + (((tickAnim - 622) / 1) * (-0.45934-(-0.45934)));
            zz = -4.05958 + (((tickAnim - 622) / 1) * (-4.05958-(-4.05958)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -13.4745 + (((tickAnim - 623) / 4) * (-12.2245-(-13.4745)));
            yy = -0.45934 + (((tickAnim - 623) / 4) * (-0.45934-(-0.45934)));
            zz = -4.05958 + (((tickAnim - 623) / 4) * (-4.05958-(-4.05958)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = -12.2245 + (((tickAnim - 627) / 7) * (-12.2245-(-12.2245)));
            yy = -0.45934 + (((tickAnim - 627) / 7) * (-0.45934-(-0.45934)));
            zz = -4.05958 + (((tickAnim - 627) / 7) * (-4.05958-(-4.05958)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = -12.2245 + (((tickAnim - 634) / 16) * (-8.61463-(-12.2245)));
            yy = -0.45934 + (((tickAnim - 634) / 16) * (-1.81079-(-0.45934)));
            zz = -4.05958 + (((tickAnim - 634) / 16) * (-1.21794-(-4.05958)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = -8.61463 + (((tickAnim - 650) / 13) * (-11.72711-(-8.61463)));
            yy = -1.81079 + (((tickAnim - 650) / 13) * (-2.40368-(-1.81079)));
            zz = -1.21794 + (((tickAnim - 650) / 13) * (-0.83195-(-1.21794)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -11.72711 + (((tickAnim - 663) / 10) * (-11.72711-(-11.72711)));
            yy = -2.40368 + (((tickAnim - 663) / 10) * (-2.40368-(-2.40368)));
            zz = -0.83195 + (((tickAnim - 663) / 10) * (-0.83195-(-0.83195)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = -11.72711 + (((tickAnim - 673) / 19) * (-11.72711-(-11.72711)));
            yy = -2.40368 + (((tickAnim - 673) / 19) * (-2.40368-(-2.40368)));
            zz = -0.83195 + (((tickAnim - 673) / 19) * (-0.83195-(-0.83195)));
        }
        else if (tickAnim >= 692 && tickAnim < 708) {
            xx = -11.72711 + (((tickAnim - 692) / 16) * (41.09933-(-11.72711)));
            yy = -2.40368 + (((tickAnim - 692) / 16) * (-1.46566-(-2.40368)));
            zz = -0.83195 + (((tickAnim - 692) / 16) * (-0.50729-(-0.83195)));
        }
        else if (tickAnim >= 708 && tickAnim < 725) {
            xx = 41.09933 + (((tickAnim - 708) / 17) * (0-(41.09933)));
            yy = -1.46566 + (((tickAnim - 708) / 17) * (0-(-1.46566)));
            zz = -0.50729 + (((tickAnim - 708) / 17) * (0-(-0.50729)));
        }
        else if (tickAnim >= 725 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 725) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 725) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 280) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 280) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 20) * (0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 300) / 20) * (0-(0)));
            yy = 0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1 + (((tickAnim - 300) / 20) * (0-(0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-1)));
            zz = 0 + (((tickAnim - 300) / 20) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 48) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            yy = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 45) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = 0 + (((tickAnim - 480) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 480) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 60) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 540) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 540) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 75) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5.25 + (((tickAnim - 15) / 15) * (-10-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (-42.5-(-10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -42.5 + (((tickAnim - 40) / 10) * (4.25-(-42.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 170) {
            xx = 4.25 + (((tickAnim - 50) / 120) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 50) / 120) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 120) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 4.25 + (((tickAnim - 170) / 29) * (-16-(4.25)));
            yy = 0 + (((tickAnim - 170) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = -16 + (((tickAnim - 199) / 81) * (-16-(-16)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = -16 + (((tickAnim - 280) / 20) * (-40.62-(-16)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 311) {
            xx = -40.62 + (((tickAnim - 300) / 11) * (-16.61-(-40.62)));
            yy = 0 + (((tickAnim - 300) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 11) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 320) {
            xx = -16.61 + (((tickAnim - 311) / 9) * (13.25-(-16.61)));
            yy = 0 + (((tickAnim - 311) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 9) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 13.25 + (((tickAnim - 320) / 48) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 48) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 13.25 + (((tickAnim - 368) / 67) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 13.25 + (((tickAnim - 435) / 45) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 45) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = 13.25 + (((tickAnim - 480) / 60) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 480) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 60) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = 13.25 + (((tickAnim - 540) / 75) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 540) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 75) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 13.25 + (((tickAnim - 615) / 3) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 13.25 + (((tickAnim - 618) / 2) * (17.02817-(13.25)));
            yy = 0 + (((tickAnim - 618) / 2) * (-1.34583-(0)));
            zz = 0 + (((tickAnim - 618) / 2) * (-2.3984-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 623) {
            xx = 17.02817 + (((tickAnim - 620) / 3) * (16.27817-(17.02817)));
            yy = -1.34583 + (((tickAnim - 620) / 3) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 620) / 3) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 16.27817 + (((tickAnim - 623) / 4) * (16.27817-(16.27817)));
            yy = -1.34583 + (((tickAnim - 623) / 4) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 623) / 4) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 16.27817 + (((tickAnim - 627) / 7) * (16.27817-(16.27817)));
            yy = -1.34583 + (((tickAnim - 627) / 7) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 627) / 7) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 16.27817 + (((tickAnim - 634) / 16) * (7.27817-(16.27817)));
            yy = -1.34583 + (((tickAnim - 634) / 16) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 634) / 16) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 7.27817 + (((tickAnim - 650) / 13) * (-7.22183-(7.27817)));
            yy = -1.34583 + (((tickAnim - 650) / 13) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 650) / 13) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -7.22183 + (((tickAnim - 663) / 10) * (-7.22183-(-7.22183)));
            yy = -1.34583 + (((tickAnim - 663) / 10) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 663) / 10) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 673 && tickAnim < 687) {
            xx = -7.22183 + (((tickAnim - 673) / 14) * (-8.47183-(-7.22183)));
            yy = -1.34583 + (((tickAnim - 673) / 14) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 673) / 14) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 687 && tickAnim < 692) {
            xx = -8.47183 + (((tickAnim - 687) / 5) * (-8.47183-(-8.47183)));
            yy = -1.34583 + (((tickAnim - 687) / 5) * (-1.34583-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 687) / 5) * (-2.3984-(-2.3984)));
        }
        else if (tickAnim >= 692 && tickAnim < 708) {
            xx = -8.47183 + (((tickAnim - 692) / 16) * (-34.16575-(-8.47183)));
            yy = -1.34583 + (((tickAnim - 692) / 16) * (-0.82063-(-1.34583)));
            zz = -2.3984 + (((tickAnim - 692) / 16) * (-1.46244-(-2.3984)));
        }
        else if (tickAnim >= 708 && tickAnim < 725) {
            xx = -34.16575 + (((tickAnim - 708) / 17) * (-9.75-(-34.16575)));
            yy = -0.82063 + (((tickAnim - 708) / 17) * (0-(-0.82063)));
            zz = -1.46244 + (((tickAnim - 708) / 17) * (0-(-1.46244)));
        }
        else if (tickAnim >= 725 && tickAnim < 760) {
            xx = -9.75 + (((tickAnim - 725) / 35) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 725) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 170) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 3.75 + (((tickAnim - 15) / 15) * (8-(3.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 30) / 10) * (74.13-(8)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 74.13 + (((tickAnim - 40) / 10) * (27.75-(74.13)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 75) {
            xx = 27.75 + (((tickAnim - 50) / 25) * (27.75-(27.75)));
            yy = 0 + (((tickAnim - 50) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 25) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 100) {
            xx = 27.75 + (((tickAnim - 75) / 25) * (22.5-(27.75)));
            yy = 0 + (((tickAnim - 75) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 25) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 170) {
            xx = 22.5 + (((tickAnim - 100) / 70) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 100) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 70) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 199) {
            xx = 22.5 + (((tickAnim - 170) / 29) * (15-(22.5)));
            yy = 0 + (((tickAnim - 170) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 29) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 15 + (((tickAnim - 199) / 81) * (15-(15)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 300) {
            xx = 15 + (((tickAnim - 280) / 20) * (74.25-(15)));
            yy = 0 + (((tickAnim - 280) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 20) * (0-(0)));
        }
        else if (tickAnim >= 300 && tickAnim < 311) {
            xx = 74.25 + (((tickAnim - 300) / 11) * (45.46-(74.25)));
            yy = 0 + (((tickAnim - 300) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 300) / 11) * (0-(0)));
        }
        else if (tickAnim >= 311 && tickAnim < 320) {
            xx = 45.46 + (((tickAnim - 311) / 9) * (17-(45.46)));
            yy = 0 + (((tickAnim - 311) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 311) / 9) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = 17 + (((tickAnim - 320) / 48) * (17-(17)));
            yy = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 48) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = 17 + (((tickAnim - 368) / 67) * (17-(17)));
            yy = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = 17 + (((tickAnim - 435) / 45) * (17-(17)));
            yy = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 45) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = 17 + (((tickAnim - 480) / 60) * (17-(17)));
            yy = 0 + (((tickAnim - 480) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 60) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 615) {
            xx = 17 + (((tickAnim - 540) / 75) * (17-(17)));
            yy = 0 + (((tickAnim - 540) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 75) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 17 + (((tickAnim - 615) / 3) * (17-(17)));
            yy = 0 + (((tickAnim - 615) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 615) / 3) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 620) {
            xx = 17 + (((tickAnim - 618) / 2) * (14.75-(17)));
            yy = 0 + (((tickAnim - 618) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 2) * (0-(0)));
        }
        else if (tickAnim >= 620 && tickAnim < 623) {
            xx = 14.75 + (((tickAnim - 620) / 3) * (12.5-(14.75)));
            yy = 0 + (((tickAnim - 620) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 620) / 3) * (0-(0)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 12.5 + (((tickAnim - 623) / 4) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 623) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 623) / 4) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 634) {
            xx = 12.5 + (((tickAnim - 627) / 7) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 627) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 7) * (0-(0)));
        }
        else if (tickAnim >= 634 && tickAnim < 650) {
            xx = 12.5 + (((tickAnim - 634) / 16) * (24.22841-(12.5)));
            yy = 0 + (((tickAnim - 634) / 16) * (-1.41209-(0)));
            zz = 0 + (((tickAnim - 634) / 16) * (1.75189-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 663) {
            xx = 24.22841 + (((tickAnim - 650) / 13) * (35.48909-(24.22841)));
            yy = -1.41209 + (((tickAnim - 650) / 13) * (-0.61488-(-1.41209)));
            zz = 1.75189 + (((tickAnim - 650) / 13) * (1.14809-(1.75189)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 35.48909 + (((tickAnim - 663) / 10) * (35.48909-(35.48909)));
            yy = -0.61488 + (((tickAnim - 663) / 10) * (-0.61488-(-0.61488)));
            zz = 1.14809 + (((tickAnim - 663) / 10) * (1.14809-(1.14809)));
        }
        else if (tickAnim >= 673 && tickAnim < 692) {
            xx = 35.48909 + (((tickAnim - 673) / 19) * (35.48909-(35.48909)));
            yy = -0.61488 + (((tickAnim - 673) / 19) * (-0.61488-(-0.61488)));
            zz = 1.14809 + (((tickAnim - 673) / 19) * (1.14809-(1.14809)));
        }
        else if (tickAnim >= 692 && tickAnim < 708) {
            xx = 35.48909 + (((tickAnim - 692) / 16) * (67.13969-(35.48909)));
            yy = -0.61488 + (((tickAnim - 692) / 16) * (-0.37492-(-0.61488)));
            zz = 1.14809 + (((tickAnim - 692) / 16) * (0.70006-(1.14809)));
        }
        else if (tickAnim >= 708 && tickAnim < 725) {
            xx = 67.13969 + (((tickAnim - 708) / 17) * (0-(67.13969)));
            yy = -0.37492 + (((tickAnim - 708) / 17) * (0-(-0.37492)));
            zz = 0.70006 + (((tickAnim - 708) / 17) * (0-(0.70006)));
        }
        else if (tickAnim >= 725 && tickAnim < 760) {
            xx = 0 + (((tickAnim - 725) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 725) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 725) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 183) {
            xx = 0 + (((tickAnim - 170) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 170) / 13) * (0.825-(0)));
            zz = 0 + (((tickAnim - 170) / 13) * (0-(0)));
        }
        else if (tickAnim >= 183 && tickAnim < 199) {
            xx = 0 + (((tickAnim - 183) / 16) * (0-(0)));
            yy = 0.825 + (((tickAnim - 183) / 16) * (0-(0.825)));
            zz = 0 + (((tickAnim - 183) / 16) * (0-(0)));
        }
        else if (tickAnim >= 199 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 199) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 199) / 81) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 126 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 126) / 5) * (2.1-(0)));
            yy = 0 + (((tickAnim - 126) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 5) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 137) {
            xx = 2.1 + (((tickAnim - 131) / 6) * (0-(2.1)));
            yy = 0 + (((tickAnim - 131) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 6) * (0-(0)));
        }
        else if (tickAnim >= 137 && tickAnim < 307) {
            xx = 0 + (((tickAnim - 137) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 137) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 137) / 170) * (0-(0)));
        }
        else if (tickAnim >= 307 && tickAnim < 320) {
            xx = 0 + (((tickAnim - 307) / 13) * (-1-(0)));
            yy = 0 + (((tickAnim - 307) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 307) / 13) * (0-(0)));
        }
        else if (tickAnim >= 320 && tickAnim < 368) {
            xx = -1 + (((tickAnim - 320) / 48) * (-1-(-1)));
            yy = 0 + (((tickAnim - 320) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 320) / 48) * (0-(0)));
        }
        else if (tickAnim >= 368 && tickAnim < 435) {
            xx = -1 + (((tickAnim - 368) / 67) * (-1-(-1)));
            yy = 0 + (((tickAnim - 368) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 368) / 67) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 480) {
            xx = -1 + (((tickAnim - 435) / 45) * (-1-(-1)));
            yy = 0 + (((tickAnim - 435) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 45) * (0-(0)));
        }
        else if (tickAnim >= 480 && tickAnim < 540) {
            xx = -1 + (((tickAnim - 480) / 60) * (-1-(-1)));
            yy = 0 + (((tickAnim - 480) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 480) / 60) * (0-(0)));
        }
        else if (tickAnim >= 540 && tickAnim < 619) {
            xx = -1 + (((tickAnim - 540) / 79) * (0-(-1)));
            yy = 0 + (((tickAnim - 540) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 540) / 79) * (0-(0)));
        }
        else if (tickAnim >= 619 && tickAnim < 622) {
            xx = 0 + (((tickAnim - 619) / 3) * (33.25-(0)));
            yy = 0 + (((tickAnim - 619) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 619) / 3) * (0-(0)));
        }
        else if (tickAnim >= 622 && tickAnim < 623) {
            xx = 33.25 + (((tickAnim - 622) / 1) * (5-(33.25)));
            yy = 0 + (((tickAnim - 622) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 622) / 1) * (0-(0)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 5 + (((tickAnim - 623) / 4) * (5-(5)));
            yy = 0 + (((tickAnim - 623) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 623) / 4) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 650) {
            xx = 5 + (((tickAnim - 627) / 23) * (5-(5)));
            yy = 0 + (((tickAnim - 627) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 23) * (0-(0)));
        }
        else if (tickAnim >= 650 && tickAnim < 657) {
            xx = 5 + (((tickAnim - 650) / 7) * (22.75-(5)));
            yy = 0 + (((tickAnim - 650) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 650) / 7) * (0-(0)));
        }
        else if (tickAnim >= 657 && tickAnim < 663) {
            xx = 22.75 + (((tickAnim - 657) / 6) * (0-(22.75)));
            yy = 0 + (((tickAnim - 657) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 657) / 6) * (0-(0)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 663) / 10) * (0-(0)));
        }
        else if (tickAnim >= 673 && tickAnim < 683) {
            xx = 0 + (((tickAnim - 673) / 10) * (9.5-(0)));
            yy = 0 + (((tickAnim - 673) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 673) / 10) * (0-(0)));
        }
        else if (tickAnim >= 683 && tickAnim < 692) {
            xx = 9.5 + (((tickAnim - 683) / 9) * (0-(9.5)));
            yy = 0 + (((tickAnim - 683) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 683) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(0), head2.rotateAngleY + (float) Math.toRadians(0), head2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 663) {
            xx = 0 + (((tickAnim - 0) / 663) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 663) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 663) * (0-(0)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = -3.25 + (((tickAnim - 663) / 10) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 663) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 653) {
            xx = 0 + (((tickAnim - 0) / 653) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 653) * (-0.49-(0)));
            zz = 0 + (((tickAnim - 0) / 653) * (0-(0)));
        }
        else if (tickAnim >= 653 && tickAnim < 663) {
            xx = 0 + (((tickAnim - 653) / 10) * (0-(0)));
            yy = -0.49 + (((tickAnim - 653) / 10) * (0.4-(-0.49)));
            zz = 0 + (((tickAnim - 653) / 10) * (0-(0)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 0 + (((tickAnim - 663) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 663) / 10) * (0-(0.4)));
            zz = 0 + (((tickAnim - 663) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 653 && tickAnim < 663) {
            xx = 1 + (((tickAnim - 653) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 653) / 10) * (1.84-(1)));
            zz = 1 + (((tickAnim - 653) / 10) * (1.415-(1)));
        }
        else if (tickAnim >= 663 && tickAnim < 673) {
            xx = 1 + (((tickAnim - 663) / 10) * (1-(1)));
            yy = 1.84 + (((tickAnim - 663) / 10) * (1-(1.84)));
            zz = 1.415 + (((tickAnim - 663) / 10) * (1-(1.415)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5 + (((tickAnim - 4) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 4) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2 + (((tickAnim - 12) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 12) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-3)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-1)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+10))*-1), chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*-1)), chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*-1)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-5), neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-1)), neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-1)));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+70))*5), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*1)));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.5), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+00))*-5), leftArm3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*5), leftArm3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*5)));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+40))*5), leftArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-5)));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0), leftArm.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*5), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-3), tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3)), tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-3), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-3), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-3), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*7.5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-3)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-3), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*7.5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*-3)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.38691 + (((tickAnim - 0) / 3) * (-5-(12.38691)));
            yy = 1.56378 + (((tickAnim - 0) / 3) * (-5-(1.56378)));
            zz = 4.18579 + (((tickAnim - 0) / 3) * (-5-(4.18579)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 3) / 5) * (-37.92535-(-5)));
            yy = -5 + (((tickAnim - 3) / 5) * (-1.47259-(-5)));
            zz = -5 + (((tickAnim - 3) / 5) * (-1.08778-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.92535 + (((tickAnim - 8) / 2) * (-15.36799-(-37.92535)));
            yy = -1.47259 + (((tickAnim - 8) / 2) * (-0.90079-(-1.47259)));
            zz = -1.08778 + (((tickAnim - 8) / 2) * (1.98795-(-1.08778)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15.36799 + (((tickAnim - 10) / 4) * (-12.67423-(-15.36799)));
            yy = -0.90079 + (((tickAnim - 10) / 4) * (-1.91296-(-0.90079)));
            zz = 1.98795 + (((tickAnim - 10) / 4) * (-0.58016-(1.98795)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.67423 + (((tickAnim - 14) / 4) * (9.9698-(-12.67423)));
            yy = -1.91296 + (((tickAnim - 14) / 4) * (2.23614-(-1.91296)));
            zz = -0.58016 + (((tickAnim - 14) / 4) * (0.23748-(-0.58016)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 9.9698 + (((tickAnim - 18) / 2) * (12.38691-(9.9698)));
            yy = 2.23614 + (((tickAnim - 18) / 2) * (1.56378-(2.23614)));
            zz = 0.23748 + (((tickAnim - 18) / 2) * (4.18579-(0.23748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 12) / 2) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 16) / 2) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.58783 + (((tickAnim - 0) / 3) * (22.5-(12.58783)));
            yy = -2.98947 + (((tickAnim - 0) / 3) * (2.5-(-2.98947)));
            zz = -0.86502 + (((tickAnim - 0) / 3) * (2.5-(-0.86502)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 3) / 5) * (22.5-(22.5)));
            yy = 2.5 + (((tickAnim - 3) / 5) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 3) / 5) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 8) / 2) * (-27.44797-(22.5)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (2.31812-(2.5)));
            zz = -2.5 + (((tickAnim - 8) / 2) * (-1.26221-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -27.44797 + (((tickAnim - 10) / 4) * (5-(-27.44797)));
            yy = 2.31812 + (((tickAnim - 10) / 4) * (-2.5-(2.31812)));
            zz = -1.26221 + (((tickAnim - 10) / 4) * (-2.5-(-1.26221)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 14) / 4) * (-2.5-(5)));
            yy = -2.5 + (((tickAnim - 14) / 4) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 14) / 4) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (12.58783-(-2.5)));
            yy = -2.5 + (((tickAnim - 18) / 2) * (-2.98947-(-2.5)));
            zz = 2.5 + (((tickAnim - 18) / 2) * (-0.86502-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 12) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (-20-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 3) / 5) * (-22.5-(-20)));
            yy = 2.5 + (((tickAnim - 3) / 5) * (5-(2.5)));
            zz = 2.5 + (((tickAnim - 3) / 5) * (5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 8) / 2) * (20-(-22.5)));
            yy = 5 + (((tickAnim - 8) / 2) * (2.5-(5)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 20 + (((tickAnim - 10) / 4) * (14.92072-(20)));
            yy = 2.5 + (((tickAnim - 10) / 4) * (1.22576-(2.5)));
            zz = 5 + (((tickAnim - 10) / 4) * (0.06169-(5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 14.92072 + (((tickAnim - 14) / 4) * (35-(14.92072)));
            yy = 1.22576 + (((tickAnim - 14) / 4) * (0-(1.22576)));
            zz = 0.06169 + (((tickAnim - 14) / 4) * (0-(0.06169)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 18) / 2) * (25-(35)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 12) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67.5 + (((tickAnim - 0) / 3) * (87.5-(67.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 87.5 + (((tickAnim - 3) / 5) * (77.5-(87.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5 + (((tickAnim - 8) / 2) * (24.34522-(77.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (3.84294-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-4.61126-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 24.34522 + (((tickAnim - 10) / 4) * (-10-(24.34522)));
            yy = 3.84294 + (((tickAnim - 10) / 4) * (2.5-(3.84294)));
            zz = -4.61126 + (((tickAnim - 10) / 4) * (0-(-4.61126)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (-17.5-(-10)));
            yy = 2.5 + (((tickAnim - 14) / 4) * (0-(2.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 18) / 2) * (67.5-(-17.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.625 + (((tickAnim - 0) / 8) * (0.63-(0.625)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.63 + (((tickAnim - 8) / 2) * (0-(0.63)));
            zz = -0.3 + (((tickAnim - 8) / 2) * (0-(-0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0.625-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -15.28343 + (((tickAnim - 0) / 4) * (-12.71468-(-15.28343)));
            yy = 1.32434 + (((tickAnim - 0) / 4) * (1.76532-(1.32434)));
            zz = -0.80885 + (((tickAnim - 0) / 4) * (0.10075-(-0.80885)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.71468 + (((tickAnim - 4) / 4) * (9.9115-(-12.71468)));
            yy = 1.76532 + (((tickAnim - 4) / 4) * (-1.07422-(1.76532)));
            zz = 0.10075 + (((tickAnim - 4) / 4) * (-1.88477-(0.10075)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 9.9115 + (((tickAnim - 8) / 2) * (12.31108-(9.9115)));
            yy = -1.07422 + (((tickAnim - 8) / 2) * (0.73747-(-1.07422)));
            zz = -1.88477 + (((tickAnim - 8) / 2) * (-2.60457-(-1.88477)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.31108 + (((tickAnim - 10) / 3) * (-5-(12.31108)));
            yy = 0.73747 + (((tickAnim - 10) / 3) * (5-(0.73747)));
            zz = -2.60457 + (((tickAnim - 10) / 3) * (5-(-2.60457)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 13) / 5) * (-37.5-(-5)));
            yy = 5 + (((tickAnim - 13) / 5) * (5-(5)));
            zz = 5 + (((tickAnim - 13) / 5) * (5-(5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.5 + (((tickAnim - 18) / 2) * (-15.28343-(-37.5)));
            yy = 5 + (((tickAnim - 18) / 2) * (1.32434-(5)));
            zz = 5 + (((tickAnim - 18) / 2) * (-0.80885-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 3) / 1) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 6) / 2) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.27954 + (((tickAnim - 0) / 4) * (4.86182-(-27.27954)));
            yy = -1.58067 + (((tickAnim - 0) / 4) * (4.45937-(-1.58067)));
            zz = -3.68601 + (((tickAnim - 0) / 4) * (0.22393-(-3.68601)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.86182 + (((tickAnim - 4) / 4) * (-2.5-(4.86182)));
            yy = 4.45937 + (((tickAnim - 4) / 4) * (2.5-(4.45937)));
            zz = 0.22393 + (((tickAnim - 4) / 4) * (-2.5-(0.22393)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (12.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            zz = -2.5 + (((tickAnim - 10) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 13) / 5) * (22.45233-(22.5)));
            yy = -2.5 + (((tickAnim - 13) / 5) * (3.88471-(-2.5)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (-1.43749-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.45233 + (((tickAnim - 18) / 2) * (-27.27954-(22.45233)));
            yy = 3.88471 + (((tickAnim - 18) / 2) * (-1.58067-(3.88471)));
            zz = -1.43749 + (((tickAnim - 18) / 2) * (-3.68601-(-1.43749)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 3) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 0) / 4) * (14.92568-(20)));
            yy = -2.5 + (((tickAnim - 0) / 4) * (-1.34173-(-2.5)));
            zz = -5 + (((tickAnim - 0) / 4) * (-0.28323-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 14.92568 + (((tickAnim - 4) / 4) * (35-(14.92568)));
            yy = -1.34173 + (((tickAnim - 4) / 4) * (0-(-1.34173)));
            zz = -0.28323 + (((tickAnim - 4) / 4) * (0-(-0.28323)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 8) / 2) * (25-(35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (-20-(25)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 13) / 5) * (-22.42502-(-20)));
            yy = -2.5 + (((tickAnim - 13) / 5) * (-6.58635-(-2.5)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (-5.74273-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22.42502 + (((tickAnim - 18) / 2) * (20-(-22.42502)));
            yy = -6.58635 + (((tickAnim - 18) / 2) * (-2.5-(-6.58635)));
            zz = -5.74273 + (((tickAnim - 18) / 2) * (-5-(-5.74273)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 3) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.19803 + (((tickAnim - 0) / 4) * (-10.19092-(25.19803)));
            yy = -4.92258 + (((tickAnim - 0) / 4) * (-3.00739-(-4.92258)));
            zz = 6.32802 + (((tickAnim - 0) / 4) * (3.97229-(6.32802)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10.19092 + (((tickAnim - 4) / 4) * (-20-(-10.19092)));
            yy = -3.00739 + (((tickAnim - 4) / 4) * (0-(-3.00739)));
            zz = 3.97229 + (((tickAnim - 4) / 4) * (0-(3.97229)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (67.5-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 67.5 + (((tickAnim - 10) / 3) * (87.5-(67.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 87.5 + (((tickAnim - 13) / 5) * (77.5-(87.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 77.5 + (((tickAnim - 18) / 2) * (25.19803-(77.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (-4.92258-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (6.32802-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 10) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*5), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*5), rightArm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), rightArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5)));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5), rightArm.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), rightArm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-110))*5)));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEustreptospondylus entity = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-20))*2), hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*3)), hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 0) / 7) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 0) / 7) * (-1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25 + (((tickAnim - 7) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25)));
            zz = -1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 7) / 6) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-1.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 13) / 12) * (-0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 25) / 7) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = -0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 25) / 7) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25 + (((tickAnim - 32) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 32) / 6) * (-1.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 38) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = -1.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 38) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-1.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-2), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-3)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-1), chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+40))*-1)), chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+40))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*5), neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-40))*-3)), neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-40))*-1)));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*10), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*3)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*1)));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*2.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*2.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-5), leftArm3.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), leftArm3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-110))*5)));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*5), leftArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*5)));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0), leftArm.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*5), leftArm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*-2), tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-4)), tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-10))*-2), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-2), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-7.5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*-5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*-2), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*3)));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.5 + (((tickAnim - 0) / 10) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 10) / 8) * (-27.5-(7.5)));
            yy = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
            zz = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 18) / 7) * (-20.62239-(-27.5)));
            yy = -5 + (((tickAnim - 18) / 7) * (-2.58725-(-5)));
            zz = -5 + (((tickAnim - 18) / 7) * (0.25664-(-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -20.62239 + (((tickAnim - 25) / 13) * (-7.80741-(-20.62239)));
            yy = -2.58725 + (((tickAnim - 25) / 13) * (-1.7641-(-2.58725)));
            zz = 0.25664 + (((tickAnim - 25) / 13) * (0.93556-(0.25664)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.80741 + (((tickAnim - 38) / 12) * (12.5-(-7.80741)));
            yy = -1.7641 + (((tickAnim - 38) / 12) * (0-(-1.7641)));
            zz = 0.93556 + (((tickAnim - 38) / 12) * (0-(0.93556)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.3-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.3 + (((tickAnim - 44) / 6) * (1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.3)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 0) / 10) * (20-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 10) / 8) * (25-(20)));
            yy = -2.5 + (((tickAnim - 10) / 8) * (-2.5-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 8) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 18) / 7) * (-17.58053-(25)));
            yy = -2.5 + (((tickAnim - 18) / 7) * (-3.04952-(-2.5)));
            zz = -2.5 + (((tickAnim - 18) / 7) * (4.16344-(-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -17.58053 + (((tickAnim - 25) / 13) * (0-(-17.58053)));
            yy = -3.04952 + (((tickAnim - 25) / 13) * (0-(-3.04952)));
            zz = 4.16344 + (((tickAnim - 25) / 13) * (1-(4.16344)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 1 + (((tickAnim - 38) / 12) * (0-(1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 44) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 0) / 10) * (-10-(30)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 10) / 8) * (-27.5-(-10)));
            yy = 2.5 + (((tickAnim - 10) / 8) * (5-(2.5)));
            zz = -2.5 + (((tickAnim - 10) / 8) * (5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 18) / 7) * (27.37941-(-27.5)));
            yy = 5 + (((tickAnim - 18) / 7) * (1.58677-(5)));
            zz = 5 + (((tickAnim - 18) / 7) * (-3.38095-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 27.37941 + (((tickAnim - 25) / 13) * (17.43022-(27.37941)));
            yy = 1.58677 + (((tickAnim - 25) / 13) * (0.30775-(1.58677)));
            zz = -3.38095 + (((tickAnim - 25) / 13) * (-1.73428-(-3.38095)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.43022 + (((tickAnim - 38) / 12) * (30-(17.43022)));
            yy = 0.30775 + (((tickAnim - 38) / 12) * (0-(0.30775)));
            zz = -1.73428 + (((tickAnim - 38) / 12) * (0-(-1.73428)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 44) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 0) / 10) * (80-(-15)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 80 + (((tickAnim - 10) / 8) * (70-(80)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 70 + (((tickAnim - 18) / 7) * (12.6783-(70)));
            yy = 0 + (((tickAnim - 18) / 7) * (4.49214-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-0.29358-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 12.6783 + (((tickAnim - 25) / 13) * (-10.02208-(12.6783)));
            yy = 4.49214 + (((tickAnim - 25) / 13) * (1.15206-(4.49214)));
            zz = -0.29358 + (((tickAnim - 25) / 13) * (-1.11143-(-0.29358)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10.02208 + (((tickAnim - 38) / 12) * (-15-(-10.02208)));
            yy = 1.15206 + (((tickAnim - 38) / 12) * (0-(1.15206)));
            zz = -1.11143 + (((tickAnim - 38) / 12) * (0-(-1.11143)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(0);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(0.425);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -20.62239 + (((tickAnim - 0) / 13) * (-7.70275-(-20.62239)));
            yy = 2.58725 + (((tickAnim - 0) / 13) * (2.02901-(2.58725)));
            zz = -0.25664 + (((tickAnim - 0) / 13) * (0.29052-(-0.25664)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.70275 + (((tickAnim - 13) / 12) * (12.44689-(-7.70275)));
            yy = 2.02901 + (((tickAnim - 13) / 12) * (0.13906-(2.02901)));
            zz = 0.29052 + (((tickAnim - 13) / 12) * (-0.99171-(0.29052)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.44689 + (((tickAnim - 25) / 10) * (7.25297-(12.44689)));
            yy = 0.13906 + (((tickAnim - 25) / 10) * (5.08844-(0.13906)));
            zz = -0.99171 + (((tickAnim - 25) / 10) * (3.23487-(-0.99171)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 7.25297 + (((tickAnim - 35) / 8) * (-27.5-(7.25297)));
            yy = 5.08844 + (((tickAnim - 35) / 8) * (5-(5.08844)));
            zz = 3.23487 + (((tickAnim - 35) / 8) * (5-(3.23487)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-20.62239-(-27.5)));
            yy = 5 + (((tickAnim - 43) / 7) * (2.58725-(5)));
            zz = 5 + (((tickAnim - 43) / 7) * (-0.25664-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.2)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.3-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.3 + (((tickAnim - 19) / 6) * (1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.3)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 25) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 0) / 13) * (0-(-17.5)));
            yy = 2.5 + (((tickAnim - 0) / 13) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 0) / 13) * (-2.75-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -2.75 + (((tickAnim - 13) / 12) * (0-(-2.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 25) / 10) * (20-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20 + (((tickAnim - 35) / 8) * (25-(20)));
            yy = 2.5 + (((tickAnim - 35) / 8) * (2.5-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 8) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 43) / 7) * (-17.5-(25)));
            yy = 2.5 + (((tickAnim - 43) / 7) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 43) / 7) * (-2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 19) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27.61912 + (((tickAnim - 0) / 13) * (17.5-(27.61912)));
            yy = -3.14716 + (((tickAnim - 0) / 13) * (-2.5-(-3.14716)));
            zz = -2.41773 + (((tickAnim - 0) / 13) * (0-(-2.41773)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 13) / 12) * (30-(17.5)));
            yy = -2.5 + (((tickAnim - 13) / 12) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 25) / 10) * (-10-(30)));
            yy = 0 + (((tickAnim - 25) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -10 + (((tickAnim - 35) / 8) * (-27.5-(-10)));
            yy = -2.5 + (((tickAnim - 35) / 8) * (-5-(-2.5)));
            zz = 2.5 + (((tickAnim - 35) / 8) * (-5-(2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (27.61912-(-27.5)));
            yy = -5 + (((tickAnim - 43) / 7) * (-3.14716-(-5)));
            zz = -5 + (((tickAnim - 43) / 7) * (-2.41773-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 19) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 13.35138 + (((tickAnim - 0) / 7) * (-1.30253-(13.35138)));
            yy = -3.08263 + (((tickAnim - 0) / 7) * (-1.31824-(-3.08263)));
            zz = 5.43992 + (((tickAnim - 0) / 7) * (4.56382-(5.43992)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.30253 + (((tickAnim - 7) / 6) * (-10.02507-(-1.30253)));
            yy = -1.31824 + (((tickAnim - 7) / 6) * (-0.60945-(-1.31824)));
            zz = 4.56382 + (((tickAnim - 7) / 6) * (4.71083-(4.56382)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10.02507 + (((tickAnim - 13) / 12) * (-17.5-(-10.02507)));
            yy = -0.60945 + (((tickAnim - 13) / 12) * (0-(-0.60945)));
            zz = 4.71083 + (((tickAnim - 13) / 12) * (0-(4.71083)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 25) / 10) * (80-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 80 + (((tickAnim - 35) / 8) * (70-(80)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 70 + (((tickAnim - 43) / 7) * (13.35138-(70)));
            yy = 0 + (((tickAnim - 43) / 7) * (-3.08263-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (5.43992-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 50) * (0.425-(0.425)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*5), rightArm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+70))*5), rightArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*-5), rightArm.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*5), rightArm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-80))*-5)));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.throat.setScale(1,1,1);
        EntityPrehistoricFloraEustreptospondylus ee = (EntityPrehistoricFloraEustreptospondylus) entitylivingbaseIn;

//        if (!ee.isInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
//        }
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            //moving in water
//            //
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
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //Ambient
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //Warn/threat
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animFishing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEustreptospondylus e = (EntityPrehistoricFloraEustreptospondylus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
