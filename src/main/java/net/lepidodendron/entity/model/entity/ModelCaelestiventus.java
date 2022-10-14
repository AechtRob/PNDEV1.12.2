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

public class ModelCaelestiventus extends AdvancedModelBaseExtended {
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
    public AdvancedModelRendererExtended tail6;
    public AdvancedModelRendererExtended lowerlegR;
    public AdvancedModelRendererExtended legwing11;
    public AdvancedModelRendererExtended footR;
    public AdvancedModelRendererExtended legwing12;
    public AdvancedModelRendererExtended lowerlegL;
    public AdvancedModelRendererExtended legwing21;
    public AdvancedModelRendererExtended footL;
    public AdvancedModelRendererExtended legwing22;
    public AdvancedModelRendererExtended neck2;
    public AdvancedModelRendererExtended underneck2;
    public AdvancedModelRendererExtended underneck1;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended head2;
    public AdvancedModelRendererExtended jaw;
    public AdvancedModelRendererExtended head6;
    public AdvancedModelRendererExtended head3;
    public AdvancedModelRendererExtended head4;
    public AdvancedModelRendererExtended teeth2;
    public AdvancedModelRendererExtended teeth1;
    public AdvancedModelRendererExtended head5;
    public AdvancedModelRendererExtended frontteeth1;
    public AdvancedModelRendererExtended frontteeth2;
    public AdvancedModelRendererExtended jaw2;
    public AdvancedModelRendererExtended gums1;
    public AdvancedModelRendererExtended underjaw1;
    public AdvancedModelRendererExtended jaw3;
    public AdvancedModelRendererExtended jaw4;
    public AdvancedModelRendererExtended lowerteeth1;
    public AdvancedModelRendererExtended lowerteeth2;
    public AdvancedModelRendererExtended lowerfrontteeth1;
    public AdvancedModelRendererExtended lowerfrontteeth2;
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

