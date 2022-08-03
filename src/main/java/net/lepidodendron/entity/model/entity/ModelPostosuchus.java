package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPostosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPostosuchus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended body1;
    public AdvancedModelRendererExtended chest1;
    public AdvancedModelRendererExtended basin1;
    public AdvancedModelRendererExtended osteoderms1;
    public AdvancedModelRendererExtended osteoderms2;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended chestosteoderms1;
    public AdvancedModelRendererExtended chestosteoderms1_1;
    public AdvancedModelRendererExtended arm1;
    public AdvancedModelRendererExtended hand1;
    public AdvancedModelRendererExtended arm2;
    public AdvancedModelRendererExtended hand2;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended jaw4;
    public AdvancedModelRendererExtended underteeth1;
    public AdvancedModelRendererExtended underteeth2;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended teeth2;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended basinosteoderme1;
    public AdvancedModelRendererExtended basinosteoderme1_1;
    public AdvancedModelRendererExtended leg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended leg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tail1osteoderme1;
    public AdvancedModelRendererExtended tai1losteoderme2;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tail2osteoderme1;
    public AdvancedModelRendererExtended tail2osteoderme2;
    public AdvancedModelRendererExtended tail4;

    private ModelAnimator animator;

    public ModelPostosuchus() {
        this.textureWidth = 230;
        this.textureHeight = 120;
        this.basinosteoderme1_1 = new AdvancedModelRendererExtended(this, 98, 90);
        this.basinosteoderme1_1.setRotationPoint(1.2F, -0.8F, -0.9F);
        this.basinosteoderme1_1.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 10, 0.0F);
        this.setRotateAngle(basinosteoderme1_1, 0.0F, 0.0F, 0.136659280431156F);
        this.feet2 = new AdvancedModelRendererExtended(this, 184, 85);
        this.feet2.setRotationPoint(0.0F, 14.8F, 0.0F);
        this.feet2.addBox(-3.0F, -1.5F, -11.0F, 6, 3, 13, 0.0F);
        this.setRotateAngle(feet2, -0.091106186954104F, 0.0F, 0.0F);
        this.tail2osteoderme2 = new AdvancedModelRendererExtended(this, 47, 98);
        this.tail2osteoderme2.setRotationPoint(-0.6F, -3.7F, 0.5F);
        this.tail2osteoderme2.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 18, 0.0F);
        this.setRotateAngle(tail2osteoderme2, -0.045553093477052F, 0.0F, -0.136659280431156F);
        this.tail4 = new AdvancedModelRendererExtended(this, 169, 63);
        this.tail4.setRotationPoint(0.0F, -0.5F, 17.4F);
        this.tail4.addBox(-1.5F, -2.5F, 0.0F, 3, 4, 17, 0.0F);
        this.setRotateAngle(tail4, -0.18203784098300857F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 98, 28);
        this.head1.setRotationPoint(0.0F, -1.4F, -7.6F);
        this.head1.addBox(-4.0F, -4.0F, -10.0F, 8, 7, 10, 0.0F);
        this.setRotateAngle(head1, 0.045553093477052F, 0.0F, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 83, 70);
        this.head3.setRotationPoint(0.0F, -2.1F, 1.0F);
        this.head3.addBox(-1.5F, -2.5F, -10.0F, 3, 2, 10, 0.0F);
        this.setRotateAngle(head3, 0.18203784098300857F, 0.0F, 0.0F);
        this.hand1 = new AdvancedModelRendererExtended(this, 79, 69);
        this.hand1.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.hand1.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 4, 0.0F);
        this.setRotateAngle(hand1, 0.0F, 0.0F, 0.18203784098300857F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 115, 46);
        this.jaw2.setRotationPoint(0.0F, 1.0F, -8.9F);
        this.jaw2.addBox(-2.0F, -1.0F, -8.0F, 4, 2, 7, 0.0F);
        this.setRotateAngle(jaw2, 0.136659280431156F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 134, 44);
        this.tail2.setRotationPoint(0.0F, -0.5F, 18.1F);
        this.tail2.addBox(-3.0F, -4.5F, -1.0F, 6, 9, 20, 0.0F);
        this.setRotateAngle(tail2, 0.045553093477052F, 0.0F, 0.0F);
        this.teeth2 = new AdvancedModelRendererExtended(this, 115, 69);
        this.teeth2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.teeth2.addBox(-2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 110, 60);
        this.teeth1.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.teeth1.addBox(-2.5F, 0.0F, -6.0F, 5, 2, 6, 0.0F);
        this.arm1 = new AdvancedModelRendererExtended(this, 72, 49);
        this.arm1.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.arm1.addBox(-1.0F, 0.0F, -2.0F, 2, 8, 4, 0.0F);
        this.setRotateAngle(arm1, -0.5462880558742251F, 0.091106186954104F, 0.091106186954104F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 65, 33);
        this.upperarm1.setRotationPoint(4.5F, 9.4F, -10.9F);
        this.upperarm1.addBox(-1.5F, -1.0F, -2.5F, 3, 9, 5, 0.0F);
        this.setRotateAngle(upperarm1, 0.5918411493512771F, 0.0F, -0.136659280431156F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 47, 33);
        this.upperarm2.setRotationPoint(-4.5F, 9.4F, -10.9F);
        this.upperarm2.addBox(-1.5F, -1.0F, -2.5F, 3, 9, 5, 0.0F);
        this.setRotateAngle(upperarm2, 0.5918411493512771F, 0.0F, 0.136659280431156F);
        this.neck2 = new AdvancedModelRendererExtended(this, 147, 1);
        this.neck2.setRotationPoint(0.0F, 0.1F, -9.8F);
        this.neck2.addBox(-3.0F, -6.0F, -10.0F, 6, 12, 10, 0.0F);
        this.setRotateAngle(neck2, 0.27314402793711257F, 0.0F, 0.0F);
        this.tail1osteoderme1 = new AdvancedModelRendererExtended(this, 143, 88);
        this.tail1osteoderme1.setRotationPoint(1.0F, -4.8F, 0.5F);
        this.tail1osteoderme1.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 18, 0.0F);
        this.setRotateAngle(tail1osteoderme1, 0.0F, 0.0F, 0.136659280431156F);
        this.neck1 = new AdvancedModelRendererExtended(this, 108, 0);
        this.neck1.setRotationPoint(0.0F, 2.1F, -13.5F);
        this.neck1.addBox(-3.5F, -5.5F, -12.0F, 7, 12, 12, 0.0F);
        this.setRotateAngle(neck1, -0.36425021489121656F, 0.0F, 0.0F);
        this.hand2 = new AdvancedModelRendererExtended(this, 69, 63);
        this.hand2.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.hand2.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 4, 0.0F);
        this.setRotateAngle(hand2, 0.0F, 0.0F, -0.18203784098300857F);
        this.osteoderms1 = new AdvancedModelRendererExtended(this, 120, 90);
        this.osteoderms1.setRotationPoint(-1.6F, -1.7F, 0.0F);
        this.osteoderms1.addBox(-3.5F, -2.0F, -6.5F, 7, 2, 13, 0.0F);
        this.setRotateAngle(osteoderms1, 0.0F, 0.0F, -0.136659280431156F);
        this.jaw4 = new AdvancedModelRendererExtended(this, 81, 45);
        this.jaw4.setRotationPoint(0.0F, 1.6F, 0.0F);
        this.jaw4.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(jaw4, -0.27314402793711257F, 0.0F, 0.0F);
        this.leg1 = new AdvancedModelRendererExtended(this, 36, 87);
        this.leg1.setRotationPoint(0.0F, 12.0F, -0.4F);
        this.leg1.addBox(-2.0F, 0.0F, -3.5F, 4, 15, 7, 0.0F);
        this.setRotateAngle(leg1, 0.5918411493512771F, 0.0F, 0.0F);
        this.tai1losteoderme2 = new AdvancedModelRendererExtended(this, 143, 88);
        this.tai1losteoderme2.setRotationPoint(-1.0F, -4.8F, 0.5F);
        this.tai1losteoderme2.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 18, 0.0F);
        this.setRotateAngle(tai1losteoderme2, 0.0F, 0.0F, -0.136659280431156F);
        this.gums1 = new AdvancedModelRendererExtended(this, 42, 0);
        this.gums1.setRotationPoint(0.0F, 0.8F, -3.4F);
        this.gums1.addBox(-3.0F, -7.0F, -2.5F, 6, 7, 5, 0.0F);
        this.setRotateAngle(gums1, -0.136659280431156F, 0.0F, 0.0F);
        this.leg2 = new AdvancedModelRendererExtended(this, 0, 87);
        this.leg2.setRotationPoint(0.0F, 12.0F, -0.4F);
        this.leg2.addBox(-2.0F, 0.0F, -3.5F, 4, 15, 7, 0.0F);
        this.setRotateAngle(leg2, 0.5918411493512771F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 167, 37);
        this.tail3.setRotationPoint(0.0F, -0.6F, 16.7F);
        this.tail3.addBox(-2.0F, -3.5F, 0.0F, 4, 6, 19, 0.0F);
        this.setRotateAngle(tail3, -0.091106186954104F, 0.0F, 0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 131, 46);
        this.jaw3.setRotationPoint(0.0F, -0.1F, -7.8F);
        this.jaw3.addBox(-1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(jaw3, -0.18203784098300857F, 0.0F, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 10, 98);
        this.feet1.setRotationPoint(0.0F, 14.8F, 0.0F);
        this.feet1.addBox(-3.0F, -1.5F, -11.0F, 6, 3, 13, 0.0F);
        this.setRotateAngle(feet1, -0.091106186954104F, 0.0F, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 143, 24);
        this.head4.setRotationPoint(0.0F, -0.3F, -6.7F);
        this.head4.addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(head4, -0.136659280431156F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 88, 46);
        this.jaw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.jaw1.addBox(-4.0F, 0.0F, -10.0F, 8, 3, 10, 0.0F);
        this.underteeth1 = new AdvancedModelRendererExtended(this, 88, 60);
        this.underteeth1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.underteeth1.addBox(-2.0F, -2.0F, -6.0F, 4, 2, 6, 0.0F);
        this.arm2 = new AdvancedModelRendererExtended(this, 57, 49);
        this.arm2.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.arm2.addBox(-1.0F, 0.0F, -2.0F, 2, 8, 4, 0.0F);
        this.setRotateAngle(arm2, -0.5462880558742251F, -0.091106186954104F, -0.091106186954104F);
        this.basinosteoderme1 = new AdvancedModelRendererExtended(this, 98, 90);
        this.basinosteoderme1.setRotationPoint(-1.2F, -0.8F, -0.9F);
        this.basinosteoderme1.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 10, 0.0F);
        this.setRotateAngle(basinosteoderme1, 0.0F, 0.0F, -0.136659280431156F);
        this.body1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.body1.setRotationPoint(0.0F, -8.2F, -3.6F);
        this.body1.addBox(-6.5F, -2.0F, -7.0F, 13, 16, 14, 0.0F);
        this.setRotateAngle(body1, -0.091106186954104F, 0.0F, 0.0F);
        this.basin1 = new AdvancedModelRendererExtended(this, 0, 32);
        this.basin1.setRotationPoint(0.0F, -0.2F, 7.9F);
        this.basin1.addBox(-6.0F, -1.5F, -1.5F, 12, 14, 11, 0.0F);
        this.setRotateAngle(basin1, 0.045553093477052F, 0.0F, 0.0F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 0, 58);
        this.upperleg2.setRotationPoint(-5.9F, 4.9F, 4.4F);
        this.upperleg2.addBox(-2.5F, -1.0F, -4.0F, 5, 15, 11, 0.0F);
        this.setRotateAngle(upperleg2, -0.4553564018453205F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 160, 5);
        this.tail1.setRotationPoint(0.0F, 4.6F, 9.4F);
        this.tail1.addBox(-4.5F, -5.5F, -1.0F, 9, 11, 20, 0.0F);
        this.setRotateAngle(tail1, 0.045553093477052F, 0.0F, 0.0F);
        this.underteeth2 = new AdvancedModelRendererExtended(this, 101, 69);
        this.underteeth2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.underteeth2.addBox(-1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.osteoderms2 = new AdvancedModelRendererExtended(this, 120, 90);
        this.osteoderms2.setRotationPoint(1.6F, -1.7F, 0.0F);
        this.osteoderms2.addBox(-3.5F, -2.0F, -6.5F, 7, 2, 13, 0.0F);
        this.setRotateAngle(osteoderms2, 0.0F, 0.0F, 0.136659280431156F);
        this.chestosteoderms1 = new AdvancedModelRendererExtended(this, 72, 89);
        this.chestosteoderms1.setRotationPoint(-1.5F, -2.5F, -1.6F);
        this.chestosteoderms1.addBox(-2.5F, -2.0F, -13.0F, 5, 2, 14, 0.0F);
        this.setRotateAngle(chestosteoderms1, 0.0017453292519943296F, 0.0F, -0.136659280431156F);
        this.head2 = new AdvancedModelRendererExtended(this, 125, 25);
        this.head2.setRotationPoint(0.0F, 0.5F, -9.6F);
        this.head2.addBox(-2.5F, -2.5F, -7.0F, 5, 5, 7, 0.0F);
        this.setRotateAngle(head2, 0.136659280431156F, 0.0F, 0.0F);
        this.chestosteoderms1_1 = new AdvancedModelRendererExtended(this, 72, 89);
        this.chestosteoderms1_1.setRotationPoint(1.5F, -2.5F, -1.6F);
        this.chestosteoderms1_1.addBox(-2.5F, -2.0F, -13.0F, 5, 2, 14, 0.0F);
        this.setRotateAngle(chestosteoderms1_1, 0.0F, 0.0F, 0.136659280431156F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 35, 58);
        this.upperleg1.setRotationPoint(5.9F, 4.9F, 4.4F);
        this.upperleg1.addBox(-2.5F, -1.0F, -4.0F, 5, 15, 11, 0.0F);
        this.setRotateAngle(upperleg1, -0.4553564018453205F, 0.0F, 0.0F);
        this.tail2osteoderme1 = new AdvancedModelRendererExtended(this, 47, 98);
        this.tail2osteoderme1.setRotationPoint(0.6F, -3.7F, 0.5F);
        this.tail2osteoderme1.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 18, 0.0F);
        this.setRotateAngle(tail2osteoderme1, -0.045553093477052F, 0.0F, 0.091106186954104F);
        this.chest1 = new AdvancedModelRendererExtended(this, 54, 0);
        this.chest1.setRotationPoint(0.0F, 1.1F, -6.2F);
        this.chest1.addBox(-5.5F, -3.0F, -16.0F, 11, 16, 16, 0.0F);
        this.setRotateAngle(chest1, 0.18203784098300857F, 0.0F, 0.0F);
        this.basin1.addChild(this.basinosteoderme1_1);
        this.leg2.addChild(this.feet2);
        this.tail2.addChild(this.tail2osteoderme2);
        this.tail3.addChild(this.tail4);
        this.neck2.addChild(this.head1);
        this.head2.addChild(this.head3);
        this.arm1.addChild(this.hand1);
        this.jaw1.addChild(this.jaw2);
        this.tail1.addChild(this.tail2);
        this.head4.addChild(this.teeth2);
        this.head2.addChild(this.teeth1);
        this.upperarm1.addChild(this.arm1);
        this.chest1.addChild(this.upperarm1);
        this.chest1.addChild(this.upperarm2);
        this.neck1.addChild(this.neck2);
        this.tail1.addChild(this.tail1osteoderme1);
        this.chest1.addChild(this.neck1);
        this.arm2.addChild(this.hand2);
        this.body1.addChild(this.osteoderms1);
        this.jaw2.addChild(this.jaw4);
        this.upperleg1.addChild(this.leg1);
        this.tail1.addChild(this.tai1losteoderme2);
        this.jaw1.addChild(this.gums1);
        this.upperleg2.addChild(this.leg2);
        this.tail2.addChild(this.tail3);
        this.jaw2.addChild(this.jaw3);
        this.leg1.addChild(this.feet1);
        this.head2.addChild(this.head4);
        this.head1.addChild(this.jaw1);
        this.jaw2.addChild(this.underteeth1);
        this.upperarm2.addChild(this.arm2);
        this.basin1.addChild(this.basinosteoderme1);
        this.body1.addChild(this.basin1);
        this.basin1.addChild(this.upperleg2);
        this.basin1.addChild(this.tail1);
        this.jaw3.addChild(this.underteeth2);
        this.body1.addChild(this.osteoderms2);
        this.chest1.addChild(this.chestosteoderms1);
        this.head1.addChild(this.head2);
        this.chest1.addChild(this.chestosteoderms1_1);
        this.basin1.addChild(this.upperleg1);
        this.tail2.addChild(this.tail2osteoderme1);
        this.body1.addChild(this.chest1);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body1.render(f5 * 0.785F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.head1.rotateAngleX = (float) Math.toRadians(-14.9);
        this.jaw1.rotateAngleX = (float) Math.toRadians(42.5);
        this.chest1.offsetY = -0.06F;
        this.chest1.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.body1.offsetY = 0.30F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraPostosuchus Postosuchus = (EntityPrehistoricFloraPostosuchus) e;
        float masterSpeed = Postosuchus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head1);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head1};

        AdvancedModelRenderer[] ArmL = {this.upperarm1, this.arm1};
        AdvancedModelRenderer[] ArmR = {this.upperarm2, this.arm2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Postosuchus.getAnimation() == Postosuchus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Postosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Postosuchus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Postosuchus.getIsFast()) { //Running
                float speed = masterSpeed / 3F;
                //this.basin.offsetY = 0.75F;
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(20), 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(20), 0.5, 5, f2, 1F);


                //---
                this.walk(upperleg2, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);
                this.walk(upperleg1, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(28), f2, 1.0F);

                this.walk(leg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(leg1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(feet2, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(feet1, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                //this.walk(toes1_1, speed, -0.6F, true, 4.5F, -0.535F, f2, 1F);
                //this.walk(toes1, speed, -0.6F, true, 1.5F, -0.535F, f2, 1F);

                this.bobExtended(body1, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(leg2, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(leg1, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin1, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body1, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(upperleg2, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body1, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.body1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

                //---


                this.walk(neck1, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(neck2, speed * 4, -0.04F, false, 2.5F, 0F, f2, 0.5F);
                this.walk(head1, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 2.50F;
                //this.basin.offsetY = 0.815F;
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(10), 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(10), 0.5, 5, f2, 1F);

                this.walk(upperleg2, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(20), f2, 1.0F);
                this.walk(upperleg1, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(20), f2, 1.0F);

                this.walk(leg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(leg1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(feet2, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(feet1, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                //this.walk(toes1_1, speed, -0.6F, true, 4.5F, -0.535F, f2, 0.8F);
                //this.walk(toes1, speed, -0.6F, true, 1.5F, -0.535F, f2, 0.8F);

                this.bobExtended(body1, speed * 2F, 0.83F, false, 3.5F, f2, 1F);

                this.bobExtended(leg2, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(leg1, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin1, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body1, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(upperleg2, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body1, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck1, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(head1, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.body1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraPostosuchus e = (EntityPrehistoricFloraPostosuchus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.body1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.body1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperleg2, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(neck1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head1, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(head1, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw1, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
