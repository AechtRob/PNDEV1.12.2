package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPostosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPostosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended chest1;
    private final AdvancedModelRendererExtended ArmR1;
    private final AdvancedModelRendererExtended ArmR2;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended ArmL1;
    private final AdvancedModelRendererExtended ArmL2;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended head1;
    private final AdvancedModelRendererExtended jaw1;
    private final AdvancedModelRendererExtended jaw2_r1;
    private final AdvancedModelRendererExtended jaw1_r1;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended jaw3;
    private final AdvancedModelRendererExtended underteeth2;
    private final AdvancedModelRendererExtended jaw4;
    private final AdvancedModelRendererExtended underteeth1;
    private final AdvancedModelRendererExtended gums1;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended head4_r1;
    private final AdvancedModelRendererExtended head5_r1;
    private final AdvancedModelRendererExtended crestr;
    private final AdvancedModelRendererExtended crestr2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended crestl;
    private final AdvancedModelRendererExtended crestl2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended teeth2;
    private final AdvancedModelRendererExtended teeth1;
    private final AdvancedModelRendererExtended chestosteoderms2;
    private final AdvancedModelRendererExtended chestosteoderms1;
    private final AdvancedModelRendererExtended basin1;
    private final AdvancedModelRendererExtended upperLegR;
    private final AdvancedModelRendererExtended LegR;
    private final AdvancedModelRendererExtended FeetR;
    private final AdvancedModelRendererExtended ToesR;
    private final AdvancedModelRendererExtended upperLegL;
    private final AdvancedModelRendererExtended LegL;
    private final AdvancedModelRendererExtended FeetL;
    private final AdvancedModelRendererExtended ToesL;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail2osteoderme1;
    private final AdvancedModelRendererExtended tail2osteoderme2;
    private final AdvancedModelRendererExtended tail1osteoderme1;
    private final AdvancedModelRendererExtended tai1losteoderme2;
    private final AdvancedModelRendererExtended basinosteoderme2;
    private final AdvancedModelRendererExtended basinosteoderme1;
    private final AdvancedModelRendererExtended osteoderms1;
    private final AdvancedModelRendererExtended osteoderms2;

    private ModelAnimator animator;

    public ModelPostosuchus() {
        this.textureWidth = 230;
        this.textureHeight = 120;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, -7.6F, -0.1F);
        this.root.addChild(body1);
        this.setRotateAngle(body1, -0.0911F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -6.5F, -2.0F, -7.0F, 13, 16, 14, 0.0F, false));

        this.chest1 = new AdvancedModelRendererExtended(this);
        this.chest1.setRotationPoint(0.0F, 1.1F, -6.2F);
        this.body1.addChild(chest1);
        this.setRotateAngle(chest1, 0.182F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 54, 0, -5.5F, -3.0F, -16.0F, 11, 16, 16, 0.0F, false));

        this.ArmR1 = new AdvancedModelRendererExtended(this);
        this.ArmR1.setRotationPoint(-3.9F, 9.4F, -10.9F);
        this.chest1.addChild(ArmR1);
        this.setRotateAngle(ArmR1, 0.5918F, 0.0F, 0.1396F);
        this.ArmR1.cubeList.add(new ModelBox(ArmR1, 47, 33, -1.5F, -1.0F, -2.5F, 3, 9, 5, 0.0F, false));

        this.ArmR2 = new AdvancedModelRendererExtended(this);
        this.ArmR2.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.ArmR1.addChild(ArmR2);
        this.setRotateAngle(ArmR2, -0.5463F, 0.0F, 0.0F);
        this.ArmR2.cubeList.add(new ModelBox(ArmR2, 57, 49, -1.0F, 0.0F, -2.0F, 2, 8, 4, 0.0F, false));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.ArmR2.addChild(HandR);
        this.setRotateAngle(HandR, -0.0044F, 0.0F, -0.1745F);
        this.HandR.cubeList.add(new ModelBox(HandR, 69, 63, -1.0F, 0.0F, -2.0F, 2, 5, 4, 0.0F, false));

        this.ArmL1 = new AdvancedModelRendererExtended(this);
        this.ArmL1.setRotationPoint(3.9F, 9.4F, -10.9F);
        this.chest1.addChild(ArmL1);
        this.setRotateAngle(ArmL1, 0.5918F, 0.0F, -0.1396F);
        this.ArmL1.cubeList.add(new ModelBox(ArmL1, 65, 33, -1.5F, -1.0F, -2.5F, 3, 9, 5, 0.0F, false));

        this.ArmL2 = new AdvancedModelRendererExtended(this);
        this.ArmL2.setRotationPoint(0.0F, 6.5F, 0.7F);
        this.ArmL1.addChild(ArmL2);
        this.setRotateAngle(ArmL2, -0.5463F, 0.0F, 0.0F);
        this.ArmL2.cubeList.add(new ModelBox(ArmL2, 72, 49, -1.0F, 0.0F, -2.0F, 2, 8, 4, 0.0F, false));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(0.0F, 7.3F, 0.0F);
        this.ArmL2.addChild(HandL);
        this.setRotateAngle(HandL, -0.0044F, 0.0F, 0.1745F);
        this.HandL.cubeList.add(new ModelBox(HandL, 79, 69, -1.0F, 0.0F, -2.0F, 2, 5, 4, 0.0F, false));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, 2.1F, -13.5F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.3643F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 108, 0, -3.5F, -5.5F, -12.0F, 7, 12, 12, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -9.8F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, 0.2731F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 147, 1, -3.0F, -5.7F, -10.0F, 6, 11, 10, 0.0F, false));

        this.head1 = new AdvancedModelRendererExtended(this);
        this.head1.setRotationPoint(0.0F, -1.4F, -7.6F);
        this.neck2.addChild(head1);
        this.setRotateAngle(head1, 0.0436F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 100, 30, -4.0F, -4.0F, -8.0F, 8, 7, 8, 0.0F, false));

        this.jaw1 = new AdvancedModelRendererExtended(this);
        this.jaw1.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.1484F, 0.0F, 0.0F);


        this.jaw2_r1 = new AdvancedModelRendererExtended(this);
        this.jaw2_r1.setRotationPoint(0.0F, 3.95F, -7.55F);
        this.jaw1.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, 0.1309F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 196, 46, -4.0F, -0.9F, -0.175F, 8, 1, 8, -0.015F, false));

        this.jaw1_r1 = new AdvancedModelRendererExtended(this);
        this.jaw1_r1.setRotationPoint(0.0F, 26.7F, 37.2F);
        this.jaw1.addChild(jaw1_r1);
        this.setRotateAngle(jaw1_r1, 0.0436F, 0.0F, 0.0F);
        this.jaw1_r1.cubeList.add(new ModelBox(jaw1_r1, 90, 48, -4.0F, -28.45F, -43.95F, 8, 3, 8, -0.01F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(0.0F, 1.5F, -8.4F);
        this.jaw1.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.3927F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 115, 46, -2.0F, -1.0F, -5.975F, 4, 2, 7, 0.0F, false));

        this.jaw3 = new AdvancedModelRendererExtended(this);
        this.jaw3.setRotationPoint(0.0F, -1.15F, -7.55F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.5236F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 131, 46, -1.5F, -1.0F, -2.2F, 3, 2, 2, 0.0F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 137, 77, -2.0F, -1.0F, -0.375F, 4, 2, 2, -0.01F, false));
        this.jaw3.cubeList.add(new ModelBox(jaw3, 137, 77, -2.0F, -1.0F, 0.425F, 4, 2, 2, -0.0175F, false));

        this.underteeth2 = new AdvancedModelRendererExtended(this);
        this.underteeth2.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.jaw3.addChild(underteeth2);
        this.underteeth2.cubeList.add(new ModelBox(underteeth2, 101, 69, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.jaw4 = new AdvancedModelRendererExtended(this);
        this.jaw4.setRotationPoint(0.0F, 1.95F, -0.95F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.2862F, 0.0F, 0.0F);
        this.jaw4.cubeList.add(new ModelBox(jaw4, 81, 45, -1.5F, -0.5F, -5.0F, 3, 1, 5, 0.0F, false));
        this.jaw4.cubeList.add(new ModelBox(jaw4, 215, 91, -1.5F, -1.5F, -2.0F, 3, 2, 3, -0.01F, false));

        this.underteeth1 = new AdvancedModelRendererExtended(this);
        this.underteeth1.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.jaw2.addChild(underteeth1);
        this.underteeth1.cubeList.add(new ModelBox(underteeth1, 88, 60, -2.0F, -1.75F, -5.225F, 4, 2, 6, -0.015F, false));
        this.underteeth1.cubeList.add(new ModelBox(underteeth1, 191, 112, -2.0F, -0.75F, 0.775F, 4, 1, 2, -0.01F, false));

        this.gums1 = new AdvancedModelRendererExtended(this);
        this.gums1.setRotationPoint(0.0F, 0.8F, -3.4F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, 0.1033F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 42, 0, -3.0F, -6.85F, -2.5F, 6, 7, 5, -0.01F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(0.0F, 0.5F, -9.6F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, 0.1361F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 125, 25, -2.5F, -2.5F, -7.0F, 5, 5, 7, 0.0F, false));
        this.head2.cubeList.add(new ModelBox(head2, 112, 83, -2.5F, -2.5F, 0.0F, 5, 5, 2, 0.0F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -1.35F, 1.925F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, 0.1056F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 83, 70, -1.5F, -2.5F, -11.0F, 3, 2, 10, 0.0F, false));

        this.head4_r1 = new AdvancedModelRendererExtended(this);
        this.head4_r1.setRotationPoint(0.0F, -2.45F, -1.0F);
        this.head3.addChild(head4_r1);
        this.setRotateAngle(head4_r1, 0.0436F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 124, 78, -1.5F, -0.05F, 0.0F, 3, 2, 2, 0.01F, false));

        this.head5_r1 = new AdvancedModelRendererExtended(this);
        this.head5_r1.setRotationPoint(0.0F, 31.3F, 44.8F);
        this.head3.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.0436F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 202, 10, 1.0F, -36.3F, -50.5F, 0, 1, 8, 0.0F, true));
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 202, 10, -1.0F, -36.3F, -50.5F, 0, 1, 8, 0.0F, false));

        this.crestr = new AdvancedModelRendererExtended(this);
        this.crestr.setRotationPoint(-1.5F, -2.5F, -3.0F);
        this.head3.addChild(crestr);
        this.setRotateAngle(crestr, -0.0903F, -0.698F, 0.005F);
        this.crestr.cubeList.add(new ModelBox(crestr, 63, 91, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.crestr2 = new AdvancedModelRendererExtended(this);
        this.crestr2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.crestr.addChild(crestr2);
        this.setRotateAngle(crestr2, -0.1674F, 0.5263F, 0.0234F);
        this.crestr2.cubeList.add(new ModelBox(crestr2, 87, 89, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.crestr2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 99, 91, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.crestl = new AdvancedModelRendererExtended(this);
        this.crestl.setRotationPoint(1.5F, -2.5F, -3.0F);
        this.head3.addChild(crestl);
        this.setRotateAngle(crestl, -0.0467F, 0.698F, -0.005F);
        this.crestl.cubeList.add(new ModelBox(crestl, 63, 91, -3.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.crestl2 = new AdvancedModelRendererExtended(this);
        this.crestl2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.crestl.addChild(crestl2);
        this.setRotateAngle(crestl2, -0.211F, -0.5263F, -0.0234F);
        this.crestl2.cubeList.add(new ModelBox(crestl2, 87, 89, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.crestl2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, -0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 91, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, -0.3F, -6.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -0.1367F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 143, 24, -2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F, false));

        this.teeth2 = new AdvancedModelRendererExtended(this);
        this.teeth2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head4.addChild(teeth2);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 115, 69, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.teeth1 = new AdvancedModelRendererExtended(this);
        this.teeth1.setRotationPoint(0.0F, 2.5F, -1.0F);
        this.head2.addChild(teeth1);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 110, 60, -2.5F, 0.0F, -6.0F, 5, 2, 6, 0.0F, false));
        this.teeth1.cubeList.add(new ModelBox(teeth1, 192, 107, -2.5F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

        this.chestosteoderms2 = new AdvancedModelRendererExtended(this);
        this.chestosteoderms2.setRotationPoint(1.5F, -2.5F, -1.6F);
        this.chest1.addChild(chestosteoderms2);
        this.setRotateAngle(chestosteoderms2, 0.0017F, 0.0F, 0.0F);
        this.chestosteoderms2.cubeList.add(new ModelBox(chestosteoderms2, 72, 93, -2.5F, -2.0F, -13.0F, 5, 2, 14, 0.0F, false));

        this.chestosteoderms1 = new AdvancedModelRendererExtended(this);
        this.chestosteoderms1.setRotationPoint(-1.5F, -2.5F, -1.6F);
        this.chest1.addChild(chestosteoderms1);
        this.chestosteoderms1.cubeList.add(new ModelBox(chestosteoderms1, 72, 93, -2.5F, -2.0F, -13.0F, 5, 2, 14, 0.0F, false));

        this.basin1 = new AdvancedModelRendererExtended(this);
        this.basin1.setRotationPoint(0.0F, -0.2F, 7.9F);
        this.body1.addChild(basin1);
        this.setRotateAngle(basin1, 0.0456F, 0.0F, 0.0F);
        this.basin1.cubeList.add(new ModelBox(basin1, 0, 32, -6.0F, -1.5F, -1.5F, 12, 14, 11, 0.0F, false));

        this.upperLegR = new AdvancedModelRendererExtended(this);
        this.upperLegR.setRotationPoint(-5.4F, 4.9F, 4.4F);
        this.basin1.addChild(upperLegR);
        this.setRotateAngle(upperLegR, -0.4554F, 0.0F, 0.0F);
        this.upperLegR.cubeList.add(new ModelBox(upperLegR, 0, 58, -2.5F, -1.0F, -4.0F, 5, 15, 11, 0.0F, false));

        this.LegR = new AdvancedModelRendererExtended(this);
        this.LegR.setRotationPoint(0.0F, 12.0F, -0.4F);
        this.upperLegR.addChild(LegR);
        this.setRotateAngle(LegR, 0.5918F, 0.0F, 0.0F);
        this.LegR.cubeList.add(new ModelBox(LegR, 0, 87, -2.0F, 0.0F, -3.5F, 4, 15, 7, 0.0F, false));

        this.FeetR = new AdvancedModelRendererExtended(this);
        this.FeetR.setRotationPoint(0.0F, 14.8F, 0.0F);
        this.LegR.addChild(FeetR);
        this.setRotateAngle(FeetR, -0.0911F, 0.0F, 0.0F);
        this.FeetR.cubeList.add(new ModelBox(FeetR, 198, 62, -3.0F, -1.5F, -8.0F, 6, 3, 10, 0.0F, false));

        this.ToesR = new AdvancedModelRendererExtended(this);
        this.ToesR.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.FeetR.addChild(ToesR);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 20, 108, -3.0F, -1.5F, -3.0F, 6, 3, 3, 0.0F, false));

        this.upperLegL = new AdvancedModelRendererExtended(this);
        this.upperLegL.setRotationPoint(5.4F, 4.9F, 4.4F);
        this.basin1.addChild(upperLegL);
        this.setRotateAngle(upperLegL, -0.4554F, 0.0F, 0.0F);
        this.upperLegL.cubeList.add(new ModelBox(upperLegL, 35, 58, -2.5F, -1.0F, -4.0F, 5, 15, 11, 0.0F, false));

        this.LegL = new AdvancedModelRendererExtended(this);
        this.LegL.setRotationPoint(0.0F, 12.0F, -0.4F);
        this.upperLegL.addChild(LegL);
        this.setRotateAngle(LegL, 0.5918F, 0.0F, 0.0F);
        this.LegL.cubeList.add(new ModelBox(LegL, 36, 87, -2.0F, 0.0F, -3.5F, 4, 15, 7, 0.0F, false));

        this.FeetL = new AdvancedModelRendererExtended(this);
        this.FeetL.setRotationPoint(0.0F, 14.8F, 0.0F);
        this.LegL.addChild(FeetL);
        this.setRotateAngle(FeetL, -0.0911F, 0.0F, 0.0F);
        this.FeetL.cubeList.add(new ModelBox(FeetL, 198, 62, -3.0F, -1.5F, -8.0F, 6, 3, 10, 0.0F, true));

        this.ToesL = new AdvancedModelRendererExtended(this);
        this.ToesL.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.FeetL.addChild(ToesL);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 20, 108, -3.0F, -1.5F, -3.0F, 6, 3, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 4.6F, 9.4F);
        this.basin1.addChild(tail1);
        this.setRotateAngle(tail1, 0.0456F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 160, 5, -4.5F, -5.5F, -1.0F, 9, 11, 20, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 18.1F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 134, 44, -3.0F, -4.5F, -1.0F, 6, 9, 20, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.6F, 16.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0911F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 167, 37, -2.0F, -3.5F, 0.0F, 4, 6, 19, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 17.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 169, 63, -1.5F, -2.5F, 0.0F, 3, 4, 17, 0.0F, false));

        this.tail2osteoderme1 = new AdvancedModelRendererExtended(this);
        this.tail2osteoderme1.setRotationPoint(-0.6F, -3.7F, 0.5F);
        this.tail2.addChild(tail2osteoderme1);
        this.tail2osteoderme1.cubeList.add(new ModelBox(tail2osteoderme1, 47, 98, -1.5F, -2.0F, 0.0F, 3, 2, 18, 0.0F, false));

        this.tail2osteoderme2 = new AdvancedModelRendererExtended(this);
        this.tail2osteoderme2.setRotationPoint(0.6F, -3.7F, 0.5F);
        this.tail2.addChild(tail2osteoderme2);
        this.tail2osteoderme2.cubeList.add(new ModelBox(tail2osteoderme2, 47, 98, -1.5F, -2.0F, 0.0F, 3, 2, 18, 0.0F, false));

        this.tail1osteoderme1 = new AdvancedModelRendererExtended(this);
        this.tail1osteoderme1.setRotationPoint(-1.0F, -4.8F, 0.5F);
        this.tail1.addChild(tail1osteoderme1);
        this.tail1osteoderme1.cubeList.add(new ModelBox(tail1osteoderme1, 143, 88, -2.5F, -2.0F, 0.0F, 5, 2, 18, 0.0F, false));

        this.tai1losteoderme2 = new AdvancedModelRendererExtended(this);
        this.tai1losteoderme2.setRotationPoint(1.0F, -4.8F, 0.5F);
        this.tail1.addChild(tai1losteoderme2);
        this.tai1losteoderme2.cubeList.add(new ModelBox(tai1losteoderme2, 143, 88, -2.5F, -2.0F, 0.0F, 5, 2, 18, 0.0F, false));

        this.basinosteoderme2 = new AdvancedModelRendererExtended(this);
        this.basinosteoderme2.setRotationPoint(1.2F, -0.8F, -0.9F);
        this.basin1.addChild(basinosteoderme2);
        this.basinosteoderme2.cubeList.add(new ModelBox(basinosteoderme2, 98, 90, -2.5F, -2.0F, 0.0F, 5, 2, 10, 0.0F, false));

        this.basinosteoderme1 = new AdvancedModelRendererExtended(this);
        this.basinosteoderme1.setRotationPoint(-1.2F, -0.8F, -0.9F);
        this.basin1.addChild(basinosteoderme1);
        this.basinosteoderme1.cubeList.add(new ModelBox(basinosteoderme1, 98, 90, -2.5F, -2.0F, 0.0F, 5, 2, 10, 0.0F, false));

        this.osteoderms1 = new AdvancedModelRendererExtended(this);
        this.osteoderms1.setRotationPoint(1.6F, -1.7F, 0.0F);
        this.body1.addChild(osteoderms1);
        this.osteoderms1.cubeList.add(new ModelBox(osteoderms1, 120, 90, -3.5F, -2.0F, -6.5F, 7, 2, 13, 0.0F, false));

        this.osteoderms2 = new AdvancedModelRendererExtended(this);
        this.osteoderms2.setRotationPoint(-1.6F, -1.7F, 0.0F);
        this.body1.addChild(osteoderms2);
        this.osteoderms2.cubeList.add(new ModelBox(osteoderms2, 120, 90, -3.5F, -2.0F, -6.5F, 7, 2, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body1.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.head1.rotateAngleX = (float) Math.toRadians(-14.9);
        this.jaw1.rotateAngleX = (float) Math.toRadians(42.5);
        this.chest1.offsetX = 0F;
        this.chest1.offsetZ = 0.03F;
        this.chest1.offsetY = -0.06F;
        this.chest1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body1, 0.2143F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(chest1, -0.0363F, 0.0872F, -0.0032F);
        this.setRotateAngle(ArmL1, 0.5558F, 0.2152F, -0.4707F);
        this.setRotateAngle(ArmL2, -1.1135F, 0.0F, 0.0F);
        this.setRotateAngle(HandL, -0.0044F, 0.0F, -0.1745F);
        this.setRotateAngle(ArmR1, 0.7664F, 0.0F, 0.1396F);
        this.setRotateAngle(ArmR2, -1.0699F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, -0.0044F, 0.0F, 0.1745F);
        this.setRotateAngle(neck1, -0.1904F, 0.0857F, -0.0165F);
        this.setRotateAngle(neck2, -0.2086F, 0.1281F, -0.027F);
        this.setRotateAngle(head1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(jaw1, 0.5934F, 0.0F, 0.0F);
        this.setRotateAngle(jaw2, 0.12F, 0.0F, 0.0F);
        this.setRotateAngle(jaw3, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(jaw4, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(gums1, -0.1585F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.1361F, 0.0F, 0.0F);
        this.setRotateAngle(head3, 0.1056F, 0.0F, 0.0F);
        this.setRotateAngle(head4, -0.1367F, 0.0F, 0.0F);
        this.setRotateAngle(chestosteoderms1, 0.0017F, 0.0F, 0.0F);
        this.setRotateAngle(basin1, -0.0428F, 0.0F, -0.0079F);
        this.setRotateAngle(upperLegL, -0.5863F, 0.0F, 0.0F);
        this.setRotateAngle(LegL, 0.4609F, 0.0F, 0.0F);
        this.setRotateAngle(FeetL, 0.258F, 0.0F, 0.0F);
        this.setRotateAngle(upperLegR, -0.0627F, 0.0F, 0.0F);
        this.setRotateAngle(LegR, 1.0282F, 0.0F, 0.0F);
        this.setRotateAngle(FeetR, 0.2143F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.09F, -0.1304F, -0.0117F);
        this.setRotateAngle(tail2, -0.2181F, -0.1278F, 0.0282F);
        this.setRotateAngle(tail3, -0.2253F, 0.1702F, -0.0388F);
        this.setRotateAngle(tail4, -0.1864F, 0.2145F, -0.0401F);
        this.body1.offsetY = -0.14F;
        this.body1.offsetX = -0.07F;
        this.body1.offsetZ = 0.04F;
        this.body1.render(0.01F);
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
        //this.body1.offsetY = 0F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraPostosuchus Postosuchus = (EntityPrehistoricFloraPostosuchus) e;
        float masterSpeed = Postosuchus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck1);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, head1);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.head1};
        Postosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.ArmL1, this.ArmL2};
        AdvancedModelRenderer[] ArmR = {this.ArmR1, this.ArmR2};

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
                if (Postosuchus.getIsSneaking()) {

                }
                else { //normal run:

                }

//                float speed = masterSpeed / 3F;
//                //this.basin.offsetY = 0.75F;
//                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 3, f2, 1.5F);
//                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.825), false, 0, f2, 1.5F);
//
//                this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(20), 0.5, 8, f2, 1F);
//                this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(20), 0.5, 5, f2, 1F);
//
//
//                //---
//                this.walk(upperleg2, speed, (float)Math.toRadians(40), true, 8.0F, -(float)Math.toRadians(28), f2, 1.0F);
//                this.walk(upperleg1, speed, (float)Math.toRadians(40), true, 5.0F, -(float)Math.toRadians(28), f2, 1.0F);
//
//                this.walk(leg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
//                this.walk(leg1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);
//
//                this.walk(feet2, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
//                this.walk(feet1, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);
//
//                //this.walk(toes1_1, speed, -0.6F, true, 4.5F, -0.535F, f2, 1F);
//                //this.walk(toes1, speed, -0.6F, true, 1.5F, -0.535F, f2, 1F);
//
//                this.bobExtended(body1, speed * 2F, 1.23F, false, 3.5F, f2, 1F);
//
//                this.bobExtended(leg2, speed, 0.8F, false, 3.0F, f2, 1F);
//                this.bobExtended(leg1, speed, 0.8F, false, 0.0F, f2, 1F);
//
//                this.flap(basin1, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
//                this.flap(body1, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
//                this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
//                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);
//
//                this.flap(upperleg2, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
//                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
//
//                this.walk(body1, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
//                this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);
//
//                this.body1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;
//
//                //---
//
//
//                this.walk(neck1, speed * 4, -0.1F, false, 2.5F, 0F, f2, 0.5F);
//                this.walk(neck2, speed * 4, -0.04F, false, 2.5F, 0F, f2, 0.5F);
//                this.walk(head1, speed * 4, 0.1F, false, 2.5F, 0F, f2, 0.5F);
//
//                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
//                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking



//                float speed = masterSpeed / 2.50F;
//                //this.basin.offsetY = 0.815F;
//                this.upperleg2.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 3, f2, 1.5F);
//                this.upperleg1.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.325), false, 0, f2, 1.5F);
//
//                this.chainWaveExtended(ArmL, speed, -(float)Math.toRadians(10), 0.5, 8, f2, 1F);
//                this.chainWaveExtended(ArmR, speed, -(float)Math.toRadians(10), 0.5, 5, f2, 1F);
//
//                this.walk(upperleg2, speed, (float)Math.toRadians(35), true, 8.0F, -(float)Math.toRadians(20), f2, 1.0F);
//                this.walk(upperleg1, speed, (float)Math.toRadians(35), true, 5.0F, -(float)Math.toRadians(20), f2, 1.0F);
//
//                this.walk(leg2, speed, 0.36F, true, 6.5F, 0F, f2, 1F);
//                this.walk(leg1, speed, 0.36F, true, 3.5F, 0F, f2, 1F);
//
//                this.walk(feet2, speed, (float)Math.toRadians(25), false, 4.0F, (float)Math.toRadians(15), f2, 1F);
//                this.walk(feet1, speed, (float)Math.toRadians(25), false, 1.0F, (float)Math.toRadians(15), f2, 1F);
//
//                //this.walk(toes1_1, speed, -0.6F, true, 4.5F, -0.535F, f2, 0.8F);
//                //this.walk(toes1, speed, -0.6F, true, 1.5F, -0.535F, f2, 0.8F);
//
//                this.bobExtended(body1, speed * 2F, 0.83F, false, 3.5F, f2, 1F);
//
//                this.bobExtended(leg2, speed, 0.8F, false, 3.0F, f2, 1F);
//                this.bobExtended(leg1, speed, 0.8F, false, 0.0F, f2, 1F);
//
//                this.flap(basin1, speed, 0.08F, false, 6.0F, 0.03F, f2, 1.0F);
//                this.flap(body1, speed, -0.08F, false, 6.0F, -0.03F, f2, 1.0F);
//                this.flap(chest1, speed, -0.06F, false, 6.0F, -0.02F, f2, 1.0F);
//                this.flap(neck1, speed, 0.06F, false, 6.0F, 0.02F, f2, 1.0F);
//
//                this.flap(upperleg2, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
//                this.flap(upperleg1, speed, -0.08F, false, 6.0F, -0.04F, f2, 1.0F);
//
//                this.walk(body1, speed * 2, 0.009F, false, 2.5F, -0.01F, f2, 0.8F);
//                this.walk(chest1, speed * 2, 0.025F, false, 2.5F, -0.01F, f2, 0.8F);
//
//                this.walk(neck1, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
//                this.walk(neck2, speed * 0.5F, -0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
//                this.walk(head1, speed * 0.5F, 0.10F * 2.25F, false, 2.5F, 0F, f2, 0.9F);
//
//                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
//                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);
//
//                this.body1.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.0), false, 1.75F, f2, 1) + 0.2F;

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
        EntityPrehistoricFloraPostosuchus ee = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    if (ee.getIsSneaking()) {
                        animSneaking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) { // not present
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) { // not present
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim - LLibrary is done below
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*-3), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-5), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-3));
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(0);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*-0.5);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(0);


        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*-2), chest1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*-5), chest1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+20))*3));


        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/2.5-50)*5), ArmR1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/2.5-50)*5), ArmR1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/2.5-50)*-10 ), ArmR2.rotateAngleY + (float) Math.toRadians(0), ArmR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+10))*-5));


        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/2.5+10)*-5), ArmL1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/2.5+10)*5), ArmL1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-1))*360/2.5+90)*-10 ), ArmL2.rotateAngleY + (float) Math.toRadians(0), ArmL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-0))*2), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+110))*5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*4), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+210))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+100))*-3), head1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-3), head1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*3));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*1), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*4), basin1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+80))*-3), basin1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+80))*2));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 10) / 15) * (22.5-(2.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 22.5 + (((tickAnim - 25) / 10) * (-12.5-(22.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -12.5 + (((tickAnim - 35) / 8) * (-30-(-12.5)));
            yy = 5 + (((tickAnim - 35) / 8) * (5-(5)));
            zz = 5 + (((tickAnim - 35) / 8) * (0-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -30 + (((tickAnim - 43) / 7) * (0-(-30)));
            yy = 5 + (((tickAnim - 43) / 7) * (0-(5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperLegR, upperLegR.rotateAngleX + (float) Math.toRadians(xx), upperLegR.rotateAngleY + (float) Math.toRadians(yy), upperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5-(0)));
            zz = -1 + (((tickAnim - 0) / 5) * (-0.5-(-1)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5)));
            zz = -0.5 + (((tickAnim - 5) / 5) * (0-(-0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (1-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 25) / 10) * (2-(1)));
            zz = 1 + (((tickAnim - 25) / 10) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 2 + (((tickAnim - 35) / 8) * (2-(2)));
            zz = 1 + (((tickAnim - 35) / 8) * (0-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 43) / 7) * (0-(2)));
            zz = 0 + (((tickAnim - 43) / 7) * (-1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperLegR.rotationPointX = this.upperLegR.rotationPointX + (float)(xx);
        this.upperLegR.rotationPointY = this.upperLegR.rotationPointY - (float)(yy);
        this.upperLegR.rotationPointZ = this.upperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 0) / 10) * (10-(-20)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10 + (((tickAnim - 10) / 15) * (47.5-(10)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 47.5 + (((tickAnim - 25) / 10) * (65-(47.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 65 + (((tickAnim - 35) / 8) * (62.5-(65)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 62.5 + (((tickAnim - 43) / 7) * (-20-(62.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 0) / 10) * (-12.5-(30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 10) / 15) * (22.5-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 22.5 + (((tickAnim - 25) / 10) * (72.5-(22.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 72.5 + (((tickAnim - 35) / 8) * (-20-(72.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -20 + (((tickAnim - 43) / 7) * (30-(-20)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FeetR, FeetR.rotateAngleX + (float) Math.toRadians(xx), FeetR.rotateAngleY + (float) Math.toRadians(yy), FeetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 5) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetR.rotationPointX = this.FeetR.rotationPointX + (float)(xx);
        this.FeetR.rotationPointY = this.FeetR.rotationPointY - (float)(yy);
        this.FeetR.rotationPointZ = this.FeetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (-12.5-(22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 10) / 8) * (-30-(-12.5)));
            yy = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
            zz = -5 + (((tickAnim - 10) / 8) * (0-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 18) / 7) * (0-(-30)));
            yy = -5 + (((tickAnim - 18) / 7) * (0-(-5)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 35) / 15) * (22.5-(2.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperLegL, upperLegL.rotateAngleX + (float) Math.toRadians(xx), upperLegL.rotateAngleY + (float) Math.toRadians(yy), upperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 10) * (2-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 2 + (((tickAnim - 10) / 8) * (2-(2)));
            zz = 1 + (((tickAnim - 10) / 8) * (0-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 18) / 7) * (0-(2)));
            zz = 0 + (((tickAnim - 18) / 7) * (-1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5-(0)));
            zz = -1 + (((tickAnim - 25) / 5) * (-0.5-(-1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5 + (((tickAnim - 30) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5)));
            zz = -0.5 + (((tickAnim - 30) / 5) * (0-(-0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (1-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperLegL.rotationPointX = this.upperLegL.rotationPointX + (float)(xx);
        this.upperLegL.rotationPointY = this.upperLegL.rotationPointY - (float)(yy);
        this.upperLegL.rotationPointZ = this.upperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 47.5 + (((tickAnim - 0) / 10) * (65-(47.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 65 + (((tickAnim - 10) / 8) * (62.5-(65)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 62.5 + (((tickAnim - 18) / 7) * (-20-(62.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -20 + (((tickAnim - 25) / 10) * (10-(-20)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 35) / 15) * (47.5-(10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 30) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 0) / 10) * (72.5-(22.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 72.5 + (((tickAnim - 10) / 8) * (-20-(72.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -20 + (((tickAnim - 18) / 7) * (30-(-20)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 25) / 10) * (-12.5-(30)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 35) / 15) * (22.5-(-12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FeetL, FeetL.rotateAngleX + (float) Math.toRadians(xx), FeetL.rotateAngleY + (float) Math.toRadians(yy), FeetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 30) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetL.rotationPointX = this.FeetL.rotationPointX + (float)(xx);
        this.FeetL.rotationPointY = this.FeetL.rotationPointY - (float)(yy);
        this.FeetL.rotationPointZ = this.FeetL.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-7+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+120))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-90))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-10), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-120))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-150))*-2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-180))*-8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (-90-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -90 + (((tickAnim - 25) / 10) * (0-(-90)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (30-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 30 + (((tickAnim - 43) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -90 + (((tickAnim - 0) / 10) * (0-(-90)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (30-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 18) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (-90-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 3) * (1-(0.7)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.64-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = 1 + (((tickAnim - 3) / 6) * (0.7-(1)));
            zz = -1.64 + (((tickAnim - 3) / 6) * (-3-(-1.64)));
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 9) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 9) / 10) * (0.7-(0.7)));
            zz = -3 + (((tickAnim - 9) / 10) * (0-(-3)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 19) / 6) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 25) / 3) * (1-(0.7)));
            zz = 0 + (((tickAnim - 25) / 3) * (-1.09-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = 1 + (((tickAnim - 28) / 6) * (0.7-(1)));
            zz = -1.09 + (((tickAnim - 28) / 6) * (-3-(-1.09)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            yy = 0.7 + (((tickAnim - 34) / 10) * (0.7-(0.7)));
            zz = -3 + (((tickAnim - 34) / 10) * (0-(-3)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 44) / 6) * (0.7-(0.7)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25))*-5), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+50))*-6), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+50))*-2));
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(0);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25))*0.5);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(0);


        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25-60))*4), chest1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-30))*4), chest1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25))*3));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25+160))*-8), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-100))*-9), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-5))*-5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25+100))*8), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+160))*5), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25+170))*3), head1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-50))*5), head1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+100))*1), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25+30))*5), basin1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+80))*5), basin1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+80))*2));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -42.5 + (((tickAnim - 0) / 3) * (-2.5-(-42.5)));
            yy = 5 + (((tickAnim - 0) / 3) * (0-(5)));
            zz = 5 + (((tickAnim - 0) / 3) * (0-(5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -2.5 + (((tickAnim - 3) / 5) * (12.5-(-2.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 8) / 5) * (25-(12.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 25 + (((tickAnim - 13) / 5) * (15-(25)));
            yy = 0 + (((tickAnim - 13) / 5) * (5-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 15 + (((tickAnim - 18) / 7) * (-42.5-(15)));
            yy = 5 + (((tickAnim - 18) / 7) * (5-(5)));
            zz = 5 + (((tickAnim - 18) / 7) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperLegR, upperLegR.rotateAngleX + (float) Math.toRadians(xx), upperLegR.rotateAngleY + (float) Math.toRadians(yy), upperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5-(0)));
            zz = -1 + (((tickAnim - 3) / 3) * (-0.5-(-1)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5 + (((tickAnim - 6) / 2) * (0-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5)));
            zz = -0.5 + (((tickAnim - 6) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-1-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 13) / 5) * (1-(-1)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 7) * (1-(1)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperLegR.rotationPointX = this.upperLegR.rotationPointX + (float)(xx);
        this.upperLegR.rotationPointY = this.upperLegR.rotationPointY - (float)(yy);
        this.upperLegR.rotationPointZ = this.upperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 52.5 + (((tickAnim - 0) / 3) * (-17.5-(52.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 3) / 5) * (-5-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 8) / 5) * (42.5-(-5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 42.5 + (((tickAnim - 13) / 5) * (55-(42.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 55 + (((tickAnim - 18) / 7) * (52.5-(55)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5 + (((tickAnim - 0) / 3) * (35-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35 + (((tickAnim - 3) / 5) * (-7.5-(35)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 8) / 5) * (7.5-(-7.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 13) / 5) * (55-(7.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 55 + (((tickAnim - 18) / 7) * (-17.5-(55)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FeetR, FeetR.rotateAngleX + (float) Math.toRadians(xx), FeetR.rotateAngleY + (float) Math.toRadians(yy), FeetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetR.rotationPointX = this.FeetR.rotationPointX + (float)(xx);
        this.FeetR.rotationPointY = this.FeetR.rotationPointY - (float)(yy);
        this.FeetR.rotationPointZ = this.FeetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 25 + (((tickAnim - 0) / 5) * (15-(25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 15 + (((tickAnim - 5) / 7) * (-42.5-(15)));
            yy = -5 + (((tickAnim - 5) / 7) * (-5-(-5)));
            zz = -5 + (((tickAnim - 5) / 7) * (-5-(-5)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -42.5 + (((tickAnim - 12) / 3) * (-2.5-(-42.5)));
            yy = -5 + (((tickAnim - 12) / 3) * (0-(-5)));
            zz = -5 + (((tickAnim - 12) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 15) / 5) * (12.5-(-2.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 20) / 5) * (25-(12.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperLegL, upperLegL.rotateAngleX + (float) Math.toRadians(xx), upperLegL.rotateAngleY + (float) Math.toRadians(yy), upperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -1 + (((tickAnim - 0) / 5) * (1-(-1)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 1 + (((tickAnim - 5) / 7) * (1-(1)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 12) / 3) * (0-(1)));
            zz = 0 + (((tickAnim - 12) / 3) * (-1-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5-(0)));
            zz = -1 + (((tickAnim - 15) / 3) * (-0.5-(-1)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5 + (((tickAnim - 18) / 2) * (0-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*0.5)));
            zz = -0.5 + (((tickAnim - 18) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-1-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperLegL.rotationPointX = this.upperLegL.rotationPointX + (float)(xx);
        this.upperLegL.rotationPointY = this.upperLegL.rotationPointY - (float)(yy);
        this.upperLegL.rotationPointZ = this.upperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 42.5 + (((tickAnim - 0) / 5) * (55-(42.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 55 + (((tickAnim - 5) / 7) * (52.5-(55)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 52.5 + (((tickAnim - 12) / 3) * (-17.5-(52.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 15) / 5) * (-5-(-17.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 20) / 5) * (42.5-(-5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 18) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 7.5 + (((tickAnim - 0) / 5) * (55-(7.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 55 + (((tickAnim - 5) / 7) * (-17.5-(55)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -17.5 + (((tickAnim - 12) / 3) * (35-(-17.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 15) / 5) * (-7.5-(35)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 20) / 5) * (7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FeetL, FeetL.rotateAngleX + (float) Math.toRadians(xx), FeetL.rotateAngleY + (float) Math.toRadians(yy), FeetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25 + (((tickAnim - 18) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.2))*-0.25)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.FeetL.rotationPointX = this.FeetL.rotationPointX + (float)(xx);
        this.FeetL.rotationPointY = this.FeetL.rotationPointY - (float)(yy);
        this.FeetL.rotationPointZ = this.FeetL.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25-90))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+90))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+90))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25+30))*3), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+50))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+50))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25-30))*5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+30))*5), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25+30))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25-50))*5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-30))*5), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.25-30))*3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.5 + (((tickAnim - 0) / 3) * (-17.5-(47.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 3) / 5) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (-85-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -85 + (((tickAnim - 13) / 5) * (2.5-(-85)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 2.5 + (((tickAnim - 18) / 7) * (47.5-(2.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -85 + (((tickAnim - 0) / 5) * (2.5-(-85)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 2.5 + (((tickAnim - 5) / 7) * (47.5-(2.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 47.5 + (((tickAnim - 12) / 3) * (-17.5-(47.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 15) / 5) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-85-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25+90))*5), ArmR1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+1)*360/1.25+90))*-5), ArmR1.rotateAngleZ + (float) Math.toRadians(5));


        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.2)*720/1.25+110))*-10), ArmR2.rotateAngleY + (float) Math.toRadians(0), ArmR2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(0), HandR.rotateAngleY + (float) Math.toRadians(0), HandR.rotateAngleZ + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*360/1.25))*-10));


        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.1)*720/1.25-120))*-5), ArmL1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+1)*720/1.25-120))*5), ArmL1.rotateAngleZ + (float) Math.toRadians(-5));


        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))+0.2)*720/1.25-110))*-5), ArmL2.rotateAngleY + (float) Math.toRadians(0), ArmL2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(0), HandL.rotateAngleY + (float) Math.toRadians(0), HandL.rotateAngleZ + (float) Math.toRadians(10+Math.sin((Math.PI/180)*(((((double)tickAnim/20D))-0.1)*360/1.25))*10));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-4-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = -4 + (((tickAnim - 8) / 5) * (0-(-4)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (-4-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = -4 + (((tickAnim - 21) / 4) * (0-(-4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);

    }

    public void animSneaking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 110;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5+50))*-3), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+50))*-6), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+50))*-3));
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(0);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5+50))*-0.5);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(0);


        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(-2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5-50))*-2), chest1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-150))*-6), chest1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+20))*3));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 0) / 20) * (2.5-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (10-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 2.5 + (((tickAnim - 20) / 23) * (-37.5-(2.5)));
            yy = -5 + (((tickAnim - 20) / 23) * (-5-(-5)));
            zz = 10 + (((tickAnim - 20) / 23) * (10-(10)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -37.5 + (((tickAnim - 43) / 17) * (-45-(-37.5)));
            yy = -5 + (((tickAnim - 43) / 17) * (0-(-5)));
            zz = 10 + (((tickAnim - 43) / 17) * (0-(10)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -45 + (((tickAnim - 60) / 23) * (-35-(-45)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = -35 + (((tickAnim - 83) / 27) * (-22.5-(-35)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(xx), ArmR1.rotateAngleY + (float) Math.toRadians(yy), ArmR1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 20) * (1-(1)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            yy = 1 + (((tickAnim - 20) / 23) * (0-(1)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 17) * (0.5-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0.5 + (((tickAnim - 60) / 12) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25-(0.5)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 72) / 11) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25 + (((tickAnim - 72) / 11) * (1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25)));
            zz = 0 + (((tickAnim - 72) / 11) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            yy = 1 + (((tickAnim - 83) / 27) * (1-(1)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmR1.rotationPointX = this.ArmR1.rotationPointX + (float)(xx);
        this.ArmR1.rotationPointY = this.ArmR1.rotationPointY - (float)(yy);
        this.ArmR1.rotationPointZ = this.ArmR1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 0) / 20) * (-25-(20)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -25 + (((tickAnim - 20) / 23) * (-37.5-(-25)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -37.5 + (((tickAnim - 43) / 17) * (-5-(-37.5)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -5 + (((tickAnim - 60) / 23) * (2.5-(-5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 2.5 + (((tickAnim - 83) / 27) * (20-(2.5)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(xx), ArmR2.rotateAngleY + (float) Math.toRadians(yy), ArmR2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 72) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25 + (((tickAnim - 72) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25)));
            zz = 0 + (((tickAnim - 72) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmR2.rotationPointX = this.ArmR2.rotationPointX + (float)(xx);
        this.ArmR2.rotationPointY = this.ArmR2.rotationPointY - (float)(yy);
        this.ArmR2.rotationPointZ = this.ArmR2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 0) / 20) * (5-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = 5 + (((tickAnim - 20) / 23) * (25-(5)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 23) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 25 + (((tickAnim - 43) / 17) * (10-(25)));
            yy = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 10 + (((tickAnim - 60) / 23) * (0-(10)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 83) / 27) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -45 + (((tickAnim - 0) / 23) * (-35-(-45)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -35 + (((tickAnim - 23) / 22) * (-22.5-(-35)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 72) {
            xx = -22.5 + (((tickAnim - 45) / 27) * (2.5-(-22.5)));
            yy = 0 + (((tickAnim - 45) / 27) * (5-(0)));
            zz = 0 + (((tickAnim - 45) / 27) * (-10-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 93) {
            xx = 2.5 + (((tickAnim - 72) / 21) * (-37.5-(2.5)));
            yy = 5 + (((tickAnim - 72) / 21) * (5-(5)));
            zz = -10 + (((tickAnim - 72) / 21) * (-10-(-10)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = -37.5 + (((tickAnim - 93) / 17) * (-45-(-37.5)));
            yy = 5 + (((tickAnim - 93) / 17) * (0-(5)));
            zz = -10 + (((tickAnim - 93) / 17) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(xx), ArmL1.rotateAngleY + (float) Math.toRadians(yy), ArmL1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 12) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25-(0.5)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25 + (((tickAnim - 12) / 11) * (1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 1 + (((tickAnim - 23) / 22) * (1-(1)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 45) / 27) * (0-(0)));
            yy = 1 + (((tickAnim - 45) / 27) * (1-(1)));
            zz = 0 + (((tickAnim - 45) / 27) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 72) / 21) * (0-(0)));
            yy = 1 + (((tickAnim - 72) / 21) * (0-(1)));
            zz = 0 + (((tickAnim - 72) / 21) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 93) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 17) * (0.5-(0)));
            zz = 0 + (((tickAnim - 93) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmL1.rotationPointX = this.ArmL1.rotationPointX + (float)(xx);
        this.ArmL1.rotationPointY = this.ArmL1.rotationPointY - (float)(yy);
        this.ArmL1.rotationPointZ = this.ArmL1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 0) / 23) * (2.5-(-5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 2.5 + (((tickAnim - 23) / 22) * (20-(2.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 72) {
            xx = 20 + (((tickAnim - 45) / 27) * (-25-(20)));
            yy = 0 + (((tickAnim - 45) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 27) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 93) {
            xx = -25 + (((tickAnim - 72) / 21) * (-37.5-(-25)));
            yy = 0 + (((tickAnim - 72) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 21) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = -37.5 + (((tickAnim - 93) / 17) * (-5-(-37.5)));
            yy = 0 + (((tickAnim - 93) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25 + (((tickAnim - 12) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.25)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.ArmL2.rotationPointX = this.ArmL2.rotationPointX + (float)(xx);
        this.ArmL2.rotationPointY = this.ArmL2.rotationPointY - (float)(yy);
        this.ArmL2.rotationPointZ = this.ArmL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 10 + (((tickAnim - 0) / 23) * (0-(10)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 72) {
            xx = -2.5 + (((tickAnim - 45) / 27) * (5-(-2.5)));
            yy = 0 + (((tickAnim - 45) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 27) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 93) {
            xx = 5 + (((tickAnim - 72) / 21) * (25-(5)));
            yy = 0 + (((tickAnim - 72) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 21) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 110) {
            xx = 25 + (((tickAnim - 93) / 17) * (10-(25)));
            yy = 0 + (((tickAnim - 93) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5-0))*4), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+110))*5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+30))*-3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5+60))*3), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+210))*3), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5+100))*-3), head1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+330))*5), head1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+30))*3));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5+50))*1), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5+30))*4), basin1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+80))*-3), basin1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+80))*2));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 0) / 23) * (5-(-7.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 23) / 27) * (0-(5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 50) / 17) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 50) / 17) * (5-(0)));
            zz = 0 + (((tickAnim - 50) / 17) * (5-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = -12.5 + (((tickAnim - 67) / 23) * (-20-(-12.5)));
            yy = 5 + (((tickAnim - 67) / 23) * (5-(5)));
            zz = 5 + (((tickAnim - 67) / 23) * (0-(5)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = -20 + (((tickAnim - 90) / 20) * (-7.5-(-20)));
            yy = 5 + (((tickAnim - 90) / 20) * (0-(5)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperLegR, upperLegR.rotateAngleX + (float) Math.toRadians(xx), upperLegR.rotateAngleY + (float) Math.toRadians(yy), upperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 12) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(1)));
            zz = -1 + (((tickAnim - 0) / 12) * (-0.5-(-1)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 12) / 11) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = -0.5 + (((tickAnim - 12) / 11) * (0-(-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (1-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (1-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 50) / 17) * (0-(0)));
            yy = 1 + (((tickAnim - 50) / 17) * (2-(1)));
            zz = 1 + (((tickAnim - 50) / 17) * (1-(1)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 67) / 23) * (0-(0)));
            yy = 2 + (((tickAnim - 67) / 23) * (2-(2)));
            zz = 1 + (((tickAnim - 67) / 23) * (0-(1)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            yy = 2 + (((tickAnim - 90) / 20) * (1-(2)));
            zz = 0 + (((tickAnim - 90) / 20) * (-1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperLegR.rotationPointX = this.upperLegR.rotationPointX + (float)(xx);
        this.upperLegR.rotationPointY = this.upperLegR.rotationPointY - (float)(yy);
        this.upperLegR.rotationPointZ = this.upperLegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 7.5 + (((tickAnim - 0) / 23) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 23) / 27) * (57.5-(7.5)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 67) {
            xx = 57.5 + (((tickAnim - 50) / 17) * (65-(57.5)));
            yy = 0 + (((tickAnim - 50) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 17) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 65 + (((tickAnim - 67) / 23) * (60-(65)));
            yy = 0 + (((tickAnim - 67) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 23) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 60 + (((tickAnim - 90) / 20) * (7.5-(60)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegR, LegR.rotateAngleX + (float) Math.toRadians(xx), LegR.rotateAngleY + (float) Math.toRadians(yy), LegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 12) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 12) / 11) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 23) / 87) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 87) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegR.rotationPointX = this.LegR.rotationPointX + (float)(xx);
        this.LegR.rotationPointY = this.LegR.rotationPointY - (float)(yy);
        this.LegR.rotationPointZ = this.LegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 12.5 + (((tickAnim - 0) / 23) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 23) / 27) * (17.5-(-10)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 67) {
            xx = 17.5 + (((tickAnim - 50) / 17) * (72.5-(17.5)));
            yy = 0 + (((tickAnim - 50) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 17) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 72.5 + (((tickAnim - 67) / 23) * (2.5-(72.5)));
            yy = 0 + (((tickAnim - 67) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 23) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 2.5 + (((tickAnim - 90) / 20) * (12.5-(2.5)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FeetR, FeetR.rotateAngleX + (float) Math.toRadians(xx), FeetR.rotateAngleY + (float) Math.toRadians(yy), FeetR.rotateAngleZ + (float) Math.toRadians(zz));

        this.FeetR.rotationPointX = this.FeetR.rotationPointX + (float)(0);
        this.FeetR.rotationPointY = this.FeetR.rotationPointY - (float)(0);
        this.FeetR.rotationPointZ = this.FeetR.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-5-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = -12.5 + (((tickAnim - 17) / 23) * (-20-(-12.5)));
            yy = -5 + (((tickAnim - 17) / 23) * (-5-(-5)));
            zz = -5 + (((tickAnim - 17) / 23) * (0-(-5)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = -20 + (((tickAnim - 40) / 20) * (-7.5-(-20)));
            yy = -5 + (((tickAnim - 40) / 20) * (0-(-5)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 60) / 23) * (5-(-7.5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 5 + (((tickAnim - 83) / 27) * (0-(5)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperLegL, upperLegL.rotateAngleX + (float) Math.toRadians(xx), upperLegL.rotateAngleY + (float) Math.toRadians(yy), upperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 17) * (2-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            yy = 2 + (((tickAnim - 17) / 23) * (2-(2)));
            zz = 1 + (((tickAnim - 17) / 23) * (0-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 2 + (((tickAnim - 40) / 20) * (1-(2)));
            zz = 0 + (((tickAnim - 40) / 20) * (-1-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 1 + (((tickAnim - 60) / 12) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25-(1)));
            zz = -1 + (((tickAnim - 60) / 12) * (-0.5-(-1)));
        }
        else if (tickAnim >= 72 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 72) / 11) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25 + (((tickAnim - 72) / 11) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.25)));
            zz = -0.5 + (((tickAnim - 72) / 11) * (0-(-0.5)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 27) * (1-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperLegL.rotationPointX = this.upperLegL.rotationPointX + (float)(xx);
        this.upperLegL.rotationPointY = this.upperLegL.rotationPointY - (float)(yy);
        this.upperLegL.rotationPointZ = this.upperLegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 57.5 + (((tickAnim - 0) / 17) * (65-(57.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 65 + (((tickAnim - 17) / 23) * (60-(65)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 60 + (((tickAnim - 40) / 20) * (7.5-(60)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 7.5 + (((tickAnim - 60) / 23) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 7.5 + (((tickAnim - 83) / 27) * (57.5-(7.5)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LegL, LegL.rotateAngleX + (float) Math.toRadians(xx), LegL.rotateAngleY + (float) Math.toRadians(yy), LegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 72) / 11) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25 + (((tickAnim - 72) / 11) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-0.25)));
            zz = 0 + (((tickAnim - 72) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LegL.rotationPointX = this.LegL.rotationPointX + (float)(xx);
        this.LegL.rotationPointY = this.LegL.rotationPointY - (float)(yy);
        this.LegL.rotationPointZ = this.LegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 17.5 + (((tickAnim - 0) / 17) * (72.5-(17.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 72.5 + (((tickAnim - 17) / 23) * (2.5-(72.5)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 40) / 20) * (12.5-(2.5)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = 12.5 + (((tickAnim - 60) / 23) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = -10 + (((tickAnim - 83) / 27) * (17.5-(-10)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(FeetL, FeetL.rotateAngleX + (float) Math.toRadians(xx), FeetL.rotateAngleY + (float) Math.toRadians(yy), FeetL.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5-30))*-3), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5+120))*5), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-30))*3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5-90))*-2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-50))*-7), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-90))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5-120))*-2), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-150))*-8), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-120))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/5.5-150))*-2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-180))*-8), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/5.5-150))*5));



        if (tickAnim >= 0 && tickAnim < 23) {
            xx = -12.5 + (((tickAnim - 0) / 23) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (-77.5-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 27) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 67) {
            xx = -77.5 + (((tickAnim - 50) / 17) * (0-(-77.5)));
            yy = 0 + (((tickAnim - 50) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 17) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 67) / 23) * (30-(0)));
            yy = 0 + (((tickAnim - 67) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 23) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 110) {
            xx = 30 + (((tickAnim - 90) / 20) * (-12.5-(30)));
            yy = 0 + (((tickAnim - 90) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -77.5 + (((tickAnim - 0) / 17) * (0-(-77.5)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 17) / 23) * (30-(0)));
            yy = 0 + (((tickAnim - 17) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 23) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 30 + (((tickAnim - 40) / 20) * (-12.5-(30)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 83) {
            xx = -12.5 + (((tickAnim - 60) / 23) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 60) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 23) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 83) / 27) * (-77.5-(0)));
            yy = 0 + (((tickAnim - 83) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -10 + (((tickAnim - 8) / 3) * (-7.5-(-10)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -7.5 + (((tickAnim - 11) / 10) * (-10-(-7.5)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 21) / 2) * (-10-(-10)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 23) / 3) * (2-(-10)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 2 + (((tickAnim - 26) / 3) * (0-(2)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 8) / 5) * (-10-(20)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 13) / 10) * (-10-(-10)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 23) / 5) * (0-(-10)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 5 + (((tickAnim - 12) / 1) * (-5-(5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -5 + (((tickAnim - 13) / 2) * (-3.6-(-5)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (9-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -3.6 + (((tickAnim - 15) / 2) * (-3.6-(-3.6)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 9 + (((tickAnim - 15) / 2) * (8-(9)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -3.6 + (((tickAnim - 17) / 2) * (-0.8-(-3.6)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 8 + (((tickAnim - 17) / 2) * (-9-(8)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -0.8 + (((tickAnim - 19) / 2) * (-0.8-(-0.8)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = -9 + (((tickAnim - 19) / 2) * (-8-(-9)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -0.8 + (((tickAnim - 21) / 2) * (2-(-0.8)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = -8 + (((tickAnim - 21) / 2) * (0-(-8)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 2 + (((tickAnim - 23) / 1) * (-5-(2)));
            yy = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = -5 + (((tickAnim - 24) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (40-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 40 + (((tickAnim - 13) / 8) * (35-(40)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 35 + (((tickAnim - 21) / 2) * (38-(35)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 38 + (((tickAnim - 23) / 6) * (0-(38)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 3 + (((tickAnim - 7) / 1) * (0-(3)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 12) / 6) * (-8-(-10)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -8 + (((tickAnim - 18) / 5) * (-10-(-8)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -10 + (((tickAnim - 23) / 5) * (0.5-(-10)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0.5 + (((tickAnim - 28) / 1) * (0-(0.5)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-20-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -20 + (((tickAnim - 12) / 2) * (-15-(-20)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -15 + (((tickAnim - 14) / 7) * (-10-(-15)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (-5-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 21) / 2) * (-12.5-(-10)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 21) / 2) * (2-(-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 23) / 2) * (-5-(-12.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 2 + (((tickAnim - 23) / 2) * (0-(2)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -5 + (((tickAnim - 25) / 1) * (0-(-5)));
            yy = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 1) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(xx), ArmR1.rotateAngleY + (float) Math.toRadians(yy), ArmR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -20 + (((tickAnim - 13) / 3) * (-15-(-20)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (10-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -15 + (((tickAnim - 16) / 6) * (-10-(-15)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 10 + (((tickAnim - 16) / 6) * (0-(10)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -10 + (((tickAnim - 22) / 2) * (-12.5-(-10)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (-5-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -12.5 + (((tickAnim - 24) / 1) * (-5-(-12.5)));
            yy = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 24) / 1) * (0-(-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 25) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(xx), ArmL1.rotateAngleY + (float) Math.toRadians(yy), ArmL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-2-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 21) {
            xx = -2 + (((tickAnim - 9) / 12) * (6-(-2)));
            yy = 0 + (((tickAnim - 9) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 12) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 6 + (((tickAnim - 21) / 2) * (4-(6)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 4 + (((tickAnim - 23) / 3) * (0-(4)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (-2-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -2 + (((tickAnim - 10) / 3) * (5-(-2)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 5 + (((tickAnim - 13) / 9) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 22) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 8) / 4) * (6-(-5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 12) / 1) * (6-(6)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 6 + (((tickAnim - 13) / 13) * (5-(6)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 26) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 6) / 2) * (6-(-5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 6 + (((tickAnim - 8) / 5) * (7-(6)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 7 + (((tickAnim - 13) / 13) * (6-(7)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 6 + (((tickAnim - 26) / 3) * (0-(6)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -5 + (((tickAnim - 10) / 4) * (-5-(-5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 14) / 7) * (0.5-(-5)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0.5 + (((tickAnim - 21) / 4) * (0-(0.5)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 10 + (((tickAnim - 10) / 4) * (10-(10)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 10 + (((tickAnim - 14) / 7) * (0-(10)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (5-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 16) / 2) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 18) / 2) * (-5-(5)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 20) / 3) * (1.5-(-5)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 1.5 + (((tickAnim - 23) / 2) * (0-(1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 5 + (((tickAnim - 15) / 1) * (3-(5)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 3 + (((tickAnim - 16) / 2) * (5-(3)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 18) / 0) * (3-(5)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 3 + (((tickAnim - 18) / 2) * (5-(3)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 5 + (((tickAnim - 20) / 1) * (3-(5)));
            yy = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 1) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 21) / 2) * (0-(3)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-10 + (((tickAnim - 0) / 15) * (25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*25 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*10-(25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*10 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-10 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+80))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+80))*25 + (((tickAnim - 15) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-50))*-10-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+80))*25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-50))*-10 + (((tickAnim - 30) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-50))*-10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10 + (((tickAnim - 0) / 15) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*25 + (((tickAnim - 15) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5 + (((tickAnim - 30) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10 + (((tickAnim - 0) / 15) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*40 + (((tickAnim - 15) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-30))*-5-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*40)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-30))*-5 + (((tickAnim - 30) / 10) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-30))*-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-10 + (((tickAnim - 0) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*20 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-50))*5-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*20)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-50))*5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-50))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10 + (((tickAnim - 0) / 15) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*25 + (((tickAnim - 15) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*10 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*10)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*10 + (((tickAnim - 30) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(xx), ArmR1.rotateAngleY + (float) Math.toRadians(yy), ArmR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-15 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*20 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*5 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*5)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*-10 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(xx), ArmR2.rotateAngleY + (float) Math.toRadians(yy), ArmR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-15 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-15)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*20 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+90))*20)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*-10 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+80))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10 + (((tickAnim - 0) / 15) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*10)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*25 + (((tickAnim - 15) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*10-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*25)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*10 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*10)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*10 + (((tickAnim - 30) / 10) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(xx), ArmL1.rotateAngleY + (float) Math.toRadians(yy), ArmL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10 + (((tickAnim - 0) / 15) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-10)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-30 + (((tickAnim - 15) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-15-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-10 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-10)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-15 + (((tickAnim - 30) / 10) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*-5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*15 + (((tickAnim - 15) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*15)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*10 + (((tickAnim - 30) / 10) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-80))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-0.5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-0.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*0.5 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*0.5)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*0.5)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(xx);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(yy);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5 + (((tickAnim - 15) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 30) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(xx), basin1.rotateAngleY + (float) Math.toRadians(yy), basin1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPostosuchus entity = (EntityPrehistoricFloraPostosuchus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30 + (((tickAnim - 0) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-30)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*-20 + (((tickAnim - 15) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*3 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10 -(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10  + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10 )));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*3 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10 + (((tickAnim - 0) / 15) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-80))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-80))*-10 + (((tickAnim - 15) / 15) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-80))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*3 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*30 + (((tickAnim - 0) / 10) * (35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-10))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*30)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-10))*40 + (((tickAnim - 10) / 10) * (0-(35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-10))*40)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-3-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*10 + (((tickAnim - 15) / 15) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-3 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-20 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-100))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-20)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-100))*-20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-100))*-20)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(gums1, gums1.rotateAngleX + (float) Math.toRadians(xx), gums1.rotateAngleY + (float) Math.toRadians(yy), gums1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-0.1 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-0.1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-0.1)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-0.1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-0.1)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body1.rotationPointX = this.body1.rotationPointX + (float)(xx);
        this.body1.rotationPointY = this.body1.rotationPointY - (float)(yy);
        this.body1.rotationPointZ = this.body1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10 + (((tickAnim - 0) / 15) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*20 + (((tickAnim - 15) / 15) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+60))*5)));
            zz = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*5 + (((tickAnim - 15) / 15) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR1, ArmR1.rotateAngleX + (float) Math.toRadians(xx), ArmR1.rotateAngleY + (float) Math.toRadians(yy), ArmR1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-20 + (((tickAnim - 15) / 15) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5+30))*5)));
            zz = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+30))*-10 + (((tickAnim - 15) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmR2, ArmR2.rotateAngleX + (float) Math.toRadians(xx), ArmR2.rotateAngleY + (float) Math.toRadians(yy), ArmR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10 + (((tickAnim - 15) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*20 + (((tickAnim - 15) / 15) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-60))*5)));
            zz = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*5 + (((tickAnim - 15) / 15) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL1, ArmL1.rotateAngleX + (float) Math.toRadians(xx), ArmL1.rotateAngleY + (float) Math.toRadians(yy), ArmL1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-20-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-5-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-20 + (((tickAnim - 15) / 15) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-90))*-20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5-30))*-5)));
            zz = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*10 + (((tickAnim - 15) / 15) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(ArmL2, ArmL2.rotateAngleX + (float) Math.toRadians(xx), ArmL2.rotateAngleY + (float) Math.toRadians(yy), ArmL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10 + (((tickAnim - 0) / 15) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-10)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-10 + (((tickAnim - 15) / 15) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.5))*-5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin1, basin1.rotateAngleX + (float) Math.toRadians(xx), basin1.rotateAngleY + (float) Math.toRadians(yy), basin1.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPostosuchus e = (EntityPrehistoricFloraPostosuchus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.body1, 0,(float) Math.toRadians(2),0);
        animator.rotate(tail1, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(basin1, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(upperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(upperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(upperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
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
        animator.rotate(upperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(upperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(body1, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(chest1, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

//        animator.setAnimation(e.ATTACK_ANIMATION);
//        animator.startKeyframe(5);
//        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(2);
//        animator.resetKeyframe(6);
//
//        animator.setAnimation(e.EAT_ANIMATION);
//        animator.startKeyframe(5);
//        animator.rotate(head1, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(jaw1, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(2);
//        animator.resetKeyframe(6);

//        animator.setAnimation(e.NOISE_ANIMATION);
//        animator.startKeyframe(8);
//        animator.rotate(neck1, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(head1, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(jaw1, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(8);
//        animator.resetKeyframe(9);
//
//        animator.setAnimation(e.ROAR_ANIMATION);
//        animator.startKeyframe(10);
//        animator.rotate(neck1, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(head1, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(jaw1, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(10);
//        animator.resetKeyframe(10);
    }
}
