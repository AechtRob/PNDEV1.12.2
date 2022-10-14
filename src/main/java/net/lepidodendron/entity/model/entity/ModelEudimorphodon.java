package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFlyingBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelEudimorphodon extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended body1;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended wing1L;
    public AdvancedModelRendererExtended wing1R;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperlegR;
    public AdvancedModelRendererExtended upperlegL;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tail4;
    public AdvancedModelRendererExtended tail5;
    public AdvancedModelRendererExtended tail6;
    public AdvancedModelRendererExtended lowerlegR;
    public AdvancedModelRendererExtended legwing21;
    public AdvancedModelRendererExtended footR;
    public AdvancedModelRendererExtended legwing22;
    public AdvancedModelRendererExtended lowerlegL;
    public AdvancedModelRendererExtended legwing12;
    public AdvancedModelRendererExtended footL;
    public AdvancedModelRendererExtended legwing11;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended underneck1;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended underneck2;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended underteeth3;
    public AdvancedModelRendererExtended underteeth2;
    public AdvancedModelRendererExtended underteeth1;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended teeth3;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended teeth2;
    public AdvancedModelRendererExtended head5;
    public AdvancedModelRendererExtended wing2L;
    public AdvancedModelRendererExtended wing3L;
    public AdvancedModelRendererExtended wing4L;
    public AdvancedModelRendererExtended handL;
    public AdvancedModelRendererExtended wing2R;
    public AdvancedModelRendererExtended wing3R;
    public AdvancedModelRendererExtended wing4R;
    public AdvancedModelRendererExtended handR;

    private ModelAnimator animator;

    private float scaler;

    public ModelEudimorphodon() {
        this.textureWidth = 105;
        this.textureHeight = 113;
        this.gums1 = new AdvancedModelRendererExtended(this, 0, 38);
        this.gums1.setRotationPoint(0.0F, 0.6F, -1.3F);
        this.gums1.addBox(-1.5F, -3.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(gums1, -0.36425021489121656F, 0.0F, 0.0F);
        this.wing2R = new AdvancedModelRendererExtended(this, 2, 48);
        this.wing2R.setRotationPoint(-7.2F, 0.1F, 0.3F);
        this.wing2R.addBox(-0.5F, 0.0F, 0.0F, 1, 12, 11, 0.0F);
        this.setRotateAngle(wing2R, 0.0F, 0.0F, 0.045553093477052F);
        this.underteeth1 = new AdvancedModelRendererExtended(this, 29, 47);
        this.underteeth1.setRotationPoint(0.3F, 0.0F, 0.2F);
        this.underteeth1.addBox(-0.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(underteeth1, 0.0F, 0.0F, -2.777342438698576F);
        this.head5 = new AdvancedModelRendererExtended(this, 69, 20);
        this.head5.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.head5.addBox(-0.5F, -0.5F, -4.0F, 1, 1, 3, 0.0F);
        this.wing2L = new AdvancedModelRendererExtended(this, 27, 48);
        this.wing2L.setRotationPoint(7.2F, 0.1F, 0.3F);
        this.wing2L.addBox(-0.5F, 0.0F, 0.0F, 1, 12, 11, 0.0F);
        this.setRotateAngle(wing2L, 0.0F, 0.0F, -0.045553093477052F);
        this.tail5 = new AdvancedModelRendererExtended(this, 39, 14);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.4F);
        this.tail5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tail5, 0.045553093477052F, 0.0F, 0.0F);
        this.legwing11 = new AdvancedModelRendererExtended(this, 5, 19);
        this.legwing11.setRotationPoint(0.1F, 0.2F, 0.4F);
        this.legwing11.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2, 0.0F);
        this.setRotateAngle(legwing11, -0.091106186954104F, 0.0F, 0.0F);
        this.upperlegL = new AdvancedModelRendererExtended(this, 0, 13);
        this.upperlegL.setRotationPoint(2.0F, 1.3F, 6.4F);
        this.upperlegL.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(upperlegL, -0.36425021489121656F, 0.0F, -0.5009094953223726F);
        this.legwing21 = new AdvancedModelRendererExtended(this, 9, 13);
        this.legwing21.setRotationPoint(-0.3F, 0.0F, 0.9F);
        this.legwing21.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 55, 17);
        this.head3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.head3.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 48, 24);
        this.head1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head1.addBox(-2.0F, -2.0F, -4.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head1, 0.5918411493512771F, 0.0F, 0.0F);
        this.underneck1 = new AdvancedModelRendererExtended(this, 73, 19);
        this.underneck1.setRotationPoint(0.0F, 1.3F, 0.1F);
        this.underneck1.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 6, 0.0F);
        this.setRotateAngle(underneck1, 0.136659280431156F, 0.0F, 0.0F);
        this.upperlegR = new AdvancedModelRendererExtended(this, 0, 13);
        this.upperlegR.setRotationPoint(-2.0F, 1.3F, 6.4F);
        this.upperlegR.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(upperlegR, -0.36425021489121656F, 0.0F, 0.5009094953223726F);
        this.body1 = new AdvancedModelRendererExtended(this, 20, 6);
        this.body1.setRotationPoint(0.0F, 0.3F, 3.2F);
        this.body1.addBox(-2.5F, -2.0F, 0.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(body1, -0.045553093477052F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 6, 20);
        this.neck1.setRotationPoint(0.0F, 0.4F, -0.9F);
        this.neck1.addBox(-2.0F, -2.0F, -6.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(neck1, -0.18203784098300857F, 0.0F, 0.0F);
        this.tail4 = new AdvancedModelRendererExtended(this, 39, 14);
        this.tail4.setRotationPoint(0.0F, 0.0F, 7.7F);
        this.tail4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tail4, 0.045553093477052F, 0.0F, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 61, 22);
        this.head4.setRotationPoint(0.0F, -1.6F, -0.8F);
        this.head4.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(head4, 0.27314402793711257F, 0.0F, 0.0F);
        this.wing1L = new AdvancedModelRendererExtended(this, 1, 33);
        this.wing1L.setRotationPoint(2.1F, -0.2F, -1.6F);
        this.wing1L.addBox(-2.0F, -1.0F, 0.0F, 10, 2, 12, 0.0F);
        this.setRotateAngle(wing1L, 0.0F, 0.18203784098300857F, -0.091106186954104F);
        this.tail3 = new AdvancedModelRendererExtended(this, 39, 14);
        this.tail3.setRotationPoint(0.0F, 0.0F, 10.4F);
        this.tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F);
        this.setRotateAngle(tail3, 0.045553093477052F, 0.0F, 0.0F);
        this.lowerlegL = new AdvancedModelRendererExtended(this, 0, 20);
        this.lowerlegL.setRotationPoint(0.1F, 3.7F, -0.3F);
        this.lowerlegL.addBox(-0.5F, -0.2F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(lowerlegL, 0.7740535232594852F, 0.0F, 0.5462880558742251F);
        this.wing4R = new AdvancedModelRendererExtended(this, 47, 78);
        this.wing4R.setRotationPoint(0.1F, 0.0F, 10.7F);
        this.wing4R.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 16, 0.0F);
        this.setRotateAngle(wing4R, 0.7285004297824331F, 0.0F, 0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 35, 40);
        this.jaw3.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.jaw3.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.teeth3 = new AdvancedModelRendererExtended(this, 18, 48);
        this.teeth3.setRotationPoint(0.0F, 0.7F, 0.4F);
        this.teeth3.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.footR = new AdvancedModelRendererExtended(this, 0, 32);
        this.footR.setRotationPoint(0.0F, 5.6F, -0.3F);
        this.footR.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(footR, -0.40980330836826856F, 0.5918411493512771F, -0.22759093446006054F);
        this.underteeth2 = new AdvancedModelRendererExtended(this, 18, 53);
        this.underteeth2.setRotationPoint(-0.3F, 0.0F, 0.2F);
        this.underteeth2.addBox(-0.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(underteeth2, 0.0F, 0.0F, 2.777342438698576F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 49, 53);
        this.teeth1.setRotationPoint(0.3F, 0.0F, 0.2F);
        this.teeth1.addBox(-0.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(teeth1, 0.0F, 0.0F, 2.777342438698576F);
        this.legwing22 = new AdvancedModelRendererExtended(this, 5, 19);
        this.legwing22.setRotationPoint(-0.1F, 0.2F, 0.4F);
        this.legwing22.addBox(0.0F, 0.0F, 0.0F, 0, 5, 2, 0.0F);
        this.setRotateAngle(legwing22, -0.091106186954104F, 0.0F, 0.0F);
        this.underteeth3 = new AdvancedModelRendererExtended(this, 18, 48);
        this.underteeth3.setRotationPoint(0.0F, -0.7F, 0.4F);
        this.underteeth3.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F);
        this.handR = new AdvancedModelRendererExtended(this, 0, 55);
        this.handR.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.handR.addBox(-1.5F, -0.5F, 0.2F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handR, 0.0F, -0.6373942428283291F, -0.045553093477052F);
        this.handL = new AdvancedModelRendererExtended(this, 0, 55);
        this.handL.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.handL.addBox(-1.5F, -0.5F, 0.2F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handL, 0.0F, 0.6373942428283291F, 0.045553093477052F);
        this.neck2 = new AdvancedModelRendererExtended(this, 34, 25);
        this.neck2.setRotationPoint(0.0F, -0.4F, -5.5F);
        this.neck2.addBox(-1.5F, -1.5F, -5.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(neck2, -0.27314402793711257F, 0.0F, 0.0F);
        this.tail6 = new AdvancedModelRendererExtended(this, 22, 12);
        this.tail6.setRotationPoint(0.0F, 0.0F, 5.1F);
        this.tail6.addBox(0.0F, -2.5F, 0.0F, 0, 5, 8, 0.0F);
        this.legwing12 = new AdvancedModelRendererExtended(this, 9, 13);
        this.legwing12.setRotationPoint(0.3F, 0.0F, 0.9F);
        this.legwing12.addBox(-0.5F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 50, 3);
        this.tail2.setRotationPoint(0.0F, -0.1F, 6.6F);
        this.tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 11, 0.0F);
        this.setRotateAngle(tail2, 0.045553093477052F, 0.0F, 0.0F);
        this.underneck2 = new AdvancedModelRendererExtended(this, 27, 53);
        this.underneck2.setRotationPoint(0.0F, 0.5F, -4.4F);
        this.underneck2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(underneck2, -0.091106186954104F, 0.0F, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 65, 28);
        this.head2.setRotationPoint(0.0F, 0.5F, -3.9F);
        this.head2.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 46, 38);
        this.jaw2.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.jaw2.addBox(-1.5F, -0.5F, -3.0F, 3, 1, 3, 0.0F);
        this.wing4L = new AdvancedModelRendererExtended(this, 10, 78);
        this.wing4L.setRotationPoint(-0.1F, 0.0F, 10.7F);
        this.wing4L.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 16, 0.0F);
        this.setRotateAngle(wing4L, 0.6829473363053812F, 0.0F, 0.0F);
        this.wing3R = new AdvancedModelRendererExtended(this, 1, 72);
        this.wing3R.setRotationPoint(-0.1F, 12.0F, 0.3F);
        this.wing3R.addBox(-0.5F, -9.0F, 0.0F, 1, 9, 11, 0.0F);
        this.setRotateAngle(wing3R, 0.0F, 0.0F, -0.091106186954104F);
        this.footL = new AdvancedModelRendererExtended(this, 0, 49);
        this.footL.setRotationPoint(0.0F, 5.6F, -0.3F);
        this.footL.addBox(-1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(footL, -0.40980330836826856F, -0.5918411493512771F, 0.22759093446006054F);
        this.wing3L = new AdvancedModelRendererExtended(this, 29, 71);
        this.wing3L.setRotationPoint(0.1F, 12.0F, 0.3F);
        this.wing3L.addBox(-0.5F, -9.0F, 0.0F, 1, 9, 11, 0.0F);
        this.setRotateAngle(wing3L, 0.0F, 0.0F, 0.091106186954104F);
        this.chest = new AdvancedModelRendererExtended(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 12.5F, -5.7F);
        this.chest.addBox(-3.5F, -2.0F, -2.0F, 7, 6, 6, 0.0F);
        this.setRotateAngle(chest, -0.045553093477052F, 0.0F, 0.0F);
        this.wing1R = new AdvancedModelRendererExtended(this, 47, 33);
        this.wing1R.setRotationPoint(-2.1F, -0.2F, -1.6F);
        this.wing1R.addBox(-8.0F, -1.0F, 0.0F, 10, 2, 12, 0.0F);
        this.setRotateAngle(wing1R, 0.0F, -0.18203784098300857F, 0.091106186954104F);
        this.lowerlegR = new AdvancedModelRendererExtended(this, 0, 20);
        this.lowerlegR.setRotationPoint(-0.1F, 3.7F, -0.3F);
        this.lowerlegR.addBox(-0.5F, -0.2F, -0.5F, 1, 6, 1, 0.0F);
        this.setRotateAngle(lowerlegR, 0.7740535232594852F, 0.0F, -0.5462880558742251F);
        this.tail1 = new AdvancedModelRendererExtended(this, 39, 3);
        this.tail1.setRotationPoint(0.0F, 0.3F, 7.1F);
        this.tail1.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 7, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 34, 35);
        this.jaw1.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.jaw1.addBox(-2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F);
        this.teeth2 = new AdvancedModelRendererExtended(this, 41, 48);
        this.teeth2.setRotationPoint(-0.3F, 0.0F, 0.2F);
        this.teeth2.addBox(-0.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(teeth2, 0.0F, 0.0F, -2.777342438698576F);
        this.jaw1.addChild(this.gums1);
        this.wing1R.addChild(this.wing2R);
        this.jaw3.addChild(this.underteeth1);
        this.head4.addChild(this.head5);
        this.wing1L.addChild(this.wing2L);
        this.tail4.addChild(this.tail5);
        this.lowerlegL.addChild(this.legwing11);
        this.body1.addChild(this.upperlegL);
        this.upperlegR.addChild(this.legwing21);
        this.head2.addChild(this.head3);
        this.neck2.addChild(this.head1);
        this.neck2.addChild(this.underneck1);
        this.body1.addChild(this.upperlegR);
        this.chest.addChild(this.body1);
        this.chest.addChild(this.neck1);
        this.tail3.addChild(this.tail4);
        this.head2.addChild(this.head4);
        this.chest.addChild(this.wing1L);
        this.tail2.addChild(this.tail3);
        this.upperlegL.addChild(this.lowerlegL);
        this.wing3R.addChild(this.wing4R);
        this.jaw2.addChild(this.jaw3);
        this.head2.addChild(this.teeth3);
        this.lowerlegR.addChild(this.footR);
        this.jaw3.addChild(this.underteeth2);
        this.head3.addChild(this.teeth1);
        this.lowerlegR.addChild(this.legwing22);
        this.jaw2.addChild(this.underteeth3);
        this.wing3R.addChild(this.handR);
        this.wing3L.addChild(this.handL);
        this.neck1.addChild(this.neck2);
        this.tail5.addChild(this.tail6);
        this.upperlegL.addChild(this.legwing12);
        this.tail1.addChild(this.tail2);
        this.jaw1.addChild(this.underneck2);
        this.head1.addChild(this.head2);
        this.jaw1.addChild(this.jaw2);
        this.wing3L.addChild(this.wing4L);
        this.wing2R.addChild(this.wing3R);
        this.lowerlegL.addChild(this.footL);
        this.wing2L.addChild(this.wing3L);
        this.chest.addChild(this.wing1R);
        this.upperlegR.addChild(this.lowerlegR);
        this.body1.addChild(this.tail1);
        this.head1.addChild(this.jaw1);
        this.head3.addChild(this.teeth2);

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
        this.jaw1.rotateAngleX = (float) Math.toRadians(20);
        this.chest.render(0.1F);
        GlStateManager.enableCull();
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

        EntityPrehistoricFloraAgeableFlyingBase flier = (EntityPrehistoricFloraAgeableFlyingBase) e;
        if (flier.isReallyFlying() || flier.getAnimation() == flier.UNFLY_ANIMATION) { //flight pose
            this.setRotateAngle(wing2R, 0.045553093477052F, 0.0F, 1.6390387005478748F);
            this.setRotateAngle(wing2L, 0.045553093477052F, 0.0F, -1.6390387005478748F);
            this.setRotateAngle(upperlegL, 0.5918411493512771F, 0.0F, -1.8212510744560826F);
            this.setRotateAngle(head1, 0.27314402793711257F, 0.0F, 0.0F);
            this.setRotateAngle(upperlegR, 0.5918411493512771F, 0.0F, 1.8212510744560826F);
            this.setRotateAngle(neck1, 0.136659280431156F, 0.0F, 0.0F);
            this.setRotateAngle(lowerlegL, 0.7740535232594852F, 0.0F, 0.091106186954104F);
            this.setRotateAngle(wing4R, 0.18203784098300857F, 0.0F, 0.0F);
            this.setRotateAngle(footR, 1.0927506446736497F, 0.5918411493512771F, -0.22759093446006054F);
            this.setRotateAngle(handR, -0.091106186954104F, 0.0F, 0.0F);
            this.setRotateAngle(handL, -0.091106186954104F, 0.0F, 0.045553093477052F);
            this.setRotateAngle(neck2, -0.31869712141416456F, 0.0F, 0.0F);
            this.setRotateAngle(wing4L, 0.18203784098300857F, 0.0F, 0.0F);
            this.setRotateAngle(wing3R, -1.4114477660878142F, 0.0F, -0.136659280431156F);
            this.setRotateAngle(footL, 1.0927506446736497F, -0.5918411493512771F, 0.22759093446006054F);
            this.setRotateAngle(wing3L, -1.4114477660878142F, 0.0F, 0.136659280431156F);
            this.setRotateAngle(lowerlegR, 0.7740535232594852F, 0.0F, -0.091106186954104F);
        } else {
            resetToDefaultPose();
        }

        AdvancedModelRenderer[] wingLeft = {this.wing1L, this.wing2L, this.wing3L};
        AdvancedModelRenderer[] wingRight = {this.wing1R, this.wing2R, this.wing3R};

        AdvancedModelRenderer[] legLeft = {this.upperlegL, this.lowerlegL, this.footL};
        AdvancedModelRenderer[] legRight = {this.upperlegR, this.lowerlegR, this.footR};

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.54F;
        float fixedY = 1.19F; //The standard offset to centre the mob

        //Animations:

        if (flier.isReallyFlying()) {

            this.faceTarget(f3, f4, 8, neck1);
            this.faceTarget(f3, f4, 8, neck2);
            this.faceTarget(f3, f4, 4, head1);

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
            this.faceTarget(f3, f4, 8, head1);

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
            this.walk(body1, speed, -0.2F, true, 6.5F, -0.1F, f2, 1F);
            this.walk(tail1, speed, 0.4F, true, 6.5F, 0.2F, f2, 1F);
            this.walk(neck1, speed, 0.4F, true, 6.5F, 0.2F, f2, 1F);

            //this.walk(upperlegL, speed, -0.1F, true, 6.5F, 0.05F, f2, 1F);
            //this.walk(upperlegR, speed, -0.1F, true, 6.5F, 0.05F, f2, 1F);

            this.flap(upperlegL, speed, 0.05F, false, 6.5F, 0.05F, f2, 1F);
            this.flap(upperlegR, speed, -0.05F, false, 6.5F, -0.05F, f2, 1F);

            this.swing(body1, speed, -0.1F, true, 6.5F, -0.05F, f2, 1F);

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

            this.flap(body1, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);
            this.flap(chest, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);
            this.flap(neck1, speed, 0.08F, false, 5.0F,0.04F, f2, 1.0F);

            this.walk(chest, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);
            this.walk(body1, speed * 2, -0.05F, false, 2.5F,0.01F, f2, 0.8F);

            this.chest.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableFlyingBase e = (EntityPrehistoricFloraAgeableFlyingBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(wing2R, 0.045553093477052F, 0F, 1.59348560707082F);
        animator.rotate(wing2L, 0.045553093477052F, 0F, -1.59348560707082F);
        animator.rotate(upperlegL, 0.956091364242493F, 0F, -1.32034157913371F);
        animator.rotate(head1, -0.318697121414165F, 0F, 0F);
        animator.rotate(upperlegR, 0.956091364242493F, 0F, 1.32034157913371F);
        animator.rotate(neck1, 0.318697121414164F, 0F, 0F);
        animator.rotate(lowerlegL, 0F, 0F, -0.455181868920121F);
        animator.rotate(wing4R, -0.546462588799425F, 0F, 0F);
        animator.rotate(footR, 1.50255395304191F, 0F, 0F);
        animator.rotate(handR, -0.091106186954104F, 0.637394242828329F, 0.045553093477052F);
        animator.rotate(handL, -0.091106186954104F, -0.637394242828329F, 0F);
        animator.rotate(neck2, -0.045553093477052F, 0F, 0F);
        animator.rotate(wing4L, -0.500909495322373F, 0F, 0F);
        animator.rotate(wing3R, -1.41144776608781F, 0F, -0.045553093477052F);
        animator.rotate(footL, 1.50255395304191F, 0F, 0F);
        animator.rotate(wing3L, -1.41144776608781F, 0F, 0.045553093477052F);
        animator.rotate(lowerlegR, 0F, 0F, 0.455181868920121F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(wing2R, -0.045553093477052F, 0F, -1.59348560707082F);
        animator.rotate(wing2L, -0.045553093477052F, 0F, 1.59348560707082F);
        animator.rotate(upperlegL, -0.956091364242493F, 0F, 1.32034157913371F);
        animator.rotate(head1, 0.318697121414165F, 0F, 0F);
        animator.rotate(upperlegR, -0.956091364242493F, 0F, -1.32034157913371F);
        animator.rotate(neck1, -0.318697121414164F, 0F, 0F);
        animator.rotate(lowerlegL, 0F, 0F, 0.455181868920121F);
        animator.rotate(wing4R, 0.546462588799425F, 0F, 0F);
        animator.rotate(footR, -1.50255395304191F, 0F, 0F);
        animator.rotate(handR, 0.091106186954104F, -0.637394242828329F, -0.045553093477052F);
        animator.rotate(handL, 0.091106186954104F, 0.637394242828329F, 0F);
        animator.rotate(neck2, 0.045553093477052F, 0F, 0F);
        animator.rotate(wing4L, 0.500909495322373F, 0F, 0F);
        animator.rotate(wing3R, 1.41144776608781F, 0F, 0.045553093477052F);
        animator.rotate(footL, -1.50255395304191F, 0F, 0F);
        animator.rotate(wing3L, 1.41144776608781F, 0F, -0.045553093477052F);
        animator.rotate(lowerlegR, 0F, 0F, -0.455181868920121F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(-12), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(2);
        animator.rotate(this.neck1, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(4);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck1, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
