package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSmok;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSmok extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer chest1;
    private final AdvancedModelRenderer ArmL1;
    private final AdvancedModelRenderer ArmL2;
    private final AdvancedModelRenderer HandL;
    private final AdvancedModelRenderer ArmR1;
    private final AdvancedModelRenderer ArmR2;
    private final AdvancedModelRenderer HandR;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer underteeth2;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw4_r1;
    private final AdvancedModelRenderer underteeth1;
    private final AdvancedModelRenderer underteeth1_r1;
    private final AdvancedModelRenderer gums1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer teeth2;
    private final AdvancedModelRenderer teeth1;
    private final AdvancedModelRenderer teeth1_r1;
    private final AdvancedModelRenderer chestosteoderms;
    private final AdvancedModelRenderer chestosteoderms3_r1;
    private final AdvancedModelRenderer chestosteoderms2_r1;
    private final AdvancedModelRenderer osteoderms;
    private final AdvancedModelRenderer osteoderms3_r1;
    private final AdvancedModelRenderer osteoderms2_r1;
    private final AdvancedModelRenderer basin1;
    private final AdvancedModelRenderer upperLegL;
    private final AdvancedModelRenderer LegL;
    private final AdvancedModelRenderer FeetL;
    private final AdvancedModelRenderer ToesL;
    private final AdvancedModelRenderer upperLegR;
    private final AdvancedModelRenderer LegR;
    private final AdvancedModelRenderer FeetR;
    private final AdvancedModelRenderer ToesR;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail2osteoderms;
    private final AdvancedModelRenderer tail2osteoderms2_r1;
    private final AdvancedModelRenderer tail2osteoderms1_r1;
    private final AdvancedModelRenderer tai11osteoderms;
    private final AdvancedModelRenderer tai11osteoderms3_r1;
    private final AdvancedModelRenderer tai11osteoderms2_r1;
    private final AdvancedModelRenderer basinosteoderms;
    private final AdvancedModelRenderer basinosteoderms3_r1;
    private final AdvancedModelRenderer basinosteoderms2_r1;

    private ModelAnimator animator;

    public ModelSmok() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.1F, -0.2F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0456F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 35, -6.5F, -9.8643F, -8.0083F, 13, 20, 16, 0.0F, false));

        this.chest1 = new AdvancedModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -0.6643F, -6.4083F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.0475F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 59, 45, -5.5F, -9.0F, -13.0F, 11, 19, 13, 0.0F, false));

        this.ArmL1 = new AdvancedModelRenderer(this);
        this.ArmL1.setRotationPoint(4.5F, 5.2F, -7.7F);
        this.chest1.addChild(ArmL1);
        this.setRotateAngle(ArmL1, 0.3737F, 0.0F, -0.1367F);
        this.ArmL1.cubeList.add(new ModelBox(ArmL1, 0, 72, -1.5F, -1.0F, -3.0F, 3, 9, 5, 0.0F, false));

        this.ArmL2 = new AdvancedModelRenderer(this);
        this.ArmL2.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.ArmL1.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.5899F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 0, 35, -1.0F, 0.2F, -2.0F, 2, 9, 4, 0.0F, false));

        this.HandL = new AdvancedModelRenderer(this);
        this.HandL.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.ArmL2.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.182F);
        this.HandL.cubeList.add(new ModelBox(HandL, 59, 45, -1.0F, 1.5F, -2.0F, 2, 6, 4, -0.01F, false));

        this.ArmR1 = new AdvancedModelRenderer(this);
        this.ArmR1.setRotationPoint(-4.5F, 5.2F, -7.7F);
        this.chest1.addChild(ArmR1);
        this.setRotateAngle(ArmR1, 0.3737F, 0.0F, 0.1367F);
        this.ArmR1.cubeList.add(new ModelBox(ArmR1, 0, 72, -1.5F, -1.0F, -3.0F, 3, 9, 5, 0.0F, true));

        this.ArmR2 = new AdvancedModelRenderer(this);
        this.ArmR2.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.ArmR1.addChild(ArmR2);
        this.setRotateAngle(ArmR2, -0.5899F, 0.0F, 0.0F);
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 0, 35, -1.0F, 0.2F, -2.0F, 2, 9, 4, 0.0F, true));

        this.HandR = new AdvancedModelRenderer(this);
        this.HandR.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.ArmR2.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, 0.0F, -0.182F);
        this.HandR.cubeList.add(new ModelBox(HandR, 59, 45, -1.0F, 1.5F, -2.0F, 2, 6, 4, -0.01F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -3.2F, -10.5F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.0911F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 35, 102, -3.5F, -5.5F, -10.0F, 7, 13, 10, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.4F, -7.8F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.2276F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 119, 20, -3.0F, -6.0F, -8.0F, 6, 12, 8, 0.0F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.0F, -2.85F, -6.6F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, 0.0911F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 121, 0, -4.0F, -3.318F, -5.0083F, 8, 7, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -1.3357F, -10.8667F);
        this.head1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1661F, 0.506F, 0.0964F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -6.6559F, -0.4085F, 5.6544F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -1.3357F, -10.8667F);
        this.head1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1316F, -0.0938F, -0.0239F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 0, -2.2228F, -0.59F, 5.4069F, 2, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -1.3357F, -10.8667F);
        this.head1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2389F, -0.4447F, -0.0969F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 13, -0.1342F, -0.0888F, -0.1712F, 3, 1, 6, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.3357F, -10.8667F);
        this.head1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1661F, -0.506F, -0.0964F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 5.6559F, -0.4085F, 5.6544F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, -1.3357F, -10.8667F);
        this.head1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1316F, 0.0938F, 0.0239F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 0, 0.2228F, -0.59F, 5.4069F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.5F, -1.3357F, -10.8667F);
        this.head1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2389F, 0.4447F, 0.0969F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 13, -2.8658F, -0.0888F, -0.1712F, 3, 1, 6, 0.0F, false));

        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.0F, 3.182F, 1.9917F);
        this.head1.addChild(jaw1);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 39, 0, -4.0F, 0.0F, -7.0F, 8, 5, 7, -0.01F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 1.0F, -6.9F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 129, -2.0F, -1.0F, -9.0F, 4, 3, 9, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -0.1F, -8.4F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.182F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 28, 72, -1.5F, -1.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.underteeth2 = new AdvancedModelRenderer(this);
        this.underteeth2.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw3.addChild(underteeth2);
        this.underteeth2.cubeList.add(new ModelBox(underteeth2, 43, 45, -1.5F, -2.0F, -2.0F, 3, 2, 3, 0.0F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 2.6F, 0.0F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.1384F, 0.0F, 0.0F);


        this.jaw4_r1 = new AdvancedModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.0F, 0.4F, -7.1F);
        this.jaw4.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, -0.1222F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 0, 13, -1.5F, -2.0F, 0.1F, 3, 2, 7, 0.0F, false));

        this.underteeth1 = new AdvancedModelRenderer(this);
        this.underteeth1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw2.addChild(underteeth1);


        this.underteeth1_r1 = new AdvancedModelRenderer(this);
        this.underteeth1_r1.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.underteeth1.addChild(underteeth1_r1);
        this.setRotateAngle(underteeth1_r1, -0.2182F, 0.0F, 0.0F);
        this.underteeth1_r1.cubeList.add(new ModelBox(underteeth1_r1, 130, 84, -2.0F, -0.2F, -3.5F, 4, 2, 7, -0.02F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 1.3F, -4.4F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.3548F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 130, 55, -4.0F, -5.0F, -2.5F, 8, 5, 5, -0.02F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 1.182F, -4.6083F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.0873F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 121, 121, -2.5F, -2.5F, -9.0F, 5, 5, 9, 0.01F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, -1.65F, -0.1F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.0911F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 114, 105, -1.5F, -2.5F, -12.0F, 3, 2, 13, 0.0F, false));
        this.head3.cubeList.add(new ModelBox(head3, 69, 129, 1.3F, -3.1F, -12.0F, 0, 1, 12, 0.0F, false));
        this.head3.cubeList.add(new ModelBox(head3, 69, 129, -1.3F, -3.1F, -12.0F, 0, 1, 12, 0.0F, true));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.7F, -8.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -0.1328F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 70, 0, -2.0F, -1.6F, -4.0F, 4, 4, 4, 0.02F, false));

        this.teeth2 = new AdvancedModelRenderer(this);
        this.teeth2.setRotationPoint(0.0F, 1.9F, -1.0F);
        this.head4.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 48, 74, -1.5F, 0.0F, -2.7F, 3, 2, 4, -0.01F, false));

        this.teeth1 = new AdvancedModelRenderer(this);
        this.teeth1.setRotationPoint(0.0F, 2.2F, -2.1F);
        this.head2.addChild(teeth1);


        this.teeth1_r1 = new AdvancedModelRenderer(this);
        this.teeth1_r1.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.teeth1.addChild(teeth1_r1);
        this.setRotateAngle(teeth1_r1, 0.1309F, 0.0F, 0.0F);
        this.teeth1_r1.cubeList.add(new ModelBox(teeth1_r1, 130, 74, -2.0F, -1.4F, -3.3F, 4, 2, 7, -0.01F, false));

        this.chestosteoderms = new AdvancedModelRenderer(this);
        this.chestosteoderms.setRotationPoint(1.5F, -8.7F, -1.6F);
        this.chest1.addChild(chestosteoderms);
        this.setRotateAngle(chestosteoderms, 0.0017F, 0.0F, 0.0F);
        this.chestosteoderms.cubeList.add(new ModelBox(chestosteoderms, 84, 124, -1.5F, -1.5F, -11.1F, 0, 2, 13, 0.0F, false));
        this.chestosteoderms.cubeList.add(new ModelBox(chestosteoderms, 99, 128, 2.0F, -2.0F, -11.0F, 0, 2, 12, 0.0F, false));
        this.chestosteoderms.cubeList.add(new ModelBox(chestosteoderms, 99, 128, -5.0F, -2.0F, -11.0F, 0, 2, 12, 0.0F, true));

        this.chestosteoderms3_r1 = new AdvancedModelRenderer(this);
        this.chestosteoderms3_r1.setRotationPoint(-7.0F, 2.0F, -6.0F);
        this.chestosteoderms.addChild(chestosteoderms3_r1);
        this.setRotateAngle(chestosteoderms3_r1, 0.0F, 0.0F, -0.6981F);
        this.chestosteoderms3_r1.cubeList.add(new ModelBox(chestosteoderms3_r1, 56, 126, 0.0F, -2.0F, -5.0F, 0, 2, 12, 0.0F, true));

        this.chestosteoderms2_r1 = new AdvancedModelRenderer(this);
        this.chestosteoderms2_r1.setRotationPoint(4.0F, 2.0F, -6.0F);
        this.chestosteoderms.addChild(chestosteoderms2_r1);
        this.setRotateAngle(chestosteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.chestosteoderms2_r1.cubeList.add(new ModelBox(chestosteoderms2_r1, 56, 126, 0.0F, -2.0F, -5.0F, 0, 2, 12, 0.0F, false));

        this.osteoderms = new AdvancedModelRenderer(this);
        this.osteoderms.setRotationPoint(1.6F, -9.5643F, 7.9917F);
        this.body1.addChild(osteoderms);
        this.osteoderms.cubeList.add(new ModelBox(osteoderms, 113, 81, -1.5F, -1.5F, -16.0F, 0, 2, 16, 0.0F, false));
        this.osteoderms.cubeList.add(new ModelBox(osteoderms, 113, 50, 3.0F, -2.0F, -16.0F, 0, 2, 16, 0.0F, false));
        this.osteoderms.cubeList.add(new ModelBox(osteoderms, 113, 50, -6.2F, -2.0F, -16.0F, 0, 2, 16, 0.0F, true));

        this.osteoderms3_r1 = new AdvancedModelRenderer(this);
        this.osteoderms3_r1.setRotationPoint(-8.1F, 2.0F, -8.0F);
        this.osteoderms.addChild(osteoderms3_r1);
        this.setRotateAngle(osteoderms3_r1, 0.0F, 0.0F, -0.6981F);
        this.osteoderms3_r1.cubeList.add(new ModelBox(osteoderms3_r1, 97, 105, 0.0F, -2.0F, -8.0F, 0, 2, 16, 0.0F, true));

        this.osteoderms2_r1 = new AdvancedModelRenderer(this);
        this.osteoderms2_r1.setRotationPoint(4.9F, 2.0F, -8.0F);
        this.osteoderms.addChild(osteoderms2_r1);
        this.setRotateAngle(osteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.osteoderms2_r1.cubeList.add(new ModelBox(osteoderms2_r1, 97, 105, 0.0F, -2.0F, -8.0F, 0, 2, 16, 0.0F, false));

        this.basin1 = new AdvancedModelRenderer(this);
        this.basin1.setRotationPoint(0.0F, -7.6643F, 8.0917F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, -0.0892F, 0.0F, 0.0F);
        this.basin1.cubeList.add(new ModelBox(basin1, 76, 0, -5.5F, -1.5F, -1.5F, 11, 16, 11, 0.0F, false));

        this.upperLegL = new AdvancedModelRenderer(this);
        this.upperLegL.setRotationPoint(5.4F, 4.9F, 4.4F);
        this.basin1.addChild(upperLegL);
        this.setRotateAngle(upperLegL, -0.5009F, 0.0F, 0.0F);
        this.upperLegL.cubeList.add(new ModelBox(upperLegL, 0, 99, -2.5F, -1.0F, -6.0F, 5, 17, 12, 0.0F, false));

        this.LegL = new AdvancedModelRenderer(this);
        this.LegL.setRotationPoint(0.0F, 14.3F, -2.4F);
        this.upperLegL.addChild(LegL);
        this.setRotateAngle(LegL, 0.7702F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 70, 102, -2.0F, 0.0F, -3.5F, 4, 17, 9, 0.0F, false));

        this.FeetL = new AdvancedModelRenderer(this);
        this.FeetL.setRotationPoint(0.0F, 16.0F, 1.0F);
        this.LegL.addChild(FeetL);
        this.setRotateAngle(FeetL, -0.1367F, 0.0F, 0.0F);
        this.FeetL.cubeList.add(new ModelBox(FeetL, 27, 126, -3.0F, -2.0F, -5.0F, 6, 4, 8, 0.0F, false));

        this.ToesL = new AdvancedModelRenderer(this);
        this.ToesL.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.FeetL.addChild(ToesL);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 130, 43, -3.0F, -2.0F, -7.0F, 6, 4, 7, -0.01F, false));

        this.upperLegR = new AdvancedModelRenderer(this);
        this.upperLegR.setRotationPoint(-5.4F, 4.9F, 4.4F);
        this.basin1.addChild(upperLegR);
        this.setRotateAngle(upperLegR, -0.5009F, 0.0F, 0.0F);
        this.upperLegR.cubeList.add(new ModelBox(upperLegR, 0, 99, -2.5F, -1.0F, -6.0F, 5, 17, 12, 0.0F, true));

        this.LegR = new AdvancedModelRenderer(this);
        this.LegR.setRotationPoint(0.0F, 14.3F, -2.4F);
        this.upperLegR.addChild(LegR);
        this.setRotateAngle(LegR, 0.7702F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 70, 102, -2.0F, 0.0F, -3.5F, 4, 17, 9, 0.0F, true));

        this.FeetR = new AdvancedModelRenderer(this);
        this.FeetR.setRotationPoint(0.0F, 16.0F, 1.0F);
        this.LegR.addChild(FeetR);
        this.setRotateAngle(FeetR, -0.1367F, 0.0F, 0.0F);
        this.FeetR.cubeList.add(new ModelBox(FeetR, 27, 126, -3.0F, -2.0F, -5.0F, 6, 4, 8, 0.0F, true));

        this.ToesR = new AdvancedModelRenderer(this);
        this.ToesR.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.FeetR.addChild(ToesR);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 130, 43, -3.0F, -2.0F, -7.0F, 6, 4, 7, -0.01F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 4.6F, 9.4F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0417F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 0, -4.0F, -5.5F, -1.0F, 8, 12, 22, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.2F, 20.1F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0019F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 43, 13, -2.5F, -4.5F, -1.0F, 5, 9, 22, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 18.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1347F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 72, -2.0F, -3.5F, 0.0F, 4, 7, 19, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 17.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0948F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 95, 28, -1.5F, -2.5F, 0.0F, 3, 4, 17, 0.0F, false));

        this.tail2osteoderms = new AdvancedModelRenderer(this);
        this.tail2osteoderms.setRotationPoint(0.6F, -4.4F, 0.5F);
        this.tail2.addChild(tail2osteoderms);
        this.tail2osteoderms.cubeList.add(new ModelBox(tail2osteoderms, 94, 84, -0.5F, -1.5F, 0.0F, 0, 2, 18, 0.0F, false));

        this.tail2osteoderms2_r1 = new AdvancedModelRenderer(this);
        this.tail2osteoderms2_r1.setRotationPoint(-2.7F, 0.0F, 9.0F);
        this.tail2osteoderms.addChild(tail2osteoderms2_r1);
        this.setRotateAngle(tail2osteoderms2_r1, 0.0F, 0.0F, -0.6981F);
        this.tail2osteoderms2_r1.cubeList.add(new ModelBox(tail2osteoderms2_r1, 48, 78, 0.0F, -2.0F, -9.0F, 0, 2, 18, 0.0F, true));

        this.tail2osteoderms1_r1 = new AdvancedModelRenderer(this);
        this.tail2osteoderms1_r1.setRotationPoint(1.5F, 0.0F, 9.0F);
        this.tail2osteoderms.addChild(tail2osteoderms1_r1);
        this.setRotateAngle(tail2osteoderms1_r1, 0.0F, 0.0F, 0.6981F);
        this.tail2osteoderms1_r1.cubeList.add(new ModelBox(tail2osteoderms1_r1, 48, 78, 0.0F, -2.0F, -9.0F, 0, 2, 18, 0.0F, false));

        this.tai11osteoderms = new AdvancedModelRenderer(this);
        this.tai11osteoderms.setRotationPoint(1.0F, -4.8F, 0.0F);
        this.tail1.addChild(tai11osteoderms);
        this.tai11osteoderms.cubeList.add(new ModelBox(tai11osteoderms, 91, 57, -1.0F, -2.0F, -0.3F, 0, 2, 21, 0.0F, false));
        this.tai11osteoderms.cubeList.add(new ModelBox(tai11osteoderms, 69, 78, 2.0F, -2.5F, 0.0F, 0, 2, 21, 0.0F, false));
        this.tai11osteoderms.cubeList.add(new ModelBox(tai11osteoderms, 69, 78, -4.0F, -2.5F, 0.0F, 0, 2, 21, 0.0F, true));

        this.tai11osteoderms3_r1 = new AdvancedModelRenderer(this);
        this.tai11osteoderms3_r1.setRotationPoint(-5.0F, 1.4F, 10.5F);
        this.tai11osteoderms.addChild(tai11osteoderms3_r1);
        this.setRotateAngle(tai11osteoderms3_r1, 0.0F, 0.0F, -0.6981F);
        this.tai11osteoderms3_r1.cubeList.add(new ModelBox(tai11osteoderms3_r1, 26, 78, 0.0F, -2.0F, -10.5F, 0, 2, 21, 0.0F, true));

        this.tai11osteoderms2_r1 = new AdvancedModelRenderer(this);
        this.tai11osteoderms2_r1.setRotationPoint(3.0F, 1.4F, 10.5F);
        this.tai11osteoderms.addChild(tai11osteoderms2_r1);
        this.setRotateAngle(tai11osteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.tai11osteoderms2_r1.cubeList.add(new ModelBox(tai11osteoderms2_r1, 26, 78, 0.0F, -2.0F, -10.5F, 0, 2, 21, 0.0F, false));

        this.basinosteoderms = new AdvancedModelRenderer(this);
        this.basinosteoderms.setRotationPoint(1.2F, -0.8F, -0.9F);
        this.basin1.addChild(basinosteoderms);
        this.basinosteoderms.cubeList.add(new ModelBox(basinosteoderms, 91, 81, -1.0F, -2.0F, 0.5F, 0, 2, 10, 0.0F, false));
        this.basinosteoderms.cubeList.add(new ModelBox(basinosteoderms, 67, 78, 2.5F, -2.5F, 0.5F, 0, 2, 10, 0.0F, false));
        this.basinosteoderms.cubeList.add(new ModelBox(basinosteoderms, 67, 78, -4.9F, -2.5F, 0.5F, 0, 2, 10, 0.0F, true));

        this.basinosteoderms3_r1 = new AdvancedModelRenderer(this);
        this.basinosteoderms3_r1.setRotationPoint(-6.7F, 1.5F, 5.5F);
        this.basinosteoderms.addChild(basinosteoderms3_r1);
        this.setRotateAngle(basinosteoderms3_r1, 0.0F, 0.0F, -0.6981F);
        this.basinosteoderms3_r1.cubeList.add(new ModelBox(basinosteoderms3_r1, 0, 0, 0.0F, -2.0F, -5.0F, 0, 2, 10, 0.0F, true));

        this.basinosteoderms2_r1 = new AdvancedModelRenderer(this);
        this.basinosteoderms2_r1.setRotationPoint(4.3F, 1.5F, 5.5F);
        this.basinosteoderms.addChild(basinosteoderms2_r1);
        this.setRotateAngle(basinosteoderms2_r1, 0.0F, 0.0F, 0.6981F);
        this.basinosteoderms2_r1.cubeList.add(new ModelBox(basinosteoderms2_r1, 0, 0, 0.0F, -2.0F, -5.0F, 0, 2, 10, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSmok Smok = (EntityPrehistoricFloraSmok) e;

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head1);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head1};

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


            }
            else { //Walking

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

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSmok ee = (EntityPrehistoricFloraSmok) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
            else { //Walking
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                return;
            }
            //moving in water
            return;
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSmok entity = (EntityPrehistoricFloraSmok) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*50))*-3), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*50))*5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*50))*3));
        this.body1.offsetX = (float) Math.toRadians(0);
        this.body1.offsetY = (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*50))*-0.5);
        this.body1.offsetZ = (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*50))*2);


        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*50))*-2), chest1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*150))*5), chest1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*20))*-3));


        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)-1)*360/2.5-((Math.PI/180)*50))*5), ArmL1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)-1)*360/2.5-((Math.PI/180)*50))*5), ArmL1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)-1)*360/2.5-((Math.PI/180)*50))*-10 ), ArmL2.rotateAngleY + (float) Math.toRadians(0), ArmL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*10))*-5));


        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)-1)*360/2.5+((Math.PI/180)*10))*-5), ArmR1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)-1)*360/2.5+((Math.PI/180)*10))*5), ArmR1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)-1)*360/2.5+((Math.PI/180)*90))*-5), ArmR2.rotateAngleY + (float) Math.toRadians(0), ArmR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*50))*5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-0)*2), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*110))*-5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*60))*4), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*210))*3), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*100))*-3), head1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*3), head1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*30))*-3));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*50))*0.5), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5+((Math.PI/180)*30))*4), basin1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*90))*-3), basin1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*90))*-2));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 2.5D + (((tickAnim - 10D) / 15D) * (22.5D-(2.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 22.5D + (((tickAnim - 25D) / 10D) * (-5D-(22.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (-5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -5D + (((tickAnim - 35D) / 8D) * (-30D-(-5D)));
            yy = -5D + (((tickAnim - 35D) / 8D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 35D) / 8D) * (0D-(-5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -30D + (((tickAnim - 43D) / 7D) * (0D-(-30D)));
            yy = -5D + (((tickAnim - 43D) / 7D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(upperLegL, upperLegL.rotateAngleX + (float) Math.toRadians(xx), upperLegL.rotateAngleY + (float) Math.toRadians(yy), upperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*0.5D-(-0.5D)));
            zz = -1D + (((tickAnim - 0D) / 5D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*0.5) + (((tickAnim - 5D) / 5D) * (-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*0.5D)));
            zz = -0.5D + (((tickAnim - 5D) / 5D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 10D) / 15D) * (1D-(-1D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (1D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 25D) / 10D) * (2D-(1D)));
            zz = 1D + (((tickAnim - 25D) / 10D) * (1D-(1D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            yy = 2D + (((tickAnim - 35D) / 8D) * (2D-(2D)));
            zz = 1D + (((tickAnim - 35D) / 8D) * (0D-(1D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = 2D + (((tickAnim - 43D) / 7D) * (-0.5D-(2D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (-1D-(0D)));
        }
        this.upperLegL.offsetX = (float) Math.toRadians(xx);
        this.upperLegL.offsetY = (float) Math.toRadians(yy);
        this.upperLegL.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -17.5D + (((tickAnim - 0D) / 10D) * (10D-(-17.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (22.5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 22.5D + (((tickAnim - 25D) / 10D) * (50D-(22.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 50D + (((tickAnim - 35D) / 8D) * (52.5D-(50D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 52.5D + (((tickAnim - 43D) / 7D) * (-17.5D-(52.5D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 10D) / 40D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 40D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 40D) * (0D-(0D)));
        }
        this.LegL.offsetX = (float) Math.toRadians(xx);
        this.LegL.offsetY = (float) Math.toRadians(yy);
        this.LegL.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 0D) / 10D) * (-7.5D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -7.5D + (((tickAnim - 10D) / 15D) * (47.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 47.5D + (((tickAnim - 25D) / 10D) * (72.5D-(47.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 72.5D + (((tickAnim - 35D) / 8D) * (20D-(72.5D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 20D + (((tickAnim - 43D) / 7D) * (25D-(20D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(FeetL, FeetL.rotateAngleX + (float) Math.toRadians(xx), FeetL.rotateAngleY + (float) Math.toRadians(yy), FeetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25) + (((tickAnim - 5D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 10D) / 40D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 40D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 40D) * (0D-(0D)));
        }
        this.FeetL.offsetX = (float) Math.toRadians(xx);
        this.FeetL.offsetY = (float) Math.toRadians(yy);
        this.FeetL.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 10D) / 15D) * (-90D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -90D + (((tickAnim - 25D) / 10D) * (0D-(-90D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 35D) / 8D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 30D + (((tickAnim - 43D) / 7D) * (0D-(30D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 0D) / 10D) * (-5D-(22.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -5D + (((tickAnim - 10D) / 8D) * (-30D-(-5D)));
            yy = 5D + (((tickAnim - 10D) / 8D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 10D) / 8D) * (0D-(5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -30D + (((tickAnim - 18D) / 7D) * (0D-(-30D)));
            yy = 5D + (((tickAnim - 18D) / 7D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 25D) / 10D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5D + (((tickAnim - 35D) / 15D) * (22.5D-(2.5D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(upperLegR, upperLegR.rotateAngleX + (float) Math.toRadians(xx), upperLegR.rotateAngleY + (float) Math.toRadians(yy), upperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 10D) * (2D-(1D)));
            zz = 1D + (((tickAnim - 0D) / 10D) * (1D-(1D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            yy = 2D + (((tickAnim - 10D) / 8D) * (2D-(2D)));
            zz = 1D + (((tickAnim - 10D) / 8D) * (0D-(1D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            yy = 2D + (((tickAnim - 18D) / 7D) * (-0.5D-(2D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (-1D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 25D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*0.5D-(-0.5D)));
            zz = -1D + (((tickAnim - 25D) / 5D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*0.5) + (((tickAnim - 30D) / 5D) * (-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*0.5D)));
            zz = -0.5D + (((tickAnim - 30D) / 5D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 35D) / 15D) * (1D-(-1D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (1D-(0D)));
        }
        this.upperLegR.offsetX = (float) Math.toRadians(xx);
        this.upperLegR.offsetY = (float) Math.toRadians(yy);
        this.upperLegR.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 0D) / 10D) * (50D-(22.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 50D + (((tickAnim - 10D) / 8D) * (52.5D-(50D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 52.5D + (((tickAnim - 18D) / 7D) * (-17.5D-(52.5D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -17.5D + (((tickAnim - 25D) / 10D) * (10D-(-17.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10D + (((tickAnim - 35D) / 15D) * (22.5D-(10D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25) + (((tickAnim - 30D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.offsetX = (float) Math.toRadians(xx);
        this.LegR.offsetY = (float) Math.toRadians(yy);
        this.LegR.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 47.5D + (((tickAnim - 0D) / 10D) * (72.5D-(47.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 72.5D + (((tickAnim - 10D) / 8D) * (20D-(72.5D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 20D + (((tickAnim - 18D) / 7D) * (25D-(20D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 25D + (((tickAnim - 25D) / 10D) * (-7.5D-(25D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.5D + (((tickAnim - 35D) / 15D) * (47.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(FeetR, FeetR.rotateAngleX + (float) Math.toRadians(xx), FeetR.rotateAngleY + (float) Math.toRadians(yy), FeetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25) + (((tickAnim - 30D) / 5D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 30D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetR.offsetX = (float) Math.toRadians(xx);
        this.FeetR.offsetY = (float) Math.toRadians(yy);
        this.FeetR.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -90D + (((tickAnim - 0D) / 10D) * (0D-(-90D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 10D) / 8D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 30D + (((tickAnim - 18D) / 7D) * (0D-(30D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 35D) / 15D) * (-90D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*30))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5+((Math.PI/180)*80))*-10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*30))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*90))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*90))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*90))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*120))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*150))*10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*120))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*720/2.5-((Math.PI/180)*150))*-2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*180))*8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*2.5D)*360/2.5-((Math.PI/180)*150))*-5));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSmok entity = (EntityPrehistoricFloraSmok) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25)*-5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*50))*6), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*50))*2));
        this.body1.offsetX = (float) Math.toRadians(0);
        this.body1.offsetY = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25)*0.5);
        this.body1.offsetZ = (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25)*-2);


        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25-60)*4), chest1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25-30)*-4), chest1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25)*-3));


        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25+90)*5), ArmL1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+1)*360/1.25+90)*-5), ArmL1.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.2)*720/1.25+110)*-10), ArmL2.rotateAngleY + (float) Math.toRadians(0), ArmL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*360/1.25)*-10));


        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25-((Math.PI/180)*120))*-5), ArmR1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+1)*720/1.25-((Math.PI/180)*120))*5), ArmR1.rotateAngleZ + (float) Math.toRadians(5));


        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.2)*720/1.25-((Math.PI/180)*110))*-5), ArmR2.rotateAngleY + (float) Math.toRadians(0), ArmR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)-0.1)*360/1.25)*10));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25+((Math.PI/180)*160))*-8), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25-((Math.PI/180)*100))*9), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25-((Math.PI/180)*5))*5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25+((Math.PI/180)*100))*8), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*160))*-5), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25+((Math.PI/180)*170))*3), head1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25-((Math.PI/180)*50))*-5), head1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*100))*0.5), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25+((Math.PI/180)*30))*5), basin1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*80))*-5), basin1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*80))*-2));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -42.5D + (((tickAnim - 0D) / 4D) * (0D-(-42.5D)));
            yy = -5D + (((tickAnim - 0D) / 4D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 0D) / 4D) * (0D-(-5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 4D) / 5D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 9D) / 4D) * (25D-(12.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25D + (((tickAnim - 13D) / 5D) * (15D-(25D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (-5D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 15D + (((tickAnim - 18D) / 7D) * (-42.5D-(15D)));
            yy = -5D + (((tickAnim - 18D) / 7D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 7D) * (-5D-(-5D)));
        }
        this.setRotateAngle(upperLegL, upperLegL.rotateAngleX + (float) Math.toRadians(xx), upperLegL.rotateAngleY + (float) Math.toRadians(yy), upperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 4D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (-1D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (0.5+Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*0.5D-(0D)));
            zz = -1D + (((tickAnim - 4D) / 3D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = 0.5+(Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*0.5) + (((tickAnim - 7D) / 2D) * (0D-(0.5+Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*0.5D)));
            zz = -0.5D + (((tickAnim - 7D) / 2D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 13D) / 5D) * (1D-(-1D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 18D) / 7D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        this.upperLegL.offsetX = (float) Math.toRadians(xx);
        this.upperLegL.offsetY = (float) Math.toRadians(yy);
        this.upperLegL.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 52.5D + (((tickAnim - 0D) / 4D) * (-15D-(52.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -15D + (((tickAnim - 4D) / 5D) * (-5D-(-15D)));
            yy = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 9D) / 4D) * (20D-(-5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20D + (((tickAnim - 13D) / 5D) * (42.5D-(20D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 42.5D + (((tickAnim - 18D) / 7D) * (52.5D-(42.5D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25) + (((tickAnim - 7D) / 2D) * (0D-(Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.offsetX = (float) Math.toRadians(xx);
        this.LegL.offsetY = (float) Math.toRadians(yy);
        this.LegL.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -17.5D + (((tickAnim - 0D) / 4D) * (35D-(-17.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = 35D + (((tickAnim - 4D) / 5D) * (-7.5D-(35D)));
            yy = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -7.5D + (((tickAnim - 9D) / 4D) * (42.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.5D + (((tickAnim - 13D) / 5D) * (55D-(42.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 55D + (((tickAnim - 18D) / 7D) * (-17.5D-(55D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(FeetL, FeetL.rotateAngleX + (float) Math.toRadians(xx), FeetL.rotateAngleY + (float) Math.toRadians(yy), FeetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 3D) * (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25) + (((tickAnim - 7D) / 2D) * (0D-(Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 7D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetL.offsetX = (float) Math.toRadians(xx);
        this.FeetL.offsetY = (float) Math.toRadians(yy);
        this.FeetL.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 47.5D + (((tickAnim - 0D) / 4D) * (-17.5D-(47.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -17.5D + (((tickAnim - 4D) / 5D) * (0D-(-17.5D)));
            yy = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 9D) / 4D) * (-85D-(0D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -85D + (((tickAnim - 13D) / 5D) * (2.5D-(-85D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.5D + (((tickAnim - 18D) / 7D) * (47.5D-(2.5D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25D + (((tickAnim - 0D) / 5D) * (15D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (5D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 15D + (((tickAnim - 5D) / 7D) * (-42.5D-(15D)));
            yy = 5D + (((tickAnim - 5D) / 7D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 5D) / 7D) * (5D-(5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -42.5D + (((tickAnim - 12D) / 4D) * (0D-(-42.5D)));
            yy = 5D + (((tickAnim - 12D) / 4D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 12D) / 4D) * (0D-(5D)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 16D) / 5D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 21D) / 4D) * (25D-(12.5D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(upperLegR, upperLegR.rotateAngleX + (float) Math.toRadians(xx), upperLegR.rotateAngleY + (float) Math.toRadians(yy), upperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 5D) * (1D-(-1D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 5D) / 7D) * (1D-(1D)));
            zz = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 12D) / 4D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (-1D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (0.5+Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*0.5D-(0D)));
            zz = -1D + (((tickAnim - 16D) / 2D) * (-0.5D-(-1D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            yy = 0.5+(Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*0.5) + (((tickAnim - 18D) / 3D) * (0D-(0.5+Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*0.5D)));
            zz = -0.5D + (((tickAnim - 18D) / 3D) * (0D-(-0.5D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        this.upperLegR.offsetX = (float) Math.toRadians(xx);
        this.upperLegR.offsetY = (float) Math.toRadians(yy);
        this.upperLegR.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 20D + (((tickAnim - 0D) / 5D) * (42.5D-(20D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 42.5D + (((tickAnim - 5D) / 7D) * (52.5D-(42.5D)));
            yy = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 52.5D + (((tickAnim - 12D) / 4D) * (-15D-(52.5D)));
            yy = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -15D + (((tickAnim - 16D) / 5D) * (-5D-(-15D)));
            yy = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -5D + (((tickAnim - 21D) / 4D) * (20D-(-5D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25) + (((tickAnim - 18D) / 3D) * (0D-(Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.offsetX = (float) Math.toRadians(xx);
        this.LegR.offsetY = (float) Math.toRadians(yy);
        this.LegR.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 42.5D + (((tickAnim - 0D) / 5D) * (55D-(42.5D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 55D + (((tickAnim - 5D) / 7D) * (-17.5D-(55D)));
            yy = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -17.5D + (((tickAnim - 12D) / 4D) * (35D-(-17.5D)));
            yy = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 35D + (((tickAnim - 16D) / 5D) * (-7.5D-(35D)));
            yy = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -7.5D + (((tickAnim - 21D) / 4D) * (42.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(FeetR, FeetR.rotateAngleX + (float) Math.toRadians(xx), FeetR.rotateAngleY + (float) Math.toRadians(yy), FeetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25) + (((tickAnim - 18D) / 3D) * (0D-(Math.sin((Math.PI/180)*1.25D*((double)tickAnim/25D)*360/0.2)*-0.25D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetR.offsetX = (float) Math.toRadians(xx);
        this.FeetR.offsetY = (float) Math.toRadians(yy);
        this.FeetR.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -85D + (((tickAnim - 0D) / 5D) * (2.5D-(-85D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 2.5D + (((tickAnim - 5D) / 7D) * (47.5D-(2.5D)));
            yy = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 47.5D + (((tickAnim - 12D) / 4D) * (-17.5D-(47.5D)));
            yy = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -17.5D + (((tickAnim - 16D) / 5D) * (0D-(-17.5D)));
            yy = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 21D) / 4D) * (-85D-(0D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25-((Math.PI/180)*90))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*90))*-5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*90))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25+((Math.PI/180)*30))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*50))*-5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*50))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25-((Math.PI/180)*30))*5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*30))*-5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25+((Math.PI/180)*30))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/25D)*1.25D)+0.1)*720/1.25-((Math.PI/180)*50))*5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25-((Math.PI/180)*30))*-5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*(((double)tickAnim/25D)*1.25D)*360/1.25-((Math.PI/180)*30))*-3));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSmok entity = (EntityPrehistoricFloraSmok) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*5D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-0.1) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*-0.1D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-0.1D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*-0.1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*-0.1D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.body1.offsetX = (float) Math.toRadians(xx);
        this.body1.offsetY = (float) Math.toRadians(yy);
        this.body1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10) + (((tickAnim - 0D) / 15D) * (-5+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-60)*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-60)*10D)-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-60)*-3D)-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-60)*10) + (((tickAnim - 15D) / 15D) * (0D-(-5+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-60)*10D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-60)*10)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-60)*10D))));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-60)*-3)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-60)*-3D))));
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10) + (((tickAnim - 0D) / 15D) * (-5+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-60)*20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+60)*5D)-(0D)));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10)) + (((tickAnim - 0D) / 15D) * (-10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+60)*5D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10D))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*20) + (((tickAnim - 15D) / 15D) * (0D-(-5+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*20D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*60))*5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*60))*5D))));
            zz = -10+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*5) + (((tickAnim - 15D) / 15D) * (0D-(-10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*5D)));
        }
        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(xx), ArmL1.rotateAngleY + (float) Math.toRadians(yy), ArmL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (-10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*30))*-20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*30))*5D)-(0D)));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10)) + (((tickAnim - 0D) / 15D) * (20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*30))*-10D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*30))*-20) + (((tickAnim - 15D) / 15D) * (0D-(-10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*30))*-20D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*30))*5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*30))*5))));
            zz = 20+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*30))*-10) + (((tickAnim - 15D) / 15D) * (0D-(20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*30))*-10D)));
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10) + (((tickAnim - 0D) / 15D) * (20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 20+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*10) + (((tickAnim - 15D) / 15D) * (0D-(20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*10D)));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10) + (((tickAnim - 0D) / 15D) * (-5+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*5)-(0D)));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10)) + (((tickAnim - 0D) / 15D) * (10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*60))*5D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*20) + (((tickAnim - 15D) / 15D) * (0D-(-5+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*20D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*60))*5))));
            zz = 10+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*60))*5) + (((tickAnim - 15D) / 15D) * (0D-(10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*60))*5D)));
        }
        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(xx), ArmR1.rotateAngleY + (float) Math.toRadians(yy), ArmR1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (-10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*90))*-20D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*30))*-5)-(0D)));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10)) + (((tickAnim - 0D) / 15D) * (-20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*30))*10D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*90))*-20) + (((tickAnim - 15D) / 15D) * (0D-(-10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*90))*-20D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*30))*-5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*30))*-5))));
            zz = -20+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*30))*10) + (((tickAnim - 15D) / 15D) * (0D-(-20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*30))*10D)));
        }
        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(xx), ArmR2.rotateAngleY + (float) Math.toRadians(yy), ArmR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10)) + (((tickAnim - 0D) / 15D) * (-20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*30))*-10D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-10))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = -20+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*30))*-10) + (((tickAnim - 15D) / 15D) * (0D-(-20+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5-((Math.PI/180)*30))*-10D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-30) + (((tickAnim - 0D) / 15D) * (10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*60))*-20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*-30D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5)*5)-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5)*3)-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*60))*-20) + (((tickAnim - 15D) / 15D) * (0D-(10+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5+((Math.PI/180)*60))*-20D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5)*5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5)*5))));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5)*3)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5)*3))));
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1+((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*10 )-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*3)-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1+((Math.PI/180)*60))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1+((Math.PI/180)*60))*10D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*10 )) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*10 ))));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*3)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*3))));
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10) + (((tickAnim - 0D) / 15D) * (-25+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*80))*20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*5)-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*3)-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -25+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*80))*20) + (((tickAnim - 15D) / 15D) * (0D-(-25+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5-((Math.PI/180)*80))*20D)));
            yy = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*5))));
            zz = -((Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*3)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*720/1.5+((Math.PI/180)*60))*3))));
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1)*30) + (((tickAnim - 0D) / 10D) * (35+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1-((Math.PI/180)*10))*40D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1)*30D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35+(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1-((Math.PI/180)*10))*40) + (((tickAnim - 10D) / 10D) * (0D-(35+Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1-((Math.PI/180)*10))*40D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-20) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1-((Math.PI/180)*100))*-20D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.5)*-20D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1-((Math.PI/180)*100))*-20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1-((Math.PI/180)*100))*-20D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(gums1, gums1.rotateAngleX + (float) Math.toRadians(xx), gums1.rotateAngleY + (float) Math.toRadians(yy), gums1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*-5D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*180/0.75)*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*1.5D*((double)tickAnim/30D)*360/1.5)*-5D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(xx), basin1.rotateAngleY + (float) Math.toRadians(yy), basin1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSmok entity = (EntityPrehistoricFloraSmok) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-5) + (((tickAnim - 15D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*-5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-5D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*-5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-0.5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*0.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-0.5D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*0.5) + (((tickAnim - 15D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*0.5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*0.5D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*0.5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*0.5D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.body1.offsetX = (float) Math.toRadians(xx);
        this.body1.offsetY = (float) Math.toRadians(yy);
        this.body1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-10) + (((tickAnim - 0D) / 15D) * (-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-30)*20D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*30))*20) + (((tickAnim - 15D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*50))*5D-(-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*30))*20D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*50))*5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*50))*5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10) + (((tickAnim - 0D) / 15D) * (20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*25D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-10)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*10)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-10))));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*25) + (((tickAnim - 15D) / 15D) * (-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*10D-(20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*25D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*10)) + (((tickAnim - 15D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*10))));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*10D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5)) + (((tickAnim - 30D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5))));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(xx), ArmL1.rotateAngleY + (float) Math.toRadians(yy), ArmL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-15) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*20D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-15D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-5)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*5)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-5))));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*20) + (((tickAnim - 15D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*-10D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*20D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*5)) + (((tickAnim - 15D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*5))));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*-10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*-10D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5)) + (((tickAnim - 30D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5))));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-15)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*20)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-15))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*20)) + (((tickAnim - 15D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*-10)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*20))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*-10)) + (((tickAnim - 30D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*-10))));
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10) + (((tickAnim - 0D) / 15D) * (-20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*25D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*10)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*10)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*10))));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -20+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*25) + (((tickAnim - 15D) / 15D) * (10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*10D-(-20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*25D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*10)) + (((tickAnim - 15D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-5)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*10))));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*10) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*10D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-5)) + (((tickAnim - 30D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-5))));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(xx), ArmR1.rotateAngleY + (float) Math.toRadians(yy), ArmR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10) + (((tickAnim - 0D) / 15D) * (20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*-30D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-10)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*-10)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*-10))));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*-30) + (((tickAnim - 15D) / 15D) * (-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-15D-(20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*-30D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*-10)) + (((tickAnim - 15D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-5)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*-10))));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-15) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-15D)));
            yy = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-5)) + (((tickAnim - 30D) / 10D) * (0D-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*-5))));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(xx), ArmR2.rotateAngleY + (float) Math.toRadians(yy), ArmR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*15)-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10))));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = -((Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*15)) + (((tickAnim - 15D) / 15D) * (-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*10D-(-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*90))*15))));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = -10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*80))*10D)));
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-10) + (((tickAnim - 0D) / 15D) * (25+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*60))*25D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 25+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*60))*25) + (((tickAnim - 15D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*10D-(25+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5-((Math.PI/180)*60))*25D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*10) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-10) + (((tickAnim - 0D) / 15D) * (5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*80))*25D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*80))*25) + (((tickAnim - 15D) / 15D) * (-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*50))*-10D-(5+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*80))*25D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*50))*-10) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*50))*-10D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10) + (((tickAnim - 0D) / 15D) * (20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*25D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*25) + (((tickAnim - 15D) / 15D) * (-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5D-(20+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*90))*25D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5) + (((tickAnim - 30D) / 10D) * (0D-(-10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5+((Math.PI/180)*80))*5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10) + (((tickAnim - 0D) / 15D) * (40+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*60))*40D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*10D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 40+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*60))*40) + (((tickAnim - 15D) / 15D) * (10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*30))*-5D-(40+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5+((Math.PI/180)*60))*40D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*30))*-5) + (((tickAnim - 30D) / 10D) * (0D-(10+Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5-((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.75)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*5) + (((tickAnim - 15D) / 15D) * (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*5D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/1.5)*5D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*5) + (((tickAnim - 30D) / 10D) * (0D-(Math.sin((Math.PI/180)*2D*((double)tickAnim/40D)*360/0.5)*5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(xx), basin1.rotateAngleY + (float) Math.toRadians(yy), basin1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSmok e = (EntityPrehistoricFloraSmok) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

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

        /*
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
 */

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

        animator.setAnimation(e.HURT_ANIMATION);
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
