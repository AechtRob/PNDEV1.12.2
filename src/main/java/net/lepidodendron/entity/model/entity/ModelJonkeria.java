package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraJonkeria;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelJonkeria extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended body1;
    public AdvancedModelRendererExtended chest1;
    public AdvancedModelRendererExtended body2;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended neck3;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended upperteeth1;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended fang1;
    public AdvancedModelRendererExtended fang2;
    public AdvancedModelRendererExtended upperteeth2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended jaw4;
    public AdvancedModelRendererExtended lowerteeth1;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended gums2;
    public AdvancedModelRendererExtended lowerfang1;
    public AdvancedModelRendererExtended lowerfang2;
    public AdvancedModelRendererExtended lowerteeth2;
    public AdvancedModelRendererExtended arm1;
    public AdvancedModelRendererExtended hand1;
    public AdvancedModelRendererExtended arm2;
    public AdvancedModelRendererExtended hand2;
    public AdvancedModelRendererExtended basin1;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;

    private ModelAnimator animator;

    public ModelJonkeria() {
        this.textureWidth = 210;
        this.textureHeight = 110;
        this.gums2 = new AdvancedModelRendererExtended(this, 67, 10);
        this.gums2.setRotationPoint(0.0F, 0.0F, 0.3F);
        this.gums2.addBox(-2.5F, -5.0F, -4.5F, 5, 5, 5, 0.0F);
        this.setRotateAngle(gums2, -0.4553564018453205F, 0.0F, 0.0F);
        this.neck2 = new AdvancedModelRendererExtended(this, 142, 28);
        this.neck2.setRotationPoint(0.0F, 0.5F, -5.4F);
        this.neck2.addBox(-4.0F, -2.0F, -7.0F, 8, 12, 7, 0.0F);
        this.setRotateAngle(neck2, -0.091106186954104F, 0.0F, 0.0F);
        this.lowerteeth2 = new AdvancedModelRendererExtended(this, 0, 0);
        this.lowerteeth2.setRotationPoint(0.0F, -0.3F, -4.3F);
        this.lowerteeth2.addBox(-2.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(lowerteeth2, 0.091106186954104F, 0.0F, 0.0F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 168, 48);
        this.upperleg2.setRotationPoint(5.8F, 10.5F, 2.9F);
        this.upperleg2.addBox(-3.0F, 0.0F, -3.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(upperleg2, 0.045553093477052F, 0.0F, -0.40980330836826856F);
        this.head2 = new AdvancedModelRendererExtended(this, 63, 45);
        this.head2.setRotationPoint(0.0F, -0.1F, -5.2F);
        this.head2.addBox(-3.0F, -2.0F, -8.0F, 6, 5, 9, 0.0F);
        this.setRotateAngle(head2, 0.22759093446006054F, 0.0F, 0.0F);
        this.basin1 = new AdvancedModelRendererExtended(this, 1, 77);
        this.basin1.setRotationPoint(0.0F, 0.0F, 10.9F);
        this.basin1.addBox(-6.5F, -2.0F, 0.0F, 13, 14, 8, 0.0F);
        this.setRotateAngle(basin1, -0.22759093446006054F, 0.0F, 0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 120, 55);
        this.jaw3.setRotationPoint(0.0F, -1.0F, -6.3F);
        this.jaw3.addBox(-2.5F, -1.0F, -6.0F, 5, 3, 6, 0.0F);
        this.setRotateAngle(jaw3, -0.136659280431156F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 168, 65);
        this.leg2.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.leg2.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.setRotateAngle(leg2, 0.31869712141416456F, 0.0F, 0.40980330836826856F);
        this.head1 = new AdvancedModelRendererExtended(this, 85, 40);
        this.head1.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.head1.addBox(-4.5F, -3.0F, -5.0F, 9, 6, 5, 0.0F);
        this.setRotateAngle(head1, 0.18203784098300857F, 0.0F, 0.0F);
        this.chest1 = new AdvancedModelRendererExtended(this, 89, 3);
        this.chest1.setRotationPoint(0.0F, 0.5F, -9.7F);
        this.chest1.addBox(-9.0F, -3.0F, -11.0F, 18, 19, 11, 0.0F);
        this.setRotateAngle(chest1, 0.045553093477052F, 0.0F, 0.0F);
        this.fang1 = new AdvancedModelRendererExtended(this, 13, 0);
        this.fang1.setRotationPoint(-1.7F, 1.4F, -1.4F);
        this.fang1.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(fang1, 0.091106186954104F, 0.0F, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 58, 61);
        this.jaw2.setRotationPoint(0.0F, 1.9F, -3.4F);
        this.jaw2.addBox(-3.0F, -2.0F, -7.0F, 6, 3, 7, 0.0F);
        this.setRotateAngle(jaw2, 0.22759093446006054F, 0.0F, 0.0F);
        this.jaw4 = new AdvancedModelRendererExtended(this, 103, 57);
        this.jaw4.setRotationPoint(0.0F, 1.7F, -0.9F);
        this.jaw4.addBox(-1.5F, -1.0F, -8.0F, 3, 2, 9, 0.0F);
        this.setRotateAngle(jaw4, -0.24155356847601517F, 0.0F, 0.0F);
        this.body2 = new AdvancedModelRendererExtended(this, 1, 45);
        this.body2.setRotationPoint(0.0F, 0.6F, 9.3F);
        this.body2.addBox(-8.0F, -3.0F, 0.0F, 16, 19, 12, 0.0F);
        this.setRotateAngle(body2, -0.091106186954104F, 0.0F, 0.0F);
        this.neck3 = new AdvancedModelRendererExtended(this, 115, 34);
        this.neck3.setRotationPoint(0.0F, -0.1F, -5.3F);
        this.neck3.addBox(-3.5F, -2.0F, -6.0F, 7, 11, 6, 0.0F);
        this.setRotateAngle(neck3, 0.18203784098300857F, 0.0F, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 143, 48);
        this.upperleg1.setRotationPoint(-5.8F, 10.5F, 2.9F);
        this.upperleg1.addBox(-3.0F, 0.0F, -3.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(upperleg1, 0.045553093477052F, 0.0F, 0.40980330836826856F);
        this.upperteeth2 = new AdvancedModelRendererExtended(this, 0, 0);
        this.upperteeth2.setRotationPoint(0.0F, 1.3F, -3.2F);
        this.upperteeth2.addBox(-2.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F);
        this.setRotateAngle(upperteeth2, -0.045553093477052F, 0.0F, 0.0F);
        this.lowerfang1 = new AdvancedModelRendererExtended(this, 13, 0);
        this.lowerfang1.setRotationPoint(-1.7F, -0.8F, -2.6F);
        this.lowerfang1.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lowerfang1, -0.045553093477052F, 0.0F, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 78, 62);
        this.head4.setRotationPoint(0.0F, -2.55F, -0.8F);
        this.head4.addBox(-2.0F, -0.5F, -4.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(head4, 0.2574360646691636F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 36, 93);
        this.hand2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.hand2.addBox(-3.5F, -2.0F, -7.0F, 7, 4, 9, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 91, 55);
        this.head3.setRotationPoint(0.0F, 1.1F, -7.6F);
        this.head3.addBox(-2.5F, -2.0F, -5.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(head3, -0.16632987771505958F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 148, 3);
        this.neck1.setRotationPoint(0.0F, -0.4F, -7.8F);
        this.neck1.addBox(-5.0F, -2.0F, -8.0F, 10, 16, 8, 0.0F);
        this.setRotateAngle(neck1, -0.136659280431156F, 0.0F, 0.0F);
        this.lowerfang2 = new AdvancedModelRendererExtended(this, 13, 0);
        this.lowerfang2.setRotationPoint(1.7F, -0.8F, -2.8F);
        this.lowerfang2.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lowerfang2, -0.045553093477052F, 0.0F, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 84, 70);
        this.upperarm1.setRotationPoint(-7.0F, 12.0F, -6.6F);
        this.upperarm1.addBox(-3.5F, 0.0F, -3.5F, 7, 10, 7, 0.0F);
        this.setRotateAngle(upperarm1, 0.31869712141416456F, 0.0F, 0.40980330836826856F);
        this.arm1 = new AdvancedModelRendererExtended(this, 84, 88);
        this.arm1.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.arm1.addBox(-3.0F, 0.0F, -3.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(arm1, -0.31869712141416456F, 0.0F, -0.40980330836826856F);
        this.gums1 = new AdvancedModelRendererExtended(this, 68, 0);
        this.gums1.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.gums1.addBox(-4.0F, -6.0F, -2.0F, 8, 6, 2, 0.0F);
        this.setRotateAngle(gums1, -0.5009094953223726F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 58, 72);
        this.tail1.setRotationPoint(0.0F, -0.2F, 7.1F);
        this.tail1.addBox(-3.0F, -1.0F, 0.0F, 6, 7, 6, 0.0F);
        this.setRotateAngle(tail1, -0.4553564018453205F, 0.0F, 0.0F);
        this.body1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.body1.setRotationPoint(0.0F, -5.9F, 2.5F);
        this.body1.addBox(-11.0F, -3.0F, -11.0F, 22, 21, 22, 0.0F);
        this.setRotateAngle(body1, -0.045553093477052F, 0.0F, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 136, 80);
        this.feet1.setRotationPoint(0.0F, 8.1F, 0.0F);
        this.feet1.addBox(-3.0F, -2.0F, -7.0F, 6, 4, 9, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 44, 82);
        this.tail2.setRotationPoint(0.0F, 1.5F, 5.2F);
        this.tail2.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 5, 0.0F);
        this.setRotateAngle(tail2, -0.40980330836826856F, 0.0F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 36, 93);
        this.hand1.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.hand1.addBox(-3.5F, -2.0F, -7.0F, 7, 4, 9, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 114, 88);
        this.arm2.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.arm2.addBox(-3.0F, 0.0F, -3.0F, 6, 10, 6, 0.0F);
        this.setRotateAngle(arm2, -0.31869712141416456F, 0.0F, 0.40980330836826856F);
        this.leg1 = new AdvancedModelRendererExtended(this, 143, 65);
        this.leg1.setRotationPoint(0.0F, 8.2F, 0.0F);
        this.leg1.addBox(-2.5F, 0.0F, -2.5F, 5, 9, 5, 0.0F);
        this.setRotateAngle(leg1, 0.31869712141416456F, 0.0F, -0.40980330836826856F);
        this.feet2 = new AdvancedModelRendererExtended(this, 178, 80);
        this.feet2.setRotationPoint(0.0F, 8.1F, 0.0F);
        this.feet2.addBox(-3.0F, -2.0F, -7.0F, 6, 4, 9, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 114, 70);
        this.upperarm2.setRotationPoint(7.0F, 12.0F, -6.6F);
        this.upperarm2.addBox(-3.5F, 0.0F, -3.5F, 7, 10, 7, 0.0F);
        this.setRotateAngle(upperarm2, 0.31869712141416456F, 0.0F, -0.40980330836826856F);
        this.upperteeth1 = new AdvancedModelRendererExtended(this, 0, 5);
        this.upperteeth1.setRotationPoint(0.0F, 1.5F, -4.6F);
        this.upperteeth1.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(upperteeth1, 0.136659280431156F, 0.0F, 0.0F);
        this.fang2 = new AdvancedModelRendererExtended(this, 13, 0);
        this.fang2.setRotationPoint(1.7F, 1.4F, -1.4F);
        this.fang2.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(fang2, 0.091106186954104F, 0.0F, 0.0F);
        this.lowerteeth1 = new AdvancedModelRendererExtended(this, 0, 5);
        this.lowerteeth1.setRotationPoint(0.0F, -2.2F, -3.9F);
        this.lowerteeth1.addBox(-2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(lowerteeth1, -0.40980330836826856F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 45, 44);
        this.jaw1.setRotationPoint(0.0F, 2.9F, -0.9F);
        this.jaw1.addBox(-4.5F, 0.0F, -4.0F, 9, 5, 4, 0.0F);
        this.jaw2.addChild(this.gums2);
        this.neck1.addChild(this.neck2);
        this.jaw3.addChild(this.lowerteeth2);
        this.basin1.addChild(this.upperleg2);
        this.head1.addChild(this.head2);
        this.body2.addChild(this.basin1);
        this.jaw2.addChild(this.jaw3);
        this.upperleg2.addChild(this.leg2);
        this.neck3.addChild(this.head1);
        this.body1.addChild(this.chest1);
        this.head3.addChild(this.fang1);
        this.jaw1.addChild(this.jaw2);
        this.jaw2.addChild(this.jaw4);
        this.body1.addChild(this.body2);
        this.neck2.addChild(this.neck3);
        this.basin1.addChild(this.upperleg1);
        this.head3.addChild(this.upperteeth2);
        this.jaw3.addChild(this.lowerfang1);
        this.head3.addChild(this.head4);
        this.arm2.addChild(this.hand2);
        this.head2.addChild(this.head3);
        this.chest1.addChild(this.neck1);
        this.jaw3.addChild(this.lowerfang2);
        this.chest1.addChild(this.upperarm1);
        this.upperarm1.addChild(this.arm1);
        this.jaw2.addChild(this.gums1);
        this.basin1.addChild(this.tail1);
        this.leg1.addChild(this.feet1);
        this.tail1.addChild(this.tail2);
        this.arm1.addChild(this.hand1);
        this.upperarm2.addChild(this.arm2);
        this.upperleg1.addChild(this.leg1);
        this.leg2.addChild(this.feet2);
        this.chest1.addChild(this.upperarm2);
        this.head2.addChild(this.upperteeth1);
        this.head3.addChild(this.fang2);
        this.jaw2.addChild(this.lowerteeth1);
        this.head1.addChild(this.jaw1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body1.render(f5 * 0.9f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.jaw1.rotateAngleX = (float) Math.toRadians(33);
        this.neck2.rotateAngleX = (float) Math.toRadians(-13);
        this.neck3.rotateAngleX = (float) Math.toRadians(-2);
        this.neck1.render(0.01F);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body1.offsetY = 0.14F;

        EntityPrehistoricFloraJonkeria Jonkeria = (EntityPrehistoricFloraJonkeria) e;
        float masterSpeed = Jonkeria.getTravelSpeed();

        this.faceTarget(f3, f4, 15, neck1);
        this.faceTarget(f3, f4, 15, neck2);
        this.faceTarget(f3, f4, 15, neck3);
        this.faceTarget(f3, f4, 20, head1);

        AdvancedModelRendererExtended[] Tail = {this.tail1, this.tail2};

        //if (Jonkeria.getAnimation() == Jonkeria.LAY_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainFlap(Tail, (0.06F*0.9F) * 3, 0.10F, 0.10F, f2, 1F);
            //this.chainSwing(Tail, (0.06F*0.9F) * 2F * 3, 0.05F, 0.06F, f2, 1F);
            //return;
        //}

        if (f3 == 0.0F || !Jonkeria.getIsMoving()) { //Not moving
            this.swing(neck1, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck1, 0.06F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.6F), 0.20F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
            this.walk(tail1, (0.06F*0.6F) * 1.5F, -0.10F, false, 0F, 0.1F, f2, 1F);
            return;
        }

        float speed = masterSpeed / 4.595F;
        if (Jonkeria.getIsFast()) {
            speed = speed * 1.5F;
        }

        //this.root.offsetY = -0.50F;
        this.upperarm2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(2.1), false, 1, f2, 1.5F);;
        this.upperarm1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(2.1), false, 4, f2, 1.5F);;
        this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.6), false, 4, f2, 1.5F);;
        this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.6), false, 1, f2, 1.5F);;

        this.walk(upperarm2, speed, 0.50F, true, 5, 0.30F, f2, 1F);
        this.walk(upperarm1, speed, 0.50F, true, 8, 0.30F, f2, 1F);
        this.walk(upperleg2, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(upperleg1, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(arm2, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(arm1, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leg2, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(leg1, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.walk(hand2, speed, 0.40F, true, 2, -0.25F, f2, 1F);
        this.walk(hand1, speed, 0.40F, true, 5, -0.25F, f2, 1F);
        this.walk(feet2, speed, 0.3F, true, 5, 0.05F, f2, 1F);
        this.walk(feet1, speed, 0.3F, true, 2, 0.05F, f2, 1F);

        this.bobExtended(body1, speed * 2F, 0.245F, false, 2.5F,  f2, 1F);

        this.flap(body2, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(chest1, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

        this.flap(upperleg1, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperleg2, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(upperarm1, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
        this.flap(upperarm2, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(chest1, speed * 2, 0.07F, false, 2.5F,-0.02F, f2, 0.8F);

        this.swing(neck1, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck1, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);
        this.walk(tail1, (speed*0.6F) * 1.5F, -0.10F, false, 0F, 0.1F, f2, 1F);

        this.body1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(5.0), false, 3.25F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraJonkeria e = (EntityPrehistoricFloraJonkeria) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(7);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(6);
        animator.resetKeyframe(6);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);
    }
}