    public ModelCaelestiventus() {
        this.textureWidth = 115;
        this.textureHeight = 120;
        this.legwing11 = new AdvancedModelRendererExtended(this, 0, 47);
        this.legwing11.setRotationPoint(-0.1F, 0.9F, 1.0F);
        this.legwing11.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
        this.teeth2 = new AdvancedModelRendererExtended(this, 13, 0);
        this.teeth2.setRotationPoint(0.6F, 0.7F, -1.9F);
        this.teeth2.addBox(-0.5F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(teeth2, 0.0F, 0.0F, -0.4553564018453205F);
        this.lowerfrontteeth2 = new AdvancedModelRendererExtended(this, 14, 9);
        this.lowerfrontteeth2.setRotationPoint(0.3F, -0.7F, 1.0F);
        this.lowerfrontteeth2.addBox(-0.5F, -3.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(lowerfrontteeth2, 0.0F, 0.0F, 0.4553564018453205F);
        this.head = new AdvancedModelRendererExtended(this, 80, 21);
        this.head.setRotationPoint(0.0F, -0.4F, -4.5F);
        this.head.addBox(-2.0F, -3.0F, -7.0F, 4, 6, 7, 0.0F);
        this.setRotateAngle(head, 0.6829473363053812F, 0.0F, 0.0F);
        this.wing1R = new AdvancedModelRendererExtended(this, 0, 46);
        this.wing1R.setRotationPoint(-0.2F, -1.7F, -2.4F);
        this.wing1R.addBox(-10.0F, -1.0F, 0.0F, 10, 2, 14, 0.0F);
        this.setRotateAngle(wing1R, 0.0F, -0.18203784098300857F, -0.18203784098300857F);
        this.legwing12 = new AdvancedModelRendererExtended(this, 7, 50);
        this.legwing12.setRotationPoint(0.0F, 0.8F, 1.2F);
        this.legwing12.addBox(0.0F, 0.0F, 0.0F, 0, 7, 2, 0.0F);
        this.setRotateAngle(legwing12, -0.136659280431156F, 0.31869712141416456F, 0.0F);
        this.wing2L = new AdvancedModelRendererExtended(this, 62, 65);
        this.wing2L.setRotationPoint(9.3F, -0.4F, 0.3F);
        this.wing2L.addBox(-0.5F, 0.0F, 0.0F, 1, 13, 12, 0.0F);
        this.setRotateAngle(wing2L, 0.0F, 0.0F, -0.40980330836826856F);
        this.jaw2 = new AdvancedModelRendererExtended(this, 76, 53);
        this.jaw2.setRotationPoint(0.0F, 0.2F, -5.7F);
        this.jaw2.addBox(-1.5F, -0.3F, -8.0F, 3, 1, 7, 0.0F);
        this.setRotateAngle(jaw2, 0.136659280431156F, 0.0F, 0.0F);
        this.upperlegL = new AdvancedModelRendererExtended(this, 0, 26);
        this.upperlegL.setRotationPoint(1.7F, -0.9F, 6.4F);
        this.upperlegL.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperlegL, 0.136659280431156F, 0.0F, -0.4553564018453205F);
        this.jaw4 = new AdvancedModelRendererExtended(this, 88, 52);
        this.jaw4.setRotationPoint(0.0F, 0.6F, -11.0F);
        this.jaw4.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 10, 0.0F);
        this.head5 = new AdvancedModelRendererExtended(this, 96, 16);
        this.head5.setRotationPoint(-0.1F, -4.4F, -0.29F);
        this.head5.addBox(-0.4F, -2.3F, 0.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(head5, -2.6089181658811236F, 0.0F, 0.0F);
        this.underneck1 = new AdvancedModelRendererExtended(this, 48, 35);
        this.underneck1.setRotationPoint(0.0F, 3.2F, 0.4F);
        this.underneck1.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(underneck1, 0.27314402793711257F, 0.0F, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 32, 15);
        this.tail2.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.tail2.addBox(-1.0F, -1.0F, -0.2F, 2, 2, 9, 0.0F);
        this.setRotateAngle(tail2, 0.091106186954104F, 0.0F, 0.0F);
        this.tail4 = new AdvancedModelRendererExtended(this, 6, 27);
        this.tail4.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail4, 0.045553093477052F, 0.0F, 0.0F);
        this.footR = new AdvancedModelRendererExtended(this, 0, 17);
        this.footR.setRotationPoint(0.0F, 7.7F, 0.0F);
        this.footR.addBox(-1.0F, -0.5F, -6.0F, 2, 1, 7, 0.0F);
        this.setRotateAngle(footR, -0.7285004297824331F, 0.0F, -0.091106186954104F);
        this.legwing22 = new AdvancedModelRendererExtended(this, 7, 50);
        this.legwing22.setRotationPoint(0.0F, 0.8F, 1.2F);
        this.legwing22.addBox(0.0F, 0.0F, 0.0F, 0, 7, 2, 0.0F);
        this.setRotateAngle(legwing22, -0.136659280431156F, -0.36425021489121656F, 0.0F);
        this.legwing21 = new AdvancedModelRendererExtended(this, 0, 47);
        this.legwing21.setRotationPoint(-0.1F, 0.9F, 1.0F);
        this.legwing21.addBox(-0.5F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
        this.tail5 = new AdvancedModelRendererExtended(this, 21, 18);
        this.tail5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.tail5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail5, 0.045553093477052F, 0.0F, 0.0F);
        this.wing2R = new AdvancedModelRendererExtended(this, 47, 51);
        this.wing2R.setRotationPoint(-9.3F, -0.4F, 0.3F);
        this.wing2R.addBox(-0.5F, 0.0F, 0.0F, 1, 13, 12, 0.0F);
        this.setRotateAngle(wing2R, 0.0F, 0.0F, 0.40980330836826856F);
        this.head2 = new AdvancedModelRendererExtended(this, 65, 28);
        this.head2.setRotationPoint(0.0F, 1.4F, -6.7F);
        this.head2.addBox(-1.5F, -2.5F, -7.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(head2, 0.136659280431156F, 0.0F, 0.0F);
        this.wing4R = new AdvancedModelRendererExtended(this, 35, 87);
        this.wing4R.setRotationPoint(0.1F, 0.0F, 12.8F);
        this.wing4R.addBox(-0.5F, -9.0F, 0.0F, 1, 9, 24, 0.0F);
        this.setRotateAngle(wing4R, 1.2292353921796064F, 0.0F, 0.0F);
        this.upperlegR = new AdvancedModelRendererExtended(this, 0, 26);
        this.upperlegR.setRotationPoint(-1.7F, -0.9F, 6.4F);
        this.upperlegR.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(upperlegR, 0.136659280431156F, 0.0F, 0.4553564018453205F);
        this.tail3 = new AdvancedModelRendererExtended(this, 18, 30);
        this.tail3.setRotationPoint(0.0F, 0.0F, 8.4F);
        this.tail3.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F);
        this.setRotateAngle(tail3, 0.045553093477052F, 0.0F, 0.0F);
        this.lowerlegL = new AdvancedModelRendererExtended(this, 0, 36);
        this.lowerlegL.setRotationPoint(0.3F, 5.7F, -0.4F);
        this.lowerlegL.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 2, 0.0F);
        this.setRotateAngle(lowerlegL, 0.9105382707654417F, 0.0F, 0.36425021489121656F);
        this.gums1 = new AdvancedModelRendererExtended(this, 76, 43);
        this.gums1.setRotationPoint(0.0F, -1.0F, -2.8F);
        this.gums1.addBox(-1.5F, -3.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(gums1, -0.22759093446006054F, 0.0F, 0.0F);
        this.neck1 = new AdvancedModelRendererExtended(this, 68, 16);
        this.neck1.setRotationPoint(0.0F, -0.4F, -1.8F);
        this.neck1.addBox(-2.0F, -2.5F, -5.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(neck1, -0.18203784098300857F, 0.0F, 0.0F);
        this.lowerteeth1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.lowerteeth1.setRotationPoint(-0.6F, 0.3F, -1.7F);
        this.lowerteeth1.addBox(-0.5F, -2.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(lowerteeth1, 0.0F, 0.0F, -0.4553564018453205F);
        this.neck2 = new AdvancedModelRendererExtended(this, 82, 8);
        this.neck2.setRotationPoint(0.0F, -0.2F, -4.2F);
        this.neck2.addBox(-1.5F, -2.5F, -6.0F, 3, 6, 6, 0.0F);
        this.setRotateAngle(neck2, -0.31869712141416456F, 0.0F, 0.0F);
        this.teeth1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.teeth1.setRotationPoint(-0.6F, 0.7F, -1.8F);
        this.teeth1.addBox(-0.5F, -0.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(teeth1, 0.0F, 0.0F, 0.4553564018453205F);
        this.jaw3 = new AdvancedModelRendererExtended(this, 102, 57);
        this.jaw3.setRotationPoint(0.0F, 0.6F, -7.4F);
        this.jaw3.addBox(-1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(jaw3, 0.136659280431156F, 0.0F, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 46, 7);
        this.body.setRotationPoint(0.1F, -0.3F, 3.4F);
        this.body.addBox(-2.5F, -2.6F, 0.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(body, -0.18203784098300857F, 0.0F, 0.0F);
        this.head6 = new AdvancedModelRendererExtended(this, 56, 29);
        this.head6.setRotationPoint(0.0F, -2.5F, -2.1F);
        this.head6.addBox(-1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(head6, -0.047472955654245766F, 0.0F, 0.0F);
        this.chest = new AdvancedModelRendererExtended(this, 25, 0);
        this.chest.setRotationPoint(0.3F, 11.7F, -4.6F);
        this.chest.addBox(-3.5F, -3.0F, -2.6F, 7, 7, 7, 0.0F);
        this.setRotateAngle(chest, -0.136659280431156F, 0.0F, 0.0F);
        this.head4 = new AdvancedModelRendererExtended(this, 95, 27);
        this.head4.setRotationPoint(0.0F, -4.3F, 0.2F);
        this.head4.addBox(-1.0F, 0.0F, -7.0F, 2, 3, 7, 0.0F);
        this.setRotateAngle(head4, 0.045553093477052F, 0.0F, -0.013962634015954637F);
        this.head3 = new AdvancedModelRendererExtended(this, 84, 36);
        this.head3.setRotationPoint(0.0F, 0.3F, -6.1F);
        this.head3.addBox(-1.0F, -1.5F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(head3, 0.136659280431156F, 0.0F, 0.0F);
        this.frontteeth2 = new AdvancedModelRendererExtended(this, 14, 9);
        this.frontteeth2.setRotationPoint(0.1F, 0.0F, -0.7F);
        this.frontteeth2.addBox(-0.5F, -0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(frontteeth2, 0.0F, 0.0F, -0.4553564018453205F);
        this.lowerteeth2 = new AdvancedModelRendererExtended(this, 13, 0);
        this.lowerteeth2.setRotationPoint(0.6F, 0.3F, -1.7F);
        this.lowerteeth2.addBox(-0.5F, -2.0F, -5.0F, 1, 2, 5, 0.0F);
        this.setRotateAngle(lowerteeth2, 0.0F, 0.0F, 0.4553564018453205F);
        this.wing3R = new AdvancedModelRendererExtended(this, 30, 87);
        this.wing3R.setRotationPoint(-0.1F, 13.0F, 0.3F);
        this.wing3R.addBox(-0.5F, -10.0F, 0.0F, 1, 10, 13, 0.0F);
        this.setRotateAngle(wing3R, 0.0F, 0.0F, -0.091106186954104F);
        this.lowerfrontteeth1 = new AdvancedModelRendererExtended(this, 3, 9);
        this.lowerfrontteeth1.setRotationPoint(-0.3F, -0.7F, 1.0F);
        this.lowerfrontteeth1.addBox(-0.5F, -3.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(lowerfrontteeth1, 0.0F, 0.0F, -0.4553564018453205F);
        this.wing4L = new AdvancedModelRendererExtended(this, 65, 67);
        this.wing4L.setRotationPoint(-0.1F, 0.0F, 12.8F);
        this.wing4L.addBox(-0.5F, -9.0F, 0.0F, 1, 9, 24, 0.0F);
        this.setRotateAngle(wing4L, 1.2292353921796064F, 0.0F, 0.0F);
        this.lowerlegR = new AdvancedModelRendererExtended(this, 0, 36);
        this.lowerlegR.setRotationPoint(-0.3F, 5.7F, -0.4F);
        this.lowerlegR.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 2, 0.0F);
        this.setRotateAngle(lowerlegR, 0.9105382707654417F, 0.0F, -0.36425021489121656F);
        this.jaw = new AdvancedModelRendererExtended(this, 61, 51);
        this.jaw.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.jaw.addBox(-2.0F, 0.0F, -7.0F, 4, 2, 7, 0.0F);
        this.wing3L = new AdvancedModelRendererExtended(this, 0, 80);
        this.wing3L.setRotationPoint(0.1F, 13.0F, 0.3F);
        this.wing3L.addBox(-0.5F, -10.0F, 0.0F, 1, 10, 13, 0.0F);
        this.setRotateAngle(wing3L, 0.0F, 0.0F, 0.091106186954104F);
        this.tail1 = new AdvancedModelRendererExtended(this, 65, 3);
        this.tail1.setRotationPoint(0.0F, -0.3F, 7.4F);
        this.tail1.addBox(-1.5F, -2.1F, 0.0F, 3, 3, 7, 0.0F);
        this.setRotateAngle(tail1, 0.136659280431156F, 0.0F, 0.0F);
        this.handL = new AdvancedModelRendererExtended(this, 29, 81);
        this.handL.setRotationPoint(-0.1F, 0.4F, 0.0F);
        this.handL.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handL, 0.18203784098300857F, 0.18203784098300857F, 0.136659280431156F);
        this.tail6 = new AdvancedModelRendererExtended(this, 19, 14);
        this.tail6.setRotationPoint(0.0F, 0.1F, 8.8F);
        this.tail6.addBox(0.0F, -3.0F, 0.0F, 0, 6, 5, 0.0F);
        this.footL = new AdvancedModelRendererExtended(this, 0, 17);
        this.footL.setRotationPoint(0.0F, 7.7F, 0.0F);
        this.footL.addBox(-1.0F, -0.5F, -6.0F, 2, 1, 7, 0.0F);
        this.setRotateAngle(footL, -0.7285004297824331F, 0.0F, 0.091106186954104F);
        this.underneck2 = new AdvancedModelRendererExtended(this, 39, 27);
        this.underneck2.setRotationPoint(0.0F, 2.7F, -0.1F);
        this.underneck2.addBox(-1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F);
        this.setRotateAngle(underneck2, 0.091106186954104F, 0.0F, 0.0F);
        this.handR = new AdvancedModelRendererExtended(this, 29, 86);
        this.handR.setRotationPoint(-0.1F, 0.4F, 0.0F);
        this.handR.addBox(-1.5F, -0.5F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(handR, 0.136659280431156F, -0.18203784098300857F, -0.136659280431156F);
        this.frontteeth1 = new AdvancedModelRendererExtended(this, 3, 9);
        this.frontteeth1.setRotationPoint(-0.1F, 0.0F, -0.7F);
        this.frontteeth1.addBox(-0.5F, -0.0F, -4.0F, 1, 3, 4, 0.0F);
        this.setRotateAngle(frontteeth1, 0.0F, 0.0F, 0.4553564018453205F);
        this.underjaw1 = new AdvancedModelRendererExtended(this, 30, 29);
        this.underjaw1.setRotationPoint(0.0F, 1.6F, -1.9F);
        this.underjaw1.addBox(-0.5F, -1.0F, -4.0F, 1, 2, 6, 0.0F);
        this.setRotateAngle(underjaw1, -0.091106186954104F, 0.0F, 0.0F);
        this.wing1L = new AdvancedModelRendererExtended(this, 12, 63);
        this.wing1L.setRotationPoint(0.2F, -1.7F, -2.4F);
        this.wing1L.addBox(0.0F, -1.0F, 0.0F, 10, 2, 14, 0.0F);
        this.setRotateAngle(wing1L, 0.0F, 0.18203784098300857F, 0.18203784098300857F);
        this.upperlegR.addChild(this.legwing11);
        this.head2.addChild(this.teeth2);
        this.jaw3.addChild(this.lowerfrontteeth2);
        this.neck2.addChild(this.head);
        this.chest.addChild(this.wing1R);
        this.lowerlegR.addChild(this.legwing12);
        this.wing1L.addChild(this.wing2L);
        this.jaw.addChild(this.jaw2);
        this.body.addChild(this.upperlegL);
        this.jaw2.addChild(this.jaw4);
        this.head3.addChild(this.head5);
        this.neck2.addChild(this.underneck1);
        this.tail1.addChild(this.tail2);
        this.tail3.addChild(this.tail4);
        this.lowerlegR.addChild(this.footR);
        this.lowerlegL.addChild(this.legwing22);
        this.upperlegL.addChild(this.legwing21);
        this.tail4.addChild(this.tail5);
        this.wing1R.addChild(this.wing2R);
        this.head.addChild(this.head2);
        this.wing3R.addChild(this.wing4R);
        this.body.addChild(this.upperlegR);
        this.tail2.addChild(this.tail3);
        this.upperlegL.addChild(this.lowerlegL);
        this.jaw.addChild(this.gums1);
        this.chest.addChild(this.neck1);
        this.jaw2.addChild(this.lowerteeth1);
        this.neck1.addChild(this.neck2);
        this.head2.addChild(this.teeth1);
        this.jaw2.addChild(this.jaw3);
        this.chest.addChild(this.body);
        this.head.addChild(this.head6);
        this.head2.addChild(this.head4);
        this.head2.addChild(this.head3);
        this.head3.addChild(this.frontteeth2);
        this.jaw2.addChild(this.lowerteeth2);
        this.wing2R.addChild(this.wing3R);
        this.jaw3.addChild(this.lowerfrontteeth1);
        this.wing3L.addChild(this.wing4L);
        this.upperlegR.addChild(this.lowerlegR);
        this.head.addChild(this.jaw);
        this.wing2L.addChild(this.wing3L);
        this.body.addChild(this.tail1);
        this.wing3L.addChild(this.handL);
        this.tail5.addChild(this.tail6);
        this.lowerlegL.addChild(this.footL);
        this.neck1.addChild(this.underneck2);
        this.wing3R.addChild(this.handR);
        this.head3.addChild(this.frontteeth1);
        this.jaw.addChild(this.underjaw1);
        this.chest.addChild(this.wing1L);

        updateDefaultPose();
        animator = ModelAnimator.create();
        scaler = 0.315F;
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
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
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
            this.setRotateAngle(head, 0.36425021489121656F, 0.0F, 0.0F);
            this.setRotateAngle(wing1R, -0.18203784098300857F, -0.045553093477052F, 0.22759093446006054F);
            this.setRotateAngle(wing2L, 0.0F, 0.0F, -1.7756979809790308F);
            this.setRotateAngle(upperlegL, 0.8651597102135892F, 0.0F, -1.7756979809790308F);
            this.setRotateAngle(footR, 1.2292353921796064F, 0.0F, -0.091106186954104F);
            this.setRotateAngle(wing2R, 0.0F, 0.0F, 1.7756979809790308F);
            this.setRotateAngle(wing4R, 0.136659280431156F, 0.18203784098300857F, 0.0F);
            this.setRotateAngle(upperlegR, 0.8651597102135892F, 0.0F, 1.7756979809790308F);
            this.setRotateAngle(lowerlegL, 0.5918411493512771F, 0.0F, 0.091106186954104F);
            this.setRotateAngle(neck1, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(wing3R, -1.4570008595648662F, 0.0F, -0.22759093446006054F);
            this.setRotateAngle(wing4L, 0.136659280431156F, -0.18203784098300857F, 0.0F);
            this.setRotateAngle(lowerlegR, 0.5918411493512771F, 0.0F, -0.091106186954104F);
            this.setRotateAngle(wing3L, -1.4570008595648662F, 0.0F, 0.22759093446006054F);
            this.setRotateAngle(handR, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(handL, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(footL, 1.2292353921796064F, 0.0F, 0.091106186954104F);
            this.setRotateAngle(wing1L, -0.18203784098300857F, 0.045553093477052F, -0.22759093446006054F);
        } else {
            resetToDefaultPose();
        }

        AdvancedModelRenderer[] wingLeft = {this.wing1L, this.wing2L, this.wing3L};
        AdvancedModelRenderer[] wingRight = {this.wing1R, this.wing2R, this.wing3R};

        AdvancedModelRenderer[] legLeft = {this.upperlegL, this.lowerlegL, this.footL};
        AdvancedModelRenderer[] legRight = {this.upperlegR, this.lowerlegR, this.footR};

        AdvancedModelRenderer[] tailFull = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};

        float speed = 0.40F;
        float fixedY = 1.00F; //The standard offset to centre the mob

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
        EntityPrehistoricFloraAgeableFlyingBase e = (EntityPrehistoricFloraAgeableFlyingBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(head, -0.318697121414165F, 0F, 0F);
        animator.rotate(wing1R, -0.182037840983008F, 0.136484747505956F, 0.409628775443068F);
        animator.rotate(wing2L, 0F, 0F, -1.36589467261076F);
        animator.rotate(upperlegL, 0.728500429782433F, 0F, -1.32034157913371F);
        animator.rotate(footR, 1.95773582196203F, 0F, 0F);
        animator.rotate(wing2R, 0F, 0F, 1.36589467261076F);
        animator.rotate(wing4R, -1.09257611174844F, 0.182037840983008F, 0F);
        animator.rotate(upperlegR, 0.728500429782433F, 0F, 1.32034157913371F);
        animator.rotate(lowerlegL, -0.318697121414164F, 0F, -0.273144027937112F);
        animator.rotate(neck1, 0.182037840983008F, 0F, 0F);
        animator.rotate(chest, 0.136659280431156F, 0F, 0F);
        animator.rotate(wing3R, -1.45700085956486F, 0F, -0.136484747505956F);
        animator.rotate(wing4L, -1.09257611174844F, -0.182037840983008F, 0F);
        animator.rotate(lowerlegR, -0.318697121414164F, 0F, 0.273144027937112F);
        animator.rotate(wing3L, -1.45700085956486F, 0F, 0.136484747505956F);
        animator.rotate(handL, -0.182037840983008F, -0.182037840983008F, -0.136659280431156F);
        animator.rotate(footL, 1.95773582196203F, 0F, 0F);
        animator.rotate(handR, -0.136659280431156F, 0.182037840983008F, 0.136659280431156F);
        animator.rotate(wing1L, -0.182037840983008F, -0.136484747505956F, -0.409628775443068F);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(head, 0.318697121414165F, 0F, 0F);
        animator.rotate(wing1R, 0.182037840983008F, -0.136484747505956F, -0.409628775443068F);
        animator.rotate(wing2L, 0F, 0F, 1.36589467261076F);
        animator.rotate(upperlegL, -0.728500429782433F, 0F, 1.32034157913371F);
        animator.rotate(footR, -1.95773582196203F, 0F, 0F);
        animator.rotate(wing2R, 0F, 0F, -1.36589467261076F);
        animator.rotate(wing4R, 1.09257611174844F, -0.182037840983008F, 0F);
        animator.rotate(upperlegR, -0.728500429782433F, 0F, -1.32034157913371F);
        animator.rotate(lowerlegL, 0.318697121414164F, 0F, 0.273144027937112F);
        animator.rotate(neck1, -0.18203784098300857F, 0.0F, 0.0F);
        animator.rotate(chest, -0.136659280431156F, 0.0F, 0.0F);
        animator.rotate(wing3R, 1.45700085956486F, 0F, 0.136484747505956F);
        animator.rotate(wing4L, 1.09257611174844F, 0.182037840983008F, 0F);
        animator.rotate(lowerlegR, 0.318697121414164F, 0F, -0.273144027937112F);
        animator.rotate(wing3L, 1.45700085956486F, 0F, -0.136484747505956F);
        animator.rotate(handL, 0.18203784098300857F, 0.18203784098300857F, 0.136659280431156F);
        animator.rotate(footL, -1.95773582196203F, 0F, 0F);
        animator.rotate(handR, 0.136659280431156F, -0.18203784098300857F, -0.136659280431156F);
        animator.rotate(wing1L, 0.182037840983008F, 0.136484747505956F, 0.409628775443068F);
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
