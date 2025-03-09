package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAcrolepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Acrolepis;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Teethfront_r1;
    private final AdvancedModelRenderer TeethR_r1;
    private final AdvancedModelRenderer Backattachment_r1;
    private final AdvancedModelRenderer Throat_r1;
    private final AdvancedModelRenderer GillPlate_r1;
    private final AdvancedModelRenderer Forehead_r1;
    private final AdvancedModelRenderer Eyeplate_r1;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Jaws;
    private final AdvancedModelRenderer TeethFront_r2;
    private final AdvancedModelRenderer Jaw_r1;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer Belly1_r1;
    private final AdvancedModelRenderer Back1_small_r1;
    private final AdvancedModelRenderer Back1_r1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Belly2_r1;
    private final AdvancedModelRenderer Back2_r1;
    private final AdvancedModelRenderer DorsalFin;
    private final AdvancedModelRenderer Dorsalfin_r1;
    private final AdvancedModelRenderer VentralFinR;
    private final AdvancedModelRenderer VentralFinL;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Belly3_r1;
    private final AdvancedModelRenderer Back3_r1;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Back4_r1;
    private final AdvancedModelRenderer Belly_end_r1;
    private final AdvancedModelRenderer AnalFin;
    private final AdvancedModelRenderer Analfin_r1;
    private final AdvancedModelRenderer Tail_Begin;
    private final AdvancedModelRenderer Back_end_r1;
    private final AdvancedModelRenderer Tail_middle;
    private final AdvancedModelRenderer Tailbody2_r1;
    private final AdvancedModelRenderer Tail_end;
    private final AdvancedModelRenderer Tailbody3_r1;
    private final AdvancedModelRenderer Caudalfin3_r1;

    private ModelAnimator animator;

    public ModelAcrolepis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Acrolepis = new AdvancedModelRenderer(this);
        this.Acrolepis.setRotationPoint(0.0F, 16.0F, -3.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -1.0F);
        this.Acrolepis.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 36, -3.0F, -5.0F, -9.0F, 6, 10, 9, 0.0F, false));

        this.Teethfront_r1 = new AdvancedModelRenderer(this);
        this.Teethfront_r1.setRotationPoint(1.0F, 3.0F, -17.0F);
        this.Head.addChild(Teethfront_r1);
        this.setRotateAngle(Teethfront_r1, 0.2269F, 0.0F, 0.0F);
        this.Teethfront_r1.cubeList.add(new ModelBox(Teethfront_r1, 21, 44, -3.5F, -0.2733F, 0.4643F, 5, 1, 0, 0.0F, false));

        this.TeethR_r1 = new AdvancedModelRenderer(this);
        this.TeethR_r1.setRotationPoint(3.0F, 2.0F, -11.0F);
        this.Head.addChild(TeethR_r1);
        this.setRotateAngle(TeethR_r1, 0.0873F, 0.0F, 0.0F);
        this.TeethR_r1.cubeList.add(new ModelBox(TeethR_r1, 0, 6, -5.8F, 0.2F, -5.7F, 0, 1, 6, 0.0F, false));
        this.TeethR_r1.cubeList.add(new ModelBox(TeethR_r1, 0, 7, -0.2F, 0.2F, -5.7F, 0, 1, 6, 0.0F, false));

        this.Backattachment_r1 = new AdvancedModelRenderer(this);
        this.Backattachment_r1.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.Head.addChild(Backattachment_r1);
        this.setRotateAngle(Backattachment_r1, 0.1833F, 0.0F, 0.0F);
        this.Backattachment_r1.cubeList.add(new ModelBox(Backattachment_r1, 0, 0, -2.5F, 0.0F, -7.5F, 5, 3, 9, -0.02F, false));

        this.Throat_r1 = new AdvancedModelRenderer(this);
        this.Throat_r1.setRotationPoint(0.0F, 4.0F, -9.0F);
        this.Head.addChild(Throat_r1);
        this.setRotateAngle(Throat_r1, -0.2182F, 0.0F, 0.0F);
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 49, 8, -3.0F, -2.0F, 0.0F, 6, 3, 9, 0.01F, false));

        this.GillPlate_r1 = new AdvancedModelRenderer(this);
        this.GillPlate_r1.setRotationPoint(0.0F, 2.0F, -7.0F);
        this.Head.addChild(GillPlate_r1);
        this.setRotateAngle(GillPlate_r1, -0.1745F, 0.0F, 0.0F);
        this.GillPlate_r1.cubeList.add(new ModelBox(GillPlate_r1, 28, 0, -3.5F, -5.7F, -3.2F, 7, 9, 8, 0.0F, false));

        this.Forehead_r1 = new AdvancedModelRenderer(this);
        this.Forehead_r1.setRotationPoint(0.0F, -4.0F, -8.0F);
        this.Head.addChild(Forehead_r1);
        this.setRotateAngle(Forehead_r1, 0.4276F, 0.0F, 0.0F);
        this.Forehead_r1.cubeList.add(new ModelBox(Forehead_r1, 0, 59, -2.5F, -2.0F, -8.6F, 5, 3, 8, -0.01F, false));

        this.Eyeplate_r1 = new AdvancedModelRenderer(this);
        this.Eyeplate_r1.setRotationPoint(0.0F, -1.0F, -8.0F);
        this.Head.addChild(Eyeplate_r1);
        this.setRotateAngle(Eyeplate_r1, 0.0873F, 0.0F, 0.0F);
        this.Eyeplate_r1.cubeList.add(new ModelBox(Eyeplate_r1, 38, 36, -3.0F, -2.0F, -9.0F, 6, 5, 9, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 4.6F, -2.7F);
        this.Head.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.2671F, -0.4372F, 0.2897F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 50, 73, 0.0F, -1.0F, -0.6F, 0, 9, 5, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 4.6F, -2.7F);
        this.Head.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.2794F, 0.5213F, -0.2632F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 40, 73, 0.0F, -0.902F, -0.8009F, 0, 9, 5, 0.0F, false));

        this.Jaws = new AdvancedModelRenderer(this);
        this.Jaws.setRotationPoint(0.0F, 3.0F, -9.0F);
        this.Head.addChild(Jaws);
        this.setRotateAngle(Jaws, -0.096F, 0.0F, 0.0F);
        this.Jaws.cubeList.add(new ModelBox(Jaws, 50, 0, -3.0F, 1.0F, -5.0F, 6, 1, 5, -0.01F, false));

        this.TeethFront_r2 = new AdvancedModelRenderer(this);
        this.TeethFront_r2.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.Jaws.addChild(TeethFront_r2);
        this.setRotateAngle(TeethFront_r2, 0.1571F, 0.0F, 0.0F);
        this.TeethFront_r2.cubeList.add(new ModelBox(TeethFront_r2, 31, 44, 0.5F, -1.8F, -7.4F, 5, 1, 0, 0.0F, false));
        this.TeethFront_r2.cubeList.add(new ModelBox(TeethFront_r2, 12, 6, 5.9F, -1.8F, -7.4F, 0, 1, 6, 0.0F, false));
        this.TeethFront_r2.cubeList.add(new ModelBox(TeethFront_r2, 12, 7, 0.1F, -1.8F, -7.4F, 0, 1, 6, 0.0F, false));

        this.Jaw_r1 = new AdvancedModelRenderer(this);
        this.Jaw_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaws.addChild(Jaw_r1);
        this.setRotateAngle(Jaw_r1, 0.1745F, 0.0F, 0.0F);
        this.Jaw_r1.cubeList.add(new ModelBox(Jaw_r1, 49, 20, -3.0F, -0.9152F, -7.3736F, 6, 2, 9, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Acrolepis.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 19, 17, -3.0F, -6.0F, 0.0F, 6, 10, 9, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 70, 9, -2.5F, 3.3185F, 4.9146F, 5, 3, 4, -0.01F, false));

        this.Belly1_r1 = new AdvancedModelRenderer(this);
        this.Belly1_r1.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body1.addChild(Belly1_r1);
        this.setRotateAngle(Belly1_r1, -0.0698F, 0.0F, 0.0F);
        this.Belly1_r1.cubeList.add(new ModelBox(Belly1_r1, 70, 0, -2.5F, -3.0F, -0.5F, 5, 3, 6, 0.0F, false));

        this.Back1_small_r1 = new AdvancedModelRenderer(this);
        this.Back1_small_r1.setRotationPoint(0.0F, -8.0F, 5.0F);
        this.Body1.addChild(Back1_small_r1);
        this.setRotateAngle(Back1_small_r1, 0.0349F, 0.0F, 0.0F);
        this.Back1_small_r1.cubeList.add(new ModelBox(Back1_small_r1, 75, 29, -2.5F, -0.7358F, -0.081F, 5, 3, 4, -0.01F, false));

        this.Back1_r1 = new AdvancedModelRenderer(this);
        this.Back1_r1.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.Body1.addChild(Back1_r1);
        this.setRotateAngle(Back1_r1, 0.0873F, 0.0F, 0.0F);
        this.Back1_r1.cubeList.add(new ModelBox(Back1_r1, 70, 20, -2.5F, -0.3F, -0.5F, 5, 3, 6, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 23, 50, -2.5F, -5.0F, 0.0F, 5, 10, 7, 0.0F, false));

        this.Belly2_r1 = new AdvancedModelRenderer(this);
        this.Belly2_r1.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Body2.addChild(Belly2_r1);
        this.setRotateAngle(Belly2_r1, 0.0698F, 0.0F, 0.0F);
        this.Belly2_r1.cubeList.add(new ModelBox(Belly2_r1, 40, 68, -2.0F, -2.8F, 0.0F, 4, 3, 7, 0.0F, false));

        this.Back2_r1 = new AdvancedModelRenderer(this);
        this.Back2_r1.setRotationPoint(0.0F, -6.0F, -0.4F);
        this.Body2.addChild(Back2_r1);
        this.setRotateAngle(Back2_r1, -0.0873F, 0.0F, 0.0F);
        this.Back2_r1.cubeList.add(new ModelBox(Back2_r1, 59, 31, -2.0F, -1.8F, -0.4F, 4, 3, 8, 0.0F, false));

        this.DorsalFin = new AdvancedModelRenderer(this);
        this.DorsalFin.setRotationPoint(0.0F, -6.0F, -0.4F);
        this.Body2.addChild(DorsalFin);


        this.Dorsalfin_r1 = new AdvancedModelRenderer(this);
        this.Dorsalfin_r1.setRotationPoint(1.0F, -1.5F, 0.0F);
        this.DorsalFin.addChild(Dorsalfin_r1);
        this.setRotateAngle(Dorsalfin_r1, -0.4363F, 0.0F, 0.0F);
        this.Dorsalfin_r1.cubeList.add(new ModelBox(Dorsalfin_r1, 0, 18, -1.0F, -10.0F, 0.0F, 0, 10, 8, 0.0F, false));

        this.VentralFinR = new AdvancedModelRenderer(this);
        this.VentralFinR.setRotationPoint(-2.5F, 6.0F, 4.0F);
        this.Body2.addChild(VentralFinR);
        this.setRotateAngle(VentralFinR, 0.2617F, -0.1715F, 0.1349F);
        this.VentralFinR.cubeList.add(new ModelBox(VentralFinR, 34, 62, 0.0F, -1.0F, -2.0F, 0, 5, 5, 0.0F, false));

        this.VentralFinL = new AdvancedModelRenderer(this);
        this.VentralFinL.setRotationPoint(2.5F, 6.0F, 4.0F);
        this.Body2.addChild(VentralFinL);
        this.setRotateAngle(VentralFinL, 0.2617F, 0.1715F, -0.1349F);
        this.VentralFinL.cubeList.add(new ModelBox(VentralFinL, 49, 26, 0.0F, -1.0F, -2.0F, 0, 5, 5, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 67, -2.0F, -5.0F, 0.0F, 4, 10, 6, 0.0F, false));

        this.Belly3_r1 = new AdvancedModelRenderer(this);
        this.Belly3_r1.setRotationPoint(-0.5F, 6.5F, -0.1F);
        this.Body3.addChild(Belly3_r1);
        this.setRotateAngle(Belly3_r1, -0.0349F, 0.0F, 0.0F);
        this.Belly3_r1.cubeList.add(new ModelBox(Belly3_r1, 73, 42, -1.0F, -2.8F, 0.0F, 3, 3, 6, -0.02F, false));

        this.Back3_r1 = new AdvancedModelRenderer(this);
        this.Back3_r1.setRotationPoint(-0.5F, -5.4F, -0.7F);
        this.Body3.addChild(Back3_r1);
        this.setRotateAngle(Back3_r1, -0.1222F, 0.0F, 0.0F);
        this.Back3_r1.cubeList.add(new ModelBox(Back3_r1, 71, 53, -1.0F, -1.8F, -0.4F, 3, 3, 7, -0.01F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 62, 69, -1.5F, -5.0F, 0.0F, 3, 10, 5, 0.0F, false));

        this.Back4_r1 = new AdvancedModelRenderer(this);
        this.Back4_r1.setRotationPoint(-1.0F, -4.7F, -1.7F);
        this.Body4.addChild(Back4_r1);
        this.setRotateAngle(Back4_r1, -0.0873F, 0.0F, 0.0F);
        this.Back4_r1.cubeList.add(new ModelBox(Back4_r1, 19, 0, 0.0F, -1.8F, 0.6F, 2, 2, 6, -0.01F, false));

        this.Belly_end_r1 = new AdvancedModelRenderer(this);
        this.Belly_end_r1.setRotationPoint(0.0F, 6.7F, -2.1F);
        this.Body4.addChild(Belly_end_r1);
        this.setRotateAngle(Belly_end_r1, -0.0349F, 0.0F, 0.0F);
        this.Belly_end_r1.cubeList.add(new ModelBox(Belly_end_r1, 78, 65, -1.0F, -2.8F, 2.0F, 2, 3, 4, -0.02F, false));

        this.AnalFin = new AdvancedModelRenderer(this);
        this.AnalFin.setRotationPoint(0.5F, 7.0F, 3.0F);
        this.Body4.addChild(AnalFin);


        this.Analfin_r1 = new AdvancedModelRenderer(this);
        this.Analfin_r1.setRotationPoint(0.5F, 0.0F, 2.8F);
        this.AnalFin.addChild(Analfin_r1);
        this.setRotateAngle(Analfin_r1, -1.2566F, 0.0F, 0.0F);
        this.Analfin_r1.cubeList.add(new ModelBox(Analfin_r1, 40, 42, -1.0F, 0.0F, -3.0F, 0, 6, 8, 0.0F, false));

        this.Tail_Begin = new AdvancedModelRenderer(this);
        this.Tail_Begin.setRotationPoint(0.5F, 0.0F, 5.0F);
        this.Body4.addChild(Tail_Begin);
        this.Tail_Begin.cubeList.add(new ModelBox(Tail_Begin, 47, 50, -1.5F, -5.0F, 0.0F, 2, 9, 9, 0.0F, false));
        this.Tail_Begin.cubeList.add(new ModelBox(Tail_Begin, 40, 12, -0.5F, 4.0F, 1.0F, 0, 6, 8, 0.0F, false));

        this.Back_end_r1 = new AdvancedModelRenderer(this);
        this.Back_end_r1.setRotationPoint(-1.5F, -4.2F, -1.7F);
        this.Tail_Begin.addChild(Back_end_r1);
        this.setRotateAngle(Back_end_r1, -0.1047F, 0.0F, 0.0F);
        this.Back_end_r1.cubeList.add(new ModelBox(Back_end_r1, 60, 42, 0.0F, -1.8F, 0.6F, 2, 2, 9, -0.01F, false));

        this.Tail_middle = new AdvancedModelRenderer(this);
        this.Tail_middle.setRotationPoint(0.0F, -3.0F, 9.0F);
        this.Tail_Begin.addChild(Tail_middle);
        this.Tail_middle.cubeList.add(new ModelBox(Tail_middle, 0, 0, -0.5F, 2.0F, -1.0F, 0, 12, 14, 0.0F, false));

        this.Tailbody2_r1 = new AdvancedModelRenderer(this);
        this.Tailbody2_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Tail_middle.addChild(Tailbody2_r1);
        this.setRotateAngle(Tailbody2_r1, 0.0436F, 0.0F, 0.0F);
        this.Tailbody2_r1.cubeList.add(new ModelBox(Tailbody2_r1, 0, 70, -2.0F, -2.0F, -1.0F, 2, 5, 7, 0.0F, false));

        this.Tail_end = new AdvancedModelRenderer(this);
        this.Tail_end.setRotationPoint(0.0F, -1.2F, 6.0F);
        this.Tail_middle.addChild(Tail_end);


        this.Tailbody3_r1 = new AdvancedModelRenderer(this);
        this.Tailbody3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tail_end.addChild(Tailbody3_r1);
        this.setRotateAngle(Tailbody3_r1, 0.2182F, 0.0F, 0.0F);
        this.Tailbody3_r1.cubeList.add(new ModelBox(Tailbody3_r1, 58, 57, -1.0F, -1.0F, 0.0F, 1, 1, 11, 0.0F, false));

        this.Caudalfin3_r1 = new AdvancedModelRenderer(this);
        this.Caudalfin3_r1.setRotationPoint(0.5F, 4.2F, 1.5F);
        this.Tail_end.addChild(Caudalfin3_r1);
        this.setRotateAngle(Caudalfin3_r1, 0.2094F, 0.0F, 0.0F);
        this.Caudalfin3_r1.cubeList.add(new ModelBox(Caudalfin3_r1, 21, 23, -1.0F, -5.0F, -2.0F, 0, 8, 13, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Acrolepis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Acrolepis.rotateAngleY = (float) Math.toRadians(90);
        this.Acrolepis.offsetY = -0.15F;
        this.Acrolepis.offsetX = -0.1F;
        this.Acrolepis.offsetZ = 0.025F;
        this.Acrolepis.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Acrolepis, 0.0F, -0.0F, 0.1F);
        this.setRotateAngle(Body1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(Body4, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(Tail_Begin, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail_middle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail_end, 0.0F, 0.2F, 0.0F);
        this.Acrolepis.offsetZ = -0.05F;
        this.Acrolepis.offsetY = -0.1F;
        this.Acrolepis.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Acrolepis.offsetY = -0.7F;
        this.Acrolepis.offsetX = 0.725F;
        this.Acrolepis.rotateAngleY = (float) Math.toRadians(210);
        this.Acrolepis.rotateAngleX = (float) Math.toRadians(8);
        this.Acrolepis.rotateAngleZ = (float) Math.toRadians(-4);
        this.Acrolepis.scaleChildren = true;
        float scaler = 0.88F;
        this.Acrolepis.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Acrolepis, 0.0F, -2F, 0.1F);
        this.setRotateAngle(Body1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(Body4, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(Tail_Begin, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail_middle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail_end, 0.0F, 0.2F, 0.0F);
        //End of pose, now render the model:
        this.Acrolepis.render(f);
        //Reset rotations, positions and sizing:
        this.Acrolepis.setScale(1.0F, 1.0F, 1.0F);
        this.Acrolepis.scaleChildren = false;
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Acrolepis.offsetY = 1.0F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Tail_Begin, this.Tail_middle, this.Tail_end};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(Acrolepis, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Acrolepis, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(PectoralL, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralL, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(PectoralR, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(PectoralR, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(VentralFinL, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(VentralFinL, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(VentralFinR, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(VentralFinR, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);

        this.flap(AnalFin, (float) (speed * 0.65), -0.28F, false, 0.4F, 0.1F, f2, 0.5F);
        this.flap(DorsalFin, (float) (speed * 0.65), -0.18F, false, 0.4F, 0.05F, f2, 0.5F);

        if (!e.isInWater()) {
            this.Acrolepis.rotateAngleZ = (float) Math.toRadians(90);
            this.Acrolepis.offsetY = 0.40F;
            this.bob(Acrolepis, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Head, 0,0,-0.5F);
        animator.rotate(this.Head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaws, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

