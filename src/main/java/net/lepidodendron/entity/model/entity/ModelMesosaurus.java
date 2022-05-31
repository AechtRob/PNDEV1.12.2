package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMesosaurus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.entity.Entity;

public class ModelMesosaurus extends AdvancedModelBaseExtended {
    public AdvancedModelRendererExtended body;
    public AdvancedModelRendererExtended bodyfront;
    public AdvancedModelRendererExtended pelvis;
    public AdvancedModelRendererExtended neckbase;
    public AdvancedModelRendererExtended leftarm1;
    public AdvancedModelRendererExtended rightarm1;
    public AdvancedModelRendererExtended neck;
    public AdvancedModelRendererExtended head;
    public AdvancedModelRendererExtended upperjaw1;
    public AdvancedModelRendererExtended mandible;
    public AdvancedModelRendererExtended upperjaw2;
    public AdvancedModelRendererExtended snout1;
    public AdvancedModelRendererExtended upperleftteeth1;
    public AdvancedModelRendererExtended upperrightteeth1;
    public AdvancedModelRendererExtended upperfrontteeth;
    public AdvancedModelRendererExtended upperleftteeth2;
    public AdvancedModelRendererExtended upperrightteeth2;
    public AdvancedModelRendererExtended snout2;
    public AdvancedModelRendererExtended lowerjaw1;
    public AdvancedModelRendererExtended gumsleft;
    public AdvancedModelRendererExtended gumsright;
    public AdvancedModelRendererExtended lowerjaw2;
    public AdvancedModelRendererExtended snout1_1;
    public AdvancedModelRendererExtended lowerleftteeth1;
    public AdvancedModelRendererExtended lowerrightteeth1;
    public AdvancedModelRendererExtended lowerleftteeth2;
    public AdvancedModelRendererExtended lowerrightteeth2;
    public AdvancedModelRendererExtended lowerfrontteeth;
    public AdvancedModelRendererExtended snout2_1;
    public AdvancedModelRendererExtended leftarm2;
    public AdvancedModelRendererExtended leftfrontfin;
    public AdvancedModelRendererExtended rightarm2;
    public AdvancedModelRendererExtended rightfrontfin;
    public AdvancedModelRendererExtended tailbase;
    public AdvancedModelRendererExtended leftleg1;
    public AdvancedModelRendererExtended rightleg1;
    public AdvancedModelRendererExtended tail1;
    public AdvancedModelRendererExtended tailfin0;
    public AdvancedModelRendererExtended tail2;
    public AdvancedModelRendererExtended tailfin1;
    public AdvancedModelRendererExtended tail3;
    public AdvancedModelRendererExtended tailfin2;
    public AdvancedModelRendererExtended tailfin3;
    public AdvancedModelRendererExtended leftleg2;
    public AdvancedModelRendererExtended leftrearfin;
    public AdvancedModelRendererExtended rightleg2;
    public AdvancedModelRendererExtended rightrearfin;

    private ModelAnimator animator;

