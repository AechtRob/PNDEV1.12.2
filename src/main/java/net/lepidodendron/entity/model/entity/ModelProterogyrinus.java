package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProterogyrinus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelProterogyrinus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended main;
    private final AdvancedModelRendererExtended bodyfront;
    private final AdvancedModelRendererExtended bodyfrontfluke_r1;
    private final AdvancedModelRendererExtended FLupper;
    private final AdvancedModelRendererExtended box_r1;
    private final AdvancedModelRendererExtended FLlower;
    private final AdvancedModelRendererExtended FLfoot;
    private final AdvancedModelRendererExtended FRupper;
    private final AdvancedModelRendererExtended box_r2;
    private final AdvancedModelRendererExtended FRlower;
    private final AdvancedModelRendererExtended FRfoot;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended neckfluke_r1;
    private final AdvancedModelRendererExtended neck2_r1;
    private final AdvancedModelRendererExtended neck1_r1;
    private final AdvancedModelRendererExtended upperhead;
    private final AdvancedModelRendererExtended upperhead4_r1;
    private final AdvancedModelRendererExtended upperhead3_r1;
    private final AdvancedModelRendererExtended backheadR_r1;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended bodyback;
    private final AdvancedModelRendererExtended bodybackflukeF_r1;
    private final AdvancedModelRendererExtended bodyback_r1;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail1fluke_r1;
    private final AdvancedModelRendererExtended tail1_r1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail2fluke_r1;
    private final AdvancedModelRendererExtended tail2_r1;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail3_r1;
    private final AdvancedModelRendererExtended BRupper;
    private final AdvancedModelRendererExtended box_r3;
    private final AdvancedModelRendererExtended BRlower;
    private final AdvancedModelRendererExtended BRfoot;
    private final AdvancedModelRendererExtended BLupper;
    private final AdvancedModelRendererExtended box_r4;
    private final AdvancedModelRendererExtended BLlower;
    private final AdvancedModelRendererExtended BLfoot;

    private ModelAnimator animator;

    public ModelProterogyrinus() {
        this.textureWidth = 56;
        this.textureHeight = 48;

        this.main = new AdvancedModelRendererExtended(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -8.0F, -5.0F, 5, 5, 12, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 19, -0.5F, -8.5F, -5.0F, 1, 1, 12, 0.0F, false));

        this.bodyfront = new AdvancedModelRendererExtended(this);
        this.bodyfront.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 34, -2.0F, -7.25F, -9.0F, 4, 4, 5, 0.0F, false));

        this.bodyfrontfluke_r1 = new AdvancedModelRendererExtended(this);
        this.bodyfrontfluke_r1.setRotationPoint(-0.1F, -7.25F, -7.0F);
        this.bodyfront.addChild(bodyfrontfluke_r1);
        this.setRotateAngle(bodyfrontfluke_r1, 0.3054F, 0.0F, 0.0F);
        this.bodyfrontfluke_r1.cubeList.add(new ModelBox(bodyfrontfluke_r1, 17, 17, -0.399F, -0.571F, -1.65F, 1, 2, 4, 0.0F, false));

        this.FLupper = new AdvancedModelRendererExtended(this);
        this.FLupper.setRotationPoint(1.0F, -5.0F, -6.5F);
        this.bodyfront.addChild(FLupper);


        this.box_r1 = new AdvancedModelRendererExtended(this);
        this.box_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FLupper.addChild(box_r1);
        this.setRotateAngle(box_r1, -0.0873F, -0.2618F, 0.7418F);
        this.box_r1.cubeList.add(new ModelBox(box_r1, 40, 30, 0.0F, -1.0F, -1.5F, 4, 2, 2, 0.0F, false));

        this.FLlower = new AdvancedModelRendererExtended(this);
        this.FLlower.setRotationPoint(2.5F, 2.0F, 0.5F);
        this.FLupper.addChild(FLlower);
        this.FLlower.cubeList.add(new ModelBox(FLlower, 30, 22, -1.0F, 0.0F, -0.3F, 2, 2, 1, 0.0F, false));

        this.FLfoot = new AdvancedModelRendererExtended(this);
        this.FLfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.FLlower.addChild(FLfoot);
        this.FLfoot.cubeList.add(new ModelBox(FLfoot, 38, 14, -1.01F, -0.5F, -1.3F, 2, 1, 2, 0.0F, false));

        this.FRupper = new AdvancedModelRendererExtended(this);
        this.FRupper.setRotationPoint(-1.0F, -5.0F, -6.5F);
        this.bodyfront.addChild(FRupper);


        this.box_r2 = new AdvancedModelRendererExtended(this);
        this.box_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FRupper.addChild(box_r2);
        this.setRotateAngle(box_r2, -0.0873F, 0.2618F, -0.7418F);
        this.box_r2.cubeList.add(new ModelBox(box_r2, 40, 30, -4.0F, -1.0F, -1.5F, 4, 2, 2, 0.0F, true));

        this.FRlower = new AdvancedModelRendererExtended(this);
        this.FRlower.setRotationPoint(-2.5F, 2.0F, 0.5F);
        this.FRupper.addChild(FRlower);
        this.FRlower.cubeList.add(new ModelBox(FRlower, 30, 22, -1.0F, 0.0F, -0.3F, 2, 2, 1, 0.0F, true));

        this.FRfoot = new AdvancedModelRendererExtended(this);
        this.FRfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.FRlower.addChild(FRfoot);
        this.FRfoot.cubeList.add(new ModelBox(FRfoot, 38, 14, -0.99F, -0.5F, -1.3F, 2, 1, 2, 0.0F, true));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -5.5F, -9.0F);
        this.bodyfront.addChild(neck);


        this.neckfluke_r1 = new AdvancedModelRendererExtended(this);
        this.neckfluke_r1.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.neck.addChild(neckfluke_r1);
        this.setRotateAngle(neckfluke_r1, 0.4363F, 0.0F, 0.0F);
        this.neckfluke_r1.cubeList.add(new ModelBox(neckfluke_r1, 0, 17, -0.5F, 0.7F, -1.7F, 1, 2, 4, 0.0F, false));

        this.neck2_r1 = new AdvancedModelRendererExtended(this);
        this.neck2_r1.setRotationPoint(0.0F, 2.6744F, -3.1609F);
        this.neck.addChild(neck2_r1);
        this.setRotateAngle(neck2_r1, 0.0873F, 0.0F, 0.0F);
        this.neck2_r1.cubeList.add(new ModelBox(neck2_r1, 32, 34, -1.0F, -3.0744F, 0.0609F, 2, 3, 5, 0.0F, false));

        this.neck1_r1 = new AdvancedModelRendererExtended(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.1309F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 0, 0, -1.5F, -1.0F, -2.1F, 3, 3, 3, 0.0F, false));

        this.upperhead = new AdvancedModelRendererExtended(this);
        this.upperhead.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.neck.addChild(upperhead);
        this.upperhead.cubeList.add(new ModelBox(upperhead, 38, 5, -1.5F, 0.001F, -3.0F, 3, 2, 3, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 0, 43, -0.01F, 1.0F, -5.15F, 1, 1, 3, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 40, 42, -0.99F, 1.0F, -5.15F, 1, 1, 3, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 0, 17, 0.55F, 0.3F, -2.8F, 1, 1, 1, 0.0F, false));
        this.upperhead.cubeList.add(new ModelBox(upperhead, 6, 9, -1.55F, 0.3F, -2.8F, 1, 1, 1, 0.0F, false));

        this.upperhead4_r1 = new AdvancedModelRendererExtended(this);
        this.upperhead4_r1.setRotationPoint(0.0F, -0.0611F, -2.1006F);
        this.upperhead.addChild(upperhead4_r1);
        this.setRotateAngle(upperhead4_r1, 0.0873F, 0.0F, 0.0F);
        this.upperhead4_r1.cubeList.add(new ModelBox(upperhead4_r1, 13, 34, -1.0F, -0.1089F, -0.1094F, 2, 1, 3, 0.0F, false));

        this.upperhead3_r1 = new AdvancedModelRendererExtended(this);
        this.upperhead3_r1.setRotationPoint(0.0F, 1.5F, -5.0F);
        this.upperhead.addChild(upperhead3_r1);
        this.setRotateAngle(upperhead3_r1, 0.3927F, 0.0F, 0.0F);
        this.upperhead3_r1.cubeList.add(new ModelBox(upperhead3_r1, 26, 34, -1.0F, -0.45F, 0.2F, 2, 1, 3, 0.0F, false));

        this.backheadR_r1 = new AdvancedModelRendererExtended(this);
        this.backheadR_r1.setRotationPoint(0.5F, 1.5F, -1.0F);
        this.upperhead.addChild(backheadR_r1);
        this.setRotateAngle(backheadR_r1, 0.1745F, 0.0F, 0.0F);
        this.backheadR_r1.cubeList.add(new ModelBox(backheadR_r1, 41, 34, -1.9F, -1.5F, -0.75F, 2, 3, 2, 0.0F, false));
        this.backheadR_r1.cubeList.add(new ModelBox(backheadR_r1, 16, 42, -1.1F, -1.5F, -0.76F, 2, 3, 2, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.upperhead.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 5, -1.0F, 1.0F, -4.15F, 2, 1, 4, 0.0F, false));

        this.bodyback = new AdvancedModelRendererExtended(this);
        this.bodyback.setRotationPoint(0.0F, -5.0F, 6.5F);
        this.main.addChild(bodyback);


        this.bodybackflukeF_r1 = new AdvancedModelRendererExtended(this);
        this.bodybackflukeF_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyback.addChild(bodybackflukeF_r1);
        this.setRotateAngle(bodybackflukeF_r1, -0.192F, 0.0F, 0.0F);
        this.bodybackflukeF_r1.cubeList.add(new ModelBox(bodybackflukeF_r1, 18, 34, -0.51F, -3.45F, -0.5F, 1, 2, 6, 0.0F, false));

        this.bodyback_r1 = new AdvancedModelRendererExtended(this);
        this.bodyback_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyback.addChild(bodyback_r1);
        this.setRotateAngle(bodyback_r1, -0.1745F, 0.0F, 0.0F);
        this.bodyback_r1.cubeList.add(new ModelBox(bodyback_r1, 30, 19, -2.0F, -2.5F, -0.5F, 4, 4, 6, 0.0F, false));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, 2.6772F, 4.6822F);
        this.bodyback.addChild(tail1);


        this.tail1fluke_r1 = new AdvancedModelRendererExtended(this);
        this.tail1fluke_r1.setRotationPoint(0.0F, 1.6163F, 19.7724F);
        this.tail1.addChild(tail1fluke_r1);
        this.setRotateAngle(tail1fluke_r1, -0.1309F, 0.0F, 0.0F);
        this.tail1fluke_r1.cubeList.add(new ModelBox(tail1fluke_r1, 0, 22, 0.0F, -4.1935F, -19.5546F, 0, 2, 10, 0.0F, false));

        this.tail1_r1 = new AdvancedModelRendererExtended(this);
        this.tail1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail1.addChild(tail1_r1);
        this.setRotateAngle(tail1_r1, -0.1309F, 0.0F, 0.0F);
        this.tail1_r1.cubeList.add(new ModelBox(tail1_r1, 0, 17, -1.5F, -3.5F, -0.5F, 3, 3, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.0421F, 10.4178F);
        this.tail1.addChild(tail2);


        this.tail2fluke_r1 = new AdvancedModelRendererExtended(this);
        this.tail2fluke_r1.setRotationPoint(0.0F, 1.6584F, 9.3546F);
        this.tail2.addChild(tail2fluke_r1);
        this.setRotateAngle(tail2fluke_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2fluke_r1.cubeList.add(new ModelBox(tail2fluke_r1, 20, 22, -0.01F, -4.1935F, -9.5F, 0, 2, 10, 0.0F, false));

        this.tail2_r1 = new AdvancedModelRendererExtended(this);
        this.tail2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail2.addChild(tail2_r1);
        this.setRotateAngle(tail2_r1, -0.0873F, 0.0F, 0.0F);
        this.tail2_r1.cubeList.add(new ModelBox(tail2_r1, 23, 6, -1.0F, -1.3851F, -1.0461F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 1.3649F, 9.8F);
        this.tail2.addChild(tail3);


        this.tail3_r1 = new AdvancedModelRendererExtended(this);
        this.tail3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(tail3_r1);
        this.setRotateAngle(tail3_r1, -0.0436F, 0.0F, 0.0F);
        this.tail3_r1.cubeList.add(new ModelBox(tail3_r1, 0, 1, 0.0F, -2.9F, 0.0546F, 0, 3, 5, 0.0F, false));

        this.BRupper = new AdvancedModelRendererExtended(this);
        this.BRupper.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.bodyback.addChild(BRupper);


        this.box_r3 = new AdvancedModelRendererExtended(this);
        this.box_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BRupper.addChild(box_r3);
        this.setRotateAngle(box_r3, -0.0873F, -0.1309F, -0.7418F);
        this.box_r3.cubeList.add(new ModelBox(box_r3, 36, 0, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, true));

        this.BRlower = new AdvancedModelRendererExtended(this);
        this.BRlower.setRotationPoint(-2.5F, 2.0F, -0.5F);
        this.BRupper.addChild(BRlower);
        this.BRlower.cubeList.add(new ModelBox(BRlower, 32, 42, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.BRfoot = new AdvancedModelRendererExtended(this);
        this.BRfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.BRlower.addChild(BRfoot);
        this.BRfoot.cubeList.add(new ModelBox(BRfoot, 17, 23, -0.99F, -0.5F, -2.0F, 2, 1, 3, 0.0F, true));

        this.BLupper = new AdvancedModelRendererExtended(this);
        this.BLupper.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.bodyback.addChild(BLupper);


        this.box_r4 = new AdvancedModelRendererExtended(this);
        this.box_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BLupper.addChild(box_r4);
        this.setRotateAngle(box_r4, -0.0873F, 0.1309F, 0.7418F);
        this.box_r4.cubeList.add(new ModelBox(box_r4, 36, 0, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.BLlower = new AdvancedModelRendererExtended(this);
        this.BLlower.setRotationPoint(2.5F, 2.0F, -0.5F);
        this.BLupper.addChild(BLlower);
        this.BLlower.cubeList.add(new ModelBox(BLlower, 32, 42, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.BLfoot = new AdvancedModelRendererExtended(this);
        this.BLfoot.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.BLlower.addChild(BLfoot);
        this.BLfoot.cubeList.add(new ModelBox(BLfoot, 17, 23, -0.99F, -0.5F, -2.0F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5 * 0.63F);
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
        this.main.offsetY = 0.55F; //72

        EntityPrehistoricFloraProterogyrinus Proterogyrinus = (EntityPrehistoricFloraProterogyrinus) e;

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, upperhead);

        float speed = 0.225F;
        if (Proterogyrinus.getIsFast()) {
            speed = speed * 1.52F;
        }
        AdvancedModelRenderer[] Tail = {this.bodyback, this.tail2, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.upperhead, this.neck, this.bodyfront};

        if (!Proterogyrinus.isReallyInWater()) {

            if (f3 == 0.0F || !Proterogyrinus.getIsMoving()) { //Not moving
                return;
            }

            this.flap(BLupper, speed, 0.45F, false, 0, -0.35F, f2, 0.5F);
            this.swing(BLupper, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(BLlower, speed, -0.6F, true, 5, 0F, f2, 0.8F);
            this.walk(BLfoot, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.flap(BRupper, speed, -0.45F, false, 3, 0.35F, f2, 0.5F);
            this.swing(BRupper, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(BRlower, speed, -0.6F, true, 8, 0F, f2, 0.8F);
            this.walk(BRfoot, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(FLupper, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(FLupper, speed, -0.5F, true, 8, 0.25F, f2, 0.5F);
            this.walk(FLlower, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(FLfoot, speed, 0.6F, false, 4, 0.3F, f2, 0.5F);

            this.flap(FRupper, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(FRupper, speed, -0.5F, true, 5, 0.25F, f2, 0.5F);
            this.walk(FRlower, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(FRfoot, speed, 0.6F, false, 1, 0.3F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.1F, -0.2, f2, 0.5F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);
            this.bob(main, speed*2, 0.155F, false, f2, 1F);

            this.main.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(0.85), false, 1.5F, f2, 1);

        }
        else {
            speed = speed * 2F;

            //Feet:
            this.FLfoot.rotateAngleX = (float) Math.toRadians(70);
            this.FRfoot.rotateAngleX = (float) Math.toRadians(70);
            this.BLfoot.rotateAngleX = (float) Math.toRadians(50);
            this.BRfoot.rotateAngleX = (float) Math.toRadians(50);

            this.FLlower.rotateAngleX= (float) Math.toRadians(40);
            this.FRlower.rotateAngleX= (float) Math.toRadians(40);
            this.BLlower.rotateAngleX= (float) Math.toRadians(50);
            this.BRlower.rotateAngleX= (float) Math.toRadians(50);

            AdvancedModelRenderer[] BackL = {this.BLlower, this.BLfoot};
            AdvancedModelRenderer[] BackR = {this.BRlower, this.BRfoot};

            this.flap(BLupper, speed, 0.1F, false, 0F, 0.05F, f2, 1F);
            this.flap(BRupper, speed, 0.1F, false, 3F, 0.05F, f2, 1F);
            this.chainWaveExtended(BackL, speed, -0.3F, -1, 0F,  f2, 1);
            this.chainWaveExtended(BackR, speed, -0.3F, -1, 3F, f2, 1);

            this.flap(FLupper, speed, 0.45F, false, 3, -0.35F, f2, 0.5F);
            this.swing(FLupper, speed, -0.4F, true, 8, 0.2F, f2, 0.5F);
            this.walk(FLlower, speed, -0.6F, true, 8, 0.4F, f2, 0.8F);
            this.walk(FLfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);

            this.flap(FRupper, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            this.swing(FRupper, speed, -0.4F, true, 5, 0.2F, f2, 0.5F);
            this.walk(FRlower, speed, -0.6F, true, 5, 0.4F, f2, 0.8F);
            this.walk(FRfoot, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);

            //this.chainWave(Tail, speed, 0.1F, -0.2, f2, 0.7F);
            this.chainSwing(Tail, speed, 0.325F, -1.0, f2, 0.6F);
            this.chainSwing(Torso, speed, 0.1F, -0.2, f2, 0.7F);

            this.walk(main, speed, 0.02F, false, 0, 0.01F, f2, 0.7F);
            this.bob(main, speed, 0.02F, false, f2, 0.7F);
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.upperhead, 0,0,-0.3F);
        animator.rotate(this.upperhead, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.neck, 0,0,-0.15F);
        animator.move(this.upperhead, 0,0,-0.15F);
        animator.rotate(this.neck, (float) Math.toRadians(-25.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.upperhead, (float) Math.toRadians(-45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
