package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlateosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPlateosaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended basin;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended upperleg1;
    public AdvancedModelRendererExtended upperleg2;
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended spinestail1;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tail4;
    public AdvancedModelRendererExtended shape48;
    public AdvancedModelRendererExtended tailfeathers2;
    public AdvancedModelRendererExtended spinestail2;
    public AdvancedModelRendererExtended spinestail3;
    public AdvancedModelRendererExtended spinestail4;
    public AdvancedModelRendererExtended spinestail5;
    public AdvancedModelRendererExtended spinestail6;
    public AdvancedModelRendererExtended lowerleg1;
    public AdvancedModelRendererExtended feet1;
    public AdvancedModelRendererExtended toes1;
    public AdvancedModelRendererExtended lowerleg2;
    public AdvancedModelRendererExtended feet2;
    public AdvancedModelRendererExtended toes2;
    public AdvancedModelRendererExtended chest;
    public AdvancedModelRendererExtended neck1;
    public AdvancedModelRendererExtended upperarm2;
    public AdvancedModelRendererExtended upperarm1;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended head1;
    public AdvancedModelRendererExtended spines1;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended jaw1;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended head5;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended jaw4;
    public AdvancedModelRendererExtended spines2;
    public AdvancedModelRendererExtended spines3;
    public AdvancedModelRendererExtended spines4;
    public AdvancedModelRendererExtended spines5;
    public AdvancedModelRendererExtended arms2;
    public AdvancedModelRendererExtended hands2;
    public AdvancedModelRendererExtended thumbclaw2;
    public AdvancedModelRendererExtended arms1;
    public AdvancedModelRendererExtended hands1;
    public AdvancedModelRendererExtended thumbclaw1;

    private ModelAnimator animator;

    public ModelPlateosaurus() {
        this.textureWidth = 170;
        this.textureHeight = 120;
        this.gums1 = new AdvancedModelRendererExtended(this, 136, 32);
        this.gums1.setRotationPoint(0.1F, -2.5F, -2.5F);
        this.gums1.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(gums1, -0.27314402793711257F, 0.0F, 0.0F);
        this.upperleg1 = new AdvancedModelRendererExtended(this, 42, 80);
        this.upperleg1.setRotationPoint(3.8F, 0.1F, -1.2F);
        this.upperleg1.addBox(-1.5F, -1.6F, -2.6F, 4, 13, 8, 0.0F);
        this.setRotateAngle(upperleg1, -0.5009094953223726F, 0.0F, 0.0F);
        this.upperleg2 = new AdvancedModelRendererExtended(this, 16, 80);
        this.upperleg2.setRotationPoint(-4.4F, 0.1F, -1.2F);
        this.upperleg2.addBox(-1.7F, -1.6F, -2.6F, 4, 13, 8, 0.0F);
        this.setRotateAngle(upperleg2, -0.5009094953223726F, 0.0F, 0.0F);
        this.feet2 = new AdvancedModelRendererExtended(this, 0, 94);
        this.feet2.setRotationPoint(0.1F, 9.3F, 0.0F);
        this.feet2.addBox(-1.4F, -1.25F, -1.8F, 3, 9, 4, 0.0F);
        this.setRotateAngle(feet2, -0.5918411493512771F, 0.0F, 0.0F);
        this.arms1 = new AdvancedModelRendererExtended(this, 99, 94);
        this.arms1.setRotationPoint(0.2F, 4.4F, 1.4F);
        this.arms1.addBox(-1.1F, -2.3F, -8.5F, 2, 4, 8, 0.0F);
        this.setRotateAngle(arms1, 0.6829473363053812F, 0.0F, 0.0F);
        this.tail3 = new AdvancedModelRendererExtended(this, 87, 48);
        this.tail3.setRotationPoint(0.0F, -0.4F, 17.7F);
        this.tail3.addBox(-1.9F, -1.8F, -1.2F, 4, 6, 20, 0.0F);
        this.setRotateAngle(tail3, -0.136659280431156F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 45, 1);
        this.chest.setRotationPoint(0.0F, -0.2F, -19.0F);
        this.chest.addBox(-4.0F, -4.5F, -8.0F, 8, 13, 8, 0.0F);
        this.setRotateAngle(chest, 0.045553093477052F, 0.0F, 0.0F);
        this.upperarm2 = new AdvancedModelRendererExtended(this, 77, 84);
        this.upperarm2.setRotationPoint(-4.3F, 5.5F, -5.0F);
        this.upperarm2.addBox(-1.4F, -0.9F, -2.2F, 3, 7, 4, 0.0F);
        this.setRotateAngle(upperarm2, 1.0016444577195458F, 0.0F, 0.0F);
        this.neck2 = new AdvancedModelRendererExtended(this, 91, 1);
        this.neck2.setRotationPoint(0.1F, -0.2F, -13.1F);
        this.neck2.addBox(-1.5F, -3.0F, -12.5F, 3, 6, 15, 0.0F);
        this.setRotateAngle(neck2, -0.5009094953223726F, 0.0F, 0.0F);
        this.spines1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spines1.setRotationPoint(0.5F, -2.5F, -10.5F);
        this.spines1.addBox(-0.5F, -2.6F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spines1, -0.045553093477052F, 0.0F, 0.0F);
        this.spines2 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spines2.setRotationPoint(0.0F, -1.3F, 1.5F);
        this.spines2.addBox(-0.5F, -2.2F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spines2, -0.136659280431156F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 54, 38);
        this.tail2.setRotationPoint(0.0F, -2.1F, 13.3F);
        this.tail2.addBox(-2.4F, -2.5F, -1.7F, 5, 9, 20, 0.0F);
        this.setRotateAngle(tail2, -0.045553093477052F, 0.0F, 0.0F);
        this.shape48 = new AdvancedModelRendererExtended(this, 117, 91);
        this.shape48.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.shape48.addBox(-2.0F, 0.0F, -1.2F, 4, 4, 20, 0.0F);
        this.spinestail1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spinestail1.setRotationPoint(0.7F, -4.3F, 0.0F);
        this.spinestail1.addBox(-0.5F, -2.7F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spinestail1, -0.045553093477052F, 0.0F, 0.0F);
        this.head1 = new AdvancedModelRendererExtended(this, 131, 2);
        this.head1.setRotationPoint(0.0F, -1.3F, -12.6F);
        this.head1.addBox(-2.0F, -1.3F, -3.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(head1, 0.7740535232594852F, 0.0F, 0.0F);
        this.spinestail6 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spinestail6.setRotationPoint(0.0F, 0.0F, 2.2F);
        this.spinestail6.addBox(-0.5F, -2.5F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spinestail6, -0.091106186954104F, 0.0F, 0.0F);
        this.spines3 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spines3.setRotationPoint(0.0F, -0.6F, 1.6F);
        this.spines3.addBox(-0.5F, -2.2F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spines3, -0.091106186954104F, 0.0F, 0.0F);
        this.feet1 = new AdvancedModelRendererExtended(this, 0, 94);
        this.feet1.setRotationPoint(0.3F, 9.3F, 0.0F);
        this.feet1.addBox(-1.4F, -1.25F, -1.8F, 3, 9, 4, 0.0F);
        this.setRotateAngle(feet1, -0.5918411493512771F, 0.0F, 0.0F);
        this.head5 = new AdvancedModelRendererExtended(this, 131, 23);
        this.head5.setRotationPoint(0.0F, 0.4F, -4.0F);
        this.head5.addBox(-1.0F, -1.8F, -2.1F, 2, 2, 3, 0.0F);
        this.setRotateAngle(head5, 0.091106186954104F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 2, 3);
        this.body.setRotationPoint(0.0F, -0.1F, -5.1F);
        this.body.addBox(-5.0F, -5.2F, -20.0F, 10, 15, 21, 0.0F);
        this.setRotateAngle(body, 0.045553093477052F, 0.0F, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 114, 38);
        this.head4.setRotationPoint(0.0F, -0.2F, -3.7F);
        this.head4.addBox(-0.4F, -0.5F, -3.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(head4, 0.7285004297824331F, 0.0F, 0.0F);
        this.jaw1 = new AdvancedModelRendererExtended(this, 150, 2);
        this.jaw1.setRotationPoint(-0.1F, 1.7F, 0.6F);
        this.jaw1.addBox(-1.9F, 0.0F, -3.6F, 4, 2, 4, 0.0F);
        this.arms2 = new AdvancedModelRendererExtended(this, 77, 97);
        this.arms2.setRotationPoint(0.2F, 4.4F, 1.4F);
        this.arms2.addBox(-1.1F, -2.3F, -8.5F, 2, 4, 8, 0.0F);
        this.setRotateAngle(arms2, 0.6829473363053812F, 0.0F, 0.0F);
        this.hands1 = new AdvancedModelRendererExtended(this, 102, 107);
        this.hands1.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.hands1.addBox(-0.7F, -1.7F, -4.4F, 1, 4, 5, 0.0F);
        this.spinestail5 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spinestail5.setRotationPoint(0.0F, 0.1F, 2.2F);
        this.spinestail5.addBox(-0.5F, -2.5F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spinestail5, -0.091106186954104F, 0.0F, 0.0F);
        this.hands2 = new AdvancedModelRendererExtended(this, 77, 110);
        this.hands2.setRotationPoint(0.0F, -0.5F, -9.0F);
        this.hands2.addBox(-0.7F, -1.7F, -4.4F, 1, 4, 5, 0.0F);
        this.jaw4 = new AdvancedModelRendererExtended(this, 154, 21);
        this.jaw4.setRotationPoint(0.1F, 1.1F, 1.4F);
        this.jaw4.addBox(-1.0F, -0.4F, -3.7F, 2, 1, 5, 0.0F);
        this.setRotateAngle(jaw4, -0.18203784098300857F, 0.0F, 0.0F);
        this.spinestail3 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spinestail3.setRotationPoint(0.0F, -1.0F, 2.5F);
        this.spinestail3.addBox(-0.5F, -2.2F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spinestail3, -0.091106186954104F, 0.0F, 0.0F);
        this.spines5 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spines5.setRotationPoint(0.0F, 0.5F, 1.6F);
        this.spines5.addBox(-0.5F, -2.2F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spines5, -0.091106186954104F, 0.0F, 0.0F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 150, 12);
        this.jaw2.setRotationPoint(0.0F, 0.1F, -4.9F);
        this.jaw2.addBox(-1.4F, -0.1F, -2.2F, 3, 1, 4, 0.0F);
        this.setRotateAngle(jaw2, -0.045553093477052F, 0.0F, 0.0F);
        this.tailfeathers2 = new AdvancedModelRendererExtended(this, 134, 68);
        this.tailfeathers2.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.tailfeathers2.addBox(-1.5F, 0.0F, -0.7F, 3, 5, 13, 0.0F);
        this.head2 = new AdvancedModelRendererExtended(this, 114, 26);
        this.head2.setRotationPoint(-0.1F, -0.5F, -3.0F);
        this.head2.addBox(-0.9F, -0.7F, -3.9F, 2, 3, 5, 0.0F);
        this.setRotateAngle(head2, -0.18203784098300857F, 0.0F, 0.0F);
        this.lowerleg1 = new AdvancedModelRendererExtended(this, 49, 103);
        this.lowerleg1.setRotationPoint(0.0F, 10.0F, 0.6F);
        this.lowerleg1.addBox(-1.7F, -2.0F, -2.5F, 4, 12, 5, 0.0F);
        this.setRotateAngle(lowerleg1, 0.9105382707654417F, 0.0F, 0.0F);
        this.tail4 = new AdvancedModelRendererExtended(this, 117, 49);
        this.tail4.setRotationPoint(0.0F, 0.4F, 18.4F);
        this.tail4.addBox(-1.4F, -1.6F, -0.7F, 3, 4, 13, 0.0F);
        this.setRotateAngle(tail4, -0.136659280431156F, 0.0F, 0.0F);
        this.upperarm1 = new AdvancedModelRendererExtended(this, 93, 83);
        this.upperarm1.setRotationPoint(4.2F, 5.5F, -5.0F);
        this.upperarm1.addBox(-1.4F, -0.9F, -2.2F, 3, 7, 4, 0.0F);
        this.setRotateAngle(upperarm1, 1.0016444577195458F, 0.0F, 0.0F);
        this.lowerleg2 = new AdvancedModelRendererExtended(this, 26, 103);
        this.lowerleg2.setRotationPoint(0.2F, 10.0F, 0.6F);
        this.lowerleg2.addBox(-1.7F, -2.0F, -2.5F, 4, 12, 5, 0.0F);
        this.setRotateAngle(lowerleg2, 0.9105382707654417F, 0.0F, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 23, 52);
        this.tail1.setRotationPoint(0.0F, 0.3F, 3.6F);
        this.tail1.addBox(-2.9F, -4.8F, -1.1F, 6, 11, 16, 0.0F);
        this.spines4 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spines4.setRotationPoint(0.0F, 0.3F, 1.5F);
        this.spines4.addBox(-0.5F, -2.2F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spines4, -0.136659280431156F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 66, 9);
        this.neck1.setRotationPoint(0.0F, -0.7F, -4.1F);
        this.neck1.addBox(-1.9F, -3.4F, -11.9F, 4, 7, 15, 0.0F);
        this.setRotateAngle(neck1, -0.136659280431156F, 0.0F, 0.0F);
        this.head3 = new AdvancedModelRendererExtended(this, 131, 13);
        this.head3.setRotationPoint(0.0F, 1.0F, -3.4F);
        this.head3.addBox(-1.4F, -1.3F, -4.0F, 3, 2, 5, 0.0F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 154, 32);
        this.jaw3.setRotationPoint(0.1F, 0.25F, -2.8F);
        this.jaw3.addBox(-1.0F, -0.3F, -2.3F, 2, 1, 3, 0.0F);
        this.setRotateAngle(jaw3, 0.091106186954104F, 0.0F, 0.0F);
        this.toes2 = new AdvancedModelRendererExtended(this, 0, 109);
        this.toes2.setRotationPoint(0.0F, 6.1F, 0.0F);
        this.toes2.addBox(-1.9F, -1.3F, -5.8F, 4, 3, 8, 0.0F);
        this.setRotateAngle(toes2, 0.22759093446006054F, 0.0F, 0.0F);
        this.thumbclaw1 = new AdvancedModelRendererExtended(this, 113, 115);
        this.thumbclaw1.setRotationPoint(-0.3F, -1.6F, -0.9F);
        this.thumbclaw1.addBox(-0.5F, -0.6F, -2.6F, 1, 2, 3, 0.0F);
        this.setRotateAngle(thumbclaw1, -0.7740535232594852F, 0.0F, 0.0F);
        this.spinestail4 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spinestail4.setRotationPoint(0.0F, -0.5F, 2.4F);
        this.spinestail4.addBox(-0.5F, -2.2F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spinestail4, -0.136659280431156F, 0.0F, 0.0F);
        this.basin = new AdvancedModelRendererExtended(this, 4, 44);
        this.basin.setRotationPoint(0.1F, -1.3F, 6.6F);
        this.basin.addBox(-3.4F, -4.8F, -5.3F, 7, 14, 9, 0.0F);
        this.setRotateAngle(basin, -0.045553093477052F, 0.0F, 0.0F);
        this.toes1 = new AdvancedModelRendererExtended(this, 0, 109);
        this.toes1.setRotationPoint(0.0F, 6.1F, 0.0F);
        this.toes1.addBox(-1.9F, -1.3F, -5.8F, 4, 3, 8, 0.0F);
        this.setRotateAngle(toes1, 0.22759093446006054F, 0.0F, 0.0F);
        this.thumbclaw2 = new AdvancedModelRendererExtended(this, 92, 114);
        this.thumbclaw2.setRotationPoint(0.0F, -1.6F, -0.9F);
        this.thumbclaw2.addBox(-0.5F, -0.6F, -2.6F, 1, 2, 3, 0.0F);
        this.setRotateAngle(thumbclaw2, -0.7740535232594852F, 0.0F, 0.0F);
        this.spinestail2 = new AdvancedModelRendererExtended(this, 0, 0);
        this.spinestail2.setRotationPoint(0.0F, -1.0F, 2.2F);
        this.spinestail2.addBox(-0.5F, -2.4F, -0.6F, 0, 4, 1, 0.0F);
        this.setRotateAngle(spinestail2, -0.091106186954104F, 0.0F, 0.0F);
        this.jaw1.addChild(this.gums1);
        this.basin.addChild(this.upperleg1);
        this.basin.addChild(this.upperleg2);
        this.lowerleg2.addChild(this.feet2);
        this.upperarm1.addChild(this.arms1);
        this.tail2.addChild(this.tail3);
        this.body.addChild(this.chest);
        this.chest.addChild(this.upperarm2);
        this.neck1.addChild(this.neck2);
        this.neck2.addChild(this.spines1);
        this.spines1.addChild(this.spines2);
        this.tail1.addChild(this.tail2);
        this.tail3.addChild(this.shape48);
        this.tail1.addChild(this.spinestail1);
        this.neck2.addChild(this.head1);
        this.spinestail5.addChild(this.spinestail6);
        this.spines2.addChild(this.spines3);
        this.lowerleg1.addChild(this.feet1);
        this.head3.addChild(this.head5);
        this.basin.addChild(this.body);
        this.head2.addChild(this.head4);
        this.head1.addChild(this.jaw1);
        this.upperarm2.addChild(this.arms2);
        this.arms1.addChild(this.hands1);
        this.spinestail4.addChild(this.spinestail5);
        this.arms2.addChild(this.hands2);
        this.jaw2.addChild(this.jaw4);
        this.spinestail2.addChild(this.spinestail3);
        this.spines4.addChild(this.spines5);
        this.jaw1.addChild(this.jaw2);
        this.tail4.addChild(this.tailfeathers2);
        this.head1.addChild(this.head2);
        this.upperleg1.addChild(this.lowerleg1);
        this.tail3.addChild(this.tail4);
        this.chest.addChild(this.upperarm1);
        this.upperleg2.addChild(this.lowerleg2);
        this.basin.addChild(this.tail1);
        this.spines3.addChild(this.spines4);
        this.chest.addChild(this.neck1);
        this.head1.addChild(this.head3);
        this.jaw2.addChild(this.jaw3);
        this.feet2.addChild(this.toes2);
        this.hands1.addChild(this.thumbclaw1);
        this.spinestail3.addChild(this.spinestail4);
        this.feet1.addChild(this.toes1);
        this.hands2.addChild(this.thumbclaw2);
        this.spinestail1.addChild(this.spinestail2);
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.basin.render(f5 * 1.15f);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.neck1.rotateAngleX = (float) Math.toRadians(10);
        this.neck2.rotateAngleX = (float) Math.toRadians(-27);
        this.head1.rotateAngleX = (float) Math.toRadians(20);
        this.jaw1.rotateAngleX = (float) Math.toRadians(35);
        this.arms1.rotateAngleX = (float) Math.toRadians(20);
        this.arms2.rotateAngleX = (float) Math.toRadians(20);
        this.chest.render(0.01F);
        GlStateManager.enableCull();
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
        this.basin.offsetY = -0.2F;
        this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraPlateosaurus Plateosaurus = (EntityPrehistoricFloraPlateosaurus) e;
        float masterSpeed = Plateosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 6, neck1);
        this.faceTarget(f3, f4, 6, neck2);
        this.faceTarget(f3, f4, 6, head1);

        //float speed = 0.2F;


        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head1};

        AdvancedModelRenderer[] ArmL = {this.upperarm1, this.arms1};
        AdvancedModelRenderer[] ArmR = {this.upperarm2, this.arms2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Plateosaurus.getAnimation() == Plateosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Plateosaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Plateosaurus.getIsMoving() || Plateosaurus.getAnimation() == Plateosaurus.STAND_ANIMATION) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.2F * 0.6F), 0.075F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.2F * 0.6F) * 2F, 0.0325F, 0.12F, f2, 1F);
                if (Plateosaurus.getAnimation() != Plateosaurus.DRINK_ANIMATION) {
                    this.chainWaveExtended(ArmL, 0.25F, 0.02F, 1.5, 8, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.25F, 0.02F, 1.5, 5, f2, 1F);
                }
                //if (Plateosaurus.getAnimation() == Plateosaurus.STAND_ANIMATION) {
                    this.walk(body, 0.25F, 0.007F, false, 2.5F, 0, f2, 0.8F);
                    this.walk(chest, 0.25F, 0.015F, false, 2.5F, 0, f2, 0.8F);
                //}
                return;
           }

            if (Plateosaurus.getIsFast() && Plateosaurus.getAnimation() != Plateosaurus.STAND_ANIMATION) { //Running
                float speed = masterSpeed / 2.5F;
                this.basin.offsetY = -0.25F;
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(hands1, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(hands2, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(upperleg1, speed, 0.60F, true, 8, 0.55F, f2, 1F);
                this.walk(upperleg2, speed, 0.60F, true, 5, 0.55F, f2, 1F);

                this.walk(lowerleg1, speed, 0.60F, true, 6.5F, -0.7F, f2, 1F);
                this.walk(lowerleg2, speed, 0.60F, true, 3.5F, -0.7F, f2, 1F);

                this.walk(feet1, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(feet2, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(toes1, speed, 0.85F, true, 7.5F, -0.2F, f2, 1F);
                this.walk(toes2, speed, 0.85F, true, 4.5F, -0.2F, f2, 1F);

                this.bobExtended(basin, speed * 2F, 0.5F, false, 2.5F, f2, 1F);

                this.flap(basin, speed, 0.12F, false, 5.0F, 0.06F, f2, 1.0F);
                this.flap(body, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(chest, speed, -0.08F, false, 5.0F, -0.04F, f2, 1.0F);
                this.flap(neck1, speed, 0.08F, false, 5.0F, 0.04F, f2, 1.0F);

                this.flap(upperleg1, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);
                this.flap(upperleg2, speed, -0.12F, false, 5.0F, -0.06F, f2, 1.0F);

                this.walk(body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck1, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head1, speed * 2, 0.4F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

                this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(1.2), false, 1.5F, f2, 1) + 0.2F;
            }
            else if (Plateosaurus.getAnimation() != Plateosaurus.STAND_ANIMATION) { //Walking
                float speed = masterSpeed / 2.00F;
                this.basin.offsetY = -0.15F;
                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 3, f2, 1.5F);
                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.625), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, 0.10F, 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, 0.10F, 0.5, 5, f2, 1F);
                this.walk(hands1, speed, 0.10F, true, 5, 0F, f2, 1F);
                this.walk(hands2, speed, 0.10F, true, 2, 0F, f2, 1F);

                this.walk(upperleg1, speed, 0.40F, true, 8, 0.35F, f2, 1F);
                this.walk(upperleg2, speed, 0.40F, true, 5, 0.35F, f2, 1F);

                this.walk(lowerleg1, speed, 0.30F, true, 6.5F, 0F, f2, 1F);
                this.walk(lowerleg2, speed, 0.30F, true, 3.5F, 0F, f2, 1F);

                this.bobExtended(lowerleg1, speed, 1.5F, false, 7.0F, f2, 1F);
                this.bobExtended(lowerleg2, speed, 1.5F, false, 4.0F, f2, 1F);

                this.walk(feet1, speed, 0.25F, true, 4, -0.18F, f2, 1F);
                this.walk(feet2, speed, 0.25F, true, 1, -0.18F, f2, 1F);

                this.walk(toes1, speed, 0.5F, true, 5.0F, -0.25F, f2, 1F);
                this.walk(toes2, speed, 0.5F, true, 2.0F, -0.25F, f2, 1F);

                this.bobExtended(basin, speed * 2F, 0.25F, false, 3.5F, f2, 1F);

                this.flap(basin, speed, 0.22F, false, 6.0F, 0.06F, f2, 1.0F);
                this.flap(body, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(chest, speed, -0.12F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(neck1, speed, 0.12F, false, 6.0F, 0.04F, f2, 1.0F);

                this.flap(upperleg1, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);
                this.flap(upperleg2, speed, -0.22F, false, 6.0F, -0.06F, f2, 1.0F);

                this.walk(body, speed * 2, 0.015F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest, speed * 2, 0.04F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck1, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(neck2, speed * 2, -0.2F * 0.75F, false, 2.5F, 0F, f2, 0.8F);
                this.walk(head1, speed * 2, 0.4F * 0.75F, false, 2.5F, 0F, f2, 0.8F);

                this.chainFlap(Tail, (speed * 0.6F), 0.20F * 0.75F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 2F, 0.10F * 0.75F, 0.12F, f2, 1F);

                this.basin.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.8), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraPlateosaurus e = (EntityPrehistoricFloraPlateosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(6), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.basin, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(5);
        animator.rotate(this.basin, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(-8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.STAND_ANIMATION); //220 ticks!
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        //Swing1
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(20), (float) Math.toRadians(20));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Swing2
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(15), (float) Math.toRadians(30));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(0), (float) Math.toRadians(15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        //SwingB1
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(-20), (float) Math.toRadians(-20));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(-20), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //SwingB2
        animator.startKeyframe(10);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(-15), (float) Math.toRadians(-30));
        animator.rotate(this.head1, (float) Math.toRadians(-20), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(0), (float) Math.toRadians(-15), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail4, (float) Math.toRadians(15.65 + 7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail3, (float) Math.toRadians(7.83), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail2, (float) Math.toRadians(2.61 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.tail1, (float) Math.toRadians(5.22), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(-28.7 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 - 13.04), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(20);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.neck1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(10);
        animator.move(this.neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck1, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(5);

        animator.setAnimation(e.DRINK_ANIMATION); //160 ticks
        //Back to centre
        animator.startKeyframe(20);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Swing1
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Swing2
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //SwingB1
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //SwingB2
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(-10), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        //Back to centre
        animator.startKeyframe(10);
        animator.rotate(this.tail1, (float) Math.toRadians(-10.43), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.basin, (float) Math.toRadians(5.22 + 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg1, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperleg2, (float) Math.toRadians(28.7 - 36.52), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm1, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperarm2, (float) Math.toRadians(18.26 - 57.39), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.arms2, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(5.22 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.chest, (float) Math.toRadians(-7.83 - 2.61), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck1, (float) Math.toRadians(7.83 + 12.26 - 8), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck2, (float) Math.toRadians(28.70 + 23.48), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head1, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

    }
}
