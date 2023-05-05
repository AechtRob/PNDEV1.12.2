package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHerrerasaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.entity.Entity;

public class ModelHerrerasaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended upperleg1_1;
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended protofeathers2;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended protofeathers1;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended neck3;
    public AdvancedModelRendererExtended neckfeathers2;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended neckfeathers1;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended gums;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended lowerteeth1;
    public AdvancedModelRendererExtended lowerteeth2;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended teeth2;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended lowerarm1;
    public AdvancedModelRendererExtended shape24;
    public AdvancedModelRendererExtended armfeathers1;
    public AdvancedModelRendererExtended lowerarm2;
    public AdvancedModelRendererExtended armfeathers2;
    public AdvancedModelRendererExtended hand2;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tail4;
    public AdvancedModelRendererExtended lowerleg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended toes1;
    public AdvancedModelRendererExtended lowerleg1_1;
    public AdvancedModelRendererExtended feet1_1;
    public AdvancedModelRendererExtended toes1_1;

    private ModelAnimator animator;

    public ModelHerrerasaurus() {
        this.textureWidth = 140;
        this.textureHeight = 150;
        this.jaw1 = new AdvancedModelRendererExtended(this, 23, 95);
        this.jaw1.setRotationPoint(0.0F, 2.2F, -0.3F);
        this.jaw1.addBox(-2.0F, -0.5F, -4.0F, 4, 2, 5, -0.01F);
        this.armfeathers1 = new AdvancedModelRendererExtended(this, 38, 87);
        this.armfeathers1.setRotationPoint(0.0F, 3.9F, 0.5F);
        this.armfeathers1.addBox(-0.5F, -4.0F, -1.3F, 1, 7, 4, 0.0F);
        this.setRotateAngle(armfeathers1, -0.011344640137963142F, 0.0F, 0.0F);
        this.protofeathers1 = new AdvancedModelRendererExtended(this, 70, 109);
        this.protofeathers1.setRotationPoint(0.5F, -2.7F, -2.6F);
        this.protofeathers1.addBox(-3.0F, -1.8F, -3.0F, 6, 3, 5, 0.0F);
        this.feet1_1 = new AdvancedModelRendererExtended(this, 95, 99);
        this.feet1_1.setRotationPoint(0.0F, 9.4F, 0.3F);
        this.feet1_1.addBox(-1.0F, -0.8F, -2.0F, 2, 9, 4, 0.0F);
        this.setRotateAngle(feet1_1, -0.6373942428283291F, 0.0F, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 3, 114);
        this.head3.setRotationPoint(0.0F, -1.8F, -5.1F);
        this.head3.addBox(-1.0F, -1.3F, -2.9F, 2, 3, 5, 0.0F);
        this.setRotateAngle(head3, -0.091106186954104F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 61, 26);
        this.tail2.setRotationPoint(0.0F, 0.4F, 15.1F);
        this.tail2.addBox(-1.5F, -2.5F, -1.2F, 3, 6, 17, 0.0F);
        this.setRotateAngle(tail2, -0.045553093477052F, 0.0F, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 24, 105);
        this.jaw2.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.jaw2.addBox(-1.5F, -0.1F, -3.3F, 3, 2, 4, -0.01F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 37, 126);
        this.teeth1.setRotationPoint(0.0F, 0.0F, -0.7F);
        this.teeth1.addBox(-1.0F, 0.0F, -2.5F, 2, 1, 4, 0.0F);
        this.shape24 = new AdvancedModelRendererExtended(this, 44, 75);
        this.shape24.setRotationPoint(0.1F, 6.7F, -0.2F);
        this.shape24.addBox(-0.5F, -0.5F, -2.0F, 1, 6, 4, 0.0F);
        this.setRotateAngle(shape24, 0.18203784098300857F, 0.0F, 0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 23, 114);
        this.jaw3.setRotationPoint(0.0F, 0.84F, -4.8F);
        this.jaw3.addBox(-1.0F, -1.0F, -3.3F, 2, 2, 5, -0.01F);
        this.setRotateAngle(jaw3, -0.045553093477052F, 0.0F, 0.0F);
        this.lowerteeth2 = new AdvancedModelRendererExtended(this, 49, 126);
        this.lowerteeth2.setRotationPoint(0.0F, -2.0F, -0.1F);
        this.lowerteeth2.addBox(-0.5F, 0.0F, -3.1F, 1, 1, 5, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 84, 37);
        this.tail3.setRotationPoint(0.0F, 0.0F, 15.1F);
        this.tail3.addBox(-1.0F, -2.0F, -1.0F, 2, 4, 17, 0.0F);
        this.setRotateAngle(tail3, -0.045553093477052F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 1, 32);
        this.neck1.setRotationPoint(0.0F, -0.2F, -4.8F);
        this.neck1.addBox(-2.0F, -2.0F, -6.6F, 5, 6, 8, 0.0F);
        this.setRotateAngle(neck1, -0.27314402793711257F, 0.0F, 0.0F);
        this.teeth2 = new AdvancedModelRendererExtended(this, 49, 126);
        this.teeth2.setRotationPoint(0.0F, 2.2F, 0.5F);
        this.teeth2.addBox(-0.5F, -0.5F, -3.1F, 1, 1, 5, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 28, 46);
        this.upperarm2.setRotationPoint(-2.2F, 6.2F, -4.7F);
        this.upperarm2.addBox(-1.5F, -0.6F, -1.1F, 3, 8, 4, 0.0F);
        this.setRotateAngle(upperarm2, 0.5918411493512771F, 0.0F, 0.0F);
        this.neckfeathers2 = new AdvancedModelRendererExtended(this, 2, 89);
        this.neckfeathers2.setRotationPoint(0.6F, -1.7F, -2.6F);
        this.neckfeathers2.addBox(-1.5F, -1.7F, -1.8F, 3, 2, 4, 0.0F);
        this.setRotateAngle(neckfeathers2, -0.18203784098300857F, 0.0F, 0.0F);
        this.tail4 = new AdvancedModelRendererExtended(this, 106, 33);
        this.tail4.setRotationPoint(0.0F, -0.1F, 15.5F);
        this.tail4.addBox(-0.5F, -1.5F, -0.8F, 1, 3, 16, 0.0F);
        this.toes1 = new AdvancedModelRendererExtended(this, 90, 117);
        this.toes1.setRotationPoint(0.0F, 8.1F, 0.2F);
        this.toes1.addBox(-1.5F, -1.3F, -6.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(toes1, 0.045553093477052F, 0.0F, 0.0F);
        this.toes1_1 = new AdvancedModelRendererExtended(this, 90, 117);
        this.toes1_1.setRotationPoint(0.0F, 8.1F, 0.2F);
        this.toes1_1.addBox(-1.5F, -1.3F, -6.0F, 3, 3, 8, 0.0F);
        this.setRotateAngle(toes1_1, 0.045553093477052F, 0.0F, 0.0F);
        this.neck3 = new AdvancedModelRendererExtended(this, 3, 66);
        this.neck3.setRotationPoint(0.5F, 0.3F, -4.6F);
        this.neck3.addBox(-1.5F, -3.2F, -3.5F, 3, 6, 3, 0.0F);
        this.setRotateAngle(neck3, 0.5009094953223726F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 87, 7);
        this.tail1.setRotationPoint(0.5F, 0.2F, 5.9F);
        this.tail1.addBox(-2.0F, -2.5F, -1.3F, 4, 8, 16, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.lowerarm2 = new AdvancedModelRendererExtended(this, 30, 60);
        this.lowerarm2.setRotationPoint(-0.2F, 6.4F, 0.9F);
        this.lowerarm2.addBox(-1.0F, -0.8F, -1.8F, 2, 8, 4, 0.0F);
        this.setRotateAngle(lowerarm2, -0.8651597102135892F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 3, 95);
        this.head1.setRotationPoint(-0.02F, -0.8F, -3.3F);
        this.head1.addBox(-2.0F, -2.2F, -4.2F, 4, 4, 5, 0.0F);
        this.setRotateAngle(head1, 0.36425021489121656F, 0.0F, 0.0F);
        this.neckfeathers1 = new AdvancedModelRendererExtended(this, 2, 78);
        this.neckfeathers1.setRotationPoint(0.0F, -2.8F, -1.5F);
        this.neckfeathers1.addBox(-1.0F, -1.5F, -2.2F, 2, 3, 5, 0.0F);
        this.setRotateAngle(neckfeathers1, -0.136659280431156F, -0.024958208303518914F, 0.0F);
        this.gums = new AdvancedModelRendererExtended(this, 23, 126);
        this.gums.setRotationPoint(0.0F, -1.4F, -2.5F);
        this.gums.addBox(-1.5F, -2.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(gums, -0.4553564018453205F, 0.0F, 0.0F);
        this.upperleg1_1 = new AdvancedModelRendererExtended(this, 76, 60);
        this.upperleg1_1.setRotationPoint(-3.4F, 2.9F, 0.0F);
        this.upperleg1_1.addBox(-2.0F, -1.4F, -4.4F, 4, 12, 8, 0.0F);
        this.setRotateAngle(upperleg1_1, -0.40980330836826856F, 0.0F, 0.0F);
        this.lowerleg1 = new AdvancedModelRendererExtended(this, 103, 81);
        this.lowerleg1.setRotationPoint(0.2F, 9.3F, -1.9F);
        this.lowerleg1.addBox(-1.5F, -0.9F, -2.2F, 3, 11, 5, 0.0F);
        this.setRotateAngle(lowerleg1, 1.0471975511965976F, 0.0F, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 95, 99);
        this.feet1.setRotationPoint(0.0F, 9.4F, 0.3F);
        this.feet1.addBox(-1.0F, -0.8F, -2.0F, 2, 9, 4, 0.0F);
        this.setRotateAngle(feet1, -0.6373942428283291F, 0.0F, 0.0F);
        this.neck2 = new AdvancedModelRendererExtended(this, 4, 51);
        this.neck2.setRotationPoint(0.0F, 0.3F, -5.3F);
        this.neck2.addBox(-1.5F, -2.3F, -6.4F, 4, 6, 7, 0.0F);
        this.setRotateAngle(neck2, -0.5462880558742251F, 0.0F, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 103, 60);
        this.upperleg1.setRotationPoint(4.4F, 2.9F, 0.0F);
        this.upperleg1.addBox(-2.0F, -1.4F, -4.4F, 4, 12, 8, 0.0F);
        this.setRotateAngle(upperleg1, -0.40980330836826856F, 0.0F, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 3, 105);
        this.head2.setRotationPoint(0.0F, 1.8F, -4.6F);
        this.head2.addBox(-1.5F, -3.9F, -3.2F, 3, 4, 4, 0.0F);
        this.setRotateAngle(head2, 0.058468529941810045F, 0.0F, 0.0F);
        this.lowerteeth1 = new AdvancedModelRendererExtended(this, 37, 126);
        this.lowerteeth1.setRotationPoint(0.0F, -0.6F, 0.2F);
        this.lowerteeth1.addBox(-1.0F, -0.5F, -3.4F, 2, 1, 4, 0.0F);
        this.lowerarm1 = new AdvancedModelRendererExtended(this, 30, 60);
        this.lowerarm1.setRotationPoint(0.2F, 6.4F, 0.9F);
        this.lowerarm1.addBox(-1.0F, -0.8F, -1.8F, 2, 8, 4, 0.0F);
        this.setRotateAngle(lowerarm1, -0.8651597102135892F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 32, 75);
        this.hand2.setRotationPoint(0.1F, 6.7F, -0.2F);
        this.hand2.addBox(-0.5F, -0.5F, -2.0F, 1, 6, 4, 0.0F);
        this.setRotateAngle(hand2, 0.18203784098300857F, 0.0F, 0.0F);
        this.lowerleg1_1 = new AdvancedModelRendererExtended(this, 83, 81);
        this.lowerleg1_1.setRotationPoint(-0.2F, 9.3F, -1.9F);
        this.lowerleg1_1.addBox(-1.5F, -0.9F, -2.2F, 3, 11, 5, 0.0F);
        this.setRotateAngle(lowerleg1_1, 1.0471975511965976F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 0, 0);
        this.chest.setRotationPoint(-0.1F, 0.4F, -18.4F);
        this.chest.addBox(-3.0F, -2.7F, -6.0F, 7, 11, 6, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 46, 46);
        this.upperarm1.setRotationPoint(3.2F, 6.1F, -4.7F);
        this.upperarm1.addBox(-1.5F, -0.6F, -1.1F, 3, 8, 4, 0.0F);
        this.setRotateAngle(upperarm1, 0.5918411493512771F, 0.0F, 0.0F);
        this.protofeathers2 = new AdvancedModelRendererExtended(this, 55, 94);
        this.protofeathers2.setRotationPoint(0.5F, -2.8F, -14.5F);
        this.protofeathers2.addBox(-3.5F, -1.1F, -4.5F, 7, 2, 11, 0.0F);
        this.armfeathers2 = new AdvancedModelRendererExtended(this, 38, 87);
        this.armfeathers2.setRotationPoint(0.0F, 3.9F, 0.5F);
        this.armfeathers2.addBox(-0.5F, -4.0F, -1.3F, 1, 7, 4, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 19, 5);
        this.body.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.body.addBox(-3.5F, -2.6F, -19.0F, 8, 14, 19, 0.0F);
        this.setRotateAngle(body, 0.04904375198104066F, 0.0F, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 3, 123);
        this.head4.setRotationPoint(0.0F, -1.0F, 1.7F);
        this.head4.addBox(-0.5F, -1.3F, -4.5F, 1, 2, 5, 0.0F);
        this.setRotateAngle(head4, 0.06998770300497262F, 0.0F, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 55, 0);
        this.basin.setRotationPoint(0.2F, -3.2F, 2.5F);
        this.basin.addBox(-2.5F, -2.7F, -4.2F, 6, 11, 10, 0.0F);
        this.setRotateAngle(basin, -0.045553093477052F, 0.0F, 0.0F);
        this.head1.addChild(this.jaw1);
        this.lowerarm1.addChild(this.armfeathers1);
        this.chest.addChild(this.protofeathers1);
        this.lowerleg1_1.addChild(this.feet1_1);
        this.head2.addChild(this.head3);
        this.tail1.addChild(this.tail2);
        this.jaw1.addChild(this.jaw2);
        this.head2.addChild(this.teeth1);
        this.lowerarm1.addChild(this.shape24);
        this.jaw2.addChild(this.jaw3);
        this.jaw3.addChild(this.lowerteeth2);
        this.tail2.addChild(this.tail3);
        this.chest.addChild(this.neck1);
        this.head3.addChild(this.teeth2);
        this.chest.addChild(this.upperarm2);
        this.neck2.addChild(this.neckfeathers2);
        this.tail3.addChild(this.tail4);
        this.feet1.addChild(this.toes1);
        this.feet1_1.addChild(this.toes1_1);
        this.neck2.addChild(this.neck3);
        this.basin.addChild(this.tail1);
        this.upperarm2.addChild(this.lowerarm2);
        this.neck3.addChild(this.head1);
        this.neck3.addChild(this.neckfeathers1);
        this.jaw1.addChild(this.gums);
        this.basin.addChild(this.upperleg1_1);
        this.upperleg1.addChild(this.lowerleg1);
        this.lowerleg1.addChild(this.feet1);
        this.neck1.addChild(this.neck2);
        this.basin.addChild(this.upperleg1);
        this.head1.addChild(this.head2);
        this.jaw2.addChild(this.lowerteeth1);
        this.upperarm1.addChild(this.lowerarm1);
        this.lowerarm2.addChild(this.hand2);
        this.upperleg1_1.addChild(this.lowerleg1_1);
        this.body.addChild(this.chest);
        this.chest.addChild(this.upperarm1);
        this.body.addChild(this.protofeathers2);
        this.lowerarm2.addChild(this.armfeathers2);
        this.basin.addChild(this.body);
        this.head3.addChild(this.head4);
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.basin.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.jaw1.rotateAngleX = (float) Math.toRadians(45);
        this.neck1.rotateAngleX = (float) Math.toRadians(20);
        this.head1.rotateAngleX = (float) Math.toRadians(-7);
        this.neck2.rotateAngleX = (float) Math.toRadians(-40);
        this.neck3.rotateAngleX = (float) Math.toRadians(60);
        this.upperarm1.rotateAngleZ = (float) Math.toRadians(-50);
        this.upperarm1.rotateAngleX = (float) Math.toRadians(20);
        this.lowerarm1.rotateAngleX = (float) Math.toRadians(-70);
        this.upperarm2.rotateAngleZ = (float) Math.toRadians(50);
        this.upperarm2.rotateAngleX = (float) Math.toRadians(20);
        this.lowerarm2.rotateAngleX = (float) Math.toRadians(-70);
        this.chest.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.basin.offsetY = 0.30F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraHerrerasaurus Herrerasaurus = (EntityPrehistoricFloraHerrerasaurus) e;
        float masterSpeed = Herrerasaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, head1);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head1};
        Herrerasaurus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.upperarm1, this.lowerarm1};
        AdvancedModelRenderer[] ArmR = {this.upperarm2, this.lowerarm2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Herrerasaurus.getAnimation() == Herrerasaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Herrerasaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Herrerasaurus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Herrerasaurus.getIsFast()) { //Running
                float speed = masterSpeed / 2F;
                //this.basin.offsetY = 0.75F;
                this.upperleg1_1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);


                //---
                this.walk(upperleg1_1, speed, 0.32F, true, 8.0F, 0.25F, f2, 1.0F);
                this.walk(upperleg1, speed, 0.32F, true, 5.0F, 0.25F, f2, 1.0F);

                this.walk(lowerleg1_1, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(lowerleg1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(feet1_1, speed, -0.16F, false, 4.0F, 0.04F, f2, 1F);
                this.walk(feet1, speed, -0.16F, false, 1.0F, 0.04F, f2, 1F);

                this.walk(toes1_1, speed, -0.6F, true, 4.5F, -0.535F, f2, 1F);
                this.walk(toes1, speed, -0.6F, true, 1.5F, -0.535F, f2, 1F);

                this.bobExtended(basin, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(lowerleg1_1, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(lowerleg1, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(upperleg1_1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(neck1, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(neck2, speed * 4, -0.04F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(neck3, speed * 4, 0.04F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(head1, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 1.50F;
                //this.basin.offsetY = 0.815F;
                this.upperleg1_1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);

                this.walk(upperleg1_1, speed, 0.32F, true, 8.0F, 0.25F, f2, 1.0F);
                this.walk(upperleg1, speed, 0.32F, true, 5.0F, 0.25F, f2, 1.0F);

                this.walk(lowerleg1_1, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(lowerleg1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(feet1_1, speed, -0.16F, false, 4.0F, 0.04F, f2, 1F);
                this.walk(feet1, speed, -0.16F, false, 1.0F, 0.04F, f2, 1F);

                this.walk(toes1_1, speed, -0.6F, true, 4.5F, -0.535F, f2, 0.8F);
                this.walk(toes1, speed, -0.6F, true, 1.5F, -0.535F, f2, 0.8F);

                this.bobExtended(basin, speed * 2F, 0.83F, false, 3.5F, f2, 1F);

                this.bobExtended(lowerleg1_1, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(lowerleg1, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(upperleg1_1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck1, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck3, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(head1, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHerrerasaurus e = (EntityPrehistoricFloraHerrerasaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1_1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1_1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1_1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1_1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1_1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(neck1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head1, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head1, (float) Math.toRadians(-38), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