    public ModelMesosaurus() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.tailbase = new AdvancedModelRendererExtended(this, 0, 61);
        this.tailbase.setRotationPoint(0.0F, -0.3F, 11.0F);
        this.tailbase.addBox(-3.5F, -4.0F, -3.0F, 7, 8, 16, 0.0F);
        this.snout1_1 = new AdvancedModelRendererExtended(this, 0, 10);
        this.snout1_1.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.snout1_1.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(snout1_1, -0.143116998663535F, 0.0F, 0.0F);
        this.lowerrightteeth1 = new AdvancedModelRendererExtended(this, 6, 18);
        this.lowerrightteeth1.setRotationPoint(-3.1F, -2.8F, 0.0F);
        this.lowerrightteeth1.addBox(0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(lowerrightteeth1, 0.0F, 0.0F, -0.39269908169872414F);
        this.lowerleftteeth2 = new AdvancedModelRendererExtended(this, 0, 19);
        this.lowerleftteeth2.setRotationPoint(2.1F, -2.8F, 0.0F);
        this.lowerleftteeth2.addBox(0.0F, 0.0F, -16.0F, 0, 2, 16, 0.0F);
        this.setRotateAngle(lowerleftteeth2, 0.0F, 0.0F, 0.39269908169872414F);
        this.gumsright = new AdvancedModelRendererExtended(this, 43, 2);
        this.gumsright.setRotationPoint(-2.3F, -1.1F, -1.0F);
        this.gumsright.addBox(0.0F, -2.0F, -3.0F, 0, 5, 3, 0.0F);
        this.setRotateAngle(gumsright, -0.39269908169872414F, 0.0F, 0.0F);
        this.lowerleftteeth1 = new AdvancedModelRendererExtended(this, 6, 18);
        this.lowerleftteeth1.setRotationPoint(3.1F, -2.8F, 0.0F);
        this.lowerleftteeth1.addBox(0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(lowerleftteeth1, 0.0F, 0.0F, 0.39269908169872414F);
        this.leftfrontfin = new AdvancedModelRendererExtended(this, 60, 104);
        this.leftfrontfin.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.leftfrontfin.addBox(-0.5F, -0.5F, -3.0F, 6, 1, 6, 0.0F);
        this.leftarm1 = new AdvancedModelRendererExtended(this, 103, 90);
        this.leftarm1.setRotationPoint(4.5F, 3.0F, -9.0F);
        this.leftarm1.addBox(-1.5F, -1.5F, -2.0F, 10, 3, 4, 0.0F);
        this.rightrearfin = new AdvancedModelRendererExtended(this, 0, 102);
        this.rightrearfin.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.rightrearfin.addBox(-7.5F, -0.5F, -4.0F, 8, 1, 8, 0.0F);
        this.leftarm2 = new AdvancedModelRendererExtended(this, 105, 23);
        this.leftarm2.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.leftarm2.addBox(-0.5F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.tail1 = new AdvancedModelRendererExtended(this, 76, 69);
        this.tail1.setRotationPoint(0.0F, -0.5F, 12.0F);
        this.tail1.addBox(-2.5F, -2.5F, -1.0F, 5, 5, 16, 0.0F);
        this.gumsleft = new AdvancedModelRendererExtended(this, 16, 0);
        this.gumsleft.setRotationPoint(2.3F, -1.1F, -1.0F);
        this.gumsleft.addBox(0.0F, -2.0F, -3.0F, 0, 5, 3, 0.0F);
        this.setRotateAngle(gumsleft, -0.39269908169872414F, 0.0F, 0.0F);
        this.neck = new AdvancedModelRendererExtended(this, 101, 41);
        this.neck.setRotationPoint(0.0F, -0.8F, -6.5F);
        this.neck.addBox(-2.5F, -3.0F, -8.5F, 5, 6, 10, 0.0F);
        this.upperleftteeth2 = new AdvancedModelRendererExtended(this, 0, 23);
        this.upperleftteeth2.setRotationPoint(1.4F, 1.0F, 0.0F);
        this.upperleftteeth2.addBox(0.0F, 0.0F, -16.0F, 0, 2, 16, 0.0F);
        this.setRotateAngle(upperleftteeth2, 0.0F, 0.0F, -0.39269908169872414F);
        this.upperjaw2 = new AdvancedModelRendererExtended(this, 44, 86);
        this.upperjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.upperjaw2.addBox(-1.5F, -1.0F, -16.0F, 3, 2, 16, 0.0F);
        this.upperrightteeth2 = new AdvancedModelRendererExtended(this, -17, 25);
        this.upperrightteeth2.setRotationPoint(-1.4F, 1.0F, 0.0F);
        this.upperrightteeth2.addBox(0.0F, 0.0F, -16.0F, 0, 2, 16, 0.0F);
        this.setRotateAngle(upperrightteeth2, 0.0F, 0.0F, 0.39269908169872414F);
        this.tailfin1 = new AdvancedModelRendererExtended(this, 32, 71);
        this.tailfin1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.tailfin1.addBox(0.0F, -8.5F, 0.0F, 0, 17, 14, 0.0F);
        this.upperrightteeth1 = new AdvancedModelRendererExtended(this, 13, -3);
        this.upperrightteeth1.setRotationPoint(-2.4F, 1.0F, 0.0F);
        this.upperrightteeth1.addBox(0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(upperrightteeth1, 0.0F, 0.0F, 0.39269908169872414F);
        this.tail3 = new AdvancedModelRendererExtended(this, 37, 6);
        this.tail3.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail3.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 29, 0.0F);
        this.bodyfront = new AdvancedModelRendererExtended(this, 46, 61);
        this.bodyfront.setRotationPoint(0.0F, -0.6F, -10.5F);
        this.bodyfront.addBox(-4.5F, -5.0F, -11.5F, 9, 10, 14, 0.0F);
        this.tailfin2 = new AdvancedModelRendererExtended(this, 0, 69);
        this.tailfin2.setRotationPoint(0.0F, -8.5F, 1.0F);
        this.tailfin2.addBox(0.0F, 0.0F, 0.0F, 0, 17, 16, 0.0F);
        this.leftleg1 = new AdvancedModelRendererExtended(this, 102, 72);
        this.leftleg1.setRotationPoint(4.5F, 3.0F, 2.0F);
        this.leftleg1.addBox(-1.5F, -1.5F, -2.0F, 10, 3, 4, 0.0F);
        this.rightarm2 = new AdvancedModelRendererExtended(this, 102, 79);
        this.rightarm2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.rightarm2.addBox(-9.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.lowerfrontteeth = new AdvancedModelRendererExtended(this, 13, 21);
        this.lowerfrontteeth.setRotationPoint(0.0F, -1.0F, -16.0F);
        this.lowerfrontteeth.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 0, 0.0F);
        this.setRotateAngle(lowerfrontteeth, 0.39269908169872414F, 0.0F, 0.0F);
        this.upperleftteeth1 = new AdvancedModelRendererExtended(this, 13, -3);
        this.upperleftteeth1.setRotationPoint(2.4F, 1.0F, 0.0F);
        this.upperleftteeth1.addBox(0.0F, 0.0F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(upperleftteeth1, 0.0F, 0.0F, -0.39269908169872414F);
        this.rightfrontfin = new AdvancedModelRendererExtended(this, 66, 90);
        this.rightfrontfin.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.rightfrontfin.addBox(-6.0F, -0.5F, -3.0F, 6, 1, 6, 0.0F);
        this.tail2 = new AdvancedModelRendererExtended(this, 78, 44);
        this.tail2.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 17, 0.0F);
        this.mandible = new AdvancedModelRendererExtended(this, 70, 23);
        this.mandible.setRotationPoint(0.0F, 0.1F, 0.1F);
        this.mandible.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 7, 0.0F);
        this.snout1 = new AdvancedModelRendererExtended(this, 0, 15);
        this.snout1.setRotationPoint(0.0F, -1.0F, 0.2F);
        this.snout1.addBox(-2.0F, -1.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(snout1, 0.143116998663535F, 0.0F, 0.0F);
        this.pelvis = new AdvancedModelRendererExtended(this, 70, 0);
        this.pelvis.setRotationPoint(0.0F, -0.6F, 11.0F);
        this.pelvis.addBox(-4.5F, -5.0F, -2.0F, 9, 10, 13, 0.0F);
        this.rightarm1 = new AdvancedModelRendererExtended(this, 32, 104);
        this.rightarm1.setRotationPoint(-4.5F, 3.0F, -9.0F);
        this.rightarm1.addBox(-8.5F, -1.5F, -2.0F, 10, 3, 4, 0.0F);
        this.head = new AdvancedModelRendererExtended(this, 30, 61);
        this.head.setRotationPoint(0.0F, 0.8F, -7.0F);
        this.head.addBox(-3.0F, -4.0F, -7.0F, 6, 4, 7, 0.0F);
        this.tailfin0 = new AdvancedModelRendererExtended(this, 0, 100);
        this.tailfin0.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.tailfin0.addBox(0.0F, -8.5F, 0.0F, 0, 17, 13, 0.0F);
        this.leftrearfin = new AdvancedModelRendererExtended(this, 101, 0);
        this.leftrearfin.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.leftrearfin.addBox(-0.5F, -0.5F, -4.0F, 8, 1, 8, 0.0F);
        this.rightleg1 = new AdvancedModelRendererExtended(this, 102, 65);
        this.rightleg1.setRotationPoint(-4.5F, 3.0F, 2.0F);
        this.rightleg1.addBox(-8.5F, -1.5F, -2.0F, 10, 3, 4, 0.0F);
        this.upperjaw1 = new AdvancedModelRendererExtended(this, 0, 5);
        this.upperjaw1.setRotationPoint(0.0F, -2.0F, -7.0F);
        this.upperjaw1.addBox(-2.5F, -1.0F, -3.0F, 5, 2, 3, 0.0F);
        this.lowerjaw1 = new AdvancedModelRendererExtended(this, 0, 0);
        this.lowerjaw1.setRotationPoint(0.0F, 1.0F, -7.0F);
        this.lowerjaw1.addBox(-2.5F, -1.0F, -3.0F, 5, 2, 3, 0.0F);
        this.snout2 = new AdvancedModelRendererExtended(this, 10, 16);
        this.snout2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.snout2.addBox(-1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F);
        this.lowerrightteeth2 = new AdvancedModelRendererExtended(this, -15, 21);
        this.lowerrightteeth2.setRotationPoint(-2.1F, -2.8F, 0.0F);
        this.lowerrightteeth2.addBox(0.0F, 0.0F, -16.0F, 0, 2, 16, 0.0F);
        this.setRotateAngle(lowerrightteeth2, 0.0F, 0.0F, -0.39269908169872414F);
        this.tailfin3 = new AdvancedModelRendererExtended(this, 0, 0);
        this.tailfin3.setRotationPoint(0.0F, -8.5F, 3.0F);
        this.tailfin3.addBox(0.0F, 0.0F, 0.0F, 0, 17, 44, 0.0F);
        this.upperfrontteeth = new AdvancedModelRendererExtended(this, 0, 20);
        this.upperfrontteeth.setRotationPoint(0.0F, 1.0F, -16.0F);
        this.upperfrontteeth.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F);
        this.setRotateAngle(upperfrontteeth, -0.39269908169872414F, 0.0F, 0.0F);
        this.lowerjaw2 = new AdvancedModelRendererExtended(this, 83, 23);
        this.lowerjaw2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lowerjaw2.addBox(-1.5F, -1.0F, -16.0F, 3, 2, 16, 0.0F);
        this.leftleg2 = new AdvancedModelRendererExtended(this, 56, 38);
        this.leftleg2.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.leftleg2.addBox(-0.5F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.rightleg2 = new AdvancedModelRendererExtended(this, 32, 38);
        this.rightleg2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.rightleg2.addBox(-9.0F, -1.0F, -1.5F, 9, 2, 3, 0.0F);
        this.snout2_1 = new AdvancedModelRendererExtended(this, 11, 11);
        this.snout2_1.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.snout2_1.addBox(-1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F);
        this.body = new AdvancedModelRendererExtended(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-5.0F, -6.0F, -11.5F, 10, 12, 23, 0.0F);
        this.neckbase = new AdvancedModelRendererExtended(this, 82, 90);
        this.neckbase.setRotationPoint(0.0F, -0.6F, -11.0F);
        this.neckbase.addBox(-3.0F, -4.0F, -7.0F, 6, 8, 9, 0.0F);
        this.pelvis.addChild(this.tailbase);
        this.lowerjaw1.addChild(this.snout1_1);
        this.lowerjaw1.addChild(this.lowerrightteeth1);
        this.lowerjaw2.addChild(this.lowerleftteeth2);
        this.mandible.addChild(this.gumsright);
        this.lowerjaw1.addChild(this.lowerleftteeth1);
        this.leftarm2.addChild(this.leftfrontfin);
        this.bodyfront.addChild(this.leftarm1);
        this.rightleg2.addChild(this.rightrearfin);
        this.leftarm1.addChild(this.leftarm2);
        this.tailbase.addChild(this.tail1);
        this.mandible.addChild(this.gumsleft);
        this.neckbase.addChild(this.neck);
        this.upperjaw2.addChild(this.upperleftteeth2);
        this.upperjaw1.addChild(this.upperjaw2);
        this.upperjaw2.addChild(this.upperrightteeth2);
        this.tail1.addChild(this.tailfin1);
        this.upperjaw1.addChild(this.upperrightteeth1);
        this.tail2.addChild(this.tail3);
        this.body.addChild(this.bodyfront);
        this.tail2.addChild(this.tailfin2);
        this.pelvis.addChild(this.leftleg1);
        this.rightarm1.addChild(this.rightarm2);
        this.lowerjaw2.addChild(this.lowerfrontteeth);
        this.upperjaw1.addChild(this.upperleftteeth1);
        this.rightarm2.addChild(this.rightfrontfin);
        this.tail1.addChild(this.tail2);
        this.head.addChild(this.mandible);
        this.upperjaw1.addChild(this.snout1);
        this.body.addChild(this.pelvis);
        this.bodyfront.addChild(this.rightarm1);
        this.neck.addChild(this.head);
        this.tailbase.addChild(this.tailfin0);
        this.leftleg2.addChild(this.leftrearfin);
        this.pelvis.addChild(this.rightleg1);
        this.head.addChild(this.upperjaw1);
        this.mandible.addChild(this.lowerjaw1);
        this.snout1.addChild(this.snout2);
        this.lowerjaw2.addChild(this.lowerrightteeth2);
        this.tail3.addChild(this.tailfin3);
        this.upperjaw2.addChild(this.upperfrontteeth);
        this.lowerjaw1.addChild(this.lowerjaw2);
        this.leftleg1.addChild(this.leftleg2);
        this.rightleg1.addChild(this.rightleg2);
        this.snout1_1.addChild(this.snout2_1);
        this.bodyfront.addChild(this.neckbase);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5 * 0.115f);
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
        this.body.offsetY = 1.45F;

        EntityPrehistoricFloraMesosaurus Mesosaurus = (EntityPrehistoricFloraMesosaurus) e;

        this.faceTarget(f3, f4, 5, neckbase);
        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.pelvis, this.tailbase, this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Torso = {this.neck, this.neckbase, this.bodyfront};

        AdvancedModelRenderer[] FL = {this.leftarm1, this.leftarm2};
        AdvancedModelRenderer[] FR = {this.rightarm1, this.rightarm2};
        AdvancedModelRenderer[] BL = {this.leftleg1, this.leftleg2};
        AdvancedModelRenderer[] BR = {this.rightleg1, this.rightleg2};

        if (!Mesosaurus.isReallyInWater()) {
            this.leftarm2.rotateAngleY = (float) Math.toRadians(90);
            this.rightarm2.rotateAngleY = (float) Math.toRadians(-90);

            this.leftleg2.rotateAngleY = (float) Math.toRadians(-55);
            this.rightleg2.rotateAngleY = (float) Math.toRadians(55);

            if (f3 == 0.0F || !Mesosaurus.getIsMoving()) {
                return;
            }

            this.swing(this.rightarm2, speed * 0.6F, 0.8F,false, -0.8F,0.8F, f2, 1F);
            this.swing(this.leftarm2, speed * 0.6F, 0.8F,true, 0.8F,0.8F, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.swing(this.rightleg1, speed * 0.6F, -0.4F,false, -0.8F,0.8F, f2, 1F);
            this.swing(this.leftleg1, speed * 0.6F, -0.4F,true, 0.8F,0.8F, f2, 1F);

            //this.flap(this.rightarm2, speed * 0.6F, 0.2F,false, -0.2F,0.2F, f2, 1F);
            //this.flap(this.leftarm2, speed * 0.6F, 0.2F,true, 0.2F,0.2F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;

            this.leftarm2.rotateAngleZ = (float) Math.toRadians(32);
            this.rightarm2.rotateAngleZ = (float) Math.toRadians(-32);

            this.leftleg2.rotateAngleZ = (float) Math.toRadians(28);
            this.rightleg2.rotateAngleZ = (float) Math.toRadians(-28);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BR, speed * 0.8F, -0.12F, 1.5, 3F, f2, 0.8F);
            this.chainWaveExtended(BL, speed * 0.8F, -0.12F, 1.5, 0, f2, 0.8F);

            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
            if (f3 == 0.0F) {
                return;
            }

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);

            this.chainSwingExtended(FR, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BR, speed * 0.8F, 0.12F, -1.5, 3F, f2, 0.8F);
            this.chainSwingExtended(BL, speed * 0.8F, 0.12F, -1.5, 0, f2, 0.8F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.mandible, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.neck, 0,0,-2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.mandible, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
