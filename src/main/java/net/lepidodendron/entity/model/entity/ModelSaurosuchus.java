package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSaurosuchus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Root;
    private final AdvancedModelRendererExtended Hips;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Tail5;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Chest;
    private final AdvancedModelRendererExtended UpperArmR;
    private final AdvancedModelRendererExtended LowerArmR;
    private final AdvancedModelRendererExtended HandR;
    private final AdvancedModelRendererExtended UpperArmL;
    private final AdvancedModelRendererExtended LowerArmL;
    private final AdvancedModelRendererExtended HandL;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended ThroatPouch;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended jaw2;
    private final AdvancedModelRendererExtended underteeth1;
    private final AdvancedModelRendererExtended underteeth1_r1;
    private final AdvancedModelRendererExtended masseter;
    private final AdvancedModelRendererExtended head2;
    private final AdvancedModelRendererExtended head4;
    private final AdvancedModelRendererExtended teeth2;
    private final AdvancedModelRendererExtended head3;
    private final AdvancedModelRendererExtended teeth1;
    private final AdvancedModelRendererExtended UpperLegR;
    private final AdvancedModelRendererExtended LowerLegR;
    private final AdvancedModelRendererExtended FootR;
    private final AdvancedModelRendererExtended ToesR;
    private final AdvancedModelRendererExtended ToesR2;
    private final AdvancedModelRendererExtended UpperLegL;
    private final AdvancedModelRendererExtended LowerLegL;
    private final AdvancedModelRendererExtended FootL;
    private final AdvancedModelRendererExtended ToesL;
    private final AdvancedModelRendererExtended ToesL2;
    private final AdvancedModelRendererExtended cube_r7;

    private ModelAnimator animator;

    public ModelSaurosuchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Root = new AdvancedModelRendererExtended(this);
        this.Root.setRotationPoint(0.0F, 6.0F, 0.0F);

        this.Hips = new AdvancedModelRendererExtended(this);
        this.Hips.setRotationPoint(-1.0F, -0.5F, 8.6F);
        this.Root.addChild(Hips);
        this.setRotateAngle(Hips, 0.0494F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 36, 15, -3.5F, -5.5F, -3.6F, 9, 11, 10, 0.0F, false));
        this.Hips.cubeList.add(new ModelBox(Hips, 65, 0, -0.5F, -5.9F, -3.6F, 3, 1, 10, 0.0F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(1.0F, -2.8F, 5.4F);
        this.Hips.addChild(Tail);
        this.setRotateAngle(Tail, -0.0475F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 25, -3.5F, -2.6F, 0.0F, 7, 9, 13, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 0, -1.5F, -0.1F, 0.0F, 3, 1, 13, 0.0F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 1.6F, 11.2F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0475F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 27, 36, -2.5F, -3.7F, 0.8F, 5, 7, 13, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -3.7F, 7.0F);
        this.Tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 57, -1.0F, -0.5F, -6.2F, 2, 1, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, -0.4F, 12.8F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0058F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 21, 56, -2.0F, -2.8F, 0.0F, 4, 5, 11, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.8F, 5.0F);
        this.Tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 0, -1.0F, -0.5F, -5.0F, 2, 1, 11, 0.0F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.0456F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 0, 66, -1.5F, -1.8F, 0.0F, 3, 4, 11, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -1.8F, 5.0F);
        this.Tail4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 68, 57, -0.5F, -0.5F, -5.0F, 1, 1, 11, 0.0F, false));

        this.Tail5 = new AdvancedModelRendererExtended(this);
        this.Tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.0436F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 62, 24, -1.0F, -1.3F, 0.0F, 2, 3, 12, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -1.3F, 6.0F);
        this.Tail5.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 11, -0.5F, -0.5F, -6.0F, 1, 1, 11, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(1.0F, -2.7F, -4.6F);
        this.Hips.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -5.0F, -2.81F, -11.0F, 10, 12, 13, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 50, 43, -1.5F, -3.2F, -11.0F, 3, 1, 13, 0.0F, false));

        this.Chest = new AdvancedModelRendererExtended(this);
        this.Chest.setRotationPoint(0.0F, 0.2F, -10.0F);
        this.Body.addChild(Chest);
        this.setRotateAngle(Chest, 0.0853F, 0.0F, 0.0F);
        this.Chest.cubeList.add(new ModelBox(Chest, 0, 48, -4.0F, -3.0F, -8.0F, 8, 10, 8, 0.0F, false));
        this.Chest.cubeList.add(new ModelBox(Chest, 40, 57, -1.5F, -3.4F, -8.0F, 3, 1, 8, 0.0F, false));

        this.UpperArmR = new AdvancedModelRendererExtended(this);
        this.UpperArmR.setRotationPoint(-5.2F, 5.0F, -4.9F);
        this.Chest.addChild(UpperArmR);
        this.setRotateAngle(UpperArmR, 0.4231F, 0.0F, 0.0F);
        this.UpperArmR.cubeList.add(new ModelBox(UpperArmR, 81, 54, -0.3F, -1.0F, -2.0F, 3, 7, 4, 0.0F, false));

        this.LowerArmR = new AdvancedModelRendererExtended(this);
        this.LowerArmR.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.UpperArmR.addChild(LowerArmR);
        this.setRotateAngle(LowerArmR, -0.6014F, 0.0F, 0.0F);
        this.LowerArmR.cubeList.add(new ModelBox(LowerArmR, 78, 23, -0.3F, -0.01F, -4.0F, 3, 9, 4, -0.01F, false));

        this.HandR = new AdvancedModelRendererExtended(this);
        this.HandR.setRotationPoint(1.2F, 9.0F, -2.1F);
        this.LowerArmR.addChild(HandR);
        this.setRotateAngle(HandR, 0.0F, 0.0F, -0.0019F);
        this.HandR.cubeList.add(new ModelBox(HandR, 81, 0, -2.0031F, -0.9023F, -3.4F, 4, 2, 5, 0.0F, false));

        this.UpperArmL = new AdvancedModelRendererExtended(this);
        this.UpperArmL.setRotationPoint(5.2F, 5.0F, -4.9F);
        this.Chest.addChild(UpperArmL);
        this.setRotateAngle(UpperArmL, 0.4231F, 0.0F, 0.0F);
        this.UpperArmL.cubeList.add(new ModelBox(UpperArmL, 81, 54, -2.7F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

        this.LowerArmL = new AdvancedModelRendererExtended(this);
        this.LowerArmL.setRotationPoint(0.0F, 6.0F, 2.0F);
        this.UpperArmL.addChild(LowerArmL);
        this.setRotateAngle(LowerArmL, -0.6014F, 0.0F, 0.0F);
        this.LowerArmL.cubeList.add(new ModelBox(LowerArmL, 78, 23, -2.7F, -0.01F, -4.0F, 3, 9, 4, -0.01F, true));

        this.HandL = new AdvancedModelRendererExtended(this);
        this.HandL.setRotationPoint(-1.2F, 8.9F, -2.1F);
        this.LowerArmL.addChild(HandL);
        this.setRotateAngle(HandL, 0.0F, 0.0F, 0.0019F);
        this.HandL.cubeList.add(new ModelBox(HandL, 81, 0, -1.9967F, -0.8023F, -3.4F, 4, 2, 5, 0.0F, true));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, -0.6F, -6.5F);
        this.Chest.addChild(Neck);
        this.setRotateAngle(Neck, -0.2239F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 24, 77, -2.5F, -2.2F, -4.0F, 5, 7, 4, -0.01F, false));
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 31, -1.0F, -2.4F, -4.0F, 2, 1, 4, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0834F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 63, 71, -2.0F, -2.2F, -5.0F, 4, 7, 5, -0.02F, false));
        this.Neck2.cubeList.add(new ModelBox(Neck2, 64, 14, -1.0F, -2.4F, -5.0F, 2, 1, 5, 0.0F, false));

        this.ThroatPouch = new AdvancedModelRendererExtended(this);
        this.ThroatPouch.setRotationPoint(0.0F, 4.8F, -1.0F);
        this.Neck2.addChild(ThroatPouch);
        this.ThroatPouch.cubeList.add(new ModelBox(ThroatPouch, 31, 72, -2.0F, -2.0F, -3.0F, 4, 2, 3, -0.03F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, 0.2676F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 80, 11, -2.5F, -2.0F, -3.0F, 5, 4, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1449F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 59, 83, -2.5F, -0.01F, -3.99F, 5, 3, 4, -0.01F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 85, 76, -0.5F, 0.0F, -4.0F, 3, 1, 4, -0.03F, false));

        this.jaw2 = new AdvancedModelRendererExtended(this);
        this.jaw2.setRotationPoint(-1.0F, 3.0582F, -4.0F);
        this.Jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0737F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 84, 39, -0.5F, -2.0582F, -3.96F, 3, 2, 4, -0.02F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 25, 0.0F, -2.0582F, -7.92F, 2, 2, 4, -0.02F, false));

        this.underteeth1 = new AdvancedModelRendererExtended(this);
        this.underteeth1.setRotationPoint(0.0F, -2.0F, -5.2595F);
        this.jaw2.addChild(underteeth1);


        this.underteeth1_r1 = new AdvancedModelRendererExtended(this);
        this.underteeth1_r1.setRotationPoint(0.0F, -0.0582F, -1.7405F);
        this.underteeth1.addChild(underteeth1_r1);
        this.setRotateAngle(underteeth1_r1, 0.1309F, 0.0F, 0.0F);
        this.underteeth1_r1.cubeList.add(new ModelBox(underteeth1_r1, 0, 81, 0.0F, -0.5F, 0.0F, 2, 1, 7, -0.03F, false));

        this.masseter = new AdvancedModelRendererExtended(this);
        this.masseter.setRotationPoint(-1.01F, 0.0F, -4.0F);
        this.Jaw.addChild(masseter);
        this.setRotateAngle(masseter, -0.5061F, 0.0F, 0.0F);
        this.masseter.cubeList.add(new ModelBox(masseter, 0, 0, -0.49F, -4.0F, 0.0F, 3, 4, 3, 0.0F, false));

        this.head2 = new AdvancedModelRendererExtended(this);
        this.head2.setRotationPoint(-1.0F, 2.0F, -3.0F);
        this.Head.addChild(head2);
        this.setRotateAngle(head2, -0.0717F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 50, 36, -0.5F, -3.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.head4 = new AdvancedModelRendererExtended(this);
        this.head4.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, -0.182F, 0.0F, 0.0F);
        this.head4.cubeList.add(new ModelBox(head4, 0, 7, 0.0F, -2.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.teeth2 = new AdvancedModelRendererExtended(this);
        this.teeth2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head4.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0436F, 0.0F, 0.0F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 27, 32, 0.0F, -0.3F, 0.0F, 2, 1, 4, -0.01F, false));

        this.head3 = new AdvancedModelRendererExtended(this);
        this.head3.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.head4.addChild(head3);
        this.setRotateAngle(head3, 0.3578F, 0.0F, 0.0F);
        this.head3.cubeList.add(new ModelBox(head3, 74, 76, 0.0F, 0.0F, 0.0F, 2, 2, 7, -0.01F, false));
        this.head3.cubeList.add(new ModelBox(head3, 27, 25, 0.0F, 0.0F, 6.4F, 2, 2, 1, -0.02F, false));

        this.teeth1 = new AdvancedModelRendererExtended(this);
        this.teeth1.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.head2.addChild(teeth1);
        this.setRotateAngle(teeth1, 0.0436F, 0.0F, 0.0F);
        this.teeth1.cubeList.add(new ModelBox(teeth1, 77, 85, -0.5F, -0.01F, 0.0F, 3, 1, 4, -0.01F, false));

        this.UpperLegR = new AdvancedModelRendererExtended(this);
        this.UpperLegR.setRotationPoint(-5.4F, -1.5F, 1.8F);
        this.Hips.addChild(UpperLegR);
        this.setRotateAngle(UpperLegR, -0.1745F, 0.0F, 0.0F);
        this.UpperLegR.cubeList.add(new ModelBox(UpperLegR, 69, 39, -0.1F, -1.0F, -3.2F, 4, 8, 7, 0.0F, false));

        this.LowerLegR = new AdvancedModelRendererExtended(this);
        this.LowerLegR.setRotationPoint(1.9F, 7.0F, -3.2F);
        this.UpperLegR.addChild(LowerLegR);
        this.setRotateAngle(LowerLegR, 0.4002F, 0.0F, 0.0F);
        this.LowerLegR.cubeList.add(new ModelBox(LowerLegR, 45, 71, -1.5F, 0.0F, 0.01F, 3, 9, 6, 0.0F, false));

        this.FootR = new AdvancedModelRendererExtended(this);
        this.FootR.setRotationPoint(0.0F, 9.0F, 5.5F);
        this.LowerLegR.addChild(FootR);
        this.setRotateAngle(FootR, -0.2618F, 0.0F, 0.0F);
        this.FootR.cubeList.add(new ModelBox(FootR, 13, 84, -1.0F, 0.0F, -5.0F, 2, 5, 5, 0.0F, false));

        this.ToesR = new AdvancedModelRendererExtended(this);
        this.ToesR.setRotationPoint(0.0F, 5.0F, -2.0F);
        this.FootR.addChild(ToesR);
        this.ToesR.cubeList.add(new ModelBox(ToesR, 76, 69, -2.0F, -1.0F, -4.0F, 4, 2, 5, 0.0F, false));

        this.ToesR2 = new AdvancedModelRendererExtended(this);
        this.ToesR2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToesR.addChild(ToesR2);
        this.ToesR2.cubeList.add(new ModelBox(ToesR2, 17, 72, -2.0F, -1.0F, -3.0F, 4, 2, 3, -0.01F, false));

        this.UpperLegL = new AdvancedModelRendererExtended(this);
        this.UpperLegL.setRotationPoint(7.4F, -1.5F, 1.8F);
        this.Hips.addChild(UpperLegL);
        this.setRotateAngle(UpperLegL, -0.1745F, 0.0F, 0.0F);
        this.UpperLegL.cubeList.add(new ModelBox(UpperLegL, 69, 39, -3.9F, -1.0F, -3.2F, 4, 8, 7, 0.0F, true));

        this.LowerLegL = new AdvancedModelRendererExtended(this);
        this.LowerLegL.setRotationPoint(-1.9F, 7.0F, -3.2F);
        this.UpperLegL.addChild(LowerLegL);
        this.setRotateAngle(LowerLegL, 0.4002F, 0.0F, 0.0F);
        this.LowerLegL.cubeList.add(new ModelBox(LowerLegL, 45, 71, -1.5F, 0.0F, 0.01F, 3, 9, 6, 0.0F, true));

        this.FootL = new AdvancedModelRendererExtended(this);
        this.FootL.setRotationPoint(0.0F, 9.0F, 5.5F);
        this.LowerLegL.addChild(FootL);
        this.setRotateAngle(FootL, -0.2618F, 0.0F, 0.0F);
        this.FootL.cubeList.add(new ModelBox(FootL, 13, 84, -1.0F, 0.0F, -5.0F, 2, 5, 5, 0.0F, true));

        this.ToesL = new AdvancedModelRendererExtended(this);
        this.ToesL.setRotationPoint(0.0F, 5.0F, -2.0F);
        this.FootL.addChild(ToesL);
        this.ToesL.cubeList.add(new ModelBox(ToesL, 76, 69, -2.0F, -1.0F, -4.0F, 4, 2, 5, 0.0F, true));

        this.ToesL2 = new AdvancedModelRendererExtended(this);
        this.ToesL2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.ToesL.addChild(ToesL2);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.4F, 0.0F, 0.5F);
        this.ToesL2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0408F, 0.009F, 0.0126F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 72, -2.4F, -1.0F, -3.5F, 4, 2, 3, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Head.rotateAngleX = (float) Math.toRadians(2.83);
        this.Jaw.rotateAngleX = (float) Math.toRadians(51.7);
        this.HandR.rotateAngleX = (float) Math.toRadians(42.6);
        this.HandR.rotateAngleY = (float) Math.toRadians(51.7);
        this.HandR.rotateAngleZ = (float) Math.toRadians(-20.7);
        this.HandL.rotateAngleX = (float) Math.toRadians(70);
        this.HandL.rotateAngleY = (float) Math.toRadians(-50.5);
        this.HandL.rotateAngleZ = (float) Math.toRadians(-14);
        this.LowerArmR.rotateAngleX = (float) Math.toRadians(-41.9);
        this.LowerArmL.rotateAngleX = (float) Math.toRadians(-46.9);
        this.UpperArmR.rotateAngleX = (float) Math.toRadians(-18.2);
        this.UpperArmR.rotateAngleY = (float) Math.toRadians(24);
        this.UpperArmR.rotateAngleZ = (float) Math.toRadians(-9.6);
        this.UpperArmL.rotateAngleX = (float) Math.toRadians(-18.4);
        this.UpperArmL.rotateAngleY = (float) Math.toRadians(-16.5);
        this.UpperArmL.rotateAngleZ = (float) Math.toRadians(10.3);
        this.Neck.rotateAngleZ = (float) Math.toRadians(-7.5);
        this.Neck.rotateAngleX = (float) Math.toRadians(-2.8);
        this.Neck2.rotateAngleZ = (float) Math.toRadians(-5);
        this.Neck2.rotateAngleX = (float) Math.toRadians(2.7);
        this.Chest.offsetY = -0.02F;
        this.Chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Hips, -0.0815F, 0.0F, 0.0F);
        this.setRotateAngle(Tail, -0.004F, -0.0872F, 0.0042F);
        this.setRotateAngle(cube_r1, -0.0175F, 0.0F, 0.0F);
        this.setRotateAngle(Tail2, 0.0394F, -0.1308F, 0.0062F);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail3, 0.0813F, -0.2618F, 0.0015F);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail4, -0.0903F, -0.2179F, 0.0101F);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Tail5, -0.132F, -0.218F, 0.0097F);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Body, 0.131F, 0.0433F, 0.0057F);
        this.setRotateAngle(Chest, 0.1733F, 0.086F, 0.015F);
        this.setRotateAngle(UpperArmR, -0.2314F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmR, -0.8196F, 0.0F, 0.0F);
        this.setRotateAngle(HandR, 1.8762F, 0.0F, -0.0019F);
        this.setRotateAngle(UpperArmL, 0.9903F, 0.0F, 0.0F);
        this.setRotateAngle(LowerArmL, -1.3868F, 0.0F, 0.0F);
        this.setRotateAngle(HandL, 1.7453F, 0.0F, 0.0019F);
        this.setRotateAngle(Neck, -0.2248F, 0.0851F, -0.0194F);
        this.setRotateAngle(Neck2, -0.0418F, 0.2174F, -0.0185F);
        this.setRotateAngle(Head, 0.1389F, 0.1262F, 0.0348F);
        this.setRotateAngle(Jaw, 0.6842F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(jaw2, -0.0737F, 0.0F, 0.0F);
        this.setRotateAngle(underteeth1_r1, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(masseter, -0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(head2, -0.0717F, 0.0F, 0.0F);
        this.setRotateAngle(head4, -0.182F, 0.0F, 0.0F);
        this.setRotateAngle(teeth2, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(head3, 0.3578F, 0.0F, 0.0F);
        this.setRotateAngle(teeth1, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegR, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegR, 0.7929F, 0.0F, 0.0F);
        this.setRotateAngle(FootR, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(ToesR, 0.9163F, 0.0F, 0.0F);
        this.setRotateAngle(ToesR2, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(UpperLegL, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(LowerLegL, 1.0983F, 0.0F, 0.0F);
        this.setRotateAngle(FootL, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL, 1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(ToesL2, 0.829F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0408F, 0.009F, 0.0126F);
        this.Root.offsetY = -0.16F;
        this.Root.offsetX = -0.02F;
        this.Root.render(0.01F);
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
        this.Root.offsetY = 0.05F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraSaurosuchus Saurosuchus = (EntityPrehistoricFloraSaurosuchus) e;

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Neck2, this.Head};

        if (Saurosuchus.getAnimation() == Saurosuchus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Saurosuchus.isReallyInWater()) {

            if (f3 == 0.0F || !Saurosuchus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
            }

            if (Saurosuchus.getIsFast()) { //Running


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

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaurosuchus entity = (EntityPrehistoricFloraSaurosuchus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * 0D);
            yy = -1D + (((tickAnim - 0D) / 9D) * 1D);
            zz = -2D + (((tickAnim - 0D) / 9D) * 2D);
        }
        else if (tickAnim >= 9 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 9D) / 10D) * 0D);
            yy = 0D + (((tickAnim - 9D) / 10D) * -1D);
            zz = 0D + (((tickAnim - 9D) / 10D) * -2D);
        }
        else if (tickAnim >= 19 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 19D) / 10D) * 0D);
            yy = -1D + (((tickAnim - 19D) / 10D) * 1D);
            zz = -2D + (((tickAnim - 19D) / 10D) * 2D);
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0D + (((tickAnim - 29D) / 10D) * 0D);
            yy = 0D + (((tickAnim - 29D) / 10D) * -1D);
            zz = 0D + (((tickAnim - 29D) / 10D) * -2D);
        }
        else {
            xx = 0D;
            yy = -1D;
            zz = -2D;
        }


       // this.setRotateAngle(Root, Root.rotateAngleX + (float) Math.toRadians(xx), Root.rotateAngleY + (float) Math.toRadians(yy), Root.rotateAngleZ + (float) Math.toRadians(zz));
        this.Root.offsetY = (float)Math.toRadians(yy);
        this.Root.offsetZ = (float)Math.toRadians(zz);

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 0D) / 10D) * -72.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -47.5D + (((tickAnim - 10D) / 10D) * -17.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -65D + (((tickAnim - 20D) / 9D) * 63.75D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -1.25D + (((tickAnim - 29D) / 11D) * 23.75D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(UpperArmR, UpperArmR.rotateAngleX + (float) Math.toRadians(xx), UpperArmR.rotateAngleY + (float) Math.toRadians(yy), UpperArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 12.5D + (((tickAnim - 0D) / 5D) * -59.59D);
            yy = 0D + (((tickAnim - 0D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 5D) * 0D);
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -47.09D + (((tickAnim - 5D) / 5D) * 35.42D);
            yy = 0D + (((tickAnim - 5D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 5D) / 5D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.67D + (((tickAnim - 10D) / 10D) * 39.17D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 27.5D + (((tickAnim - 20D) / 9D) * 1.25D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 28.75D + (((tickAnim - 29D) / 11D) * -16.25D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(LowerArmR, LowerArmR.rotateAngleX + (float) Math.toRadians(xx), LowerArmR.rotateAngleY + (float) Math.toRadians(yy), LowerArmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 130D + (((tickAnim - 0D) / 10D) * -63.5D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 66.5D + (((tickAnim - 10D) / 10D) * -24D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 42.5D + (((tickAnim - 20D) / 10D) * -66.25D);
            yy = 0D + (((tickAnim - 20D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 10D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -23.75D + (((tickAnim - 30D) / 10D) * 153.75D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }


        this.setRotateAngle(HandR, HandR.rotateAngleX + (float) Math.toRadians(xx), HandR.rotateAngleY + (float) Math.toRadians(yy), HandR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -65D + (((tickAnim - 0D) / 10D) * 63.75D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.25D + (((tickAnim - 10D) / 10D) * 26.25D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 25D + (((tickAnim - 20D) / 9D) * -72.5D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -47.5D + (((tickAnim - 29D) / 11D) * -17.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }



        this.setRotateAngle(UpperArmL, UpperArmL.rotateAngleX + (float) Math.toRadians(xx), UpperArmL.rotateAngleY + (float) Math.toRadians(yy), UpperArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 27.5D + (((tickAnim - 0D) / 10D) * 1.25D);
            yy = 0D + (((tickAnim - 0D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 28.75D + (((tickAnim - 10D) / 10D) * -16.25D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 20D) / 5D) * -59.59D);
            yy = 0D + (((tickAnim - 20D) / 5D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 5D) * 0D);
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -47.09D + (((tickAnim - 25D) / 4D) * 35.42D);
            yy = 0D + (((tickAnim - 25D) / 4D) * 0D);
            zz = 0D + (((tickAnim - 25D) / 4D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -11.67D + (((tickAnim - 29D) / 11D) * 39.17D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(LowerArmL, LowerArmL.rotateAngleX + (float) Math.toRadians(xx), LowerArmL.rotateAngleY + (float) Math.toRadians(yy), LowerArmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 42.5D + (((tickAnim - 0D) / 8D) * -66.25D);
            yy = 0D + (((tickAnim - 0D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -23.75D + (((tickAnim - 8D) / 6D) * 173.75D);
            yy = 0D + (((tickAnim - 8D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 6D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 150D + (((tickAnim - 14D) / 8D) * -83.5D);
            yy = 0D + (((tickAnim - 14D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 8D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 66.5D + (((tickAnim - 22D) / 8D) * 0D);
            yy = 0D + (((tickAnim - 22D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 22D) / 8D) * 0D);
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 66.5D + (((tickAnim - 30D) / 10D) * -24D);
            yy = 0D + (((tickAnim - 30D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 30D) / 10D) * 0D);
        }


        this.setRotateAngle(HandL, HandL.rotateAngleX + (float) Math.toRadians(xx), HandL.rotateAngleY + (float) Math.toRadians(yy), HandL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -22.5D + (((tickAnim - 0D) / 11D) * 22.5D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 11D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 10D + (((tickAnim - 21D) / 10D) * 10D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 20D + (((tickAnim - 31D) / 9D) * -42.5D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(UpperLegR, UpperLegR.rotateAngleX + (float) Math.toRadians(xx), UpperLegR.rotateAngleY + (float) Math.toRadians(yy), UpperLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 44.98D + (((tickAnim - 0D) / 11D) * -57.48D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 22) {
            xx = -12.5D + (((tickAnim - 11D) / 11D) * 35D);
            yy = 0D + (((tickAnim - 11D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 11D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 22.5D + (((tickAnim - 22D) / 10D) * 8.13D);
            yy = 0D + (((tickAnim - 22D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 22D) / 10D) * 0D);
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 30.63D + (((tickAnim - 32D) / 8D) * 14.35D);
            yy = 0D + (((tickAnim - 32D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 32D) / 8D) * 0D);
        }


        this.setRotateAngle(LowerLegR, LowerLegR.rotateAngleX + (float) Math.toRadians(xx), LowerLegR.rotateAngleY + (float) Math.toRadians(yy), LowerLegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -29.46D + (((tickAnim - 0D) / 11D) * 29.46D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 11D) / 10D) * -12.5D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -12.5D + (((tickAnim - 21D) / 10D) * -12.5D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = -25D + (((tickAnim - 31D) / 8D) * -4.46D);
            yy = 0D + (((tickAnim - 31D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 8D) * 0D);
        }
        else {
            xx = -25D  -4.46D;
            yy = 0D;
            zz = 0D;
        }


        this.setRotateAngle(FootR, FootR.rotateAngleX + (float) Math.toRadians(xx), FootR.rotateAngleY + (float) Math.toRadians(yy), FootR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 0D) / 21D) * 27.5D);
            yy = 0D + (((tickAnim - 0D) / 21D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 21D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 27.5D + (((tickAnim - 21D) / 10D) * 33.87784D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0.0458D);
            zz = 0D + (((tickAnim - 21D) / 10D) * -0.2956D);
        }
        else if (tickAnim >= 31 && tickAnim < 39) {
            xx = 61.37784D + (((tickAnim - 31D) / 8D) * -61.37784D);
            yy = 0.0458D + (((tickAnim - 31D) / 8D) * -0.0458D);
            zz = -0.2956D + (((tickAnim - 31D) / 8D) * 0.2956D);
        }
        else {
            xx = 61.37784D -61.37784D;
            yy = 0.0458D  -0.0458D;
            zz = -0.2956D + 0.2956D;
        }


        this.setRotateAngle(ToesR, ToesR.rotateAngleX + (float) Math.toRadians(xx), ToesR.rotateAngleY + (float) Math.toRadians(yy), ToesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 10D + (((tickAnim - 0D) / 11D) * 10D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 20D + (((tickAnim - 11D) / 10D) * -42.5D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -22.5D + (((tickAnim - 21D) / 10D) * 22.5D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * 10D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(UpperLegL, UpperLegL.rotateAngleX + (float) Math.toRadians(xx), UpperLegL.rotateAngleY + (float) Math.toRadians(yy), UpperLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 22.5D + (((tickAnim - 0D) / 11D) * 8.13D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 30.63D + (((tickAnim - 11D) / 10D) * 14.35D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 44.98D + (((tickAnim - 21D) / 10D) * -57.48D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = -12.5D + (((tickAnim - 31D) / 9D) * 35D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(LowerLegL, LowerLegL.rotateAngleX + (float) Math.toRadians(xx), LowerLegL.rotateAngleY + (float) Math.toRadians(yy), LowerLegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -12.5D + (((tickAnim - 0D) / 11D) * -12.5D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 11D) * 0D);
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -25D + (((tickAnim - 11D) / 10D) * -4.46D);
            yy = 0D + (((tickAnim - 11D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 11D) / 10D) * 0D);
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -29.46D + (((tickAnim - 21D) / 10D) * 29.46D);
            yy = 0D + (((tickAnim - 21D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 21D) / 10D) * 0D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * -12.5D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(FootL, FootL.rotateAngleX + (float) Math.toRadians(xx), FootL.rotateAngleY + (float) Math.toRadians(yy), FootL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0.00474D + (((tickAnim - 0D) / 15D) * 0D);
            yy = -1D + (((tickAnim - 0D) / 15D) * 2D);
            zz = -1D + (((tickAnim - 0D) / 15D) * 2D);
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0.00474D + (((tickAnim - 15D) / 15D) * 0D);
            yy = 1D + (((tickAnim - 15D) / 15D) * -2D);
            zz = 1D + (((tickAnim - 15D) / 15D) * -2D);
        }
        else {
            xx = 0.00474D;
            yy = 1D  -2D;
            zz = 1D  -2D;
        }


        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2.50474D + (((tickAnim - 0D) / 10D) * -5.00474D);
            yy = 2.49048D + (((tickAnim - 0D) / 10D) * -2.49048D);
            zz = 0.21803D + (((tickAnim - 0D) / 10D) * -0.21803D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 5.00474D);
            yy = 0D + (((tickAnim - 10D) / 10D) * -2.49048D);
            zz = 0D + (((tickAnim - 10D) / 10D) * -0.21803D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 2.50474D + (((tickAnim - 20D) / 9D) * -5.00474D);
            yy = -2.49048D + (((tickAnim - 20D) / 9D) * 2.49048D);
            zz = -0.21803D + (((tickAnim - 20D) / 9D) * 0.21803D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 5.00474D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 2.49048D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0.21803D);
        }


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.49762D + (((tickAnim - 0D) / 8D) * -7.49762D);
            yy = 2.49762D + (((tickAnim - 0D) / 8D) * -2.49762D);
            zz = -0.10912D + (((tickAnim - 0D) / 8D) * 0.10912D);
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -5D + (((tickAnim - 8D) / 6D) * 7.49762D);
            yy = 0D + (((tickAnim - 8D) / 6D) * -2.49762D);
            zz = 0D + (((tickAnim - 8D) / 6D) * 0.10912D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.49762D + (((tickAnim - 14D) / 8D) * -7.49762D);
            yy = -2.49762D + (((tickAnim - 14D) / 8D) * 2.49762D);
            zz = 0.10912D + (((tickAnim - 14D) / 8D) * -0.10912D);
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -5D + (((tickAnim - 22D) / 8D) * 7.49762D);
            yy = 0D + (((tickAnim - 22D) / 8D) * 2.49762D);
            zz = 0D + (((tickAnim - 22D) / 8D) * -0.10912D);
        }
        else {
            xx = -5D + 7.49762D;
            yy = 0D +  2.49762D;
            zz = 0D  -0.10912D;
        }


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.519D + (((tickAnim - 0D) / 10D) * 12.519D);
            yy = 4.98093D + (((tickAnim - 0D) / 10D) * -4.98093D);
            zz = -0.43688D + (((tickAnim - 0D) / 10D) * 0.43688D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 10D) / 10D) * -12.519D);
            yy = 0D + (((tickAnim - 10D) / 10D) * -4.98093D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0.43688D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -2.519D + (((tickAnim - 20D) / 9D) * 12.519D);
            yy = -4.98093D + (((tickAnim - 20D) / 9D) * 4.98093D);
            zz = 0.43688D + (((tickAnim - 20D) / 9D) * -0.43688D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 10D + (((tickAnim - 29D) / 11D) * -12.519D);
            yy = 0D + (((tickAnim - 29D) / 11D) * 4.98093D);
            zz = 0D + (((tickAnim - 29D) / 11D) * -0.43688D);
        }


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 2.5D + (((tickAnim - 0D) / 8D) * -2.5D);
            yy = 0D + (((tickAnim - 0D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 8D) * 0D);
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 8D) / 6D) * 2.5D);
            yy = 0D + (((tickAnim - 8D) / 6D) * 0D);
            zz = 0D + (((tickAnim - 8D) / 6D) * 0D);
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 2.5D + (((tickAnim - 14D) / 8D) * -2.5D);
            yy = 0D + (((tickAnim - 14D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 14D) / 8D) * 0D);
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 22D) / 8D) * 2.5D);
            yy = 0D + (((tickAnim - 22D) / 8D) * 0D);
            zz = 0D + (((tickAnim - 22D) / 8D) * 0D);
        }
        else {
            xx = 0D +  2.5D;
            yy = 0D;
            zz = 0D;
        }


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 10D) / 10D) * 5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 29D) / 11D) * 5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 2.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 2.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * -2.5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 10D) / 10D) * 2.5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * -2.5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 29D) / 11D) * 2.5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * 5D);
            yy = -2.5D + (((tickAnim - 0D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 0D) / 10D) * 0D);
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 10D) / 10D) * -5D);
            yy = 0D + (((tickAnim - 10D) / 10D) * 2.5D);
            zz = 0D + (((tickAnim - 10D) / 10D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = 0D + (((tickAnim - 20D) / 9D) * 5D);
            yy = 2.5D + (((tickAnim - 20D) / 9D) * -2.5D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 29D) / 11D) * -5D);
            yy = 0D + (((tickAnim - 29D) / 11D) * -2.5D);
            zz = 0D + (((tickAnim - 29D) / 11D) * 0D);
        }


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 27.5D + (((tickAnim - 0D) / 11D) * 33.87784D);
            yy = 0D + (((tickAnim - 0D) / 11D) * 0.0458D);
            zz = 0D + (((tickAnim - 0D) / 11D) * -0.2956D);
        }
        else if (tickAnim >= 11 && tickAnim < 31) {
            xx = 61.37784D + (((tickAnim - 11D) / 20D) * -48.87784D);
            yy = 0.0458D + (((tickAnim - 11D) / 20D) * -0.0458D);
            zz = -0.2956D + (((tickAnim - 11D) / 20D) * 0.2956D);
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 12.5D + (((tickAnim - 31D) / 9D) * 15D);
            yy = 0D + (((tickAnim - 31D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 31D) / 9D) * 0D);
        }


        this.setRotateAngle(ToesL, ToesL.rotateAngleX + (float) Math.toRadians(xx), ToesL.rotateAngleY + (float) Math.toRadians(yy), ToesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 42.78D + (((tickAnim - 0D) / 20D) * -82.78D);
            yy = 0D + (((tickAnim - 0D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 29) {
            xx = -40D + (((tickAnim - 20D) / 9D) * 74.17D);
            yy = 0D + (((tickAnim - 20D) / 9D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 9D) * 0D);
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 34.17D + (((tickAnim - 29D) / 10D) * 8.61D);
            yy = 0D + (((tickAnim - 29D) / 10D) * 0D);
            zz = 0D + (((tickAnim - 29D) / 10D) * 0D);
        }
        else {
            xx = 34.17D +  8.61D;
            yy = 0D ;
            zz = 0;
        }


        this.setRotateAngle(ToesL2, ToesL2.rotateAngleX + (float) Math.toRadians(xx), ToesL2.rotateAngleY + (float) Math.toRadians(yy), ToesL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -40D + (((tickAnim - 0D) / 20D) * 82.78D);
            yy = 0D + (((tickAnim - 0D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 0D) / 20D) * 0D);
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 42.78D + (((tickAnim - 20D) / 20D) * -82.78D);
            yy = 0D + (((tickAnim - 20D) / 20D) * 0D);
            zz = 0D + (((tickAnim - 20D) / 20D) * 0D);
        }


        this.setRotateAngle(ToesR2, ToesR2.rotateAngleX + (float) Math.toRadians(xx), ToesR2.rotateAngleY + (float) Math.toRadians(yy), ToesR2.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSaurosuchus entity = (EntityPrehistoricFloraSaurosuchus) entitylivingbaseIn;


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSaurosuchus ee = (EntityPrehistoricFloraSaurosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

            if (!ee.getIsMoving()) {
                return;
            }

            if (ee.getIsFast()) { //Running
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

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
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSaurosuchus e = (EntityPrehistoricFloraSaurosuchus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        //setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.DRINK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.startKeyframe(3);
        animator.move(this.Hips, 0,(float) Math.toRadians(2),0);
        animator.rotate(Tail, (float) Math.toRadians(-22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Hips, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegL, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(UpperLegR, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Body, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Chest, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.NOISE_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(Neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(8);
        animator.resetKeyframe(9);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(Neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Jaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

    }
}
