package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAustriadactylus extends ModelBasePalaeopedia {
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended wing1R;
    public AdvancedModelRendererExtended wing1L;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperlegR;
    public AdvancedModelRendererExtended upperlegL;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tail4;
    public AdvancedModelRendererExtended tail5;
    public AdvancedModelRendererExtended lowerlegR;
    public AdvancedModelRendererExtended legwing11;
    public AdvancedModelRendererExtended footR;
    public AdvancedModelRendererExtended legwing12;
    public AdvancedModelRendererExtended lowerlegL;
    public AdvancedModelRendererExtended legwing11_1;
    public AdvancedModelRendererExtended footL;
    public AdvancedModelRendererExtended legwing12_1;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended underneck1;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended jaw;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended underhead1;
    public AdvancedModelRendererExtended lowerteeth2;
    public AdvancedModelRendererExtended lowerteeth1;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended crest1;
    public AdvancedModelRendererExtended teeth2;
    public AdvancedModelRendererExtended head5;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended crest2;
    public AdvancedModelRendererExtended wing2R;
    public AdvancedModelRendererExtended wing3R;
    public AdvancedModelRendererExtended wing4R;
    public AdvancedModelRendererExtended handR;
    public AdvancedModelRendererExtended wing2L;
    public AdvancedModelRendererExtended wing3L;
    public AdvancedModelRendererExtended wing4L;
    public AdvancedModelRendererExtended handL;

    private ModelAnimator animator;

    private float scaler;

    public ModelAustriadactylus() {
        this.textureWidth = 100;
        this.textureHeight = 128;
        this.tail5 = new AdvancedModelRendererExtended(this, 49, 15);
        this.tail5.setRotationPoint(0.0F, 0.0F, 8.9F);
        this.tail5.addBox(0.0F, -2.5F, 0.0F, 0, 5, 6, 0.0F);
        this.footL = new AdvancedModelRendererExtended(this, 0, 17);
        this.footL.setRotationPoint(0.0F, 8.7F, 0.0F);
        this.footL.addBox(-1.0F, -0.5F, -6.0F, 2, 1, 7, 0.0F);
        this.setRotateAngle(footL, -0.4553564018453205F, 0.0F, 0.091106186954104F);
        this.wing2R = new AdvancedModelRendererExtended(this, 33, 72);
        this.wing2R.setRotationPoint(-8.8F, 0.0F, 0.3F);
        this.wing2R.addBox(-0.5F, 0.0F, 0.0F, 1, 11, 12, 0.0F);
        this.setRotateAngle(wing2R, 0.0F, 0.0F, 0.6373942428283291F);
        this.handR = new AdvancedModelRendererExtended(this, 29, 79);
        this.handR.setRotationPoint(-0.1F, 0.2F, 0.0F);
        this.handR.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handR, 0.18203784098300857F, -0.18203784098300857F, -0.045553093477052F);
        this.head = new AdvancedModelRendererExtended(this, 21, 35);
        this.head.setRotationPoint(0.0F, -0.8F, -5.3F);
        this.head.addBox(-2.0F, -1.5F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head, 0.9560913642424937F, 0.0F, 0.0F);
        this.underhead1 = new AdvancedModelRendererExtended(this, 63, 42);
        this.underhead1.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.underhead1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(underhead1, -0.136659280431156F, 0.0F, 0.0F);
        this.legwing11_1 = new AdvancedModelRendererExtended(this, 84, 47);
        this.legwing11_1.setRotationPoint(-0.1F, 0.0F, 1.0F);
        this.legwing11_1.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 2, 0.0F);
        this.tail4 = new AdvancedModelRendererExtended(this, 22, 15);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail4, 0.045553093477052F, 0.0F, 0.0F);
        this.wing1L = new AdvancedModelRendererExtended(this, 0, 60);
        this.wing1L.setRotationPoint(1.4F, -1.6F, -2.3F);
        this.wing1L.addBox(0.0F, -1.0F, 0.0F, 9, 2, 13, 0.0F);
        this.setRotateAngle(wing1L, -0.045553093477052F, 0.0F, 0.5462880558742251F);
        this.tail1 = new AdvancedModelRendererExtended(this, 34, 21);
        this.tail1.setRotationPoint(0.0F, -0.5F, 5.8F);
        this.tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
        this.setRotateAngle(tail1, 0.045553093477052F, 0.0F, 0.0F);
        this.legwing12 = new AdvancedModelRendererExtended(this, 91, 50);
        this.legwing12.setRotationPoint(0.0F, 0.8F, 1.2F);
        this.legwing12.addBox(0.0F, 0.0F, 0.0F, 0, 8, 2, 0.0F);
        this.setRotateAngle(legwing12, -0.136659280431156F, 0.31869712141416456F, 0.0F);
        this.gums1 = new AdvancedModelRendererExtended(this, 59, 44);
        this.gums1.setRotationPoint(0.0F, 0.6F, -1.7F);
        this.gums1.addBox(-1.5F, -3.1F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(gums1, -0.36425021489121656F, 0.0F, 0.0F);
        this.underneck1 = new AdvancedModelRendererExtended(this, 67, 28);
        this.underneck1.setRotationPoint(0.0F, 0.7F, -1.3F);
        this.underneck1.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(underneck1, 0.18203784098300857F, 0.0F, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 49, 40);
        this.head3.setRotationPoint(0.0F, 0.9F, -4.6F);
        this.head3.addBox(-1.0F, -0.4F, -3.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(head3, -0.045553093477052F, 0.0F, 0.0F);
        this.crest1 = new AdvancedModelRendererExtended(this, 35, 53);
        this.crest1.setRotationPoint(0.0F, 0.2F, -2.1F);
        this.crest1.addBox(-0.5F, -2.0F, -2.0F, 1, 2, 4, 0.0F);
        this.setRotateAngle(crest1, -0.18203784098300857F, 0.0F, 0.0F);
        this.teeth2 = new AdvancedModelRendererExtended(this, 0, 0);
        this.teeth2.setRotationPoint(0.0F, 1.6F, -2.8F);
        this.teeth2.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(teeth2, 0.091106186954104F, 0.0F, 0.0F);
        this.jaw = new AdvancedModelRendererExtended(this, 20, 46);
        this.jaw.setRotationPoint(0.0F, 1.5F, -0.9F);
        this.jaw.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 4, 28);
        this.tail2.setRotationPoint(0.0F, -0.2F, 8.0F);
        this.tail2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail2, 0.091106186954104F, 0.0F, 0.0F);
        this.wing3R = new AdvancedModelRendererExtended(this, 49, 86);
        this.wing3R.setRotationPoint(-0.1F, 11.0F, 0.3F);
        this.wing3R.addBox(-0.5F, -10.0F, 0.0F, 1, 10, 11, 0.0F);
        this.setRotateAngle(wing3R, 0.0F, 0.0F, -0.091106186954104F);
        this.wing2L = new AdvancedModelRendererExtended(this, 1, 76);
        this.wing2L.setRotationPoint(8.8F, 0.0F, 0.3F);
        this.wing2L.addBox(-0.5F, 0.0F, 0.0F, 1, 11, 12, 0.0F);
        this.setRotateAngle(wing2L, 0.0F, 0.0F, -0.6373942428283291F);
        this.upperlegL = new AdvancedModelRendererExtended(this, 84, 26);
        this.upperlegL.setRotationPoint(1.7F, -0.1F, 4.1F);
        this.upperlegL.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperlegL, -0.045553093477052F, 0.0F, -0.4553564018453205F);
        this.lowerteeth2 = new AdvancedModelRendererExtended(this, 0, 0);
        this.lowerteeth2.setRotationPoint(0.0F, -0.6F, -2.9F);
        this.lowerteeth2.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lowerteeth2, -0.091106186954104F, 0.0F, 0.0F);
        this.legwing12_1 = new AdvancedModelRendererExtended(this, 7, 50);
        this.legwing12_1.setRotationPoint(0.0F, 0.8F, 1.2F);
        this.legwing12_1.addBox(0.0F, 0.0F, 0.0F, 0, 8, 2, 0.0F);
        this.setRotateAngle(legwing12_1, -0.136659280431156F, -0.31869712141416456F, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 7, 2);
        this.teeth1.setRotationPoint(0.0F, 0.9F, 1.1F);
        this.teeth1.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(teeth1, -0.045553093477052F, 0.0F, 0.0F);
        this.crest2 = new AdvancedModelRendererExtended(this, 27, 47);
        this.crest2.setRotationPoint(0.0F, -0.5F, 1.2F);
        this.crest2.addBox(0.0F, -3.0F, -4.0F, 0, 5, 4, 0.0F);
        this.setRotateAngle(crest2, -0.31869712141416456F, 0.0F, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 38, 37);
        this.head2.setRotationPoint(0.0F, 0.1F, -4.0F);
        this.head2.addBox(-1.5F, -0.5F, -4.0F, 3, 2, 4, 0.0F);
        this.wing4R = new AdvancedModelRendererExtended(this, 56, 90);
        this.wing4R.setRotationPoint(0.1F, 0.0F, 11.0F);
        this.wing4R.addBox(-0.5F, -9.0F, 0.0F, 1, 9, 18, 0.0F);
        this.setRotateAngle(wing4R, 1.2292353921796064F, 0.0F, 0.0F);
        this.wing4L = new AdvancedModelRendererExtended(this, 0, 100);
        this.wing4L.setRotationPoint(-0.1F, 0.0F, 11.0F);
        this.wing4L.addBox(-0.5F, -9.0F, 0.0F, 1, 9, 18, 0.0F);
        this.setRotateAngle(wing4L, 1.2292353921796064F, 0.0F, 0.0F);
        this.lowerteeth1 = new AdvancedModelRendererExtended(this, 7, 2);
        this.lowerteeth1.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.lowerteeth1.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 72, 5);
        this.neck1.setRotationPoint(0.0F, -1.1F, -1.8F);
        this.neck1.addBox(-1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(neck1, -0.22759093446006054F, 0.0F, -0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 45, 46);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -3.8F);
        this.jaw3.addBox(-1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(jaw3, -0.045553093477052F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 46, 6);
        this.body.setRotationPoint(0.0F, -0.8F, 3.4F);
        this.body.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 6, 0.0F);
        this.setRotateAngle(body, -0.045553093477052F, 0.0F, 0.0F);
        this.lowerlegR = new AdvancedModelRendererExtended(this, 84, 36);
        this.lowerlegR.setRotationPoint(-0.3F, 5.7F, -0.4F);
        this.lowerlegR.addBox(-0.5F, 0.0F, -1.0F, 1, 9, 2, 0.0F);
        this.setRotateAngle(lowerlegR, 0.7285004297824331F, 0.0F, -0.36425021489121656F);
        this.neck2 = new AdvancedModelRendererExtended(this, 72, 16);
        this.neck2.setRotationPoint(-0.05F, 0.1F, -4.4F);
        this.neck2.addBox(-1.5F, -1.5F, -6.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(neck2, -0.4553564018453205F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 10, 17);
        this.tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail3, 0.045553093477052F, 0.0F, 0.0F);
        this.legwing11 = new AdvancedModelRendererExtended(this, 0, 47);
        this.legwing11.setRotationPoint(0.1F, 0.0F, 1.0F);
        this.legwing11.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 2, 0.0F);
        this.head5 = new AdvancedModelRendererExtended(this, 49, 33);
        this.head5.setRotationPoint(0.0F, -1.2F, 0.1F);
        this.head5.addBox(-0.5F, 0.0F, -3.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(head5, 0.27314402793711257F, 0.0F, 0.0F);
        this.upperlegR = new AdvancedModelRendererExtended(this, 0, 26);
        this.upperlegR.setRotationPoint(-1.7F, -0.1F, 4.1F);
        this.upperlegR.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperlegR, -0.045553093477052F, 0.0F, 0.4553564018453205F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 33, 44);
        this.jaw2.setRotationPoint(0.0F, 0.5F, -2.9F);
        this.jaw2.addBox(-1.5F, -0.5F, -4.0F, 3, 1, 4, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 58, 36);
        this.head4.setRotationPoint(0.0F, -0.5F, 0.2F);
        this.head4.addBox(-1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(head4, 0.22759093446006054F, 0.0F, 0.0F);
        this.handL = new AdvancedModelRendererExtended(this, 29, 79);
        this.handL.setRotationPoint(-0.1F, 0.2F, 0.0F);
        this.handL.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handL, 0.18203784098300857F, 0.18203784098300857F, 0.045553093477052F);
        this.wing1R = new AdvancedModelRendererExtended(this, 33, 56);
        this.wing1R.setRotationPoint(-1.4F, -1.6F, -2.3F);
        this.wing1R.addBox(-9.0F, -1.0F, 0.0F, 9, 2, 13, 0.0F);
        this.setRotateAngle(wing1R, -0.045553093477052F, 0.0F, -0.5462880558742251F);
        this.footR = new AdvancedModelRendererExtended(this, 0, 17);
        this.footR.setRotationPoint(0.0F, 8.7F, 0.0F);
        this.footR.addBox(-1.0F, -0.5F, -6.0F, 2, 1, 7, 0.0F);
        this.setRotateAngle(footR, -0.4553564018453205F, 0.0F, -0.091106186954104F);
        this.lowerlegL = new AdvancedModelRendererExtended(this, 0, 36);
        this.lowerlegL.setRotationPoint(0.3F, 5.7F, -0.4F);
        this.lowerlegL.addBox(-0.5F, 0.0F, -1.0F, 1, 9, 2, 0.0F);
        this.setRotateAngle(lowerlegL, 0.7285004297824331F, 0.0F, 0.36425021489121656F);
        this.chest = new AdvancedModelRendererExtended(this, 25, 0);
        this.chest.setRotationPoint(0.0F, 10.5F, -4.6F);
        this.chest.addBox(-2.5F, -3.0F, -2.6F, 5, 5, 6, 0.0F);
        this.setRotateAngle(chest, -0.18203784098300857F, 0.0F, 0.0F);
        this.wing3L = new AdvancedModelRendererExtended(this, 21, 96);
        this.wing3L.setRotationPoint(-0.1F, 11.0F, 0.3F);
        this.wing3L.addBox(-0.5F, -10.0F, 0.0F, 1, 10, 11, 0.0F);
        this.setRotateAngle(wing3L, 0.0F, 0.0F, 0.091106186954104F);
        this.tail4.addChild(this.tail5);
        this.lowerlegL.addChild(this.footL);
        this.wing1R.addChild(this.wing2R);
        this.wing3R.addChild(this.handR);
        this.neck2.addChild(this.head);
        this.jaw2.addChild(this.underhead1);
        this.upperlegL.addChild(this.legwing11_1);
        this.tail3.addChild(this.tail4);
        this.chest.addChild(this.wing1L);
        this.body.addChild(this.tail1);
        this.lowerlegR.addChild(this.legwing12);
        this.jaw.addChild(this.gums1);
        this.neck2.addChild(this.underneck1);
        this.head2.addChild(this.head3);
        this.head2.addChild(this.crest1);
        this.head2.addChild(this.teeth2);
        this.head.addChild(this.jaw);
        this.tail1.addChild(this.tail2);
        this.wing2R.addChild(this.wing3R);
        this.wing1L.addChild(this.wing2L);
        this.body.addChild(this.upperlegL);
        this.jaw2.addChild(this.lowerteeth2);
        this.lowerlegL.addChild(this.legwing12_1);
        this.head3.addChild(this.teeth1);
        this.head5.addChild(this.crest2);
        this.head.addChild(this.head2);
        this.wing3R.addChild(this.wing4R);
        this.wing3L.addChild(this.wing4L);
        this.jaw3.addChild(this.lowerteeth1);
        this.chest.addChild(this.neck1);
        this.jaw2.addChild(this.jaw3);
        this.chest.addChild(this.body);
        this.upperlegR.addChild(this.lowerlegR);
        this.neck1.addChild(this.neck2);
        this.tail2.addChild(this.tail3);
        this.upperlegR.addChild(this.legwing11);
        this.head3.addChild(this.head5);
        this.body.addChild(this.upperlegR);
        this.jaw.addChild(this.jaw2);
        this.head2.addChild(this.head4);
        this.wing3L.addChild(this.handL);
        this.chest.addChild(this.wing1R);
        this.lowerlegR.addChild(this.footR);
        this.upperlegL.addChild(this.lowerlegL);
        this.wing2L.addChild(this.wing3L);

        updateDefaultPose();
        animator = ModelAnimator.create();
        scaler = 0.195F;
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.chest.render(f5 * this.scaler);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.chest.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.chest.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.chest.offsetY = 0.4F;
        this.chest.offsetX = 0.05F;
        this.chest.offsetZ = 0.5F;
        this.chest.rotateAngleY = (float)Math.toRadians(120);
        this.chest.rotateAngleX = (float)Math.toRadians(1);
        this.chest.rotateAngleZ = (float)Math.toRadians(0);
        this.chest.scaleChildren = true;
        float scaler = 0.25F;
        this.chest.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(chest, 0.4F, 3.9F, -0.2F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(footL, 1.0016444577195458F, 0.0F, 0.0F);
        this.setRotateAngle(wing2R, 0.0F, 0.0F, 1.6845917940249266F);
        this.setRotateAngle(handR, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.22759093446006054F, 0.0F, 0.0F);
        this.setRotateAngle(underhead1, -0.045553093477052F, 0.0F, 0.0F);
        this.setRotateAngle(wing1L, 0.0F, 0.0F, -0.091106186954104F);
        this.setRotateAngle(gums1, -0.4553564018453205F, 0.0F, 0.0F);
        this.setRotateAngle(underneck1, 0.091106186954104F, 0.0F, 0.0F);
        this.setRotateAngle(wing3R, -1.4570008595648662F, 0.0F, -0.18203784098300857F);
        this.setRotateAngle(wing2L, 0.0F, 0.0F, -1.6845917940249266F);
        this.setRotateAngle(upperlegL, 0.8651597102135892F, 0.0F, -1.6390387005478748F);
        this.setRotateAngle(wing4R, 0.091106186954104F, 0.136659280431156F, 0.0F);
        this.setRotateAngle(wing4L, 0.091106186954104F, -0.136659280431156F, 0.0F);
        this.setRotateAngle(neck1, 0.18203784098300857F, 0.0F, -0.0F);
        this.setRotateAngle(lowerlegR, 0.7285004297824331F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.31869712141416456F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.8651597102135892F, 0.0F, 1.6390387005478748F);
        this.setRotateAngle(handL, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(wing1R, 0.0F, 0.0F, 0.091106186954104F);
        this.setRotateAngle(footR, 1.0016444577195458F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegL, 0.7285004297824331F, 0.0F, 0.0F);
        this.setRotateAngle(wing3L, -1.4570008595648662F, 0.0F, 0.18203784098300857F);
        //End of pose, now render the model:
        this.chest.render(f);
        //Reset rotations, positions and sizing:
        this.chest.setScale(1.0F, 1.0F, 1.0F);
        this.chest.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;
        if (flier.isReallyFlying() || flier.getAnimation() == flier.UNFLY_ANIMATION) { //flight pose
            this.setRotateAngle(footL, 1.0016444577195458F, 0.0F, 0.0F);
            this.setRotateAngle(wing2R, 0.0F, 0.0F, 1.6845917940249266F);
            this.setRotateAngle(handR, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(head, 0.22759093446006054F, 0.0F, 0.0F);
            this.setRotateAngle(underhead1, -0.045553093477052F, 0.0F, 0.0F);
            this.setRotateAngle(wing1L, 0.0F, 0.0F, -0.091106186954104F);
            this.setRotateAngle(gums1, -0.4553564018453205F, 0.0F, 0.0F);
            this.setRotateAngle(underneck1, 0.091106186954104F, 0.0F, 0.0F);
            this.setRotateAngle(wing3R, -1.4570008595648662F, 0.0F, -0.18203784098300857F);
            this.setRotateAngle(wing2L, 0.0F, 0.0F, -1.6845917940249266F);
            this.setRotateAngle(upperlegL, 0.8651597102135892F, 0.0F, -1.6390387005478748F);
            this.setRotateAngle(wing4R, 0.091106186954104F, 0.136659280431156F, 0.0F);
            this.setRotateAngle(wing4L, 0.091106186954104F, -0.136659280431156F, 0.0F);
            this.setRotateAngle(neck1, 0.18203784098300857F, 0.0F, -0.0F);
            this.setRotateAngle(lowerlegR, 0.7285004297824331F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.31869712141416456F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegR, 0.8651597102135892F, 0.0F, 1.6390387005478748F);
            this.setRotateAngle(handL, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(wing1R, 0.0F, 0.0F, 0.091106186954104F);
            this.setRotateAngle(footR, 1.0016444577195458F, 0.0F, 0.0F);
            this.setRotateAngle(lowerlegL, 0.7285004297824331F, 0.0F, 0.0F);
            this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(wing3L, -1.4570008595648662F, 0.0F, 0.18203784098300857F);
        } else {
            resetToDefaultPose();
        }

        AdvancedModelRenderer[] wingLeft = {this.wing1L, this.wing2L, this.wing3L};
        AdvancedModelRenderer[] wingRight = {this.wing1R, this.wing2R, this.wing3R};

        AdvancedModelRenderer[] legLeft = {this.upperlegL, this.lowerlegL, this.footL};
        AdvancedModelRenderer[] legRight = {this.upperlegR, this.lowerlegR, this.footR};

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.50F;
        float fixedY = 1.19F; //The standard offset to centre the mob

        //Animations:

        if (flier.isReallyFlying()) {

            this.faceTarget(f3, f4, 8, neck1);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head);

            this.chainFlap(wingLeft, speed, 0.25F, 0.2F, f2, 1F);
            this.chainFlap(wingRight, speed, -0.25F, -0.2F, f2, 1F);

            this.swing(wing4L, speed, 0.2F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(wing4R, speed, -0.2F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(wing1L, speed, 0.05F, false, 2.0F, 0.025F, f2, 1F);
            this.swing(wing1R, speed, -0.05F, false, 2.0F, -0.025F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speed, 0.30F, false, 4, f2, 1);
            this.chest.offsetZ = floatMoveZ * this.scaler;
            float floatMoveY = this.moveBoxExtended(speed, 0.30F, false, 4, f2, 1);
            this.chest.offsetY = (floatMoveY  * this.scaler) + fixedY;

            this.chainWaveExtended(legLeft, speed, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speed, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else { //not flying

            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }

            this.faceTarget(f3, f4, 12, neck1);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 8, head);

            this.chest.offsetY = fixedY;

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

            if (f3 == 0 || !flier.getIsMoving() || flier.getAnimation() == flier.FLY_ANIMATION || flier.getAnimation() == flier.UNFLY_ANIMATION) {
                return;
            }

            //body walking:
            this.flap(wing1L, speed, -0.2F, true, 4, 0.15F, f2, 1F);
            this.flap(wing1R, speed, 0.2F, true, 7, -0.15F, f2, 1F);

            this.walk(chest, speed, -0.2F, true, 6.5F, -0.1F, f2, 1F);
            this.walk(body, speed, -0.2F, true, 6.5F, -0.1F, f2, 1F);
            this.walk(tail1, speed, 0.4F, true, 6.5F, 0.2F, f2, 1F);
            this.walk(neck1, speed, 0.4F, true, 6.5F, 0.2F, f2, 1F);

            //this.walk(upperlegL, speed, -0.1F, true, 6.5F, 0.05F, f2, 1F);
            //this.walk(upperlegR, speed, -0.1F, true, 6.5F, 0.05F, f2, 1F);

            this.flap(upperlegL, speed, 0.05F, false, 6.5F, 0.05F, f2, 1F);
            this.flap(upperlegR, speed, -0.05F, false, 6.5F, -0.05F, f2, 1F);

            this.swing(body, speed, -0.1F, true, 6.5F, -0.05F, f2, 1F);

            this.walk(wing1L, speed, 0.40F, true, 5, 0.30F, f2, 1F);
            this.walk(wing1R, speed, 0.40F, true, 8, 0.30F, f2, 1F);

            this.walk(upperlegL, speed, 0.20F, true, 6.5F, -0.08F, f2, 1F);
            this.walk(upperlegR, speed, 0.20F, true, 6.5F, -0.08F, f2, 1F);

            this.walk(wing2L, speed, 0.25F, true, 6, 0F, f2, 1F);
            this.walk(wing2R, speed, 0.25F, true, 9, 0F, f2, 1F);

            this.walk(lowerlegL, speed, 0.15F, true, 7.5F, 0F, f2, 1F);
            this.walk(lowerlegR, speed, 0.15F, true, 7.5F, 0F, f2, 1F);

            this.flap(wing2L, speed, 0.10F, true, 0, 0.05F, f2, 1F);
            this.flap(wing2R, speed, -0.10F, true, 3, -0.05F, f2, 1F);

            this.walk(handL, speed, 0.30F, true, 2, -0.10F, f2, 1F);
            this.walk(handR, speed, 0.30F, true, 5, -0.10F, f2, 1F);

            this.walk(footL, speed, 0.25F, true, 3.5F, -0.08F, f2, 1F);
            this.walk(footR, speed, 0.25F, true, 3.5F, -0.08F, f2, 1F);

            this.bobExtended(chest, speed * 2F, 0.185F, false, 2.5F,  f2, 1F);

            this.flap(body, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
            this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
            this.flap(neck1, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

            this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);
            this.walk(body, speed * 2, -0.05F, false, 2.5F,0.01F, f2, 0.8F);

            this.chest.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingFlyingWalkingBase e = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(footL, 1.45700085956486F, 0F, -0.091106186954104F);
        animator.rotate(wing2R, 0F, 0F, 1.04719755119659F);
        animator.rotate(handR, -0.182037840983008F, 0.182037840983008F, 0.045553093477052F);
        animator.rotate(head, -0.728500429782433F, 0F, 0F);
        animator.rotate(underhead1, 0.091106186954104F, 0F, 0F);
        animator.rotate(wing1L, 0.045553093477052F, 0F, -0.637394242828329F);
        animator.rotate(gums1, -0.091106186954104F, 0F, 0F);
        animator.rotate(underneck1, -0.090931654028904F, 0F, 0F);
        animator.rotate(wing3R, -1.45700085956486F, 0F, -0.090931654028904F);
        animator.rotate(wing2L, 0F, 0F, -1.04719755119659F);
        animator.rotate(upperlegL, 0.910712803690641F, 0F, -1.18368229870255F);
        animator.rotate(wing4R, -1.1381292052255F, 0.136659280431156F, 0F);
        animator.rotate(wing4L, -1.1381292052255F, -0.136659280431156F, 0F);
        animator.rotate(neck1, 0.409628775443068F, 0F, 0F);
        animator.rotate(lowerlegR, 0F, 0F, 0.364250214891216F);
        animator.rotate(neck2, 0.136659280431156F, 0F, 0F);
        animator.rotate(upperlegR, 0.910712803690641F, 0F, 1.18368229870255F);
        animator.rotate(handL, -0.182037840983008F, -0.182037840983008F, -0.045553093477052F);
        animator.rotate(wing1R, 0.045553093477052F, 0F, 0.637394242828329F);
        animator.rotate(footR, 1.45700085956486F, 0F, 0.091106186954104F);
        animator.rotate(lowerlegL, 0F, 0F, -0.364250214891216F);
        animator.rotate(chest, 0.182037840983008F, 0F, 0F);
        animator.rotate(wing3L, -1.45700085956486F, 0F, 0.090931654028904F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(footL, -1.45700085956486F, 0F, 0.091106186954104F);
        animator.rotate(wing2R, 0F, 0F, -1.04719755119659F);
        animator.rotate(handR, 0.18203784098300857F, -0.18203784098300857F, -0.045553093477052F);
        animator.rotate(head, 0.728500429782433F, 0F, 0F);
        animator.rotate(underhead1, -0.091106186954104F, 0F, 0F);
        animator.rotate(wing1L, -0.045553093477052F, 0F, 0.637394242828329F);
        animator.rotate(gums1, 0.091106186954104F, 0F, 0F);
        animator.rotate(underneck1, 0.090931654028904F, 0F, 0F);
        animator.rotate(wing3R, 1.45700085956486F, 0F, 0.090931654028904F);
        animator.rotate(wing2L, 0F, 0F, 1.04719755119659F);
        animator.rotate(upperlegL, -0.910712803690641F, 0F, 1.18368229870255F);
        animator.rotate(wing4R, 1.1381292052255F, -0.136659280431156F, 0F);
        animator.rotate(wing4L, 1.1381292052255F, 0.136659280431156F, 0F);
        animator.rotate(neck1, -0.409628775443068F, 0F, 0F);
        animator.rotate(lowerlegR, 0F, 0F, -0.364250214891216F);
        animator.rotate(neck2, -0.136659280431156F, 0F, 0F);
        animator.rotate(upperlegR, -0.910712803690641F, 0F, -1.18368229870255F);
        animator.rotate(handL, 0.18203784098300857F, 0.18203784098300857F, 0.045553093477052F);
        animator.rotate(wing1R, -0.045553093477052F, 0F, -0.637394242828329F);
        animator.rotate(footR, -1.45700085956486F, 0F, -0.091106186954104F);
        animator.rotate(lowerlegL, 0F, 0F, 0.364250214891216F);
        animator.rotate(chest, -0.18203784098300857F, 0.0F, 0.0F);
        animator.rotate(wing3L, 1.45700085956486F, 0F, -0.090931654028904F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.rotate(this.neck1, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(4);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(10);
        ///Anim code in here for laying
        animator.endKeyframe();
        animator.setStaticKeyframe(30);
        animator.resetKeyframe(10);

    }
}
