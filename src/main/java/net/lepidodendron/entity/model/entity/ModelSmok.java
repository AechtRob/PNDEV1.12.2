package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSmok;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelSmok extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended basin1;
    private final AdvancedModelRendererExtended LegL;
    private final AdvancedModelRendererExtended LegL1;
    private final AdvancedModelRendererExtended FeetL;
    private final AdvancedModelRendererExtended ToesL;
    private final AdvancedModelRendererExtended LegR;
    private final AdvancedModelRendererExtended LegR1;
    private final AdvancedModelRendererExtended FeetR;
    private final AdvancedModelRendererExtended ToesR;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail2osteoderms;
    private final AdvancedModelRendererExtended tail2osteoderms2_r1;
    private final AdvancedModelRendererExtended tail2osteoderms1_r1;
    private final AdvancedModelRendererExtended tai11osteoderms;
    private final AdvancedModelRendererExtended tai11osteoderms4_r1;
    private final AdvancedModelRendererExtended tai11osteoderms2_r1;
    private final AdvancedModelRendererExtended basinosteoderms;
    private final AdvancedModelRendererExtended basinosteoderms4_r1;
    private final AdvancedModelRendererExtended basinosteoderms2_r1;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest1;
    private final AdvancedModelRendererExtended ArmL;
    private final AdvancedModelRendererExtended ArmL1;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended underteeth2;
    private final AdvancedModelRendererExtended jaw4;
    private final AdvancedModelRendererExtended underteeth1;
    private final AdvancedModelRendererExtended underteeth1_r1;
    private final AdvancedModelRendererExtended gums1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended teeth2;
    private final AdvancedModelRendererExtended teeth1;
    private final AdvancedModelRendererExtended teeth1_r1;
    private final AdvancedModelRendererExtended chestosteoderms;
    private final AdvancedModelRendererExtended chestosteoderms4_r1;
    private final AdvancedModelRendererExtended chestosteoderms2_r1;
    private final AdvancedModelRendererExtended ArmR;
    private final AdvancedModelRendererExtended ArmR1;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended osteoderms;
    private final AdvancedModelRendererExtended osteoderms4_r1;
    private final AdvancedModelRendererExtended osteoderms2_r1;

    private ModelAnimator animator;

    public ModelSmok() {
        this.textureWidth = 156;
        this.textureHeight = 156;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin1 = new AdvancedModelRendererExtended(this);
        this.basin1.setRotationPoint(0.0F, -9.4F, 7.9F);
        this.root.addChild(basin1);
        this.setRotateAngle(basin1, -0.0456F, 0.0F, 0.0F);
        this.basin1.cubeList.add(new ModelBox(basin1, 74, 0, -5.5F, -1.5F, -1.5F, 11, 16, 11, 0.0F, false));

        this.LegL = new AdvancedModelRendererExtended(this);
        this.LegL.setRotationPoint(5.4F, 4.9F, 4.4F);
        this.basin1.addChild(LegL);
        this.setRotateAngle(LegL, -0.5009F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 84, 33, -2.5F, -1.0F, -6.0F, 5, 17, 12, 0.0F, false));

        this.LegL1 = new AdvancedModelRendererExtended(this);
        this.LegL1.setRotationPoint(0.0F, 14.3F, -2.4F);
        this.LegL.addChild(LegL1);
        this.setRotateAngle(LegL1, 0.6829F, 0.0F, 0.0F);
        this.LegL1.cubeList.add(new ModelBox(LegL1, 87, 91, -2.0F, 0.0F, -3.5F, 4, 17, 9, 0.0F, false));

        this.FeetL = new AdvancedModelRendererExtended(this);
        this.FeetL.setRotationPoint(0.0F, 16.0F, 1.0F);
        this.LegL1.addChild(FeetL);
        this.setRotateAngle(FeetL, -0.1367F, 0.0F, 0.0F);
        this.FeetL.cubeList.add(new ModelBox(FeetL, 62, 109, -3.0F, -2.0F, -5.0F, 6, 4, 8, 0.0F, false));

        this.ToesL = new AdvancedModelRendererExtended(this);
        this.ToesL.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.FeetL.addChild(ToesL);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 38, 11, -3.0F, -2.0F, -7.0F, 6, 4, 7, -0.01F, false));

        this.LegR = new AdvancedModelRendererExtended(this);
        this.LegR.setRotationPoint(-5.4F, 4.9F, 4.4F);
        this.basin1.addChild(LegR);
        this.setRotateAngle(LegR, -0.5009F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 84, 33, -2.5F, -1.0F, -6.0F, 5, 17, 12, 0.0F, true));

        this.LegR1 = new AdvancedModelRendererExtended(this);
        this.LegR1.setRotationPoint(0.0F, 14.3F, -2.4F);
        this.LegR.addChild(LegR1);
        this.setRotateAngle(LegR1, 0.6829F, 0.0F, 0.0F);
        this.LegR1.cubeList.add(new ModelBox(LegR1, 87, 91, -2.0F, 0.0F, -3.5F, 4, 17, 9, 0.0F, true));

        this.FeetR = new AdvancedModelRendererExtended(this);
        this.FeetR.setRotationPoint(0.0F, 16.0F, 1.0F);
        this.LegR1.addChild(FeetR);
        this.setRotateAngle(FeetR, -0.1367F, 0.0F, 0.0F);
        this.FeetR.cubeList.add(new ModelBox(FeetR, 62, 109, -3.0F, -2.0F, -5.0F, 6, 4, 8, 0.0F, true));

        this.ToesR = new AdvancedModelRendererExtended(this);
        this.ToesR.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.FeetR.addChild(ToesR);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 38, 11, -3.0F, -2.0F, -7.0F, 6, 4, 7, -0.01F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 4.6F, 9.4F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, -0.0456F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 0, -4.0F, -5.5F, -1.0F, 8, 13, 22, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.2F, 20.1F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 42, 13, -2.5F, -4.5F, -1.0F, 5, 10, 22, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 18.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0911F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 70, -2.0F, -3.5F, 0.0F, 4, 7, 19, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 17.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 79, 70, -1.5F, -2.5F, 0.0F, 3, 4, 17, 0.0F, false));

        this.tail2osteoderms = new AdvancedModelRendererExtended(this);
        this.tail2osteoderms.setRotationPoint(0.6F, -4.4F, 0.5F);
        this.tail2.addChild(tail2osteoderms);
        this.tail2osteoderms.cubeList.add(new ModelBox(tail2osteoderms, 74, 9, -0.5F, -1.5F, 0.0F, 0, 2, 18, 0.0F, false));

        this.tail2osteoderms2_r1 = new AdvancedModelRendererExtended(this);
        this.tail2osteoderms2_r1.setRotationPoint(-2.7F, 0.0F, 9.0F);
        this.tail2osteoderms.addChild(tail2osteoderms2_r1);
        this.setRotateAngle(tail2osteoderms2_r1, 0.0F, 0.0F, -0.6981F);
        this.tail2osteoderms2_r1.cubeList.add(new ModelBox(tail2osteoderms2_r1, 60, 73, 0.0F, -2.0F, -9.0F, 0, 2, 18, 0.0F, true));

        this.tail2osteoderms1_r1 = new AdvancedModelRendererExtended(this);
        this.tail2osteoderms1_r1.setRotationPoint(1.5F, 0.0F, 9.0F);
        this.tail2osteoderms.addChild(tail2osteoderms1_r1);
        this.setRotateAngle(tail2osteoderms1_r1, 0.0F, 0.0F, 0.6981F);
        this.tail2osteoderms1_r1.cubeList.add(new ModelBox(tail2osteoderms1_r1, 60, 73, 0.0F, -2.0F, -9.0F, 0, 2, 18, 0.0F, false));

        this.tai11osteoderms = new AdvancedModelRendererExtended(this);
        this.tai11osteoderms.setRotationPoint(1.0F, -4.8F, 0.0F);
        this.tail1.addChild(tai11osteoderms);
        this.tai11osteoderms.cubeList.add(new ModelBox(tai11osteoderms, 42, 28, -1.0F, -2.0F, -0.3F, 0, 2, 21, 0.0F, false));
        this.tai11osteoderms.cubeList.add(new ModelBox(tai11osteoderms, 42, 24, 2.0F, -2.5F, 0.0F, 0, 2, 21, 0.0F, false));
        this.tai11osteoderms.cubeList.add(new ModelBox(tai11osteoderms, 42, 24, -4.0F, -2.5F, 0.0F, 0, 2, 21, 0.0F, true));

        this.tai11osteoderms4_r1 = new AdvancedModelRendererExtended(this);
        this.tai11osteoderms4_r1.setRotationPoint(-5.0F, 1.4F, 10.5F);
        this.tai11osteoderms.addChild(tai11osteoderms4_r1);
        this.setRotateAngle(tai11osteoderms4_r1, 0.0F, 0.0F, -0.6981F);
        this.tai11osteoderms4_r1.cubeList.add(new ModelBox(tai11osteoderms4_r1, 42, 26, 0.0F, -2.0F, -10.5F, 0, 2, 21, 0.0F, true));

        this.tai11osteoderms2_r1 = new AdvancedModelRendererExtended(this);
        this.tai11osteoderms2_r1.setRotationPoint(3.0F, 1.4F, 10.5F);
        this.tai11osteoderms.addChild(tai11osteoderms2_r1);
        this.setRotateAngle(tai11osteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.tai11osteoderms2_r1.cubeList.add(new ModelBox(tai11osteoderms2_r1, 42, 26, 0.0F, -2.0F, -10.5F, 0, 2, 21, 0.0F, false));

        this.basinosteoderms = new AdvancedModelRendererExtended(this);
        this.basinosteoderms.setRotationPoint(1.2F, -0.8F, -0.9F);
        this.basin1.addChild(basinosteoderms);
        this.basinosteoderms.cubeList.add(new ModelBox(basinosteoderms, 0, 6, -1.0F, -2.0F, 0.5F, 0, 2, 10, 0.0F, false));
        this.basinosteoderms.cubeList.add(new ModelBox(basinosteoderms, 0, 2, 2.5F, -2.5F, 0.5F, 0, 2, 10, 0.0F, false));
        this.basinosteoderms.cubeList.add(new ModelBox(basinosteoderms, 0, 2, -4.9F, -2.5F, 0.5F, 0, 2, 10, 0.0F, true));

        this.basinosteoderms4_r1 = new AdvancedModelRendererExtended(this);
        this.basinosteoderms4_r1.setRotationPoint(-6.7F, 1.5F, 5.5F);
        this.basinosteoderms.addChild(basinosteoderms4_r1);
        this.setRotateAngle(basinosteoderms4_r1, 0.0F, 0.0F, -0.6981F);
        this.basinosteoderms4_r1.cubeList.add(new ModelBox(basinosteoderms4_r1, 0, 4, 0.0F, -2.0F, -5.0F, 0, 2, 10, 0.0F, true));

        this.basinosteoderms2_r1 = new AdvancedModelRendererExtended(this);
        this.basinosteoderms2_r1.setRotationPoint(4.3F, 1.5F, 5.5F);
        this.basinosteoderms.addChild(basinosteoderms2_r1);
        this.setRotateAngle(basinosteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.basinosteoderms2_r1.cubeList.add(new ModelBox(basinosteoderms2_r1, 0, 4, 0.0F, -2.0F, -5.0F, 0, 2, 10, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, 7.3F, -0.1F);
        this.basin1.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 35, -6.5F, -9.5F, -16.0F, 13, 19, 16, 0.0F, false));

        this.chest1 = new AdvancedModelRendererExtended(this);
        this.chest1.setRotationPoint(0.0F, -0.3F, -14.4F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0911F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 42, 54, -5.5F, -9.0F, -16.0F, 11, 17, 16, 0.0F, false));

        this.ArmL = new AdvancedModelRendererExtended(this);
        this.ArmL.setRotationPoint(4.5F, 5.2F, -11.7F);
        this.chest1.addChild(ArmL);
        this.setRotateAngle(ArmL, 0.5918F, 0.0F, -0.1367F);
        this.ArmL.cubeList.add(new ModelBox(ArmL, 1, 71, -1.5F, -1.0F, -3.0F, 3, 9, 5, 0.0F, false));

        this.ArmL1 = new AdvancedModelRendererExtended(this);
        this.ArmL1.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.ArmL.addChild(ArmL1);
        this.setRotateAngle(ArmL1, -0.8517F, 0.0F, 0.0F);
        this.ArmL1.cubeList.add(new ModelBox(ArmL1, 2, 36, -1.0F, 0.2F, -2.0F, 2, 9, 4, 0.0F, false));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.ArmL1.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.182F);
        this.HandL.cubeList.add(new ModelBox(HandL, 48, 111, -1.0F, 1.5F, -2.0F, 2, 6, 4, -0.01F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -3.2F, -13.5F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0911F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 36, 87, -3.5F, -5.5F, -10.0F, 7, 13, 10, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.4F, -7.8F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.2276F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 96, -3.0F, -6.0F, -9.0F, 6, 12, 9, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -2.1F, -7.6F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, 0.0911F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 102, 62, -4.0F, -3.5F, -7.0F, 8, 7, 7, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 38, 0, -4.0F, 0.0F, -7.0F, 8, 4, 7, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 1.0F, -6.9F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 104, 108, -2.0F, -1.0F, -9.0F, 4, 3, 9, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, -0.1F, -8.4F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.182F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 27, 70, -1.5F, -1.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.underteeth2 = new AdvancedModelRendererExtended(this);
        this.underteeth2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw3.addChild(underteeth2);
        this.underteeth2.cubeList.add(new ModelBox(underteeth2, 73, 0, -1.5F, -2.0F, -2.0F, 3, 2, 3, 0.0F, false));

        this.jaw4 = new AdvancedModelRendererExtended(this);
        this.jaw4.setRotationPoint(0.0F, 2.6F, 0.0F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.182F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 61, 0, -1.5F, -0.5F, -6.0F, 3, 1, 6, 0.0F, false));

        this.underteeth1 = new AdvancedModelRendererExtended(this);
        this.underteeth1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw2.addChild(underteeth1);


        this.underteeth1_r1 = new AdvancedModelRendererExtended(this);
        this.underteeth1_r1.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.underteeth1.addChild(underteeth1_r1);
        this.setRotateAngle(underteeth1_r1, -0.2182F, 0.0F, 0.0F);
        this.underteeth1_r1.cubeList.add(new ModelBox(underteeth1_r1, 104, 91, -2.0F, -0.2F, -3.5F, 4, 2, 7, -0.02F, false));

        this.gums1 = new AdvancedModelRendererExtended(this);
        this.gums1.setRotationPoint(0.0F, 0.8F, -3.4F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.1367F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 108, 1, -4.0F, -5.0F, -2.5F, 8, 5, 5, -0.02F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 1.0F, -6.6F);
        this.head1.addChild(head2);
        this.head2.cubeList.add(new ModelBox(head2, 106, 27, -2.5F, -2.5F, -9.0F, 5, 5, 9, 0.01F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -1.9F, -0.1F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.0911F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 18, 105, -1.5F, -2.5F, -12.0F, 3, 2, 12, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, -0.7F, -8.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -0.0456F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 70, 95, -2.0F, -1.6F, -4.0F, 4, 4, 4, 0.02F, false));

        this.teeth2 = new AdvancedModelRendererExtended(this);
        this.teeth2.setRotationPoint(0.0F, 1.9F, -1.0F);
        this.head4.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 27, 83, -1.5F, 0.0F, -2.7F, 3, 2, 4, -0.01F, false));

        this.teeth1 = new AdvancedModelRendererExtended(this);
        this.teeth1.setRotationPoint(0.0F, 2.2F, -2.1F);
        this.head2.addChild(teeth1);


        this.teeth1_r1 = new AdvancedModelRendererExtended(this);
        this.teeth1_r1.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.teeth1.addChild(teeth1_r1);
        this.setRotateAngle(teeth1_r1, 0.1309F, 0.0F, 0.0F);
        this.teeth1_r1.cubeList.add(new ModelBox(teeth1_r1, 102, 76, -2.0F, -1.4F, -3.3F, 4, 2, 7, -0.01F, false));

        this.chestosteoderms = new AdvancedModelRendererExtended(this);
        this.chestosteoderms.setRotationPoint(1.5F, -8.7F, -1.6F);
        this.chest1.addChild(chestosteoderms);
        this.setRotateAngle(chestosteoderms, 0.0017F, 0.0F, 0.0F);
        this.chestosteoderms.cubeList.add(new ModelBox(chestosteoderms, 106, 26, -1.5F, -1.5F, -14.0F, 0, 2, 15, 0.0F, false));
        this.chestosteoderms.cubeList.add(new ModelBox(chestosteoderms, 80, 52, 2.0F, -2.0F, -13.0F, 0, 2, 14, 0.0F, false));
        this.chestosteoderms.cubeList.add(new ModelBox(chestosteoderms, 80, 52, -5.0F, -2.0F, -13.0F, 0, 2, 14, 0.0F, true));

        this.chestosteoderms4_r1 = new AdvancedModelRendererExtended(this);
        this.chestosteoderms4_r1.setRotationPoint(-7.0F, 2.0F, -6.0F);
        this.chestosteoderms.addChild(chestosteoderms4_r1);
        this.setRotateAngle(chestosteoderms4_r1, 0.0F, 0.0F, -0.6981F);
        this.chestosteoderms4_r1.cubeList.add(new ModelBox(chestosteoderms4_r1, 80, 50, 0.0F, -2.0F, -7.0F, 0, 2, 14, 0.0F, true));

        this.chestosteoderms2_r1 = new AdvancedModelRendererExtended(this);
        this.chestosteoderms2_r1.setRotationPoint(4.0F, 2.0F, -6.0F);
        this.chestosteoderms.addChild(chestosteoderms2_r1);
        this.setRotateAngle(chestosteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.chestosteoderms2_r1.cubeList.add(new ModelBox(chestosteoderms2_r1, 80, 50, 0.0F, -2.0F, -7.0F, 0, 2, 14, 0.0F, false));

        this.ArmR = new AdvancedModelRendererExtended(this);
        this.ArmR.setRotationPoint(-4.5F, 5.2F, -11.7F);
        this.chest1.addChild(ArmR);
        this.setRotateAngle(ArmR, 0.5918F, 0.0F, 0.1367F);
        this.ArmR.cubeList.add(new ModelBox(ArmR, 1, 71, -1.5F, -1.0F, -3.0F, 3, 9, 5, 0.0F, true));

        this.ArmR1 = new AdvancedModelRendererExtended(this);
        this.ArmR1.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.ArmR.addChild(ArmR1);
        this.setRotateAngle(ArmR1, -0.8517F, 0.0F, 0.0F);
        this.ArmR1.cubeList.add(new ModelBox(ArmR1, 2, 36, -1.0F, 0.2F, -2.0F, 2, 9, 4, 0.0F, true));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.ArmR1.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, 0.0F, -0.182F);
        this.HandR.cubeList.add(new ModelBox(HandR, 48, 111, -1.0F, 1.5F, -2.0F, 2, 6, 4, -0.01F, true));

        this.osteoderms = new AdvancedModelRendererExtended(this);
        this.osteoderms.setRotationPoint(1.6F, -9.2F, 0.0F);
        this.body1.addChild(osteoderms);
        this.osteoderms.cubeList.add(new ModelBox(osteoderms, 74, 13, -1.5F, -1.5F, -16.0F, 0, 2, 16, 0.0F, false));
        this.osteoderms.cubeList.add(new ModelBox(osteoderms, 60, 77, 3.0F, -2.0F, -16.0F, 0, 2, 16, 0.0F, false));
        this.osteoderms.cubeList.add(new ModelBox(osteoderms, 60, 77, -6.2F, -2.0F, -16.0F, 0, 2, 16, 0.0F, true));

        this.osteoderms4_r1 = new AdvancedModelRendererExtended(this);
        this.osteoderms4_r1.setRotationPoint(-8.1F, 2.0F, -8.0F);
        this.osteoderms.addChild(osteoderms4_r1);
        this.setRotateAngle(osteoderms4_r1, 0.0F, 0.0F, -0.6981F);
        this.osteoderms4_r1.cubeList.add(new ModelBox(osteoderms4_r1, 74, 15, 0.0F, -2.0F, -8.0F, 0, 2, 16, 0.0F, true));

        this.osteoderms2_r1 = new AdvancedModelRendererExtended(this);
        this.osteoderms2_r1.setRotationPoint(4.9F, 2.0F, -8.0F);
        this.osteoderms.addChild(osteoderms2_r1);
        this.setRotateAngle(osteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.osteoderms2_r1.cubeList.add(new ModelBox(osteoderms2_r1, 74, 15, 0.0F, -2.0F, -8.0F, 0, 2, 16, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.basin1.render(f5 * 0.785F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head1.rotateAngleX = (float) Math.toRadians(-14.9);
        this.jaw1.rotateAngleX = (float) Math.toRadians(42.5);
        this.chest1.offsetY = -0.01F;
        this.chest1.render(0.01F);
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
        this.basin1.offsetY = 0.30F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraSmok Smok = (EntityPrehistoricFloraSmok) e;
        float masterSpeed = Smok.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head1);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head1};

        AdvancedModelRenderer[] ArmL = {this.ArmL, this.ArmL1};
        AdvancedModelRenderer[] ArmR = {this.ArmR, this.ArmR1};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Smok.getAnimation() == Smok.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Smok.isReallyInWater()) {

            if (f3 == 0.0F || !Smok.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Smok.getIsFast()) { //Running
                float speed = masterSpeed / 1.8F;
                //this.basin.offsetY = 0.75F;
                this.LegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
                this.LegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(20), 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(20), 0.5, 5, f2, 1F);


                //---
                this.walk(LegL, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);
                this.walk(LegR, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(28), f2, 1.0F);

                this.walk(LegL1, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(LegR1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(FeetL, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(FeetR, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(ToesL, speed, 0.6F, true, 4.5F, 0.535F, f2, 1F);
                this.walk(ToesR, speed, 0.6F, true, 1.5F, 0.535F, f2, 1F);

                this.bobExtended(basin1, speed * 2F, 1.23F, false, 3.5F, f2, 1F);

                this.bobExtended(LegL, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(LegR, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin1, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body1, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(LegL, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(LegR, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body1, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.basin1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

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
                this.LegL.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
                this.LegR.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);

                this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(10), 0.5, 8, f2, 1F);
                this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(10), 0.5, 5, f2, 1F);

                this.walk(LegL, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(20), f2, 1.0F);
                this.walk(LegR, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(20), f2, 1.0F);

                this.walk(LegL1, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
                this.walk(LegR1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);

                this.walk(FeetL, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
                this.walk(FeetR, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);

                this.walk(ToesL, speed, 0.6F, true, 4.5F, 0.535F, f2, 0.8F);
                this.walk(ToesR, speed, 0.6F, true, 1.5F, 0.535F, f2, 0.8F);

                this.bobExtended(basin1, speed * 2F, 0.83F, false, 3.5F, f2, 1F);

                this.bobExtended(LegL, speed, 0.8F, false, 3.0F, f2, 1F);
                this.bobExtended(LegR, speed, 0.8F, false, 0.0F, f2, 1F);

                this.flap(basin1, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
                this.flap(body1, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
                this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);

                this.flap(LegL, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
                this.flap(LegR, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);

                this.walk(body1, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
                this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);

                this.walk(neck1, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
                this.walk(head1, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                this.basin1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraSmok e = (EntityPrehistoricFloraSmok) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.basin1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
         animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.basin1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(LegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
